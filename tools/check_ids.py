#!/usr/bin/env python3
"""Проверка: R.id из кода обязан быть в той разметке, которую экран надувает."""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), '..')
os.chdir(ROOT)
LAY = 'app/src/main/res/layout'
MEN = 'app/src/main/res/menu'
NS = '{http://schemas.android.com/apk/res/android}'


def ids_of_layout(name, seen=None):
    seen = seen or set()
    if name in seen:
        return set()
    seen.add(name)
    path = os.path.join(LAY, name + '.xml')
    if not os.path.exists(path):
        return None
    out = set()
    for el in ET.parse(path).iter():
        for val in el.attrib.values():
            if val.startswith('@+id/'):
                out.add(val[5:])
            elif val.startswith('@id/'):
                out.add(val[4:])
        if el.tag.split('}')[-1] == 'include':
            ref = el.attrib.get(NS + 'layout') or el.attrib.get('layout')
            if ref and ref.startswith('@layout/'):
                sub = ids_of_layout(ref.split('/')[-1], seen)
                if sub:
                    out |= sub
    return out


def ids_of_menu(name):
    path = os.path.join(MEN, name + '.xml')
    if not os.path.exists(path):
        return None
    out = set()
    for el in ET.parse(path).iter():
        for val in el.attrib.values():
            if val.startswith('@+id/'):
                out.add(val[5:])
            elif val.startswith('@id/'):
                out.add(val[4:])
    return out


LAYOUTS = {os.path.basename(f)[:-4]: ids_of_layout(os.path.basename(f)[:-4])
           for f in glob.glob(LAY + '/*.xml')}
problems = []
for path in glob.glob('app/src/main/java/**/*.java', recursive=True):
    text = open(path, encoding='utf-8').read()
    layouts = set(re.findall(r'setContentView\(R\.layout\.(\w+)\)', text))
    layouts |= set(re.findall(r'inflate\(R\.layout\.(\w+)', text))
    menus = set(re.findall(r'R\.menu\.(\w+)', text))
    if not layouts and not menus:
        continue
    known = set()
    # меню общие для приложения: любой id из любого меню считаем известным,
    # иначе разметки, где меню подключено через app:menu, дают ложные срабатывания
    for mf in glob.glob(MEN + '/*.xml'):
        known |= ids_of_menu(os.path.basename(mf)[:-4]) or set()
    for name in sorted(layouts):
        ids = LAYOUTS.get(name)
        if ids is None:
            problems.append('%s: нет разметки R.layout.%s' % (path, name))
        else:
            known |= ids
    for name in sorted(menus):
        ids = ids_of_menu(name)
        if ids is None:
            problems.append('%s: нет меню R.menu.%s' % (path, name))
        else:
            known |= ids
    for m in re.finditer(r'R\.id\.(\w+)', text):
        name = m.group(1)
        if name in known:
            continue
        line = text[:m.start()].count('\n') + 1
        owners = [k for k, v in LAYOUTS.items() if v and name in v]
        problems.append('%s:%d — R.id.%s НЕТ в %s (есть в: %s)'
                        % (path, line, name, sorted(layouts) or sorted(menus), owners or 'нигде'))
print('\n'.join(problems) if problems else 'ok: все id совпадают с разметкой')
print('проблем:', len(problems))
sys.exit(1 if problems else 0)
