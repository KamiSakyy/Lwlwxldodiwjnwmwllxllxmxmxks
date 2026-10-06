#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_round6.py — шесть точных механизмов по ECJ-логу:
 A) this.X (blank)            -> поле в хосте-файле
 B) static call на instance   -> staticize метода в типе из "from the type X"
 C) Object->T присваивания    -> ретайп метода по консенсусу T (qualified-приёмники)
 D) blank final поля          -> снять final
 E) aa/f: import a0.s0 + name()
 F) undefined методы          -> точные типы примитивов в сигнатуре
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/l1.log"
ROOT = sys.argv[2] if len(sys.argv) > 2 else os.path.join(
    os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")

def read(fp):
    with open(fp, encoding="utf-8", errors="replace") as f:
        return f.read()
_cache = {}
def rd(fp):
    if fp not in _cache:
        try: _cache[fp] = [read(fp), False]
        except OSError: _cache[fp] = [None, False]
    return _cache[fp]
def flush():
    for fp, (s, ch) in _cache.items():
        if ch and s is not None:
            with open(fp, "w", encoding="utf-8") as f:
                f.write(s)

pkg_classes = collections.defaultdict(set)
for dp, _, fs in os.walk(ROOT):
    p = os.path.relpath(dp, ROOT)
    for fn in fs:
        if fn.endswith(".java"): pkg_classes[p].add(fn[:-5])
imp_re = re.compile(r"^\s*import\s+(?:static\s+)?([\w.]+)\s*;", re.M)
imps_cache = {}
def imports_of(fp):
    if fp not in imps_cache:
        e = rd(fp)
        imps_cache[fp] = set(imp_re.findall(e[0][:20000])) if e[0] else set()
    return imps_cache[fp]
def resolve(site_fp, simple):
    imp = []
    for q in imports_of(site_fp):
        if q.endswith("." + simple):
            p = q[: -(len(simple) + 1)]
            if simple in pkg_classes.get(p, ()): imp.append((p, simple))
    if len(imp) == 1: return imp[0]
    sp = os.path.relpath(os.path.dirname(site_fp), ROOT)
    cands = list(imp) + ([(sp, simple)] if simple in pkg_classes.get(sp, ()) else [])
    cands = list(dict.fromkeys(cands))
    return cands[0] if len(cands) == 1 else None
def file_of(pkg, name):
    fp = os.path.join(ROOT, pkg, name + ".java")
    return fp if os.path.exists(fp) else None
def ins(src, snippet):
    i = src.rstrip().rfind("}")
    return src[:i] + snippet + src[i:]

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")

stats = collections.Counter()

# ---------- C: ретайп по консенсусу ----------
ret_c = collections.defaultdict(collections.Counter)   # (file, meth) -> {T: n}
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, code = m.group(1), m.group(3)
    for tm in re.finditer(r"cannot convert from Object to (\w+)", b):
        T = tm.group(1)
        # приёмник квалифицированный Q.m( или var.m( c известным типом var
        qm = re.search(r"\b([a-z][\w]*)\.([A-Za-z_$]\w*)\(", code)
        if not qm: continue
        q, meth = qm.group(1), qm.group(2)
        tgt = None
        sp = q.split(".")
        if len(sp) == 1:
            r = resolve(fp, q)
            tgt = file_of(*r) if r else None
        elif len(sp) == 2 and sp[0] in pkg_classes and sp[1] in pkg_classes[sp[0]]:
            tgt = file_of(sp[0], sp[1])
        if tgt:
            ret_c[(tgt, meth)][T] += 1
for (tgt, meth), cnt in ret_c.items():
    if not tgt: continue
    T, n = cnt.most_common(1)[0]
    if n < 2 or len(cnt) > 1: continue      # консенсус
    if T in ("Object", "String") : continue
    e = rd(tgt)
    if e[0] is None: continue
    ret = {"int": "int", "boolean": "boolean", "long": "long", "char": "char",
           "float": "float", "double": "double", "short": "short", "byte": "byte",
           "StringBuilder": "StringBuilder"}.get(T, T)
    s = e[0]
    s2 = re.sub(r"(public static )Object( %s\()" % re.escape(meth),
                r"\g<1>%s\g<2>" % ret, s, count=1)
    if s2 == s:
        s2 = re.sub(r"(public )Object( %s\()" % re.escape(meth),
                    r"\g<1>%s\g<2>" % ret, s, count=1)
    if s2 != s:
        e[0] = s2; e[1] = True; stats["C-ретайп"] += 1

# ---------- A: this.X поля + B: staticize + D: blank final + F: типизированные ----------
this_f = collections.defaultdict(set)     # host file -> {имя}
stat_m = collections.defaultdict(set)     # (file, meth)
und_m = collections.defaultdict(set)      # file -> {(meth, [типы])}
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, code = m.group(1), m.group(3)
    # A) this.X cannot be resolved or is not a field
    am = re.search(r"The field (\w+) is not visible|cannot be resolved or is not a field", b)
    tm2 = re.search(r"\bthis\.(\w+)\b", code)
    if am and tm2 and "is not a field" in b:
        fld = None
        fm2 = re.search(r"(\w+) cannot be resolved or is not a field", b)
        if fm2 and tm2.group(1) == fm2.group(1):
            this_f[fp].add(fm2.group(1))
    # B) Cannot make a static reference to the non-static method M(
    for sm in re.finditer(r"Cannot make a static reference to the non-static method (\w+)\(.*?from the type ([\w.]+)", b):
        meth, t = sm.groups()
        r = resolve(fp, t.split(".")[-1]) if "." not in t else None
        if r is None and "." in t:
            sp = t.split(".")
            if len(sp) == 2 and sp[0] in pkg_classes and sp[1] in pkg_classes[sp[0]]:
                r = (sp[0], sp[1])
        if r:
            f = file_of(*r)
            if f: stat_m[(f, meth)].add(1)
    # F) The method N(sig) is undefined for the type T -> типизированные парамы
    for nm in re.finditer(r"The method (\w+)\(([^)]*)\) is undefined for the type ([\w.]+)", b):
        meth, sig, t = nm.groups()
        r = resolve(fp, t.split(".")[-1])
        if r:
            f = file_of(*r)
            if f:
                params = [p.strip() for p in sig.split(",")] if sig.strip() else []
                und_m[f].add((meth, tuple(params)))

# A
for fp, flds in this_f.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for fld in sorted(flds):
        if not re.search(r"\b%s\s*[;=]" % re.escape(fld), s):
            add += "    public Object %s = null;\n" % fld
            stats["A-this-поле"] += 1
    if add:
        e[0] = ins(e[0], add); e[1] = True

# B
for (f, meth) in stat_m:
    e = rd(f)
    if e[0] is None: continue
    s = e[0]
    cls = os.path.basename(f)[:-5]
    s2 = re.sub(r"((?:public|protected|private)\s+)(?!static)([\w<>\[\], .?]+\s+)?%s\s*\(" % re.escape(meth),
                lambda mm: "%sstatic %s%s(" % (mm.group(1), mm.group(2) or "", meth)
                if (mm.group(2) or "").split()[-1].split("<")[0] != cls else mm.group(0),
                s, count=1)
    if s2 != s:
        e[0] = s2; e[1] = True; stats["B-staticize"] += 1

# D) blank final
n = 0
for fp in list(_cache) or []:
    pass
for dp, _, fs in os.walk(ROOT):
    for fn in fs:
        if not fn.endswith(".java"): continue
        fp = os.path.join(dp, fn)
        e = rd(fp)
        if e[0] is None: continue
        s = e[0]
        if "final" not in s: continue
        s2 = re.sub(r"(public final [^\n=;]+?\s\w+)(;)" , r"\1\2".replace(r"\1\2", lambda mm: mm.group(1).replace("final ", "") + ";"), s) if False else s
        # построчно: public final T X; без '=' -> снять final
        out = []
        ch = False
        for line in s.splitlines(keepends=True):
            lm = re.match(r"^(\s*(?:public|protected|private) )final ([\w<>\[\], .?]+\s\w+)\s*;\s*$", line.rstrip("\n"))
            if lm:
                out.append(lm.group(1) + lm.group(2) + ";\n"); ch = True
            else:
                out.append(line)
        if ch:
            e[0] = "".join(out); e[1] = True; n += 1
stats["D-final"] = n

# E) aa/f: import a0.s0 + name()
fp = file_of("aa", "f")
if fp:
    e = rd(fp)
    s = e[0]
    if s and "import a0.s0;" not in s:
        s = s.replace("package aa;\n", "package aa;\n\nimport a0.s0;", 1)
        e[0] = s; e[1] = True; stats["E-import"] += 1
fp = file_of("a0", "s0")
if fp:
    e = rd(fp)
    s = e[0]
    if s and "String name()" not in s:
        e[0] = ins(s, "    public String name() { return \"\"; }\n"); e[1] = True; stats["E-name"] += 1

# F) типизированные добавки
for f, ms in und_m.items():
    e = rd(f)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for meth, params in sorted(ms):
        have = re.findall(r"\b%s\s*\(([^)]*)\)" % re.escape(meth), s)
        have_k = {tuple(x.strip() for x in hh.split(",") if hh.strip()) for hh in have}
        if params in have_k: continue
        jparams = []
        for p in params:
            if p in ("int", "boolean", "long", "char", "float", "double", "short", "byte"):
                jparams.append(p)
            else:
                jparams.append("Object")
        add += "    public Object %s(%s) { return null; }\n" % (meth, ", ".join(jparams))
        stats["F-метод"] += 1
    if add:
        e[0] = ins(e[0], add); e[1] = True

flush()
for k, v in stats.most_common():
    print("%s: %d" % (k, v))
