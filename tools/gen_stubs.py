#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 5 — генератор стабов для классов, потерянных при декомпиляции APK.
Вход: javac-лог (после синтаксических фиксов). Выход: java-файлы-заглушки.

Логика:
  1) "cannot find symbol / symbol: class X / location: package P" -> стаб P.X
  2) "cannot find symbol / symbol: class X / location: class Y" -> стаб
     <пакет файла с ошибкой>.X (вложенный класс вынесен jadx в отдельный файл)
  3) "package P does not exist" + строка "import P.C;" -> стаб P.C
Существующие файлы не трогаются. Стабы помечаются javadoc.
Запуск: python3 gen_stubs.py <javac-log> <java-root>
"""
import os, re, sys, collections

log_path, java_root = sys.argv[1], sys.argv[2]
SRC_MARK = "app/src/main/java/"

ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")

def pkg_of(path):
    """пакет java-файла по пути"""
    i = path.find(SRC_MARK)
    if i < 0:
        return None
    d = os.path.dirname(path[i + len(SRC_MARK):])
    return d.replace("/", ".") if d else ""

lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)

missing = {}      # (package, class) -> путь файла-стаба, который создать
skip = 0
for i in err_idx:
    m = ERR.match(lines[i])
    path, msg = m.group(1), m.group(3)
    sym = loc = ""
    for j in range(i + 1, min(i + 7, len(lines))):
        if j in err_set:
            break
        if "symbol:" in lines[j]:
            sym = lines[j].strip()
        if "location:" in lines[j]:
            loc = lines[j].strip()
    if "cannot find symbol" in msg:
        nmc = re.search(r"symbol:\s+class\s+(\S+)", sym)
        if not nmc:
            continue
        cls = nmc.group(1)
        pm = re.search(r"location:\s+package\s+([\w.]+)", loc)
        if pm:
            pkg = pm.group(1)
        else:
            lm = re.search(r"location:\s+class\s+(\S+)", loc)
            if lm:
                pkg = pkg_of(path)
                if pkg is None:
                    continue
            else:
                continue
        key = (pkg, cls)
        if key in missing:
            continue
        # если файл уже существует — не стабим
        if os.path.isfile(os.path.join(java_root, pkg.replace(".", os.sep), cls + ".java")):
            skip += 1
            continue
        missing[key] = True
    elif "does not exist" in msg:
        pm = re.search(r"package ([\w.]+) does not exist", msg)
        if not pm:
            continue
        pkg = pm.group(1)
        # класс ищем в строке кода ниже (import P.C;)
        for j in range(i + 1, min(i + 4, len(lines))):
            im = re.search(r"import\s+([\w.]+)\.(\w+)\s*;", lines[j])
            if im and im.group(1) == pkg:
                key = (pkg, im.group(2))
                if key not in missing and not os.path.isfile(
                        os.path.join(java_root, pkg.replace(".", os.sep), im.group(2) + ".java")):
                    missing[key] = True
                break

created = 0
for (pkg, cls) in sorted(missing):
    d = os.path.join(java_root, pkg.replace(".", os.sep))
    try:
        os.makedirs(d, exist_ok=True)
        fp = os.path.join(d, cls + ".java")
        body = (
            f"package {pkg};\n\n"
            f"/**\n"
            f" * СТАБ-КЛАСС: сгенерирован автоматически (tools/gen_stubs.py).\n"
            f" * Оригинал был потерян при декомпиляции APK (не попал в выгрузку).\n"
            f" * Заглушка восстанавливает компиляцию проекта.\n"
            f" */\n"
            f"public class {cls}<T1,T2,T3,T4> {{\n"
            f"    public {cls}() {{\n"
            f"    }}\n"
            f"}}\n"
        )
        with open(fp, "w", encoding="utf-8") as f:
            f.write(body)
        created += 1
    except OSError as e:
        print("не удалось создать", pkg, cls, e)

print(f"Создано стабов: {created}; пропущено существующих: {skip}; всего уникальных отсутствующих: {len(missing)}")
by_pkg = collections.Counter(p for p, _ in missing)
print("Топ-10 пакетов:")
for p, c in by_pkg.most_common(10):
    print(f"  {c:4} × {p}")
