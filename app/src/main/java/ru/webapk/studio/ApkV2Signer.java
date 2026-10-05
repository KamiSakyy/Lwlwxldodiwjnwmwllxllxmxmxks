package ru.webapk.studio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.X509Certificate;

/** Streaming APK Signature Scheme v2 signer (RSA PKCS#1 v1.5 / SHA-256). */
final class ApkV2Signer {
    private static final int V2_BLOCK_ID = 0x7109871a;
    private static final int RSA_PKCS1_SHA256_ID = 0x0103;
    private static final int CHUNK_SIZE = 1024 * 1024;
    private static final byte[] MAGIC = "APK Sig Block 42".getBytes(StandardCharsets.US_ASCII);

    private ApkV2Signer() { }

    static void signInPlace(File apk, PrivateKey privateKey, X509Certificate certificate) throws Exception {
        File temp = new File(apk.getParentFile(), apk.getName() + ".v2.tmp");
        if (temp.exists()) temp.delete();
        try (RandomAccessFile input = new RandomAccessFile(apk, "r")) {
            long inputLength = input.length();
            Eocd eocd = findEocd(input, inputLength);
            if (eocd.cdOffset < 0 || eocd.cdSize < 0 || eocd.cdOffset + eocd.cdSize != eocd.offset) {
                throw new IOException("APK имеет неподдерживаемую ZIP-структуру.");
            }

            byte[] contentDigest = computeContentDigest(input, inputLength, eocd);
            byte[] signedData = encodeSignedData(contentDigest, certificate);
            Signature signer = Signature.getInstance("SHA256withRSA");
            signer.initSign(privateKey);
            signer.update(signedData);
            byte[] signature = signer.sign();
            byte[] signerBlock = encodeSignerBlock(signedData, signature,
                    certificate.getPublicKey().getEncoded());
            byte[] schemeValue = lengthPrefixed(lengthPrefixed(signerBlock));
            byte[] signingBlock = encodeApkSigningBlock(schemeValue);

            long newCdOffset = eocd.cdOffset + signingBlock.length;
            if (newCdOffset >= 0xffffffffL) {
                throw new IOException("Размер APK превысил предел ZIP32; устройство или Android не поддержит такой APK.");
            }
            long newEocdOffset = eocd.offset + signingBlock.length;
            try (FileOutputStream output = new FileOutputStream(temp)) {
                copyRange(input, output, 0, eocd.cdOffset);
                output.write(signingBlock);
                copyRange(input, output, eocd.cdOffset, inputLength - eocd.cdOffset);
                output.flush();
                output.getFD().sync();
            }
            try (RandomAccessFile patched = new RandomAccessFile(temp, "rw")) {
                patched.seek(newEocdOffset + 16);
                writeIntLe(patched, (int) newCdOffset);
                patched.getFD().sync();
            }
        } catch (Exception error) {
            temp.delete();
            throw error;
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

        byte[] certificateSequence = lengthPrefixed(certificate.getEncoded());
        byte[] additionalAttributes = new byte[0];
        ByteArrayOutputStream signedData = new ByteArrayOutputStream();
        signedData.write(lengthPrefixed(digestSequence));
        signedData.write(lengthPrefixed(certificateSequence));
        signedData.write(lengthPrefixed(additionalAttributes));
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

    private static byte[] computeContentDigest(RandomAccessFile apk, long fileLength, Eocd eocd)
            throws Exception {
        long firstLength = eocd.cdOffset;
        long directoryLength = eocd.cdSize;
        long eocdLength = fileLength - eocd.offset;
        int chunkCount = countChunks(firstLength) + countChunks(directoryLength) + countChunks(eocdLength);

        MessageDigest chunkDigest = MessageDigest.getInstance("SHA-256");
        MessageDigest topDigest = MessageDigest.getInstance("SHA-256");
        topDigest.update((byte) 0x5a);
        updateIntLe(topDigest, chunkCount);
        updateSection(apk, 0, firstLength, chunkDigest, topDigest);
        updateSection(apk, eocd.cdOffset, directoryLength, chunkDigest, topDigest);
        // Before insertion, EOCD's central-directory offset equals the future signing-block offset.
        updateSection(apk, eocd.offset, eocdLength, chunkDigest, topDigest);
        return topDigest.digest();
    }

    private static int countChunks(long length) {
        return length == 0 ? 0 : (int) ((length + CHUNK_SIZE - 1) / CHUNK_SIZE);
    }

    private static void updateSection(RandomAccessFile input, long offset, long length,
                                      MessageDigest chunkDigest, MessageDigest topDigest) throws Exception {
        byte[] buffer = new byte[64 * 1024];
        long position = 0;
        while (position < length) {
            int chunkLength = (int) Math.min((long) CHUNK_SIZE, length - position);
            chunkDigest.reset();
            chunkDigest.update((byte) 0xa5);
            updateIntLe(chunkDigest, chunkLength);
            input.seek(offset + position);
            int remaining = chunkLength;
            while (remaining > 0) {
                int read = input.read(buffer, 0, Math.min(buffer.length, remaining));
                if (read < 0) throw new IOException("APK неожиданно закончился при расчёте подписи.");
                chunkDigest.update(buffer, 0, read);
                remaining -= read;
            }
            topDigest.update(chunkDigest.digest());
            position += chunkLength;
        }
    }

    private static Eocd findEocd(RandomAccessFile input, long fileLength) throws IOException {
        if (fileLength < 22) throw new IOException("APK слишком короткий для ZIP.");
        int tailLength = (int) Math.min(fileLength, 22L + 65535L);
        byte[] tail = new byte[tailLength];
        input.seek(fileLength - tailLength);
        input.readFully(tail);
        int minimum = Math.max(0, tail.length - 22 - 65535);
        for (int position = tail.length - 22; position >= minimum; position--) {
            if (u32(tail, position) != 0x06054b50L) continue;
            int commentLength = u16(tail, position + 20);
            if (position + 22 + commentLength != tail.length) continue;
            long cdSize = u32(tail, position + 12);
            long cdOffset = u32(tail, position + 16);
            if (cdSize == 0xffffffffL || cdOffset == 0xffffffffL) {
                throw new IOException("ZIP64 пока не поддерживается; используйте APK в пределах ZIP32 (до 4 ГБ).");
            }
            if (u16(tail, position + 4) != 0 || u16(tail, position + 6) != 0) {
                throw new IOException("Многотомный ZIP не поддерживается.");
            }
            return new Eocd(fileLength - tailLength + position, cdOffset, cdSize);
        }
        throw new IOException("В APK не найден ZIP End of Central Directory.");
    }

    private static void copyRange(RandomAccessFile input, OutputStream output, long offset, long length)
            throws IOException {
        input.seek(offset);
        byte[] buffer = new byte[64 * 1024];
        long remaining = length;
        while (remaining > 0) {
            int read = input.read(buffer, 0, (int) Math.min(buffer.length, remaining));
            if (read < 0) throw new IOException("Не удалось скопировать ZIP-секцию APK.");
            output.write(buffer, 0, read);
            remaining -= read;
        }
    }

    private static byte[] lengthPrefixed(byte[] value) throws IOException {
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

    private static void writeIntLe(RandomAccessFile out, int value) throws IOException {
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

    private static final class Eocd {
        final long offset;
        final long cdOffset;
        final long cdSize;

        Eocd(long offset, long cdOffset, long cdSize) {
            this.offset = offset;
            this.cdOffset = cdOffset;
            this.cdSize = cdSize;
        }
    }
}
