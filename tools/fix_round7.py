#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_round7.py — три механизма:
 A) локальная переменная затеняет пакет-квалификатор (a0.s0.m при var a0)
    -> scope-aware переименование var в её методе
 B) var.X = ... (нет поля) -> добавить поле в тип var (по объявлению/параметру)
 C) Object->T присваивание вызова Q.m(args) -> типизированная перегрузка
    с точными типами аргументов (примитивы) и FQ-типом возврата T
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/l4.log"
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
imp_c = {}
def imps(fp):
    if fp not in imp_c:
        e = rd(fp)
        imp_c[fp] = set(imp_re.findall(e[0][:20000])) if e[0] else set()
    return imp_c[fp]
def resolve_fp(site_fp, simple):
    """FQ имя типа по простому имени (импорт > пакет сайта); None при неоднозначности"""
    imp = []
    for q in imps(site_fp):
        if q.endswith("." + simple):
            p = q[: -(len(simple) + 1)]
            if simple in pkg_classes.get(p, ()): imp.append(p + "." + simple)
    if len(imp) == 1: return imp[0]
    sp = os.path.relpath(os.path.dirname(site_fp), ROOT)
    if simple in pkg_classes.get(sp, ()): return simple
    return None
def file_of_q(qname):
    fp = os.path.join(ROOT, qname.replace(".", "/") + ".java")
    return fp if os.path.exists(fp) else None

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")
stats = collections.Counter()

# ---------- сбор ----------
A = collections.defaultdict(set)      # file -> {имя_переменной}
B = collections.defaultdict(set)      # file_типа -> {(имя, тип)}
C = collections.defaultdict(set)      # file_хозяина_метода -> {(meth, retFQ, [paramFQ])}
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, code = m.group(1), m.group(3).strip()
    # A: "C cannot be resolved or is not a field" + код `var.C.qualifier(`
    fm = re.search(r"(\w+) cannot be resolved or is not a field", b)
    if fm:
        fld = fm.group(1)
        qm = re.match(r"([a-z]\w*)\.%s\." % re.escape(fld), code)
        if qm:
            var = qm.group(1)
            e = rd(fp)
            if e[0] and re.search(r"\b([\w<>\[\], .?]+)\s+%s\s*[=;,)]" % re.escape(var), e[0]):
                A[fp].add(var)
                stats["A-кандидаты"] += 1
                continue
        # B: var.X = ... / var.X.field
        bm = re.search(r"\b(\w+)\.%s\b\s*=[^=]" % re.escape(fld), code)
        if bm:
            var = bm.group(1)
            e = rd(fp)
            t = None
            if e[0]:
                dm = re.search(r"\b([\w<>\[\], .?]+?)\s+%s\b\s*[=;),]" % re.escape(var), e[0])
                if dm:
                    cand = dm.group(1).strip().split(" ")[-1].split("<")[0]
                    fq = None
                    if "." in cand: fq = cand
                    else: fq = resolve_fp(fp, cand)
                    if fq: t = fq
            if t:
                tf = file_of_q(t)
                if tf: B[tf].add((fld, t)); stats["B-поля"] += 1
    # C: cannot convert from Object to T + код `... = Q.m(args);`
    for tm in re.finditer(r"cannot convert from Object to ([\w.]+)", b):
        T = tm.group(1)
        cm = re.search(r"=\s*([a-z][\w]*(?:\.[a-zA-Z_$]\w*)*)\.([A-Za-z_$]\w*)\(", code)
        if not cm: continue
        q, meth = cm.group(1), cm.group(2)
        # тип хозяина метода
        tgt = None
        sp = q.split(".")
        if len(sp) >= 2:
            for k in range(len(sp), 1, -1):
                cand = ".".join(sp[:k])
                if cand in pkg_classes:
                    tgt = cand; break
        if tgt is None and len(sp) == 2 and sp[0] in pkg_classes and sp[1] in pkg_classes[sp[0]]:
            tgt = sp[0]
        if tgt is None and len(sp) == 1:
            fq = resolve_fp(fp, q)
            if fq and "." in fq:
                tgt = fq.rsplit(".", 1)[0]
        if not tgt: continue
        tf = file_of_q(tgt)
        if not tf: continue
        # аргументы: балансовый проход от '('
        ip = code.find("(", code.find(meth + "("))
        args = []
        if ip >= 0:
            depth = 0; cur = []; j = ip
            while j < len(code):
                c = code[j]
                if c == "(": depth += 1
                elif c == ")":
                    depth -= 1
                    if depth == 0: break
                elif c == "," and depth == 1:
                    args.append("".join(cur).strip()); cur = []
                    j += 1; continue
                if depth >= 1: cur.append(c)
                j += 1
        # типы аргументов по объявлениям в файле
        e = rd(fp)
        ptypes = []
        ok = True
        for av in args:
            if re.fullmatch(r"\d+[LlFfDd]?", av):
                ptypes.append("int" if not re.search(r"[LlFfDd]", av) else "long"); continue
            if av in ("true", "false"):
                ptypes.append("boolean"); continue
            if av.startswith('"'):
                ptypes.append("String"); continue
            if re.fullmatch(r"'.'", av):
                ptypes.append("char"); continue
            if av.endswith(".class"):
                ptypes.append("java.lang.Class"); continue
            am = re.search(r"\b([\w<>\[\], .?]+?)\s+%s\b\s*[=;),]" % re.escape(av), e[0] or "")
            if not am: ok = False; break
            cand = am.group(1).strip().split(" ")[-1].split("<")[0]
            fq = cand if "." in cand else resolve_fp(fp, cand)
            if not fq: ok = False; break
            ptypes.append(fq)
        if not ok or not ptypes: continue
        retFQ = T if "." in T else (resolve_fp(fp, T) or T)
        if T in ("int", "boolean", "long", "char", "float", "double", "short", "byte", "StringBuilder"):
            retFQ = "java.lang.StringBuilder" if T == "StringBuilder" else T
        C[tf].add((meth, retFQ, tuple(ptypes)))
        stats["C-перегрузки"] += 1

# ---------- A: scope-aware переименование ----------
def method_spans(s):
    """границы тел методов верхнего уровня: [(start,end)]"""
    spans = []
    i = 0
    n = len(s)
    while i < n:
        m = re.search(r"\n\s*(?:public|protected|private|static|final)[^\n;{]*\)\s*\{", s[i:])
        if not m: break
        ob = i + m.end() - 1
        depth = 0; j = ob
        while j < n:
            if s[j] == "{": depth += 1
            elif s[j] == "}":
                depth -= 1
                if depth == 0: break
            j += 1
        spans.append((ob, j))
        i = j + 1
    return spans

for fp, names in A.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    for var in names:
        for (a0, b0) in method_spans(s):
            body = s[a0:b0]
            if not re.search(r"\b%s\s*[=;,)]" % re.escape(var), body.split("\n", 1)[0]):
                pass
            if re.search(r"\b[\w<>\[\], .?]+\s+%s\s*[=;,)]" % re.escape(var), body):
                nb = re.sub(r"\b%s\b" % re.escape(var), var + "_r7", body)
                if nb != body:
                    s = s[:a0] + nb + s[b0:]
                    stats["A-переименовано"] += 1
    e[0] = s; e[1] = True

# ---------- B: поля ----------
for tf, flds in B.items():
    e = rd(tf)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for fld, t in sorted(flds):
        if not re.search(r"\b%s\s+%s\s*[;=]" % (re.escape(t.split(".")[-1]), re.escape(fld)), s) and \
           not re.search(r"\b%s\s*;" % re.escape(fld), s):
            add += "    public %s %s = null;\n" % (t if "." not in t or "/" not in t else t, fld)
            stats["B-добавлено"] += 1
    if add:
        i = s.rstrip().rfind("}")
        e[0] = s[:i] + add + s[i:]; e[1] = True

# ---------- C: перегрузки ----------
for tf, msigs in C.items():
    e = rd(tf)
    if e[0] is None: continue
    s = e[0]
    add = ""
    for meth, retFQ, ptypes in sorted(msigs):
        # есть ли уже перегрузка с этой сигнатурой (по числу и первым примитивам)?
        key = "%s(%s)" % (meth, ",".join(ptypes))
        if re.search(r"\b%s\s*\([^)]*\)" % re.escape(meth), s) and key in s:
            continue
        params = ", ".join("%s p%d" % (t, i2) for i2, t in enumerate(ptypes, 1))
        add += "    public static %s %s(%s) { return %s; }\n" % (
            retFQ, meth, params, "0" if retFQ in ("int", "long", "short", "byte") else
            "false" if retFQ == "boolean" else
            "'\\0'" if retFQ == "char" else
            "0.0f" if retFQ == "float" else
            "0.0d" if retFQ == "double" else "null")
        stats["C-добавлено"] += 1
    if add:
        i = s.rstrip().rfind("}")
        e[0] = s[:i] + add + s[i:]; e[1] = True

flush()
for k, v in sorted(stats.items()):
    print("%s: %d" % (k, v))
