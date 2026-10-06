package ru.webapk.studio;

import com.webapk.security.EncryptedSiteArchive;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/** JVM smoke test of the same binary-manifest patcher and signer used on the device. */
public final class RuntimeApkSmoke {
    private static final String OLD_PACKAGE = "com.webapk.hosttemplate";
    private static final String NEW_PACKAGE = "com.smoke.offline";

    private RuntimeApkSmoke() { }

    public static void main(String[] args) throws Exception {
        if (args.length != 6) throw new IllegalArgumentException(
                "template.apk unsigned.apk signed.apk signing-key.p12 password alias");
        File template = new File(args[0]);
        File unsigned = new File(args[1]);
        File signed = new File(args[2]);
        File signingKeyStore = new File(args[3]);
        char[] signingPassword = args[4].toCharArray();
        String signingAlias = args[5];
        if (!template.isFile()) throw new IOException("Missing Android host template: " + template);

        Set<String> iconDensities = new HashSet<>();
        try (InputStream file = new FileInputStream(template);
             ZipInputStream input = new ZipInputStream(file);
             ZipOutputStream output = new ZipOutputStream(new FileOutputStream(unsigned))) {
            ZipEntry entry;
            boolean manifestFound = false;
            boolean resourcesFound = false;
            while ((entry = input.getNextEntry()) != null) {
                String name = entry.getName();
                if (entry.isDirectory() || name.startsWith("META-INF/") || name.startsWith("assets/site/")) {
                    input.closeEntry();
                    continue;
                }
                byte[] contents = readAll(input);
                if (IconResourceLocator.isIconCandidate(name)) {
                    String density = IconResourceLocator.densityFor(name, contents);
                    if (density != null && !iconDensities.add(density)) {
                        throw new IOException("Template contains more than one launcher icon for " + density);
                    }
                }
                if (name.equals("AndroidManifest.xml")) {
                    Map<String, String> replacements = new HashMap<>();
                    replacements.put(OLD_PACKAGE, NEW_PACKAGE);
                    replacements.put("__WEBAPK_LABEL__", "Offline smoke test");
                    replacements.put("__WEBAPK_FULLSCREEN__", "false");
                    byte[] portraitManifest = BinaryXmlPatcher.patch(contents, replacements, false, 41, 33);
                    if (BinaryXmlPatcher.readScreenOrientation(portraitManifest) != 1
                            || BinaryXmlPatcher.readVersionCode(portraitManifest) != 41
                            || BinaryXmlPatcher.readTargetSdkVersion(portraitManifest) != 33
                            || !"false".equals(BinaryXmlPatcher.readMetaDataString(
                                    portraitManifest, "com.webapk.studio.FULLSCREEN"))) {
                        throw new IOException("Portrait/version/non-fullscreen manifest smoke check failed");
                    }
                    replacements.put("__WEBAPK_FULLSCREEN__", "true");
                    contents = BinaryXmlPatcher.patch(contents, replacements, true, 42, 36);
                    if (BinaryXmlPatcher.readScreenOrientation(contents) != 4
                            || BinaryXmlPatcher.readVersionCode(contents) != 42
                            || BinaryXmlPatcher.readTargetSdkVersion(contents) != 36
                            || !"true".equals(BinaryXmlPatcher.readMetaDataString(
                                    contents, "com.webapk.studio.FULLSCREEN"))) {
                        throw new IOException("Auto-rotation/version/fullscreen manifest smoke check failed");
                    }
                    manifestFound = true;
                } else if (name.equals("resources.arsc")) {
                    patchPackageName(contents, OLD_PACKAGE, NEW_PACKAGE);
                    resourcesFound = true;
                }
                put(output, name, contents, entry.getMethod() == ZipEntry.STORED);
                input.closeEntry();
            }
            if (!manifestFound || !resourcesFound) throw new IOException("Template is missing Android resources");
            if (iconDensities.size() != 5) {
                throw new IOException("Template launcher icon smoke check found " + iconDensities.size()
                        + " densities instead of all five: " + iconDensities);
            }
            byte[] multiMegabytePayload = new byte[3 * 1024 * 1024 + 137];
            new Random(20261005L).nextBytes(multiMegabytePayload);
            File smokeSite = new File(unsigned.getParentFile(), "runtime-smoke-site");
            if (!smokeSite.isDirectory() && !smokeSite.mkdirs()) throw new IOException("Cannot create smoke site");
            byte[] indexContents = "<!doctype html><title>TOP_SECRET_SOURCE_MARKER</title>"
                    .getBytes(StandardCharsets.UTF_8);
            File indexFile = new File(smokeSite, "index.html");
            File largeFile = new File(smokeSite, "large.bin");
            writeFile(indexFile, indexContents);
            writeFile(largeFile, multiMegabytePayload);
            List<File> siteFiles = new ArrayList<>();
            siteFiles.add(indexFile);
            siteFiles.add(largeFile);
            byte[] testMasterKey = new byte[32];
            for (int i = 0; i < testMasterKey.length; i++) testMasterKey[i] = (byte) (i * 17 + 3);
            File encryptedSite = new File(unsigned.getParentFile(), "runtime-smoke-a.c");
            EncryptedSiteArchive.create(smokeSite, siteFiles, encryptedSite, testMasterKey);
            byte[] encryptedContainer;
            try (InputStream archiveInput = new FileInputStream(encryptedSite)) {
                encryptedContainer = readAll(archiveInput);
            }
            if (containsBytes(encryptedContainer, indexContents)) {
                throw new IOException("Encrypted APK container exposes website source in plaintext");
            }
            try (EncryptedSiteArchive archive = EncryptedSiteArchive.open(encryptedSite, testMasterKey)) {
                try (InputStream indexInput = archive.openResource("index.html")) {
                    if (indexInput == null || !java.util.Arrays.equals(indexContents, readAll(indexInput))) {
                        throw new IOException("Encrypted index.html round-trip failed");
                    }
                }
                try (InputStream largeInput = archive.openResource("large.bin")) {
                    if (largeInput == null || !java.util.Arrays.equals(multiMegabytePayload, readAll(largeInput))) {
                        throw new IOException("Encrypted multi-megabyte site resource round-trip failed");
                    }
                }
                if (archive.openResource("../escape.txt") != null) {
                    throw new IOException("Encrypted site reader accepted a path traversal");
                }
            }
            byte[] wrongKey = new byte[32];
            java.util.Arrays.fill(wrongKey, (byte) 0x55);
            boolean wrongKeyRejected = false;
            try (EncryptedSiteArchive ignored = EncryptedSiteArchive.open(encryptedSite, wrongKey)) {
                // The authenticated manifest must not open with an unrelated key.
            } catch (IOException expected) {
                wrongKeyRejected = true;
            }
            if (!wrongKeyRejected) throw new IOException("Encrypted site archive accepted the wrong key");
            java.util.Arrays.fill(testMasterKey, (byte) 0);
            java.util.Arrays.fill(wrongKey, (byte) 0);
            put(output, "assets/a.c", encryptedContainer, false);
        }

        File secondSigned = new File(signed.getParentFile(), "runtime-smoke-second.apk");
        try (InputStream key = new FileInputStream(signingKeyStore)) {
            JarV1Signer.signWithKeyStore(unsigned, signed, key, signingPassword, signingAlias);
        }
        try (InputStream key = new FileInputStream(signingKeyStore)) {
            JarV1Signer.signWithKeyStore(unsigned, secondSigned, key, signingPassword, signingAlias);
        }
        java.util.Arrays.fill(signingPassword, Character.MIN_VALUE);
        if (unsigned.exists() && !unsigned.delete()) throw new IOException("Cannot remove unsigned test APK");
        System.out.println("Runtime APK smoke test passed: " + signed.length()
                + " bytes; encrypted site round-trip, wrong-key rejection, path traversal, "
                + "five icon densities, API 33/36 target patching and both fullscreen settings verified; "
                + "stable handoff key reused for successive APKs");
    }

    private static void writeFile(File file, byte[] contents) throws IOException {
        try (FileOutputStream output = new FileOutputStream(file)) {
            output.write(contents);
        }
    }

    private static boolean containsBytes(byte[] contents, byte[] needle) {
        if (needle.length == 0) return true;
        for (int start = 0; start <= contents.length - needle.length; start++) {
            int index = 0;
            while (index < needle.length && contents[start + index] == needle[index]) index++;
            if (index == needle.length) return true;
        }
        return false;
    }

    private static void put(ZipOutputStream zip, String name, byte[] contents, boolean stored) throws IOException {
        ZipEntry out = new ZipEntry(name);
        out.setTime(0L);
        if (stored) {
            CRC32 crc = new CRC32();
            crc.update(contents);
            out.setMethod(ZipEntry.STORED);
            out.setSize(contents.length);
            out.setCompressedSize(contents.length);
            out.setCrc(crc.getValue());
        }
        zip.putNextEntry(out);
        zip.write(contents);
        zip.closeEntry();
    }

    private static byte[] readAll(InputStream input) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int count;
        while ((count = input.read(buffer)) != -1) {
            out.write(buffer, 0, count);
            if (out.size() > 64 * 1024 * 1024) throw new IOException("Template entry unexpectedly large");
        }
        return out.toByteArray();
    }

    private static void patchPackageName(byte[] table, String oldName, String newName) throws IOException {
        if (table.length < 12 || u16(table, 0) != 0x0002) throw new IOException("Invalid resources.arsc");
        int offset = u16(table, 2);
        while (offset + 8 <= table.length) {
            int type = u16(table, offset);
            int headerSize = u16(table, offset + 2);
            int size = (int) u32(table, offset + 4);
            if (size < 8 || offset + size > table.length) throw new IOException("Invalid resource chunk");
            if (type == 0x0200 && headerSize >= 268) {
                int nameOffset = offset + 12;
                int end = nameOffset;
                while (end + 1 < nameOffset + 256 && (table[end] != 0 || table[end + 1] != 0)) end += 2;
                String packageName = new String(table, nameOffset, end - nameOffset, StandardCharsets.UTF_16LE);
                if (packageName.equals(oldName)) {
                    byte[] replacement = newName.getBytes(StandardCharsets.UTF_16LE);
                    for (int i = 0; i < 256; i++) table[nameOffset + i] = 0;
                    System.arraycopy(replacement, 0, table, nameOffset, replacement.length);
                }
            }
            offset += size;
        }
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
}
