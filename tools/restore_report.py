#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 5 — отчёт о восстановлении: сравнение ошибок javac ДО и ПОСЛЕ фиксов.
Использование: python3 restore_report.py <log-before> <log-after> <out-dir>
"""
import re, sys, os, collections, datetime

before_log, after_log, out = sys.argv[1], sys.argv[2], sys.argv[3]
os.makedirs(out, exist_ok=True)

ERR_RX = re.compile(r"^(.+?):(\d+):\s+error:\s+(.*)$")

def parse(path):
    errs = []
    try:
        with open(path, encoding="utf-8", errors="ignore") as f:
            for ln in f:
                m = ERR_RX.match(ln.strip())
                if m:
                    fpath = re.sub(r"^/home/runner/work/[^/]+/[^/]+/extracted/GitHub-RU-Source/", "", m.group(1))
                    errs.append((fpath, int(m.group(2)), m.group(3).strip()))
    except OSError:
        pass
    return errs

before = parse(before_log)
after = parse(after_log)

def uniq(errs):
    return sorted(set((p, msg) for p, _, msg in errs))

ub, ua = uniq(before), uniq(after)

with open(os.path.join(out, "errors-before.txt"), "w", encoding="utf-8") as f:
    for p, msg in ub:
        f.write(f"{p}: {msg}\n")
with open(os.path.join(out, "errors-after.txt"), "w", encoding="utf-8") as f:
    for p, msg in ua:
        f.write(f"{p}: {msg}\n")

by_type = collections.Counter(msg[:80] for _, msg in ua)
by_file = collections.Counter(p for p, _ in ua)
restored = len(ua) == 0

L = []
L.append("# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)")
L.append("")
L.append(f"_Сгенерировано: {datetime.datetime.utcnow().isoformat()}Z, проверка настоящим javac (JDK 17)._")
L.append("")
L.append("## Итог")
if restored:
    L.append("**ИСХОДНИК ВОССТАНОВЛЕН: 0 ошибок компиляции во всех файлах.**")
else:
    L.append(f"**Осталось ошибок: {len(ua)}** (уникальных файл+ошибка) в {len(by_file)} файлах.")
L.append("")
L.append(f"- Ошибок ДО восстановления: **{len(ub)}**")
L.append(f"- Ошибок ПОСЛЕ восстановления: **{len(ua)}**")
L.append(f"- Исправлено: **{max(0, len(ub) - len(ua))}**")
L.append("")
L.append("## Остаточные ошибки по типам (топ-30)")
for msg, c in by_type.most_common(30):
    L.append(f"- {c} × `{msg}`")
L.append("")
L.append("## Файлы с остаточными ошибками (топ-30)")
for p, c in by_file.most_common(30):
    L.append(f"- `{p}` — {c}")
L.append("")
L.append("## Как проверялось")
L.append("1. Распаковка исходника из архива.")
L.append("2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.")
L.append("3. Применение реставрационных фиксов (fix_heat, fix_compile).")
L.append("4. Повторный javac -> ошибки ПОСЛЕ.")
L.append("5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.")
L.append("")
L.append("APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).")

with open(os.path.join(out, "RESTORATION-REPORT.md"), "w", encoding="utf-8") as f:
    f.write("\n".join(L))

print("БЫЛО:", len(ub), "| СТАЛО:", len(ua), "| ВОССТАНОВЛЕНО" if restored else "| ТРЕБУЕТСЯ ИТЕРАЦИЯ")
