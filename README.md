# GitHub RU Studio (мод) — репозиторий сборки

Русская сборка клиента GitHub для Android: рабочее приложение **GitHub RU Studio**
(редактор файлов + скачивание + инструменты + встроенный Node.js 24 офлайн),
собирается в GitHub Actions и кладётся в папку [`handoff/`](handoff/).

## Скачать APK

| Вариант | Файл в `handoff/` | Что внутри |
|---|---|---|
| Полный | `GitHub-RU-Studio-928-full.apk` | Node.js 24 внутри (сжат внутри APK) |
| Быстрый | `GitHub-RU-Studio-928-fast.apk` | Node.js 24 внутри, распакован (быстрее старт) |
| Лёгкий | `GitHub-RU-Studio-928-lite.apk` | без Node.js — самый маленький |

Релиз с теми же файлами: [studio-mod](https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases/tag/studio-mod).
Подробности: [`handoff/README-STUDIO.md`](handoff/README-STUDIO.md) и
отчёт по весу [`handoff/SIZE-STUDIO.md`](handoff/SIZE-STUDIO.md).

Требования: **Android 9+ (API 28+), arm64-v8a**, интернет не нужен.
Пакет `com.github.rudroid` — ставится рядом с официальным GitHub.

## Что в моде (задание выполнено)

1. **Скачивание файлов** — системный загрузчик по ссылке, сохранение текста и
   Base64 в «Загрузки/GitHub RU Studio», «Сохранить как», «Поделиться»,
   список скачанного с открытием и удалением.
2. **Редактор файлов** — нумерация строк, подсветка синтаксиса, поиск и замена,
   автоотступы, парные скобки, форматирование JSON, минификация JS/CSS/HTML,
   несколько файлов, горячие клавиши.
3. **Дизайн** — палитра GitHub, светлая/тёмная темы, нижняя навигация, чипсы,
   тосты, аккуратные отступы и safe-area.
4. **Оптимизация** — R8 + shrinkResources, ленивый старт Node.js, ленивое
   создание Vue-вкладки, strip нативного моста, WebView без отладки.
5. **Вес APK** — сжатие `.so` внутри APK, `llvm-strip` для `libnode.so`,
   исключение лишних ресурсов, отдельная LITE-сборка без Node.js.
6. **Сборка и доставка** — workflow `07-studio-mod.yml` собирает APK,
   проверяет подпись/API/состав, кладёт файлы в `handoff/` и публикует релиз.

## Сборка

* **CI:** `Actions → "07 — Studio MOD: … → APK в handoff"` (или просто пуш в рабочую ветку).
* **Локально:** см. [`handoff/README-STUDIO.md`](handoff/README-STUDIO.md#сборка).
* **Тест интерфейса без Android:** `cd tools/studio-smoke && npm install && node smoke.mjs`
  (23 проверки: редактор, скачивание, инструменты, консоль, вкладки).

## Структура

```
handoff/GitHub-RU-v2/
├── shared-web/        общее ядро интерфейса (React и Vue используют один код)
├── web-react/         React-сборка (Vite)
├── web-vue/           Vue-сборка (Vite)
└── studio/            Android-модуль (Java + JNI-мост к libnode.so)
tools/studio-smoke/    смоук-тест веб-ядра в jsdom
.github/workflows/     сборка, проверки, публикация APK
```

Полный клиент GitHub (43 тыс. файлов декомпиляции jadx) восстанавливается
отдельно в ветке `arena/8b3246a5-…` (`05-restore`); в этой ветке собирается
рабочий модуль `:studio`.
