#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Конвертер ECJ-лога в javac-подобный формат для фиксёров (только ERROR).
Запуск: parse_ecj.py <ecj-log> <out-log> [src-root]"""
import os, re, sys

log_path, out_path = sys.argv[1], sys.argv[2]
lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
out = []
i = 0
n = len(lines)
host_cache = {}

def host_of(path):
    if path in host_cache:
        return host_cache[path]
    name = None
    try:
        with open(path, encoding="utf-8", errors="ignore") as f:
            for k, l in enumerate(f):
                if k > 120:
                    break
                m = re.search(r"\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)", l)
                if m:
                    name = m.group(1)
                    break
    except OSError:
        pass
    host_cache[path] = name
    return name

while i < n:
    l = lines[i]
    m = re.match(r"^\d+\. ERROR in (.+?) \(at line (\d+)\)$", l)
    if not m:
        i += 1
        continue
    path, lno = m.group(1), int(m.group(2))
    codeline = lines[i + 1] if i + 1 < n else ""
    caret = lines[i + 2] if i + 2 < n else ""
    msg = lines[i + 3].strip() if i + 3 < n else ""

    im = re.match(r"The import ([\w.]+) cannot be resolved", msg)
    if im:
        out.append("%s:%d: error: package %s does not exist" % (path, lno, im.group(1)))
        out.append(codeline)
        out.append(caret)
        i += 4
        continue

    tm = re.match(r"([\w.$]+) cannot be resolved to a (type|variable)", msg)
    if tm:
        tok, kind = tm.group(1), tm.group(2)
        sym = "symbol: %s %s" % ("class" if kind == "type" else "variable", tok.split(".")[-1])
        if "." in tok:
            loc = "location: package %s" % tok.rsplit(".", 1)[0]
        else:
            h = host_of(path)
            loc = "location: class %s" % (h if h else "unknown")
        out.append("%s:%d: error: cannot find symbol" % (path, lno))
        out.append(codeline)
        out.append(caret)
        out.append("  " + sym)
        out.append("  " + loc)
        i += 4
        continue

    if "in the type Enum is not applicable" in msg and "valueOf" in msg:
        out.append("%s:%d: error: method valueOf in class Enum<E> cannot be applied to given types" % (path, lno))
        out.append(codeline)
        out.append(caret)
        i += 4
        continue

    cm2 = re.match(r"The constructor ([\w.$]+)\((.*?)\) is undefined", msg)
    if cm2:
        cls = cm2.group(1).split(".")[-1]
        out.append("%s:%d: error: constructor %s in class %s cannot be applied to given types" % (path, lno, cls, cls))
        out.append(codeline)
        out.append(caret)
        out.append("  required: no arguments")
        i += 4
        continue

    if msg.startswith("Duplicate method"):
        out.append("%s:%d: error: method is already defined in class" % (path, lno))
        out.append(codeline)
        out.append(caret)
        i += 4
        continue

    fm = re.match(r"The blank final field (\w+) may not have been initialized", msg)
    if fm:
        out.append("%s:%d: error: variable %s might not have been initialized" % (path, lno, fm.group(1)))
        out.append(codeline)
        out.append(caret)
        i += 4
        continue

    cm3 = re.match(r"The hierarchy of the type (.+?) is inconsistent", msg)
    if cm3:
        out.append("%s:%d: error: cyclic inheritance involving %s" % (path, lno, cm3.group(1).split(".")[-1]))
        out.append(codeline)
        out.append(caret)
        i += 4
        continue

    if msg:
        out.append("%s:%d: error: %s" % (path, lno, msg[:200]))
        out.append(codeline)
        out.append(caret)
    i += 4

with open(out_path, "w", encoding="utf-8") as f:
    f.write("\n".join(out) + "\n")
print("конвертировано ошибок:", sum(1 for l in out if ": error: " in l))
