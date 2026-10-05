#!/usr/bin/env bash
set -euo pipefail

if [ "$#" -ne 4 ]; then
  echo "usage: test-runtime-apk.sh BUILD_TOOLS_DIR TEMPLATE_APK TEMP_DIR CONVERTER_APK" >&2
  exit 2
fi
BUILD_TOOLS="$1"
TEMPLATE_APK="$2"
TEMP_DIR="$3"
APP_APK="$4"
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
CLASSES="$TEMP_DIR/jvm-smoke-classes"
UNSIGNED="$TEMP_DIR/runtime-smoke-unsigned.apk"
SIGNED="$TEMP_DIR/runtime-smoke.apk"
SECOND_SIGNED="$TEMP_DIR/runtime-smoke-second.apk"
SIGNING_KEY="$ROOT/handoff/WebAPK-Studio-signing.p12"
SIGNING_PROPERTIES="$ROOT/handoff/signing.properties"
SIGNING_PASSWORD="$(sed -n 's/^storePassword=//p' "$SIGNING_PROPERTIES")"
SIGNING_ALIAS="$(sed -n 's/^keyAlias=//p' "$SIGNING_PROPERTIES")"
STAGE_FILE="$TEMP_DIR/smoke-stage.txt"
mkdir -p "$CLASSES" "$TEMP_DIR"
stage() {
  printf '%s\n' "$1" > "$STAGE_FILE"
  echo "Smoke stage: $1"
}
report_failure() {
  local status=$?
  if [ "$status" -ne 0 ]; then
    local failed_stage="$(cat "$STAGE_FILE" 2>/dev/null || echo 'before first smoke stage')"
    echo "::error title=Runtime APK smoke failed::${failed_stage} (exit ${status})"
    if [ -n "${GITHUB_STEP_SUMMARY:-}" ]; then
      echo "Runtime APK smoke stopped at: ${failed_stage} (exit ${status})" >> "$GITHUB_STEP_SUMMARY"
    fi
  fi
  return "$status"
}
trap report_failure EXIT
stage "compile JVM crypto and APK smoke harness"

javac -encoding UTF-8 -source 8 -target 8 -d "$CLASSES" \\
  "$ROOT/scripts/jvm-stubs/android/util/Base64.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/BinaryXmlPatcher.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/IconResourceLocator.java" \
  "$ROOT/shared/src/main/java/com/webapk/security/EncryptedSiteArchive.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/ApkV2Signer.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/JarV1Signer.java" \
  "$ROOT/scripts/RuntimeApkSmoke.java"
stage "encrypt/decrypt round-trip, integrity and APK rewrite"
java -cp "$CLASSES" ru.webapk.studio.RuntimeApkSmoke "$TEMPLATE_APK" "$UNSIGNED" "$SIGNED" "$SIGNING_KEY" "$SIGNING_PASSWORD" "$SIGNING_ALIAS"
stage "verify sole native library and ARM-only ABI filters"
TEMPLATE_ENTRIES="$(unzip -Z1 "$TEMPLATE_APK")"
SIGNED_ENTRIES="$(unzip -Z1 "$SIGNED")"
APP_ENTRIES="$(unzip -Z1 "$APP_APK")"
check_native_libraries() {
  local label="$1"
  local entries="$2"
  local libraries
  local count
  libraries="$(grep -E '^lib/[^/]+/[^/]+\.so$' <<< "$entries" || true)"
  count="$(printf '%s\n' "$libraries" | sed '/^$/d' | wc -l | tr -d '[:space:]')"
  if [ "$count" -ne 2 ]; then
    echo "$label must contain exactly one native library for each ARM ABI; found $count" >&2
    printf '%s\n' "$libraries" >&2
    exit 1
  fi
  if grep -Eq '^lib/(x86|x86_64)/' <<< "$entries"; then
    echo "$label unexpectedly contains an x86 ABI" >&2
    exit 1
  fi
  if grep -Ev '^lib/(armeabi-v7a|arm64-v8a)/libc\+\+_shared\.so$' <<< "$libraries"; then
    echo "$label contains an unexpected native library or ABI" >&2
    exit 1
  fi
  grep -Fx 'lib/armeabi-v7a/libc++_shared.so' <<< "$libraries"
  grep -Fx 'lib/arm64-v8a/libc++_shared.so' <<< "$libraries"
}
check_native_libraries "Host template APK" "$TEMPLATE_ENTRIES"
check_native_libraries "Generated site APK" "$SIGNED_ENTRIES"
check_native_libraries "Converter APK" "$APP_ENTRIES"
for ABI in armeabi-v7a arm64-v8a; do
  cmp <(unzip -p "$TEMPLATE_APK" "lib/$ABI/libc++_shared.so") \
      <(unzip -p "$SIGNED" "lib/$ABI/libc++_shared.so")
done
grep -Fx "assets/a.c" <<< "$SIGNED_ENTRIES"
if grep -Eq '^assets/site/' <<< "$SIGNED_ENTRIES"; then
  echo "Plaintext website files were left in the generated APK" >&2
  exit 1
fi
if unzip -p "$SIGNED" assets/a.c | grep -aF "TOP_SECRET_SOURCE_MARKER" >/dev/null; then
  echo "Encrypted website archive contains a plaintext source marker" >&2
  exit 1
fi
stage "verify APK signatures and stable signing key"
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
stage "verify final manifest and launcher metadata"
BADGING="$("$BUILD_TOOLS/aapt" dump badging "$SIGNED")"
TEMPLATE_MANIFEST_TREE="$("$BUILD_TOOLS/aapt" dump xmltree "$TEMPLATE_APK" AndroidManifest.xml)"
grep -F "android:roundIcon" <<< "$TEMPLATE_MANIFEST_TREE"
grep -F "android:extractNativeLibs" <<< "$TEMPLATE_MANIFEST_TREE"
grep -F "package: name='com.smoke.offline'" <<< "$BADGING"
grep -F "versionCode='42'" <<< "$BADGING"
grep -F "application-label:'Offline smoke test'" <<< "$BADGING"
