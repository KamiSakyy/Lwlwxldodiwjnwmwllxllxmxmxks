# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)

_Сгенерировано: 2026-10-05T15:52:57.394123Z, проверка настоящим javac (JDK 17)._

## Итог
**Осталось ошибок: 44368** (уникальных файл+ошибка) в 17057 файлах.

- Ошибок ДО восстановления: **959**
- Ошибок ПОСЛЕ восстановления: **44368**
- Исправлено: **0**

## Остаточные ошибки по типам (топ-30)
- 27592 × `cannot find symbol`
- 5238 × `interface expected here`
- 1020 × `incompatible types: String cannot be converted to Object`
- 254 × `incompatible types: a cannot be converted to Object`
- 224 × `incompatible types: a0 cannot be converted to Object`
- 182 × `incomparable types: Object and a`
- 176 × `incompatible types: Object cannot be converted to String`
- 162 × `incompatible types: Object cannot be converted to a`
- 149 × `incompatible types: bad type in conditional expression`
- 141 × `incompatible types: Object cannot be converted to t`
- 132 × `method valueOf in class Enum<E> cannot be applied to given types;`
- 132 × `incompatible types: a61.Object cannot be converted to sy.Object`
- 130 × `incompatible types: Object cannot be converted to b`
- 116 × `incompatible types: c cannot be converted to Object`
- 113 × `method does not override or implement a method from a supertype`
- 113 × `incompatible types: r0 cannot be converted to Object`
- 110 × `incompatible types: Object cannot be converted to c`
- 103 × `incompatible types: g5 cannot be converted to Object`
- 100 × `incompatible types: Object cannot be converted to Long`
- 95 × `incompatible types: b cannot be converted to Object`
- 95 × `int cannot be dereferenced`
- 94 × `incompatible types: List cannot be converted to Object`
- 94 × `incompatible types: Integer cannot be converted to Object`
- 85 × `incompatible types: Object cannot be converted to Integer`
- 84 × `incompatible types: Long cannot be converted to Object`
- 75 × `incompatible types: Object cannot be converted to g`
- 73 × `incompatible types: java.lang.Object cannot be converted to com.google.android.g`
- 69 × `constructor l3 in class l3 cannot be applied to given types;`
- 67 × `incompatible types: Object cannot be converted to j`
- 65 × `incompatible types: Object cannot be converted to s`

## Файлы с остаточными ошибками (топ-30)
- `app/src/main/java/com/google/android/gms/measurement/internal/o4.java` — 582
- `app/src/main/java/com/github/rudroid/settings/codeoptions/g.java` — 577
- `app/src/main/java/com/google/android/gms/internal/measurement/z5.java` — 568
- `app/src/main/java/w51/r.java` — 483
- `app/src/main/java/a61/n0.java` — 422
- `app/src/main/java/a61/o.java` — 396
- `app/src/main/java/com/google/android/gms/internal/measurement/d5.java` — 362
- `app/src/main/java/aa1/b.java` — 354
- `app/src/main/java/gi/b.java` — 342
- `app/src/main/java/com/google/android/gms/measurement/internal/o.java` — 307
- `app/src/main/java/com/github/rudroid/utilities/ui/emojipicker/d.java` — 261
- `app/src/main/java/com/google/common/util/concurrent/a.java` — 220
- `app/src/main/java/com/google/common/util/concurrent/b.java` — 217
- `app/src/main/java/e51/a.java` — 203
- `app/src/main/java/com/google/android/gms/measurement/internal/t4.java` — 194
- `app/src/main/java/k41/b.java` — 184
- `app/src/main/java/a00/a.java` — 177
- `app/src/main/java/com/google/android/gms/measurement/internal/w0.java` — 174
- `app/src/main/java/com/google/android/gms/measurement/internal/p3.java` — 171
- `app/src/main/java/com/google/android/gms/measurement/internal/t2.java` — 170
- `app/src/main/java/l51/h.java` — 164
- `app/src/main/java/com/google/android/gms/internal/measurement/b4.java` — 157
- `app/src/main/java/v71/j1.java` — 141
- `app/src/main/java/kk/a.java` — 138
- `app/src/main/java/k21/f.java` — 133
- `app/src/main/java/go0/z.java` — 130
- `app/src/main/java/com/github/rudroid/twofactor/TwoFactorDialog.java` — 120
- `app/src/main/java/b21/v.java` — 102
- `app/src/main/java/m11/h.java` — 102
- `app/src/main/java/c00/g.java` — 95

## Как проверялось
1. Распаковка исходника из архива.
2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.
3. Применение реставрационных фиксов (fix_heat, fix_compile).
4. Повторный javac -> ошибки ПОСЛЕ.
5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.

APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).