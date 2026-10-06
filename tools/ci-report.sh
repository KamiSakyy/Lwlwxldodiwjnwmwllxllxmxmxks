#!/usr/bin/env bash
# Отчёт о сборке: размер и состав APK, подпись, данные для Google Cloud.
# Результат публикуется в описании релиза apk-latest (читается через API без скачивания файлов).
#
# Использование: tools/ci-report.sh [путь-к-APK] [файл-отчёта]
set -uo pipefail

apk="${1:-app/build/outputs/apk/release/app-release.apk}"
out="${2:-build-report.md}"
store="${MAILGRAM_STORE_FILE:-keystore/mailgram-dev.p12}"
pass="${MAILGRAM_STORE_PASSWORD:-mailgram}"

sha1=""
if [ -f "$store" ]; then
  sha1=$(keytool -list -v -storetype PKCS12 -keystore "$store" -storepass "$pass" 2>/dev/null \
          | grep -iE "^[[:space:]]*SHA1:" | awk '{print $2}' | head -1)
fi

{
  echo "## Отчёт сборки MailGram"
  echo
  echo "- когда (UTC): $(date -u '+%Y-%m-%d %H:%M')"
  echo "- коммит: \`${GITHUB_SHA:-local}\` (ветка ${GITHUB_REF_NAME:--})"
  echo "- JDK: $(java -version 2>&1 | head -1)"
  echo
  if [ -f "$apk" ]; then
    size=$(stat -c%s "$apk")
    echo "### APK"
    echo
    echo "- файл: \`$(basename "$apk")\`, ${size} байт (~$((size / 1024)) КБ, лимит 15 МБ)"
    echo "- SHA-1 подписи: \`${sha1:-не определён}\`"
    echo
    if command -v apksigner > /dev/null 2>&1; then
      echo '```'
      apksigner verify --print-certs "$apk" 2>&1 | head -20
      echo '```'
    fi
    if command -v aapt2 > /dev/null 2>&1; then
      echo '```'
      aapt2 dump badging "$apk" 2>/dev/null | grep -E "^package|sdkVersion|targetSdkVersion|application-label|native-code" | head -10
      echo '```'
    fi
    echo '### Состав'
    echo
    echo '```'
    unzip -l "$apk" | grep -E "lib/|classes|resources.arsc|AndroidManifest" || true
    echo '```'
    echo
    echo "### Данные для Google Cloud Console"
    echo
    echo "- package name: \`$(aapt2 dump badging "$apk" 2>/dev/null | head -1 | sed -E "s/.*name='([^']+)'.*/\1/" || echo com.mailgram.app)\`"
    echo "- SHA-1: \`${sha1:-see above}\`"
    echo "- scopes: \`openid email https://www.googleapis.com/auth/gmail.modify\`"
    echo "- redirect (Android-клиент): \`com.googleusercontent.apps.<client-id>:/oauth2redirect\`"
    echo "- redirect (Desktop+loopback): \`http://127.0.0.1:7717/oauth2redirect\`"
  else
    echo "### APK не собран"
    echo
    echo '```'
    for f in build.log build-check.log; do
      [ -f "$f" ] && { echo "--- $f ---"; tail -n 40 "$f"; }
    done
    echo '```'
  fi
} > "$out"

cat "$out"
