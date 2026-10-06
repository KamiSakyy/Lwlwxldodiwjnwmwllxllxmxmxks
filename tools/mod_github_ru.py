#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
GitHub RU MOD — правки дерева, распакованного apktool из официального com.github.android.

Что делает:
  1) манифест: убирает android:allow (не понимает aapt2), глушит Firebase/аналитику, убирает AD_ID/ADSERVICES;
  2) (необязательно, флаг --rename-package) переименование пакета в com.github.rudroid
     с защитой OAuth-редиректов github://com.github.android/...; по умолчанию приложение
     остаётся официальным com.github.android;
  3) скачивание файлов: класс GHRDownloadListener (DownloadManager) + внедрение в WebView'ы;
  4) редактор: крупнее шрифт (dimens) + межстрочный интервал (smali);
  5) дизайн: новая иконка (градиент GitHub-зелёный + белый кот) и светлый фон;
  6) русская локализация values-ru (из исходника пользователя, только существующие ключи) + locales_config;
  7) вес: удаление прочих языков, чистка старых подписей META-INF.
"""
import os
import re
import sys
import glob
import shutil
import subprocess

DEC = sys.argv[1] if len(sys.argv) > 1 else 'work/dec'
RENAME_ONLY = '--rename-only' in sys.argv
RENAME_PKG = '--rename-package' in sys.argv        # по умолчанию приложение остаётся официальным
GRADIENT_ICON = '--gradient-icon' in sys.argv      # по умолчанию иконка официальная
SPLITS = None
for _i, _a in enumerate(sys.argv):
    if _a == '--splits' and _i + 1 < len(sys.argv):
        SPLITS = sys.argv[_i + 1]
NO_RENAME = '--no-rename' in sys.argv
RU_DIR = None
for i, a in enumerate(sys.argv):
    if a == '--ru-dir' and i + 1 < len(sys.argv):
        RU_DIR = sys.argv[i + 1]

DEF = "com.github.android"
NEW = "com.github.rudroid" if RENAME_PKG else DEF
PROT = ["github://com.github.android"]  # oauth/appauth — НЕ трогать (зашито на сервере)

STATS = {}


def log(*a):
    print("[mod]", *a, flush=True)


def read(p):
    with open(p, encoding='utf-8', errors='replace') as f:
        return f.read()


def write(p, s):
    os.makedirs(os.path.dirname(p), exist_ok=True)
    with open(p, 'w', encoding='utf-8') as f:
        f.write(s)


def rename_text(s):
    ph = {}
    for i, p in enumerate(PROT):
        t = "@@P%d@@" % i
        if p in s:
            s = s.replace(p, t)
            ph[t] = p
    s = s.replace("com/github/android", "com/github/rudroid").replace(DEF, NEW)
    for t, p in ph.items():
        s = s.replace(t, p)
    return s


def replace_or_fail(s, old, new, what):
    if old not in s:
        raise SystemExit("[mod] НЕ НАЙДЕНО: " + what)
    return s.replace(old, new, 1)


# ---------------------------------------------------------------- 1. манифест
man = os.path.join(DEC, 'AndroidManifest.xml')
s = read(man)
# aapt2 в apktool 2.9.3 не знает <uri-relative-filter-group> (API 35+) и его атрибуты
n_allow = len(re.findall(r'<uri-relative-filter-group', s))
s = re.sub(r'\s*<activity-alias[^>]*DeepLinkAliasActivityApi35.*?</activity-alias>', '', s, flags=re.S)
s = re.sub(r'\s*<uri-relative-filter-group.*?</uri-relative-filter-group>', '', s, flags=re.S)
# одиночный APK: атрибуты бандл-сплитов снимаем, иначе установка может отвергаться
s = re.sub(r'\s+android:requiredSplitTypes="[^"]*"', '', s)
s = re.sub(r'\s+android:splitTypes="[^"]*"', '', s)
s = s.replace('android:host="com.github.android"', '@@OAUTHHOST@@')
s = rename_text(s)
s = s.replace('@@OAUTHHOST@@', 'android:host="com.github.android"')
s = s.replace('package="%s"' % DEF, 'package="%s"' % NEW)

fb = ("<meta-data android:name=\"firebase_analytics_collection_enabled\" android:value=\"false\"/>\n"
      "        <meta-data android:name=\"firebase_analytics_collection_deactivated\" android:value=\"true\"/>\n"
      "        <meta-data android:name=\"firebase_crashlytics_collection_enabled\" android:value=\"false\"/>\n"
      "        <meta-data android:name=\"firebase_performance_collection_enabled\" android:value=\"false\"/>\n"
      "        <meta-data android:name=\"google_analytics_adid_collection_enabled\" android:value=\"false\"/>\n"
      "        <meta-data android:name=\"google_analytics_ssaid_collection_enabled\" android:value=\"false\"/>")
if 'firebase_analytics_collection_enabled' not in s:
    s = re.sub(r'(<application\b[^>]*>)', lambda m: m.group(1) + "\n        " + fb, s, count=1)
s = re.sub(r'\s*<uses-permission android:name="com\.google\.android\.gms\.permission\.AD_ID"\s*/>', '', s)
s = re.sub(r'\s*<uses-permission android:name="android\.permission\.ACCESS_ADSERVICES_[A-Z_]*"\s*/>', '', s)
if 'android.permission.POST_NOTIFICATIONS' not in s:
    s = s.replace('<uses-permission', '<uses-permission android:name="android.permission.POST_NOTIFICATIONS"/>\n    <uses-permission', 1)
write(man, s)
STATS['групп путей (API35) убрано'] = n_allow
log('манифест: убран API35-алиас с группами путей, блоков:', n_allow)

yml = os.path.join(DEC, 'apktool.yml')
if os.path.exists(yml) and RENAME_PKG:
    t = read(yml)
    t2 = re.sub(r'(versionName:\s*)(\S+)', r'\g<1>\2-rudroid', t, count=1)
    if t2 != t:
        write(yml, t2)
        log('apktool.yml: versionName -> с суффиксом -rudroid')

# ------------------------------------------------- 2. переименование пакета
# По умолчанию НЕ выполняется: приложение остаётся официальным com.github.android.
# Флаг --rename-package переименовывает код/манифест в com.github.rudroid (как в исходнике
# пользователя), но при этом oauth-хост всё равно остаётся com.github.android.
def rename_package():
    for sm in glob.glob(os.path.join(DEC, 'smali*')):
        old = os.path.join(sm, 'com', 'github', 'android')
        if os.path.isdir(old):
            shutil.move(old, os.path.join(sm, 'com', 'github', 'rudroid'))
            log('каталог:', os.path.relpath(old, DEC), '-> com/github/rudroid')
    try:
        out = subprocess.run(['grep', '-rls', '--include=*.smali', '-e', 'com/github/android', '-e', DEF, DEC],
                             capture_output=True, text=True)
        files = [f for f in out.stdout.split('\n') if f]
    except Exception:
        files = []
        for sm in glob.glob(os.path.join(DEC, 'smali*')):
            for root, _d, fs in os.walk(sm):
                for fn in fs:
                    if fn.endswith('.smali'):
                        p = os.path.join(root, fn)
                        t = read(p)
                        if 'com/github/android' in t or DEF in t:
                            files.append(p)
    changed = 0
    for p in files:
        t = read(p)
        t2 = rename_text(t)
        if t2 != t:
            write(p, t2)
            changed += 1
    STATS['smali изменено'] = changed
    log('переименовано smali-файлов:', changed)
    for base in (os.path.join(DEC, 'res'), os.path.join(DEC, 'assets')):
        for root, _d, fs in os.walk(base):
            for fn in fs:
                p = os.path.join(root, fn)
                try:
                    if os.path.getsize(p) > 2 * 1024 * 1024:
                        continue
                    t = read(p)
                except Exception:
                    continue
                if '\x00' in t[:400]:
                    continue
                if 'com/github/android' in t or DEF in t:
                    write(p, rename_text(t))
    log('res/assets переименованы')


if RENAME_PKG:
    rename_package()

if RENAME_ONLY:
    log('ИТОГ (только переименование):', STATS)
    raise SystemExit(0)

# --------------------------------------------------- 3. скачивание файлов
LISTENER = '''.class public Lcom/github/rudroid/webview/GHRDownloadListener;
.super Ljava/lang/Object;
.implements Landroid/webkit/DownloadListener;

.field private final a:Landroid/content/Context;

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/github/rudroid/webview/GHRDownloadListener;->a:Landroid/content/Context;

    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    :try_start_0
    invoke-static {p1, p3, p4}, Landroid/webkit/URLUtil;->guessFileName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/app/DownloadManager$Request;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v1, p4}, Landroid/app/DownloadManager$Request;->setMimeType(Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    invoke-virtual {v1, v0}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/DownloadManager$Request;->setAllowedOverMetered(Z)Landroid/app/DownloadManager$Request;

    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    iget-object v2, p0, Lcom/github/rudroid/webview/GHRDownloadListener;->a:Landroid/content/Context;

    const-string v3, "download"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/DownloadManager;

    invoke-virtual {v2, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    return-void

    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v2, p0, Lcom/github/rudroid/webview/GHRDownloadListener;->a:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v4

    return-void
.end method
'''

# ВАЖНО: dex #1 (smali/) забит под завязку — ровно 65536 ссылок на методы.
# Любая НОВАЯ ссылка на метод в нём = ошибка сборки. Класс слушателя кладём
# в smali_classes5 (там ~49k свободных слотов), вызовы — только из dex3.
PKGPATH = NEW.replace('.', '/')                       # com/github/android (или rudroid)
target_dir = os.path.join(DEC, 'smali_classes5', *PKGPATH.split('/'), 'webview')
os.makedirs(target_dir, exist_ok=True)
LISTENER = LISTENER.replace('com/github/rudroid', PKGPATH)
LISCLASS = 'L%s/webview/GHRDownloadListener;' % PKGPATH
write(os.path.join(target_dir, 'GHRDownloadListener.smali'), LISTENER)
log('создан GHRDownloadListener.smali в', os.path.relpath(target_dir, DEC))


def inject_webview(path):
    """Добавляет setDownloadListener сразу после setWebViewClient."""
    if not os.path.exists(path):
        log('ПРОПУСК (нет файла):', path)
        return False
    lines = read(path).split('\n')
    hits = [i for i, l in enumerate(lines) if 'Landroid/webkit/WebView;->setWebViewClient' in l]
    if not hits:
        log('ПРОПУСК (нет setWebViewClient):', path)
        return False
    done = 0
    for i in reversed(hits):
        recv = re.search(r'invoke-virtual \{([vp]\d+)', lines[i])
        if not recv:
            continue
        recv = recv.group(1)
        mstart = max(j for j in range(i) if lines[j].startswith('.method'))
        mend = next(j for j in range(i, len(lines)) if lines[j].startswith('.end method'))
        loc_line = next(j for j in range(mstart, i) if lines[j].strip().startswith('.locals'))
        nloc = int(re.search(r'\.locals (\d+)', lines[loc_line]).group(1))
        body = '\n'.join(lines[mstart:mend])
        abs_v = [int(m.group(1)) for m in re.finditer(r'(?<![A-Za-z0-9_])v(\d+)\b', body)]
        if abs_v and max(abs_v) >= nloc:
            raise SystemExit('[mod] %s: в методе есть абсолютные ссылки на параметры (v%d при .locals %d) — инъекция небезопасна' % (path, max(abs_v), nloc))
        lines[loc_line] = lines[loc_line].replace('.locals %d' % nloc, '.locals %d' % (nloc + 2))
        t1, t2 = 'v%d' % nloc, 'v%d' % (nloc + 1)
        ins = [
            '    new-instance %s, %s' % (t1, LISCLASS),
            '',
            '    invoke-virtual {%s}, Landroid/view/View;->getContext()Landroid/content/Context;' % recv,
            '',
            '    move-result-object %s' % t2,
            '',
            '    invoke-direct {%s, %s}, %s-><init>(Landroid/content/Context;)V' % (t1, t2, LISCLASS),
            '',
            '    invoke-virtual {%s, %s}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V' % (recv, t1),
            '',
        ]
        lines[i + 1:i + 1] = ins
        done += 1
    write(path, '\n'.join(lines))
    log('внедрён DownloadListener:', os.path.relpath(path, DEC), 'x%d' % done)
    return True


cnt = 0
for rel in ('smali_classes3/%s/webview/viewholders/f.smali' % PKGPATH,
            'smali_classes3/%s/webview/viewholders/LegacyGitHubWebView.smali' % PKGPATH):
    if inject_webview(os.path.join(DEC, rel)):
        cnt += 1
STATS['DownloadListener внедрён в'] = cnt

# ------------------------------------------- 3b. ресурсы и либы из сплитов
# XAPK разбит на base + config-сплиты (mdpi-растры, arm64-либы). Сплиты сначала
# декодируем apktool'ом (--splits <каталог с декодами>), чтобы ресурсы пришли в
# исходном виде (9-patch с рамкой, текстовый XML), иначе aapt2 их не соберёт.
if SPLITS and os.path.isdir(SPLITS):
    added = 0
    cands = [SPLITS] + [os.path.join(SPLITS, d) for d in sorted(os.listdir(SPLITS))]
    for base in cands:
        if not os.path.isdir(base):
            continue
        for sub in ('res', 'lib'):
            src_root = os.path.join(base, sub)
            if not os.path.isdir(src_root):
                continue
            for root, _d, fs in os.walk(src_root):
                for fn in fs:
                    sp = os.path.join(root, fn)
                    rel = os.path.relpath(sp, base)
                    dst = os.path.join(DEC, rel)
                    if os.path.exists(dst):
                        continue
                    os.makedirs(os.path.dirname(dst), exist_ok=True)
                    shutil.copy2(sp, dst)
                    added += 1
    STATS['файлов из сплитов'] = added
    log('сплиты %s: добавлено файлов %d' % (SPLITS, added))

# ------------------------------------------------------- 4. редактор файлов
for p in glob.glob(os.path.join(DEC, 'res', 'values*', 'dimens.xml')):
    t = read(p)
    if 'code_text_size_s' not in t:
        continue
    def bump(m):
        return '%s%.1fsp%s' % (m.group(1), float(m.group(2)) + 2, m.group(3))
    t2 = re.sub(r'(<dimen name="code_text_size_[a-z]+">)([0-9.]+)sp(</dimen>)', bump, t)
    if t2 != t:
        write(p, t2)
        log('шрифты редактора +2sp:', os.path.relpath(p, DEC))

def free_dex1_method_slot():
    """В dex #1 ровно 65536 ссылок на методы (предел). Чтобы добавить туда
    ссылку на TextView->setLineSpacing(FF)V, убираем одиночный вызов Log.w
    (он больше нигде в dex1 не используется) — счётчик остаётся ровно 65536."""
    ref = 'Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I'
    out = subprocess.run(['grep', '-rl', '--include=*.smali', '-F', ref, os.path.join(DEC, 'smali')],
                         capture_output=True, text=True)
    files = [f for f in out.stdout.split('\n') if f]
    if len(files) != 1:
        log('!! освобождение слота dex1: найдено файлов %d — пропуск' % len(files))
        return False
    p = files[0]
    lines = read(p).split('\n')
    idx = [i for i, l in enumerate(lines) if ref in l]
    if len(idx) != 1:
        return False
    i = idx[0]
    moved = False
    for j in range(i + 1, min(i + 4, len(lines))):
        st = lines[j].strip()
        if st.startswith('move-result'):
            lines[j] = '    const/16 %s, 0x0' % st.split()[1]
            moved = True
            break
    del lines[i]
    write(p, '\n'.join(lines))
    log('dex1: освобождён слот ссылки на метод (Log.w в %s, move-result→const/16: %s)'
        % (os.path.relpath(p, DEC), moved))
    return True


vqi = os.path.join(DEC, 'smali', 'vqi.smali')
if os.path.exists(vqi):
    free_dex1_method_slot()
    t = read(vqi)
    marker = '.method public static a(Ljava/lang/String;IILwqi;Lu8r;Lu8r;Landroid/content/Context;)Landroid/widget/EditText;'
    if marker in t and 'setLineSpacing' not in t:
        start = t.index(marker)
        end = t.index('.end method', start)
        body = t[start:end]
        nloc = int(re.search(r'\.locals (\d+)', body).group(1))
        body2 = body.replace('    .locals %d' % nloc, '    .locals %d' % (nloc + 2), 1)
        ins = ('    const/4 v%d, 0x0\n\n    const v%d, 0x3f933333\n\n'
               '    invoke-virtual {v0, v%d, v%d}, Landroid/widget/TextView;->setLineSpacing(FF)V\n\n'
               '    return-object v0\n') % (nloc, nloc + 1, nloc, nloc + 1)
        body2 = body2.replace('    return-object v0\n', ins, 1)
        t = t[:start] + body2 + t[end:]
        write(vqi, t)
        log('редактор: добавлен setLineSpacing(0, 1.15)')
    else:
        log('редактор: метод в vqi.smali не найден — пропуск')

# -------------------------------------------------------------- 5. дизайн
bg = os.path.join(DEC, 'res', 'drawable', 'ic_launcher_background.xml')
def mod_icon():
    bg = os.path.join(DEC, 'res', 'drawable', 'ic_launcher_background.xml')
    write(bg, '''<?xml version="1.0" encoding="utf-8"?>
    <vector android:height="108.0dip" android:width="108.0dip" android:viewportWidth="108" android:viewportHeight="108"
      xmlns:android="http://schemas.android.com/apk/res/android">
        <path android:pathData="M0,0h108v108h-108z">
            <aapt:attr xmlns:aapt="http://schemas.android.com/aapt" name="android:fillColor">
                <gradient android:startX="0" android:startY="0" android:endX="108" android:endY="108" android:type="linear">
                    <item android:offset="0" android:color="#FF2EA44F"/>
                    <item android:offset="1" android:color="#FF136B2E"/>
                </gradient>
            </aapt:attr>
        </path>
    </vector>
    ''')
    ic = os.path.join(DEC, 'res', 'mipmap-anydpi', 'ic_launcher.xml')
    t = read(ic)
    t2 = t.replace('@color/ic_launcher_background', '@drawable/ic_launcher_background')
    if t2 != t:
        write(ic, t2)
        log('иконка: фон теперь градиент GitHub-зелёный')


if GRADIENT_ICON:
    mod_icon()
else:
    log('иконка: официальная, не меняем')

colors = os.path.join(DEC, 'res', 'values', 'colors.xml')
t = read(colors)
t2 = t.replace('<color name="backgroundPrimary">#ffeff0f5</color>',
               '<color name="backgroundPrimary">#fff6f8fa</color>')
if t2 != t:
    write(colors, t2)
    log('дизайн: светлый фон #f6f8fa')

# ------------------------------------------------- 6. русская локализация
if RU_DIR and os.path.isdir(RU_DIR):
    def names_of(p):
        if not os.path.exists(p):
            return set()
        return set(re.findall(r'<[a-z-]+ name="([^"]+)"', read(p)))

    def shape(t):
        """Набор printf-подстановок: %%1$s и т.п. (для безопасного переноса строк)."""
        toks = re.findall(r'%(\d+\$)?[-#+ 0,(]*\d*(?:\.\d+)?[a-zA-Z%]', t)
        return ' '.join(sorted(toks))

    def shapes_of(p):
        out = {}
        if not os.path.exists(p):
            return out
        for m in re.finditer(r'<([a-z-]+)\b[^>]*name="([^"]+)"[^>]*>(.*?)</\1>', read(p), re.S):
            out[m.group(2)] = shape(m.group(3)) if m.group(1) != 'plurals' else plural_shapes(m.group(3))
        return out

    def plural_shapes(t):
        """{количество: подстановки} — сравнение плюралов по каждому item."""
        return {q: shape(body) for q, body in re.findall(r'<item quantity="([^"]+)">(.*?)</item>', t, re.S)}

    def plural_ok(block, default):
        if default is None:
            return True
        mine = plural_shapes(block)
        for q, s in mine.items():
            if q in default and default[q] != s:
                return False
        return bool(mine)

    our = {'strings': names_of(os.path.join(DEC, 'res', 'values', 'strings.xml')),
           'plurals': names_of(os.path.join(DEC, 'res', 'values', 'plurals.xml')),
           'arrays': names_of(os.path.join(DEC, 'res', 'values', 'arrays.xml'))}
    defsh = {'strings': shapes_of(os.path.join(DEC, 'res', 'values', 'strings.xml')),
             'plurals': shapes_of(os.path.join(DEC, 'res', 'values', 'plurals.xml')),
             'arrays': shapes_of(os.path.join(DEC, 'res', 'values', 'arrays.xml'))}
    out_dir = os.path.join(DEC, 'res', 'values-ru')
    total = 0
    for tag, fn, bucket in (('string', 'strings.xml', 'strings'), ('plurals', 'plurals.xml', 'plurals'),
                            ('string-array', 'arrays.xml', 'arrays')):
        src = os.path.join(RU_DIR, fn)
        if not os.path.exists(src):
            continue
        text = read(src)
        pat = re.compile(r'<%s\b[^>]*name="([^"]+)"[^>]*>.*?</%s>' % (tag, tag), re.S)
        keep, skipped = [], 0
        for m in pat.finditer(text):
            name = m.group(1)
            if name not in our[bucket]:
                continue
            if bucket == 'plurals':
                good = plural_ok(m.group(0), defsh[bucket].get(name))
            else:
                good = shape(m.group(0)) == defsh[bucket].get(name)
            if not good:
                skipped += 1
                continue
            keep.append(m.group(0))
        if skipped:
            log('ru: %s — пропущено из-за несовпадения формата: %d' % (fn, skipped))
        if keep:
            write(os.path.join(out_dir, fn),
                  '<?xml version="1.0" encoding="utf-8"?>\n<resources>\n    ' + '\n    '.join(keep) + '\n</resources>\n')
            total += len(keep)
            log('ru:', fn, len(keep), 'строк')
    STATS['русских строк'] = total
    lc = os.path.join(DEC, 'res', 'xml', 'locales_config.xml')
    if os.path.exists(lc):
        write(lc, '<?xml version="1.0" encoding="utf-8"?>\n<locale-config\n  xmlns:android="http://schemas.android.com/apk/res/android">\n    <locale android:name="en" />\n    <locale android:name="ru" />\n</locale-config>\n')
        log('locales_config: en + ru')

# ----------------------------------------------------------------- 7. вес
removed = []
for d in glob.glob(os.path.join(DEC, 'res', 'values-*')):
    q = os.path.basename(d)[len('values-'):]
    if q in ('ru', 'en'):
        continue
    if re.fullmatch(r'[a-z]{2}(-r[A-Z]{2})?', q) or q.startswith('b+'):
        shutil.rmtree(d)
        removed.append(q)
STATS['языков удалено'] = len(removed)
log('удалены языки:', ' '.join(sorted(removed)))

orig_meta = os.path.join(DEC, 'original', 'META-INF')
if os.path.isdir(orig_meta):
    ndel = 0
    for root, _d, fs in os.walk(orig_meta):
        for fn in fs:
            if fn.upper().endswith(('.SF', '.RSA', '.DSA', '.EC')) or fn == 'MANIFEST.MF':
                os.remove(os.path.join(root, fn))
                ndel += 1
    log('удалены старые файлы подписи: %d (лицензии оставлены)' % ndel)

log('ИТОГ:', STATS)
