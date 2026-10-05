#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Точечные фиксы по javac-логу:
  1) "constructor X in class X cannot be applied" -> добавить конструктор X(Object... a)
  2) "method valueOf in class Enum<E> cannot be applied" -> добавить valueOf/values
Файл класса ищется: тот же каталог, затем глобальный индекс.
Запуск: python3 fix_from_log.py <javac-log> <java-root>
"""
import os, re, sys, collections

log_path, root = sys.argv[1], sys.argv[2]
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

print("Индексация...")
idx = collections.defaultdict(list)
for dp, _, fs in os.walk(root):
    for fn in fs:
        if fn.endswith(".java"):
            idx[fn[:-5]].append(os.path.join(dp, fn))

def class_file(name, err_file):
    cands = idx.get(name, [])
    if not cands:
        return None
    if len(cands) == 1:
        return cands[0]
    d = os.path.dirname(err_file)
    for c in cands:
        if os.path.dirname(c) == d:
            return c
    return cands[0]

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)

ctor_classes = set()
valueOf_classes = set()
for i in err_idx:
    msg = ERR.match(lines[i]).group(3)
    loc = ""
    for j in range(i + 1, min(i + 7, len(lines))):
        if j in err_set: break
        if "location:" in lines[j]: loc = lines[j].strip()
    lm = re.search(r"location:\s+class\s+(\S+)", loc)
    if "cannot be applied" in msg and msg.startswith("constructor "):
        cm = re.match(r"constructor\s+(\w+)\s+in class", msg)
        if cm and cm.group(1) != "Enum":
            ctor_classes.add(cm.group(1))
        elif cm and lm:
            ctor_classes.add(lm.group(1))
    elif msg.startswith("method valueOf in class Enum"):
        if lm:
            valueOf_classes.add(lm.group(1))

added_ctor = added_enum = 0
for name in ctor_classes:
    cf = class_file(name, root)
    if not cf:
        continue
    src = open(cf, encoding="utf-8", errors="ignore").read()
    if re.search(r"public\s+interface\s+%s\b" % re.escape(name), src):
        continue  # интерфейсам конструкторы не добавляем
    if re.search(r"%s\s*\(\s*Object\.\.\.\s*\w*\s*\)" % re.escape(name), src):
        continue
    anchor = src.rstrip().rfind("}")
    if anchor <= 0:
        continue
    src = src[:anchor] + (f"\n    public {name}(Object... a) {{\n    }}\n") + src[anchor:]
    with open(cf, "w", encoding="utf-8") as f:
        f.write(src)
    added_ctor += 1

for name in valueOf_classes:
    cf = class_file(name, root)
    if not cf:
        continue
    src = open(cf, encoding="utf-8", errors="ignore").read()
    if "valueOf(String name)" in src:
        continue
    anchor = src.rstrip().rfind("}")
    if anchor <= 0:
        continue
    src = src[:anchor] + (
        f"\n    public static {name}[] values() {{\n"
        f"        throw new UnsupportedOperationException(\"values\");\n"
        f"    }}\n"
        f"    public static {name} valueOf(String name) {{\n"
        f"        throw new UnsupportedOperationException(\"valueOf\");\n"
        f"    }}\n") + src[anchor:]
    with open(cf, "w", encoding="utf-8") as f:
        f.write(src)
    added_enum += 1

print(f"varargs-конструкторов добавлено: {added_ctor}; values/valueOf добавлено: {added_enum}")
