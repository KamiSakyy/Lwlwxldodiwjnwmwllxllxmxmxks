# Nox P2P для Android

Android-клиент 1:1 P2P-чата на Java. Compile/target SDK 36, **только `arm64-v8a`**, R8/ProGuard и shrinkResources включены для debug и release. Минимальная версия Android — API 26.

## Возможности

- Комнаты с 16-символьным кодом, анонимный Firebase Auth.
- Сигналинг WebRTC offer/answer/ICE через Realtime Database REST API + SSE.
- Текст, фото, видео, аудио/музыка, голосовые заметки и короткие видео-кружки передаются напрямую по упорядоченному WebRTC DataChannel, с подтверждением доставки и частями до 8 KiB. Вложения до 150 MiB.
- Чёрная тема, локальная история, уведомления и foreground service `connectedDevice` с wake lock на время активной комнаты.
- Встроено 10 ICE URL-адресов: 6 STUN discovery endpoints и 4 TURN-транспорта Open Relay (UDP/TCP/TLS на 80/443). Это **не десять независимых TURN-провайдеров**: relay один, варианты транспорта служат резервом.

## Firebase

1. В Firebase Console проекта `meow-874ce` включите **Authentication → Sign-in method → Anonymous**.
2. Убедитесь, что Realtime Database создана в `europe-west1`.
3. Опубликуйте правила из [`database.rules.json`](database.rules.json). Не включайте публичные `read/write: true`.
4. Firebase Web API key и URL RTDB заданы в `app/build.gradle`. API key — клиентская конфигурация; доступ ограничивают Auth и правила базы.

Файлы идут P2P и не загружаются в Firebase Storage.

## Публичный TURN и ограничения

Встроенный резерв использует Open Relay от Metered: в документации указаны бесплатный лимит 20 GB/месяц, порты 80/443, UDP/TCP/TLS и public static-auth secret для конфигурации Nextcloud ([официальная документация](https://www.metered.ca/tools/openrelay/)). Код формирует временные HMAC credentials по стандартному TURN REST-паттерну для этого static-auth host, но найденная документация не подтверждает напрямую Android-клиентский сценарий; живой TURN-сеанс здесь не проверялся. Поэтому это best-effort fallback, не гарантия связи. Четыре TURN URL — варианты транспорта одного провайдера, не независимые relay. Секрет опубликован провайдером, не является секретом приложения; общедоступный relay может быть ограничен/изменён и не даёт SLA. WebRTC шифрует media-трафик через DTLS-SRTP, но relay видит метаданные соединения. Для production используйте свой TURN или официальный credential API с собственным аккаунтом и краткоживущими ключами; встроенные credentials можно извлечь из APK.

Собственный TURN можно добавить через Gradle properties `-PturnUrl=... -PturnUsername=... -PturnCredential=...`; в Actions workflow для них предусмотрены secrets `TURN_URL`, `TURN_USERNAME`, `TURN_CREDENTIAL`.

## Сборка и HANDOFF

APK собирается только GitHub Actions, не в Arena. Workflow [`.github/workflows/android-apk.yml`](.github/workflows/android-apk.yml) устанавливает JDK 17, Gradle 8.13 и Android SDK 36, затем запускает minified `assembleDebug`. Результаты после успешной сборки:

- `HANDOFF/Nox-P2P-ARM64-API36-debug.apk` — устанавливаемый debug APK только для 64-битного ARM;
- `HANDOFF/Nox-P2P-Android-sources.zip` — архив исходников.

Оба файла workflow загружает как Actions artifact и публикует в `HANDOFF` на ветке сессии. Debug APK подписан стандартным debug-ключом; это не production/Play Store подпись. ARM64 APK не установится на 32-битные ARM-устройства и x86/x86_64 эмуляторы.

## Фоновые ограничения Android

Активная комната удерживает foreground service и `PARTIAL_WAKE_LOCK`, чтобы обрабатывать сетевые события с выключенным экраном; расход батареи будет выше. Это не гарантирует связь при force-stop, потере сети или остановке службы системой. Уведомления о входящих сообщениях работают, пока активная служба чата остаётся запущенной.
