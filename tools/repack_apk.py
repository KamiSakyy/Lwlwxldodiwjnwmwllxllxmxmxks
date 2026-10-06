#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Перепаковка APK после apktool (шаг «вес APK»):
  * выбрасываем старые файлы подписи (META-INF/*.SF, *.RSA, *.DSA, *.EC, MANIFEST.MF);
  * dex и прочие сжимаемые данные — deflate 9 (apktool держит classes.dex несжатым);
  * то, что уже сжато (png/webp/jpg/so/prof) и resources.arsc — храним без сжатия;
  * resources.arsc выравниваем на 4 байта, lib/*.so — на 16384 (нужно при
    extractNativeLibs=false и страницах памяти 16 КБ).
"""
import os
import sys
import zipfile

DROP = ('.SF', '.RSA', '.DSA', '.EC', '.MF')
STORE_EXT = ('.png', '.webp', '.jpg', '.jpeg', '.gif', '.so', '.arsc', '.mp3', '.ogg',
             '.wav', '.mp4', '.zip', '.binarypb', '.prof', '.profm', '.ttf', '.otf')

src, dst = sys.argv[1], sys.argv[2]
# необязательно: --meta-from <базовый.apk> — вернуть META-INF (лицензии/NOTICE/
# *.version), которые apktool не переносит в пересобранный APK. Файлы подписи
# из базы не берём. Всего таких файлов ~150 и они весят ~45 КБ в сжатом виде.
meta_from = None
if '--meta-from' in sys.argv:
    meta_from = sys.argv[sys.argv.index('--meta-from') + 1]
zin = zipfile.ZipFile(src)
zout = zipfile.ZipFile(dst, 'w', zipfile.ZIP_DEFLATED, compresslevel=9)
stats = {'stored': 0, 'deflated': 0, 'dropped': 0}

for it in zin.infolist():
    name = it.filename
    if name.startswith('META-INF/') and name.upper().endswith(DROP):
        stats['dropped'] += 1
        continue
    data = zin.read(it)
    keep = (name == 'resources.arsc'
            or name.startswith('lib/')
            or name.lower().endswith(STORE_EXT)
            or name.startswith('assets/dexopt/')
            or (name.startswith('META-INF/') and name.endswith('.version')))
    align = 16384 if name.startswith('lib/') else (4 if name == 'resources.arsc' else 0)
    zi = zipfile.ZipInfo(name, it.date_time)
    zi.external_attr = it.external_attr
    zi.internal_attr = it.internal_attr
    zi.create_system = it.create_system
    zi.compress_type = zipfile.ZIP_STORED if keep else zipfile.ZIP_DEFLATED
    if align:
        extra = zi.extra or b''
        cur = zout.fp.tell()
        header = 30 + len(name.encode('utf-8')) + len(extra)
        pad = (-(cur + header)) % align
        if pad:
            zi.extra = extra + b'\x00' * pad
    zout.writestr(zi, data)
    stats['stored' if keep else 'deflated'] += 1

if meta_from:
    have = set(zin.namelist())
    zmeta = zipfile.ZipFile(meta_from)
    added = 0
    for it in zmeta.infolist():
        name = it.filename
        if not name.startswith('META-INF/') or it.is_dir():
            continue
        if name.upper().endswith(DROP) or name in have:
            continue
        zi = zipfile.ZipInfo(name, it.date_time)
        zi.external_attr = it.external_attr
        zi.create_system = it.create_system
        zi.compress_type = zipfile.ZIP_STORED if name.endswith('.version') else zipfile.ZIP_DEFLATED
        zout.writestr(zi, zmeta.read(it))
        added += 1
    print('[repack] возвращено файлов META-INF из базы: %d' % added)

zout.close()
print('[repack] без сжатия: %(stored)d, deflate: %(deflated)d, выброшено подписей: %(dropped)d' % stats)
print('[repack] готово: %s (%.1f МБ)' % (dst, os.path.getsize(dst) / 1048576.0))
