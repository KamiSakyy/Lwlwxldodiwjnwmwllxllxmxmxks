#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка всех ссылок на ресурсы: @drawable, @color, @string, @style, @dimen, @anim,
@layout, @menu, @xml, @array, @font, @mipmap — в разметке, меню, drawable, темах и манифесте.

Ловит именно те ошибки, из-за которых сборка падает на aapt2 (а в приложении — «пустые»
элементы): опечатку в имени файла, забытый цвет, отсутствующий стиль.
"""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), '..')
os.chdir(ROOT)
RES = 'app/src/main/res'

FILE_KINDS = ['drawable', 'layout', 'menu', 'anim', 'xml', 'mipmap', 'raw', 'font', 'navigation']
VALUE_KINDS = ['color', 'string', 'style', 'dimen', 'bool', 'integer', 'array', 'string-array',
               'integer-array', 'attr', 'fraction', 'plurals', 'font', 'drawable']


def collect():
    defined = {kind: set() for kind in FILE_KINDS + VALUE_KINDS}
    for kind in FILE_KINDS:
        for folder in glob.glob(os.path.join(RES, kind + '*')) + glob.glob(os.path.join(RES, kind)):
            if os.path.isfile(folder):
                defined[kind].add(os.path.basename(folder).rsplit('.', 1)[0])
                continue
            for path in glob.glob(os.path.join(folder, '**'), recursive=True):
                if os.path.isfile(path):
                    defined[kind].add(os.path.basename(path).rsplit('.', 1)[0])
    for path in glob.glob(os.path.join(RES, 'values*', '*.xml')):
        try:
            root = ET.parse(path).getroot()
        except ET.ParseError as exc:
            print('ОШИБКА XML: %s — %s' % (path, exc))
            continue
        for el in root:
            kind = el.tag
            if kind in VALUE_KINDS:
                name = el.get('name')
                if name:
                    defined[kind].add(name.replace('.', '_'))
                    if kind == 'string':
                        defined[kind].add(name)
    return defined


def scan(defined):
    problems = []
    pattern = re.compile(r'@(?!android:|null|\+|id/|\*)([a-z]+)/([A-Za-z0-9_.]+)')
    files = []
    for sub in ['layout', 'menu', 'drawable', 'anim', 'xml', 'values', 'values-night', 'values-v31',
                'mipmap-anydpi-v26']:
        files += glob.glob(os.path.join(RES, sub, '**', '*.xml'), recursive=True)
    files += ['app/src/main/AndroidManifest.xml']
    for path in sorted(set(files)):
        text = open(path, encoding='utf-8').read()
        for m in pattern.finditer(text):
            kind, name = m.group(1), m.group(2)
            if kind not in defined:
                continue
            pool = defined[kind]
            if name in pool or name.replace('.', '_') in pool:
                continue
            if kind == 'style' and name.split('.')[0] in (
                    'Widget', 'TextAppearance', 'Theme', 'ThemeOverlay', 'Base'):
                # стили Material/AppCompat приходят из библиотеки, локально их нет
                if name.startswith(('Widget.Material', 'Widget.AppCompat', 'TextAppearance.Material',
                                    'Theme.Material', 'ThemeOverlay.Material', 'Base.')):
                    continue
            line = text[:m.start()].count('\n') + 1
            problems.append('%s:%d — нет %s/%s' % (path, line, kind, name))
    return problems


def check_implicit_parents(defined):
    """Стиль вида A.B.C без parent= заставит aapt искать родителя по имени (A.B) —
    если такого стиля нет, сборка падает: 'resource style/A.B not found'."""
    problems = []
    for path in glob.glob(os.path.join(RES, 'values*', '*.xml')):
        root = ET.parse(path).getroot()
        for el in root:
            if el.tag != 'style':
                continue
            name = el.get('name') or ''
            if el.get('parent') is not None or '.' not in name:
                continue
            base = name.rsplit('.', 1)[0]
            local = name.replace('.', '_')
            if base.replace('.', '_') in defined['style'] or base in defined['style']:
                continue
            if base.startswith(('Widget.Material', 'TextAppearance.Material', 'Theme.Material',
                                'ThemeOverlay.Material', 'Widget.AppCompat', 'Theme.AppCompat')):
                continue
            problems.append('%s — стиль %s без parent, а базового стиля %s нет'
                            % (path, name, base))
    return problems


def main():
    defined = collect()
    problems = scan(defined) + check_implicit_parents(defined)
    for p in problems:
        print(p)
    print('проблем:', len(problems))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
