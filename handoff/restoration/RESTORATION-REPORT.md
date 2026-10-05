# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)

_Сгенерировано: 2026-10-05T16:19:26.028971Z, проверка настоящим javac (JDK 17)._

## Итог
**Осталось ошибок: 38086** (уникальных файл+ошибка) в 21627 файлах.

- Ошибок ДО восстановления: **959**
- Ошибок ПОСЛЕ восстановления: **38086**
- Исправлено: **0**

## Остаточные ошибки по типам (топ-30)
- 35059 × `cannot find symbol`
- 2906 × `interface expected here`
- 35 × `wrong number of type arguments; required 4`
- 16 × `package h6 does not exist`
- 9 × `modifier public,static not allowed here`
- 7 × `a type with the same simple name is already defined by the single-type-import of`
- 5 × `cyclic inheritance involving aa`
- 4 × `package c5 does not exist`
- 2 × `method a(h2) is already defined in class g2`
- 2 × `package p7 does not exist`
- 2 × `d is already defined in this compilation unit`
- 2 × `a is already defined in this compilation unit`
- 2 × `package m5 does not exist`
- 2 × `variable EF0 is already defined in enum w`
- 2 × `package h7 does not exist`
- 2 × `variable EF1 is already defined in enum x`
- 2 × `variable EF0 is already defined in enum x`
- 2 × `modifier public not allowed here`
- 2 × `package androidx.window.extensions.layout does not exist`
- 1 × `package f3 does not exist`
- 1 × `class o clashes with package of same name`
- 1 × `package com.github.rudroid.repositories.o clashes with class of same name`
- 1 × `b is already defined in this compilation unit`
- 1 × `l is already defined in this compilation unit`
- 1 × `c is already defined in this compilation unit`
- 1 × `method generateDefaultLayoutParams() is already defined in class AppBarLayout`
- 1 × `method generateLayoutParams(LayoutParams) is already defined in class AppBarLayo`
- 1 × `method generateDefaultLayoutParams() is already defined in class CollapsingToolb`
- 1 × `method generateLayoutParams(AttributeSet) is already defined in class TabLayout`
- 1 × `method f() is already defined in class r0`

## Файлы с остаточными ошибками (топ-30)
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/project/SelectableProjectsBottomSheet.java` — 28
- `app/src/main/java/com/github/rudroid/agents/sessionevents/b0.java` — 27
- `app/src/main/java/com/github/rudroid/settings/SettingsNotificationsFragment.java` — 25
- `app/src/main/java/x61/k.java` — 22
- `app/src/main/java/bz0/c0.java` — 21
- `app/src/main/java/com/github/rudroid/issueorpullrequest/triagesheet/b.java` — 21
- `app/src/main/java/com/google/android/gms/internal/measurement/z5.java` — 21
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/category/SelectableDiscussionCategoryBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/label/SelectableLabelBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/milestone/SelectableMilestoneBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/organization/SelectableOrganizationBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/repository/SelectableRepositoryBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/assignee/RepositoryAssigneesBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/author/RepositoryAuthorBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/shortcuts/activities/ShortcutViewFragment.java` — 20
- `app/src/main/java/com/google/android/gms/internal/play_billing/i2.java` — 20
- `app/src/main/java/x/q0.java` — 19
- `app/src/main/java/x71/h.java` — 19
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/explore/SelectableLanguageBottomSheet.java` — 18
- `app/src/main/java/com/google/android/gms/internal/measurement/i4.java` — 18
- `app/src/main/java/com/github/rudroid/settings/SettingsNotificationSchedulesFragment.java` — 17
- `app/src/main/java/com/github/rudroid/starredreposandlists/StarredRepositoriesAndListsFragment.java` — 17
- `app/src/main/java/k3/l.java` — 16
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/explore/SelectableSpokenLanguageBottomSheet.java` — 15
- `app/src/main/java/com/github/rudroid/settings/codeoptions/g.java` — 15
- `app/src/main/java/com/github/rudroid/widget/k.java` — 15
- `app/src/main/java/e51/a.java` — 15
- `app/src/main/java/androidx/glance/appwidget/protobuf/h1.java` — 14
- `app/src/main/java/bz0/w.java` — 14
- `app/src/main/java/i7/d.java` — 14

## Как проверялось
1. Распаковка исходника из архива.
2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.
3. Применение реставрационных фиксов (fix_heat, fix_compile).
4. Повторный javac -> ошибки ПОСЛЕ.
5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.

APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).