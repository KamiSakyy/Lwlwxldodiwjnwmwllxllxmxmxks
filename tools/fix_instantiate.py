#!/usr/bin/env python3
# -*- coding: utf-8 -*-
""""Cannot instantiate the type X" -> снять abstract, добавить пустой ctor.
Запуск: fix_instantiate.py <unified-log> <src-root>"""
import os, re, sys, collections
log_path, root = sys.argv[1], sys.argv[2]
idx = collections.defaultdict(list)
for dp, _, fs in os.walk(root):
    for fn in fs:
        if fn.endswith(".java"):
            idx.setdefault(fn[:-5], []).append(os.path.join(dp, fn))
fixed = skipped = 0
seen = set()
for l in open(log_path, encoding="utf-8", errors="ignore"):
    m = re.search(r"Cannot instantiate the type ([\w.$]+)", l)
    if not m:
        continue
    name = m.group(1).split(".")[-1]
    if name in seen:
        continue
    seen.add(name)
    for p in idx.get(name, []):
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        if re.search(r"@\s*interface\s+%s\b" % re.escape(name), src):
            skipped += 1
            continue
        if re.search(r"\binterface\s+%s\b" % re.escape(name), src):
            skipped += 1
            continue
        src2 = re.sub(r"(public\s+)abstract\s+(class\s+%s\b)" % re.escape(name), r"\1\2", src, count=1)
        changed = src2 != src
        if changed and ("public %s(" % name) not in src2:
            a = src2.rstrip().rfind("}")
            src2 = src2[:a] + "\n    public %s() {\n    }\n" % name + src2[a:]
        if changed:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src2)
            fixed += 1
print(f"fix_instantiate: abstract снят у {fixed}; interface-тупиков {skipped}")
