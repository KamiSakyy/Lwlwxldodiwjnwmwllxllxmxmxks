#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_kind2.py (v2, быстрый) — шаг 6.5 «исправление вида класса».

"Cannot instantiate the type T" — T объявлен интерфейсом (часто мой СТАБ),
но в байткоде есть конструктор new T(...): это КЛАСС. Истинный вид определяет
ИСПОЛЬЗОВАНИЕ.

v2: импорты читаются только у файлов-сайтов с ошибкой (не всех 44.5k).

Использование: python3 tools/fix_kind2.py <ecj-log> [src-root]
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/ecj_shadow.log"
ROOT = sys.argv[2] if len(sys.argv) > 2 else os.path.join(
    os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")

_cache = {}
def read(fp):
    if fp not in _cache:
        with open(fp, encoding="utf-8", errors="replace") as f:
            _cache[fp] = f.read()
    return _cache[fp]

# ---------- карты имён ТОЛЬКО по filenames (быстро) ----------
pkg_classes = collections.defaultdict(set)
for dp, _, fs in os.walk(ROOT):
    p = os.path.relpath(dp, ROOT)
    for fn in fs:
        if fn.endswith(".java"):
            pkg_classes[p].add(fn[:-5])

# ---------- 1. разбор лога, сбор сайтов ----------
log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = re.split(r"-{10}\n", log)
site_files = set()
raw = []   # (site_fp, simple, [arities])
imp_re = re.compile(r"^\s*import\s+(?:static\s+)?([\w.]+)\s*;", re.M)
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java)", b)
    if not m: continue
    fp = m.group(1)
    hits = re.findall(r"Cannot instantiate the type ([\w.]+)", b)
    if not hits: continue
    site_files.add(fp)
    raw.append((fp, hits))
print("лог: сайтов-файлов %d" % len(site_files), flush=True)

# ---------- 2. резолв имён ----------
imports = {}
for fp in site_files:
    try:
        with open(fp, encoding="utf-8", errors="replace") as f:
            imports[fp] = set(imp_re.findall(f.read(20000)))
    except OSError:
        imports[fp] = set()

def resolve(site_fp, simple):
    cands = []
    for q in imports[site_fp]:
        if q.endswith("." + simple):
            p = q[: -(len(simple) + 1)]
            if simple in pkg_classes.get(p, ()):
                cands.append((p, simple))
    site_pkg = os.path.relpath(os.path.dirname(site_fp), ROOT)
    if simple in pkg_classes.get(site_pkg, ()):
        cands.append((site_pkg, simple))
    cands = list(dict.fromkeys(cands))
    return cands[0] if len(cands) == 1 else None

targets = {}
sites = 0
for fp, hits in raw:
    for simple in hits:
        simple = simple.split(".")[-1]
        r = resolve(fp, simple)
        if not r: continue
        sites += 1
        targets.setdefault(r, set())
print("сайтов new T(..): %d, целей: %d" % (sites, len(targets)), flush=True)

# арности: ОДИН проход по сайт-файлам; аргменты — ручной баланс скобок (без бэктрекинга)
all_names = sorted({name for (_, name) in targets})
name_re = re.compile(r"\bnew\s+(%s)\s*\(" % "|".join(re.escape(n) for n in all_names))
name2targets = collections.defaultdict(set)
for (pkg, name) in targets:
    name2targets[name].add((pkg, name))

def args_arity(text, i):
    """i — позиция '('; вернуть (арность, конец) балансом скобок"""
    depth = 0; arity = 1 if text[i+1:i+2] not in ("", ")", ",") else 0
    # арность считаем по запятым глубины 1
    arity = 0; started = False; j = i + 1
    while j < len(text):
        c = text[j]
        if c == "(": depth += 1
        elif c == ")":
            if depth == 0: return arity, j + 1
            depth -= 1
        elif c == "," and depth == 0:
            arity += 1
        elif not c.isspace() and depth == 0:
            started = True
        j += 1
    return arity, j

for fp in site_files:
    try:
        t = read(fp)
    except OSError:
        continue
    for nm in name_re.finditer(t):
        simple = nm.group(1)
        arity, _ = args_arity(t, nm.end() - 1)
        for (pkg, name) in name2targets.get(simple, ()):
            targets[(pkg, name)].add(arity)
for (pkg, name) in targets:
    tf = os.path.join(ROOT, pkg, name + ".java")
    if os.path.exists(tf):
        t = read(tf)
        for nm in name_re.finditer(t):
            if nm.group(1) == name:
                arity, _ = args_arity(t, nm.end() - 1)
                targets[(pkg, name)].add(arity)

# ---------- 3. правка файлов ----------
def top_level_span(s, start):
    depth = 0
    for i in range(start, len(s)):
        if s[i] == "{": depth += 1
        elif s[i] == "}":
            depth -= 1
            if depth == 0: return i
    return -1

def bodify(src, name):
    """абстрактные методы (строка `модификаторы Тип имя(арг);`) -> с телом"""
    m = re.search(r"\bclass\s+%s\b" % re.escape(name), src)
    if not m: return src, 0
    ob = src.find("{", m.end())
    cb = top_level_span(src, ob)
    if cb < 0: return src, 0
    body = src[ob:cb + 1]
    line_re = re.compile(r'^(\s*)((?:(?:public|protected|private|static|final|abstract|synchronized|native|strictfp|default)\s+)*)([\w<>\[\], .?]+?)\s+(\w+)\s*\(([^)]*)\)\s*(?:throws\s+[\w, .]+)?\s*;\s*$')
    out = []
    n = 0
    for line in body.splitlines(keepends=True):
        lm = line_re.match(line.rstrip("\n"))
        if lm:
            indent, mods, ret, mname, args = lm.groups()
            ret = ret.strip()
            if ret == "void": stmt = ""
            elif ret in ("int", "long", "short", "byte"): stmt = " return 0;"
            elif ret == "boolean": stmt = " return false;"
            elif ret == "char": stmt = " return '\\0';"
            elif ret == "float": stmt = " return 0.0f;"
            elif ret == "double": stmt = " return 0.0d;"
            else: stmt = " return null;"
            eol = "\n" if line.endswith("\n") else ""
            out.append("%s%s%s %s(%s) {%s }%s" % (indent, mods, ret, mname, args, stmt, eol))
            n += 1
        else:
            out.append(line)
    return src[:ob] + "".join(out) + src[cb + 1:], n

changed = 0
for (pkg, name), arities in sorted(targets.items()):
    fp = os.path.join(ROOT, pkg, name + ".java")
    if not os.path.exists(fp): continue
    src = read(fp)
    if not re.search(r"\binterface\s+%s\b" % re.escape(name), src):
        continue
    orig = src
    src = re.sub(r"(\bpublic\s+)?\binterface\s+%s\b" % re.escape(name),
                 r"\g<1>final class %s" % name, src, count=1)
    src = re.sub(r"(\bs\s*)default\s+(\w)", r"\1\2", src)
    src, nb = bodify(src, name)
    ctors = []
    existing = re.findall(r"\b(?:public|protected|private)\s+%s\s*\(([^)]*)\)" % re.escape(name), src)
    have = {0 if not e.strip() else e.count(",") + 1 for e in existing}
    for a in sorted(arities):
        if a in have: continue
        params = ", ".join("Object p%d" % i for i in range(1, a + 1))
        ctors.append("    public %s(%s) {\n    }\n" % (name, params))
    if ctors:
        i = src.rstrip().rfind("}")
        src = src[:i] + "\n".join(ctors) + src[i:]
    if src != orig:
        with open(fp, "w", encoding="utf-8") as f:
            f.write(src)
        changed += 1
        print("  %s/%s: interface->class, тел %+d, ctor %+d, арности %s" % (pkg, name, nb, len(ctors), sorted(arities)))
print("изменено файлов: %d" % changed, flush=True)
