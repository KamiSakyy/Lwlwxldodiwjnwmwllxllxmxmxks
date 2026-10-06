#!/usr/bin/env bash
# Живой прогон приложения на эмуляторе: открываем экраны так, как это делает
# пользователь, и печатаем точную причину падения. Логи раннера недоступны извне,
# поэтому строки ошибок печатаем аннотациями (::error ...).
set -u

PKG="com.mailgram.app.debug"
APK="app/build/outputs/apk/debug/app-debug.apk"
FAIL=0

say() { echo "== $*"; }

# ---- 1. установка ----
if [ ! -f "$APK" ]; then
  echo "::error title=Эмулятор::APK не собран"
  exit 1
fi
adb install -r "$APK" >/dev/null 2>&1 || { echo "::error title=Эмулятор::не удалось установить APK"; exit 1; }
adb shell pm clear "$PKG" >/dev/null 2>&1
adb shell am force-stop "$PKG" >/dev/null 2>&1
adb logcat -c -b crash >/dev/null 2>&1
adb logcat -c >/dev/null 2>&1

# ---- 2. данные: вход и один диалог, чтобы экран чата открылся ----
cat > /tmp/auth.xml <<'XML'
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <string name="account">test@example.com</string>
</map>
XML
cat > /tmp/chats.json <<'JSON'
{"chats":[{"uid":"aabbccdd","peer":"friend@example.com","name":"Друг","lastTs":1700000000000,"preview":"Привет","out":false,"unread":1,"total":1,"pinned":true,"muted":false,"verified":true,"damaged":false,"pk":""}]}
JSON
cat > /tmp/aabbccdd.jsonl <<'JSONL'
{"mid":"m1","chat":"aabbccdd","peer":"friend@example.com","from":"friend@example.com","to":"test@example.com","ts":1700000000000,"out":false,"type":"text","text":"Привет, это проверка экрана","state":2,"unread":true}
{"mid":"m2","chat":"aabbccdd","peer":"friend@example.com","from":"test@example.com","to":"friend@example.com","ts":1700000006000,"out":true,"type":"text","text":"Привет! Вижу сообщение","state":1}
JSONL
adb push /tmp/auth.xml /data/local/tmp/mg_auth.xml >/dev/null
adb push /tmp/chats.json /data/local/tmp/mg_chats.json >/dev/null
adb push /tmp/aabbccdd.jsonl /data/local/tmp/mg_msgs.jsonl >/dev/null
adb shell chmod 644 /data/local/tmp/mg_auth.xml /data/local/tmp/mg_chats.json /data/local/tmp/mg_msgs.jsonl
adb shell run-as "$PKG" mkdir -p shared_prefs files/store >/dev/null 2>&1
adb shell run-as "$PKG" cp /data/local/tmp/mg_auth.xml shared_prefs/mailgram_auth.xml
adb shell run-as "$PKG" cp /data/local/tmp/mg_chats.json files/store/chats.json
adb shell run-as "$PKG" cp /data/local/tmp/mg_msgs.jsonl files/store/aabbccdd.jsonl
say "данные подготовлены"

# ---- 3. открываем экраны ----
open_screen() {
  local cls="$1"; shift
  adb shell am start -W -n "$PKG/com.mailgram.app.ui.$cls" "$@" >/tmp/am.txt 2>&1
  sleep 6
  local top
  top=$(adb shell dumpsys activity activities 2>/dev/null | grep -m1 -o "$PKG/[a-zA-Z.]*")
  say "$cls -> видно: ${top:-нет}"
  if adb logcat -d -b crash 2>/dev/null | grep -q "FATAL EXCEPTION"; then
    echo "::error title=Падение при открытии $cls::$(adb logcat -d -b crash | grep -A 25 'FATAL EXCEPTION' | tr '\n' ' ' | cut -c1-1200)"
    FAIL=1
    adb logcat -c -b crash
  fi
}

open_screen LoginActivity
open_screen SettingsActivity
open_screen ChatActivity --es chat_uid aabbccdd
open_screen MainActivity
open_screen SetupOauthActivity

# ---- 4. случайные нажатия по интерфейсу (как живой пользователь) ----
say "случайные нажатия"
adb shell am start -n "$PKG/com.mailgram.app.ui.MainActivity" >/dev/null 2>&1
sleep 3
for i in 1 2 3; do
  adb shell monkey -p "$PKG" -v --throttle 150 --pct-syskeys 0 --pct-anyevent 0 120 >/dev/null 2>&1
  sleep 2
  if adb logcat -d -b crash 2>/dev/null | grep -q "FATAL EXCEPTION"; then
    echo "::error title=Падение при нажатиях (круг $i)::$(adb logcat -d -b crash | grep -A 25 'FATAL EXCEPTION' | tr '\n' ' ' | cut -c1-1200)"
    FAIL=1
    adb logcat -c -b crash
  fi
done

# ---- 5. прочие ошибки приложения ----
if [ "$FAIL" = "0" ]; then
  say "падений не найдено"
else
  say "падения найдены — см. аннотации"
fi
exit 0
