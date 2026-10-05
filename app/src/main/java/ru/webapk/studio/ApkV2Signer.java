package ru.webapk.studio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/** Minimal APK Signature Scheme v2 signer (RSA PKCS#1 v1.5 / SHA-256). */
final class ApkV2Signer {
    private static final int V2_BLOCK_ID = 0x7109871a;
    private static final int RSA_PKCS1_SHA256_ID = 0x0103;
    private static final int CHUNK_SIZE = 1024 * 1024;
    private static final int MAX_SIGNED_INPUT = 2 * 1024 * 1024;
    private static final byte[] MAGIC = "APK Sig Block 42".getBytes(StandardCharsets.US_ASCII);

    private ApkV2Signer() { }

    static void signInPlace(File apk, PrivateKey privateKey, X509Certificate certificate) throws Exception {
        byte[] original = readAll(apk, MAX_SIGNED_INPUT);
        Eocd eocd = findEocd(original);
        if (eocd.cdOffset < 0 || eocd.cdSize < 0
                || (long) eocd.cdOffset + eocd.cdSize != eocd.offset) {
            throw new IOException("APK имеет неподдерживаемую ZIP-структуру.");
        }
        if (eocd.cdOffset > original.length || eocd.offset + 22 > original.length) {
            throw new IOException("Повреждённый ZIP End of Central Directory.");
        }

        byte[] contentDigest = computeContentDigest(original, eocd);
        byte[] signedData = encodeSignedData(contentDigest, certificate);
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initSign(privateKey);
        signer.update(signedData);
        byte[] signature = signer.sign();
        byte[] signerBlock = encodeSignerBlock(signedData, signature, certificate.getPublicKey().getEncoded());
        byte[] schemeValue = lengthPrefixed(lengthPrefixed(signerBlock));
        byte[] signingBlock = encodeApkSigningBlock(schemeValue);

        long newCdOffset = (long) eocd.cdOffset + signingBlock.length;
        if (newCdOffset > 0xffffffffL) throw new IOException("ZIP слишком велик для обычного APK.");
        byte[] result = new byte[original.length + signingBlock.length];
        System.arraycopy(original, 0, result, 0, eocd.cdOffset);
        System.arraycopy(signingBlock, 0, result, eocd.cdOffset, signingBlock.length);
        System.arraycopy(original, eocd.cdOffset, result, eocd.cdOffset + signingBlock.length,
                original.length - eocd.cdOffset);
        int newEocdOffset = eocd.offset + signingBlock.length;
        putIntLe(result, newEocdOffset + 16, (int) newCdOffset);

        File temp = new File(apk.getParentFile(), apk.getName() + ".v2.tmp");
        try (FileOutputStream out = new FileOutputStream(temp)) {
            out.write(result);
            out.getFD().sync();
        }
        if (apk.exists() && !apk.delete()) {
            temp.delete();
            throw new IOException("Не удалось обновить APK после подписи v2.");
        }
        if (!temp.renameTo(apk)) {
            temp.delete();
            throw new IOException("Не удалось сохранить APK с подписью v2.");
        }
    }

    private static byte[] encodeSignedData(byte[] digest, X509Certificate certificate) throws Exception {
        ByteArrayOutputStream digestRecord = new ByteArrayOutputStream();
        writeIntLe(digestRecord, RSA_PKCS1_SHA256_ID);
        digestRecord.write(lengthPrefixed(digest));
        byte[] digestSequence = lengthPrefixed(digestRecord.toByteArray());

        byte[] certSequence = lengthPrefixed(certificate.getEncoded());
        byte[] attributesSequence = new byte[0];
        ByteArrayOutputStream signedData = new ByteArrayOutputStream();
        signedData.write(lengthPrefixed(digestSequence));
        signedData.write(lengthPrefixed(certSequence));
        signedData.write(lengthPrefixed(attributesSequence));
        return signedData.toByteArray();
    }

    private static byte[] encodeSignerBlock(byte[] signedData, byte[] signature, byte[] publicKey)
            throws IOException {
        ByteArrayOutputStream signatureRecord = new ByteArrayOutputStream();
        writeIntLe(signatureRecord, RSA_PKCS1_SHA256_ID);
        signatureRecord.write(lengthPrefixed(signature));
        byte[] signatureSequence = lengthPrefixed(signatureRecord.toByteArray());

        ByteArrayOutputStream signer = new ByteArrayOutputStream();
        signer.write(lengthPrefixed(signedData));
        signer.write(lengthPrefixed(signatureSequence));
        signer.write(lengthPrefixed(publicKey));
        return signer.toByteArray();
    }

    private static byte[] encodeApkSigningBlock(byte[] v2Value) throws IOException {
        long pairPayloadSize = 4L + v2Value.length;
        long blockSize = pairPayloadSize + 8L + 8L + MAGIC.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream((int) (blockSize + 8L));
        writeLongLe(out, blockSize);
        writeLongLe(out, pairPayloadSize);
        writeIntLe(out, V2_BLOCK_ID);
        out.write(v2Value);
        writeLongLe(out, blockSize);
        out.write(MAGIC);
        return out.toByteArray();
    }

    private static byte[] computeContentDigest(byte[] apk, Eocd eocd) throws Exception {
        MessageDigest chunkDigest = MessageDigest.getInstance("SHA-256");
        MessageDigest topDigest = MessageDigest.getInstance("SHA-256");
        ByteArrayOutputStream hashes = new ByteArrayOutputStream();
        int chunkCount = 0;

        // Section 1: ZIP entry data before the signing block (not yet inserted).
        chunkCount += updateSection(apk, 0, eocd.cdOffset, chunkDigest, hashes);
        // Section 3: ZIP Central Directory.
        chunkCount += updateSection(apk, eocd.cdOffset, eocd.cdSize, chunkDigest, hashes);
        // Section 4: ZIP End of Central Directory. Its CD offset is currently the signing-block offset.
        chunkCount += updateSection(apk, eocd.offset, apk.length - eocd.offset, chunkDigest, hashes);

        topDigest.update((byte) 0x5a);
        updateIntLe(topDigest, chunkCount);
        topDigest.update(hashes.toByteArray());
        return topDigest.digest();
    }

    private static int updateSection(byte[] data, int offset, int length, MessageDigest chunkDigest,
                                     ByteArrayOutputStream hashes) throws Exception {
        int chunks = 0;
        int position = 0;
        while (position < length) {
            int chunkLength = Math.min(CHUNK_SIZE, length - position);
            chunkDigest.reset();
            chunkDigest.update((byte) 0xa5);
            updateIntLe(chunkDigest, chunkLength);
            chunkDigest.update(data, offset + position, chunkLength);
            hashes.write(chunkDigest.digest());
            position += chunkLength;
            chunks++;
        }
        return chunks;
    }

    private static Eocd findEocd(byte[] apk) throws IOException {
        int minimum = Math.max(0, apk.length - 22 - 65535);
        for (int offset = apk.length - 22; offset >= minimum; offset--) {
            if (u32(apk, offset) != 0x06054b50L) continue;
            int commentLength = u16(apk, offset + 20);
            if (offset + 22 + commentLength != apk.length) continue;
            long cdSize = u32(apk, offset + 12);
            long cdOffset = u32(apk, offset + 16);
            if (cdSize == 0xffffffffL || cdOffset == 0xffffffffL) {
                throw new IOException("ZIP64 не поддерживается в APK размером до 1 МБ.");
            }
            if (u16(apk, offset + 4) != 0 || u16(apk, offset + 6) != 0) {
                throw new IOException("Многотомный ZIP не поддерживается.");
            }
            return new Eocd(offset, (int) cdOffset, (int) cdSize);
        }
        throw new IOException("В APK не найден ZIP End of Central Directory.");
    }

    private static byte[] lengthPrefixed(byte[] value) throws IOException {
        if (value.length < 0) throw new IOException("Поле APK слишком большое.");
        ByteArrayOutputStream out = new ByteArrayOutputStream(value.length + 4);
        writeIntLe(out, value.length);
        out.write(value);
        return out.toByteArray();
    }

    private static void updateIntLe(MessageDigest digest, int value) {
        digest.update((byte) value);
        digest.update((byte) (value >>> 8));
        digest.update((byte) (value >>> 16));
        digest.update((byte) (value >>> 24));
    }

    private static void writeIntLe(ByteArrayOutputStream out, int value) {
        out.write(value & 0xff);
        out.write((value >>> 8) & 0xff);
        out.write((value >>> 16) & 0xff);
        out.write((value >>> 24) & 0xff);
    }

    private static void writeLongLe(ByteArrayOutputStream out, long value) {
        for (int i = 0; i < 8; i++) out.write((int) (value >>> (i * 8)) & 0xff);
    }

    private static int u16(byte[] bytes, int offset) {
        return (bytes[offset] & 0xff) | ((bytes[offset + 1] & 0xff) << 8);
    }

    private static long u32(byte[] bytes, int offset) {
        return (bytes[offset] & 0xffL)
                | ((bytes[offset + 1] & 0xffL) << 8)
                | ((bytes[offset + 2] & 0xffL) << 16)
                | ((bytes[offset + 3] & 0xffL) << 24);
    }

    private static void putIntLe(byte[] bytes, int offset, int value) {
        bytes[offset] = (byte) value;
        bytes[offset + 1] = (byte) (value >>> 8);
        bytes[offset + 2] = (byte) (value >>> 16);
        bytes[offset + 3] = (byte) (value >>> 24);
    }

    private static byte[] readAll(File file, int maxBytes) throws IOException {
        try (InputStream input = new FileInputStream(file);
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int read;
            int total = 0;
            while ((read = input.read(buffer)) != -1) {
                total += read;
                if (total > maxBytes) throw new IOException("APK превышает допустимый размер для локальной подписи.");
                output.write(buffer, 0, read);
            }
            return output.toByteArray();
        }
    }

    private static final class Eocd {
        final int offset;
        final int cdOffset;
        final int cdSize;

        Eocd(int offset, int cdOffset, int cdSize) {
            this.offset = offset;
            this.cdOffset = cdOffset;
            this.cdSize = cdSize;
        }
    }
}
