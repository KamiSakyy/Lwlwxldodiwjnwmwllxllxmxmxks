#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_round10.py — шесть механических фиксов по ECJ-логу:
 1) "Case constant of type Object" -> поле-константу сделать int
 2) "Duplicate field X"            -> удалить мой дубль `public static final T X = null;`
 3) "Return type for the method is missing" -> либо конструктор переименовать
    (класс файла), либо добавить Object-возврат
 4) "annotation @X must define the attribute Y" -> String Y() default "";
 5) "Cannot make a static reference to the non-static method M(" -> staticize
    (тип по импортам жертвы, с фреймворк-фолбэком)
 6) "Unhandled exception type E" -> throws E в объемлющем методе
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/lS.log"
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
def insert_tail(s, add):
    i = s.rstrip().rfind("}")
    return s[:i] + add + s[i:]

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
            (simple in pkg_classes.get(q[: -(len(simple) + 1)], ()) or q.split(".")[0] in FRAMEWORK)]
    if len(hits) == 1: return hits[0]
    sp = os.path.relpath(os.path.dirname(fp), ROOT)
    if simple in pkg_classes.get(sp, ()): return simple
    return None
def file_of_q(q):
    fp = os.path.join(ROOT, q.replace(".", "/") + ".java")
    return fp if os.path.exists(fp) else None
def method_spans(s):
    out = []
    for m in re.finditer(r"\n(\s*)(?:@\w+(?:\([^)]*\))?\s+)*(?:public|protected|private|static|final|synchronized|abstract|native)[^\n;{}]*?\)\s*(?:throws\s+[\w, .]+)?\s*\{", s):
        ob = m.end() - 1
        depth = 0; j = ob
        while j < len(s):
            if s[j] == "{": depth += 1
            elif s[j] == "}":
                depth -= 1
                if depth == 0: break
            j += 1
        out.append((m.group(1), m.start(), ob, j))
    return out

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")
stats = collections.Counter()

case_fields = collections.defaultdict(set)   # file -> {имена полей}
dup_fields = collections.defaultdict(set)    # file -> {имена}
ret_files = collections.defaultdict(set)     # file -> {(имя_метода, строка)}
anno_attrs = collections.defaultdict(set)    # file -> {(аннотация, [атрибуты])}
staticize = collections.defaultdict(set)     # file -> {(тип, метод)}
throws = collections.defaultdict(set)        # file -> {(линия, исключение)}

for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, ln, code = m.group(1), int(m.group(2)), m.group(3).strip()
    for cm in re.finditer(r"Case constant of type Object is incompatible", b):
        qm = re.search(r"case\s+([\w.]+)\.(\w+)", code)
        if qm:
            fq = "%s.%s" % (qm.group(1), qm.group(2))
            tfp = file_of_q(qm.group(1)) or (file_of_q(fq_of(fp, qm.group(1))) if "." not in qm.group(1) else None)
            if tfp:
                case_fields[tfp].add(qm.group(2)); stats["1-константы"] += 1
    for dm in re.finditer(r"Duplicate field (\w+)", b):
        dup_fields[fp].add(dm.group(1)); stats["2-дубли"] += 1
    if "Return type for the method is missing" in b:
        nm = re.match(r"\s*public\s+(\w+)\s*\(", code)
        if nm: ret_files[fp].add((nm.group(1), ln)); stats["3-возвраты"] += 1
    for am in re.finditer(r"The annotation @([\w.]+) must define the attribute (\w+)", b):
        fq = am.group(1) if "." in am.group(1) else fq_of(fp, am.group(1))
        if fq:
            tfp = file_of_q(fq)
            if tfp:
                anno_attrs[tfp].add((fq.split(".")[-1], am.group(2))); stats["4-аннотации"] += 1
    for sm in re.finditer(r"Cannot make a static reference to the non-static method (\w+)\(.*?from the type ([\w.]+)", b):
        meth, t = sm.groups()
        fq = t if "." in t else fq_of(fp, t)
        if fq:
            tfp = file_of_q(fq)
            if tfp: staticize[tfp].add((fq.split(".")[-1], meth)); stats["5-статик"] += 1
    for em in re.finditer(r"Unhandled exception type ([\w.]+)", b):
        throws[fp].add((ln, em.group(1))); stats["6-исключения"] += 1

# 1) case-константы -> int
for tfp, names in case_fields.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    for nm in names:
        s2 = re.sub(r"(public\s+static\s+final\s+)Object(\s+%s\s*=)" % re.escape(nm),
                    r"\g<1>int\g<2>", s, count=1)
        if s2 != s: s = s2; stats["1-исправлено"] += 1
    e[0] = s; e[1] = True

# 2) дубли полей: удалить `public static final T X = null;` если X уже объявлен выше
for fp, names in dup_fields.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    for nm in names:
        # ищем все объявления X; второй и далее с "= null;" — мои
        decls = [m for m in re.finditer(r"^\s*public(?:\s+static)?(?:\s+final)?\s+[\w<>\[\], .?]+\s+%s\s*(?:=[^;]*)?;" % re.escape(nm), s, re.M)]
        for d in decls[1:]:
            if "= null;" in d.group(0):
                s = s[:d.start()] + s[d.end():]
                stats["2-удалено"] += 1
    e[0] = s; e[1] = True

# 3) return type: конструктор vs Object-метод
for fp, items in ret_files.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    cls = None
    cm = re.search(r"\b(?:public\s+)?(?:final\s+|abstract\s+)?(?:class|interface|enum)\s+(\w+)", s)
    if cm: cls = cm.group(1)
    for (name, ln) in sorted(items, key=lambda x: -x[1]):
        pat = re.compile(r"(public\s+)%s(\s*\()" % re.escape(name))
        if cls and name == cls and name != os.path.basename(fp)[:-5]:
            # имя совпало с классом, но класс файла другой -> это норм конструктор? пропустить
            continue
        if cls and name != cls:
            # методы с именем класса-не-совпадающим: добавляем Object
            s2 = pat.sub(r"\g<1>Object %s\g<2>" % name, s, count=1)
            if s2 != s: s = s2; stats["3-Object"] += 1
    e[0] = s; e[1] = True

# 4) аннотации
for tfp, items in anno_attrs.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    if "@interface" not in s: continue
    add = ""
    for (aname, attr) in sorted(items):
        if not re.search(r"\b%s\s*\(\s*\)" % re.escape(attr), s):
            add += "    String %s() default \"\";\n" % attr
            stats["4-добавлено"] += 1
    if add:
        e[0] = insert_tail(s, add); e[1] = True

# 5) статификация
for tfp, items in staticize.items():
    e = rd(tfp)
    if e[0] is None: continue
    s = e[0]
    cls = os.path.basename(tfp)[:-5]
    for (tname, meth) in sorted(items):
        if tname != cls: continue
        def _st(mm):
            g2 = (mm.group(2) or "").strip()
            if g2:
                last = g2.split()[-1].split("<")[0]
                if last == cls: return mm.group(0)
            return "%sstatic %s%s(" % (mm.group(1), mm.group(2) or "Object ", meth)
        s2 = re.sub(r"((?:public|protected|private)\s+)(?!static)([\w<>\[\], .?]+\s+)?%s\s*\(" % re.escape(meth),
                    _st, s, count=1)
        if s2 != s: s = s2; stats["5-сделано"] += 1
    e[0] = s; e[1] = True

# 6) throws
for fp, items in throws.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    for (ln, exc) in sorted(items, key=lambda x: -x[0]):
        # метод, содержащий строку ln
        pos = sum(len(l) for l in s.splitlines(keepends=True)[:ln - 1])
        best = None
        for (indent, ms, ob, cb) in method_spans(s):
            if ms <= pos <= cb: best = (ms, ob)
        if not best: continue
        ms, ob = best
        seg = s[ms:ob]
        jm = re.search(r"\)\s*throws\s+([\w, .]+)\s*\{", seg)
        if jm:
            if exc not in jm.group(1):
                seg2 = seg[:jm.end(1)] + ", " + exc + seg[jm.end(1):]
                s = s[:ms] + seg2 + s[ob:]
                stats["6-добавлено"] += 1
        else:
            seg2 = re.sub(r"\)(\s*)\{", r") throws " + exc + r"\1{", seg, count=1)
            if seg2 != seg:
                s = s[:ms] + seg2 + s[ob:]
                stats["6-добавлено"] += 1
    e[0] = s; e[1] = True

flush()
for k, v in sorted(stats.items()):
    print("%s: %d" % (k, v))
