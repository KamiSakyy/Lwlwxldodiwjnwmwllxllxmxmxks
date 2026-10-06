#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Контроль готового APK мода (не зависит от aapt2 — работает прямо с zip).
Проверяет: размер < базы, состав dex/ресурсов, пакет com.github.rudroid в манифесте,
сохранённый oauth-хост, наличие класса загрузки и русских строк, выравнивание arsc.
Запуск: python3 tools/check_apk.py handoff/<файл>.apk [база.apk]
"""
import os
import struct
import sys
import zipfile

apk = sys.argv[1]
base = sys.argv[2] if len(sys.argv) > 2 else None
ok = []
bad = []


def check(cond, msg):
    (ok if cond else bad).append(msg)
    print(('  OK   ' if cond else '  ОШИБКА ') + msg)


size = os.path.getsize(apk)
print('APK: %s (%.1f МБ)' % (apk, size / 1048576.0))
if base and os.path.exists(base):
    bs = os.path.getsize(base)
    check(size < bs, 'вес меньше базы: %d < %d (%.1f%%)' % (size, bs, 100.0 * size / bs))

z = zipfile.ZipFile(apk)
names = set(z.namelist())
dexes = sorted(n for n in names if n.endswith('.dex'))
check('classes.dex' in names, 'classes.dex на месте (всего dex: %d)' % len(dexes))
check('resources.arsc' in names, 'resources.arsc на месте')
check('AndroidManifest.xml' in names, 'AndroidManifest.xml на месте')

man = z.read('AndroidManifest.xml')
check('com.github.rudroid'.encode('utf-16-le') in man, 'в манифесте пакет com.github.rudroid')
check('com.github.android'.encode('utf-16-le') in man, 'в манифесте сохранён host com.github.android (oauth)')
check('requiredSplitTypes'.encode('utf-16-le') not in man, 'атрибуты сплитов убраны (одиночный APK)')
check('extractNativeLibs'.encode('utf-16-le') in man, 'extractNativeLibs присутствует')

blob = b''.join(z.read(n) for n in dexes)
check(b'Lcom/github/rudroid/webview/GHRDownloadListener;' in blob, 'класс GHRDownloadListener внутри dex')
check(b'setDownloadListener' in blob, 'вызов setDownloadListener внутри dex')
check(b'github://com.github.android/oauth' in blob, 'oauth-редирект не переименован')

arsc = z.read('resources.arsc')
cyr = sum(1 for i in range(0, len(arsc) - 1, 2) if 0x0400 <= struct.unpack_from('<H', arsc, i)[0] <= 0x04FF)
check(cyr > 2000, 'русские строки в resources.arsc (кириллических символов: %d)' % cyr)

# arsc без сжатия и выровнен на 4 байта
it = z.getinfo('resources.arsc')
z.fp.seek(it.header_offset)
sig, ver, flg, comp, t, d, crc, csz, usz, nlen, elen = struct.unpack('<IHHHHHIIIHH', z.fp.read(30))
off = it.header_offset + 30 + nlen + elen
check(comp == 0 and off % 4 == 0, 'resources.arsc без сжатия и выровнен (метод=%d, смещение=%d)' % (comp, off))
for n in sorted(x for x in names if x.startswith('lib/') and x.endswith('.so')):
    it = z.getinfo(n)
    z.fp.seek(it.header_offset)
    h = struct.unpack('<IHHHHHIIIHH', z.fp.read(30))
    o = it.header_offset + 30 + h[9] + h[10]
    check(h[3] == 0 and o % 16384 == 0, '%s: без сжатия, выравнивание 16 КБ (смещение %d)' % (n, o))

print('\nИтог: ошибок %d, проверок пройдено %d' % (len(bad), len(ok)))
sys.exit(1 if bad else 0)
