#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка соответствия типов: id в разметке -> класс вида, и как этот id
приводится в Java-коде. Несовпадение даёт мгновенное падение (ClassCastException).
"""
import glob
import os
import re
import sys

# родитель -> совместимые классы (наследники)
CHAIN = {
    'View': ['View', 'TextView', 'EditText', 'TextInputEditText', 'Button', 'MaterialButton',
             'ImageButton', 'ImageView', 'ShapeableImageView', 'AvatarView', 'FrameLayout',
             'LinearLayout', 'RelativeLayout', 'ScrollView', 'NestedScrollView', 'RecyclerView',
             'ViewGroup', 'ProgressBar', 'LinearProgressIndicator', 'Toolbar', 'MaterialToolbar',
             'Switch', 'SwitchCompat', 'MaterialSwitch', 'RadioGroup', 'RadioButton',
             'MaterialRadioButton', 'MaterialSwitch', 'Space', 'ViewStub', 'MaterialCardView',
             'ProgressBar', 'VoiceWaveView', 'CircleMaskView', 'VideoView', 'SurfaceView'],
    'ViewGroup': ['ViewGroup', 'FrameLayout', 'LinearLayout', 'RelativeLayout', 'ScrollView',
                  'NestedScrollView', 'RecyclerView', 'Toolbar', 'MaterialToolbar', 'RadioGroup'],
    'LinearLayout': ['LinearLayout', 'RadioGroup'],
    'FrameLayout': ['FrameLayout'],
    'ScrollView': ['ScrollView'],
    'TextView': ['TextView', 'EditText', 'TextInputEditText', 'Button', 'MaterialButton',
                 'MaterialSwitch', 'RadioButton', 'MaterialRadioButton'],
    'MaterialToolbar': ['MaterialToolbar', 'Toolbar'],
    'RecyclerView': ['RecyclerView'],
    'View': ['View'],
}

SHORT = {}
for k in list(CHAIN):
    SHORT[k.split('.')[-1]] = k.split('.')[-1]


def short(name):
    return name.split('.')[-1]


def xml_types():
    types = {}
    for path in glob.glob('app/src/main/res/layout/*.xml'):
        text = open(path, encoding='utf-8').read()
        for m in re.finditer(r'<([A-Za-z_][\w.]*)((?:[^<>]|"[^"]*")*?)(/?)>', text, re.S):
            tag = m.group(1)
            attrs = m.group(2)
            idm = re.search(r'android:id="@\+?id/(\w+)"', attrs)
            if idm:
                types[idm.group(1)] = (short(tag), path)
    return types


def compatible(xml_cls, java_cls):
    if xml_cls == java_cls:
        return True
    xml_ok = CHAIN.get(xml_cls, CHAIN.get('View'))
    return java_cls in xml_ok


def main():
    types = xml_types()
    problems = []
    for path in glob.glob('app/src/main/java/**/*.java', recursive=True):
        text = open(path, encoding='utf-8').read()
        # (Тип) findViewById(R.id.x)
        for m in re.finditer(r'\(\s*([A-Za-z_][\w.]*)\s*\)\s*findViewById\(\s*R\.id\.(\w+)\s*\)', text):
            java_cls, vid = short(m.group(1)), m.group(2)
            if vid not in types:
                continue
            xml_cls, _ = types[vid]
            if not compatible(xml_cls, java_cls):
                problems.append('%s: %s объявлен как %s, а приводится к %s'
                                % (path, vid, xml_cls, java_cls))
        # Тип имя = findViewById(R.id.x);
        for m in re.finditer(r'\b([A-Z][\w.]*)\s+\w+\s*=\s*findViewById\(\s*R\.id\.(\w+)\s*\)', text):
            java_cls, vid = short(m.group(1)), m.group(2)
            if vid not in types or java_cls in ('View',):
                continue
            xml_cls, _ = types[vid]
            if not compatible(xml_cls, java_cls):
                problems.append('%s: %s объявлен как %s, а используется как %s'
                                % (path, vid, xml_cls, java_cls))
    for p in sorted(set(problems)):
        print(p)
    print('проверено id:', len(types), '| несовпадений типов:', len(set(problems)))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
