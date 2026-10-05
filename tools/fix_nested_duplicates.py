#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Устраняет НАТУРАЛЬНЫЕ дубликаты вложенных классов:
если в A.java объявлен вложенный class/interface/enum NAME и одновременно
существует файл A$NAME.java (jadx вынес вложенный класс в отдельный файл) —
вложенное объявление удаляется из A.java (остаётся вынесенный файл).
Запуск: python3 fix_nested_duplicates.py <java-root>
"""
import os, re, sys

root = sys.argv[1]
DECL_RX = re.compile(
    r"(\n(?:    )?(?:@\w+[^;\n]*\n)?(?:    )?(?:public\s+|protected\s+|private\s+)?(?:static\s+)?(?:final\s+|abstract\s+)*(?:class|interface|enum)\s+(\w+)\s*(?:<[^>{]*>)?(?:\s+extends\s+[\w.\s,<>\[\]]+)?(?:\s+implements\s+[\w.\s,<>\[\]]+)?\s*\{)"
)

def remove_block(src, start):
    """удалить блок {...} начиная со скобки на позиции start"""
    depth = 0
    i = start
    n = len(src)
    instr = inlc = inbc = inch = False
    while i < n:
        c = src[i]
        if inbc:
            if src[i:i+2] == "*/":
                inbc = False
                i += 2
                continue
        elif inlc:
            if c == "\n":
                inlc = False
        elif instr:
            if c == "\\":
                i += 2
                continue
            if c == '"':
                instr = False
        elif inch:
            if c == "\\":
                i += 2
                continue
            if c == "'":
                inch = False
        else:
            if src[i:i+2] == "//":
                inlc = True
            elif src[i:i+2] == "/*":
                inbc = True
                i += 1
            elif c == '"':
                instr = True
            elif c == "'":
                inch = True
            elif c == "{":
                depth += 1
            elif c == "}":
                depth -= 1
                if depth == 0:
                    return src[:start] + src[i+1:], True
        i += 1
    return src, False

# индекс: все файлы вида X$Y.java
dollar_files = set()
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if fn.endswith(".java") and "$" in fn:
            dollar_files.add(fn[:-5])  # "X$Y"

fixed = 0
checked = 0
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if not fn.endswith(".java") or "$" in fn:
            continue
        base = fn[:-5]
        p = os.path.join(dirpath, fn)
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        if " static " not in src and "\nstatic " not in src:
            continue
        nested_here = set()
        for m in DECL_RX.finditer(src):
            nested_here.add(m.group(2))
        if not nested_here:
            continue
        to_remove = sorted(n for n in nested_here if (base + "$" + n) in dollar_files)
        if not to_remove:
            continue
        checked += 1
        changed = False
        # удаляем блоки (повторно ищем, т.к. позиции смещаются)
        again = True
        while again:
            again = False
            for m in DECL_RX.finditer(src):
                name = m.group(2)
                if name in to_remove:
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

print(f"Файлов-хозяев с конфликтами: {checked}; вложенных блоков удалено: {fixed}")
