#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
fix_shadowing.py — шаг 6.4 «раззатенение».

Явление: jadx-класс X в пакете P, чьё простое имя совпадает с именем настоящего
пакета X (например eo0/ea.java и пакет ea), по JLS затеняет пакет X ВНУТРИ P:
все ссылки "ea.f" внутри eo0 резолвятся в eo0.ea.f (вложенную заглушку), а не в
настоящий JsonWriter ea.f. Отсюда ~16 тыс. прямых ошибок (z0, r0, ...) и каскады.

Лечение: класс X переименовывается в XShadow (уникально в пакете), правятся
ссылки, означавшие КЛАСС; ссылки, означавшие ПАКЕТ (ea.f, ea.e, ...), остаются
как есть и после переименования снова резолвятся в пакет.

Однопроходный: каждый файл читается/пишется не более одного раза.

Использование:
  python3 tools/fix_shadowing.py --pairs pkg:X pkg:X ... --dry
  python3 tools/fix_shadowing.py --pairs pkg:X pkg:X ...   # применить
"""
import os, re, sys, collections, argparse, time

SRC = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))),
                   "handoff", "GitHub-RU-v2", "app", "src", "main", "java")
WORD = r"[A-Za-z_$][A-Za-z0-9_$]*"

def walk_java():
    for dp, _, fs in os.walk(SRC):
        for fn in fs:
            if fn.endswith(".java"):
                yield os.path.join(dp, fn)

def build_maps():
    pkg_classes = collections.defaultdict(set)
    files = []
    for fp in walk_java():
        p = os.path.relpath(os.path.dirname(fp), SRC)
        pkg_classes[p].add(os.path.basename(fp)[:-5])
        files.append(fp)
    pkg_names = set()
    for p in pkg_classes:
        pkg_names.update(p.split("/"))
    return pkg_classes, pkg_names, files

def holder_members(body):
    return set(re.findall(r"public static (?:final )?[\w<>\[\], .]+?\s([ab])\s*=", body))

def rewrite_pkg_file(text, X, Xs, members):
    """правки в файлах ПАКЕТА P (простое имя X в области видимости)"""
    if re.search(r"\b%sShadow2?\b" % re.escape(X), text):
        return text, 0
    x = re.escape(X)
    n = 0
    def sub(pattern, repl):
        nonlocal n
        t2, k = re.subn(pattern, repl, text)
        n += k
        return t2
    text = sub(r"(\b(?:class|interface|enum)\s+)%s\b" % x, r"\g<1>%s" % Xs)
    # конструкторы: public X( / protected X( / private X(
    text = sub(r"\b(public|protected|private)\s+%s(\s*\()" % x, r"\g<1> %s\g<2>" % Xs)
    text = sub(r"\bnew\s+%s\s*(?=[(\[])" % x, "new %s" % Xs)
    text = sub(r"\b%s\.class\b" % x, "%s.class" % Xs)
    text = sub(r"\(\s*%s\s*\)" % x, "(%s)" % Xs)
    text = sub(r"\b(extends|implements|throws|instanceof)\s+%s\b" % x, r"\g<1> %s" % Xs)
    text = sub(r"(<\s*)%s(\s*>)" % x, r"\g<1>%s\g<2>" % Xs)
    text = sub(r"(<\s*[^<>\n]*?,\s*)%s(\s*[,>\n])" % x, r"\g<1>%s\g<2>" % Xs)
    text = sub(r"\b%s\s*\[\s*\]" % x, "%s[]" % Xs)
    text = sub(r"\b%s(?!\s*[.\[(])(\s+)(%s)(\s*[=;,\)\[{])" % (x, WORD),
               r"%s\g<1>\g<2>\g<3>" % Xs)
    text = sub(r"(,\s*)%s(\s+)(%s)(\s*[=;\)])" % (x, WORD),
               r"\g<1>%s\g<2>\g<3>\g<4>" % Xs)
    for m in members:
        text = sub(r"\b%s\.%s(?=\s*[.,;)\]])" % (x, m), "%s.%s" % (Xs, m))
    return text, n

def rewrite_importer(text, X, Xs):
    """правки в файлах, импортировавших холдер: там ВСЁ X.* = класс"""
    if re.search(r"\b%sShadow2?\b" % re.escape(X), text):
        return text, 0
    x = re.escape(X)
    n = 0
    def sub(pattern, repl):
        nonlocal n
        t2, k = re.subn(pattern, repl, text)
        n += k
        return t2
    text = sub(r"(\bimport\s+[\w.]+\.)%s\s*;" % x, r"\g<1>%s;" % Xs)
    text = sub(r"\b%s\." % x, "%s." % Xs)
    text = sub(r"\bnew\s+%s\s*(?=[(\[])" % x, "new %s" % Xs)
    text = sub(r"\(\s*%s\s*\)" % x, "(%s)" % Xs)
    text = sub(r"\b%s(?!\s*[.\[(])(\s+)(%s)(\s*[=;,\)\[{])" % (x, WORD),
               r"%s\g<1>\g<2>\g<3>" % Xs)
    return text, n

def main():
    t0 = time.time()
    ap = argparse.ArgumentParser()
    ap.add_argument("--pairs", nargs="+", required=True, metavar="PKG:X")
    ap.add_argument("--dry", action="store_true")
    a = ap.parse_args()
    pkg_classes, pkg_names, files = build_maps()
    print("файлов: %d, пакетов: %d" % (len(files), len(pkg_classes)))
    jobs = []
    for spec in a.pairs:
        p, x = spec.split(":", 1)
        if x not in pkg_classes.get(p, set()):
            print("  !! нет %s.%s — пропуск" % (p, x)); continue
        Xs = x + "Shadow"
        if Xs in pkg_classes[p]:
            Xs = x + "Shadow2"
            if Xs in pkg_classes[p]:
                print("  !! занято имя для %s.%s — пропуск" % (p, x)); continue
        jobs.append((p, x, Xs))
        print("  план: %s.%s -> %s" % (p, x, Xs))
    pkgdir = {p: os.path.join(SRC, p) for p, _, _ in jobs}
    members = {}
    for p, x, _ in jobs:
        members[(p, x)] = holder_members(open(os.path.join(pkgdir[p], x + ".java"), encoding="utf-8").read())
    inpkg = collections.defaultdict(list)
    for p, x, xs in jobs: inpkg[p].append((x, xs))
    pairmap = {(p, x): xs for p, x, xs in jobs}
    import_re = re.compile(r"\bimport\s+([\w.]+)\.(\w+)\s*;", re.M)
    qual_re = re.compile(r"\b([a-z][a-z0-9]{0,4})\.(\w{1,6})\b")
    totals = collections.Counter()
    changed_files = 0
    for fp in files:
        d = os.path.dirname(fp)
        rel = os.path.relpath(d, SRC)
        try:
            text = open(fp, encoding="utf-8", errors="replace").read()
        except OSError:
            continue
        orig = text
        for x, xs in inpkg.get(rel, ()):
            text, n = rewrite_pkg_file(text, x, xs, members[(rel, x)])
            totals["%s.%s" % (rel, x)] += n
        if d not in pkgdir.values() and import_re.search(text):
            for m in import_re.finditer(text):
                key = (m.group(1), m.group(2))
                if key in pairmap:
                    text, n = rewrite_importer(text, m.group(2), pairmap[key])
                    totals["%s.%s(import)" % key] += n
        if qual_re.search(text):
            def qrepl(m):
                xs = pairmap.get((m.group(1), m.group(2)))
                return "%s.%s" % (m.group(1), xs) if xs else m.group(0)
            text = qual_re.sub(qrepl, text)
        if text != orig and not a.dry:
            with open(fp, "w", encoding="utf-8") as f:
                f.write(text)
            changed_files += 1
    print("изменено файлов: %d%s" % (changed_files, " (dry — ничего не записано)" if a.dry else ""))
    for k, v in totals.most_common():
        if v: print("  %s : %d" % (k, v))
    print("время: %.1f с" % (time.time() - t0))

if __name__ == "__main__":
    main()
