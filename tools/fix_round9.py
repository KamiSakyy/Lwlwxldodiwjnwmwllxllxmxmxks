#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_round9.py — шаг 6.8:
 A) "Cannot invoke X.m(..) on the primitive type P" — локальная переменная X
    затеняет класс X: scope-aware переименование переменной в методе.
 B) "The constructor C(A1, A2...) is undefined" — синтез конструктора с точными
    типами (this -> хозяин файла; примитивы; импорты; иначе Object).
 C) "The method ordinal() is undefined for the type T" + "T.CONST cannot be
    resolved" — enum-стаб: добор статических констант + ordinal().
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/lR.log"
ROOT = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")
FRAMEWORK = ("android", "java", "javax", "kotlin", "kotlinx")

_cache = {}
def rd(fp):
    if fp not in _cache:
        try: _cache[fp] = [open(fp, encoding="utf-8", errors="replace").read(), False]
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
def fq_of(fp, simple):
    hits = [q for q in imps(fp) if q.endswith("." + simple) and
            (simple in pkg_classes.get(q[: -(len(simple) + 1)], ()) or
             q.split(".")[0] in FRAMEWORK)]
    if len(hits) == 1: return hits[0]
    sp = os.path.relpath(os.path.dirname(fp), ROOT)
    if simple in pkg_classes.get(sp, ()): return simple
    return None
def file_of_q(q):
    fp = os.path.join(ROOT, q.replace(".", "/") + ".java")
    return fp if os.path.exists(fp) else None

def method_spans(s):
    spans = []
    for m in re.finditer(r"\n(\s*)(?:@\w+(?:\([^)]*\))?\s+)*(?:public|protected|private|static|final|synchronized|abstract|native)[^\n;{}]*?\)\s*(?:throws\s+[\w, .]+)?\s*\{", s):
        spans.append((m.group(1), m.end() - 1))
    out = []
    for indent, ob in spans:
        depth = 0; j = ob
        while j < len(s):
            if s[j] == "{": depth += 1
            elif s[j] == "}":
                depth -= 1
                if depth == 0: break
            j += 1
        out.append((indent, ob, j))
    return out

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")
stats = collections.Counter()

A = collections.defaultdict(set)          # file -> {(var, тип_примитива)}
B = collections.defaultdict(set)          # file -> {(класс, (типы аргументов))}
C = collections.defaultdict(set)          # file -> {(тип, [константы])}

for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, code = m.group(1), m.group(3).strip()
    # A) примитивный приёмник
    for am in re.finditer(r"Cannot invoke (\w+)\([^)]*\) on the primitive type (\w+)", b):
        A[fp].add((am.group(1), am.group(2)))
        stats["A-кандидаты"] += 1
    # B) конструкторы
    for cm in re.finditer(r"The constructor ([\w.]+)\(([^)]*)\) is undefined", b):
        cls, sig = cm.groups()
        params = [p.strip() for p in sig.split(",")] if sig.strip() else []
        if cls.startswith("Object"): continue
        fq = cls if "." in cls else fq_of(fp, cls)
        if not fq: continue
        tfp = file_of_q(fq)
        if not tfp: continue
        ttypes = []
        ok = True
        host_fq = None
        for av in params:
            if av in ("int", "boolean", "long", "char", "float", "double", "short", "byte"):
                ttypes.append(av)
            elif av == "Object":
                ttypes.append("Object")
            elif av == "null":
                ttypes.append("Object")
            elif av == "String":
                ttypes.append("String")
            elif av == "this":
                if host_fq is None:
                    pkg = os.path.relpath(os.path.dirname(fp), ROOT)
                    host_fq = (pkg + "." + os.path.basename(fp)[:-5]) if pkg != "." else os.path.basename(fp)[:-5]
                ttypes.append(host_fq)
            elif re.fullmatch(r"[A-Z][\w.]*", av):
                t = av if "." in av else fq_of(fp, av)
                ttypes.append(t or "Object")
            else:
                ttypes.append("Object")
        B[tfp].add((fq.split(".")[-1], tuple(ttypes)))
        stats["B-кандидаты"] += 1
    # C) enum-стабы: ordinal() + константы
    for em in re.finditer(r"The method ordinal\(\) is undefined for the type ([\w.]+)", b):
        t = em.group(1)
        fq = t if "." in t else fq_of(fp, t)
        if not fq: continue
        tfp = file_of_q(fq)
        if not tfp: continue
        consts = set(re.findall(r"\b%s\.([A-Z][A-Z0-9_]{1,30})\b" % re.escape(t.split(".")[-1]), b))
        C[tfp].add((fq.split(".")[-1], tuple(consts)))
        stats["C-кандидаты"] += 1

# ---------- A: переименование переменных ----------
for fp, vs in A.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    for (var, prim) in vs:
        for (indent, ob, cb) in method_spans(s):
            body = s[ob:cb + 1]
            # переменная объявлена примитивом этого типа в методе?
            if not re.search(r"\b%s\s+%s\s*[=;,)]" % (re.escape(prim), re.escape(var)), body):
                continue
            nb = re.sub(r"\b%s\b" % re.escape(var), var + "_r9", body)
            if nb != body:
                s = s[:ob] + nb + s[cb:]
                stats["A-переименовано"] += 1
    e[0] = s; e[1] = True

# ---------- B: конструкторы ----------
for tfp, cs in B.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    cls = os.path.basename(tfp)[:-5]
    add = ""
    for name, ttypes in sorted(cs):
        if name != cls: continue
        sig = ",".join(ttypes)
        have = re.findall(r"\b%s\s*\(([^)]*)\)" % re.escape(name), s)
        have_k = {tuple(x.strip() for x in hh.split(",") if hh.strip()) for hh in have}
        if tuple(ttypes) in {tuple(sorted(h)) for h in have_k} or tuple(ttypes) in have_k:
            continue
        jparams = ", ".join("%s p%d" % (t, i2) for i2, t in enumerate(ttypes, 1))
        add += "    public %s(%s) {\n    }\n" % (name, jparams)
        stats["B-добавлено"] += 1
    if add:
        i = s.rstrip().rfind("}")
        e[0] = s[:i] + add + s[i:]; e[1] = True

# ---------- C: enum-стабы ----------
for tfp, cs in C.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    cls = os.path.basename(tfp)[:-5]
    if re.search(r"\benum\s+%s\b" % re.escape(cls), s): continue
    add = ""
    for name, consts in sorted(cs):
        for c in consts:
            if re.search(r"\b%s\s+%s\b" % (re.escape(cls), re.escape(c)), s): continue
            add += "    public static final %s %s = new %s();\n" % (cls, c, cls)
        if "int ordinal()" not in s:
            add += "    public int ordinal() { return 0; }\n"
        if "String name()" not in s:
            add += "    public String name() { return \"%s\"; }\n" % cls
        stats["C-добавлено"] += len(consts)
    if add:
        i = s.rstrip().rfind("}")
        e[0] = s[:i] + add + s[i:]; e[1] = True

flush()
for k, v in sorted(stats.items()):
    print("%s: %d" % (k, v))
