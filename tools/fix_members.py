#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""fix_members v5: потерянные методы/поля, резолв СТРОГО по qualified-именам.
 A) "The method M(...) is undefined for the type T":
    1) qualified-вызов Q.M( в коде (>=2 точки) -> в Q.java
    2) T qualified -> T.java
    3) T простое и ровно ОДИН файл T.java
    В interface -> default-метод; в @interface -> пропуск.
 B) "X cannot be resolved or is not a field":
    case Q.X -> public static final int X = 0; в Q.java
    QUAL.fld (>=2 точки) -> public static [Type] fld; (тип из присваивания)
    this.fld -> public Object fld; в класс файла-жертвы
 Запуск: fix_members.py <unified-log> <src-root>
"""
import os, re, sys, collections, atexit

log_path, root = sys.argv[1], sys.argv[2]
SRC_MARK = "app/src/main/java/"

idx = collections.defaultdict(list)
for dp, _, fs in os.walk(root):
    for fn in fs:
        if fn.endswith(".java"):
            idx.setdefault(fn[:-5], []).append(os.path.join(dp, fn))

_cache = {}
def get(p):
    if p not in _cache:
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                _cache[p] = [f.read(), False]
        except OSError:
            _cache[p] = [None, False]
    return _cache[p]

@atexit.register
def flush():
    for p, (src, ch) in _cache.items():
        if ch and src is not None:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src)

def qpath(q):
    p = os.path.join(root, q.replace(".", "/") + ".java")
    return p if os.path.isfile(p) else None

def kind_of(p):
    src = get(p)[0]
    if src is None:
        return "gone"
    name = os.path.basename(p)[:-5]
    if re.search(r"@\s*interface\s+%s\b" % re.escape(name), src[:6000]):
        return "annotation"
    if re.search(r"\binterface\s+%s\b" % re.escape(name), src[:6000]):
        return "interface"
    return "class"

def insert(p, snippet):
    e = get(p)
    src = e[0]
    if src is None or snippet.strip() in src:
        return False
    a = src.rstrip().rfind("}")
    if a <= 0:
        return False
    e[0] = src[:a] + "\n" + snippet + src[a:]
    e[1] = True
    return True

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")
nm = nf = nc = 0
done = set()

for i, l in enumerate(lines):
    m = ERR.match(l)
    if not m:
        continue
    path, lno, msg = m.group(1), int(m.group(2)), m.group(3)
    if SRC_MARK not in path:
        continue
    code = lines[i + 1] if i + 1 < len(lines) else ""

    mm = re.match(r"The method (\w+)\(.*?\) is undefined for the type ([\w.$]+)", msg)
    if mm:
        meth, tname = mm.group(1), mm.group(2)
        key = ("M", meth, re.sub(r"\s+", " ", code.strip())[:80])
        if key in done:
            continue
        done.add(key)
        targets = []
        qm = re.search(r"((?:\w+\.){2,})%s\s*\(" % re.escape(meth), code)
        if qm:
            p = qpath(qm.group(1).rstrip("."))
            if p:
                targets = [p]
        if not targets and "." in tname:
            p = qpath(tname)
            if p:
                targets = [p]
        if not targets and "." not in tname and tname != "Object":
            c = idx.get(tname, [])
            if len(c) == 1:
                targets = c
        for tp in targets:
            k = kind_of(tp)
            if k == "annotation":
                continue
            snip = ("    default <T0> T0 %s(Object... a) {\n        return null;\n    }\n" % meth) if k == "interface" \
                else ("    public <T0> T0 %s(Object... a) {\n        return null;\n    }\n" % meth)
            if insert(tp, snip):
                nm += 1
        continue

    fm = re.match(r"([\w$]+) cannot be resolved or is not a field", msg)
    if fm:
        fld = fm.group(1)
        if re.search(r"case\s+[\w.]", code):
            cm = re.search(r"case\s+((?:\w+\.)*\w+)\.(\w+)", code)
            if cm:
                p = qpath(cm.group(1))
                if p and kind_of(p) == "class":
                    if insert(p, "    public static final int %s = 0;\n" % fld):
                        nc += 1
            continue
        qm = re.search(r"((?:\w+\.){2,})%s\b" % re.escape(fld), code)
        if qm:
            p = qpath(qm.group(1).rstrip("."))
            if p and kind_of(p) == "class":
                ftm = re.search(r"([\w.$]+)(?:<[^=<>]*>)?\s+\w+\s*=\s*[\w.]*\b%s\s*;" % re.escape(fld), code)
                ftype = None
                if ftm and ftm.group(1) not in ("int", "long", "boolean", "char", "byte", "short", "float", "double", "var") and qpath(ftm.group(1)):
                    ftype = ftm.group(1)
                snip = ("    public static %s %s;\n" % (ftype, fld)) if ftype else ("    public static Object %s;\n" % fld)
                if insert(p, snip):
                    nf += 1
            continue
        if re.search(r"\bthis\.%s\b" % re.escape(fld), code):
            if insert(path, "    public Object %s;\n" % fld):
                nf += 1
        continue

print(f"fix_members v5: методов +{nm}, полей +{nf}, констант +{nc}")
