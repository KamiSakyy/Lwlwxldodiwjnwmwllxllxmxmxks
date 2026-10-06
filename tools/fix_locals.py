#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_locals.py — шаг 6.7: необъявленные локальные переменные и финальные классы
с анонимными наследниками (jadx-паттерны).

 A) "VAR cannot be resolved to a variable": в методе переменная присваивается
    без объявления (`r1 = new l0(...)`). Лечится: `TYPE VAR = null;` сразу после
    открытия тела метода. Тип — из первого `VAR = new TYPE(` в том же методе,
    иначе Object. VAR может быть методом-локалом или полем-константой (r1 — имя
    класса qo.r1, но код использует его как переменную).
 B) "An anonymous class cannot subclass the final class T" — де-финализация T.

Использование: python3 tools/fix_locals.py <ecj-log> [src-root]
"""
import os, re, sys, collections

LOG = sys.argv[1] if len(sys.argv) > 1 else "/tmp/lM.log"
ROOT = sys.argv[2] if len(sys.argv) > 2 else os.path.join(
    os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
    "handoff", "GitHub-RU-v2", "app", "src", "main", "java")

_cache = {}
def rd(fp):
    if fp not in _cache:
        try:
            with open(fp, encoding="utf-8", errors="replace") as f:
                _cache[fp] = [f.read(), False]
        except OSError:
            _cache[fp] = [None, False]
    return _cache[fp]
def flush():
    for fp, (s, ch) in _cache.items():
        if ch and s is not None:
            with open(fp, "w", encoding="utf-8") as f:
                f.write(s)

log = open(LOG, encoding="utf-8", errors="replace").read()
blocks = log.split("-" * 10 + "\n")

# ---------- сбор ----------
vars_by_file = collections.defaultdict(set)     # file -> {имена}
definal = set()                                  # классы к де-финализации (простые имена)
for b in blocks:
    m = re.search(r"ERROR in (\S+\.java) \(at line (\d+)\)\n\t(.+?)\n", b)
    if not m: continue
    fp = m.group(1)
    for vm in re.finditer(r"(\w+) cannot be resolved to a variable", b):
        vars_by_file[fp].add(vm.group(1))
    for fm in re.finditer(r"cannot subclass the final class ([\w.]+)", b):
        definal.add(fm.group(1).split(".")[-1])

print("файлов с голыми переменными: %d, классов к де-финализации: %d" %
      (len(vars_by_file), len(definal)))

# ---------- B: де-финализация ----------
if definal:
    pat = re.compile(r"\b(public\s+|protected\s+|private\s+)?final\s+(class\s+)(%s)\b" %
                     "|".join(re.escape(x) for x in sorted(definal)))
    n = 0
    for dp, _, fs in os.walk(ROOT):
        for fn in fs:
            if not fn.endswith(".java"): continue
            fp = os.path.join(dp, fn)
            if fn[:-5] not in definal: continue
            e = rd(fp)
            if e[0] is None: continue
            s2 = pat.sub(lambda m: (m.group(1) or "") + m.group(2) + m.group(3), e[0], count=1)
            if s2 != e[0]:
                e[0] = s2; e[1] = True; n += 1
    print("де-финализировано: %d" % n)

# ---------- A: декларации локалов ----------
def method_spans(s):
    """(start_of_brace, end_of_brace) методов верхнего уровня и в анонимных классах"""
    spans = []
    for m in re.finditer(r"\n(\s*)(?:@\w+(?:\([^)]*\))?\s+)*(?:public|protected|private|static|final|synchronized|abstract)[^\n;{}]*?\)\s*(?:throws\s+[\w, .]+)?\s*\{", s):
        indent = m.group(1)
        ob = m.end() - 1
        depth = 0; j = ob
        while j < len(s):
            if s[j] == "{": depth += 1
            elif s[j] == "}":
                depth -= 1
                if depth == 0: break
            j += 1
        if j < len(s):
            spans.append((indent, ob, j))
    return spans

stats = collections.Counter()
for fp, names in vars_by_file.items():
    e = rd(fp)
    if e[0] is None: continue
    s = e[0]
    for (indent, ob, cb) in method_spans(s):
        body = s[ob:cb + 1]
        for var in names:
            # присваивание/использование в этом методе?
            uses = re.findall(r"\b%s\s*=[^=]" % re.escape(var), body)
            if not uses: continue
            # уже объявлено в методе?
            if re.search(r"\b[\w<>\[\], .?]+\s+%s\s*=[^=]" % re.escape(var), body) and \
               re.search(r"(?:^|\n)\s*[\w<>\[\], .?]+\s+%s\s*=" % re.escape(var), body[:body.find(uses[0]) + 1]):
                continue
            # тип из первого new TYPE после присваивания
            t = None
            am = re.search(r"\b%s\s*=\s*new\s+([\w<>\[\], .?]+?)\s*\(" % re.escape(var), body)
            if am:
                t = am.group(1).strip().split("<")[0].split(" ")[-1]
            t = t or "Object"
            # не зовётся ли как конструктор самого класса (var == имя класса файла)
            insert = "\n%s    %s %s = null;" % (indent, t, var)
            body = body[:1] + insert + body[1:]
            stats["деклараций"] += 1
        s = s[:ob] + body + s[cb + 1:]
        e[0] = s; e[1] = True

flush()
for k, v in stats.most_common():
    print("%s: %d" % (k, v))
