#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Точечные структурные фиксы по javac-логу (правим конкретную строку в файле):
  A) "method X(...) is already defined in class C" — два метода с одинаковой
     сигнатурой и разным возвратом (артефакт jadx). Переименовываем метод
     в строке ошибки (по каретке) в <имя>_dup.
  B) "cyclic inheritance involving X" — убираем extends-клазу в строке ошибки.
  C) "modifier ... not allowed here" — убираем модификатор в строке ошибки.
  D) "constructor X cannot be applied" — varargs-конструктор (как раньше).
  E) "method valueOf in class Enum<E>..." — valueOf/values (как раньше).
Запуск: python3 fix_from_log.py <javac-log> <java-root>
"""
import os, re, sys, collections

log_path, root = sys.argv[1], sys.argv[2]
SRC_MARK = "app/src/main/java/"
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

print("Индексация...")
idx = collections.defaultdict(list)
for dp, _, fs in os.walk(root):
    for fn in fs:
        if fn.endswith(".java"):
            idx[fn[:-5]].append(os.path.join(dp, fn))

def class_file(name, err_file):
    cands = idx.get(name, [])
    if not cands:
        return None
    if len(cands) == 1:
        return cands[0]
    d = os.path.dirname(err_file)
    for c in cands:
        if os.path.dirname(c) == d:
            return c
    return cands[0]

def caret_token(lines, i):
    """токен (qualified) под кареткой javac"""
    codeline = lines[i + 1] if i + 1 < len(lines) else ""
    caret = lines[i + 2] if i + 2 < len(lines) else ""
    col = caret.find("^")
    if col < 0:
        return None, codeline
    tok = None
    for mtok in re.finditer(r"[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*", codeline):
        if mtok.start() <= col < mtok.end():
            tok = mtok.group(0)
            break
    if tok is None:
        for mtok in reversed(list(re.finditer(r"[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*", codeline[:col + 1]))):
            tok = mtok.group(0)
            break
    return tok, codeline

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)

# собираем правки: (файл, строка) -> список действий
edits = collections.defaultdict(list)   # файл -> [(line_no, action, payload)]
ctor_classes = set()
valueOf_classes = set()

for i in err_idx:
    m = ERR.match(lines[i])
    path, lno, msg = m.group(1), int(m.group(2)), m.group(3)
    rel = path
    j = rel.find(SRC_MARK)
    if j < 0:
        continue
    rel = rel[j + len(SRC_MARK):]
    tok, codeline = caret_token(lines, i)

    if "is already defined in class" in msg and msg.startswith("method "):
        if tok and "/" in rel:
            edits[rel].append((lno, "rename", tok))
    elif "cyclic inheritance" in msg:
        if tok:
            edits[rel].append((lno, "drop_extends", tok))
    elif msg.startswith("modifier ") and "not allowed here" in msg:
        edits[rel].append((lno, "strip_public", None))
    elif "cannot be applied" in msg and msg.startswith("constructor "):
        cm = re.match(r"constructor\s+(\w+)\s+in class", msg)
        if cm and cm.group(1) != "Enum":
            ctor_classes.add((cm.group(1), rel))
    elif msg.startswith("method valueOf in class Enum"):
        lm = re.search(r"location:\s+class\s+(\S+)", "\n".join(lines[i+1:i+7]))
        if lm:
            valueOf_classes.add((lm.group(1), rel))

# ---- применяем построчные правки ----
by_file = collections.defaultdict(list)
for rel, ops in edits.items():
    for (lno, act, payload) in ops:
        by_file[rel].append((lno, act, payload))

applied = {"rename": 0, "drop_extends": 0, "strip_public": 0}
for rel, ops in by_file.items():
    p = os.path.join(root, rel)
    if not os.path.isfile(p):
        continue
    try:
        with open(p, encoding="utf-8", errors="ignore") as f:
            src_lines = f.readlines()
    except OSError:
        continue
    changed = False
    for (lno, act, payload) in sorted(set(ops)):
        k = lno - 1
        if k < 0 or k >= len(src_lines):
            continue
        ln = src_lines[k]
        ln2 = ln
        if act == "rename" and payload:
            # переименовать токен-имя метода (первое вхождение целого слова)
            ln2 = re.sub(r"\b%s(\s*\()" % re.escape(payload), payload + "_dup\\1", ln, count=1)
        elif act == "drop_extends" and payload:
            ln2 = re.sub(r"\s+extends\s+" + re.escape(payload) + r"(?=[\s{])", "", ln, count=1)
            if ln2 == ln:
                ln2 = re.sub(r"\s+extends\s+[\w.$]+", "", ln, count=1)
        elif act == "strip_public":
            ln2 = re.sub(r"^(\s*)public\s+", r"\1", ln, count=1)
        if ln2 != ln:
            src_lines[k] = ln2
            applied[act] += 1
            changed = True
    if changed:
        with open(p, "w", encoding="utf-8") as f:
            f.writelines(src_lines)

# ---- конструкторы / enum (как раньше) ----
added_ctor = added_enum = 0
done_ctor = set()
done_enum = set()
for (name, rel) in ctor_classes:
    if name in done_ctor:
        continue
    d = os.path.dirname(rel)
    cf = None
    cand = os.path.join(root, d, name + ".java")
    if os.path.isfile(cand):
        cf = cand
    else:
        cf = class_file(name, os.path.join(root, rel))
    if not cf:
        continue
    src = open(cf, encoding="utf-8", errors="ignore").read()
    if re.search(r"public\s+interface\s+%s\b" % re.escape(name), src):
        continue
    if re.search(r"%s\s*\(\s*Object\.\.\.\s*\w*\s*\)" % re.escape(name), src):
        continue
    anchor = src.rstrip().rfind("}")
    if anchor <= 0:
        continue
    src = src[:anchor] + f"\n    public {name}(Object... a) {{\n    }}\n" + src[anchor:]
    with open(cf, "w", encoding="utf-8") as f:
        f.write(src)
    done_ctor.add(name)
    added_ctor += 1

for (name, rel) in valueOf_classes:
    if name in done_enum:
        continue
    d = os.path.dirname(rel)
    cand = os.path.join(root, d, name + ".java")
    cf = cand if os.path.isfile(cand) else class_file(name, os.path.join(root, rel))
    if not cf:
        continue
    src = open(cf, encoding="utf-8", errors="ignore").read()
    if "valueOf(String name)" in src:
        continue
    anchor = src.rstrip().rfind("}")
    if anchor <= 0:
        continue
    src = src[:anchor] + (
        f"\n    public static {name}[] values() {{\n"
        f"        throw new UnsupportedOperationException(\"values\");\n"
        f"    }}\n"
        f"    public static {name} valueOf(String name) {{\n"
        f"        throw new UnsupportedOperationException(\"valueOf\");\n"
        f"    }}\n") + src[anchor:]
    with open(cf, "w", encoding="utf-8") as f:
        f.write(src)
    done_enum.add(name)
    added_enum += 1

print(f"переименований методов: {applied['rename']}; extends убрано: {applied['drop_extends']}; "
      f"модификаторов снято: {applied['strip_public']}; varargs-конструкторов: {added_ctor}; "
      f"values/valueOf: {added_enum}")
