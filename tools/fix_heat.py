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

g2 = g.replace("versionCode 925", "versionCode 926")
g2 = g2.replace("versionName '1.257.0'", "versionName '1.257.0-ru2'")
if g2 != g:
    with open(gradle_path, "w", encoding="utf-8") as f:
        f.write(g2)
    print("Версия поднята: versionCode 926, versionName 1.257.0-ru2")
else:
    print("Версия уже обновлена или не найдена — проверьте вручную.")

# ---------- 3. Маркер ----------
marker = os.path.join(proj, "FIXES-APPLIED.txt")
with open(marker, "w", encoding="utf-8") as f:
    f.write("GitHub-RU v2 — фикс нагрева применён\n")
    f.write(f"Дата: {datetime.datetime.utcnow().isoformat()}Z\n\n")
    f.write("Изменения:\n")
    for name, val in FLAGS:
        f.write(f"  meta-data {name} = {val}\n")
    f.write("  versionCode 926, versionName 1.257.0-ru2\n")
print("Готово: fix_heat применён.")
