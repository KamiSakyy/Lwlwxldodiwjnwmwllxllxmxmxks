#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Управление дженериками стабов.
ПРОБЛЕМА: сотни стабов с <T1,T2,T3,T4> вызывают массовую «Object-слепоту» javac
(48782 ошибок «symbol: class Object» на полной компиляции).
РЕШЕНИЕ: по умолчанию стабы БЕЗ дженериков; дженерики возвращаются ТОЛЬКО стабам,
которые javac просит параметризовать («does not take parameters» / «wrong number
of type arguments; required 4» в логе).
Запуск: fix_stab_generics.py <javac-log или -> <java-root> [--remove-all]
  без --remove-all: добавляет дженерики стабам из лога.
  с --remove-all:   сносит <T1,T2,T3,T4> у всех стабов (идемпотентно).
"""
import os, re, sys

log_path, root = sys.argv[1], sys.argv[2]
remove_all = "--remove-all" in sys.argv
SRC_MARK = "app/src/main/java/"
GEN = "<T1,T2,T3,T4>"

def iter_stub_files():
    for dp, _, fs in os.walk(root):
        for fn in fs:
            if fn.endswith(".java"):
                p = os.path.join(dp, fn)
                try:
                    with open(p, encoding="utf-8", errors="ignore") as f:
                        t = f.read()
                except OSError:
                    continue
                if "СТАБ-" in t or "[restore]" in t:
                    yield p, t

def cls_name(path):
    return os.path.basename(path)[:-5]

if remove_all:
    n = 0
    for p, t in iter_stub_files():
        t2 = t.replace(GEN, "")
        if t2 != t:
            with open(p, "w", encoding="utf-8") as f:
                f.write(t2)
            n += 1
    print(f"fix_stab_generics: дженерики снесены у {n} стабов")
    sys.exit(0)

# --- режим add: по логу ---
lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")
need = set()  # имена классов-стабов, требующие дженериков
for i, l in enumerate(lines):
    m = ERR.match(l)
    if not m:
        continue
    msg = m.group(3)
    if "does not take parameters" in msg:
        tm = re.search(r"type\s+([\w.$]+)\s+does not take parameters", msg)
        if tm:
            need.add(tm.group(1).split(".")[-1])
    elif "wrong number of type arguments" in msg:
        # required N — восстанавливаем параметризацию цели в коде (каретка)
        block = "\n".join(lines[i + 1:i + 7])
        lm = re.search(r"required:\s*(\d+)", block)
        if lm and lm.group(1) == "4":
            tok = None
            if i + 2 < len(lines):
                col = lines[i + 2].find("^")
                codeline = lines[i + 1]
                for mt in re.finditer(r"[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*", codeline):
                    if mt.start() <= col < mt.end():
                        tok = mt.group(0)
                        break
                if tok is None:
                    for mt in reversed(list(re.finditer(r"[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*", codeline[:col + 1]))):
                        tok = mt.group(0)
                        break
            if tok:
                need.add(tok.split(".")[-1])

# индекс имён стабов
idx = {}
for p, t in iter_stub_files():
    idx.setdefault(cls_name(p), []).append((p, t))

added = skipped = 0
for name in sorted(need):
    cands = idx.get(name)
    if not cands:
        skipped += 1
        continue
    p, t = cands[0]
    if GEN in t:
        continue
    t2, cnt = re.subn(r"(public\s+(?:class|interface|enum)\s+%s)\b" % re.escape(name), r"\1" + GEN, t, count=1)
    if cnt:
        with open(p, "w", encoding="utf-8") as f:
            f.write(t2)
        added += 1

print(f"fix_stab_generics: дженерики возвращены {added} стабам (не найдено: {skipped}; запрошено: {len(need)})")
