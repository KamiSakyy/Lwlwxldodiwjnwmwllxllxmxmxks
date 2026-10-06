# GitHub RU Studio — MOD: скачивание файлов, редактор, дизайн, оптимизация, вес

Этот файл описывает мод рабочего приложения **GitHub RU Studio** (модуль `:studio`
проекта `handoff/GitHub-RU-v2`). APK лежит в этой же папке (`handoff/`), собран
в GitHub Actions workflow **07 — Studio MOD**.

## Что добавлено (по заданию)

| № | Задание | Как сделано |
|---|---|---|
| 1 | **Скачивание файлов** | Нативный мост `window.Studio` (класс `StudioFiles`): системный `DownloadManager` по ссылке с уведомлением о прогрессе; сохранение текста и Base64 в общую папку **«Загрузки/GitHub RU Studio»** (MediaStore на Android 10+, публичная папка на Android 9); «Сохранить как» через системный диалог; «Поделиться»; список скачанного с открытием и удалением; перехват загрузок самой WebView |
| 2 | **Редактор файлов** | Нумерация строк с подсветкой активной строки, подсветка синтаксиса (JS/TS/JSON/HTML/CSS/Markdown), поиск и замена со счётчиком, автоотступ и парные скобки, `Tab`/`Shift+Tab`, форматирование JSON, минификация JS/CSS/HTML, размер шрифта, перенос строк, несколько открытых файлов, горячие клавиши, статус-строка (строка:колонка, строк, символов, байт) |
| 3 | **Дизайн** | Палитра GitHub Primer, светлая и тёмная темы (системная/своя), нижняя навигация с анимацией, карточки, чипсы состояния, тосты, единые отступы и safe-area, тёмная/светлая тема нативной оболочки (`values-night`) |
| 4 | **Оптимизация** | Включён **R8** (минификация + удаление мёртвого кода + удаление `Log.v/d`), `shrinkResources`, ленивый старт Node.js (после первого кадра), ленивое создание Vue-вкладки, `strip` нативного моста (`-Oz`, `--gc-sections`, `--strip-all`), WebView без отладки и лишнего кеша, `onLowMemory` освобождает кеш рендера, убраны лишние ресурсы (`kotlin/**`, `META-INF/*.version`) |
| 5 | **Вес APK меньше** | `.so` **сжаты внутри APK** (`useLegacyPackaging`), `llvm-strip` для `libnode.so`, R8 + `shrinkResources`, исключение лишних ресурсов, и отдельная **LITE-сборка вообще без Node.js** |
| 6 | **APK в handoff/** | `handoff/GitHub-RU-Studio-928-full.apk`, `handoff/GitHub-RU-Studio-928-lite.apk` (+ `SHA256-STUDIO.txt`, отчёт `SIZE-STUDIO.md`) |

## Три варианта APK из одного кода

| Вариант | Что внутри | Когда брать |
|---|---|---|
| `GitHub-RU-Studio-928-full.apk` | Node.js 24 внутри, `.so` сжат | обычный выбор: всё работает, вес минимальный из «полных» |
| `GitHub-RU-Studio-928-fast.apk` | Node.js 24 внутри, `.so` распакован | чуть быстрее холодный старт, но APK больше |
| `GitHub-RU-Studio-928-lite.apk` | без Node.js | самый маленький (меньше 3 МБ): редактор, скачивание, инструменты, темы — всё есть, кроме выполнения JS на движке |

Точные размеры смотрите в `handoff/SIZE-STUDIO.md` (файл создаётся на каждой сборке).

## Установка

1. Скачайте APK из этой папки (или из релиза `studio-mod`).
2. Разрешите установку из неизвестных источников.
3. Android 9+ (API 28+), процессор **arm64-v8a**. Интернет не нужен.

Приложение ставится рядом с официальным GitHub: пакет `com.github.rudroid`,
подпись — ключ `github-ru` (тот же, что у прошлых сборок, поэтому обновление
поверх старой версии проходит без удаления).

## Где что лежит в проекте

```
handoff/GitHub-RU-v2/
├── shared-web/studio-core.js|css   ← ОБЩЕЕ ядро интерфейса (редактор, файлы, инструменты)
├── web-react/                      ← React-обёртка + Vite (грузит общее ядро)
├── web-vue/                        ← Vue-обёртка + Vite (то же ядро)
└── studio/                         ← Android-модуль
    ├── src/main/java/.../MainActivity.java   ← оболочка: вкладки, темы, SAF, DownloadManager
    ├── src/main/java/.../StudioFiles.java    ← JS-мост: скачивание/сохранение/открытие файлов
    ├── src/main/java/.../node/NodeEngine.java← мост к встроенному Node.js
    ├── src/main/cpp/nodestarter.cpp          ← JNI: node::Start() в фоне (или LITE-заглушка)
    └── src/main/assets/nodejs/server.js      ← офлайн-сервер: /info /eval /run /sha256
```

## Сборка

Всё делает workflow **07 — Studio MOD: … → APK в handoff** при пуше в рабочую ветку
или вручную (`Actions → Run workflow`). Локально:

```bash
cd handoff/GitHub-RU-v2
(cd web-react && npm install && npm run build)   # npm run build сам копирует общее ядро
(cd web-vue   && npm install && npm run build)
# libnode.so (arm64) положить в studio/src/main/jniLibs/arm64-v8a/ — или собрать LITE:
./gradlew :studio:assembleRelease -PstudioLegacyPackaging=true
./gradlew :studio:assembleRelease -PstudioNoNode=true -PstudioLegacyPackaging=true
```

Смоук-тест интерфейса (без Android): `cd tools/studio-smoke && npm install && node smoke.mjs`.

## Горячие клавиши редактора

| Клавиши | Действие |
|---|---|
| `Ctrl+S` | сохранить файл в «Загрузки» |
| `Ctrl+O` | открыть файл с устройства |
| `Ctrl+F` | поиск и замена |
| `Ctrl+Enter` | запустить файл во встроенном Node.js |
| `Tab` / `Shift+Tab` | отступ / снять отступ |

## Честные ограничения

* Редактор рассчитан на тексты до 8 МБ (открытие через системный диалог) и
  подсвечивает синтаксис до 60 000 символов — дальше просто без подсветки.
* Минификаторы JS/CSS/HTML базовые: комментарии и пробелы, без переименования
  переменных (для этого нужен полноценный движок вроде esbuild).
* LITE-сборка не выполняет код: вкладка «Node.js» объяснит это и предложит
  полную сборку.
* Node.js внутри APK — это `libnode.so` от `digidem/nodejs-mobile` (Node 24,
  arm64). Он сжимается внутри APK: при установке Android распакует его в
  приватную папку приложения (это нормально для sideload-APK, но нужно место).
