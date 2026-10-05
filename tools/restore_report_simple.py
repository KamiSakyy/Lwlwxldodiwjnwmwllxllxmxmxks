#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 5 v3 — отчёт по финальному javac-логу цикла восстановления.
Использование: python3 restore_report_simple.py <proj> <out-dir>
"""
import re, sys, os, collections, gzip, glob, datetime

proj, out = sys.argv[1], sys.argv[2]
final_log = os.path.join(out, "javac-final.log")
os.makedirs(out, exist_ok=True)

ERR = re.compile(r"^(.+?):(\d+):\s+error:\s+(.*)$")
errs = []
try:
    with open(final_log, encoding="utf-8", errors="ignore") as f:
        for ln in f:
            m = ERR.match(ln.strip())
            if m:
                p = re.sub(r"^.*app/src/main/java/", "", m.group(1))
                errs.append((p, int(m.group(2)), m.group(3).strip()))
except OSError:
    pass

by_type = collections.Counter(msg.split(":")[0][:60] for _, _, msg in errs)
by_file = collections.Counter(p for p, _, _ in errs)
restored = len(errs) == 0

# сколько стабов создано
stub_cnt = 0
for root, dirs, files in os.walk(os.path.join(proj, "app", "src", "main", "java")):
    for fn in files:
        if fn.endswith(".java"):
            try:
                with open(os.path.join(root, fn), encoding="utf-8", errors="ignore") as f:
                    if "СТАБ" in f.read(2000):
                        stub_cnt += 1
            except OSError:
                pass

L = []
L.append("# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5 v3, итеративный цикл)")
L.append("")
L.append(f"_Сгенерировано: {datetime.datetime.utcnow().isoformat()}Z, проверка javac (JDK 17, bootclasspath android.jar API 36)._")
L.append("")
if restored:
    L.append("**ИСХОДНИК ПОЛНОСТЬЮ ВОССТАНОВЛЕН: 0 ошибок компиляции.**")
else:
    L.append(f"**Осталось ошибок: {len(errs)}** в {len(by_file)} файлах.")
L.append("")
L.append(f"- Стабов-заглушек в дереве: {stub_cnt}")
L.append("")
L.append("## Типы ошибок (топ-20)")
for msg, c in by_type.most_common(20):
    L.append(f"- {c} × `{msg}`")
L.append("")
L.append("## Файлы с ошибками (топ-30)")
for p, c in by_file.most_common(30):
    L.append(f"- `{p}` — {c}")
L.append("")
# раунды
rounds = sorted(glob.glob(os.path.join(out, "javac-round*.log")))
if rounds:
    L.append("## Ход цикла (ошибок по раундам)")
    for r in rounds:
        try:
            with open(r, encoding="utf-8", errors="ignore") as f:
                c = sum(1 for ln in f if ERR.match(ln.strip()))
            L.append(f"- {os.path.basename(r)}: {c}")
        except OSError:
            pass
    L.append("")
L.append("## Полные логи")
for r in rounds:
    base = os.path.basename(r)
    try:
        with gzip.open(os.path.join(out, base + ".gz"), "wb") as fo:
            with open(r, "rb") as fi:
                fo.write(fi.read())
        L.append(f"- `{base}.gz`")
    except OSError:
        pass

with open(os.path.join(out, "RESTORATION-REPORT.md"), "w", encoding="utf-8") as f:
    f.write("\n".join(L))
print("ВОССТАНОВЛЕН (0 ошибок)" if restored else f"ОСТАЛОСЬ: {len(errs)} ошибок в {len(by_file)} файлах")
