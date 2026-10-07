# Постоянная подпись Android-релизов

Релиз подписывается постоянным ключом с alias `nox-release`. Его публичный сертификат и SHA-256 fingerprint входят в исходники и каждый APK. Версии GitHub Actions получают монотонно растущий `versionCode` из номера запуска workflow и `versionName` вида `1.0.N`; старые APK/архивы workflow не удаляет.

## Важно: приватный ключ не коммитится

`nox-release-key.p12` и файл с паролем находятся только в локальной `HANDOFF` и исключены из Git и source ZIP. Их нужно сохранить в надёжном офлайн-бэкапе. Приватную часть нельзя вкладывать в публичный исходник или APK: любой получивший её сможет подписывать поддельные обновления тем же издателем. Сам APK содержит подпись и публичный сертификат — не приватный ключ.

## Включить release-сборку в GitHub Actions

У workflow нет доступа к добавлению repository secrets (GitHub вернул HTTP 403), поэтому владелец репозитория должен один раз добавить в **Settings → Secrets and variables → Actions → New repository secret**:

- `RELEASE_KEYSTORE_BASE64` — вывод `base64 -w0 HANDOFF/nox-release-key.p12`;
- `RELEASE_STORE_PASSWORD` — содержимое локального файла `HANDOFF/nox-release-key-password.txt`;
- `RELEASE_KEY_PASSWORD` — то же значение для созданного PKCS#12 ключа.

Alias уже задан в workflow как `nox-release`. Не присылайте пароль или keystore в чат и не коммитьте их. После сохранения secrets запустите workflow `Android ARM64 signed release (API 36)` через **Actions → Run workflow**. Он настроен на ручной запуск, чтобы не создавать заведомо не подписанный APK до настройки ключа. Workflow проверит подпись и fingerprint перед публикацией версионных файлов в `HANDOFF`.

## Обновление существующей установки

Новая release-версия обновляет предыдущую release-версию того же package ID и с тем же ключом подписи. Ранее выданный debug APK имеет другой package ID (`.debug`) и debug-подпись; Android не может преобразовать его в release-установку поверху. Первую release-версию нужно установить отдельно; дальнейшие версии обновляются обычной установкой APK.
