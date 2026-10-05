# GitHub RU — исходный код (Java) + Gradle

Приложение пересобрано из официального APK `com.github.android` 1.257.0
(versionCode 925). Пакет заменён на `com.github.rudroid` — ставится рядом
с официальным GitHub.

## Что внутри

| Папка | Содержимое |
|---|---|
| `app/src/main/java` | **43 317 файлов .java** — весь код приложения (jadx 1.5.1) |
| `app/src/main/res` | 2 985 файлов ресурсов: русский `values-ru` (3 342 строки) + картинки, которые Play отдаёт в density-сплитах |
| `app/src/main/assets` | ассеты (webview для Markdown, схемы БД) |
| `app/src/main/jniLibs/arm64-v8a` | нативные библиотеки `.so` |
| `app/src/main/AndroidManifest.xml` | манифест, пакет `com.github.rudroid` |
| `app/github-ru.jks` | ключ подписи (пароль `android`, алиас `github-ru`) |
| `app/build.gradle` | R8: `minifyEnabled`, `shrinkResources`, только `arm64-v8a`, только `ru` |

## Почему java-файлов так много

* **6 077** — код самого GitHub (`com/github/**`)
* **~37 200** — библиотеки: androidx, Google Play services, Firebase, Kotlin,
  Apollo GraphQL, OkHttp, Coil, Dagger и ещё около сотни зависимостей.
  R8 перепаковал их классы в короткие имена (`a0/`, `j71/`, `v41/`),
  поэтому «говорящих» имён у них нет.

Декомпилятор отдаёт **один класс = один файл** — отсюда такое количество.
Исходники самого приложения, а не библиотек, — это папка `com/github/rudroid`
(5 613 файлов).

## Честно о качестве

Приложение выпущено с R8-обфускацией: имена классов и методов короткие
(`c0`, `b0`, `u10`). Оригинальных имён не существует ни в одном APK —
они есть только у авторов в репозитории. Часть отдельных файлов может
не компилироваться: это обычное следствие декомпиляции.

## Сборка

```bash
./gradlew assembleRelease
```

Нужен JDK 17 и интернет (Gradle + AGP). Подпись настроена в
`app/build.gradle` (`signingConfigs.release`); готовый APK появится
в `app/build/outputs/apk/release/`.

Готовый подписанный APK лежит отдельным файлом `GitHub-RU.apk`.


## Адрес возврата после входа (OAuth)

Приложение логинится через OAuth GitHub. Адрес возврата —
`github://com.github.android/oauth`: именно он зарегистрирован на стороне
GitHub для официального приложения, и переименовать его нельзя (сервер
отклонит любой другой). Поэтому:

* в коде (константа в `auth`) адрес оставлен как `com.github.android`, хотя
  пакет приложения — `com.github.rudroid`;
* в `AndroidManifest.xml` соответствующий `<data android:host=...>` тоже
  указывает на `com.github.android`.

Если после входа Android спросит, каким приложением открыть ссылку —
выбирай GitHub RU.
