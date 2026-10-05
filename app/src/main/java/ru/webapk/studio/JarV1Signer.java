package ru.webapk.studio;

import android.util.Base64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/** Signs APK entries with JAR/v1 and APK Signature Scheme v2 using the fixed handoff identity. */
final class JarV1Signer {
    private static final String SHA256 = "SHA-256";
    private static final String RSA_SIGNATURE = "SHA256withRSA";
    private static final String OID_SHA256 = "2.16.840.1.101.3.4.2.1";
    private static final String OID_SHA256_RSA = "1.2.840.113549.1.1.11";
    private static final String OID_DATA = "1.2.840.113549.1.7.1";
    private static final String OID_SIGNED_DATA = "1.2.840.113549.1.7.2";
    private static final String OID_CONTENT_TYPE = "1.2.840.113549.1.9.3";
    private static final String OID_MESSAGE_DIGEST = "1.2.840.113549.1.9.4";
    private static final String OID_SIGNING_TIME = "1.2.840.113549.1.9.5";
    private static final byte[] CRLF = new byte[]{'\r', '\n'};

    private JarV1Signer() { }

    static void signWithKeyStore(File unsignedApk, File signedApk, InputStream keyStoreInput,
                                 char[] password, String alias) throws Exception {
        java.security.KeyStore store = java.security.KeyStore.getInstance("PKCS12");
        store.load(keyStoreInput, password);
        java.security.Key key = store.getKey(alias, password);
        java.security.cert.Certificate certificate = store.getCertificate(alias);
        if (!(key instanceof PrivateKey) || !(certificate instanceof X509Certificate)) {
            throw new IOException("В handoff keystore отсутствует RSA-ключ и сертификат.");
        }
        SigningIdentity identity = new SigningIdentity((PrivateKey) key, (X509Certificate) certificate);
        verifyIdentity(identity);
        signWithIdentity(unsignedApk, signedApk, identity);
    }

    private static void verifyIdentity(SigningIdentity identity) throws Exception {
        Signature check = Signature.getInstance(RSA_SIGNATURE);
        byte[] challengeText = "Web APK Studio signing key check".getBytes(StandardCharsets.UTF_8);
        check.initSign(identity.privateKey);
        check.update(challengeText);
        byte[] challenge = check.sign();
        check.initVerify(identity.certificate.getPublicKey());
        check.update(challengeText);
        if (!check.verify(challenge)) throw new IOException("Подписывающий ключ не совпадает с сертификатом.");
    }

    private static void signWithIdentity(File unsignedApk, File signedApk, SigningIdentity identity)
            throws Exception {
        TreeMap<String, byte[]> entryDigests = digestApkEntries(unsignedApk);
        ManifestContent manifest = createManifest(entryDigests);
        byte[] signatureFile = createSignatureFile(manifest);
        byte[] signatureBlock = createPkcs7Block(signatureFile, identity);

        if (signedApk.exists() && !signedApk.delete()) {
            throw new IOException("Не удалось заменить временный APK.");
        }
        try (ZipFile source = new ZipFile(unsignedApk);
             FileOutputStream fileOut = new FileOutputStream(signedApk);
             CountingOutputStream countingOut = new CountingOutputStream(new BufferedOutputStream(fileOut));
             ZipOutputStream output = new ZipOutputStream(countingOut)) {
            output.setLevel(Deflater.DEFAULT_COMPRESSION);
            Enumeration<? extends ZipEntry> entries = source.entries();
            Set<String> names = new HashSet<>();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if (entry.isDirectory() || isMetaInf(entry.getName())) continue;
                if (!names.add(entry.getName())) throw new IOException("APK содержит повторяющийся файл.");
                try (InputStream input = new BufferedInputStream(source.getInputStream(entry))) {
                    copyEntry(entry, input, output, countingOut);
                }
            }
            putDeflated(output, "META-INF/MANIFEST.MF", manifest.bytes);
            putDeflated(output, "META-INF/WEBAPK.SF", signatureFile);
            putDeflated(output, "META-INF/WEBAPK.RSA", signatureBlock);
            output.finish();
        } catch (Exception error) {
            signedApk.delete();
            throw error;
        }
        try {
            ApkV2Signer.signInPlace(signedApk, identity.privateKey, identity.certificate);
        } catch (Exception error) {
            signedApk.delete();
            throw error;
        }
    }

    private static TreeMap<String, byte[]> digestApkEntries(File apk) throws Exception {
        TreeMap<String, byte[]> result = new TreeMap<>();
        try (ZipFile zip = new ZipFile(apk)) {
            Enumeration<? extends ZipEntry> entries = zip.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if (entry.isDirectory() || isMetaInf(entry.getName())) continue;
                if (result.containsKey(entry.getName())) throw new IOException("APK содержит повторяющийся файл.");
                MessageDigest digest = MessageDigest.getInstance(SHA256);
                try (InputStream input = new BufferedInputStream(zip.getInputStream(entry))) {
                    byte[] buffer = new byte[8192];
                    int read;
                    while ((read = input.read(buffer)) != -1) digest.update(buffer, 0, read);
                }
                result.put(entry.getName(), digest.digest());
            }
        }
        if (result.isEmpty()) throw new IOException("Пустой APK-шаблон.");
        return result;
    }

    private static ManifestContent createManifest(TreeMap<String, byte[]> digests) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        TreeMap<String, byte[]> sectionDigests = new TreeMap<>();
        writeHeader(out, "Manifest-Version", "1.0");
        writeHeader(out, "Created-By", "Offline Web APK Studio");
        out.write(CRLF);
        MessageDigest sha256 = MessageDigest.getInstance(SHA256);
        for (Map.Entry<String, byte[]> entry : digests.entrySet()) {
            ByteArrayOutputStream section = new ByteArrayOutputStream();
            writeHeader(section, "Name", entry.getKey());
            writeHeader(section, "SHA-256-Digest", base64(entry.getValue()));
            section.write(CRLF);
            byte[] sectionBytes = section.toByteArray();
            out.write(sectionBytes);
            sectionDigests.put(entry.getKey(), sha256.digest(sectionBytes));
        }
        return new ManifestContent(out.toByteArray(), sectionDigests);
    }

    private static byte[] createSignatureFile(ManifestContent manifest) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeHeader(out, "Signature-Version", "1.0");
        writeHeader(out, "Created-By", "Offline Web APK Studio");
        writeHeader(out, "X-Android-APK-Signed", "2");
        writeHeader(out, "SHA-256-Digest-Manifest",
                base64(MessageDigest.getInstance(SHA256).digest(manifest.bytes)));
        out.write(CRLF);
        for (Map.Entry<String, byte[]> entry : manifest.sectionDigests.entrySet()) {
            writeHeader(out, "Name", entry.getKey());
            writeHeader(out, "SHA-256-Digest", base64(entry.getValue()));
            out.write(CRLF);
        }
        return out.toByteArray();
    }

    private static void writeHeader(OutputStream out, String name, String value) throws IOException {
        byte[] whole = (name + ": " + value).getBytes(StandardCharsets.UTF_8);
        int position = 0;
        int lineBytes = 0;
        while (position < whole.length) {
            int unit = utf8UnitLength(whole[position] & 0xff);
            if (lineBytes > 0 && lineBytes + unit > 70) {
                out.write(CRLF);
                out.write(' ');
                lineBytes = 1;
            }
            out.write(whole, position, unit);
            position += unit;
            lineBytes += unit;
        }
        out.write(CRLF);
    }

    private static int utf8UnitLength(int firstByte) {
        if ((firstByte & 0x80) == 0) return 1;
        if ((firstByte & 0xe0) == 0xc0) return 2;
        if ((firstByte & 0xf0) == 0xe0) return 3;
        return 4;
    }

    private static byte[] createPkcs7Block(byte[] sfBytes, SigningIdentity identity) throws Exception {
        byte[] digest = MessageDigest.getInstance(SHA256).digest(sfBytes);
        List<byte[]> attributes = new ArrayList<>();
        attributes.add(attribute(OID_CONTENT_TYPE, Der.oid(OID_DATA)));
        attributes.add(attribute(OID_MESSAGE_DIGEST, Der.octetString(digest)));
        attributes.add(attribute(OID_SIGNING_TIME, Der.utcTime(new Date())));
        byte[] signedAttributes = Der.set(attributes);
        byte[] signedAttributeContents = Der.contents(signedAttributes);

        Signature signer = Signature.getInstance(RSA_SIGNATURE);
        signer.initSign(identity.privateKey);
        signer.update(signedAttributes);
        byte[] signature = signer.sign();

        byte[] algorithmSha256 = algorithmIdentifier(OID_SHA256);
        byte[] algorithmRsa = algorithmIdentifier(OID_SHA256_RSA);
        byte[] issuerAndSerial = Der.sequence(
                identity.certificate.getIssuerX500Principal().getEncoded(),
                Der.integer(identity.certificate.getSerialNumber()));
        byte[] signerInfo = Der.sequence(
                Der.integer(BigInteger.ONE),
                issuerAndSerial,
                algorithmSha256,
                Der.contextConstructed(0, signedAttributeContents),
                algorithmRsa,
                Der.octetString(signature));

        byte[] signedData = Der.sequence(
                Der.integer(BigInteger.ONE),
                Der.set(Collections.singletonList(algorithmSha256)),
                Der.sequence(Der.oid(OID_DATA)),
                Der.contextConstructed(0, identity.certificate.getEncoded()),
                Der.set(Collections.singletonList(signerInfo)));
        return Der.sequence(Der.oid(OID_SIGNED_DATA), Der.contextConstructed(0, signedData));
    }

    private static byte[] attribute(String oid, byte[] value) throws IOException {
        return Der.sequence(Der.oid(oid), Der.set(Collections.singletonList(value)));
    }

    private static byte[] algorithmIdentifier(String oid) throws IOException {
        return Der.sequence(Der.oid(oid), Der.nullValue());
    }

    private static String base64(byte[] value) {
        return Base64.encodeToString(value, Base64.NO_WRAP);
    }

    private static boolean isMetaInf(String name) {
        return name.regionMatches(true, 0, "META-INF/", 0, "META-INF/".length());
    }

    private static void copyEntry(ZipEntry source, InputStream input, ZipOutputStream output,
                                  CountingOutputStream counter) throws IOException {
        ZipEntry entry = new ZipEntry(source.getName());
        if (source.getTime() >= 0) entry.setTime(source.getTime());
        if (source.getMethod() == ZipEntry.STORED) {
            entry.setMethod(ZipEntry.STORED);
            entry.setSize(source.getSize());
            entry.setCompressedSize(source.getSize());
            entry.setCrc(source.getCrc());
            byte[] nameBytes = source.getName().getBytes(StandardCharsets.UTF_8);
            long base = counter.getCount() + 30L + nameBytes.length;
            int pad = (int) ((4L - (base & 3L)) & 3L);
            if (pad != 0) {
                byte[] extra = new byte[4 + pad];
                extra[0] = 0x35;
                extra[1] = (byte) 0xD9;
                extra[2] = (byte) pad;
                extra[3] = 0;
                entry.setExtra(extra);
            }
        } else {
            entry.setMethod(ZipEntry.DEFLATED);
        }
        output.putNextEntry(entry);
        byte[] buffer = new byte[8192];
        int read;
        while ((read = input.read(buffer)) != -1) output.write(buffer, 0, read);
        output.closeEntry();
    }

    private static void putDeflated(ZipOutputStream output, String name, byte[] data) throws IOException {
        ZipEntry entry = new ZipEntry(name);
        entry.setMethod(ZipEntry.DEFLATED);
        output.putNextEntry(entry);
        output.write(data);
        output.closeEntry();
    }

    private static final class ManifestContent {
        final byte[] bytes;
        final TreeMap<String, byte[]> sectionDigests;

        ManifestContent(byte[] bytes, TreeMap<String, byte[]> sectionDigests) {
            this.bytes = bytes;
            this.sectionDigests = sectionDigests;
        }
    }

    private static final class SigningIdentity {
        final PrivateKey privateKey;
        final X509Certificate certificate;

        SigningIdentity(PrivateKey privateKey, X509Certificate certificate) {
            this.privateKey = privateKey;
            this.certificate = certificate;
        }
    }

    private static final class CountingOutputStream extends FilterOutputStream {
        private long count;

        CountingOutputStream(OutputStream out) { super(out); }
        long getCount() { return count; }

        @Override public void write(int value) throws IOException {
            out.write(value);
            count++;
        }

        @Override public void write(byte[] bytes, int offset, int length) throws IOException {
            out.write(bytes, offset, length);
            count += length;
        }
    }

    /** Tiny DER encoder for the PKCS#7 SignedData structure. */
    private static final class Der {
        private Der() { }

        static byte[] sequence(byte[]... items) throws IOException {
            return constructed(0x30, items);
        }

        static byte[] set(List<byte[]> values) throws IOException {
            List<byte[]> sorted = new ArrayList<>(values);
            Collections.sort(sorted, new Comparator<byte[]>() {
                @Override public int compare(byte[] left, byte[] right) {
                    int n = Math.min(left.length, right.length);
                    for (int i = 0; i < n; i++) {
                        int a = left[i] & 0xff;
                        int b = right[i] & 0xff;
                        if (a != b) return a - b;
                    }
                    return left.length - right.length;
                }
            });
            return constructed(0x31, sorted.toArray(new byte[0][]));
        }

        static byte[] integer(BigInteger value) throws IOException {
            return tagged(0x02, value.toByteArray());
        }

        static byte[] octetString(byte[] value) throws IOException { return tagged(0x04, value); }

        static byte[] bitString(byte[] value) throws IOException {
            byte[] contents = new byte[value.length + 1];
            System.arraycopy(value, 0, contents, 1, value.length);
            return tagged(0x03, contents);
        }

        static byte[] nullValue() throws IOException { return tagged(0x05, new byte[0]); }

        static byte[] oid(String dotted) throws IOException {
            String[] parts = dotted.split("\\.");
            if (parts.length < 2) throw new IOException("Некорректный ASN.1 OID");
            ByteArrayOutputStream body = new ByteArrayOutputStream();
            BigInteger first = new BigInteger(parts[0]);
            BigInteger second = new BigInteger(parts[1]);
            writeBase128(body, first.multiply(BigInteger.valueOf(40)).add(second));
            for (int i = 2; i < parts.length; i++) writeBase128(body, new BigInteger(parts[i]));
            return tagged(0x06, body.toByteArray());
        }

        private static void writeBase128(ByteArrayOutputStream output, BigInteger value) {
            if (value.signum() < 0) throw new IllegalArgumentException("Negative OID arc");
            if (value.signum() == 0) {
                output.write(0);
                return;
            }
            List<Integer> octets = new ArrayList<>();
            BigInteger mask = BigInteger.valueOf(0x7f);
            while (value.signum() != 0) {
                octets.add(value.and(mask).intValue());
                value = value.shiftRight(7);
            }
            for (int i = octets.size() - 1; i >= 0; i--) {
                int current = octets.get(i);
                if (i != 0) current |= 0x80;
                output.write(current);
            }
        }

        static byte[] utcTime(Date date) throws IOException {
            SimpleDateFormat format = new SimpleDateFormat("yyMMddHHmmss'Z'", Locale.US);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            return tagged(0x17, format.format(date).getBytes(StandardCharsets.US_ASCII));
        }

        static byte[] contextConstructed(int number, byte[] contents) throws IOException {
            if (number < 0 || number > 30) throw new IOException("Неподдерживаемый ASN.1 тег");
            return tagged(0xa0 | number, contents);
        }

        static byte[] contents(byte[] encoded) throws IOException {
            if (encoded.length < 2) throw new IOException("Некорректный DER");
            int position = 1;
            int first = encoded[position++] & 0xff;
            long length;
            if ((first & 0x80) == 0) {
                length = first;
            } else {
                int count = first & 0x7f;
                if (count == 0 || count > 4 || position + count > encoded.length) {
                    throw new IOException("Некорректная DER-длина");
                }
                length = 0;
                for (int i = 0; i < count; i++) length = (length << 8) | (encoded[position++] & 0xff);
            }
            if (length != encoded.length - position) throw new IOException("Некорректная DER-структура");
            byte[] result = new byte[(int) length];
            System.arraycopy(encoded, position, result, 0, result.length);
            return result;
        }

        private static byte[] constructed(int tag, byte[][] items) throws IOException {
            ByteArrayOutputStream body = new ByteArrayOutputStream();
            for (byte[] item : items) body.write(item);
            return tagged(tag, body.toByteArray());
        }

        private static byte[] tagged(int tag, byte[] contents) throws IOException {
            ByteArrayOutputStream out = new ByteArrayOutputStream(contents.length + 8);
            out.write(tag);
            writeLength(out, contents.length);
            out.write(contents);
            return out.toByteArray();
        }

        private static void writeLength(OutputStream out, int length) throws IOException {
            if (length < 0x80) {
                out.write(length);
            } else {
                int bytes = 0;
                int value = length;
                while (value != 0) {
                    bytes++;
                    value >>>= 8;
                }
                out.write(0x80 | bytes);
                for (int shift = (bytes - 1) * 8; shift >= 0; shift -= 8) {
                    out.write((length >>> shift) & 0xff);
                }
            }
        }
    }
}
