#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 3.5 — Автофикс артефактов декомпиляции jadx (идемпотентный).

Классы фиксов:
  A. Обрезанный заголовок метода: "public static final q01.r v(" — строка
     кончается '(' и далее идёт '/*'-комментарий. Заменяем на заглушку.
  B. static {} блок внутри interface — запрещён; удаляем (только интерфейсы).
  C. Уродливый цикл: for (0; i < i2; i + 1) -> for (i = 0; i < i2; i++).
  D. '?? var' от неудачного вывода типов (в т.ч. 'final ?? var'):
     тип из new X()/поля/WARN-подсказки/имени переменной, иначе Object.
  E. Битые массивы: Boolean[ var -> Boolean[] var; (Type[) -> (Type[]).
  F. Странный каст: ({var}) -> ((Object) var).
"""
import os, re, sys

proj = sys.argv[1]
JAVA = os.path.join(proj, "app", "src", "main", "java")

WARN_RX = re.compile(r"Type inference failed for:\s*(\S+?),\s*types:\s*\[([^\]]+)\]")
Q_RX = re.compile(r"^(\s*)((?:(?:final|abstract|static|private|public|protected|synchronized)\s+)*)(\?\?)\s*(\w+)\s*(=|;)(.*)$")
FIELD_RX_TPL = r"([\w$.]+(?:\s*<[^=;]*?>)?(?:\s*\[\])*)\s+%s\s*(?:=|;)"
NEW_RX = re.compile(r"new\s+([A-Za-z_][\w$.]*)\s*\(")
STATIC_FIELD_RX = re.compile(r"^([a-z][a-z0-9_]*(?:\.[a-z][a-z0-9_]*)*)\.([A-Za-z_]\w*)\.(\w+)$")
NAME_HINTS = {
    "arraylist": "ArrayList", "list": "java.util.List", "map": "java.util.Map",
    "set": "java.util.Set", "hashmap": "java.util.HashMap", "linkedhashmap": "java.util.LinkedHashMap",
    "linkedhashset": "java.util.LinkedHashSet", "iter": "java.util.Iterator", "it": "java.util.Iterator",
}
GENERIC_IFACE = {"List": "java.util.List", "Map": "java.util.Map", "Set": "java.util.Set",
                 "Collection": "java.util.Collection", "Iterable": "java.lang.Iterable"}

# D — тип для '?? var'
def infer_q_type(var, expr, text, warns, lines, idx):
    if expr is not None:
        mn = NEW_RX.match(expr)
        if mn:
            return mn.group(1), False
    sm = STATIC_FIELD_RX.match(expr) if expr else None
    if sm:
        cf = os.path.join(JAVA, sm.group(1).replace(".", os.sep), sm.group(2) + ".java")
        if os.path.isfile(cf):
            try:
                t = open(cf, "r", encoding="utf-8", errors="ignore").read(300_000)
            except OSError:
                t = ""
            fm = re.search(FIELD_RX_TPL % re.escape(sm.group(3)), t)
            if fm:
                ft = fm.group(1).strip()
                if re.match(r"^[A-Za-z_]\w*$", ft):
                    header = re.search(r"(?:class|interface|enum)\s+%s\b[^{;]*" % re.escape(ft), t)
                    seg = header.group(0) if header else ""
                    for name, generic in GENERIC_IFACE.items():
                        if re.search(r"\bimplements\b[^{;]*\b%s\b" % name, seg):
                            return generic, True
                    return sm.group(1) + "." + ft, True
                return ft, True
    if expr:
        fm = re.match(r"^(?:this\.)?(\w+)$", expr)
        if fm:
            ftm = re.search(FIELD_RX_TPL % re.escape(fm.group(1)), text)
            if ftm:
                ft = ftm.group(1).strip()
                if ft not in ("Object", "java.lang.Object"):
                    return ft, False
    base = re.sub(r"v\d+$", "", var)
    if base in warns:
        return warns[base], True
    if var in warns:
        return warns[var], True
    hint = NAME_HINTS.get(var.lower())
    if hint:
        return hint, True
    if expr is None:
        nxt = "".join(lines[idx + 1: idx + 80])
        am = re.search(r"\b" + re.escape(var) + r"\s*=\s*([^;]+);", nxt)
        if am:
            mn = NEW_RX.match(am.group(1).strip())
            if mn:
                return mn.group(1), False
    return "Object", False

def remove_static_block_braces(src):
    """H: удалить все static{...} блоки верхнего уровня (скобочный парсер)."""
    out = []
    i = 0
    n = len(src)
    while True:
        m = re.compile(r"(?:^|\n)(\s*)static\s*\{").search(src, i)
        if not m:
            out.append(src[i:])
            break
        start = m.start()
        brace = src.index("{", m.end() - 1)
        depth = 0
        j = brace
        instr = inlc = inbc = inch = False
        while j < n:
            c = src[j]
            if inbc:
                if src[j:j+2] == "*/": inbc = False; j += 2; continue
            elif inlc:
                if c == "\n": inlc = False
            elif instr:
                if c == "\\": j += 2; continue
                if c == '"': instr = False
            elif inch:
                if c == "\\": j += 2; continue
                if c == "'": inch = False
            else:
                if src[j:j+2] == "//": inlc = True
                elif src[j:j+2] == "/*": inbc = True; j += 1
                elif c == '"': instr = True
                elif c == "'": inch = True
                elif c == "{": depth += 1
                elif c == "}":
                    depth -= 1
                    if depth == 0:
                        break
            j += 1
        end = j + 1
        out.append(src[i:start])
        i = end
    return "".join(out)

stats = {"A": 0, "B": 0, "C": 0, "D": 0, "E": 0, "F": 0, "G": 0, "H": 0, "I": 0, "J": 0}
unresolved = []

for root, dirs, files in os.walk(JAVA):
    for fn in files:
        if not fn.endswith(".java"):
            continue
        p = os.path.join(root, fn)
        try:
            with open(p, "r", encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        orig = src
        lines = src.split("\n")

        # ---------- G: enum X extends Y -> final class X extends Y ----------
        def enum_fix(m2):
            stats["G"] += 1
            cls = m2.group(2)
            return (f"{m2.group(1)}final class {cls} extends {m2.group(3)} {{\n"
                    f"    public static {cls}[] values() {{\n"
                    f"        throw new UnsupportedOperationException(\"enum values()\");\n"
                    f"    }}\n"
                    f"    public static {cls} valueOf(String name) {{\n"
                    f"        throw new UnsupportedOperationException(\"enum valueOf\");\n"
                    f"    }}\n"
                    f"    public {cls}(String name, int ordinal) {{\n"
                    f"        super(name, ordinal);\n"
                    f"    }}")
        src = re.sub(r"^(\s*)(?:public\s+|final\s+)*enum\s+(\w+)\s+extends\s+([\w.]+)\s*(implements\s+[\w.,\s]+)?\{",
                     enum_fix, src, flags=re.M)

        # ---------- H: static{} в интерфейсе (скобочный парсер) ----------
        if re.search(r"(?:^|\n)\s*static\s*\{", src) and re.search(r"^\s*(?:public\s+)?(?:abstract\s+)?interface\s+\w+", src, re.M):
            ns = remove_static_block_braces(src)
            if ns != src:
                stats["H"] += 1
                src = ns
                lines = src.split("\n")
        # безусловная ресинхронизация lines после G/H
        if src != "\n".join(lines):
            lines = src.split("\n")

        # ---------- A: обрезанный заголовок метода ----------
        out = []
        i = 0
        while i < len(lines):
            ln = lines[i]
            m = re.match(r"^(\s*)((?:public|protected|private|static|final|abstract|synchronized|native|strictfp|\s)*)([\w$.<>\[\],\s?]+?)\s*(\w+)\($", ln)
            if m:
                nxt = lines[i + 1].strip() if i + 1 < len(lines) else ""
                if nxt.startswith("/*"):
                    header = (m.group(2) + m.group(3) + " " + m.group(4)).strip()
                    indent = m.group(1)
                    stub = (f"{indent}{header}() {{\n"
                            f"{indent}    throw new UnsupportedOperationException(\"Method not decompiled\");\n"
                            f"{indent}}}")
                    out.extend(stub.split("\n"))
                    stats["A"] += 1
                    i += 1
                    continue
            out.append(ln)
            i += 1
        lines = out

        # ---------- D: подготовка WARN ----------
        text = "\n".join(lines)
        warns = {}
        for m in WARN_RX.finditer(text):
            key = re.sub(r"v\d+$", "", m.group(1))
            warns[key] = [t.strip() for t in m.group(2).split(",")][-1]

        # ---------- построчные C, D, E, F ----------
        cls_name = os.path.splitext(fn)[0]
        changed = False
        for idx, ln in enumerate(lines):
            orig_ln = ln
            # C: for (0; a < b; i + 1)
            ln = re.sub(r"for\s*\(\s*0\s*;\s*(\w+)\s*([<>]=?)\s*([^;]+?);\s*(\w+)\s*\+\s*1\s*\)",
                        r"for (\1 = 0; \1 \2 \3; \4++)", ln)
            # J: for (?? x = expr; ...) -> int (точечная замена всего '?? v = expr')
            fm = re.search(r"for\s*\(\s*\?\?\s*(\w+)\s*=\s*([^;]+);([^;]*);", ln)
            if fm:
                v, expr2, cond = fm.group(1), fm.group(2).strip(), fm.group(3)
                whole = "?? " + v + " = " + expr2
                if re.fullmatch(r"\d+", expr2):
                    ln = ln.replace(whole, "int " + v + " = " + expr2, 1)
                elif re.search(r"\b" + re.escape(v) + r"\s*[<>]", cond):
                    ln = ln.replace(whole, "int " + v + " = 0", 1)
                stats["J"] += 1
            # E: битые массивы
            ln = re.sub(r"\b([\w.$]+)\[ (\w+)", r"\1[] \2", ln)
            ln = re.sub(r"\b([\w.$]+)\[\)", r"\1[])", ln)
            # F: ({var})
            ln = re.sub(r"\(\{(\w+)\}\)", r"((Object) \1)", ln)
            if ln != orig_ln:
                stats["E"] += len(re.findall(r"\[\s\]?\s?\(", orig_ln))  # грубо, для статистики не критично
                stats["C"] += 1 if "for (" in ln and "for (0;" in orig_ln else 0
                changed = True
            # D: '??'
            m = Q_RX.match(ln)
            if m:
                indent, mods, var, sep, tail = m.group(1), m.group(2), m.group(4), m.group(5), m.group(6)
                if sep == "=":
                    expr = tail.strip().rstrip(";").strip()
                    vartype, need_cast = infer_q_type(var, expr, text, warns, lines, idx)
                    if vartype == "Object" and need_cast is False:
                        unresolved.append((os.path.relpath(p, proj), idx + 1, ln.strip()[:70]))
                    if need_cast and not expr.startswith("new ") and vartype != "Object":
                        line = f"{indent}{mods}{vartype} {var} = ({vartype}) ({expr});"
                    else:
                        line = f"{indent}{mods}{vartype} {var} = {expr};"
                else:
                    vartype, _ = infer_q_type(var, None, text, warns, lines, idx)
                    if vartype == "Object":
                        unresolved.append((os.path.relpath(p, proj), idx + 1, ln.strip()[:70]))
                    line = f"{indent}{mods}{vartype} {var};"
                lines[idx] = line
                stats["D"] += 1
                changed = True
            elif ln != lines[idx]:
                lines[idx] = ln
                changed = True
            elif ln != orig_ln:
                lines[idx] = ln
                changed = True

        new_src = "\n".join(lines)
        if new_src != orig:
            with open(p, "w", encoding="utf-8") as f:
                f.write(new_src)

print("Статистика фиксов:", stats)
print(f"Неразрешённых '??' (поставлен Object): {len(unresolved)}")
for u in unresolved[:20]:
    print("  ", u[0], u[1], u[2])
