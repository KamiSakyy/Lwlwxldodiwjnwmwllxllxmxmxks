package ru.webapk.studio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** Rewrites the package ID and app label in AAPT's compiled AndroidManifest.xml. */
final class BinaryXmlPatcher {
    private static final int RES_XML_TYPE = 0x0003;
    private static final int RES_STRING_POOL_TYPE = 0x0001;
    private static final int UTF8_FLAG = 0x00000100;
    private static final int STRING_POOL_HEADER_SIZE = 28;

    private BinaryXmlPatcher() { }

    static byte[] patch(byte[] xml, Map<String, String> replacements) throws IOException {
        return patch(xml, replacements, null, null, null);
    }

    static byte[] patch(byte[] xml, Map<String, String> replacements, boolean autoRotate) throws IOException {
        return patch(xml, replacements, Boolean.valueOf(autoRotate), null, null);
    }

    static byte[] patch(byte[] xml, Map<String, String> replacements, boolean autoRotate,
                        int versionCode) throws IOException {
        return patch(xml, replacements, Boolean.valueOf(autoRotate), Integer.valueOf(versionCode), null);
    }

    static byte[] patch(byte[] xml, Map<String, String> replacements, boolean autoRotate,
                        int versionCode, Integer targetSdkVersion) throws IOException {
        return patch(xml, replacements, Boolean.valueOf(autoRotate), Integer.valueOf(versionCode), targetSdkVersion);
    }

    private static byte[] patch(byte[] xml, Map<String, String> replacements, Boolean autoRotate,
                                Integer versionCode, Integer targetSdkVersion) throws IOException {
        if (xml == null || xml.length < 8 || u16(xml, 0) != RES_XML_TYPE) {
            throw new IOException("Шаблон APK не содержит бинарный AndroidManifest.xml");
        }
        int declaredSize = checkedInt(u32(xml, 4), "размер XML");
        if (declaredSize != xml.length) {
            throw new IOException("Повреждённый AndroidManifest.xml в шаблоне");
        }

        int poolOffset = -1;
        int poolSize = 0;
        int offset = u16(xml, 2);
        while (offset + 8 <= xml.length) {
            int type = u16(xml, offset);
            int size = checkedInt(u32(xml, offset + 4), "размер XML-чанка");
            if (size < 8 || offset + size > xml.length) {
                throw new IOException("Повреждённый XML-чанк AndroidManifest.xml");
            }
            if (type == RES_STRING_POOL_TYPE) {
                poolOffset = offset;
                poolSize = size;
                break;
            }
            offset += size;
        }
        if (poolOffset < 0) {
            throw new IOException("В AndroidManifest.xml не найдена таблица строк");
        }

        List<String> strings = readStringPool(xml, poolOffset, poolSize);
        int changed = 0;
        for (int i = 0; i < strings.size(); i++) {
            String replacement = replacements.get(strings.get(i));
            if (replacement != null) {
                strings.set(i, replacement);
                changed++;
            }
        }
        if (changed == 0) {
            throw new IOException("Не удалось изменить имя приложения в шаблоне APK");
        }
        if (autoRotate != null) patchScreenOrientation(xml, strings, autoRotate.booleanValue());
        if (versionCode != null) patchIntegerAttribute(xml, strings, "versionCode", versionCode.intValue());
        if (targetSdkVersion != null) {
            patchIntegerAttribute(xml, strings, "targetSdkVersion", targetSdkVersion.intValue());
        }

        byte[] newPool = writeUtf8StringPool(strings);
        ByteArrayOutputStream out = new ByteArrayOutputStream(xml.length + newPool.length - poolSize);
        out.write(xml, 0, poolOffset);
        out.write(newPool);
        out.write(xml, poolOffset + poolSize, xml.length - poolOffset - poolSize);
        byte[] patched = out.toByteArray();
        put32(patched, 4, patched.length);
        return patched;
    }

    private static void patchScreenOrientation(byte[] xml, List<String> strings, boolean autoRotate)
            throws IOException {
        int attribute = findAndroidAttribute(xml, strings, "screenOrientation");
        // SCREEN_ORIENTATION_SENSOR allows the generated app to follow device rotation; portrait stays the default.
        setIntegerValue(xml, attribute, autoRotate ? 4 : 1);
    }

    private static void patchIntegerAttribute(byte[] xml, List<String> strings, String name, int value)
            throws IOException {
        if (value < 1) throw new IOException("Номер версии приложения должен быть положительным.");
        int attribute = findAndroidAttribute(xml, strings, name);
        setIntegerValue(xml, attribute, value);
    }

    private static void setIntegerValue(byte[] xml, int attribute, int value) {
        xml[attribute + 8] = (byte) 0xff;
        xml[attribute + 9] = (byte) 0xff;
        xml[attribute + 10] = (byte) 0xff;
        xml[attribute + 11] = (byte) 0xff;
        xml[attribute + 12] = 8;
        xml[attribute + 13] = 0;
        xml[attribute + 14] = 0;
        xml[attribute + 15] = 0x10;
        put32(xml, attribute + 16, value);
    }

    static int readScreenOrientation(byte[] xml) throws IOException {
        if (xml == null || xml.length < 8 || u16(xml, 0) != RES_XML_TYPE) {
            throw new IOException("Некорректный бинарный AndroidManifest.xml");
        }
        int offset = u16(xml, 2);
        while (offset + 8 <= xml.length) {
            int type = u16(xml, offset);
            int size = checkedInt(u32(xml, offset + 4), "размер XML-чанка");
            if (size < 8 || offset + size > xml.length) throw new IOException("Повреждённый XML-чанк");
            if (type == RES_STRING_POOL_TYPE) {
                List<String> strings = readStringPool(xml, offset, size);
                int attribute = findAndroidAttribute(xml, strings, "screenOrientation");
                return checkedInt(u32(xml, attribute + 16), "screenOrientation");
            }
            offset += size;
        }
        throw new IOException("В манифесте не найдена таблица строк");
    }

    static int readVersionCode(byte[] xml) throws IOException {
        return readIntegerAttribute(xml, "versionCode");
    }

    static int readTargetSdkVersion(byte[] xml) throws IOException {
        return readIntegerAttribute(xml, "targetSdkVersion");
    }

    private static int readIntegerAttribute(byte[] xml, String name) throws IOException {
        if (xml == null || xml.length < 8 || u16(xml, 0) != RES_XML_TYPE) {
            throw new IOException("Некорректный бинарный AndroidManifest.xml");
        }
        int offset = u16(xml, 2);
        while (offset + 8 <= xml.length) {
            int type = u16(xml, offset);
            int size = checkedInt(u32(xml, offset + 4), "размер XML-чанка");
            if (size < 8 || offset + size > xml.length) throw new IOException("Повреждённый XML-чанк");
            if (type == RES_STRING_POOL_TYPE) {
                List<String> strings = readStringPool(xml, offset, size);
                int attribute = findAndroidAttribute(xml, strings, name);
                return checkedInt(u32(xml, attribute + 16), name);
            }
            offset += size;
        }
        throw new IOException("В манифесте не найдена таблица строк");
    }

    static String readMetaDataString(byte[] xml, String targetName) throws IOException {
        if (xml == null || xml.length < 8 || u16(xml, 0) != RES_XML_TYPE) {
            throw new IOException("Некорректный бинарный AndroidManifest.xml");
        }
        final String androidNamespace = "http://schemas.android.com/apk/res/android";
        int offset = u16(xml, 2);
        while (offset + 8 <= xml.length) {
            int type = u16(xml, offset);
            int size = checkedInt(u32(xml, offset + 4), "размер XML-чанка");
            if (size < 8 || offset + size > xml.length) throw new IOException("Повреждённый XML-чанк");
            if (type == RES_STRING_POOL_TYPE) {
                List<String> strings = readStringPool(xml, offset, size);
                int chunkOffset = offset + size;
                while (chunkOffset + 8 <= xml.length) {
                    int chunkType = u16(xml, chunkOffset);
                    int chunkSize = checkedInt(u32(xml, chunkOffset + 4), "размер XML-чанка");
                    if (chunkSize < 8 || chunkOffset + chunkSize > xml.length) {
                        throw new IOException("Повреждённый XML-чанк");
                    }
                    if (chunkType == 0x0102) {
                        int headerSize = u16(xml, chunkOffset + 2);
                        int extension = chunkOffset + headerSize;
                        if (headerSize < 16 || extension + 20 > chunkOffset + chunkSize) {
                            throw new IOException("Повреждённый XML-элемент AndroidManifest.xml");
                        }
                        int elementNameIndex = (int) u32(xml, extension + 4);
                        if (elementNameIndex >= 0 && elementNameIndex < strings.size()
                                && "meta-data".equals(strings.get(elementNameIndex))) {
                            int attributeStart = u16(xml, extension + 8);
                            int attributeSize = u16(xml, extension + 10);
                            int attributeCount = u16(xml, extension + 12);
                            long attributes = (long) extension + attributeStart;
                            if (attributeStart < 20 || attributeSize < 20
                                    || attributes + (long) attributeCount * attributeSize > chunkOffset + chunkSize) {
                                throw new IOException("Повреждённый список атрибутов AndroidManifest.xml");
                            }
                            String metadataName = null;
                            String metadataValue = null;
                            for (int index = 0; index < attributeCount; index++) {
                                int attribute = (int) (attributes + (long) index * attributeSize);
                                int namespaceIndex = (int) u32(xml, attribute);
                                int nameIndex = (int) u32(xml, attribute + 4);
                                if (namespaceIndex < 0 || namespaceIndex >= strings.size()
                                        || nameIndex < 0 || nameIndex >= strings.size()
                                        || !androidNamespace.equals(strings.get(namespaceIndex))) continue;
                                String attributeName = strings.get(nameIndex);
                                if ("name".equals(attributeName)) {
                                    metadataName = readStringAttribute(xml, strings, attribute);
                                } else if ("value".equals(attributeName)) {
                                    metadataValue = readStringAttribute(xml, strings, attribute);
                                }
                            }
                            if (targetName.equals(metadataName)) return metadataValue;
                        }
                    }
                    chunkOffset += chunkSize;
                }
                break;
            }
            offset += size;
        }
        throw new IOException("Не найдены строковые meta-data для " + targetName);
    }

    private static String readStringAttribute(byte[] xml, List<String> strings, int attribute)
            throws IOException {
        int rawIndex = (int) u32(xml, attribute + 8);
        if (rawIndex >= 0) {
            if (rawIndex >= strings.size()) throw new IOException("Некорректная строка атрибута");
            return strings.get(rawIndex);
        }
        if ((xml[attribute + 15] & 0xff) != 0x03) return null;
        int valueIndex = checkedInt(u32(xml, attribute + 16), "индекс строки атрибута");
        if (valueIndex < 0 || valueIndex >= strings.size()) throw new IOException("Некорректная строка атрибута");
        return strings.get(valueIndex);
    }

    private static int findAndroidAttribute(byte[] xml, List<String> strings, String targetName)
            throws IOException {
        final String androidNamespace = "http://schemas.android.com/apk/res/android";
        int offset = u16(xml, 2);
        while (offset + 8 <= xml.length) {
            int type = u16(xml, offset);
            int size = checkedInt(u32(xml, offset + 4), "размер XML-чанка");
            if (size < 8 || offset + size > xml.length) throw new IOException("Повреждённый XML-чанк");
            if (type == 0x0102) { // RES_XML_START_ELEMENT_TYPE
                int headerSize = u16(xml, offset + 2);
                if (headerSize < 16 || size < headerSize) {
                    throw new IOException("Повреждённый XML-элемент AndroidManifest.xml");
                }
                int extension = offset + headerSize;
                if (extension + 20 > offset + size) {
                    throw new IOException("Повреждённый XML-элемент AndroidManifest.xml");
                }
                int attributeStart = u16(xml, extension + 8);
                int attributeSize = u16(xml, extension + 10);
                int attributeCount = u16(xml, extension + 12);
                long attributes = (long) extension + attributeStart;
                if (attributeStart < 20 || attributeSize < 20
                        || attributes + (long) attributeCount * attributeSize > offset + size) {
                    throw new IOException("Повреждённый список атрибутов AndroidManifest.xml");
                }
                for (int index = 0; index < attributeCount; index++) {
                    int attribute = (int) (attributes + (long) index * attributeSize);
                    int namespaceIndex = (int) u32(xml, attribute);
                    int nameIndex = (int) u32(xml, attribute + 4);
                    if (namespaceIndex < 0 || namespaceIndex >= strings.size()
                            || nameIndex < 0 || nameIndex >= strings.size()) continue;
                    if (androidNamespace.equals(strings.get(namespaceIndex))
                            && targetName.equals(strings.get(nameIndex))) {
                        if (u16(xml, attribute + 12) < 8) {
                            throw new IOException("Некорректное значение " + targetName);
                        }
                        return attribute;
                    }
                }
            }
            offset += size;
        }
        throw new IOException("В манифесте отсутствует android:" + targetName);
    }

    private static List<String> readStringPool(byte[] xml, int offset, int size) throws IOException {
        int headerSize = u16(xml, offset + 2);
        if (headerSize < STRING_POOL_HEADER_SIZE || size < headerSize) {
            throw new IOException("Некорректный заголовок таблицы строк");
        }
        int stringCount = checkedInt(u32(xml, offset + 8), "число строк");
        int styleCount = checkedInt(u32(xml, offset + 12), "число стилей");
        int flags = checkedInt(u32(xml, offset + 16), "флаги таблицы строк");
        int stringsStart = checkedInt(u32(xml, offset + 20), "смещение строк");
        if (stringCount < 0 || stringCount > 100000 || styleCount != 0) {
            throw new IOException("Неподдерживаемая таблица строк AndroidManifest.xml");
        }
        long offsetsEnd = (long) offset + headerSize + (long) (stringCount + styleCount) * 4L;
        if (offsetsEnd > (long) offset + size || stringsStart < headerSize + stringCount * 4L
                || stringsStart > size) {
            throw new IOException("Повреждённые смещения строк AndroidManifest.xml");
        }

        boolean utf8 = (flags & UTF8_FLAG) != 0;
        List<String> result = new ArrayList<>(stringCount);
        for (int i = 0; i < stringCount; i++) {
            int relative = checkedInt(u32(xml, offset + headerSize + i * 4), "смещение строки");
            int position = offset + stringsStart + relative;
            if (position < offset || position >= offset + size) {
                throw new IOException("Строка выходит за границы AndroidManifest.xml");
            }
            if (utf8) {
                Length utf16Length = readLength8(xml, position, offset + size);
                Length byteLength = readLength8(xml, utf16Length.next, offset + size);
                int end = byteLength.next + byteLength.value;
                if (end >= offset + size || xml[end] != 0) {
                    throw new IOException("Некорректная UTF-8 строка AndroidManifest.xml");
                }
                result.add(new String(xml, byteLength.next, byteLength.value, StandardCharsets.UTF_8));
            } else {
                Length length = readLength16(xml, position, offset + size);
                long byteCount = (long) length.value * 2L;
                int end = (int) (length.next + byteCount);
                if (end + 1 >= offset + size || xml[end] != 0 || xml[end + 1] != 0) {
                    throw new IOException("Некорректная UTF-16 строка AndroidManifest.xml");
                }
                result.add(new String(xml, length.next, (int) byteCount, StandardCharsets.UTF_16LE));
            }
        }
        return result;
    }

    private static byte[] writeUtf8StringPool(List<String> strings) throws IOException {
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        int[] offsets = new int[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            offsets[i] = data.size();
            String value = strings.get(i);
            byte[] utf8 = value.getBytes(StandardCharsets.UTF_8);
            writeLength8(data, value.length());
            writeLength8(data, utf8.length);
            data.write(utf8);
            data.write(0);
        }
        while ((data.size() & 3) != 0) {
            data.write(0);
        }

        int stringsStart = STRING_POOL_HEADER_SIZE + offsets.length * 4;
        int totalSize = stringsStart + data.size();
        ByteArrayOutputStream out = new ByteArrayOutputStream(totalSize);
        write16(out, RES_STRING_POOL_TYPE);
        write16(out, STRING_POOL_HEADER_SIZE);
        write32(out, totalSize);
        write32(out, strings.size());
        write32(out, 0); // Styles are not used by compiled manifests.
        write32(out, UTF8_FLAG);
        write32(out, stringsStart);
        write32(out, 0);
        for (int item : offsets) {
            write32(out, item);
        }
        data.writeTo(out);
        return out.toByteArray();
    }

    private static Length readLength8(byte[] bytes, int offset, int limit) throws IOException {
        if (offset >= limit) throw new IOException("Обрезанная строка AndroidManifest.xml");
        int first = bytes[offset] & 0xff;
        if ((first & 0x80) == 0) return new Length(first, offset + 1);
        if (offset + 1 >= limit) throw new IOException("Обрезанная строка AndroidManifest.xml");
        return new Length(((first & 0x7f) << 8) | (bytes[offset + 1] & 0xff), offset + 2);
    }

    private static Length readLength16(byte[] bytes, int offset, int limit) throws IOException {
        if (offset + 2 > limit) throw new IOException("Обрезанная строка AndroidManifest.xml");
        int first = u16(bytes, offset);
        if ((first & 0x8000) == 0) return new Length(first, offset + 2);
        if (offset + 4 > limit) throw new IOException("Обрезанная строка AndroidManifest.xml");
        int second = u16(bytes, offset + 2);
        return new Length(((first & 0x7fff) << 16) | second, offset + 4);
    }

    private static void writeLength8(ByteArrayOutputStream out, int length) throws IOException {
        if (length < 0x80) {
            out.write(length);
        } else if (length < 0x8000) {
            out.write(0x80 | (length >>> 8));
            out.write(length & 0xff);
        } else {
            throw new IOException("Строка слишком длинная для таблицы AndroidManifest.xml");
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

    private static int checkedInt(long value, String description) throws IOException {
        if (value < 0 || value > Integer.MAX_VALUE) {
            throw new IOException("Слишком большое значение: " + description);
        }
        return (int) value;
    }

    private static void put32(byte[] target, int offset, int value) {
        target[offset] = (byte) value;
        target[offset + 1] = (byte) (value >>> 8);
        target[offset + 2] = (byte) (value >>> 16);
        target[offset + 3] = (byte) (value >>> 24);
    }

    private static void write16(ByteArrayOutputStream out, int value) {
        out.write(value & 0xff);
        out.write((value >>> 8) & 0xff);
    }

    private static void write32(ByteArrayOutputStream out, int value) {
        out.write(value & 0xff);
        out.write((value >>> 8) & 0xff);
        out.write((value >>> 16) & 0xff);
        out.write((value >>> 24) & 0xff);
    }

    private static final class Length {
        final int value;
        final int next;

        Length(int value, int next) {
            this.value = value;
            this.next = next;
        }
    }
}
