#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 3.5 — Автофикс артефактов декомпиляции: строки вида "?? var = ...;"
jadx вставляет '??' там, где не смог вывести тип. Подсказки типов лежат
в комментариях "JADX WARN: Type inference failed for: rNvX, types: [...]".
Стратегии (по приоритету):
  1) тип из инициализатора new T(...);
  2) тип из WARN-подсказки этой переменной (последняя подсказка, последний тип);
  3) тип поля: this.f -> объявление поля в этом же файле; P.C.f -> чужой класс
     (тип квалифицируется пакетом целевого класса);
  4) тип по имени переменной (arrayList -> ArrayList и т.п.);
  5) fallback: Object.
Спец-правило: "?? v = new Object();" с обращениями v.<поле класса> в следующих
строках -> "<Класс> v = this;" (jadx перемудрил с this в конструкторе).
Идемпотентен: после прогона '??' не остаётся, повторный прогон — no-op.
"""
import os, re, sys

proj = sys.argv[1]
JAVA = os.path.join(proj, "app", "src", "main", "java")

WARN_RX = re.compile(r"Type inference failed for:\s*(\S+?),\s*types:\s*\[([^\]]+)\]")
Q_RX = re.compile(r"^(\s*)\?\?\s*(\w+)\s*(=|;)(.*)$")   # ?? var = expr;  /  ?? var;
FIELD_RX_TPL = r"([\w$.]+(?:\s*<[^=;]*?>)?(?:\s*\[\])*)\s+%s\s*(?:=|;)"
NEW_RX = re.compile(r"new\s+([A-Za-z_][\w$.]*)\s*\(")
STATIC_FIELD_RX = re.compile(r"^([a-z][a-z0-9_]*(?:\.[a-z][a-z0-9_]*)*)\.([A-Za-z_]\w*)\.(\w+)$")
NAME_HINTS = {
    "arraylist": "ArrayList", "list": "java.util.List", "map": "java.util.Map",
    "set": "java.util.Set", "hashmap": "java.util.HashMap", "linkedhashmap": "java.util.LinkedHashMap",
    "linkedhashset": "java.util.LinkedHashSet", "iter": "java.util.Iterator", "it": "java.util.Iterator",
}

# ---- индекс: файлы классов для поиска статических полей ----
class_cache = {}
def class_file_path(pkg, cls):
    key = pkg + "." + cls
    if key in class_cache:
        return class_cache[key]
    p = os.path.join(JAVA, pkg.replace(".", os.sep), cls + ".java")
    class_cache[key] = p if os.path.isfile(p) else None
    return class_cache[key]

def find_field_type(text, fname):
    m = re.search(FIELD_RX_TPL % re.escape(fname), text)
    if m:
        return m.group(1).strip()
    return None

GENERIC_IFACE = {"List": "java.util.List", "Map": "java.util.Map", "Set": "java.util.Set",
                 "Collection": "java.util.Collection", "Iterable": "java.lang.Iterable"}

def resolve_static(pkg_expr, cls, fname):
    """P.C.f -> (тип для объявления, исходный квалификатор класса)"""
    cf = class_file_path(pkg_expr, cls)
    if not cf:
        return None
    try:
        with open(cf, "r", encoding="utf-8", errors="ignore") as f:
            t = f.read(300_000)
    except OSError:
        return None
    ft = find_field_type(t, fname)
    if ft is None:
        return None
    # Если тип — простой класс того же пакета, смотрим его интерфейсы:
    # List/Map/Set/Collection безопаснее (переменную могут класть в ArrayList и т.п.)
    ft2 = ft
    if re.match(r"^[A-Za-z_]\w*$", ft):
        header = re.search(r"(?:class|interface|enum)\s+%s\b[^{;]*" % re.escape(ft), t)
        seg = header.group(0) if header else ""
        for name, generic in GENERIC_IFACE.items():
            if re.search(r"\bimplements\b[^{;]*\b%s\b" % name, seg):
                ft2 = generic
                break
        else:
            ft2 = pkg_expr + "." + ft   # квалифицируем простое имя пакетом
    return ft2, pkg_expr + "." + cls

total_files = 0
total_fixed = 0
unresolved = []

for root, dirs, files in os.walk(JAVA):
    for fn in files:
        if not fn.endswith(".java"):
            continue
        p = os.path.join(root, fn)
        try:
            with open(p, "r", encoding="utf-8", errors="ignore") as f:
                lines = f.readlines()
        except OSError:
            continue
        if not any("?? " in ln for ln in lines):
            continue
        total_files += 1
        text = "".join(lines)
        warns = {}
        for m in WARN_RX.finditer(text):
            var = re.sub(r"v\d+$", "", m.group(1))
            types = [t.strip() for t in m.group(2).split(",")]
            warns[var] = types[-1]
        cls_name = os.path.splitext(fn)[0]
        rel_pkg = os.path.relpath(root, JAVA).replace(os.sep, ".")
        fixed_lines = []
        n_fixed_file = 0
        for idx, ln in enumerate(lines):
            m = Q_RX.match(ln)
            if not m:
                fixed_lines.append(ln)
                continue
            indent, var, sep, tail = m.group(1), m.group(2), m.group(3), m.group(4)
            vartype = None
            cast = None
            if sep == "=":
                expr = tail.strip().rstrip(";").strip()
                mn = NEW_RX.match(expr)
                if mn:
                    vartype = mn.group(1)
                    # new Object() + обращение к полям ниже -> это this
                    nxt = "".join(lines[idx + 1: idx + 6])
                    if vartype == "Object" and re.search(r"\b" + re.escape(var) + r"\.(\w+)\s*=", nxt):
                        flds = re.findall(r"\b" + re.escape(var) + r"\.(\w+)\s*=", nxt)
                        if all(find_field_type(text, fl) for fl in flds):
                            vartype = cls_name
                            expr = "this"
                            line = f"{indent}{vartype} {var} = {expr};\n"
                            fixed_lines.append(line); n_fixed_file += 1
                            continue
                    line = f"{indent}{vartype} {var} = {expr};\n"
                    fixed_lines.append(line); n_fixed_file += 1
                    continue
                sm = STATIC_FIELD_RX.match(expr)
                if sm:
                    res = resolve_static(sm.group(1), sm.group(2), sm.group(3))
                    if res:
                        vartype = res[0]
                        cast = vartype
                if vartype is None:
                    fm = re.match(r"^(?:this\.)?(\w+)$", expr)
                    if fm:
                        ftype = find_field_type(text, fm.group(1))
                        # Object не даёт usable-типа (реально там List и т.п.) — тогда WARN
                        if ftype and ftype not in ("Object", "java.lang.Object"):
                            vartype = ftype
                if vartype is None and var in warns:
                    vartype = warns[var]
                    cast = vartype
                if vartype is None:
                    vartype = NAME_HINTS.get(var.lower())
                    cast = vartype
                if vartype is None:
                    vartype = "Object"
                if cast and cast != "Object":
                    line = f"{indent}{vartype} {var} = ({cast}) ({expr});\n"
                else:
                    line = f"{indent}{vartype} {var} = {expr};\n"
                fixed_lines.append(line); n_fixed_file += 1
            else:
                # голое объявление: ?? var;
                if var in warns:
                    vartype = warns[var]
                else:
                    nxt = "".join(lines[idx + 1: idx + 80])
                    am = re.search(r"\b" + re.escape(var) + r"\s*=\s*([^;]+);", nxt)
                    if am:
                        expr = am.group(1).strip()
                        mn = NEW_RX.match(expr)
                        if mn:
                            vartype = mn.group(1)
                        elif var in warns:
                            vartype = warns[var]
                    if vartype is None:
                        vartype = "Object"
                        unresolved.append((os.path.relpath(p, proj), idx + 1, ln.strip()[:80]))
                line = f"{indent}{vartype} {var};\n"
                fixed_lines.append(line); n_fixed_file += 1
        if n_fixed_file:
            with open(p, "w", encoding="utf-8") as f:
                f.writelines(fixed_lines)
            total_fixed += n_fixed_file

print(f"Файлов с '??': {total_files}; заменено выражений: {total_fixed}; неразрешённых голых объявлений: {len(unresolved)}")
for u in unresolved[:25]:
    print("  UNRESOLVED:", u[0], "строка", u[1], "-", u[2])
