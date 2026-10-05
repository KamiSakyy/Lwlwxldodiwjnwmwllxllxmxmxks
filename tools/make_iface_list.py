#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Извлекает из javac-лога список стабов, которые должны быть интерфейсами
("interface expected here" + location: class P.C, где C — наш стаб).
Выход: текстовый файл со строками "package.Class".
Запуск: python3 make_iface_list.py <javac-log> <out-list> <java-root>
"""
import os, re, sys

log_path, out_path, java_root = sys.argv[1], sys.argv[2], sys.argv[3]
SRC_MARK = "app/src/main/java/"
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

def is_stub(pkg, cls):
    fp = os.path.join(java_root, pkg.replace(".", os.sep), cls + ".java")
    if not os.path.isfile(fp):
        return False
    try:
        head = open(fp, encoding="utf-8", errors="ignore").read(2000)
    except OSError:
        return False
    return "СТАБ" in head and "public class" in head

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)
result = []
for i in err_idx:
    m = ERR.match(lines[i])
    msg = m.group(3)
    if "interface expected here" not in msg:
        continue
    loc = ""
    for j in range(i + 1, min(i + 5, len(lines))):
        if j in err_set:
            break
        if "location:" in lines[j]:
            loc = lines[j].strip()
    lm = re.search(r"location:\s+class\s+([\w.]+)", loc)
    if not lm:
        continue
    clsname = lm.group(1)
    pkg = os.path.dirname(m.group(1))
    i2 = pkg.find(SRC_MARK)
    if i2 < 0:
        continue
    pkg = os.path.dirname(pkg[i2 + len(SRC_MARK):]).replace("/", ".")
    # вложенное имя: pkg.Outer.Nested -> пакет pkg.Outer, класс Nested
    parts = clsname.split(".")
    if len(parts) > 1:
        pkg = pkg + "." + ".".join(parts[:-1])
        clsname = parts[-1]
    if is_stub(pkg, clsname) and pkg + "." + clsname not in result:
        result.append(pkg + "." + clsname)

with open(out_path, "w", encoding="utf-8") as f:
    f.write("\n".join(result))
print(f"Стабов, требующих interface: {len(result)}")
for r in result[:15]:
    print("  ", r)
