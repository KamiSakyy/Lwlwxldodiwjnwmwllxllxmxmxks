#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Управление дженериками стабов (v3).
ПРОБЛЕМА: стаб с дженериком НЕПРАВИЛЬНОЙ арности (например <T1,T2,T3,T4> при
использовании `X<a>` с одним аргументом) вызывает у javac МАССОВУЮ «Object-слепоту»
(десятки тысяч «symbol: class Object» на полной компиляции — порча кэша типов).
РЕШЕНИЕ: стабы без дженериков; если код параметризует стаб (`X<...>`),
стабу возвращается дженерик ТОЧНО той арности, что в использовании.
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

# ---------- режим add: по логу ----------
lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

# индекс стабов по имени
idx = {}
for dp, _, fs in os.walk(root):
    for fn in fs:
        if fn.endswith(".java"):
            p = os.path.join(dp, fn)
            try:
                t = read(p)
            except OSError:
                continue
            if is_stub(t):
                idx.setdefault(fn[:-5], []).append(p)

def resolve(name, err_file):
    cands = idx.get(name)
    if not cands:
        return None
    d = os.path.dirname(err_file)
    for c in cands:
        if os.path.dirname(c) == d:
            return c
    return cands[0]

def generic_params(n):
    return "<" + ",".join("T%d" % (k + 1) for k in range(n)) + ">"

added = 0
seen = set()
for i, l in enumerate(lines):
    m = ERR.match(l)
    if not m or "does not take parameters" not in m.group(3):
        continue
    tm = re.search(r"type\s+([\w.$]+)\s+does not take parameters", m.group(3))
    if not tm:
        continue
    name = tm.group(1).split(".")[-1]
    err_file = m.group(1)
    code = lines[i + 1] if i + 1 < len(lines) else ""
    n = arity_of(code, name)
    key = (name, n)
    if key in seen:
        continue
    seen.add(key)
    p = resolve(name, err_file)
    if not p:
        continue
    t = read(p)
    cls_decl = re.search(r"(public\s+(?:class|interface|enum)\s+%s)\b" % re.escape(name), t)
    if not cls_decl:
        continue
    gm = re.search(r"(public\s+(?:class|interface|enum)\s+%s)\s*<[^<>]*>" % re.escape(name), t)
    if gm:
        if gm.group(0).count(",") + 1 == n:
            continue
        t2 = t[:gm.start()] + cls_decl.group(1) + generic_params(n) + t[gm.end():]
    else:
        t2 = t[:cls_decl.start()] + cls_decl.group(1) + generic_params(n) + t[cls_decl.end():]
    with open(p, "w", encoding="utf-8") as f:
        f.write(t2)
    added += 1

print(f"fix_stab_generics: дженерик правильной арности у {added} стабов (запрошено {len(seen)})")
