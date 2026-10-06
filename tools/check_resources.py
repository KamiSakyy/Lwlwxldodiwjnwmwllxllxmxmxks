#!/usr/bin/env python3
"""Проверка ссылок на ресурсы (R.* и @тип/имя) по каталогу res — быстрый аналог AAPT-линковки."""
import re, glob, os, xml.etree.ElementTree as ET

os.chdir(os.path.join(os.path.dirname(os.path.abspath(__file__)), '..', 'app/src/main'))

TAGS = {'string','color','dimen','style','integer','bool','array','string-array','integer-array',
        'attr','drawable','mipmap','layout','menu','anim','transition','xml','id','font','plurals'}
res = {k: set() for k in TAGS}

for path in glob.glob('res/**/*.xml', recursive=True):
    rel = os.path.relpath(path, 'res').replace('\\', '/')
    folder = rel.split('/')[0].split('-')[0]
    name = os.path.basename(path).rsplit('.', 1)[0]
    if folder in res:
        res[folder].add(name)
    try:
        tree = ET.parse(path)
    except Exception as e:
        print('БИТЫЙ XML:', path, e)
        continue
    for el in tree.iter():
        tag = el.tag.split('}')[-1]
        n = el.attrib.get('name')
        if n:
            if tag in TAGS:
                res.setdefault(tag, set()).add(n)
            if tag == 'item':
                res.setdefault(el.attrib.get('type', 'item'), set()).add(n)
        for val in el.attrib.values():
            if val.startswith('@+id/'):
                res['id'].add(val[5:])
            elif val.startswith('@id/'):
                res['id'].add(val[4:])

missing = {}
for path in glob.glob('java/**/*.java', recursive=True) + glob.glob('res/**/*.xml', recursive=True) \
        + ['AndroidManifest.xml']:
    text = open(path, encoding='utf-8').read()
    for m in re.finditer(r'\bR\.(string|color|drawable|layout|menu|anim|transition|array|dimen|style|mipmap|xml|id|font|integer|bool|plurals)\.(\w+)', text):
        kind, name = m.group(1), m.group(2)
        if name not in res.get(kind, set()):
            missing.setdefault((kind, name), set()).add(os.path.relpath(path, '.'))
    for m in re.finditer(r'@(string|color|drawable|layout|menu|anim|transition|array|dimen|style|mipmap|xml|font|integer|bool|plurals)/(\w+)', text):
        kind, name = m.group(1), m.group(2)
        if name not in res.get(kind, set()):
            missing.setdefault((kind, name), set()).add(os.path.relpath(path, '.'))

for (kind, name), files in sorted(missing.items()):
    print('НЕТ РЕСУРСА: %s/%s  ← %s' % (kind, name, ', '.join(sorted(files))[:140]))
print('пропущенных ресурсов:', len(missing))
