#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Определитель типа стабов по фактическим использованиям в дереве:
  - стаб используется в implements-клазулах  -> должен быть interface
  - стаб используется в extends / как "X." вstatic-вызове -> должен быть class
Один проход по всем java-файлам, голосование, применение.
Запуск: python3 kind_stubs.py <java-root>
"""
import os, re, sys

root = sys.argv[1]
IMPL_RX = re.compile(r"\bimplements\s+([^\{;]+)")
EXT_RX = re.compile(r"\bextends\s+([A-Za-z_$][\w$.]*)")
STATIC_RX = re.compile(r"(?:^|[^.\w])([A-Za-z_$][\w$]*)\s*\.\s*[A-Za-z_$][\w$]*\s*\(")

iface_votes = {}
class_votes = {}

def add(d, name):
    d[name] = d.get(name, 0) + 1

for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if not fn.endswith(".java"):
            continue
        p = os.path.join(dirpath, fn)
        try:
            src = open(p, encoding="utf-8", errors="ignore").read()
        except OSError:
            continue
        for m in IMPL_RX.finditer(src):
            for tok in m.group(1).split(","):
                t = tok.strip().split("<")[0].strip()
                if re.fullmatch(r"[A-Za-z_$]\w*", t):
                    add(iface_votes, t)
        for m in EXT_RX.finditer(src):
            t = m.group(1).split(".")[-1]
            if re.fullmatch(r"[A-Za-z_$]\w*", t):
                add(class_votes, t)

changed_i = changed_c = conflicts = 0
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if not fn.endswith(".java"):
            continue
        name = fn[:-5]
        iv = iface_votes.get(name, 0)
        cv = class_votes.get(name, 0)
        if iv == 0:
            continue
        p = os.path.join(dirpath, fn)
        try:
            src = open(p, encoding="utf-8", errors="ignore").read()
        except OSError:
            continue
        if "СТАБ" not in src:
            continue
        if cv > 0:
            conflicts += 1
            continue
        if "public class " in src:
            src2 = re.sub(r"public class %s(<[^>]*>)?\s*\{" % re.escape(name),
                          lambda mm: "public interface %s%s {" % (name, mm.group(1) or ""), src, count=1)
            src2 = re.sub(r"\n    public %s\(\) \{[^}]*\}" % re.escape(name), "", src2, count=1)
            if src2 != src:
                with open(p, "w", encoding="utf-8") as f:
                    f.write(src2)
                changed_i += 1

print(f"Стабов переведено в interface: {changed_i}; конфликтов (оба вида): {conflicts}")

# retry после сбоя раннера GitHub

# retry 3 — после восстановления песочницы

# trigger
