# Nox P2P для Android

Минимальный Android-клиент личного P2P-чата: Java, Android SDK 36, чёрный интерфейс, WebRTC DataChannel для текста и вложений, Firebase Realtime Database REST API + SSE для сигналинга, Firebase Anonymous Auth для доступа к базе. Сообщения и файлы передаются напрямую между устройствами, не сохраняются на сервере.

## Возможности

- Создание приватной комнаты и подключение по 16-символьному коду.
- Текстовые сообщения и передача фото, видео, аудио/музыки, голосовых заметок и коротких видео-кружков через надёжный упорядоченный WebRTC DataChannel.
- Обмен WebRTC offer/answer и ICE-кандидатами через REST API Realtime Database и потоковые SSE-соединения.
- Анонимная авторизация Firebase; локальная история и файлы остаются на устройстве.
- Постоянное уведомление и foreground service `connectedDevice` на время активной комнаты; отдельные уведомления о новых сообщениях.
- Тёмная тема, целевой и compile SDK 36. Минимальная версия Android — 8.0 (API 26).

## Настройка Firebase (один раз)

1. В Firebase Console проекта `meow-874ce` включите **Authentication → Sign-in method → Anonymous**.
2. Убедитесь, что Realtime Database создана в `europe-west1`.
3. В Realtime Database откройте Rules и опубликуйте содержимое [`database.rules.json`](database.rules.json). Правила требуют авторизованный анонимный Firebase-токен, ограничивают чтение сигналов их получателем и разрешают пользователю обновлять только собственное присутствие. Не заменяйте их на публичные `read/write: true`.
4. В `app/build.gradle` уже указаны переданные владельцем Firebase Web API key и URL Realtime Database. Firebase API key не является серверным секретом; доступ ограничивают Firebase Auth и правила базы.

Отдельный Firebase Storage не используется: вложения идут по WebRTC напрямую. Поэтому файлы не загружаются в облачное хранилище.

## Сборка

Сборка APK выполняется **только GitHub Actions**, не локальной/песочничной сборкой. Workflow [`android-apk.yml`](.github/workflows/android-apk.yml) на ветке сессии устанавливает JDK 17, Gradle 8.13 и Android SDK 36, затем запускает `assembleDebug`. После успешной сборки workflow создаёт:

- `HANDOFF/Nox-P2P-API36-debug.apk` — устанавливаемый debug APK;
- `HANDOFF/Nox-P2P-Android-sources.zip` — архив исходников.

Оба файла загружаются как Actions artifact и публикуются в `HANDOFF` на ветке сессии. Debug APK подписан стандартным debug-ключом; это не production/Play Store подпись. Исходный ZIP можно подготовить без сборки; APK появится только после успешного GitHub Actions run и не подменяется заглушкой.

## NAT и непрерывность связи

WebRTC использует Google STUN-серверы по умолчанию. Для лучшего соединения между строгими NAT/мобильными сетями необходим собственный TURN-сервер: STUN сам по себе не гарантирует P2P-доступность и не может гарантировать связь при принудительном закрытии приложения ОС или потере сети. Для CI добавьте приватные Actions secrets `TURN_URL`, `TURN_USERNAME`, `TURN_CREDENTIAL`; workflow автоматически передаст их Gradle. Для ручной сборки используйте `-PturnUrl=turns:... -PturnUsername=... -PturnCredential=...`. Секреты не добавляйте в Git. Активная комната удерживается foreground service и `PARTIAL_WAKE_LOCK` на время активной комнаты, чтобы CPU продолжал обрабатывать сетевые события с выключенным экраном; это повышает расход батареи. Android всё равно может завершить процесс или отключить сеть в энергосберегающем режиме.

В приложении нет серверного архива/бэкапа сообщений. WebRTC DataChannel защищён DTLS; Firebase signaling идёт по HTTPS. Используйте длинный код комнаты только с доверенным собеседником.
