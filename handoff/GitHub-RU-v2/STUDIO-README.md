# GitHub RU Studio (`:studio`) — современная сборка

Модуль собирается в APK **всегда**: `minSdk 28 → targetSdk 36 → compileSdk 36`
(Android 9–16), AGP 9.4.0, Gradle 9.6.0, JDK 17, build-tools 36.0.0, NDK 28.2.
Ноль внешних зависимостей — только Android SDK.

Скачать готовый APK: раздел **Releases** → `studio-modern`
(`https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases/tag/studio-modern`).

Требования: Android 9+ (API 28+), процессор arm64-v8a. Интернет НЕ нужен.

## Что внутри

| Компонент | Как встроен | Офлайн |
|---|---|---|
| 🟢 **Node.js 24.20.0** (V8 13.6) | `libnode.so` (digidem/nodejs-mobile, arm64, 16KB-страницы) + JNI-мост `nodestarter.cpp` (NDK). Стартует в фоне через `node::Start()` с `assets/nodejs/server.js`, слушает **только 127.0.0.1** | Да, полностью |
| ⚛ **React 19.3** (Vite 8) | `web-react/dist` → `assets/web/react`, открывается в WebView через `file:///android_asset/` | Да, полностью |
| 💚 **Vue 3.5** (Vite 8) | `web-vue/dist` → `assets/web/vue`, открывается в WebView | Да, полностью |
| 📱 Оболочка | `MainActivity` (3 вкладки), `NodeEngine.java` — мост к движку через localhost HTTP (`/info`, `/eval`) | Да |

React/Vue вызывают Node.js напрямую (`fetch http://127.0.0.1:PORT/...`, порт
подставляет WebView). Наружу не ходит ничего.

## Гарантия «APK собирается даже без dist»

1. **Нет `web-*/dist`** (нет node/npm, упал фронт) — задача Gradle
   `bundleWebAssets` генерирует аккуратную офлайн-заглушку, сборка продолжается.
2. **Нет `libnode.so`** (не скачался) — CMake собирает stub-мост, `NodeEngine`
   показывает экран «Node.js не встроен», приложение живёт дальше.

## Сборка

```bash
cd handoff/GitHub-RU-v2
# 1) Node.js под arm64 (нужен интернет ОДИН раз, на сборке):
#    скачать nodejs-mobile-android-24.20.0-0.zip из
#    https://github.com/digidem/nodejs-mobile/releases
#    и положить libnode.so (arm64-v8a) в studio/src/main/jniLibs/arm64-v8a/
# 2) Фронт (нужен node 20+):
cd web-react && npm install && npm run build && cd ../web-vue && npm install && npm run build && cd ..
# 3) APK:
./gradlew :studio:assembleRelease
# Готово: studio/build/outputs/apk/release/*.apk (подписан ключом github-ru.jks)
```

Всё это автоматически делает workflow **06-studio-modern.yml** (SDK 36 + NDK +
скачивание Node.js + npm + Gradle + проверка `apksigner`/`aapt` + публикация
APK в Release `studio-modern`). Эмулятор не используется.

## Честно о старом модуле `:app`

Декомпилированный код оригинального клиента (43 тыс. файлов) сейчас
**не компилируется** (~59 тыс. ошибок декомпиляции — см.
`handoff/restoration/RESTORATION-REPORT.md`). Его конфиги тоже переведены на
API 28–36 (`minSdk 28`, `targetSdk/compileSdk 36`, современный DSL под AGP 9),
но восстановление кода — отдельная долгая работа (workflow `05-restore`).
Модуль `:studio` — рабочая современная часть, которая ставится и работает уже
сейчас; applicationId (`com.github.rudroid`) и ключ подписи у модулей общие,
поэтому будущий полный клиент встанет обновлением поверх Studio без конфликтов.
