#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_aa.py — шаг 6.6 «сериализаторы и члены по ECJ-блокам».

A) aa.c: interface -> final class; статические поля-сериализаторы aa.c.X
   (тип aa.a) по всем употреблениям в дереве; методы a/b/c/d -> static.
B) aa.a: default-методы сериализатора a(Object,Object)->Object,
   b(Object,Object,Object)->void.
C) aa.m: extends s ("cannot convert from m to s").
D) aa.w: поля a,b (Set).
E) Универсальный добор методов: "The method N(SIG) is undefined for the type T"
   — T резолвится СТРОГО по импортам сайта/пакету сайта; сигнатура из сообщения.
F) Универсальный добор полей: "X cannot be resolved or is not a field" —
   приёмник из строки кода: Q.X -> static-поле в Q; var.X -> поле в типе var.

Использование: python3 tools/fix_aa.py <ecj-log> [src-root]
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/ecj_sh3.log"
ROOT = sys.argv[2] if len(sys.argv) > 2 else os.path.join(
    os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")

def read(fp):
    with open(fp, encoding="utf-8", errors="replace") as f:
        return f.read()

def write(fp, s):
    with open(fp, "w", encoding="utf-8") as f:
        f.write(s)

pkg_classes = collections.defaultdict(set)
for dp, _, fs in os.walk(ROOT):
    p = os.path.relpath(dp, ROOT)
    for fn in fs:
        if fn.endswith(".java"):
            pkg_classes[p].add(fn[:-5])
imp_re = re.compile(r"^\s*import\s+(?:static\s+)?([\w.]+)\s*;", re.M)

def file_of(pkg, name):
    fp = os.path.join(ROOT, pkg, name + ".java")
    return fp if os.path.exists(fp) else None

def insert_before_last_brace(src, snippet):
    i = src.rstrip().rfind("}")
    return src[:i] + snippet + src[i:]

def add_members(fp, methods=None, fields=None, static=False):
    """methods: list[(name, arity, ret)]; fields: list[(name, type, static)]"""
    src = read(fp)
    orig = src
    mod = "public static " if static else "public "
    for (name, arity, ret) in (methods or []):
        have = re.findall(r"\b%s\s*\(([^)]*)\)" % re.escape(name), src)
        ars = {0 if not e.strip() else e.count(",") + 1 for e in have}
        if arity in ars: continue
        params = ", ".join("Object p%d" % i for i in range(1, arity + 1))
        body = " return null;" if ret == "Object" else ""
        src = insert_before_last_brace(src,
            "    %s%s %s(%s) {%s }\n" % (mod, ret, name, params, body))
    for (name, ftype, fstatic) in (fields or []):
        if re.search(r"\b%s\s+%s\s*[;=]" % (re.escape(ftype), re.escape(name)), src): continue
        if re.search(r"\b%s\b" % re.escape(name), src.split("{", 1)[0]): continue
        sm = "public static final " if fstatic else "public "
        src = insert_before_last_brace(src, "    %s%s %s = null;\n" % (sm, ftype, name))
    if src != orig:
        write(fp, src)
        return True
    return False

# ---------- A/B/C/D: прицельные правки aa ----------
changed = []

# A) aa.c
fp = file_of("aa", "c")
tree_hits = set()
for dp, _, fs in os.walk(ROOT):
    for fn in fs:
        if not fn.endswith(".java"): continue
        t = read(os.path.join(dp, fn))
        tree_hits.update(re.findall(r"\baa\.c\.(\w+)\b", t))
if fp:
    src = read(fp)
    src = re.sub(r"\binterface\s+c\b", "final class c", src, count=1)
    src = re.sub(r"\bdefault\s+", "public static ", src)
    write(fp, src)
    flds = [(n, "aa.a", True) for n in sorted(tree_hits)
            if not re.search(r"\b%s\s*=" % re.escape(n), src)]
    add_members(fp, fields=flds)
    changed.append("aa.c: class, +%d статических полей" % len(flds))

# B) aa.a
fp = file_of("aa", "a")
if fp:
    src = read(fp)
    src = insert_before_last_brace(src,
        "    default Object a(Object p1, Object p2) { return null; }\n"
        "    default void b(Object p1, Object p2, Object p3) {\n    }\n")
    write(fp, src)
    changed.append("aa.a: +a(2), +b(3)")

# C) aa.m extends s
fp = file_of("aa", "m")
if fp:
    src = read(fp)
    if "extends" not in src.split("{")[0]:
        src = re.sub(r"(\bfinal class m\b)", r"\1 extends s", src, count=1)
        write(fp, src)
        changed.append("aa.m: extends s")

# D) aa.w fields
fp = file_of("aa", "w")
if fp:
    if add_members(fp, fields=[("a", "java.util.Set", False), ("b", "java.util.Set", False)]):
        changed.append("aa.w: +поля a,b")

# ---------- E/F: разбор лога ----------
log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")
imports_cache = {}
def imports_of(fp):
    if fp not in imports_cache:
        try:
            imports_cache[fp] = set(imp_re.findall(read(fp)[:20000]))
        except OSError:
            imports_cache[fp] = set()
    return imports_cache[fp]

def resolve_type(site_fp, simple):
    imp = []
    for q in imports_of(site_fp):
        if q.endswith("." + simple):
            p = q[: -(len(simple) + 1)]
            if simple in pkg_classes.get(p, ()):
                imp.append((p, simple))
    if len(imp) == 1: return imp[0]          # single-import ВЫИГРЫВАЕТ (JLS)
    cands = list(imp)
    site_pkg = os.path.relpath(os.path.dirname(site_fp), ROOT)
    if simple in pkg_classes.get(site_pkg, ()):
        cands.append((site_pkg, simple))
    cands = list(dict.fromkeys(cands))
    return cands[0] if len(cands) == 1 else None

m_methods = collections.defaultdict(set)   # fp -> {(name, arity)}
f_static = collections.defaultdict(dict)   # fp -> {name: True}
f_inst = collections.defaultdict(dict)     # fp -> {name: type}
SIG = re.compile(r"The method ([\w]+)\(([^)]*)\) is undefined for the type ([\w.]+)")
FLD = re.compile(r"(\w+) cannot be resolved or is not a field")
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp, ln, code = m.group(1), int(m.group(2)), m.group(3)
    for nm in SIG.finditer(b):
        name, sig, t = nm.groups()
        if "." in t: continue          # квалифицированные — отдельно/позже
        r = resolve_type(fp, t)
        if r:
            arity = 0 if not sig.strip() else sig.count(",") + 1
            m_methods[file_of(*r)].add((name, arity))
    for fm in FLD.finditer(b):
        fld = fm.group(1)
        # приёмник: последний `.fld` в строке кода
        rm = re.search(r"([A-Za-z_$][\w$.]*)\.%s\b" % re.escape(fld), code)
        if not rm: continue
        recv = rm.group(1)
        parts = recv.split(".")
        if len(parts) >= 2 and parts[0][0].islower():
            # квалификатор: пакет+класс или класс+вложенность — пробуем (pkg,last)
            r = resolve_type(fp, parts[-1]) if parts[-1] in (pkg_classes.get(os.path.basename(os.path.dirname(fp))) or ()) else None
            if r is None and len(parts) == 2:
                # напр. aa.c / sy.d0: прямой путь
                q = file_of(parts[0], parts[1])
                r = (parts[0], parts[1]) if q else None
            if r:
                ftype = "aa.a" if r == ("aa", "c") else "Object"
                f_static[file_of(*r)][fld] = ftype
                continue
        if len(parts) == 1:
            # простой var: тип из объявлений файла
            t = read(fp)
            vm = re.findall(r"(?:^|\s)([\w<>\[\], .?]+?)\s+%s\b\s*[=;),]" % re.escape(recv), t, re.M)
            vtype = None
            for cand in vm:
                cand = cand.strip().split(" ")[-1].split("<")[0]
                base = cand.split(".")[-1]
                if base in ("if", "for", "while", "switch", "catch", "return", "new", "else", "throw"): continue
                vtype = cand; break
            if vtype:
                sp = vtype.split(".")
                if len(sp) == 2 and sp[0] in pkg_classes and sp[1] in pkg_classes[sp[0]]:
                    vfp = file_of(sp[0], sp[1])
                else:
                    r = resolve_type(fp, sp[-1])
                    vfp = file_of(*r) if r else None
                if vfp:
                    f_inst[vfp].setdefault(fld, "Object")

n = 0
for fp, ms in m_methods.items():
    if fp and add_members(fp, methods=[(nm, ar, "Object") for nm, ar in sorted(ms)]):
        n += 1
for fp, flds in f_static.items():
    if fp and add_members(fp, fields=[(nm, t, True) for nm, t in sorted(flds.items())]):
        n += 1
for fp, flds in f_inst.items():
    if fp and add_members(fp, fields=[(nm, t, False) for nm, t in sorted(flds.items())]):
        n += 1
print(";" .join(changed))
print("файлов с добором: методов %d, static-полей %d, полей %d" %
      (len([1 for fp in m_methods if fp]), len([1 for fp in f_static if fp]), len([1 for fp in f_inst if fp])))
