#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 3 — ФИКС НАГРЕВА для GitHub-RU v2.

Причины нагрева (диагноз из Этапа 1-2):
1) Смена applicationId на com.github.rudroid ломает регистрацию FCM/Firebase Installations
   (пакет не зарегистрирован в Firebase-проекте GitHub) -> библиотека вечно повторяет
   регистрацию с будильниками/wakelock-ами -> телефон греется в простое.
2) Firebase Analytics (AppMeasurement) не может отправлять данные и тоже крутит повторы.

Исправление (официальные, документированные флаги Firebase через meta-data):
- firebase_messaging_auto_init_enabled=false  -> FCM не генерирует токен сам (нет шторма повторов)
- firebase_analytics_collection_deactivated=true -> analytics полностью выключен
- firebase_analytics_collection_enabled=false -> страховка
- google_analytics_adid_collection_enabled=false -> не собирает рекламный ID

Эти флаги НЕ ломают FirebaseApp.getInstance()/FirebaseAnalytics.getInstance() —
плюс к стабильности ноль риска.

Также: версия -> versionCode 926, versionName 1.257.0-ru2.
Скрипт идемпотентный: повторный запуск ничего не ломает.
"""
import os, re, sys, datetime

proj = sys.argv[1]
manifest_path = os.path.join(proj, "app", "src", "main", "AndroidManifest.xml")
gradle_path = os.path.join(proj, "app", "build.gradle")

FLAGS = [
    ('firebase_messaging_auto_init_enabled', 'false'),
    ('firebase_analytics_collection_deactivated', 'true'),
    ('firebase_analytics_collection_enabled', 'false'),
    ('google_analytics_adid_collection_enabled', 'false'),
]

# ---------- 1. Манифест: вставляем meta-data внутрь <application> ----------
with open(manifest_path, "r", encoding="utf-8") as f:
    lines = f.readlines()

app_idx = None
for i, ln in enumerate(lines):
    if "<application" in ln:
        app_idx = i
        break
if app_idx is None:
    print("ОШИБКА: <application> не найден в манифесте")
    sys.exit(1)

existing = "".join(lines)
insert_lines = []
for name, val in FLAGS:
    if f'android:name="{name}"' not in existing:
        insert_lines.append(f'        <meta-data android:name="{name}" android:value="{val}"/>\n')
        print(f"+ meta-data {name}={val}")
    else:
        print(f"  уже есть: {name}")

if insert_lines:
    lines[app_idx + 1:app_idx + 1] = insert_lines
    with open(manifest_path, "w", encoding="utf-8") as f:
        f.writelines(lines)
    print("Манифест обновлён.")
else:
    print("Манифест уже содержит все флаги.")

# ---------- 2. Версия v2 + подключение Android-плагина ----------
with open(gradle_path, "r", encoding="utf-8") as f:
    g = f.read()

# ФИКС СБОРКИ: в app/build.gradle нет подключения плагина — отсюда
# "Could not find method android()". Добавляем plugins-блок в начало файла.
if "apply plugin" not in g and not g.lstrip().startswith("plugins"):
    g = "plugins {\n    id 'com.android.application'\n}\n\n" + g
    print("+ Добавлен блок plugins { id 'com.android.application' } в app/build.gradle")

# Показывать ВСЕ ошибки javac, а не первые 100
if "Xmaxerrs" not in g:
    g += """
tasks.withType(JavaCompile).configureEach {
    options.compilerArgs += ['-Xmaxerrs', '50000', '-Xmaxwarns', '1000']
}
"""
    print("+ Добавлен -Xmaxerrs 50000 (видны все ошибки компиляции)")

g2 = g.replace("versionCode 925", "versionCode 926")
g2 = g2.replace("versionName '1.257.0'", "versionName '1.257.0-ru2'")
if g2 != g:
    with open(gradle_path, "w", encoding="utf-8") as f:
        f.write(g2)
    print("Версия поднята: versionCode 926, versionName 1.257.0-ru2")
else:
    print("Версия уже обновлена или не найдена — проверьте вручную.")

# ---------- 3. Санитизация ресурсов: '$' в именах запрещён AAPT2 ----------
# Файлы вида "$ic_x__0.xml" — части анимированных drawable (AVD), на них ссылаются
# родительские XML через @drawable/$ic_x__0. Удалить нельзя — ПЕРЕИМЕНОВЫВАЕМ
# (убираем '$') и переписываем все ссылки в res/**/*.xml.
import glob
res_dir = os.path.join(proj, "app", "src", "main", "res")
renamed_bases = []
renamed_cnt = 0
if os.path.isdir(res_dir):
    for root, dirs, files in os.walk(res_dir):
        for fn in files:
            if "$" in fn:
                old = os.path.join(root, fn)
                new_fn = fn.replace("$", "")
                new = os.path.join(root, new_fn)
                try:
                    os.rename(old, new)
                    renamed_cnt += 1
                    renamed_bases.append(os.path.splitext(new_fn)[0])
                except OSError:
                    pass
    # Переписываем ссылки на переименованные ресурсы во всех XML
    fixed_refs = 0
    for root, dirs, files in os.walk(res_dir):
        for fn in files:
            if not fn.lower().endswith(".xml"):
                continue
            p = os.path.join(root, fn)
            try:
                with open(p, "r", encoding="utf-8", errors="ignore") as f:
                    c = f.read()
            except OSError:
                continue
            c2 = c
            for base in renamed_bases:
                c2 = c2.replace("$" + base, base)
            if c2 != c:
                with open(p, "w", encoding="utf-8") as f:
                    f.write(c2)
                fixed_refs += 1
print(f"Переименовано res-файлов с '$' в имени: {renamed_cnt}; XML со исправленными ссылками: {fixed_refs}")

# ---------- 3.5 Удаление системных стабов (android/**), уже существующих в android.jar ----------
import zipfile as _zf
_jar = os.environ.get("ANDROID_JAR", "")
_jar_candidates = [_jar,
    os.path.join(os.environ.get("ANDROID_HOME", "/usr/local/lib/android/sdk"), "platforms", "android-36", "android.jar"),
    os.path.join("/usr/local/lib/android/sdk", "platforms", "android-35", "android.jar"),
    os.path.join("/usr/local/lib/android/sdk", "platforms", "android-34", "android.jar")]
jar_path = next((j for j in _jar_candidates if j and os.path.isfile(j)), None)
if jar_path:
    src_java = os.path.join(proj, "app", "src", "main", "java")
    removed_stubs = 0
    with _zf.ZipFile(jar_path) as z:
        jarnames = set(z.namelist())
    android_dir = os.path.join(src_java, "android")
    if os.path.isdir(android_dir):
        for root, dirs, files in os.walk(android_dir):
            for fn in files:
                if not fn.endswith(".java"):
                    continue
                fp = os.path.join(root, fn)
                rel = os.path.relpath(fp, src_java)[:-5].replace(os.sep, "/") + ".class"
                if rel in jarnames:
                    os.remove(fp)
                    removed_stubs += 1
        # чистим пустые папки
        for root, dirs, files in os.walk(android_dir, topdown=False):
            if not os.listdir(root):
                os.rmdir(root)
    print(f"Удалено системных стабов android/**: {removed_stubs} (есть в android.jar)")
else:
    print("android.jar не найден — стабы не удалялись")

# ---------- 4. Маркер ----------
marker = os.path.join(proj, "FIXES-APPLIED.txt")
with open(marker, "w", encoding="utf-8") as f:
    f.write("GitHub-RU v2 — фикс нагрева применён\n")
    f.write(f"Дата: {datetime.datetime.utcnow().isoformat()}Z\n\n")
    f.write("Изменения:\n")
    for name, val in FLAGS:
        f.write(f"  meta-data {name} = {val}\n")
    f.write("  versionCode 926, versionName 1.257.0-ru2\n")
    f.write(f"  res-файлов с '$' переименовано: {renamed_cnt} (ссылки переписаны)\n")
print("Готово: fix_heat применён.")
