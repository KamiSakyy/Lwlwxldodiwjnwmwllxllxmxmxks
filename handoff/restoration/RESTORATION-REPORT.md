# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)

_Сгенерировано: 2026-10-05T13:22:14.532043Z, проверка настоящим javac (JDK 17)._

## Итог
**Осталось ошибок: 386** (уникальных файл+ошибка) в 104 файлах.

- Ошибок ДО восстановления: **708**
- Ошибок ПОСЛЕ восстановления: **386**
- Исправлено: **322**

## Остаточные ошибки по типам (топ-30)
- 95 × `'{' expected`
- 95 × `enum constant expected here`
- 95 × `reached end of file while parsing`
- 91 × `invalid method declaration; return type required`
- 8 × `initializers not allowed in interfaces`
- 1 × `: expected`
- 1 × `illegal start of expression`

## Файлы с остаточными ошибками (топ-30)
- `app/src/main/java/da1/a1.java` — 4
- `app/src/main/java/da1/a2.java` — 4
- `app/src/main/java/da1/a3.java` — 4
- `app/src/main/java/da1/b1.java` — 4
- `app/src/main/java/da1/b2.java` — 4
- `app/src/main/java/da1/b3.java` — 4
- `app/src/main/java/da1/c.java` — 4
- `app/src/main/java/da1/c1.java` — 4
- `app/src/main/java/da1/c2.java` — 4
- `app/src/main/java/da1/c3.java` — 4
- `app/src/main/java/da1/d.java` — 4
- `app/src/main/java/da1/d1.java` — 4
- `app/src/main/java/da1/d2.java` — 4
- `app/src/main/java/da1/d3.java` — 4
- `app/src/main/java/da1/e.java` — 4
- `app/src/main/java/da1/e1.java` — 4
- `app/src/main/java/da1/e2.java` — 4
- `app/src/main/java/da1/e3.java` — 4
- `app/src/main/java/da1/f.java` — 4
- `app/src/main/java/da1/f1.java` — 4
- `app/src/main/java/da1/f2.java` — 4
- `app/src/main/java/da1/f3.java` — 4
- `app/src/main/java/da1/g.java` — 4
- `app/src/main/java/da1/g1.java` — 4
- `app/src/main/java/da1/g2.java` — 4
- `app/src/main/java/da1/g3.java` — 4
- `app/src/main/java/da1/h.java` — 4
- `app/src/main/java/da1/h1.java` — 4
- `app/src/main/java/da1/h2.java` — 4
- `app/src/main/java/da1/h3.java` — 4

## Как проверялось
1. Распаковка исходника из архива.
2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.
3. Применение реставрационных фиксов (fix_heat, fix_compile).
4. Повторный javac -> ошибки ПОСЛЕ.
5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.

APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).