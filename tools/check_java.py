#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Структурная проверка Java-файлов без компилятора: скобки (), {}, [] с учётом
строк, символов и комментариев. Ловит сломанный код (лишняя/недостающая скобка)
до сборки на GitHub."""
import glob
import os
import sys

OPEN = {'(': ')', '{': '}', '[': ']'}
CLOSE = {v: k for k, v in OPEN.items()}


def scan(path):
    text = open(path, encoding='utf-8').read()
    stack = []
    i = 0
    n = len(text)
    line = 1
    problems = []
    while i < n:
        c = text[i]
        if c == '\n':
            line += 1
            i += 1
            continue
        if c == '"' or c == "'":
            quote = c
            i += 1
            while i < n:
                if text[i] == '\\':
                    i += 2
                    continue
                if text[i] == '\n':
                    line += 1
                if text[i] == quote:
                    break
                i += 1
            i += 1
            continue
        if c == '/' and i + 1 < n and text[i + 1] == '/':
            while i < n and text[i] != '\n':
                i += 1
            continue
        if c == '/' and i + 1 < n and text[i + 1] == '*':
            end = text.find('*/', i + 2)
            line += text.count('\n', i, end if end > 0 else n)
            i = (end + 2) if end > 0 else n
            continue
        if c in OPEN:
            stack.append((c, line))
        elif c in CLOSE:
            if not stack:
                problems.append('%s:%d лишняя «%s»' % (path, line, c))
            elif stack[-1][0] != CLOSE[c]:
                problems.append('%s:%d «%s» закрывает «%s» со строки %d'
                                % (path, line, c, stack[-1][0], stack[-1][1]))
                stack.pop()
            else:
                stack.pop()
        i += 1
    for c, ln in stack:
        problems.append('%s:%d не закрыта «%s»' % (path, ln, c))
    return problems


def main():
    files = sorted(glob.glob('app/src/main/java/**/*.java', recursive=True))
    problems = []
    for path in files:
        problems += scan(path)
    for p in problems:
        print(p)
    print('java-файлов:', len(files), '| проблем со скобками:', len(problems))
    return 1 if problems else 0


if __name__ == '__main__':
    sys.exit(main())
