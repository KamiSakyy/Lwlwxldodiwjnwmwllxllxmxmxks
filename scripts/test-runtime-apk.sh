#!/usr/bin/env bash
set -euo pipefail

if [ "$#" -ne 3 ]; then
  echo "usage: test-runtime-apk.sh BUILD_TOOLS_DIR TEMPLATE_APK TEMP_DIR" >&2
  exit 2
fi
BUILD_TOOLS="$1"
TEMPLATE_APK="$2"
TEMP_DIR="$3"
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
CLASSES="$TEMP_DIR/jvm-smoke-classes"
UNSIGNED="$TEMP_DIR/runtime-smoke-unsigned.apk"
SIGNED="$TEMP_DIR/runtime-smoke.apk"
mkdir -p "$CLASSES" "$TEMP_DIR"

javac -encoding UTF-8 -source 8 -target 8 -d "$CLASSES" \
  "$ROOT/scripts/jvm-stubs/android/util/Base64.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/BinaryXmlPatcher.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/JarV1Signer.java" \
  "$ROOT/scripts/RuntimeApkSmoke.java"
java -cp "$CLASSES" ru.webapk.studio.RuntimeApkSmoke "$TEMPLATE_APK" "$UNSIGNED" "$SIGNED"
"$BUILD_TOOLS/apksigner" verify --verbose "$SIGNED"
BADGING="$("$BUILD_TOOLS/aapt" dump badging "$SIGNED")"
grep -F "package: name='com.smoke.offline'" <<< "$BADGING"
grep -F "application-label:'Offline smoke test'" <<< "$BADGING"
