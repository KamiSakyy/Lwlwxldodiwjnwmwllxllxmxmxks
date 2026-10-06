#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Управление дженериками стабов (v3).
ПРОБЛЕМА: дженерик-стаб ЛЮБОЙ арности вызывает у javac массовую «Object-слепоту»
(десятки тысяч «symbol: class Object» на полной компиляции — порча кэша типов).
РЕШЕНИЕ: стабы ВСЕГДА без дженериков (remove-all на подготовке);
если код параметризует стаб (`X<...>` = «does not take parameters»),
вырезаем `<...>` ИЗ ИСПОЛЬЗОВАНИЯ в файле-жертве (raw-тип: компилируется).
Запуск: fix_stab_generics.py <javac-log|-> <java-root> [--remove-all]
"""
import os, re, sys

log_path, root = sys.argv[1], sys.argv[2]
remove_all = "--remove-all" in sys.argv
SRC_MARK = "app/src/main/java/"

def is_stub(t):
    return "СТАБ-" in t or "[restore]" in t

def read(p):
    with open(p, encoding="utf-8", errors="ignore") as f:
        return f.read()

def arity_of(usage_line, name):
    """сколько аргументов в `<...>` сразу после name (или qualified name.послед)"""
    for m in re.finditer(r"(?:[A-Za-z_$][\w$]*\.)*" + re.escape(name) + r"\s*<", usage_line):
        i = m.end()
        depth, n, cur = 1, 1, 0
        while i < len(usage_line) and depth:
            c = usage_line[i]
            if c == "<":
                depth += 1
            elif c == ">":
                depth -= 1
            elif c == "," and depth == 1:
                n += 1
            i += 1
        return n
    return 1

if remove_all:
    n = 0
    for dp, _, fs in os.walk(root):
        for fn in fs:
            if not fn.endswith(".java"):
                continue
            p = os.path.join(dp, fn)
            try:
                t = read(p)
            except OSError:
                continue
            if not is_stub(t) or "<T" not in t:
                continue
            t2 = re.sub(r"(public\s+(?:class|interface|enum)\s+%s)\s*<[^<>]*>" % re.escape(fn[:-5]), r"\1", t, count=1)
            if t2 != t:
                with open(p, "w", encoding="utf-8") as f:
                    f.write(t2)
                n += 1
    print(f"fix_stab_generics: дженерики снесены у {n} стабов")
    sys.exit(0)

# ---------- режим strip-usage: по логу ----------
lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

stripped = 0
seen = set()
for i, l in enumerate(lines):
    m = ERR.match(l)
    if not m or "does not take parameters" not in m.group(3):
        continue
    rel = m.group(1)
    j = rel.find(SRC_MARK)
    if j < 0:
        continue
    p = rel[j:]
    if p in seen or not os.path.isfile(p):
        continue
    lno = int(m.group(2))
    try:
        src_lines = open(p, encoding="utf-8", errors="ignore").read().split("\n")
    except OSError:
        continue
    if lno - 1 >= len(src_lines):
        continue
    code = src_lines[lno - 1]
    tm = re.search(r"type\s+([\w.$]+)\s+does not take parameters", m.group(3))
    if not tm:
        continue
    simple = tm.group(1).split(".")[-1]
    # найти `<` после вхождения имени в код-строке и вырезать парный блок
    changed = False
    for m2 in re.finditer(r"(?:[A-Za-z_$][\w$]*\.)*" + re.escape(simple) + r"\s*<", code):
        k = m2.end()
        depth = 1
        while k < len(code) and depth:
            if code[k] == "<":
                depth += 1
            elif code[k] == ">":
                depth -= 1
            k += 1
        if depth == 0:
            code2 = code[:m2.end() - 1] + code[k:]
            if code2 != code:
                src_lines[lno - 1] = code2
                with open(p, "w", encoding="utf-8") as f:
                    f.write("\n".join(src_lines))
                stripped += 1
                changed = True
                seen.add(p)
            break
print(f"fix_stab_generics: type-args вырезаны в {stripped} использованиях ({len(seen)} файлов)")
