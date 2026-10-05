package com.webapk.security;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/** Packs a site's encrypted files and encrypted path manifest into an opaque ZIP named a.c. */
public final class EncryptedSiteArchive implements Closeable {
    public static final String ASSET_NAME = "a.c";
    private static final int MAGIC = 0x5741504b;
    private static final int FORMAT_VERSION = 1;
    private static final int SALT_BYTES = 16;
    private static final int NONCE_BYTES = 12;
    private static final int GCM_TAG_BYTES = 16;
    private static final int MAX_FILES = 10000;
    private static final int MAX_MANIFEST_BYTES = 16 * 1024 * 1024;
    private static final byte[] MANIFEST_AAD = "WebAPK-Studio/manifest/v1".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    private final ZipFile zip;
    private final byte[] siteKey;
    private final Map<String, Integer> pathToId;
    private boolean closed;

    private EncryptedSiteArchive(ZipFile zip, byte[] siteKey, Map<String, Integer> pathToId) {
        this.zip = zip;
        this.siteKey = siteKey;
        this.pathToId = pathToId;
    }

    /** Encrypts every source file before adding it to an opaque ZIP container. */
    public static void create(File root, List<File> files, File output, byte[] masterKey) throws IOException {
        if (root == null || !root.isDirectory() || files == null || files.isEmpty()) {
            throw new IOException("Site archive needs a root directory and at least one file.");
        }
        if (files.size() > MAX_FILES) throw new IOException("Site archive has too many files.");
        requireKey(masterKey);
        String rootPath = root.getCanonicalPath();
        String[] relativePaths = new String[files.size()];
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            String canonical = file.getCanonicalPath();
            String prefix = rootPath + File.separator;
            if (!canonical.startsWith(prefix) || !file.isFile()) {
                throw new IOException("A site file is outside the project or is unavailable.");
            }
            String relative = canonical.substring(prefix.length()).replace(File.separatorChar, '/');
            validateRelativePath(relative);
            relativePaths[i] = relative;
        }
        if (!containsIndex(relativePaths)) throw new IOException("The site archive does not contain index.html.");

        byte[] salt = new byte[SALT_BYTES];
        new SecureRandom().nextBytes(salt);
        byte[] siteKey;
        try {
            siteKey = deriveSiteKey(masterKey, salt);
        } catch (GeneralSecurityException error) {
            throw new IOException("Could not derive the site encryption key.", error);
        }

        File parent = output.getParentFile();
        if (parent != null && !parent.isDirectory() && !parent.mkdirs()) {
            throw new IOException("Could not create the encrypted site archive folder.");
        }
        if (output.exists() && !output.delete()) throw new IOException("Could not replace the old site archive.");
        boolean complete = false;
        try {
            try (ZipOutputStream archive = new ZipOutputStream(
                    new BufferedOutputStream(new FileOutputStream(output)))) {
                archive.setLevel(Deflater.DEFAULT_COMPRESSION);
                putStored(archive, "s", salt);
                byte[] manifest = makeManifest(relativePaths);
                putEntry(archive, "m", encryptBytes(manifest, siteKey, MANIFEST_AAD));
                Arrays.fill(manifest, (byte) 0);

                byte[] buffer = new byte[64 * 1024];
                SecureRandom random = new SecureRandom();
                for (int i = 0; i < files.size(); i++) {
                    String id = entryId(i);
                    byte[] nonce = new byte[NONCE_BYTES];
                    random.nextBytes(nonce);
                    Cipher cipher = cipher(Cipher.ENCRYPT_MODE, siteKey, nonce, fileAad(id));
                    archive.putNextEntry(new ZipEntry(dataEntryName(i)));
                    archive.write(nonce);
                    try (InputStream source = new BufferedInputStream(new FileInputStream(files.get(i)))) {
                        int count;
                        while ((count = source.read(buffer)) != -1) {
                            byte[] encrypted = cipher.update(buffer, 0, count);
                            if (encrypted != null && encrypted.length > 0) archive.write(encrypted);
                        }
                    }
                    byte[] tail = cipher.doFinal();
                    if (tail.length > 0) archive.write(tail);
                    archive.closeEntry();
                }
            }
            complete = true;
        } catch (GeneralSecurityException error) {
            throw new IOException("Could not encrypt the website source.", error);
        } finally {
            Arrays.fill(siteKey, (byte) 0);
            if (!complete && output.exists()) output.delete();
        }
    }

    /** Opens the encrypted archive, validates its manifest, and keeps only encrypted data on disk. */
    public static EncryptedSiteArchive open(File archiveFile, byte[] masterKey) throws IOException {
        requireKey(masterKey);
        ZipFile zip = new ZipFile(archiveFile);
        byte[] siteKey = null;
        try {
            byte[] salt = readZipEntry(zip, "s", SALT_BYTES);
            if (salt.length != SALT_BYTES) throw new IOException("Invalid encrypted site salt.");
            siteKey = deriveSiteKey(masterKey, salt);
            byte[] encryptedManifest = readZipEntry(zip, "m", MAX_MANIFEST_BYTES + NONCE_BYTES + GCM_TAG_BYTES);
            byte[] manifest = decryptBytes(encryptedManifest, siteKey, MANIFEST_AAD);
            Map<String, Integer> pathToId = parseManifest(manifest, zip);
            Arrays.fill(manifest, (byte) 0);
            return new EncryptedSiteArchive(zip, siteKey, pathToId);
        } catch (GeneralSecurityException error) {
            closeAfterFailure(zip, siteKey);
            throw new IOException("The encrypted website could not be authenticated.", error);
        } catch (IOException | RuntimeException error) {
            closeAfterFailure(zip, siteKey);
            throw error;
        }
    }

    /** Opens one authenticated site resource as a streaming plaintext input. */
    public InputStream openResource(String relativePath) throws IOException {
        if (closed) throw new IOException("The encrypted site archive is closed.");
        String safePath;
        try {
            safePath = validateRelativePath(relativePath);
        } catch (IllegalArgumentException invalid) {
            return null;
        }
        Integer id = pathToId.get(safePath);
        if (id == null) return null;
        String name = dataEntryName(id.intValue());
        ZipEntry entry = zip.getEntry(name);
        if (entry == null) throw new IOException("Encrypted site resource is missing.");
        InputStream encrypted = zip.getInputStream(entry);
        try {
            byte[] nonce = readExactly(encrypted, NONCE_BYTES);
            Cipher cipher = cipher(Cipher.DECRYPT_MODE, siteKey, nonce, fileAad(entryId(id.intValue())));
            return new CipherInputStream(encrypted, cipher);
        } catch (GeneralSecurityException | IOException error) {
            encrypted.close();
            if (error instanceof IOException) throw (IOException) error;
            throw new IOException("Could not initialize site resource decryption.", error);
        }
    }

    @Override
    public void close() throws IOException {
        if (closed) return;
        closed = true;
        Arrays.fill(siteKey, (byte) 0);
        zip.close();
    }

    private static Map<String, Integer> parseManifest(byte[] manifest, ZipFile zip) throws IOException {
        Map<String, Integer> paths = new HashMap<>();
        Set<Integer> ids = new HashSet<>();
        try (DataInputStream input = new DataInputStream(new ByteArrayInputStream(manifest))) {
            if (input.readInt() != MAGIC || input.readInt() != FORMAT_VERSION) {
                throw new IOException("Unsupported encrypted site archive format.");
            }
            int count = input.readInt();
            if (count < 1 || count > MAX_FILES) throw new IOException("Invalid encrypted site file count.");
            for (int i = 0; i < count; i++) {
                int id = input.readInt();
                String path;
                try {
                    path = validateRelativePath(input.readUTF());
                } catch (IllegalArgumentException invalidPath) {
                    throw new IOException("Invalid path in encrypted site manifest.", invalidPath);
                }
                if (id < 0 || id >= MAX_FILES || !ids.add(id) || paths.put(path, id) != null) {
                    throw new IOException("Duplicate or invalid encrypted site manifest entry.");
                }
                if (zip.getEntry(dataEntryName(id)) == null) {
                    throw new IOException("Encrypted site file is missing from its archive.");
                }
            }
            if (input.read() != -1) throw new IOException("Trailing data in encrypted site manifest.");
        }
        if (!paths.containsKey("index.html")) throw new IOException("Encrypted site archive has no index.html.");
        return paths;
    }

    private static byte[] makeManifest(String[] relativePaths) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (DataOutputStream manifest = new DataOutputStream(bytes)) {
            manifest.writeInt(MAGIC);
            manifest.writeInt(FORMAT_VERSION);
            manifest.writeInt(relativePaths.length);
            for (int i = 0; i < relativePaths.length; i++) {
                manifest.writeInt(i);
                manifest.writeUTF(relativePaths[i]);
                if (bytes.size() > MAX_MANIFEST_BYTES) throw new IOException("Encrypted site manifest is too large.");
            }
        }
        return bytes.toByteArray();
    }

    private static byte[] encryptBytes(byte[] plain, byte[] siteKey, byte[] aad)
            throws GeneralSecurityException {
        byte[] nonce = new byte[NONCE_BYTES];
        new SecureRandom().nextBytes(nonce);
        Cipher cipher = cipher(Cipher.ENCRYPT_MODE, siteKey, nonce, aad);
        byte[] encrypted = cipher.doFinal(plain);
        byte[] result = new byte[nonce.length + encrypted.length];
        System.arraycopy(nonce, 0, result, 0, nonce.length);
        System.arraycopy(encrypted, 0, result, nonce.length, encrypted.length);
        Arrays.fill(encrypted, (byte) 0);
        return result;
    }

    private static byte[] decryptBytes(byte[] encrypted, byte[] siteKey, byte[] aad)
            throws GeneralSecurityException, IOException {
        if (encrypted.length < NONCE_BYTES + GCM_TAG_BYTES) throw new IOException("Invalid encrypted site data.");
        byte[] nonce = Arrays.copyOfRange(encrypted, 0, NONCE_BYTES);
        Cipher cipher = cipher(Cipher.DECRYPT_MODE, siteKey, nonce, aad);
        return cipher.doFinal(encrypted, NONCE_BYTES, encrypted.length - NONCE_BYTES);
    }

    private static Cipher cipher(int mode, byte[] key, byte[] nonce, byte[] aad)
            throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(mode, new SecretKeySpec(key, "AES"), new GCMParameterSpec(128, nonce));
        cipher.updateAAD(aad);
        return cipher;
    }

    private static byte[] deriveSiteKey(byte[] masterKey, byte[] salt) throws GeneralSecurityException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(masterKey, "HmacSHA256"));
        mac.update("WebAPK-Studio/site-key/v1".getBytes(java.nio.charset.StandardCharsets.UTF_8));
        return mac.doFinal(salt);
    }

    private static byte[] fileAad(String id) {
        return ("WebAPK-Studio/file/" + id).getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    private static String entryId(int id) {
        String hex = Integer.toHexString(id);
        StringBuilder padded = new StringBuilder(8);
        for (int i = hex.length(); i < 8; i++) padded.append('0');
        return padded.append(hex).toString();
    }

    private static String dataEntryName(int id) {
        return "d/" + entryId(id);
    }

    private static String validateRelativePath(String path) {
        if (path == null || path.isEmpty() || path.startsWith("/") || path.indexOf('\\') >= 0
                || path.indexOf('\u0000') >= 0 || path.indexOf('\n') >= 0 || path.indexOf('\r') >= 0) {
            throw new IllegalArgumentException("Unsafe site path.");
        }
        String[] parts = path.split("/", -1);
        for (String part : parts) {
            if (part.isEmpty() || ".".equals(part) || "..".equals(part)) {
                throw new IllegalArgumentException("Unsafe site path.");
            }
        }
        return path;
    }

    private static boolean containsIndex(String[] paths) {
        for (String path : paths) if ("index.html".equals(path)) return true;
        return false;
    }

    private static void putEntry(ZipOutputStream zip, String name, byte[] bytes) throws IOException {
        zip.putNextEntry(new ZipEntry(name));
        zip.write(bytes);
        zip.closeEntry();
    }

    private static void putStored(ZipOutputStream zip, String name, byte[] bytes) throws IOException {
        CRC32 crc = new CRC32();
        crc.update(bytes);
        ZipEntry entry = new ZipEntry(name);
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(bytes.length);
        entry.setCompressedSize(bytes.length);
        entry.setCrc(crc.getValue());
        zip.putNextEntry(entry);
        zip.write(bytes);
        zip.closeEntry();
    }

    private static byte[] readZipEntry(ZipFile zip, String name, int maxBytes) throws IOException {
        ZipEntry entry = zip.getEntry(name);
        if (entry == null) throw new IOException("Encrypted site archive is missing " + name + ".");
        try (InputStream input = zip.getInputStream(entry); ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int count;
            while ((count = input.read(buffer)) != -1) {
                if (output.size() + count > maxBytes) throw new IOException("Encrypted site metadata is too large.");
                output.write(buffer, 0, count);
            }
            return output.toByteArray();
        }
    }

    private static byte[] readExactly(InputStream input, int count) throws IOException {
        byte[] bytes = new byte[count];
        int offset = 0;
        while (offset < count) {
            int read = input.read(bytes, offset, count - offset);
            if (read < 0) throw new IOException("Truncated encrypted site resource.");
            if (read > 0) offset += read;
        }
        return bytes;
    }

    private static void requireKey(byte[] key) throws IOException {
        if (key == null || key.length != 32) throw new IOException("AES-256 master key is unavailable.");
    }

    private static void closeAfterFailure(ZipFile zip, byte[] key) {
        if (key != null) Arrays.fill(key, (byte) 0);
        try {
            zip.close();
        } catch (IOException ignored) { }
    }
}
