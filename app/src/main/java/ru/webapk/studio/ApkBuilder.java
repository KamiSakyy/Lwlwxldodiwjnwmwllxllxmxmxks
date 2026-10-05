package ru.webapk.studio;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/** Builds a WebView APK by patching the bundled Android template; no network or SDK is used. */
final class ApkBuilder {
    private static final String TEMPLATE_PACKAGE = "com.webapk.hosttemplate";
    private static final String TEMPLATE_ASSET = "host-template.apk";
    private static final String SITE_SIGNING_ASSET = "site-signing-key.p12";
    private static final String SITE_SIGNING_ALIAS = "webapkstudio";
    private static final String SITE_SIGNING_PASSWORD = "webapk-studio-public-handoff";
    private static final int[] ICON_SIZES = {48, 72, 96, 144, 192};

    private ApkBuilder() { }

    static boolean isValidPackageName(String packageName) {
        if (packageName == null || packageName.length() < 3 || packageName.length() > 127
                || packageName.startsWith("android.")) {
            return false;
        }
        String[] parts = packageName.split("\\.", -1);
        if (parts.length < 2) return false;
        for (String part : parts) {
            if (!part.matches("[a-z][a-z0-9_]*")) return false;
        }
        return !packageName.startsWith("com.android.");
    }

    static String sanitizeLabel(String value) {
        if (value == null) return "Мой сайт";
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < value.length() && cleaned.length() < 40; i++) {
            char c = value.charAt(i);
            if (!Character.isISOControl(c)) cleaned.append(c);
        }
        String result = cleaned.toString().trim();
        return result.isEmpty() ? "Мой сайт" : result;
    }

    static File build(Context context, File siteRoot, String packageName, String appLabel, File iconFile,
                      boolean autoRotate, int versionCode) throws Exception {
        if (!isValidPackageName(packageName)) {
            throw new IOException("Пакет должен выглядеть как com.example.app (строчные латинские буквы).");
        }
        if (versionCode < 1) throw new IOException("Номер версии приложения должен быть положительным.");
        if (siteRoot == null || !siteRoot.isDirectory()) {
            throw new IOException("Сначала выберите index.html или ZIP сайта.");
        }
        File index = new File(siteRoot, "index.html");
        if (!index.isFile()) {
            throw new IOException("В корне сайта не найден index.html.");
        }

        List<File> siteFiles = collectSiteFiles(siteRoot);
        if (siteFiles.isEmpty()) throw new IOException("Сайт пустой.");
        if (iconFile != null && !iconFile.isFile()) {
            throw new IOException("Файл иконки больше недоступен. Выберите его ещё раз.");
        }

        File cache = new File(context.getCacheDir(), "webapk-build");
        if (!cache.exists() && !cache.mkdirs()) throw new IOException("Не удалось создать временную папку.");
        File unsigned = new File(cache, "website-unsigned.apk");
        File signed = new File(cache, "website-" + System.currentTimeMillis() + ".apk");
        if (unsigned.exists()) unsigned.delete();

        boolean manifestSeen = false;
        boolean resourcesSeen = false;
        int replacedIcons = 0;
        Map<String, byte[]> iconBytes = iconFile == null ? Collections.<String, byte[]>emptyMap()
                : makeIconPngs(iconFile);
        Set<String> usedIconDensities = new HashSet<>();

        try (InputStream asset = new BufferedInputStream(context.getAssets().open(TEMPLATE_ASSET));
             ZipInputStream source = new ZipInputStream(asset);
             FileOutputStream fileOut = new FileOutputStream(unsigned);
             CountingOutputStream countingOut = new CountingOutputStream(new BufferedOutputStream(fileOut));
             ZipOutputStream apk = new ZipOutputStream(countingOut)) {
            apk.setLevel(Deflater.DEFAULT_COMPRESSION);
            ZipEntry entry;
            while ((entry = source.getNextEntry()) != null) {
                String name = entry.getName();
                if (entry.isDirectory() || name.startsWith("META-INF/")) {
                    source.closeEntry();
                    continue;
                }
                if (name.equals("AndroidManifest.xml")) {
                    byte[] original = readAll(source, 4 * 1024 * 1024);
                    Map<String, String> replacements = new HashMap<>();
                    replacements.put(TEMPLATE_PACKAGE, packageName);
                    replacements.put("__WEBAPK_LABEL__", sanitizeLabel(appLabel));
                    byte[] patched = BinaryXmlPatcher.patch(original, replacements, autoRotate, versionCode);
                    putStoredAligned(apk, countingOut, name, patched);
                    manifestSeen = true;
                } else if (name.equals("resources.arsc")) {
                    byte[] table = readAll(source, 32 * 1024 * 1024);
                    patchResourcePackageName(table, TEMPLATE_PACKAGE, packageName);
                    putStoredAligned(apk, countingOut, name, table);
                    resourcesSeen = true;
                } else if (iconFile != null && IconResourceLocator.isIconCandidate(name)) {
                    byte[] originalIcon = readAll(source, 4 * 1024 * 1024);
                    String density = IconResourceLocator.densityFor(name, originalIcon);
                    byte[] replacement = density == null ? null : iconBytes.get(density);
                    if (replacement != null) {
                        putStoredAligned(apk, countingOut, name, replacement);
                        usedIconDensities.add(density);
                        replacedIcons++;
                    } else {
                        ZipEntry copied = new ZipEntry(name);
                        copied.setTime(entry.getTime());
                        apk.putNextEntry(copied);
                        apk.write(originalIcon);
                        apk.closeEntry();
                    }
                } else if (name.equals("classes.dex")) {
                    byte[] dex = readAll(source, 32 * 1024 * 1024);
                    putStoredAligned(apk, countingOut, name, dex);
                } else if (name.startsWith("assets/site/")) {
                    // The template's sample page is always replaced with the selected project.
                } else {
                    ZipEntry copied = new ZipEntry(name);
                    copied.setTime(entry.getTime());
                    apk.putNextEntry(copied);
                    copy(source, apk);
                    apk.closeEntry();
                }
                source.closeEntry();
            }

            if (!manifestSeen || !resourcesSeen) {
                throw new IOException("Встроенный APK-шаблон неполный. Пересоберите приложение через GitHub Actions.");
            }
            if (iconFile != null && replacedIcons == 0) {
                throw new IOException("В шаблоне не найдены ресурсы иконки приложения.");
            }
            if (iconFile != null && usedIconDensities.size() < 5) {
                throw new IOException("Не удалось заменить все размеры иконки приложения.");
            }
            for (File file : siteFiles) {
                String relative = relativePath(siteRoot, file);
                String zipName = "assets/site/" + relative;
                if (zipName.indexOf('\n') >= 0 || zipName.indexOf('\r') >= 0) {
                    throw new IOException("В имени файла сайта есть недопустимый перенос строки.");
                }
                ZipEntry siteEntry = new ZipEntry(zipName);
                siteEntry.setTime(0L);
                apk.putNextEntry(siteEntry);
                try (InputStream input = new BufferedInputStream(new FileInputStream(file))) {
                    copy(input, apk);
                }
                apk.closeEntry();
            }
            apk.finish();
        } catch (Exception error) {
            unsigned.delete();
            signed.delete();
            throw error;
        }

        try (InputStream signingKey = new BufferedInputStream(
                context.getAssets().open(SITE_SIGNING_ASSET))) {
            JarV1Signer.signWithKeyStore(unsigned, signed, signingKey,
                    SITE_SIGNING_PASSWORD.toCharArray(), SITE_SIGNING_ALIAS);
            if (!signed.isFile() || signed.length() == 0) {
                throw new IOException("Не удалось подписать APK.");
            }
            return signed;
        } finally {
            unsigned.delete();
        }
    }

    private static List<File> collectSiteFiles(File root) throws IOException {
        String rootPath = root.getCanonicalPath();
        List<File> files = new ArrayList<>();
        List<File> pending = new ArrayList<>();
        pending.add(root);
        while (!pending.isEmpty()) {
            File current = pending.remove(pending.size() - 1);
            File[] children = current.listFiles();
            if (children == null) continue;
            for (File child : children) {
                String canonical = child.getCanonicalPath();
                if (!canonical.startsWith(rootPath + File.separator) && !canonical.equals(rootPath)) {
                    throw new IOException("В сайте найден файл вне папки проекта.");
                }
                if (child.isDirectory()) {
                    pending.add(child);
                } else if (child.isFile()) {
                    files.add(child);
                    if (files.size() > 10000) throw new IOException("В ZIP слишком много файлов (больше 10 000).");
                }
            }
        }
        Collections.sort(files, new Comparator<File>() {
            @Override public int compare(File left, File right) {
                return relativePathUnchecked(root, left).compareTo(relativePathUnchecked(root, right));
            }
        });
        return files;
    }

    private static String relativePath(File root, File file) throws IOException {
        String rootPath = root.getCanonicalPath();
        String filePath = file.getCanonicalPath();
        String prefix = rootPath + File.separator;
        if (!filePath.startsWith(prefix)) throw new IOException("Файл сайта находится за пределами проекта.");
        return filePath.substring(prefix.length()).replace(File.separatorChar, '/');
    }

    private static String relativePathUnchecked(File root, File file) {
        try {
            return relativePath(root, file);
        } catch (IOException ignored) {
            return file.getName();
        }
    }

    private static Map<String, byte[]> makeIconPngs(File iconFile) throws IOException {
        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(iconFile.getAbsolutePath(), bounds);
        if (bounds.outWidth <= 0 || bounds.outHeight <= 0) {
            throw new IOException("Не удалось прочитать изображение иконки.");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        int max = Math.max(bounds.outWidth, bounds.outHeight);
        while (max / options.inSampleSize > 1024) options.inSampleSize *= 2;
        Bitmap source = BitmapFactory.decodeFile(iconFile.getAbsolutePath(), options);
        if (source == null) throw new IOException("Не удалось открыть изображение иконки.");

        int side = Math.min(source.getWidth(), source.getHeight());
        int left = (source.getWidth() - side) / 2;
        int top = (source.getHeight() - side) / 2;
        Bitmap square = Bitmap.createBitmap(source, left, top, side, side);
        if (square != source) source.recycle();

        String[] names = {"mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
        Map<String, byte[]> result = new HashMap<>();
        try {
            for (int i = 0; i < names.length; i++) {
                Bitmap scaled = Bitmap.createScaledBitmap(square, ICON_SIZES[i], ICON_SIZES[i], true);
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                if (!scaled.compress(Bitmap.CompressFormat.PNG, 100, bytes)) {
                    throw new IOException("Не удалось создать PNG-иконку.");
                }
                result.put(names[i], bytes.toByteArray());
                if (scaled != square) scaled.recycle();
            }
        } finally {
            square.recycle();
        }
        return result;
    }

    private static void patchResourcePackageName(byte[] table, String oldPackage, String newPackage)
            throws IOException {
        if (table.length < 12 || u16(table, 0) != 0x0002) {
            throw new IOException("В шаблоне APK повреждена таблица ресурсов.");
        }
        int rootHeader = u16(table, 2);
        int totalSize = checkedInt(u32(table, 4), "размер таблицы ресурсов");
        if (totalSize != table.length || rootHeader < 12) {
            throw new IOException("Некорректный заголовок таблицы ресурсов.");
        }
        int offset = rootHeader;
        while (offset + 8 <= table.length) {
            int type = u16(table, offset);
            int headerSize = u16(table, offset + 2);
            int chunkSize = checkedInt(u32(table, offset + 4), "размер ресурса");
            if (chunkSize < 8 || offset + chunkSize > table.length) {
                throw new IOException("Повреждённая таблица ресурсов APK.");
            }
            if (type == 0x0200 && headerSize >= 268 && offset + 268 <= table.length) {
                int nameOffset = offset + 12;
                String current = readFixedUtf16(table, nameOffset, 128);
                if (oldPackage.equals(current)) {
                    byte[] name = newPackage.getBytes(StandardCharsets.UTF_16LE);
                    if (name.length + 2 > 256) throw new IOException("Слишком длинный идентификатор пакета.");
                    for (int i = 0; i < 256; i++) table[nameOffset + i] = 0;
                    System.arraycopy(name, 0, table, nameOffset, name.length);
                }
            }
            offset += chunkSize;
        }
    }

    private static String readFixedUtf16(byte[] bytes, int offset, int chars) {
        int end = offset;
        int limit = offset + chars * 2;
        while (end + 1 < limit && (bytes[end] != 0 || bytes[end + 1] != 0)) end += 2;
        return new String(bytes, offset, end - offset, StandardCharsets.UTF_16LE);
    }

    private static void putStoredAligned(ZipOutputStream zip, CountingOutputStream counter,
                                         String name, byte[] data) throws IOException {
        CRC32 crc = new CRC32();
        crc.update(data);
        ZipEntry entry = new ZipEntry(name);
        entry.setMethod(ZipEntry.STORED);
        entry.setSize(data.length);
        entry.setCompressedSize(data.length);
        entry.setCrc(crc.getValue());
        byte[] nameBytes = name.getBytes(StandardCharsets.UTF_8);
        long base = counter.getCount() + 30L + nameBytes.length;
        int pad = (int) ((4L - (base & 3L)) & 3L);
        if (pad != 0) {
            byte[] extra = new byte[4 + pad];
            extra[0] = 0x35; // ZIP extra field 0xD935: alignment padding.
            extra[1] = (byte) 0xD9;
            extra[2] = (byte) pad;
            extra[3] = 0;
            entry.setExtra(extra);
        }
        zip.putNextEntry(entry);
        zip.write(data);
        zip.closeEntry();
    }

    private static byte[] readAll(InputStream input, int maxBytes) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int count;
        int total = 0;
        while ((count = input.read(buffer)) != -1) {
            total += count;
            if (total > maxBytes) throw new IOException("Файл в шаблоне неожиданно большой.");
            out.write(buffer, 0, count);
        }
        return out.toByteArray();
    }

    private static long copy(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        int count;
        long total = 0;
        while ((count = input.read(buffer)) != -1) {
            total += count;
            output.write(buffer, 0, count);
        }
        return total;
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

    private static int checkedInt(long value, String description) throws IOException {
        if (value < 0 || value > Integer.MAX_VALUE) throw new IOException("Слишком большое значение: " + description);
        return (int) value;
    }

    static String formatBytes(long bytes) {
        if (bytes < 1024) return bytes + " Б";
        if (bytes < 1024L * 1024L) {
            return String.format(Locale.getDefault(), "%.1f КБ", bytes / 1024.0);
        }
        if (bytes < 1024L * 1024L * 1024L) {
            return String.format(Locale.getDefault(), "%.1f МБ", bytes / (1024.0 * 1024.0));
        }
        return String.format(Locale.getDefault(), "%.2f ГБ", bytes / (1024.0 * 1024.0 * 1024.0));
    }

    private static final class CountingOutputStream extends FilterOutputStream {
        private long count;

        CountingOutputStream(OutputStream out) {
            super(out);
        }

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
}
