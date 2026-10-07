# HANDOFF

Здесь сохраняются APK и source ZIP по версиям; release workflow не удаляет предыдущие файлы. Сейчас сохранён предыдущий ARM64 debug APK. Новые сборки workflow — minified **release APK** с монотонно растущим `versionCode` и одной постоянной подписью.

Для release-подписи владелец должен один раз добавить GitHub Actions secrets. См. [`RELEASE-SIGNING.md`](RELEASE-SIGNING.md). Публичный сертификат и SHA-256 fingerprint находятся рядом. Приватный `.p12` и пароль остаются локальными ignored-файлами и не попадают в Git/source ZIP/APK.

Первый release APK появится после добавления трёх secrets и успешного запуска workflow. Старый debug APK сохранён, но не может быть обновлён release APK из-за другого application ID и ключа подписи.
