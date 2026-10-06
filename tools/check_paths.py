#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка иконок: pathData должен быть корректным, иначе VectorDrawable
падает при инфляции разметки и приложение закрывается при входе на экран.

Проверяем:
  * команды path data и число аргументов у каждой (M, L, H, V, C, S, Q, T, A, Z);
  * что у иконки есть хотя бы один видимый путь (fill или stroke);
  * что на все иконки, упомянутые в разметке, есть файлы.
"""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), '..')
os.chdir(ROOT)
NS = '{http://schemas.android.com/apk/res/android}'
ARG_COUNT = {'M': 2, 'L': 2, 'H': 1, 'V': 1, 'C': 6, 'S': 4, 'Q': 4, 'T': 2, 'A': 7, 'Z': 0}


def check_path(d):
    """Возвращает текст ошибки или None."""
    if not d or not d.strip():
        return 'пустой pathData'
    tokens = re.findall(r'[MmLlHhVvCcSsQqTtAaZz]|-?\d*\.?\d+(?:[eE][-+]?\d+)?', d)
    if not tokens:
        return 'нет команд'
    i = 0
    cmd = None
    while i < len(tokens):
        tok = tokens[i]
        if re.match(r'^[A-Za-z]$', tok):
            cmd = tok
            i += 1
            if cmd.upper() == 'Z':
                continue
            if cmd.upper() not in ARG_COUNT:
                return 'неизвестная команда %s' % cmd
            continue
        if cmd is None:
            return 'число до команды'
        need = ARG_COUNT[cmd.upper()]
        got = 0
        while got < need and i < len(tokens) and not re.match(r'^[A-Za-z]$', tokens[i]):
            got += 1
            i += 1
        if got != need:
            return 'команда %s ждёт %d чисел, найдено %d' % (cmd, need, got)
        if cmd == 'M':
            cmd = 'L' if cmd == 'M' else 'l'
    return None


def main():
    problems = []
    icons = {}
    for path in sorted(glob.glob('app/src/main/res/drawable/*.xml')):
        name = os.path.basename(path)[:-4]
        try:
            tree = ET.parse(path)
        except Exception as e:
            problems.append('%s: битый XML (%s)' % (path, e))
            continue
        root = tree.getroot()
        if root.tag.split('}')[-1] != 'vector':
            continue
        visible = False
        for el in root.iter():
            if el.tag.split('}')[-1] != 'path':
                continue
            d = el.attrib.get(NS + 'pathData') or el.attrib.get('android:pathData')
            err = check_path(d)
            if err:
                problems.append('%s: %s' % (path, err))
                continue
            fill = el.attrib.get(NS + 'fillColor', '') or el.attrib.get('android:fillColor', '')
            stroke = el.attrib.get(NS + 'strokeColor', '') or el.attrib.get('android:strokeColor', '')
            if (fill and fill.upper() not in ('#00000000', '#0000000', '@NULL')) or stroke:
                visible = True
        icons[name] = visible
        if not visible:
            problems.append('%s: нечего рисовать (нет ни заливки, ни обводки)' % path)

    # ссылки из разметки
    for path in glob.glob('app/src/main/res/**/*.xml', recursive=True):
        text = open(path, encoding='utf-8').read()
        for m in re.finditer(r'@drawable/([a-zA-Z_0-9]+)', text):
            name = m.group(1)
            if name.startswith('ic_') and name not in icons:
                problems.append('%s: нет иконки @drawable/%s' % (path, name))

    for p in problems:
        print(p)
    print('ошибок иконок:', len(problems))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
