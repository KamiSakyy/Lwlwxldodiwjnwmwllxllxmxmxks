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
SECOND_SIGNED="$TEMP_DIR/runtime-smoke-second.apk"
SIGNING_KEY="$ROOT/handoff/WebAPK-Studio-signing.p12"
SIGNING_PROPERTIES="$ROOT/handoff/signing.properties"
SIGNING_PASSWORD="$(sed -n 's/^storePassword=//p' "$SIGNING_PROPERTIES")"
SIGNING_ALIAS="$(sed -n 's/^keyAlias=//p' "$SIGNING_PROPERTIES")"
mkdir -p "$CLASSES" "$TEMP_DIR"

javac -encoding UTF-8 -source 8 -target 8 -d "$CLASSES" \
  "$ROOT/scripts/jvm-stubs/android/util/Base64.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/BinaryXmlPatcher.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/IconResourceLocator.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/ApkV2Signer.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/JarV1Signer.java" \
  "$ROOT/scripts/RuntimeApkSmoke.java"
java -cp "$CLASSES" ru.webapk.studio.RuntimeApkSmoke "$TEMPLATE_APK" "$UNSIGNED" "$SIGNED" "$SIGNING_KEY" "$SIGNING_PASSWORD" "$SIGNING_ALIAS"
if ! "$BUILD_TOOLS/apksigner" verify --verbose "$SIGNED" >"$TEMP_DIR/apksigner.log" 2>&1; then
  cat "$TEMP_DIR/apksigner.log"
  DIAGNOSTIC="$(tr '\n' ' ' < "$TEMP_DIR/apksigner.log" | sed 's/::/%3A%3A/g')"
  echo "::error title=Generated APK signature verification::$DIAGNOSTIC"
  exit 1
fi
cat "$TEMP_DIR/apksigner.log"
grep -F "Verified using v1 scheme (JAR signing): true" "$TEMP_DIR/apksigner.log"
grep -F "Verified using v2 scheme (APK Signature Scheme v2): true" "$TEMP_DIR/apksigner.log"
if ! "$BUILD_TOOLS/apksigner" verify --verbose "$SECOND_SIGNED" >"$TEMP_DIR/apksigner-second.log" 2>&1; then
  cat "$TEMP_DIR/apksigner-second.log"
  echo "Repeated use of the handoff key produced an invalid APK" >&2
  exit 1
fi
grep -F "Verified using v1 scheme (JAR signing): true" "$TEMP_DIR/apksigner-second.log"
grep -F "Verified using v2 scheme (APK Signature Scheme v2): true" "$TEMP_DIR/apksigner-second.log"
CERT1="$("$BUILD_TOOLS/apksigner" verify --print-certs "$SIGNED" | grep -F "Signer #1 certificate SHA-256 digest" | head -n 1)"
CERT2="$("$BUILD_TOOLS/apksigner" verify --print-certs "$SECOND_SIGNED" | grep -F "Signer #1 certificate SHA-256 digest" | head -n 1)"
if [ -z "$CERT1" ] || [ "$CERT1" != "$CERT2" ]; then
  echo "Repeated APK signing did not preserve the handoff certificate" >&2
  exit 1
fi
BADGING="$("$BUILD_TOOLS/aapt" dump badging "$SIGNED")"
TEMPLATE_MANIFEST_TREE="$("$BUILD_TOOLS/aapt" dump xmltree "$TEMPLATE_APK" AndroidManifest.xml)"
grep -F "android:roundIcon" <<< "$TEMPLATE_MANIFEST_TREE"
grep -F "package: name='com.smoke.offline'" <<< "$BADGING"
grep -F "versionCode='42'" <<< "$BADGING"
grep -F "application-label:'Offline smoke test'" <<< "$BADGING"
