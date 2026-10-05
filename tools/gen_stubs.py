#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 5 — генератор стабов v2.
Чинит "cannot find symbol: class X":
  1) location: package P  -> отдельный стаб P/X.java
  2) location: class|interface Y -> вложенный класс X ВНУТРЬ файла класса Y
     (Y резолвится по импорту в файле ошибки / единственному кандидату в дереве)
Запуск: python3 gen_stubs.py <javac-log> <java-root> [iface-list]
"""
import os, re, sys, collections

log_path, java_root = sys.argv[1], sys.argv[2]
iface_file = sys.argv[3] if len(sys.argv) > 3 else None
AS_INTERFACE = set()
if iface_file and os.path.isfile(iface_file):
    for ln in open(iface_file, encoding="utf-8", errors="ignore"):
        ln = ln.strip()
        if "." in ln:
            AS_INTERFACE.add(tuple(ln.rsplit(".", 1)))

SRC_MARK = "app/src/main/java/"
ROOT = os.path.join(java_root)
JAVA_LANG_NAMES = {"Object", "String", "Integer", "Long", "Boolean", "Character", "Float",
                   "Double", "Short", "Byte", "Void", "Class", "Enum", "Iterable", "Comparable",
                   "Runnable", "Exception", "Error", "Throwable", "Thread", "Number", "Record",
                   "CharSequence", "Cloneable", "AutoCloseable", "System", "Math"}

# ---------- индекс всех классов дерева ----------
print("Индексация дерева...")
class_index = collections.defaultdict(list)  # имя -> [полные пути .java]
for root, dirs, files in os.walk(ROOT):
    for fn in files:
        if fn.endswith(".java"):
            class_index[fn[:-5]].append(os.path.join(root, fn))

def class_file(name):
    """файл класса по короткому имени; если несколько — None (неоднозначно)"""
    cands = class_index.get(name, [])
    return cands[0] if len(cands) == 1 else (cands[0] if cands else None)

# ---------- парс лога ----------
print("Парс лога...")
ERR = re.compile(r"^(.+?):(\d+): error: (.*)$")
lines = open(log_path, encoding="utf-8", errors="ignore").read().split("\n")
err_idx = [k for k, l in enumerate(lines) if ERR.match(l)]
err_set = set(err_idx)

flat = set()            # (pkg, Class) — отдельные стабы
nested = collections.defaultdict(set)   # файл-хозяин -> {имена вложенных}
nested_iface = collections.defaultdict(set)
skipped = 0

def resolve_host(name, err_file):
    """файл класса-хозяина Y для вложенной ссылки"""
    cands = class_index.get(name, [])
    if not cands:
        return None
    if len(cands) == 1:
        return cands[0]
    # неоднозначно: ищем import ...Y; в файле ошибки
    try:
        src = open(err_file, encoding="utf-8", errors="ignore").read(200_000)
    except OSError:
        return None
    for m in re.finditer(r"import\s+([\w.]+)\.%s\s*;" % re.escape(name), src):
        p = m.group(1).replace(".", os.sep)
        f = os.path.join(ROOT, p, name + ".java")
        if os.path.isfile(f):
            return f
    # пакет файла ошибки
    i = err_file.find(SRC_MARK)
    if i >= 0:
        d = os.path.dirname(err_file[i + len(SRC_MARK):])
        f = os.path.join(ROOT, d, name + ".java")
        if os.path.isfile(f):
            return f
    return None

for i in err_idx:
    m = ERR.match(lines[i])
    path, msg = m.group(1), m.group(3)
    if "cannot find symbol" not in msg:
        continue
    sym = loc = ""
    for j in range(i + 1, min(i + 7, len(lines))):
        if j in err_set:
            break
        if "symbol:" in lines[j]:
            sym = lines[j].strip()
        if "location:" in lines[j]:
            loc = lines[j].strip()
    nmc = re.search(r"symbol:\s+class\s+(\S+)", sym)
    if not nmc:
        continue
    cls = nmc.group(1)
    if cls in JAVA_LANG_NAMES:
        skipped += 1
        continue
    pm = re.search(r"location:\s+package\s+([\w.]+)", loc)
    if pm:
        pkg = pm.group(1)
        if not os.path.isfile(os.path.join(ROOT, pkg.replace(".", os.sep), cls + ".java")):
            flat.add((pkg, cls))
        continue
    lm = re.search(r"location:\s+(?:class|interface)\s+([\w.$]+)", loc)
    if lm:
        host_name = lm.group(1).split(".")[0]
        host = resolve_host(host_name, path)
        if host:
            nested[host].add(cls)
        continue
    skipped += 1

# ---------- генерация плоских стабов ----------
created = 0
for (pkg, cls) in sorted(flat):
    d = os.path.join(ROOT, pkg.replace(".", os.sep))
    fp = os.path.join(d, cls + ".java")
    if os.path.isfile(fp):
        continue
    os.makedirs(d, exist_ok=True)
    kind = "interface" if (pkg, cls) in AS_INTERFACE else "class"
    inner = "" if kind == "interface" else f"    public {cls}() {{\n    }}\n"
    body = (f"package {pkg};\n\n/**\n * СТАБ-{kind.upper()}: сгенерирован автоматически"
            f" (tools/gen_stubs.py).\n * Оригинал потерян при декомпиляции APK.\n */\n"
            f"public {kind} {cls}<T1,T2,T3,T4> {{\n{inner}}}\n")
    with open(fp, "w", encoding="utf-8") as f:
        f.write(body)
    created += 1

# ---------- вложенные стабы ----------
nested_added = 0
for host, names in nested.items():
    try:
        src = open(host, encoding="utf-8", errors="ignore").read()
    except OSError:
        continue
    added = False
    for cls in sorted(names):
        # уже есть вложенный/плоский класс с этим именем?
        if re.search(r"\b(class|interface|enum)\s+%s\b" % re.escape(cls), src):
            continue
        anchor = src.rstrip().rfind("}")
        if anchor <= 0:
            continue
        inner = (f"\n    // [restore] вложенный стаб: оригинал потерян при декомпиляции\n"
                 f"    public static class {cls}<T1,T2,T3,T4> {{\n"
                 f"        public {cls}() {{\n        }}\n    }}\n")
        src = src[:anchor] + inner + src[anchor:]
        added = True
        nested_added += 1
    if added:
        with open(host, "w", encoding="utf-8") as f:
            f.write(src)

print(f"Плоских стабов создано: {created} (уникальных отсутствующих: {len(flat)}); "
      f"вложенных добавлено: {nested_added} в {len([h for h, n in nested.items() if n])} файлах; "
      f"пропущено java.lang/прочее: {skipped}")
