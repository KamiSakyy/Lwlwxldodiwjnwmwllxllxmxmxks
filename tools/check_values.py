#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Проверка значений-перечислений в разметке — то, на чём падает aapt2.

Ловит опечатки вроде android:imeOptions="actionDefault" (такого флага нет),
нечисловые размеры, неизвестные shape/scaleType/gravity и т.п. Быстрее, чем ждать сборку.
"""
import glob
import os
import re
import sys
import xml.etree.ElementTree as ET

os.chdir(os.path.join(os.path.dirname(os.path.abspath(__file__)), '..'))
NS = '{http://schemas.android.com/apk/res/android}'

FLAGS = {
    'imeOptions': {'normal', 'actionUnspecified', 'actionNone', 'actionGo', 'actionSearch',
                   'actionSend', 'actionNext', 'actionDone', 'actionPrevious',
                   'flagNoPersonalizedLearning', 'flagNoFullscreen', 'flagNavigateNext',
                   'flagNavigatePrevious', 'flagNoExtractUi', 'flagNoAccessoryAction',
                   'flagNoEnterAction', 'flagForceAscii'},
    'inputType': {'none', 'text', 'textCapCharacters', 'textCapWords', 'textCapSentences',
                  'textAutoCorrect', 'textAutoComplete', 'textMultiLine', 'textImeMultiLine',
                  'textNoSuggestions', 'textUri', 'textEmailAddress', 'textEmailSubject',
                  'textShortMessage', 'textLongMessage', 'textPersonName', 'textPostalAddress',
                  'textPassword', 'textVisiblePassword', 'textWebEditText', 'textFilter',
                  'textPhonetic', 'textWebEmailAddress', 'textWebPassword',
                  'number', 'numberSigned', 'numberDecimal', 'numberPassword', 'phone',
                  'datetime', 'date', 'time'},
    'orientation': {'horizontal', 'vertical'},
    'visibility': {'visible', 'invisible', 'gone'},
    'ellipsize': {'start', 'middle', 'end', 'marquee', 'none'},
    'scaleType': {'matrix', 'fitXY', 'fitStart', 'fitCenter', 'fitEnd', 'center', 'centerCrop',
                  'centerInside'},
    'shape': {'rectangle', 'oval', 'line', 'ring'},
    'textStyle': {'normal', 'bold', 'italic', 'bold|italic'},
    'layoutDirection': {'ltr', 'rtl', 'locale', 'inherit'},
    'windowLayoutInDisplayCutoutMode': {'default', 'shortEdges', 'never', 'always'},
    'tileMode': {'disabled', 'clamp', 'repeat', 'mirror'},
    'scrollbars': {'none', 'horizontal', 'vertical'},
    'typeface': {'normal', 'sans', 'serif', 'monospace'},
    'gravity': {'top', 'bottom', 'left', 'right', 'start', 'end', 'center', 'center_horizontal',
                'center_vertical', 'fill', 'fill_horizontal', 'fill_vertical', 'clip_horizontal',
                'clip_vertical'},
}

# размеры: обязаны быть числом с dp/sp/px/% (+ допускаются отрицательные)
DIM_RE = re.compile(r'^-?\d+(\.\d+)?(dp|sp|px|dip|pt|in|mm|%)$')
ID_RE = re.compile(r'^@(\+)?(android:)?id/[\w./+-]+$|^\?[\w.:/+-]+$')


def check_flags(name, value, path, problems):
    allowed = FLAGS[name]
    for part in value.split('|'):
        if part and part not in allowed:
            problems.append('%s: android:%s="%s" — недопустимый флаг «%s»' % (path, name, value, part))


def main():
    problems = []
    files = glob.glob('app/src/main/res/layout/*.xml') + glob.glob('app/src/main/res/drawable/*.xml') \
        + glob.glob('app/src/main/res/**/*.xml', recursive=True)
    seen = set()
    for path in sorted(set(files)):
        if path in seen:
            continue
        seen.add(path)
        try:
            root = ET.parse(path).getroot()
        except Exception as e:
            problems.append('%s: битый XML (%s)' % (path, e))
            continue
        for el in root.iter():
            for raw, value in el.attrib.items():
                if not raw.startswith(NS):
                    continue
                attr = raw[len(NS):]
                if attr in FLAGS:
                    check_flags(attr, value, path, problems)
                elif attr in ('layout_width', 'layout_height') and value not in ('match_parent', 'wrap_content', 'fill_parent'):
                    if not DIM_RE.match(value):
                        problems.append('%s: android:%s="%s" — ожидается размер или match_parent/wrap_content'
                                        % (path, attr, value))
                elif attr in ('layout_margin', 'layout_marginStart', 'layout_marginEnd', 'layout_marginTop',
                              'layout_marginBottom', 'padding', 'paddingStart', 'paddingEnd', 'paddingTop',
                              'paddingBottom', 'textSize', 'layout_marginLeft', 'layout_marginRight',
                              'cornerRadius', 'radius', 'strokeWidth', 'width', 'height'):
                    if not DIM_RE.match(value) and not value.startswith('@') and not value.startswith('?'):
                        problems.append('%s: android:%s="%s" — ожидается размер (dp/sp/%)' % (path, attr, value))
    for p in problems:
        print(p)
    print('ошибок значений:', len(problems))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
