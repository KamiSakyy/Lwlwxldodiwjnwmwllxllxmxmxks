#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_round8.py — типизированные методы/перегрузки с поддержкой фреймворка.

 A) "The method N(SIG) is undefined for the type T" — добавить метод с
    ТОЧНЫМИ типами параметров (примитивы + классы дерева + android.*/java.*).
 B) "cannot convert from Object to T" на `= Q.m(args);` — типизированная
    перегрузка m с типами аргументов и возвратом T.
Резолв: импорты сайта (вкл. android/java/kotlin/javax) > пакет сайта.
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/lA.log"
ROOT = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")
FRAMEWORK = ("android", "java", "javax", "kotlin", "kotlinx")

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
imp_c = {}
def imps(fp):
    if fp not in imp_c:
        e = rd(fp)
        imp_c[fp] = set(imp_re.findall(e[0][:20000])) if e[0] else set()
    return imp_c[fp]

def fq_of(site_fp, simple):
    """полное имя простого типа: импорт (дерево ИЛИ фреймворк) > пакет сайта"""
    hits = []
    for q in imps(site_fp):
        if q.endswith("." + simple):
            p = q[: -(len(simple) + 1)]
            if simple in pkg_classes.get(p, ()) or p.split(".")[0] in FRAMEWORK:
                hits.append(q)
    if len(hits) == 1: return hits[0]
    sp = os.path.relpath(os.path.dirname(site_fp), ROOT)
    if simple in pkg_classes.get(sp, ()): return simple
    return None

def ret_stmt(r):
    if r in ("int", "long", "short", "byte"): return " return 0;"
    if r == "boolean": return " return false;"
    if r == "char": return " return '\\0';"
    if r == "float": return " return 0.0f;"
    if r == "double": return " return 0.0d;"
    return " return null;"

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")
stats = collections.Counter()
A = collections.defaultdict(set)   # file -> (meth, (paramFQ...))
B = collections.defaultdict(set)   # file -> (meth, retFQ, (paramFQ...))

def arg_types(fp, code, meth):
    ip = code.find("(")
    # ищем открывающую скобку ПОСЛЕ имени метода
    mi = code.find(meth + "(")
    if mi >= 0: ip = mi + len(meth)
    else: return None
    args, cur, depth, j = [], [], 0, ip
    while j < len(code):
        c = code[j]
        if c == "(":
            depth += 1
            if depth == 1: j += 1; continue
        elif c == ")":
            depth -= 1
            if depth == 0: break
        elif c == "," and depth == 1:
            args.append("".join(cur).strip()); cur = []
            j += 1; continue
        if depth >= 1: cur.append(c)
        j += 1
    if not args and "".join(cur).strip() == "" and not args:
        pass
    out = []
    e = rd(fp)
    src = e[0] or ""
    for av in args:
        av = av.strip()
        if re.fullmatch(r"\d+", av): out.append("int")
        elif re.fullmatch(r"\d+[Ll]", av): out.append("long")
        elif re.fullmatch(r"\d+\.\d*[fF]", av): out.append("float")
        elif re.fullmatch(r"[\d.]+[dD]?", av) and "." in av: out.append("double")
        elif av in ("true", "false"): out.append("boolean")
        elif av.startswith('"'): out.append("String")
        elif av.startswith("'"): out.append("char")
        elif av.endswith(".class"): out.append("java.lang.Class")
        elif av == "null": out.append("Object")
        else:
            am = re.search(r"\b([\w<>\[\], .?]+?)\s+%s\b\s*[=;),]" % re.escape(av), src)
            if not am: return None
            cand = am.group(1).strip().split(" ")[-1].split("<")[0]
            fq = cand if "." in cand else fq_of(fp, cand)
            if not fq: return None
            out.append(fq)
    return out

for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, code = m.group(1), m.group(3).strip()
    # A) undefined методы с типизированной сигнатурой
    for nm in re.finditer(r"The method (\w+)\(([^)]*)\) is undefined for the type ([\w.]+)", b):
        meth, sig, t = nm.groups()
        params = [p.strip() for p in sig.split(",")] if sig.strip() else []
        # точные типы: из сигнатуры сообщения (примитивы) — остальное Object
        tparams = []
        for p in params:
            if p in ("int", "boolean", "long", "char", "float", "double", "short", "byte"):
                tparams.append(p)
            elif p.endswith(".class") or re.fullmatch(r"[A-Z][\w.]*", p):
                fq = p if "." in p else fq_of(fp, p)
                tparams.append(fq or "Object")
            else:
                tparams.append("Object")
        tgt = t if "." in t else fq_of(fp, t)
        if not tgt: continue
        tfp = tgt if "." not in tgt or "/" in tgt else os.path.join(ROOT, tgt.replace(".", "/") + ".java")
        if not os.path.exists(tfp):
            if "." in tgt:
                tfp = os.path.join(ROOT, tgt.replace(".", "/") + ".java")
        if os.path.exists(tfp):
            A[tfp].add((meth, tuple(tparams)))
            stats["A-кандидаты"] += 1
    # B) Object->T на вызове
    for tm in re.finditer(r"cannot convert from Object to ([\w.]+)", b):
        T = tm.group(1)
        cm = re.search(r"=\s*([a-z][\w]*(?:\.[a-zA-Z_$]\w*)*)\.([A-Za-z_$]\w*)\(", code)
        if not cm: continue
        q, meth = cm.group(1), cm.group(2)
        sp = q.split(".")
        tgt = cls = None
        for k in range(len(sp), 0, -1):
            cand = ".".join(sp[:k])
            if cand in pkg_classes:
                tgt = cand
                if k < len(sp):
                    cls = sp[k]
                break
        if tgt is None:
            fq = fq_of(fp, sp[0])
            if fq:
                tgt, cls = fq.rsplit(".", 1)
        if not tgt or not cls: continue
        tfp = os.path.join(ROOT, tgt.replace(".", "/"), cls + ".java")
        if not os.path.exists(tfp): continue
        ptypes = arg_types(fp, code, meth)
        if not ptypes: continue
        retFQ = T if "." in T else (fq_of(fp, T) or T)
        B[tfp].add((meth, retFQ, tuple(ptypes)))
        stats["B-кандидаты"] += 1

for tfp, ms in A.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for meth, params in sorted(ms):
        have = re.findall(r"\b%s\s*\(([^)]*)\)" % re.escape(meth), s)
        have_k = {tuple(x.strip() for x in hh.split(",") if hh.strip()) for hh in have}
        if params in have_k: continue
        jparams = ", ".join("%s p%d" % (t, i2) for i2, t in enumerate(params, 1))
        add += "    public Object %s(%s) { return null; }\n" % (meth, jparams)
        stats["A-добавлено"] += 1
    if add:
        i = e[0].rstrip().rfind("}")
        e[0] = e[0][:i] + add + e[0][i:]; e[1] = True

for tfp, ms in B.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for meth, retFQ, ptypes in sorted(ms):
        key = "%s(%s)" % (meth, ",".join(ptypes))
        if key in s: continue
        jparams = ", ".join("%s p%d" % (t, i2) for i2, t in enumerate(ptypes, 1))
        add += "    public static %s %s(%s) {%s }\n" % (retFQ, meth, jparams, ret_stmt(retFQ))
        stats["B-добавлено"] += 1
    if add:
        i = e[0].rstrip().rfind("}")
        e[0] = e[0][:i] + add + e[0][i:]; e[1] = True

flush()
for k, v in sorted(stats.items()):
    print("%s: %d" % (k, v))
