# ОТЧЁТ: полный анализ исходников (Этап 1)

_Сгенерировано GitHub Actions, раннер ubuntu-latest._

## 1. Общая картина
- Всего файлов: **46348**
- Общий размер: **83.7 МБ**
- Java-файлов: **43317** (~2 167 532 строк)
- Kotlin-файлов: **0**
- XML-файлов: **2760**
- Расширения (топ-15):
  - `.java` — 43317
  - `.xml` — 2760
  - `.png` — 204
  - `.json` — 18
  - `.otf` — 12
  - `.css` — 7
  - `.webp` — 7
  - `.gradle` — 3
  - `.html` — 3
  - `(без расширения)` — 2
  - `.properties` — 2
  - `.so` — 2
  - `.md` — 1
  - `.bat` — 1
  - `.jks` — 1

## 2. Что за приложение
- Манифест: `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/AndroidManifest.xml`
  - package: **None**; versionName: None; versionCode: None
  - Activities: 108; Services: 16; Receivers: 12
  - foregroundServiceType: None
  - Разрешения (16): `POST_NOTIFICATIONS`, `POST_PROMOTED_NOTIFICATIONS`, `INTERNET`, `USE_BIOMETRIC`, `USE_FINGERPRINT`, `BILLING`, `ACCESS_NETWORK_STATE`, `WAKE_LOCK`, `RECEIVE`, `BIND_GET_INSTALL_REFERRER_SERVICE`, `AD_ID`, `ACCESS_ADSERVICES_ATTRIBUTION`, `ACCESS_ADSERVICES_AD_ID`, `RECEIVE_BOOT_COMPLETED`, `FOREGROUND_SERVICE`, `DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`
- app_name: `GitHub` (GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/res/values-ru/strings.xml); `GitHub` (GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/res/values-ko-rKR/strings.xml); `GitHub` (GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/res/values-zh-rCN/strings.xml); `GitHub` (GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/res/values-pt-rBR/strings.xml); `GitHub` (GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/res/values-es-rES/strings.xml)
- README-файлы: ['GitHub-RU-Source (1)/GitHub-RU-Source/README.md']
- LICENSE-файлы: НЕТ — лицензия оригинала не приложена!

## 3. Gradle / сборка
- applicationId: **com.github.rudroid**
- namespace: **com.github.rudroid**
- minSdk: **26**
- targetSdk: **36**
- compileSdk: **36**
- AGP: 8.7.3
- Gradle-файлы: ['GitHub-RU-Source (1)/GitHub-RU-Source/build.gradle', 'GitHub-RU-Source (1)/GitHub-RU-Source/settings.gradle', 'GitHub-RU-Source (1)/GitHub-RU-Source/gradle.properties', 'GitHub-RU-Source (1)/GitHub-RU-Source/app/build.gradle', 'GitHub-RU-Source (1)/GitHub-RU-Source/gradle/wrapper/gradle-wrapper.properties']

## 4. Структура Java-кода (для реструктуризации в 10 файлов)
- Уникальных классов (по именам файлов): 2643
- Классов с однобуквенными именами (обфускация): **17182**
- Дубликатов файлов (полные копии по md5): **0** в 0 группах
- Топ-30 пакетов по числу файлов:
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.jo` — 1485
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.m10` — 1408
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.jn0` — 1399
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.kc0` — 1295
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.u10` — 1243
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.pz0` — 1232
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.ep` — 1031
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.gn0` — 1015
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.hc0` — 981
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.eo0` — 970
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.fd0` — 894
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.p20` — 856
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.com.github.rudroid.viewmodels` — 318
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.t00` — 310
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.rm0` — 310
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.com.google.android.gms.internal.measurement` — 283
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.wy0` — 276
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.gv` — 266
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.ri0` — 258
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.yz0` — 253
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.xt0` — 250
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.z70` — 243
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.vb0` — 240
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.cq` — 228
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.h10` — 226
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.dw` — 224
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.kz0` — 214
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.ap0` — 206
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.uu0` — 202
  - `GitHub-RU-Source (1).GitHub-RU-Source.app.src.main.java.en0` — 200

## 5. 🔥 АНАЛИЗ НАГРЕВА — где код жжёт батарею

### 5.1. Красные флаги (критично)
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java` строка 159: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java` строка 204: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w60/d.java` строка 24: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/zk/n1.java` строка 79: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yp0/e.java` строка 159: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yp0/e.java` строка 204: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qf0/b.java` строка 28: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qf0/b.java` строка 36: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/kx0/j.java` строка 174: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/nm0/d.java` строка 22: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ju/d.java` строка 25: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qp0/b.java` строка 25: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ks0/i.java` строка 18: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ks0/l.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ks0/k.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ks0/j.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ks0/h.java` строка 23: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/l01/r0.java` строка 12: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ui0/e.java` строка 18: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ui0/g.java` строка 18: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ui0/f.java` строка 24: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ui0/h.java` строка 22: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ui0/h.java` строка 31: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/cr0/c.java` строка 119: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mx/b.java` строка 20: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mx/d.java` строка 20: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yz0/x1.java` строка 13: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yz0/o3.java` строка 33: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yz0/s1.java` строка 13: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/j.java` строка 300: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/v.java` строка 333: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/v.java` строка 461: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/v.java` строка 505: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/d.java` строка 222: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b21/d.java` строка 367: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/e.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/i.java` строка 21: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/c.java` строка 18: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/f.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/b.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/uc0/j.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/u.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/i0.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/p.java` строка 16: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/c0.java` строка 19: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/f.java` строка 16: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/j0.java` строка 17: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/l0.java` строка 23: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/l0.java` строка 34: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/s.java` строка 188: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/s.java` строка 235: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/a0.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/t.java` строка 15: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/d0.java` строка 18: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/v.java` строка 98: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/h0.java` строка 125: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/mg0/h0.java` строка 137: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/g90/f.java` строка 22: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/fw0/x1.java` строка 17: `while(true){...`
- **while(true) БЕЗ sleep/wait — жёсткий цикл грузит ядро на 100%** — `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/fw0/w0.java` строка 15: `while(true){...`

### 5.2. Паттерны по категориям

| Паттерн | Совпадений | Файлы (первые) |
|---|---|---|
| WAKELOCK | 12 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:56`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:57`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:58` |
| Бесконечный цикл while(true)/for(;;) | 7554 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java:159`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java:204`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w60/d.java:24` |
| Thread.sleep в коде | 1 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/c51/c.java:113` |
| Timer / scheduleAtFixedRate | 2 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q41/g.java:68`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q41/d.java:29` |
| Handler.postDelayed (циклы повторов) | 16 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:120`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:124`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:166` |
| Handler(Looper.getMainLooper) | 18 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/l.java:48`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/l.java:68`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/b.java:414` |
| AlarmManager (будильники) | 8 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:3`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:11`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:17` |
| Сенсоры registerListener | 1 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/achievements/ui/w.java:18` |
| SENSOR_DELAY_FASTEST/GAME | 0 | — |
| Запросы геолокации | 0 | — |
| Вибрация | 2 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w2/n1.java:5`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w2/n1.java:10` |
| Медиа-плеер | 1 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/c6/f.java:161` |
| Бесконечные анимации | 0 | — |
| Choreographer (покадровый цикл) | 22 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k21/h.java:4`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k21/h.java:32`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/androidx/profileinstaller/ProfileInstallerInitializer.java:4` |
| Потоки/пулы потоков | 72 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:24`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:28`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:32` |
| Постоянный сервис/foreground | 2 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b6/a2.java:143`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b6/a2.java:148` |
| Показ/удержание экрана | 0 | — |
| Плотные циклы по UI (invalidate/postInvalidate) | 64 | `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/i.java:79`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/l.java:94`, `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/m.java:90` |
| Радио/сканирование (Wifi/Bluetooth LE) | 0 | — |
| Опрос батареи/температуры | 0 | — |

### 5.3. Детальные попадания (топ по каждому паттерну)
#### WAKELOCK (12)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:56` — `PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString(`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:57` — `newWakeLock.setReferenceCounted(false);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:58` — `newWakeLock.acquire(60000L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/AppMeasurementReceiver.java:59` — `sparseArray.put(i, newWakeLock);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/e3.java:130` — `PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/e3.java:131` — `this.t = newWakeLock;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/e3.java:132` — `newWakeLock.setReferenceCounted(false);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w51/y.java:27` — `this.t = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/e9/o.java:18` — `PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/e9/o.java:21` — `k71.k.d(newWakeLock);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/e9/o.java:22` — `return newWakeLock;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/v21/a.java:70` — `this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");`
#### Бесконечный цикл while(true)/for(;;) (7554)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java:159` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/se0/e.java:204` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w60/d.java:24` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/zk/n1.java:79` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yp0/e.java:159` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/yp0/e.java:204` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qf0/b.java:28` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qf0/b.java:36` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/kx0/j.java:174` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/nm0/d.java:22` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/ju/d.java:25` — `while (true) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/qp0/b.java:25` — `while (true) {`
#### Thread.sleep в коде (1)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/c51/c.java:113` — `Thread.sleep((long) min);`
#### Timer / scheduleAtFixedRate (2)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q41/g.java:68` — `public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q41/d.java:29` — `return gVar.s.scheduleAtFixedRate(new e(gVar, this.t, aVar, 0), this.u, this.v, this.w);`
#### Handler.postDelayed (циклы повторов) (16)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:120` — `((RadioButton) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:124` — `((LinearLayout) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:166` — `((RadioButton) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/settings/preferences/RadioPreferenceGroup.java:170` — `((LinearLayout) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/p.java:26` — `if (d().postDelayed(this.b, j)) {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/b1.java:44` — `((Handler) aVar.s).postDelayed(fVar, this.a);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/u3.java:114` — `y3Var5.u.postDelayed(v3Var2, 2000L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/gg/b.java:59` — `((f) fhVar2).A.postDelayed(new s(17, bVar), 200L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/gg/b.java:82` — `((f) fhVar2).A.postDelayed(new s(17, bVar), 200L);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q/r1.java:145` — `view2.postDelayed(this.f30703v, this.f30700s);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q/r1.java:149` — `view2.postDelayed(this.f30704w, this.f30701t);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/androidx/lifecycle/t0.java:63` — `handler.postDelayed(u0Var.f2933x, 700L);`
#### Handler(Looper.getMainLooper) (18)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/l.java:48` — `new Handler(Looper.getMainLooper()).post(new b9.f(12, bVar, typeface2));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/l.java:68` — `new Handler(Looper.getMainLooper()).post(new b9.f(12, bVar, n10));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/q4/b.java:414` — `new Handler(Looper.getMainLooper()).post(new b1.c(this, i, 3));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/e51/a.java:883` — `this.t = new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/sy/y.java:239` — `return Build.VERSION.SDK_INT >= 28 ? a5.l.d(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/fa1/a.java:51` — `this.s = new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/fa1/a.java:54` — `this.s = new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/fa1/a.java:57` — `this.s = new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b41/e.java:22` — `new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w1/b.java:10` — `public static final Handler f32925a = new Handler(Looper.getMainLooper());`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w51/r.java:1621` — `this.t = new Handler(Looper.getMainLooper(), new f0(2, this));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w31/i.java:54` — `public static final Handler A = new Handler(Looper.getMainLooper(), new c());`
#### AlarmManager (будильники) (8)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:3` — `import android.app.AlarmManager;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:11` — `public final AlarmManager v;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:17` — `this.v = (AlarmManager) ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getSystemService("alarm");`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:22` — `AlarmManager alarmManager = this.v;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/d4.java:36` — `AlarmManager alarmManager = this.v;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver.java:9` — `import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver.java:21` — `public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver.java:44` — `int i3 = AlarmManagerSchedulerBroadcastReceiver.a;`
#### Сенсоры registerListener (1)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/github/rudroid/achievements/ui/w.java:18` — `((SensorManager) lVar.f4532a.getValue()).unregisterListener(lVar);`
#### Вибрация (2)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w2/n1.java:5` — `import android.os.Vibrator;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/w2/n1.java:10` — `return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);`
#### Медиа-плеер (1)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/c6/f.java:161` — `activity.startForegroundService(intent2);`
#### Choreographer (покадровый цикл) (22)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k21/h.java:4` — `import android.view.Choreographer;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k21/h.java:32` — `Choreographer choreographer = Choreographer.getInstance();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/androidx/profileinstaller/ProfileInstallerInitializer.java:4` — `import android.view.Choreographer;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/androidx/profileinstaller/ProfileInstallerInitializer.java:20` — `Choreographer.getInstance().postFrameCallback(new a0(this, context.getApplicationContext()));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/do0/m.java:3` — `import android.view.Choreographer;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/do0/m.java:144` — `return Choreographer.getInstance();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/t5/c.java:5` — `import android.view.Choreographer;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/t5/c.java:48` — `((Choreographer) this.f32067e.f28354r).postFrameCallback(new a0(this.f32066d, 1));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/l3/a0.java:7` — `import android.view.Choreographer;`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/l3/a0.java:12` — `public final /* synthetic */ class a0 implements Choreographer.FrameCallback {`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/l3/a0.java:25` — `@Override // android.view.Choreographer.FrameCallback`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/l3/z.java:4` — `import android.view.Choreographer;`
#### Потоки/пулы потоков (72)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:24` — `Object b = bVar.b(new o(o41.a.class, Executor.class));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:28` — `Object b2 = bVar.b(new o(o41.c.class, Executor.class));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:32` — `Object b3 = bVar.b(new o(o41.b.class, Executor.class));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/k41/h.java:36` — `Object b4 = bVar.b(new o(o41.d.class, Executor.class));`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/internal/play_billing/q0.java:29` — `return "MoreExecutors.directExecutor()";`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/internal/measurement/k1.java:25` — `threadPoolExecutor.allowCoreThreadTimeOut(true);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/internal/measurement/k1.java:26` — `this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/internal/measurement/f1.java:8` — `public final ThreadFactory a = Executors.defaultThreadFactory();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/j3.java:102` — `threadPoolExecutor.allowCoreThreadTimeOut(true);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/j3.java:103` — `executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/gms/measurement/internal/g2.java:71` — `new Thread(new f2(t2Var, 0)).start();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/common/util/concurrent/b.java:189` — `p3Var.y = Executors.newScheduledThreadPool(1);`
#### Постоянный сервис/foreground (2)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b6/a2.java:143` — `systemForegroundService.startForeground(i, notification, i10);`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/b6/a2.java:148` — `systemForegroundService.startForeground(i, notification, i10);`
#### Плотные циклы по UI (invalidate/postInvalidate) (64)
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/i.java:79` — `subsamplingScaleImageView.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/l.java:94` — `subsamplingScaleImageView.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/m.java:90` — `subsamplingScaleImageView.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/s61/h.java:86` — `subsamplingScaleImageView.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/x31/j.java:177` — `invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/x31/j.java:178` — `this.B.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/x31/j.java:214` — `tabLayout.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/material/textfield/TextInputLayout.java:578` — `invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/material/textfield/TextInputLayout.java:704` — `invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/material/button/MaterialButtonToggleGroup.java:131` — `invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/material/button/MaterialButton.java:166` — `materialButton.invalidate();`
- `GitHub-RU-Source (1)/GitHub-RU-Source/app/src/main/java/com/google/android/material/button/MaterialButton.java:253` — `invalidate();`

## 6. Выводы (черновик, уточняется на Этапе 2)
1. Причина нагрева ищется среди красных флагов выше — чаще всего это wakelock без таймаута,
   while(true) без sleep, postDelayed с нулевой задержкой или бесконечные анимации.
2. Реструктуризация: дубликатов — 0, значит после схлопывания копий
   и объединения пакетов реально получить компактную структуру.
3. Лицензия оригинала: ОТСУТСТВУЕТ — обязательно добавить атрибуцию оригинала.