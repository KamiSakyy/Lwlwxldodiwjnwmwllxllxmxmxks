#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Конвертер стабов class -> interface по ошибкам "interface expected here".
Безопасность: стаб конвертируется ТОЛЬКО если его имя нигде в логе
не встречается после 'extends' (иначе сломаем наследование).
Запуск: python3 convert_stubs_to_ifaces.py <javac-log> <java-root>
"""
import os, re, sys

log_path, root = sys.argv[1], sys.argv[2]
SRC_MARK = "app/src/main/java/"
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)

iface_needed = set()   # простые имена стабов, требуемые как interface
extends_seen = set()   # имена, используемые как superclass — НЕ трогаем
revert = set()         # имена, ошибочно сконвертированные в interface
for i in err_idx:
    m = ERR.match(lines[i])
    msg = m.group(3)
    code = lines[i + 1].strip() if i + 1 < len(lines) else ""
    if "interface expected here" in msg:
        im = re.search(r"\bimplements\s+([^{}]*)\{", code + " {")
        if not im:
            im = re.search(r"\bimplements\s+([^\{]+)", code)
        if im:
            for tok in im.group(1).split(","):
                t = tok.strip().split("<")[0].strip().split(".")[-1]
                if re.fullmatch(r"[A-Za-z_]\w*", t):
                    iface_needed.add(t)
    em = re.search(r"\bextends\s+([\w.\s,<>\[\]]+?)(?:\s+implements|\s*\{|$)", code)
    if em:
        for tok in em.group(1).split(","):
            t = tok.strip().split("<")[0].strip().split(".")[-1]
            if re.fullmatch(r"[A-Za-z_]\w*", t):
                extends_seen.add(t)
    if "no interface expected here" in msg:
        # стаб ошибочно стал интерфейсом — вернуть в class
        for tok in re.findall(r"[A-Za-z_]\w*", code):
            revert.add(tok)

convert = iface_needed - extends_seen
converted = 0
reverted = 0
skipped_ext = iface_needed & extends_seen

for dirpath, dirs, files in os.walk(root):
    for fn in files:
        name, ext = os.path.splitext(fn)
        if ext != ".java" or name not in convert:
            continue
        p = os.path.join(dirpath, fn)
        try:
            src = open(p, encoding="utf-8", errors="ignore").read()
        except OSError:
            continue
        if "СТАБ" not in src or "public class" not in src:
            continue
        # не конвертируем, если в стабе уже есть члены-реализации (методы с телом кроме конструктора)
        body_has_methods = re.search(r"\n    public (?!%s\()" % re.escape(name), src)
        src2 = re.sub(r"public class %s(<[^>]*>)?\s*\{" % re.escape(name),
                      lambda mm: "public interface %s%s {" % (name, mm.group(1) or ""), src, count=1)
        src2 = re.sub(r"\n    public %s\(\) \{\n    \}\n" % re.escape(name), "\n", src2, count=1)
        if src2 != src:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src2)
            converted += 1

# откат: интерфейс -> класс (если встретилось "no interface expected here")
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        name, ext = os.path.splitext(fn)
        if ext != ".java" or name not in revert:
            continue
        p = os.path.join(dirpath, fn)
        try:
            src = open(p, encoding="utf-8", errors="ignore").read()
        except OSError:
            continue
        if "СТАБ" not in src or "public interface" not in src:
            continue
        src2 = re.sub(r"public interface %s(<[^>]*>)?\s*\{" % re.escape(name),
                      lambda mm: "public class %s%s {\n    public %s() {}" % (name, mm.group(1) or "", name),
                      src, count=1)
        if src2 != src:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src2)
            reverted += 1

print(f"Конвертировано в interface: {converted}; откат в class: {reverted}; "
      f"не тронуто (extends): {len(skipped_ext)}")
