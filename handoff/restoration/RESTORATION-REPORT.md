# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)

_Сгенерировано: 2026-10-05T16:39:18.782542Z, проверка настоящим javac (JDK 17)._

## Итог
**Осталось ошибок: 42176** (уникальных файл+ошибка) в 23610 файлах.

- Ошибок ДО восстановления: **959**
- Ошибок ПОСЛЕ восстановления: **42176**
- Исправлено: **0**

## Остаточные ошибки по типам (топ-30)
- 37562 × `cannot find symbol`
- 4269 × `interface expected here`
- 43 × `package androidx.recyclerview.widget does not exist`
- 32 × `wrong number of type arguments; required 4`
- 30 × `package m71 does not exist`
- 25 × `package androidx.coordinatorlayout.widget does not exist`
- 24 × `package y9 does not exist`
- 22 × `package sun.misc does not exist`
- 19 × `package androidx.compose.ui.platform does not exist`
- 16 × `package h6 does not exist`
- 9 × `package sb does not exist`
- 9 × `package androidx.navigation.fragment does not exist`
- 9 × `modifier public,static not allowed here`
- 7 × `a type with the same simple name is already defined by the single-type-import of`
- 5 × `cyclic inheritance involving aa`
- 4 × `package androidx.window.extensions.core.util.function does not exist`
- 4 × `package com.github.rudroid.agents.navigation does not exist`
- 4 × `package zd does not exist`
- 4 × `package c5 does not exist`
- 4 × `package androidx.viewpager2.widget does not exist`
- 4 × `package androidx.window.sidecar does not exist`
- 3 × `package p7 does not exist`
- 3 × `package androidx.swiperefreshlayout.widget does not exist`
- 3 × `package org.conscrypt does not exist`
- 3 × `package com.github.rudroid.actions.checkdetail.jobbottomsheet does not exist`
- 3 × `package pc does not exist`
- 2 × `method a(h2) is already defined in class g2`
- 2 × `package androidx.window.extensions.area does not exist`
- 2 × `package org.bouncycastle.jsse does not exist`
- 2 × `d is already defined in this compilation unit`

## Файлы с остаточными ошибками (топ-30)
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/project/SelectableProjectsBottomSheet.java` — 28
- `app/src/main/java/com/github/rudroid/agents/sessionevents/b0.java` — 27
- `app/src/main/java/com/github/rudroid/settings/SettingsNotificationsFragment.java` — 25
- `app/src/main/java/rm0/o.java` — 25
- `app/src/main/java/com/google/android/gms/internal/measurement/z5.java` — 22
- `app/src/main/java/x61/k.java` — 22
- `app/src/main/java/bz0/c0.java` — 21
- `app/src/main/java/com/github/rudroid/issueorpullrequest/triagesheet/b.java` — 21
- `app/src/main/java/com/google/android/gms/internal/play_billing/i2.java` — 21
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/category/SelectableDiscussionCategoryBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/label/SelectableLabelBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/milestone/SelectableMilestoneBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/organization/SelectableOrganizationBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/repository/SelectableRepositoryBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/assignee/RepositoryAssigneesBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/author/RepositoryAuthorBottomSheet.java` — 20
- `app/src/main/java/com/github/rudroid/shortcuts/activities/ShortcutViewFragment.java` — 20
- `app/src/main/java/x/q0.java` — 19
- `app/src/main/java/x71/h.java` — 19
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/explore/SelectableLanguageBottomSheet.java` — 18
- `app/src/main/java/com/github/rudroid/starredreposandlists/StarredRepositoriesAndListsFragment.java` — 18
- `app/src/main/java/com/github/rudroid/settings/SettingsNotificationSchedulesFragment.java` — 17
- `app/src/main/java/rm0/m0.java` — 17
- `app/src/main/java/com/github/rudroid/settings/codeoptions/g.java` — 16
- `app/src/main/java/k3/l.java` — 16
- `app/src/main/java/androidx/glance/appwidget/protobuf/h1.java` — 15
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/explore/SelectableSpokenLanguageBottomSheet.java` — 15
- `app/src/main/java/com/github/rudroid/widget/k.java` — 15
- `app/src/main/java/i7/d.java` — 15
- `app/src/main/java/rm0/r6.java` — 15

## Как проверялось
1. Распаковка исходника из архива.
2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.
3. Применение реставрационных фиксов (fix_heat, fix_compile).
4. Повторный javac -> ошибки ПОСЛЕ.
5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.

APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).