# Lwlwxldodiwjnwmwllxllxmxmxks

Русская сборка клиента GitHub для Android + современное приложение
**GitHub RU Studio**.

## 📥 Скачать APK (готовая сборка)

**[studio-arm64-v8a-release.apk — скачать с GitHub Releases](https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases/download/studio-modern/studio-arm64-v8a-release.apk)**

Страница релиза: [studio-modern](https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases/tag/studio-modern)

| Параметр | Значение |
|---|---|
| minSdk / targetSdk / compileSdk | **28 / 36 / 36** (Android 9–16, только современные API) |
| Node.js | **24.20.0**, встроен в APK (libnode.so + JNI-мост), работает **офлайн** |
| Фронт | **React 19.3** + **Vue 3.5** (Vite), упакованы в `assets/web/`, работают **офлайн** |
| Процессор | только **arm64-v8a** |
| Подпись | ключ `github-ru` (ставится рядом с официальным GitHub) |

Требования: Android 9+, arm64. Интернет для работы НЕ нужен.

Подробности: `handoff/GitHub-RU-v2/STUDIO-README.md`.
Сборка: workflow `06-studio-modern.yml` (без эмулятора: Gradle + apksigner/aapt-проверки + Release).
