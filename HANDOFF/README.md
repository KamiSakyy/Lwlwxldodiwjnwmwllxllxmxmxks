# HANDOFF

Здесь размещаются результаты Android-сборки из GitHub Actions. Ветка сессии запускает workflow `.github/workflows/android-apk.yml`; он собирает APK на Android SDK 36, создаёт архив исходников, загружает оба файла как Actions artifact и затем публикует их в этой папке.

Ожидаемые имена:

- `Nox-P2P-API36-debug.apk` — устанавливаемая debug-сборка;
- `Nox-P2P-Android-sources.zip` — исходники Android-проекта.

APK не собирается в Arena и не создаётся фиктивным файлом. До первого успешного запуска GitHub Actions бинарного файла здесь нет.
