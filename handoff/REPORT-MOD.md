# GitHub RU MOD — `1.279.0-rudroid`

**Готовый файл:** `handoff/GitHub-RU-rudroid-mod-1.279.0.apk`
**Размер:** 21 539 638 байт (20.5 МиБ) — против 41 988 186 байт (40.0 МиБ) у официальной базы → **−48,7 %**
**SHA-256:** `f8e9fd8c9c1fcb0eb55c08ff55d408b40f0bce49c8b20c6af6166c952af99a5f`
**Подпись:** APK Signature Scheme v3, ключ `handoff/keys/github-ru.jks` (alias `github-ru`, SHA-256 сертификата `daa6c6a089d8d524b70cec32937808134f1e1f4a676e9658a710bd3113cd98ba`)
**Пакет:** `com.github.rudroid` · versionCode `950` · versionName `1.279.0-rudroid` · minSdk 32 · targetSdk 37 · название «GitHub»

---

## 1. Скачивание файлов

Добавлен класс `com.github.rudroid.webview.GHRDownloadListener` (реализует `android.webkit.DownloadListener`):

* прямые http/https-ссылки → `DownloadManager.enqueue(...)`: файл попадает в системную папку «Загрузки», с уведомлением о прогрессе, докачкой и без привязки к жизни WebView;
* прочие схемы (`data:`, `blob:`, локальные) → `Intent.ACTION_VIEW` через системный обработчик;
* имя файла берётся из `URLUtil.guessFileName`, MIME — из события WebView.

Класс внедрён вызовом `setDownloadListener` в оба реальных вебвью-хоста приложения:
`webview/viewholders/f` и `webview/viewholders/LegacyGitHubWebView` (класс размещён в 5-м dex,
вызовы — в 3-м, см. «Технические ограничения»). Обработчиков загрузки в оригинале не было ни одного
(`setDownloadListener` — 0 вхождений), поэтому раньше такие ссылки просто не открывались.

## 2. Редактор файлов

* Весь масштаб шрифта кода поднят на +2 sp: `code_text_size_xxs…xxl` 11–17 → 13–19 sp (крупнее и читабельнее во всех режимах).
* Полю редактора (`vqi.a(...)` — то самое `EditText` с тегом `file_editor_text_field`) добавлен межстрочный интервал 1,15 (`TextView.setLineSpacing(0, 1.15)`).
* Моноширинный шрифт `roboto_mono` и подсветка/подсказки оригинала сохранены.

## 3. Дизайн

* Иконка приложения: вместо плоского тёмного фона `#1b1f23` — фирменный градиент GitHub-зелёного `#2EA44F → #136B2E` (`res/drawable/ic_launcher_background.xml` + adaptive-icon), силуэт-октокот без изменений.
* Светлая тема: фон `backgroundPrimary` `#eff0f5` → `#f6f8fa` (актуальный canvas-subtle GitHub), ночная тема не тронута.

## 4. Оптимизация

* Firebase Analytics / Crashlytics / Performance и сбор рекламного идентификатора выключены через `meta-data` манифеста (`firebase_analytics_collection_enabled=false`, `firebase_crashlytics_collection_enabled=false`, `google_analytics_adid_collection_enabled=false` и др.).
* Удалены разрешения `com.google.android.gms.permission.AD_ID` и `android.permission.ACCESS_ADSERVICES_*`.
* dex и ресурсы теперь сжаты (deflate) — меньше размер, быстрее установка и чтение.

## 5. Вес APK

| Что | Было | Стало |
|---|---|---|
| APK целиком | 41 988 186 | **21 539 638** |
| Языки | 12 (de/es/ja/ko/pt/zh + ru отсутствовал) | **en + ru** |
| dex | 5 × ~36 МБ, без сжатия | сжаты deflate |
| Прочее | — | добавлены русские строки (3 403), mdpi-ресурсы и 2 `.so` из сплитов |

Дополнительно: в APK возвращены 147 файлов `META-INF` (лицензии/NOTICE/`*.version`) из базы.

## 6. Что именно в APK, помимо модов

* Русская локализация: 3 253 строки + 124 плюрала + 26 массивов, перенесены из исходника
  пользователя (`GitHub-RU-Source`) **только для ключей, существующих в 1.279.0**, и с проверкой
  совпадения форматов `printf` (иначе строка пропускается — приложение не упадёт на `getString`).
  `res/xml/locales_config.xml` → `en` + `ru` (выбор языка в настройках системы).
* OAuth: хост `com.github.android` в `AndroidManifest.xml` и редирект `github://com.github.android/oauth`
  **сохранены намеренно** — он зашит на стороне GitHub, переименование сломало бы вход.

## Как собрано

Полностью воспроизводимый пайплайн (он же — workflow 09 в GitHub Actions):

1. База: официальный `com.github.android` 1.279.0 (vc 950) — XAPK с APKPure
   (`base` 41 988 186 + `config.mdpi` 54 617 + `config.arm64_v8a` 53 576).
2. `apktool 2.9.3 d` базы и сплитов (сплиты декодируются отдельно — внутри уже скомпилированные
   9-patch/бинарный XML, которые aapt2 не примет повторно).
3. `python3 tools/mod_github_ru.py <декод> --ru-dir tools/i18n/ru --splits <декоды сплитов>`:
   манифест (снять атрибуты сплитов и API35-алиас с `<uri-relative-filter-group>`, который не понимает
   aapt2 из apktool), переименование `com.github.android` → `com.github.rudroid` с защитой oauth-хоста,
   слушатель загрузок, правки редактора/дизайна/языков, слияние mdpi-ресурсов и arm64-либ.
4. `apktool b` → `python3 tools/repack_apk.py … --meta-from <база>` (сжатие dex, выравнивание,
   лицензии) → `apksigner sign` (v3).
5. Контроль: `python3 tools/check_apk.py <apk> <база>` — 15 проверок (пакет, oauth-хост, класс
   загрузки, русские строки, выравнивание, вес) + `aapt2 dump resources` (0 потерянных имён
   ресурсов относительно базы) + обратный декод apktool (все 5 dex валидны).

## Технические ограничения (важно для будущих модов)

* В 1.279.0 первый dex (`classes.dex`) содержит **ровно 65 536 ссылок на методы** — это жёсткий
  предел формата dex. Любая новая ссылка в нём ломает сборку (`Unsigned short value out of range`).
  Поэтому: новый класс — в 5-й dex, вызовы — в 3-й; для `setLineSpacing` в 1-м dex освобождён один
  слот (удалён единственный вызов `Log.w`, а `move-result` заменён на `const/16 0x0`, тип регистра
  сохранён).
* В `AndroidManifest.xml` официального APK есть `<uri-relative-filter-group android:allow=...>`
  (API 35+) и `android:queryAdvancedPattern` — aapt2 из apktool 2.9.3 их не знает. API35-алиас удалён
  целиком; разбор ссылок остаётся на классическом алиасе `DeepLinkAliasActivity` (он в манифесте
  и содержит те же исключения путей).
* Атрибуты `android:requiredSplitTypes` / `android:splitTypes` сняты — иначе одиночный APK
  (без split-ов) установиться не должен.

## Установка

1. Удалите официальное приложение GitHub (подпись отличается, поверх не встанет).
2. Установите `handoff/GitHub-RU-rudroid-mod-1.279.0.apk`.
3. Вход через GitHub работает как в оригинале (OAuth-редирект сохранён).

Известное ограничение: `WebViewActivity` (1-й dex, свободных слотов методов нет) остался без
слушателя загрузок — скачивание работает во всех основных вебвью приложения.
