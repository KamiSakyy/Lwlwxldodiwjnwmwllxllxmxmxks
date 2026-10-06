# GitHub RU Studio — размер APK (версия 928)

_Сгенерировано workflow 07 в 2026-10-06T18:18:32Z, run #2._

## Варианты сборки

| Вариант | Размер | Что внутри |
|---|---|---|
| **full** | 21.6 МБ (22700782 Б) | Node.js 24 внутри, .so **сжат** внутри APK |
| fast | 63.3 МБ (66382238 Б) | Node.js 24 внутри, .so распакован (быстрее первый старт) |
| **lite** | 0.2 МБ (198668 Б) | без Node.js: редактор, файлы, инструменты работают |

Было до мода: **68,431,908 Б (65.3 МБ)** — APK со сжатием не использовался, R8 выключен.

Экономия основного APK: 45731126 Б (66.8%), было 68431908 Б

## libnode.so

| Этап | Размер |
|---|---|
| скачанный | 83.4 МБ (87472464 Б) |
| после llvm-strip | 62.1 МБ (65139832 Б) |

## Из чего состоит full-APK

```
Archive:  /tmp/studio-full.apk
 Length   Method    Size  Cmpr    Date    Time   CRC-32   Name
--------  ------  ------- ---- ---------- ----- --------  ----
66633478         22694059  66%                            21 files
65139832  Defl:N 22192635  66% 1981-01-01 01:01 8e922dc2  lib/arm64-v8a/libnode.so
 1040224  Defl:N   310857  70% 1981-01-01 01:01 8fcfc90c  lib/arm64-v8a/libnodestarter.so
  258845  Defl:N    80858  69% 1981-01-01 01:01 90c44b69  assets/web/react/assets/app-GgOBL-Zg.js
   99402  Defl:N    36122  64% 1981-01-01 01:01 708ebb54  assets/web/vue/assets/app-COvY0b6A.js
   46800  Stored    46800   0% 1981-01-01 01:01 fc6327de  classes.dex
    9918  Defl:N     2715  73% 1981-01-01 01:01 4994a710  assets/web/react/assets/index-B40QLDgz.css
    9917  Defl:N     2715  73% 1981-01-01 01:01 8056f702  assets/web/vue/assets/index-BQhU5bZf.css
    6149  Defl:N     2285  63% 1981-01-01 01:01 d3550e9a  assets/nodejs/server.js
    4711  Stored     4711   0% 1981-01-01 01:01 3f77c2a6  res/o-.png
    3683  Stored     3683   0% 1981-01-01 01:01 7aef484a  res/RJ.png
    3380  Defl:N     1196  65% 1981-01-01 01:01 4648ec62  AndroidManifest.xml
    3036  Stored     3036   0% 1981-01-01 01:01 ea053729  resources.arsc
    1906  Stored     1906   0% 1981-01-01 01:01 06492103  res/yn.png
```

## Проверки

```
--- full (22700782 байт)
OK    full: подпись
OK    full: minSdk 28
OK    full: targetSdk 36
OK    full: arm64-v8a
OK    full: label GitHub RU Studio
OK    full: React-фронт
OK    full: Vue-фронт
OK    full: server.js
OK    full: нативный мост
OK    full: libnode.so на месте
--- fast (66382238 байт)
OK    fast: подпись
OK    fast: minSdk 28
OK    fast: targetSdk 36
OK    fast: arm64-v8a
OK    fast: label GitHub RU Studio
OK    fast: React-фронт
OK    fast: Vue-фронт
OK    fast: server.js
OK    fast: нативный мост
OK    fast: libnode.so на месте
--- lite (198668 байт)
OK    lite: подпись
OK    lite: minSdk 28
OK    lite: targetSdk 36
OK    lite: arm64-v8a
OK    lite: label GitHub RU Studio
OK    lite: React-фронт
OK    lite: Vue-фронт
OK    lite: server.js
OK    lite: нативный мост
OK    lite: libnode.so ОТСУТСТВУЕТ
OK    dex: мост файлов StudioFiles
OK    dex: NodeEngine
```

## Что изменилось в этом моде

1. **Скачивание файлов**: системный загрузчик по ссылке, сохранение текста и Base64
   в «Загрузки/GitHub RU Studio», «Сохранить как» через системный диалог,
   «Поделиться», список скачанного с открытием и удалением.
2. **Редактор файлов**: нумерация строк, подсветка синтаксиса (JS/JSON/HTML/CSS/MD),
   поиск и замена, автоотступы, парные скобки, форматирование JSON,
   минификация JS/CSS/HTML, размер шрифта, перенос строк, горячие клавиши.
3. **Дизайн**: палитра GitHub, светлая/тёмная темы, чипсы состояния, карточки,
   нижняя навигация с анимацией, тосты, аккуратные отступы и safe-area.
4. **Оптимизация**: R8 (минификация + удаление мёртвого кода), ленивый старт
   Node.js, ленивое создание Vue-вкладки, отключённые отладочные логи,
   strip нативного моста, WebView без отладки и лишнего кеша.
5. **Вес**: сжатие .so внутри APK + llvm-strip libnode.so + исключение
   лишних ресурсов (kotlin/*, META-INF/*) + LITE-сборка без Node.js.

