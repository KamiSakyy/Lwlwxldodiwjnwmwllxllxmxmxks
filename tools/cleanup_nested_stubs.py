#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Удаляет ядовитые вложенные стаб-вставки (маркер "// [restore] вложенный стаб")
из java-файлов. Дублируют классы, уже существующие в файлах Outer$Inner.java.
Запуск: python3 cleanup_nested_stubs.py <java-root>
"""
import os, re, sys

root = sys.argv[1]
RX = re.compile(
    r"\n    // \[restore\] вложенный стаб[^\n]*\n"
    r"    public static class \w+<T1,T2,T3,T4> \{\n"
    r"        public \w+\(\) \{\n"
    r"        \}\n"
    r"    \}\n"
)
cleaned = 0
for dirpath, dirs, files in os.walk(root):
    for fn in files:
        if not fn.endswith(".java"):
            continue
        p = os.path.join(dirpath, fn)
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        if "[restore] вложенный стаб" not in src:
            continue
        src2 = RX.sub("\n", src)
        # повторный проход (если вставки подряд)
        while "[restore] вложенный стаб" in src2:
            src3 = RX.sub("\n", src2)
            if src3 == src2:
                break
            src2 = src3
        if src2 != src:
            with open(p, "w", encoding="utf-8") as f:
                f.write(src2)
            cleaned += 1
print(f"Очищено файлов от ядовитых вложенных стабов: {cleaned}")
