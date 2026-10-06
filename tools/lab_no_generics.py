#!/usr/bin/env python3
"""Копирует дерево java в /tmp/s_var, вырезая <T1,T2,T3,T4> у стаб-файлов.
Использование: lab_no_generics.py <java-src> <out-dir> <sources.txt> <out-sources.txt>"""
import os, sys

src, dst, srcs, out_srcs = sys.argv[1], sys.argv[2], sys.argv[3], sys.argv[4]
n = 0
os.makedirs(dst, exist_ok=True)
with open(srcs) as f:
    lines = [l.strip() for l in f if l.strip()]
for rel in lines:
    base = os.path.relpath(rel, src)
    out = os.path.join(dst, base)
    os.makedirs(os.path.dirname(out), exist_ok=True)
    with open(rel, encoding="utf-8", errors="ignore") as fh:
        t = fh.read()
    if "СТАБ-" in t or "[restore]" in t:
        t2 = t.replace("<T1,T2,T3,T4>", "")
        if t2 != t:
            n += 1
        t = t2
    with open(out, "w", encoding="utf-8") as fh:
        fh.write(t)
with open(out_srcs, "w") as f:
    f.write("\n".join(os.path.join(dst, os.path.relpath(r, src)) for r in lines) + "\n")
print("стабов с вырезанными дженериками:", n)
