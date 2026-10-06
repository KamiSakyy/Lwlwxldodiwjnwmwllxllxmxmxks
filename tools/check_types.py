#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка типов: findViewById(R.id.x) должен попадать в поле/переменную, чей тип
является предком виджета из разметки. Ловит ClassCastException прямо при открытии экрана —
именно так приложение падало при входе в чат (chat_pinned = LinearLayout в поле ImageView).
"""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), '..')
os.chdir(ROOT)
LAY = 'app/src/main/res/layout'
JAVA = 'app/src/main/java'

# Родительские связи виджетов Android/Material (кто является предком кого).
PARENTS = {
    'View': [],
    'ImageView': ['View'],
    'ImageButton': ['ImageView'],
    'ShapeableImageView': ['ImageView'],
    'FloatingActionButton': ['ImageButton'],
    'TextView': ['View'],
    'EditText': ['TextView'],
    'TextInputEditText': ['EditText'],
    'Button': ['TextView'],
    'MaterialButton': ['Button'],
    'CompoundButton': ['Button'],
    'SwitchCompat': ['CompoundButton'],
    'MaterialSwitch': ['SwitchCompat'],
    'RadioButton': ['CompoundButton'],
    'MaterialRadioButton': ['RadioButton'],
    'ProgressBar': ['View'],
    'LinearProgressIndicator': ['ProgressBar'],
    'ViewGroup': ['View'],
    'FrameLayout': ['ViewGroup'],
    'LinearLayout': ['ViewGroup'],
    'GridLayout': ['ViewGroup'],
    'RecyclerView': ['ViewGroup'],
    'Toolbar': ['ViewGroup'],
    'MaterialToolbar': ['Toolbar'],
    'TextInputLayout': ['LinearLayout'],
    'SurfaceView': ['View'],
    'VideoView': ['SurfaceView'],
    'Space': ['View'],
}

SHORT = {
    'MaterialToolbar': 'com.google.android.material.appbar.MaterialToolbar',
    'MaterialButton': 'com.google.android.material.button.MaterialButton',
    'MaterialSwitch': 'com.google.android.material.materialswitch.MaterialSwitch',
    'MaterialRadioButton': 'com.google.android.material.radiobutton.MaterialRadioButton',
    'ShapeableImageView': 'com.google.android.material.imageview.ShapeableImageView',
    'LinearProgressIndicator': 'com.google.android.material.progressindicator.LinearProgressIndicator',
    'FloatingActionButton': 'com.google.android.material.floatingactionbutton.FloatingActionButton',
    'TextInputLayout': 'com.google.android.material.textfield.TextInputLayout',
    'TextInputEditText': 'com.google.android.material.textfield.TextInputEditText',
    'RecyclerView': 'androidx.recyclerview.widget.RecyclerView',
    'SwitchCompat': 'androidx.appcompat.widget.SwitchCompat',
}


def is_a(child, parent):
    """child является наследником parent?"""
    if child == parent:
        return True
    seen = set()
    stack = [child]
    while stack:
        cur = stack.pop()
        if cur in seen:
            continue
        seen.add(cur)
        for up in PARENTS.get(cur, []):
            if up == parent:
                return True
            stack.append(up)
    return False


def layout_types():
    """id -> имя класса виджета в разметке (по всем файлам)."""
    out = {}
    for path in glob.glob(os.path.join(LAY, '*.xml')):
        for el in ET.parse(path).getroot().iter():
            tag = el.tag.split('}')[-1]
            name = el.get('{http://schemas.android.com/apk/res/android}id')
            if not name or not name.startswith('@+id/'):
                continue
            cls = tag.split('.')[-1]
            out.setdefault(name[5:], set()).add(cls)
    return out


DECL = re.compile(r'(?:private|protected|public|final|static|\s)*([A-Z][A-Za-z0-9_<>]*(?:\[\])?)\s+(\w+)\s*[;=]')


def java_types(path):
    """локальные типы: имя поля/переменной -> тип (по объявлениям в файле)."""
    text = open(path, encoding='utf-8').read()
    types = {}
    for m in DECL.finditer(text):
        types.setdefault(m.group(2), m.group(1))
    for m in re.finditer(r'\(([A-Z][A-Za-z0-9_]*)\)\s*[a-zA-Z0-9_.]*findViewById', text):
        pass
    return types, text


def main():
    ltypes = layout_types()
    problems = []
    for path in glob.glob(JAVA + '/**/*.java', recursive=True):
        types, text = java_types(path)
        # a) присваивания полям/переменным
        for m in re.finditer(r'(\w+)\s*=\s*(?:\(([A-Z][A-Za-z0-9_]*)\)\s*)?(?:(\w+)\.)?findViewById\(R\.id\.(\w+)\)', text):
            var, cast, _, rid = m.group(1), m.group(2), m.group(3), m.group(4)
            declared = cast or types.get(var)
            if not declared or rid not in ltypes:
                continue
            declared = declared.split('<')[0].rstrip('[]')
            if declared not in PARENTS:
                continue
            for actual in ltypes[rid]:
                if actual not in PARENTS:
                    continue
                if not is_a(actual, declared):
                    line = text[:m.start()].count('\n') + 1
                    problems.append('%s:%d — %s объявлен как %s, а в разметке %s'
                                    % (path, line, var, declared, actual))
        # b) явные приведения
        for m in re.finditer(r'\(([A-Z][A-Za-z0-9_]*)\)\s*\w*\.?findViewById\(R\.id\.(\w+)\)', text):
            declared, rid = m.group(1), m.group(2)
            if declared not in PARENTS or rid not in ltypes:
                continue
            for actual in ltypes[rid]:
                if actual in PARENTS and not is_a(actual, declared):
                    line = text[:m.start()].count('\n') + 1
                    problems.append('%s:%d — приведение к %s, а в разметке %s (id %s)'
                                    % (path, line, declared, actual, rid))
    for p in sorted(set(problems)):
        print(p)
    print('проблем:', len(set(problems)))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
