#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_unshadow_revert.py — откат половинчатых переименований.

Симптом: ссылки переписаны в P.XShadow, а холдер P/X.java остался "class X"
(guard rewrite_pkg_file скипнул файл, упоминавший XShadow внутри).
Лечение: для каждой пары (P,X), где холдер НЕ переименован, а в дереве есть
XShadow-ссылки — откатить ссылки к X:
  - P.XShadow -> P.X (везде)
  - import P.XShadow; -> import P.X;
  - голый XShadow в файлах пакета P -> X
  - голый XShadow в файлах, импортирующих P.(X)Shadow -> XShadow оставляем? НЕТ: -> X

Использование: python3 tools/fix_unshadow_revert.py [ecj-log]
"""
import os, re, sys, collections

ROOT = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")
LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/l8.log"

def read(fp):
    with open(fp, encoding="utf-8", errors="replace") as f:
        return f.read()

# карты
pkg_classes = collections.defaultdict(set)
files = []
for dp, _, fs in os.walk(ROOT):
    p = os.path.relpath(dp, ROOT)
    for fn in fs:
        if fn.endswith(".java"):
            pkg_classes[p].add(fn[:-5])
            files.append(os.path.join(dp, fn))
pkg_names = set()
for p in pkg_classes:
    pkg_names.update(p.split("/"))

# 1) какие XShadow-имена болят в логе
log = open(LOG, encoding="utf-8", errors="replace").read()
hurt = set(re.findall(r"\b([a-z][a-z0-9]{0,4})Shadow\b", log))
print("больные имена:", sorted(hurt))

# 2) пары (P,X): холдер с НЕпереименованным decl + X — имя пакета
revert = []   # (P, X)
for X in sorted(hurt):
    if X not in pkg_names:
        continue
    for P in list(pkg_classes):
        if X in pkg_classes[P]:
            holder = os.path.join(ROOT, P, X + ".java")
            if not os.path.exists(holder):
                continue
            head = read(holder)
            if re.search(r"\b(?:class|interface|enum)\s+%s\b" % re.escape(X), head):
                revert.append((P, X))
print("пар к откату:", len(revert), revert[:12])

# 3) откат ссылок
pairset = set(revert)
byX = collections.defaultdict(set)
for P, X in revert:
    byX[X].add(P)

import_re = re.compile(r"\bimport\s+([a-z][a-z0-9]{0,4})\.(\w+)Shadow\s*;")
qual_re = re.compile(r"\b([a-z][a-z0-9]{0,4})\.(\w{1,6}Shadow)\b")
bare_re = re.compile(r"\b([a-z][a-z0-9]{0,4})Shadow\b")

changed = 0
for fp in files:
    rel = os.path.relpath(os.path.dirname(fp), ROOT)
    text = orig = read(fp)
    # 3a. import P.XShadow; -> import P.X;
    def irep(m):
        return "import %s.%s;" % (m.group(1), m.group(2)[:-7]) if (m.group(1), m.group(2)[:-7]) in pairset else m.group(0)
    text = import_re.sub(irep, text)
    # 3b. P.XShadow -> P.X
    def qrep(m):
        nm = m.group(2)[:-7]
        return "%s.%s" % (m.group(1), nm) if (m.group(1), nm) in pairset else m.group(0)
    text = qual_re.sub(qrep, text)
    # 3c. голый XShadow: в пакете P (holder не переименован) или у импортёров P.X
    if bare_re.search(text):
        cand = set()
        for m in bare_re.finditer(text):
            X = m.group(1)
            if X not in byX:
                continue
            for P in byX[X]:
                if rel == P:
                    cand.add((P, X))
                elif re.search(r"\bimport\s+%s\.%s\s*;" % (re.escape(P), re.escape(X)), text):
                    cand.add((P, X))
        for (P, X) in cand:
            text = re.sub(r"\b%sShadow\b" % re.escape(X), X, text)
    if text != orig:
        with open(fp, "w", encoding="utf-8") as f:
            f.write(text)
        changed += 1
print("изменено файлов: %d" % changed)
