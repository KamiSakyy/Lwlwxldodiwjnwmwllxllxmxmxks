#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 1 — Полный анализ исходников Android-приложения.
Сканирует распакованное дерево, собирает статистику, ищет причины нагрева.
Результат: analysis/ANALYSIS.md + analysis/tree-listing.txt + analysis/stats.json
"""
import os, re, sys, json, hashlib, collections
import xml.etree.ElementTree as ET

SRC_ROOT = sys.argv[1] if len(sys.argv) > 1 else "extracted"
OUT_DIR = sys.argv[2] if len(sys.argv) > 2 else "analysis"
os.makedirs(OUT_DIR, exist_ok=True)

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"

def read_text(path, cap=2_000_000):
    try:
        with open(path, "r", encoding="utf-8", errors="ignore") as f:
            return f.read(cap)
    except Exception:
        return ""

# ---------- 1. Обход дерева ----------
all_files = []
for root, dirs, files in os.walk(SRC_ROOT):
    dirs[:] = [d for d in dirs if d not in (".git",)]
    for fn in files:
        p = os.path.join(root, fn)
        try:
            sz = os.path.getsize(p)
        except OSError:
            sz = 0
        all_files.append((os.path.relpath(p, SRC_ROOT), sz))

total_cnt = len(all_files)
total_bytes = sum(s for _, s in all_files)
by_ext = collections.Counter()
for p, s in all_files:
    e = os.path.splitext(p)[1].lower() or "(без расширения)"
    by_ext[e] += 1

java_files = [(p, s) for p, s in all_files if p.lower().endswith(".java")]
kt_files   = [(p, s) for p, s in all_files if p.lower().endswith(".kt")]
xml_files  = [(p, s) for p, s in all_files if p.lower().endswith(".xml")]

# ---------- 2. AndroidManifest ----------
manifests = [p for p, _ in all_files if os.path.basename(p) == "AndroidManifest.xml"]
manifest_info = []
for mp in manifests:
    full = os.path.join(SRC_ROOT, mp)
    txt = read_text(full)
    info = {"path": mp, "package": None, "versionName": None, "versionCode": None,
            "permissions": [], "activities": [], "services": [], "receivers": [],
            "fgs_types": None, "raw_len": len(txt)}
    try:
        t = ET.parse(full); r = t.getroot()
        info["package"] = r.get("package")
        info["versionName"] = r.get(ANDROID_NS + "versionName")
        info["versionCode"] = r.get(ANDROID_NS + "versionCode")
        for perm in r.findall("uses-permission"):
            n = perm.get(ANDROID_NS + "name")
            if n: info["permissions"].append(n)
        for tag, key in (("activity","activities"), ("service","services"), ("receiver","receivers")):
            for el in r.iter(tag):
                n = el.get(ANDROID_NS + "name")
                if n: info[key].append(n)
        for svc in r.iter("service"):
            ft = svc.get(ANDROID_NS + "foregroundServiceType")
            if ft:
                info["fgs_types"] = ft
    except Exception as e:
        info["parse_error"] = str(e)
    if not info["package"]:
        m = re.search(r'package\s*=\s*"([^"]+)"', txt)
        if m: info["package"] = m.group(1)
    manifest_info.append(info)

# ---------- 3. Gradle ----------
gradle_files = [p for p, _ in all_files if os.path.basename(p).startswith("build.gradle")
                or os.path.basename(p) == "settings.gradle"
                or os.path.basename(p) == "gradle.properties"
                or os.path.basename(p) == "gradle-wrapper.properties"]
gradle_info = {}
for gp in gradle_files:
    txt = read_text(os.path.join(SRC_ROOT, gp))
    gradle_info[gp] = txt[:4000]
    for key in ("applicationId", "namespace", "minSdk", "targetSdk", "compileSdk",
                "minSdkVersion", "targetSdkVersion", "compileSdkVersion"):
        m = re.search(key + r'\s*["\']?\s*=?\s*["\']?([A-Za-z0-9_.\-]+)', txt)
        if m and key not in gradle_info:
            gradle_info[key] = m.group(1)
m = re.search(r'com\.android\.(tools\.build:gradle|application)[^\n]*?([0-9]+\.[0-9]+[^\'"\s]*)', " ".join(gradle_info.values()))
agp = m.group(2) if m else None

# ---------- 4. Java: пакеты, обфускация, дубликаты, объём ----------
pkg_counter = collections.Counter()
class_names = []
single_letter = 0
total_java_lines = 0
hash_map = collections.defaultdict(list)
for p, _ in java_files:
    d = os.path.dirname(p)
    pkg = d.replace("/", ".")
    pkg_counter[pkg] += 1
    base = os.path.splitext(os.path.basename(p))[0]
    class_names.append(base)
    if re.fullmatch(r"[a-zA-Z]", base):
        single_letter += 1
    txt = read_text(os.path.join(SRC_ROOT, p))
    total_java_lines += txt.count("\n") + 1
    h = hashlib.md5(txt.encode("utf-8", "ignore")).hexdigest()
    hash_map[h].append(p)

dup_groups = {h: ps for h, ps in hash_map.items() if len(ps) > 1}
dup_files_total = sum(len(ps) - 1 for ps in dup_groups.values())
top_dupes = sorted(dup_groups.values(), key=len, reverse=True)[:10]

# ---------- 5. Сканер причин нагрева ----------
HEAT_PATTERNS = [
    ("WAKELOCK", r"newWakeLock|PARTIAL_WAKE_LOCK|FULL_WAKE_LOCK|SCREEN_BRIGHT_WAKE_LOCK"),
    ("Бесконечный цикл while(true)/for(;;)", r"while\s*\(\s*true\s*\)|for\s*\(\s*;\s*;\s*\)"),
    ("Thread.sleep в коде", r"Thread\.sleep\s*\("),
    ("Timer / scheduleAtFixedRate", r"new Timer\s*\(|scheduleAtFixedRate|TimerTask"),
    ("Handler.postDelayed (циклы повторов)", r"postDelayed\s*\("),
    ("Handler(Looper.getMainLooper)", r"Handler\s*\(\s*Looper"),
    ("AlarmManager (будильники)", r"AlarmManager|setExactAndAllowWhileIdle|setRepeating|setAndAllowWhileIdle"),
    ("Сенсоры registerListener", r"registerListener\s*\("),
    ("SENSOR_DELAY_FASTEST/GAME", r"SENSOR_DELAY_FASTEST|SENSOR_DELAY_GAME"),
    ("Запросы геолокации", r"requestLocationUpdates\s*\("),
    ("Вибрация", r"Vibrator|VibrationEffect|vibrate\s*\("),
    ("Медиа-плеер", r"MediaPlayer|SoundPool|ExoPlayer|startForegroundService"),
    ("Бесконечные анимации", r"setRepeatCount\s*\(\s*(ValueAnimator\.)?INFINITE|RepeatMode\.RESTART"),
    ("Choreographer (покадровый цикл)", r"Choreographer"),
    ("Потоки/пулы потоков", r"Executors?\.|newFixedThreadPool|newCachedThreadPool|new Thread\s*\("),
    ("Постоянный сервис/foreground", r"startForeground\s*\("),
    ("Показ/удержание экрана", r"FLAG_KEEP_SCREEN_ON|setTurnScreenOn|setShowWhenLocked"),
    ("Плотные циклы по UI (invalidate/postInvalidate)", r"postInvalidate\s*\(\s*\)|invalidate\s*\(\s*\)"),
    ("Радио/сканирование (Wifi/Bluetooth LE)", r"startScan\s*\(|startLeScan|BluetoothLeScanner|WifiManager"),
    ("Опрос батареи/температуры", r"BatteryManager|EXTRA_TEMPERATURE|ActionDeviceTemperature"),
]

heat_hits = {name: [] for name, _ in HEAT_PATTERNS}
heat_counts = {name: 0 for name, _ in HEAT_PATTERNS}
compiled = [(name, re.compile(rx)) for name, rx in HEAT_PATTERNS]

scan_targets = [p for p, _ in java_files] + [p for p, _ in kt_files]
for p in scan_targets:
    txt = read_text(os.path.join(SRC_ROOT, p))
    if not txt:
        continue
    for i, line in enumerate(txt.splitlines(), 1):
        for name, rx in compiled:
            if rx.search(line):
                heat_counts[name] += 1
                if len(heat_hits[name]) < 25:
                    heat_hits[name].append((p, i, line.strip()[:160]))

# Особые "красные флаги" нагрева
red_flags = []
for p in scan_targets:
    txt = read_text(os.path.join(SRC_ROOT, p))
    if not txt:
        continue
    # postDelayed с задержкой 0..15 мс -> цикл каждый кадр
    for m in re.finditer(r'postDelayed\s*\([^,]+,\s*(\d+)\s*\)', txt):
        if int(m.group(1)) <= 15:
            line = txt[:m.start()].count("\n") + 1
            red_flags.append(("postDelayed с задержкой <=15мс (гоняет CPU каждый кадр)", p, line, m.group(0)[:120]))
    for m in re.finditer(r'scheduleAtFixedRate\s*\([^,]+,\s*[^,]+,\s*(\d+)\s*\)', txt):
        if int(m.group(1)) <= 100:
            line = txt[:m.start()].count("\n") + 1
            red_flags.append(("scheduleAtFixedRate с периодом <=100мс", p, line, m.group(0)[:120]))
    # while(true) без sleep внутри (простая эвристика по 40 строкам)
    for m in re.finditer(r'while\s*\(\s*true\s*\)\s*\{', txt):
        seg = txt[m.start():m.start() + 1200]
        if "sleep" not in seg and "wait(" not in seg and "take(" not in seg and "receive" not in seg:
            line = txt[:m.start()].count("\n") + 1
            red_flags.append(("while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%", p, line, "while(true){..."))
    for m in re.finditer(r'newWakeLock\s*\(\s*[^,]+,\s*[^)]+\)\s*;?', txt):
        seg = txt[m.start():m.start() + 800]
        if "acquire(" in seg and "acquire(" not in seg.split("acquire(", 1)[1][:30] and "timeout" not in seg.lower() and "release" not in seg:
            line = txt[:m.start()].count("\n") + 1
            red_flags.append(("WakeLock acquire() без таймаута — держит CPU не засыпая", p, line, m.group(0)[:120]))

# ---------- 6. Идентификация приложения ----------
app_names = []
for p, _ in all_files:
    if os.path.basename(p) in ("strings.xml",):
        txt = read_text(os.path.join(SRC_ROOT, p), 200_000)
        for m in re.finditer(r'<string name="app_name">([^<]+)</string>', txt):
            app_names.append((p, m.group(1)))
licenses = [p for p, _ in all_files if os.path.basename(p).upper() in ("LICENSE", "LICENSE.TXT", "LICENSE.MD", "COPYING", "NOTICE")]
readmes  = [p for p, _ in all_files if os.path.basename(p).upper().startswith("README")]

# ---------- 7. Дерево (листинг) ----------
listing_lines = ["# Полный список файлов (первые 6000)", ""]
for p, s in sorted(all_files)[:6000]:
    listing_lines.append(f"{s:>10}\t{p}")
with open(os.path.join(OUT_DIR, "tree-listing.txt"), "w", encoding="utf-8") as f:
    f.write("\n".join(listing_lines))

# ---------- 8. Markdown-отчёт ----------
L = []
L.append("# ОТЧЁТ: полный анализ исходников (Этап 1)")
L.append("")
L.append(f"_Сгенерировано GitHub Actions, раннер ubuntu-latest._")
L.append("")
L.append("## 1. Общая картина")
L.append(f"- Всего файлов: **{total_cnt}**")
L.append(f"- Общий размер: **{total_bytes/1024/1024:.1f} МБ**")
L.append(f"- Java-файлов: **{len(java_files)}** (~{total_java_lines:,} строк)".replace(",", " "))
L.append(f"- Kotlin-файлов: **{len(kt_files)}**")
L.append(f"- XML-файлов: **{len(xml_files)}**")
L.append("- Расширения (топ-15):")
for e, c in by_ext.most_common(15):
    L.append(f"  - `{e}` — {c}")
L.append("")

L.append("## 2. Что за приложение")
if manifest_info:
    for mi in manifest_info[:3]:
        L.append(f"- Манифест: `{mi['path']}`")
        L.append(f"  - package: **{mi['package']}**; versionName: {mi['versionName']}; versionCode: {mi['versionCode']}")
        L.append(f"  - Activities: {len(mi['activities'])}; Services: {len(mi['services'])}; Receivers: {len(mi['receivers'])}")
        L.append(f"  - foregroundServiceType: {mi['fgs_types']}")
        if mi["permissions"]:
            L.append(f"  - Разрешения ({len(mi['permissions'])}): " + ", ".join("`"+p.split('.')[-1]+"`" for p in mi["permissions"][:25]))
else:
    L.append("- AndroidManifest.xml НЕ НАЙДЕН — возможно, это не полный проект, а только исходники.")
if app_names:
    L.append(f"- app_name: " + "; ".join(f"`{n}` ({p})" for p, n in app_names[:5]))
L.append(f"- README-файлы: {readmes[:5] if readmes else 'нет'}")
L.append(f"- LICENSE-файлы: {licenses[:5] if licenses else 'НЕТ — лицензия оригинала не приложена!'}")
L.append("")

L.append("## 3. Gradle / сборка")
if gradle_info:
    for k in ("applicationId", "namespace", "minSdk", "targetSdk", "compileSdk", "minSdkVersion", "targetSdkVersion", "compileSdkVersion"):
        if k in gradle_info:
            L.append(f"- {k}: **{gradle_info[k]}**")
    L.append(f"- AGP: {agp or 'не определён'}")
    L.append(f"- Gradle-файлы: {gradle_files}")
else:
    L.append("- Gradle-файлов нет — проект надо собирать заново (обёртка будет создана).")
L.append("")

L.append("## 4. Структура Java-кода (для реструктуризации в 10 файлов)")
L.append(f"- Уникальных классов (по именам файлов): {len(set(class_names))}")
L.append(f"- Классов с однобуквенными именами (обфускация): **{single_letter}**")
L.append(f"- Дубликатов файлов (полные копии по md5): **{dup_files_total}** в {len(dup_groups)} группах")
L.append("- Топ-30 пакетов по числу файлов:")
for pkg, c in pkg_counter.most_common(30):
    L.append(f"  - `{pkg or '(корень)'}` — {c}")
if top_dupes:
    L.append("- Самые большие группы дубликатов:")
    for g in top_dupes[:5]:
        L.append(f"  - x{len(g)}: " + ", ".join("`"+p+"`" for p in g[:4]) + (" ..." if len(g) > 4 else ""))
L.append("")

L.append("## 5. 🔥 АНАЛИЗ НАГРЕВА — где код жжёт батарею")
L.append("")
L.append("### 5.1. Красные флаги (критично)")
if red_flags:
    for kind, p, line, snip in red_flags[:60]:
        L.append(f"- **{kind}** — `{p}` строка {line}: `{snip}`")
else:
    L.append("- Явных красных флагов не найдено.")
L.append("")
L.append("### 5.2. Паттерны по категориям")
L.append("")
L.append("| Паттерн | Совпадений | Файлы (первые) |")
L.append("|---|---|---|")
for name, _ in HEAT_PATTERNS:
    files = ", ".join(f"`{p}:{ln}`" for p, ln, _ in heat_hits[name][:3])
    L.append(f"| {name} | {heat_counts[name]} | {files or '—'} |")
L.append("")
L.append("### 5.3. Детальные попадания (топ по каждому паттерну)")
for name, _ in HEAT_PATTERNS:
    if heat_counts[name]:
        L.append(f"#### {name} ({heat_counts[name]})")
        for p, ln, text in heat_hits[name][:12]:
            L.append(f"- `{p}:{ln}` — `{text}`")
L.append("")
L.append("## 6. Выводы (черновик, уточняется на Этапе 2)")
L.append("1. Причина нагрева ищется среди красных флагов выше — чаще всего это wakelock без таймаута,")
L.append("   while(true) без sleep, postDelayed с нулевой задержкой или бесконечные анимации.")
L.append("2. Реструктуризация: дубликатов — " + str(dup_files_total) + ", значит после схлопывания копий")
L.append("   и объединения пакетов реально получить компактную структуру.")
L.append("3. Лицензия оригинала: " + ("есть " + str(licenses) if licenses else "ОТСУТСТВУЕТ — обязательно добавить атрибуцию оригинала."))

with open(os.path.join(OUT_DIR, "ANALYSIS.md"), "w", encoding="utf-8") as f:
    f.write("\n".join(L))

stats = {
    "total_files": total_cnt,
    "total_bytes": total_bytes,
    "java_files": len(java_files),
    "kotlin_files": len(kt_files),
    "java_lines": total_java_lines,
    "single_letter_classes": single_letter,
    "duplicate_files": dup_files_total,
    "duplicate_groups": len(dup_groups),
    "top_packages": pkg_counter.most_common(40),
    "red_flags_count": len(red_flags),
    "heat_counts": heat_counts,
    "manifests": manifest_info,
    "app_names": app_names[:10],
    "gradle_keys": {k: v for k, v in gradle_info.items() if not k.endswith(".gradle") and not k.endswith(".properties")},
}
with open(os.path.join(OUT_DIR, "stats.json"), "w", encoding="utf-8") as f:
    json.dump(stats, f, ensure_ascii=False, indent=2)

print("ANALYSIS DONE")
print("java:", len(java_files), "dups:", dup_files_total, "red_flags:", len(red_flags))
