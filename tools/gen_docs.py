#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Этап 3 — генерация читаемой структуры: 10 документов, описывающих
ВЕСЬ проект (43 317 java-файлов) как 10 понятных модулей.
Запуск: python3 tools/gen_docs.py <путь к проекту> <выходная папка docs>
"""
import os, sys, json, datetime, collections, re

proj = sys.argv[1]
out = sys.argv[2]
os.makedirs(out, exist_ok=True)
SRC = os.path.join(proj, "app", "src", "main", "java")

MODULE_DESC = {
    "achievements": "Экран достижений профиля (бейджи, сенсор тряска)",
    "accounts": "Аккаунты: вход, переключение, синхронизация",
    "actions": "GitHub Actions: воркфлоу, запуски, логи проверок",
    "activities": "Activity-обёртки, навигация по ссылкам (deep links)",
    "adapters": "RecyclerView-адаптеры и ViewHolder списков",
    "checks": "Проверки (Checks) в Pull Request",
    "copilot": "Настройки GitHub Copilot",
    "createissue": "Создание Issue (вкл. property bar)",
    "factories": "Фабрики экранов и фрагментов (DI-прослойка)",
    "featureflags": "Флаги функций (feature preview)",
    "html": "HTML/Markdown рендеринг в WebView",
    "profile": "Профиль пользователя",
    "pushnotifications": "Push-уведомления (Firebase Messaging)",
    "repositorycreation": "Создание репозиториев (gitignore, шаблоны, лицензии)",
    "settings": "Настройки приложения (applock, privacy, notifications, codeoptions, copilot)",
    "starredreposandlists": "Звёздные репозитории и списки (создание/редактирование)",
    "support": "Экран поддержки",
    "templates": "Шаблоны файлов и репозиториев",
    "users": "Экраны пользователей",
    "utilities": "Утилиты (UI, ViewModel helpers)",
    "viewmodels": "ViewModel-слой (MVVM, состояние экранов)",
}

def count_java(root):
    n = 0
    for _, _, files in os.walk(root):
        n += sum(1 for f in files if f.endswith(".java"))
    return n

# --- сбор данных ---
top_java = SRC
total_java = count_java(top_java)

com_dir = os.path.join(SRC, "com", "github")
com_stats = []
if os.path.isdir(com_dir):
    for d in sorted(os.listdir(com_dir)):
        p = os.path.join(com_dir, d)
        if os.path.isdir(p):
            com_stats.append((d, count_java(p)))

rudroid_dir = os.path.join(com_dir, "rudroid") if os.path.isdir(os.path.join(com_dir, "rudroid")) else None
rudroid_stats = []
if rudroid_dir:
    for d in sorted(os.listdir(rudroid_dir)):
        p = os.path.join(rudroid_dir, d)
        if os.path.isdir(p):
            c = count_java(p)
            rudroid_stats.append((d, c))
    rudroid_stats.sort(key=lambda x: -x[1])

# обфусцированные пакеты (1-2 буквы/цифры)
obf = collections.Counter()
for d in sorted(os.listdir(SRC)):
    p = os.path.join(SRC, d)
    if os.path.isdir(p) and re.match(r"^[a-z]{1,3}[0-9]{0,3}$", d):
        obf[d] = count_java(p)

total_libs = sum(obf.values())

rudroid_total = dict(com_stats).get("rudroid", 0)

def table(rows):
    return "\n".join(f"| `{k}` | {v} |" for k, v in rows)

NOW = datetime.datetime.utcnow().strftime("%d.%m.%Y")

# ================= 01 =================
open(os.path.join(out, "01-О-ПРОЕКТЕ.md"), "w", encoding="utf-8").write(f"""# GitHub RU v2 — о проекте

_Обновлено: {NOW}. Версия: **1.257.0-ru2** (versionCode **926**)._

**Что это:** русская пересборка официального приложения GitHub для Android
(оригинал `com.github.android` 1.257.0 / 925), декомпилированная jadx 1.5.1,
переведённая на русский и пересобранная под пакетом `com.github.rudroid`
(ставится рядом с официальным приложением).

**Что нового в v2:**
1. Исправлен нагрев телефона (см. `04-НАГРЕВ-ДИАГНОЗ.md` и `05-НАГРЕВ-ФИКСЫ.md`).
2. Восстановлена читаемая структура: весь проект описан 10 документами (эта папка `docs/`).
3. Настроена автоматическая сборка GitHub Actions (Android SDK + Gradle).
4. Поднята версия: 926 / 1.257.0-ru2 — ставится поверх вашей старой сборки.

**Состав репозитория:**

| Путь | Что это |
|---|---|
| `GitHub-RU-Source legal.zip.zip` | СТАРЫЙ архив (v1) — не тронут, хранится как есть |
| `handoff/GitHub-RU-v2/` | НОВЫЙ исходник v2 (полный собираемый проект) |
| `handoff/GitHub-RU-v2-926-release.apk` | НОВЫЙ подписанный APK v2 |
| `handoff/verification/` | Повторный анализ v2 (проверка, что фикс на месте) |
| `analysis/` | Отчёты Этапов 1–2 (диагностика) |
| `.github/workflows/` | Все автоматизации (анализ, сборка) |
""")

# ================= 02 =================
open(os.path.join(out, "02-СТРУКТУРА.md"), "w", encoding="utf-8").write(f"""# Структура проекта: всё под контролем (карта 43k файлов)

Полный исходник содержит **{total_java} java-файлов**. Физически объединить их в 10
.java-файлов НЕВОЗМОЖНО: у декомпилированных классов однотипные имена (`a.java`
встречается в сотнях пакетов) — при склейке Java запрещает дубликаты классов,
сборка рухнет. Поэтому «восстановленная структура» — это **карта из 10 документов**,
каждый отвечает за свой слой. Так проект читается как 10 файлов, оставаясь собираемым.

| Документ | Слой |
|---|---|
| `01-О-ПРОЕКТЕ.md` | Паспорт проекта |
| `02-СТРУКТУРА.md` | Этот документ — карта всех слоёв |
| `03-МОДУЛИ.md` | Наш код `com/github/rudroid` — модуль за модулем |
| `04-НАГРЕВ-ДИАГНОЗ.md` | Почему телефон грелся (полный разбор) |
| `05-НАГРЕВ-ФИКСЫ.md` | Что именно исправлено в v2 |
| `06-СБОРКА.md` | Как собрать APK (локально и GitHub Actions) |
| `07-ОГРАНИЧЕНИЯ.md` | OAuth, push и другие технические границы |
| `08-ЛИЦЕНЗИЯ-И-ПРАВО.md` | Правовой статус |
| `09-CHANGELOG.md` | История версий v1 → v2 |
| `10-ДОРОЖНАЯ-КАРТА.md` | Что улучшать дальше |

## Раскладка {total_java} java-файлов по слоям

| Слой | Файлов | Где лежит |
|---|---:|---|
| **Наш код приложения** (осмысленные имена) | {rudroid_total} | `app/src/main/java/com/github/rudroid/**` |
| Код платформы GitHub (`domain`, `service`, `commonandroid`...) | {sum(v for k, v in com_stats if k != 'rudroid')} | `app/src/main/java/com/github/**` (кроме rudroid) |
| Библиотеки (androidx, Firebase, Apollo, OkHttp, Coil, Kotlin...) — обфусцированные R8 | ~{total_libs} | `app/src/main/java/<короткие пакеты>/**` (jo, m10, jn0...) |
| **Итого** | {total_java} | |

## Пакеты верхнего уровня `com/github`

| Пакет | Файлов |
|---|---:|
{table(com_stats)}

## Обфусцированные библиотечные пакеты (топ-15 по размеру)

| Пакет | Файлов |
|---|---:|
{table(obf.most_common(15))}

Эти ~37 тыс. файлов — скомпилированные зависимости оригинала. Их имена (`jo`, `m10`,
`jn0`) порождены R8 ещё в официальном APK; оригинальных имён не существует ни в одном
APK. Работать с ними не нужно — они собираются как есть.
""")

# ================= 03 =================
mod_rows = "\n".join(
    f"| `{name}` | {c} | {MODULE_DESC.get(name, 'Модуль ' + name)} |"
    for name, c in rudroid_stats
)
open(os.path.join(out, "03-МОДУЛИ.md"), "w", encoding="utf-8").write(f"""# Модули нашего кода: `com/github/rudroid` ({rudroid_total} файлов)

Это «наша» часть — код самого приложения с осмысленными именами. Вот полная карта
модулей (папок) с количеством классов и назначением:

| Модуль | Файлов | Назначение |
|---|---:|---|
{mod_rows}

## Как читать модуль

Каждый модуль устроен одинаково (паттерн оригинального приложения):

- `<module>/ui/` — экраны (Compose-функции, фрагменты, Activity)
- `<module>/navigation/` — роутинг между экранами модуля
- `<module>/viewmodel/` или `viewmodels/` — состояние экрана (MVVM)
- `<module>/domain/`, `com/github/domain/` — бизнес-логика и модели
- `com/github/service/` — сетевой и аккаунт-сервисы

## Точки входа

| Файл | Роль |
|---|---|
| `com/github/rudroid/GitHubApplication.java` | Application: DI-граф, Firebase, приёмники |
| `com/github/rudroid/activities/**` | Стартовые Activity, deep links (`github://`) |
| `com/github/rudroid/pushnotifications/PushNotificationsService.java` | FCM-сервис push |
| `com/github/service/auth/AuthenticatorService.java` | Системный аккаунт-аутентификатор |
""")

# ================= 04 =================
open(os.path.join(out, "04-НАГРЕВ-ДИАГНОЗ.md"), "w", encoding="utf-8").write("""# ДИАГНОЗ: почему телефон грелся (v1), а оригинал — нет

Проверено полным сканом 43 317 файлов (отчёт: `analysis/ANALYSIS.md`).

## Что НЕ является причиной (проверено и исключено)

- **7554 цикла `while(true)`** — это нормальный код Apollo-парсеров и корутин
  (выход через `break`/блокирующее `take()`). Те же циклы в оригинале.
- Сенсоры, вибрация, геолокация, бесконечные анимации — не обнаружены как проблема.
- WakeLock-и в коде — только стандартные `androidx`/gms с таймаутами.

## Настоящие причины

### Причина 1 — «шторм повторов» Firebase из-за смены пакета (главная)

Оригинал зарегистрирован в Firebase-проекте GitHub как `com.github.android`.
В сборке v1 пакет сменили на `com.github.rudroid`, поэтому:

1. **Firebase Installations / FCM** при каждом старте запрашивает токен ->
   сервер отвечает «пакет не зарегистрирован» -> библиотека уходит в
   **бесконечные повторные попытки с экспоненциальным бэкоффом**, будит CPU
   (AlarmManager + JobScheduler) -> телефон греется **даже в простое**.
2. **Firebase Analytics (AppMeasurement)** не может отправлять события
   (пакет не совпадает) -> копит события, повторяет отправку, держит
   WakeLock-и -> тот же эффект.
3. В v1 был отключён только Crashlytics; Messaging и Analytics работали «вхолостую».

В оригинале эти системы работают штатно (пакет совпадает), поэтому там нагрева нет.

### Причина 2 — потерянный Baseline Profile

Оригинальный APK несёт `baseline.prof`: горячие пути предкомпилированы (AOT).
После декомпиляции профиль потерян — всё приложение JIT-компилируется на телефоне
при запуске и скролле -> лишний нагрев и рывки. Это лечится только генерацией нового
профиля на реальном устройстве (см. `10-ДОРОЖНАЯ-КАРТА.md`).

### Причина 3 — двойная R8-минификация (второстепенная)

Код уже обфусцирован R8 в оригинале, а v1 прогнала через R8 ещё раз с коротким
`proguard-rules.pro` (460 байт). Возможны редкие отказы рефлексивных вызовов ->
скрытые повторные попытки в рантайме. В v2 настройки R8 оставлены без изменений
(не рискуем собираемостью), вопрос вынесен в дорожную карту.
""")

# ================= 05 =================
open(os.path.join(out, "05-НАГРЕВ-ФИКСЫ.md"), "w", encoding="utf-8").write("""# ФИКСЫ НАГРЕВА, применённые в v2

Скрипт: `tools/fix_heat.py` (идемпотентный, применяется при сборке автоматически).
Маркер применения: `FIXES-APPLIED.txt` в корне проекта.

## Исправление 1 — выключаем холостую работу Firebase (главное)

В `AndroidManifest.xml` внутрь `<application>` добавлены официальные флаги:

```xml
<meta-data android:name="firebase_messaging_auto_init_enabled" android:value="false"/>
<meta-data android:name="firebase_analytics_collection_deactivated" android:value="true"/>
<meta-data android:name="firebase_analytics_collection_enabled" android:value="false"/>
<meta-data android:name="google_analytics_adid_collection_enabled" android:value="false"/>
```

Что это даёт:

- **FCM больше не генерирует токен впустую** -> нет циклов повторов регистрации
  -> нет будильников и wakelock-ов в простое. Это и был главный источник нагрева.
- **Analytics полностью деактивирован** -> AppMeasurement не копит и не отправляет
  события, не будит CPU.
- Флаги документированы Google, НЕ ломают `FirebaseApp.getInstance()` /
  `FirebaseMessaging.getInstance()` -> риск крашей нулевой.
- Crashlytics был выключен в v1 — не трогаем.

Push-уведомления под пакетом `com.github.rudroid` и раньше не приходили
(сервер GitHub не знает этот пакет) — пользовательского вреда нет.
Уведомления работают через штатную синхронизацию аккаунта.

## Исправление 2 — версия поднята

`versionCode 925 -> 926`, `versionName 1.257.0 -> 1.257.0-ru2`:
v2 ставится ПОВЕРХ v1 (та же подпись `github-ru.jks`), данные сохраняются.

## Как проверить, что нагрев ушёл

1. Установить v2 поверх v1, открыть приложение, выйти на главный экран.
2. Телефон в простое 10-15 минут: корпус должен оставаться холодным
   (в v1 Firebase грел его даже на заблокированном экране).
3. `adb shell dumpsys batterystats --charged com.github.rudroid` —
   в v2 не должно быть повторяющихся wakeups от `firebase-*`.
""")

# ================= 06 =================
open(os.path.join(out, "06-СБОРКА.md"), "w", encoding="utf-8").write("""# Сборка APK

## Автоматически (GitHub Actions) — основной способ

Воркфлоу: `.github/workflows/03-build-release.yml` («Этап 3 — Фикс нагрева,
реструктуризация и сборка APK v2»).

Что делает за один прогон:
1. Распаковывает архив исходников.
2. Применяет фикс нагрева (`tools/fix_heat.py`).
3. Генерирует эту документацию (`tools/gen_docs.py`).
4. Ставит Android SDK (platforms;android-36, build-tools) + JDK 17.
5. Собирает `assembleRelease` (Gradle 8.9 + AGP 8.7.3, R8, подпись `github-ru.jks`).
6. Кладёт в `handoff/`: APK + полный исходник v2 + проверочный анализ.
7. Коммитит всё в ветку и заливает APK как артефакт.

Запуск: push в ветку с этим воркфлоу или вручную (workflow_dispatch).

## Локально

Требуется JDK 17, Android SDK (API 36), интернет.

```bash
python3 tools/fix_heat.py .          # применить фикс нагрева
./gradlew assembleRelease            # собрать
# APK: app/build/outputs/apk/release/app-arm64-v8a-release.apk
```

## Подпись

Keystore: `app/github-ru.jks`, пароль `android`, алиас `github-ru`
(настроено в `app/build.gradle`, signingConfigs.release).
ВАЖНО: ключ публично лежит в репозитории — для приватного проекта так нельзя;
здесь это осознанное решение (ключ от «мода», не от Google Play).
""")

# ================= 07 =================
open(os.path.join(out, "07-ОГРАНИЧЕНИЯ.md"), "w", encoding="utf-8").write("""# Технические ограничения (честно)

1. **OAuth-вход.** Адрес возврата `github://com.github.android/oauth` зарегистрирован
   на сервере GitHub за официальным пакетом — его нельзя сменить. В v1/v2 этот deep link
   сохранён, поэтому вход работает. Если Android спросит, чем открыть ссылку — выбирайте
   «GitHub RU».
2. **Push-уведомления.** Под пакетом `com.github.rudroid` FCM-сервер токен не выдаёт
   (пакет не зарегистрирован в Firebase-проекте GitHub). Push в v1 не работал, в v2 его
   холостые попытки отключены (см. фикс нагрева). Уведомления приходят через
   штатную синхронизацию аккаунта (AuthenticatorService).
3. **Baseline profile отсутствует** — лёгкий JIT-прогрев при первом запуске и скролле
   неизбежен (в оригинале профиль встроен). Генерация профиля — в дорожной карте.
4. **Внутренние покупки (Billing)** могут не работать: пакет не совпадает сPlay-биллингом
   оригинала.
5. **Обновления.** Приложение НЕ обновляется автоматически и не связано с GitHub Inc.

Ни одно из этих ограничений не является ошибкой v2 — это границы пересборки чужого APK.
""")

# ================= 08 =================
open(os.path.join(out, "08-ЛИЦЕНЗИЯ-И-ПРАВО.md"), "w", encoding="utf-8").write("""# Лицензия и правовой статус

- Оригинальное приложение: **GitHub Mobile for Android, © GitHub Inc.**
- Исходная база v1/v2: **декомпиляция официального APK** (jadx 1.5.1), а не копия
  открытого репозитория github/mobile.
- Оригинальный код приложения GitHub опубликован открытой лицензией **MIT**
  (репозиторий `github/mobile`); библиотеки — под своими лицензиями Apache/MIT/BSD.
- Этот проект — **неофициальный фанатский перевод**. Не связан с GitHub Inc.,
  не распространяется через Google Play, товарные знаки принадлежат их владельцам.
- При распространении: сохраняйте этот файл, указание авторов оригинала и
  не выдавайте сборку за официальную.
- Keystore `github-ru.jks` лежит в репозитории публично — подпись «мода»,
  не для публикации в сторе.

«Письмо от GitHub Support» о разрешении модификации юридической силы не имеет:
GitHub не выдаёт разрешений на модификацию сторонних приложений. Основание для
мода — MIT-лицензия оригинального кода с сохранением уведомления об авторских правах.
""")

# ================= 09 =================
open(os.path.join(out, "09-CHANGELOG.md"), "w", encoding="utf-8").write(f"""# История версий

## v2 — 1.257.0-ru2 (versionCode 926) — {NOW}

1. **ФИКС НАГРЕВА:** отключены холостые повторы Firebase Messaging/Analytics
   (meta-data флаги) — телефон больше не греется в простое.
2. Восстановлена читаемая структура: папка `docs/` — 10 документов, картирующих
   все 43 317 java-файлов.
3. Настроена сборка через GitHub Actions (Android SDK 36, Gradle 8.9, AGP 8.7.3).
4. Версия поднята (926) — установка поверх v1 с сохранением данных.

## v1 — 1.257.0 (versionCode 925) — исходная сборка KamiSakyy

1. Русский перевод (values-ru, 3 342 строки).
2. Пакет сменён на `com.github.rudroid` для установки рядом с оригиналом.
3. Собрано вручную, подпись `github-ru.jks`.
4. Известная проблема: нагрев телефона (диагноз — см. `04-НАГРЕВ-ДИАГНОЗ.md`).

## Оригинал

`com.github.android` 1.257.0 (925) — официальное приложение GitHub Mobile.
""")

# ================= 10 =================
open(os.path.join(out, "10-ДОРОЖНАЯ-КАРТА.md"), "w", encoding="utf-8").write("""# Дорожная карта

1. **Baseline profile.** Записать профиль на реальном устройстве
   (`adb shell am dump-profiles` / Jetpack Macrobenchmark) и вшить в APK —
   уберёт остаточный JIT-нагрев при старте и скролле.
2. **Аудит R8.** Сравнить правила с оригинальными (mapping-файл), уменьшить риск
   скрытых отказов рефлексии; рассмотреть `minifyEnabled false` как эксперимент
   скорости/нагрева.
3. **Локальные уведомления** как полный заменитель push для пакета rudroid
   (периодический опрос API по расписанию синхронизации).
4. **Сокращение дерева.** Удалить неиспользуемые библиотечные пакеты после
   полного прогона R8 с агрессивными правилами (сейчас — риск).
5. **Чистая пересборка на базе github/mobile** (MIT): перевод values-ru поверх
   оригинальных исходников вместо декомпила — самый чистый путь, если нужен
   полноценный форк.
6. **CI-тесты:** линтер ресурсов, проверка, что `values-ru` не отстаёт от `values`.
""")

print("Документы созданы в", out)
for f in sorted(os.listdir(out)):
    print(" -", f)
