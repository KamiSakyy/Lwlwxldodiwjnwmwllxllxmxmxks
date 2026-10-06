#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка ссылок из Java на ресурсы: R.drawable.*, R.string.*, R.color.*,
R.raw.*, R.id.*, R.menu.*, R.layout.*, R.anim.* — нет ли ссылок на несуществующее
(это мгновенное падение при показе экрана).
"""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

NS = '{http://schemas.android.com/apk/res/android}'


def res_dirs():
    return glob.glob('app/src/main/res/*')


def names_in(kind):
    found = set()
    for folder in glob.glob('app/src/main/res/%s*' % kind):
        for path in glob.glob(os.path.join(folder, '*')):
            base = os.path.basename(path)
            if '.' in base:
                stem, ext = base.rsplit('.', 1)
                if ext in ('xml', 'png', 'jpg', 'jpeg', 'webp', '9'):
                    found.add(stem)
            else:
                found.add(base)
    return found


def values_names(kinds):
    found = set()
    for path in glob.glob('app/src/main/res/values*/*.xml'):
        try:
            root = ET.parse(path).getroot()
        except Exception:
            continue
        for el in root:
            tag = el.tag.split('}')[-1]
            if tag in kinds and 'name' in el.attrib:
                found.add(el.attrib['name'])
    return found


def main():
    known = {
        'drawable': names_in('drawable') | names_in('mipmap'),
        'string': values_names({'string', 'string-array', 'plurals'}),
        'color': values_names({'color'}),
        'raw': names_in('raw'),
        'layout': names_in('layout'),
        'menu': names_in('menu'),
        'xml': names_in('xml'),
        'anim': names_in('anim') | names_in('animator'),
        'style': values_names({'style'}),
        'id': set(),
    }
    for path in glob.glob('app/src/main/res/**/*.xml', recursive=True):
        text = open(path, encoding='utf-8').read()
        known['id'] |= set(re.findall(r'android:id="@\+?id/(\w+)"', text))
    for path in glob.glob('app/src/main/res/menu/*.xml'):
        known['id'] |= set(re.findall(r'android:id="@\+?id/(\w+)"', open(path, encoding='utf-8').read()))

    problems = []
    known['style'] = {n.replace('.', '_') for n in known['style']}
    for path in sorted(glob.glob('app/src/main/java/**/*.java', recursive=True)):
        text = open(path, encoding='utf-8').read()
        text = text.replace('android.R.', 'ANDROID_R.')
        for kind, name in re.findall(r'(?<![\w.])R\.(\w+)\.(\w+)', text):
            if kind not in known:
                continue
            if name not in known[kind]:
                problems.append('%s: нет ресурса R.%s.%s' % (path, kind, name))
    for p in sorted(set(problems)):
        print(p)
    print('проблем со ссылками из Java:', len(set(problems)))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
