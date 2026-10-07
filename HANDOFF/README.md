# HANDOFF

Здесь находятся результаты Android-сборки из GitHub Actions. Workflow `.github/workflows/android-apk.yml` собирает minified APK с Android SDK 36 и ABI `arm64-v8a`, создаёт архив исходников, загружает оба файла как Actions artifact и публикует их в этой папке.

Ожидаемые имена:

- `Nox-P2P-ARM64-API36-debug.apk` — устанавливаемый debug APK только для arm64;
- `Nox-P2P-Android-sources.zip` — исходники Android-проекта.

APK не собирается в Arena и не подменяется заглушкой. Он появляется после успешного GitHub Actions run.
