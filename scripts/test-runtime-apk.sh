#!/usr/bin/env bash
set -euo pipefail

if [ "$#" -ne 5 ]; then
  echo "usage: test-runtime-apk.sh BUILD_TOOLS_DIR TEMPLATE_APK TEMP_DIR CONVERTER_APK PYTHON_TEMPLATE_APK" >&2
  exit 2
fi
BUILD_TOOLS="$1"
TEMPLATE_APK="$2"
TEMP_DIR="$3"
APP_APK="$4"
PYTHON_TEMPLATE_APK="$5"
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
DIAGNOSTICS_FILE="$TEMP_DIR/runtime-smoke-diagnostics.txt"
mkdir -p "$CLASSES" "$TEMP_DIR"
: > "$DIAGNOSTICS_FILE"
stage() {
  printf '%s\n' "$1" > "$STAGE_FILE"
  echo "Smoke stage: $1"
}
report_failure() {
  local status=$?
  if [ "$status" -ne 0 ]; then
    local failed_stage="$(cat "$STAGE_FILE" 2>/dev/null || echo 'before first smoke stage')"
    local diagnostic_details=""
    if [ -s "$DIAGNOSTICS_FILE" ]; then
      diagnostic_details="; $(tr '\n' ';' < "$DIAGNOSTICS_FILE")"
    fi
    echo "::error title=Runtime APK smoke failed::${failed_stage} (exit ${status})${diagnostic_details}"
    if [ -n "${GITHUB_STEP_SUMMARY:-}" ]; then
      echo "Runtime APK smoke stopped at: ${failed_stage} (exit ${status})${diagnostic_details}" >> "$GITHUB_STEP_SUMMARY"
    fi
  fi
  return "$status"
}
trap report_failure EXIT
stage "compile JVM crypto and APK smoke harness"

javac -encoding UTF-8 -source 8 -target 8 -d "$CLASSES" \
  "$ROOT/scripts/jvm-stubs/android/util/Base64.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/BinaryXmlPatcher.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/IconResourceLocator.java" \
  "$ROOT/shared/src/main/java/com/webapk/security/EncryptedSiteArchive.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/ApkV2Signer.java" \
  "$ROOT/app/src/main/java/ru/webapk/studio/JarV1Signer.java" \
  "$ROOT/scripts/RuntimeApkSmoke.java"
stage "encrypt/decrypt round-trip, integrity and APK rewrite"
java -cp "$CLASSES" ru.webapk.studio.RuntimeApkSmoke "$TEMPLATE_APK" "$UNSIGNED" "$SIGNED" "$SIGNING_KEY" "$SIGNING_PASSWORD" "$SIGNING_ALIAS"
stage "read native-library entries from built APKs"
TEMPLATE_ENTRIES="$(unzip -Z1 "$TEMPLATE_APK")"
SIGNED_ENTRIES="$(unzip -Z1 "$SIGNED")"
APP_ENTRIES="$(unzip -Z1 "$APP_APK")"
check_native_libraries() {
  local label="$1"
  local entries="$2"
  local libraries
  local count
  local compact
  local unexpected
  libraries="$(grep -E '^lib/[^/]+/[^/]+\.so$' <<< "$entries" || true)"
  count="$(printf '%s\n' "$libraries" | sed '/^$/d' | wc -l | tr -d '[:space:]')"
  compact="$(printf '%s' "$libraries" | tr '\n' ',')"
  printf '%s native libraries: [%s]\n' "$label" "$compact" >> "$DIAGNOSTICS_FILE"
  if [ "$count" -ne 2 ]; then
    printf 'ERROR %s expected exactly 2 ARM native libraries, found %s: [%s]\n' "$label" "$count" "$compact" >> "$DIAGNOSTICS_FILE"
    echo "$label must contain exactly one native library for each ARM ABI; found $count: [$compact]" >&2
    exit 1
  fi
  if grep -Eq '^lib/(x86|x86_64)/' <<< "$entries"; then
    local x86_libraries
    x86_libraries="$(grep -E '^lib/(x86|x86_64)/' <<< "$entries" | tr '\n' ',')"
    printf 'ERROR %s unexpectedly contains x86 entries: %s\n' "$label" "$x86_libraries" >> "$DIAGNOSTICS_FILE"
    echo "$label unexpectedly contains an x86 ABI: $x86_libraries" >&2
    exit 1
  fi
  unexpected="$(grep -Ev '^lib/(armeabi-v7a|arm64-v8a)/libc\+\+_shared\.so$' <<< "$libraries" || true)"
  if [ -n "$unexpected" ]; then
    unexpected="$(printf '%s' "$unexpected" | tr '\n' ',')"
    printf 'ERROR %s contains unexpected native libraries: %s\n' "$label" "$unexpected" >> "$DIAGNOSTICS_FILE"
    echo "$label contains an unexpected native library or ABI: $unexpected" >&2
    exit 1
  fi
  for expected in 'lib/armeabi-v7a/libc++_shared.so' 'lib/arm64-v8a/libc++_shared.so'; do
    if ! grep -Fxq "$expected" <<< "$libraries"; then
      printf 'ERROR %s is missing required entry %s; found [%s]\n' "$label" "$expected" "$compact" >> "$DIAGNOSTICS_FILE"
      echo "$label is missing required native library $expected" >&2
      exit 1
    fi
  done
}
stage "verify native libraries in host template APK"
check_native_libraries "Host template APK" "$TEMPLATE_ENTRIES"
stage "verify embedded Python/Flask runtime template"
PYTHON_TEMPLATE_ENTRIES="$(unzip -Z1 "$PYTHON_TEMPLATE_APK")"
if ! grep -Eq '^assets/chaquopy/' <<< "$PYTHON_TEMPLATE_ENTRIES"; then
  echo "Python runtime template is missing Chaquopy runtime assets" >&2
  exit 1
fi
PYTHON_PERMISSIONS="$("$BUILD_TOOLS/aapt" dump permissions "$PYTHON_TEMPLATE_APK")"
grep -F "android.permission.INTERNET" <<< "$PYTHON_PERMISSIONS"
grep -F "android.permission.CAMERA" <<< "$PYTHON_PERMISSIONS"
grep -F "android.permission.RECORD_AUDIO" <<< "$PYTHON_PERMISSIONS"
PYTHON_MANIFEST_TREE="$("$BUILD_TOOLS/aapt" dump xmltree "$PYTHON_TEMPLATE_APK" AndroidManifest.xml)"
grep -F "com.webapk.hosttemplate.PythonHostActivity" <<< "$PYTHON_MANIFEST_TREE"
grep -F "android:networkSecurityConfig" <<< "$PYTHON_MANIFEST_TREE"
PYTHON_BADGING="$("$BUILD_TOOLS/aapt" dump badging "$PYTHON_TEMPLATE_APK")"
grep -F "sdkVersion:'22'" <<< "$PYTHON_BADGING"
grep -F "targetSdkVersion:'33'" <<< "$PYTHON_BADGING"
PYTHONPYCACHEPREFIX="$TEMP_DIR/python-bytecode" python3 -m py_compile \
  "$ROOT/pythonTemplate/src/main/python/engine.py" \
  "$ROOT/pythonTemplate/src/main/python/cloud.py" \
  "$ROOT/pythonTemplate/src/main/python/server.py"
grep -F 'make_server("127.0.0.1", 0' "$ROOT/pythonTemplate/src/main/python/engine.py"
grep -F "FIREBASE_DB_URL = ''" "$ROOT/pythonTemplate/src/main/python/server.py"
grep -F "app.config['LOCAL_ENGINE_TOKEN']" "$ROOT/pythonTemplate/src/main/python/server.py"
if grep -F 'FIREBASE_DB_URL' "$ROOT/pythonTemplate/src/main/python/engine.py"; then
  echo "Generic Python engine must not override environment settings for imported projects" >&2
  exit 1
fi
grep -F 'Cloud storage is disabled' "$ROOT/pythonTemplate/src/main/python/cloud.py"
stage "verify native libraries in generated site APK"
check_native_libraries "Generated site APK" "$SIGNED_ENTRIES"
stage "verify native libraries in converter APK"
check_native_libraries "Converter APK" "$APP_ENTRIES"
stage "compare libc++_shared.so bytes between template and generated site APK"
for ABI in armeabi-v7a arm64-v8a; do
  if ! cmp -s <(unzip -p "$TEMPLATE_APK" "lib/$ABI/libc++_shared.so") \
             <(unzip -p "$SIGNED" "lib/$ABI/libc++_shared.so"); then
    printf 'ERROR libc++_shared.so mismatch for ABI %s between template and generated site APK\n' "$ABI" >> "$DIAGNOSTICS_FILE"
    echo "Generated site APK changed libc++_shared.so for $ABI" >&2
    exit 1
  fi
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
if "$BUILD_TOOLS/aapt" dump permissions "$TEMPLATE_APK" | grep -F "android.permission.INTERNET"; then
  echo "Static site template unexpectedly requests INTERNET permission" >&2
  exit 1
fi
grep -F "android:roundIcon" <<< "$TEMPLATE_MANIFEST_TREE"
grep -F "android:extractNativeLibs" <<< "$TEMPLATE_MANIFEST_TREE"
grep -F "package: name='com.smoke.offline'" <<< "$BADGING"
grep -F "versionCode='42'" <<< "$BADGING"
grep -F "sdkVersion:'22'" <<< "$BADGING"
grep -F "targetSdkVersion:'36'" <<< "$BADGING"
grep -F "application-label:'Offline smoke test'" <<< "$BADGING"
