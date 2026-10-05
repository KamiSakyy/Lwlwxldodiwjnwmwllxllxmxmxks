#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Устраняет дубликаты вложенных классов в ФОРМАТЕ КАТАЛОГОВ (jadx):
если в A.java объявлен вложенный class NAME и существует A/NAME.java
(папка с именем хозяина) — вложенное объявление удаляется из A.java.
Запуск: python3 fix_nested_duplicates.py <java-root>
"""
import os, re, sys

root = sys.argv[1]
DECL_RX = re.compile(
    r"(\n(?:    )?(?:@\w+[^;\n]*\n)?(?:    )?(?:public\s+|protected\s+|private\s+)?(?:static\s+)?(?:final\s+|abstract\s+|synthetic\s+)*(?:class|interface|enum)\s+(\w+)\s*(?:<[^>{]*>)?(?:\s+extends\s+[\w.\s,<>\[\]]+)?(?:\s+implements\s+[\w.\s,<>\[\]]+)?\s*\{)"
)

def remove_block(src, start):
    depth = 0
    i = start
    n = len(src)
    instr = inlc = inbc = inch = False
    while i < n:
        c = src[i]
        if inbc:
            if src[i:i+2] == "*/":
                inbc = False; i += 2; continue
        elif inlc:
            if c == "\n": inlc = False
        elif instr:
            if c == "\\": i += 2; continue
            if c == '"': instr = False
        elif inch:
            if c == "\\": i += 2; continue
            if c == "'": inch = False
        else:
            if src[i:i+2] == "//": inlc = True
            elif src[i:i+2] == "/*": inbc = True; i += 1
            elif c == '"': instr = True
            elif c == "'": inch = True
            elif c == "{": depth += 1
            elif c == "}":
                depth -= 1
                if depth == 0:
                    return src[:start] + src[i+1:], True
        i += 1
    return src, False

fixed = 0
hosts = 0
for dirpath, dirs, files in os.walk(root):
    base_dir = os.path.basename(dirpath)
    if not files:
        continue
    for fn in files:
        if not fn.endswith(".java"):
            continue
        base = fn[:-5]
        p = os.path.join(dirpath, fn)
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        # какие вложенные классы объявлены
        names = set(m.group(2) for m in DECL_RX.finditer(src))
        if not names:
            continue
        # формат каталогов: папка с именем хозяина содержит файлы NAME.java
        cat = os.path.join(dirpath, base)
        to_remove = sorted(n for n in names if os.path.isfile(os.path.join(cat, n + ".java")))
        if not to_remove:
            continue
        hosts += 1
        changed = False
        again = True
        while again:
            again = False
            for m in DECL_RX.finditer(src):
                if m.group(2) in to_remove:
                    brace = src.find("{", m.end() - 1)
                    if brace < 0:
                        continue
                    src, ok = remove_block(src, brace)
                    if ok:
                        fixed += 1
                        changed = True
                        again = True
                        break
        if changed:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src)

print(f"Хозяев с каталог-дубликатами: {hosts}; вложенных объявлений удалено: {fixed}")
