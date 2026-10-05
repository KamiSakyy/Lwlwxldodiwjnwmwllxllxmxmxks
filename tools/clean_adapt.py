#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 4 — адаптация ЧИСТОГО исходника github/mobile:
  1) applicationId/namespace -> com.github.rudroid (deep-link host НЕ трогаем)
  2) versionCode 930, versionName 'ru3-clean' (ставится поверх v1/v2)
  3) подпись github-ru.jks (пароль android, алиас github-ru)
  4) RU-перевод: values-ru/strings.xml из архива v1 -> res главного модуля
  5) Firebase-флаги (фикс нагрева) в AndroidManifest
  6) заглушка google-services.json, если проект использует плагин google-services
Запуск: python3 clean_adapt.py /tmp/mobile /путь/к/values-ru/strings.xml /путь/к/github-ru.jks
"""
import os, re, sys, glob, json, shutil

mobile = sys.argv[1]
ru_strings = sys.argv[2]
jks = sys.argv[3]

# ---------- 1) главный модуль ----------
mainmod = None
for mf in glob.glob(os.path.join(mobile, "**", "AndroidManifest.xml"), recursive=True):
    try:
        t = open(mf, encoding="utf-8", errors="ignore").read()
    except OSError:
        continue
    if "android.intent.category.LAUNCHER" in t and "/build/" not in mf:
        mainmod = os.path.dirname(os.path.dirname(os.path.dirname(mf)))
        break
if mainmod is None:
    # fallback: модуль с именем app
    cand = os.path.join(mobile, "app")
    mainmod = cand if os.path.isdir(cand) else mobile
print("Главный модуль:", mainmod)

# ---------- 2) applicationId / namespace ----------
changed = []
for g in glob.glob(os.path.join(mobile, "**", "build.gradle*"), recursive=True):
    if os.sep + ".git" + os.sep in g:
        continue
    t = open(g, encoding="utf-8", errors="ignore").read()
    t2 = re.sub(r"(applicationId\s+)['\"]com\.github\.android['\"]", r"\1'com.github.rudroid'", t)
    t2 = re.sub(r"(namespace\s+)['\"]com\.github\.android['\"]", r"\1'com.github.rudroid'", t2)
    if t2 != t:
        open(g, "w", encoding="utf-8").write(t2)
        changed.append(os.path.relpath(g, mobile))
print("applicationId/namespace изменены в:", changed or "ничего (проверить!)")

# ---------- 3) версия + подпись в главном модуле ----------
g = os.path.join(mainmod, "build.gradle")
if os.path.isfile(g):
    t = open(g, encoding="utf-8").read()
    if re.search(r"versionCode\s+\d+", t):
        t = re.sub(r"versionCode\s+\d+", "versionCode 930", t)
    elif "defaultConfig {" in t:
        t = t.replace("defaultConfig {", "defaultConfig {\n        versionCode 930", 1)
    if re.search(r"versionName\s+['\"]", t):
        t = re.sub(r"versionName\s+['\"][^'\"]*['\"]", "versionName 'ru3-clean'", t)
    elif "defaultConfig {" in t:
        t = t.replace("defaultConfig {", "defaultConfig {\n        versionName 'ru3-clean'", 1)
    if "signingConfigs" not in t:
        t = t.replace("android {", """android {
    signingConfigs {
        release {
            storeFile file('github-ru.jks')
            storePassword 'android'
            keyAlias 'github-ru'
            keyPassword 'android'
        }
    }""", 1)
        if "buildTypes {" in t:
            t = re.sub(r"(buildTypes\s*\{\n)(\s*)release\s*\{",
                       r"\1\2release {\n\2    signingConfig signingConfigs.release", t, count=1)
            if "signingConfig signingConfigs.release" not in t:
                t = t.replace("buildTypes {", "buildTypes {\n        release {\n            signingConfig signingConfigs.release\n        }", 1)
    open(g, "w", encoding="utf-8").write(t)
    print("Главный build.gradle: версия 930, подпись настроена")

shutil.copyfile(jks, os.path.join(mainmod, "github-ru.jks"))
print("Keystore скопирован ->", os.path.join(mainmod, "github-ru.jks"))

# ---------- 4) RU-перевод ----------
res_ru = os.path.join(mainmod, "src", "main", "res", "values-ru")
os.makedirs(res_ru, exist_ok=True)
shutil.copyfile(ru_strings, os.path.join(res_ru, "strings.xml"))
print("RU-перевод:", os.path.join(res_ru, "strings.xml"))

# ---------- 5) Firebase-флаги ----------
mp = os.path.join(mainmod, "src", "main", "AndroidManifest.xml")
t = open(mp, encoding="utf-8").read()
FLAGS = [
    ("firebase_messaging_auto_init_enabled", "false"),
    ("firebase_analytics_collection_deactivated", "true"),
    ("firebase_analytics_collection_enabled", "false"),
    ("google_analytics_adid_collection_enabled", "false"),
    ("firebase_crashlytics_collection_enabled", "false"),
]
ins = "".join('        <meta-data android:name="%s" android:value="%s"/>\n' % (n, v) for n, v in FLAGS)
m = re.search(r"(<application[^>]*>)", t)
if m and "firebase_messaging_auto_init_enabled" not in t:
    t = t.replace(m.group(1), m.group(1) + "\n" + ins, 1)
    open(mp, "w", encoding="utf-8").write(t)
    print("Firebase-флаги добавлены в манифест")

# ---------- 6) google-services заглушка ----------
found_gs = False
for g in glob.glob(os.path.join(mobile, "**", "build.gradle*"), recursive=True):
    if os.sep + ".git" + os.sep in g:
        continue
    t = open(g, encoding="utf-8", errors="ignore").read()
    if "com.google.gms.google-services" in t:
        found_gs = True
        js = os.path.join(os.path.dirname(g), "google-services.json")
        if not os.path.isfile(js):
            stub = {
              "project_info": {"project_number": "0", "project_id": "github-ru-stub",
                               "storage_bucket": "github-ru-stub.appspot.com"},
              "client": [{
                 "client_info": {"mobilesdk_app_id": "1:0:android:0000000000000000",
                                 "android_client_info": {"package_name": "com.github.rudroid"}},
                 "oauth_client": [],
                 "api_key": [{"current_key": "AIzaSyA000000000000000000000000000000000"}],
                 "services": {"appinvite_service": {"other_platform_oauth_client": []}}
              }],
              "configuration_version": "1"
            }
            json.dump(stub, open(js, "w", encoding="utf-8"), indent=2)
            print("Заглушка google-services.json ->", js)
print("google-services:", "используется" if found_gs else "не используется")
print("АДАПТАЦИЯ ЗАВЕРШЕНА")
