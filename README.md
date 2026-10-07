# Nox P2P для Android

Android-клиент 1:1 P2P-чата на Java. Compile/target SDK 36, **только `arm64-v8a`**, R8/ProGuard и shrinkResources включены для debug и release. Минимальная версия Android — API 26.

## Возможности текущей реализации

- Комнаты с 16-символьным кодом, анонимный Firebase Auth.
- Сигналинг WebRTC offer/answer/ICE через Realtime Database REST API + SSE.
- Текст, фото, видео, аудио/музыка, голосовые заметки и короткие видео-кружки передаются по упорядоченному WebRTC DataChannel. Вложения до 150 MiB; выбор поддерживает несколько файлов за раз, до трёх исходящих передач одновременно.
- В чате есть миниатюры готовых фото; полное вложение можно открыть отдельно.
- Чёрная тема, локальная история, уведомления и foreground service `connectedDevice` с wake lock на время активной комнаты.
- Встроено 10 ICE URL-адресов: 6 STUN discovery endpoints и 4 TURN URL одного Open Relay-провайдера. Это не десять независимых TURN-реле.

WebRTC DataChannel шифрует транспорт между peer-узлами посредством DTLS, а signaling/Firebase REST защищён HTTPS. Это не реализация Signal Protocol на уровне сообщений: Firebase-сигналинг не имеет дополнительной криптографической аутентификации собеседника, поэтому приложение нельзя считать защищённым Signal E2EE-мессенджером. Голосовые/видеозвонки, действия ответа/принятия из уведомления и pause/resume передачи пока не реализованы.

## Firebase

1. В Firebase Console проекта `meow-874ce` включите **Authentication → Sign-in method → Anonymous**.
2. Убедитесь, что Realtime Database создана в `europe-west1`.
3. Опубликуйте правила из [`database.rules.json`](database.rules.json). Не включайте публичные `read/write: true`.
4. Firebase Web API key и URL RTDB заданы в `app/build.gradle`. API key — клиентская конфигурация; доступ ограничивают Auth и правила базы.

## Публичный TURN и ограничения

Встроенный best-effort резерв использует Open Relay от Metered: официальная страница указывает 20 GB/месяц, порты 80/443, UDP/TCP/TLS и static-auth secret в примере Nextcloud ([документация](https://www.metered.ca/tools/openrelay/)). Прямой Android HMAC-сценарий живым TURN-сеансом не подтверждён. Четыре TURN URL — варианты транспорта одного провайдера, не независимые relay. Публичный relay может быть ограничен и не даёт SLA; для production нужен собственный TURN и краткоживущие credentials.

## Release-сборка и постоянная подпись

Workflow [`.github/workflows/android-apk.yml`](.github/workflows/android-apk.yml) собирает **minified release APK**, проверяет arm64 ABI и сертификат подписи. После добавления Actions secrets его запускают вручную через `Actions → Android ARM64 signed release (API 36) → Run workflow`. Номер версии растёт с номером запуска (`versionCode=N`, `versionName=1.0.N`); релизные файлы именуются по версии и старые сборки не удаляются.

Для повторных обновлений используется один постоянный PKCS#12 release keystore с alias `nox-release`. Публичный сертификат и fingerprint в [`HANDOFF`](HANDOFF/RELEASE-SIGNING.md) можно хранить в исходниках; приватный keystore и пароли **не включаются в Git, source ZIP или APK**. Workflow получает их из Actions secrets. Это важно: публично раскрытый signing key позволяет кому угодно выпускать поддельные обновления.

Нужно один раз добавить secrets `RELEASE_KEYSTORE_BASE64`, `RELEASE_STORE_PASSWORD` и `RELEASE_KEY_PASSWORD` в **Settings → Secrets and variables → Actions**. Инструкция и локальная резервная копия созданы в `HANDOFF/RELEASE-SIGNING.md`. У агента нет доступа к настройке этих secrets (GitHub вернул HTTP 403), поэтому до их добавления release APK не будет подписан и опубликован.

Ранее выданный debug APK сохранён в `HANDOFF`, но его `.debug` package ID и debug-сертификат отличаются. Первую release-сборку нужно установить отдельно; последующие релизы с этим же ключом будут обновлениями.

## Фоновые ограничения

Активная комната удерживает foreground service и `PARTIAL_WAKE_LOCK`, чтобы обрабатывать сетевые события с выключенным экраном; расход батареи будет выше. Android всё равно может остановить процесс/сеть, а force-stop всегда завершает службу. Нельзя обещать 100% доступность на всех устройствах и сетях.
