#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Вставляет рефлексивную инициализацию final-полей в varargs-конструкторы.
Запуск: fix_finals.py <src-root>"""
import os, re, sys
root = sys.argv[1]
n = 0
for dp, _, fs in os.walk(root):
    for fn in fs:
        if not fn.endswith(".java"):
            continue
        p = os.path.join(dp, fn)
        try:
            with open(p, encoding="utf-8", errors="ignore") as f:
                src = f.read()
        except OSError:
            continue
        name = fn[:-5]
        old = "public %s(Object... a) {\n    }" % name
        if old not in src:
            continue
        new = ("public %s(Object... a) {\n"
               "        for (java.lang.reflect.Field f : %s.class.getDeclaredFields()) {\n"
               "            try {\n"
               "                f.setAccessible(true);\n"
               "                f.set(this, null);\n"
               "            } catch (Exception e) {\n"
               "            }\n"
               "        }\n"
               "    }") % (name, name)
        src = src.replace(old, new, 1)
        with open(p, "w", encoding="utf-8") as f:
            f.write(src)
        n += 1
print(f"fix_finals: рефлексия в {n} конструкторах")
