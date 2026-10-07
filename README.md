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

Workflow [`.github/workflows/android-apk.yml`](.github/workflows/android-apk.yml) собирает **minified release APK**, проверяет arm64 ABI и сертификат подписи. `versionCode` растёт с номером запуска (`versionCode=N`, `versionName=1.0.N`); релизные APK и source ZIP именуются по версии, старые файлы не удаляются.

Постоянный PKCS#12 keystore с alias `nox-release` и пароль хранятся в `HANDOFF` и включаются в исходный ZIP, как запросил владелец; GitHub Actions secrets не нужны. Это крайне рискованно: любой человек с доступом к репозиторию/ZIP сможет подписать поддельное обновление. Храните репозиторий и архив приватно и сделайте офлайн-резервную копию. APK содержит подпись/публичный сертификат, а не приватный ключ.

Ранее выданный debug APK сохранён в `HANDOFF`, но его `.debug` package ID и debug-сертификат отличаются. Первый release нужно установить отдельно; последующие release APK с тем же ключом будут обновлениями.

## Фоновые ограничения

Активная комната удерживает foreground service и `PARTIAL_WAKE_LOCK`, чтобы обрабатывать сетевые события с выключенным экраном; расход батареи будет выше. Android всё равно может остановить процесс/сеть, а force-stop всегда завершает службу. Нельзя обещать 100% доступность на всех устройствах и сетях.
