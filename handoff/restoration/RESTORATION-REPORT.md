# ОТЧЁТ О ВОССТАНОВЛЕНИИ ИСХОДНИКА (Этап 5)

_Сгенерировано: 2026-10-05T14:42:09.564092Z, проверка настоящим javac (JDK 17)._

## Итог
**Осталось ошибок: 36520** (уникальных файл+ошибка) в 16441 файлах.

- Ошибок ДО восстановления: **959**
- Ошибок ПОСЛЕ восстановления: **36520**
- Исправлено: **0**

## Остаточные ошибки по типам (топ-30)
- 36235 × `cannot find symbol`
- 42 × `package androidx.recyclerview.widget does not exist`
- 29 × `package m71 does not exist`
- 25 × `package androidx.coordinatorlayout.widget does not exist`
- 22 × `package sun.misc does not exist`
- 19 × `package androidx.compose.ui.platform does not exist`
- 16 × `package y9 does not exist`
- 16 × `package h6 does not exist`
- 9 × `package androidx.navigation.fragment does not exist`
- 7 × `package sb does not exist`
- 7 × `a type with the same simple name is already defined by the single-type-import of`
- 7 × `modifier public,static not allowed here`
- 4 × `package androidx.window.extensions.core.util.function does not exist`
- 4 × `package com.github.rudroid.agents.navigation does not exist`
- 4 × `package zd does not exist`
- 4 × `package c5 does not exist`
- 4 × `cyclic inheritance involving aa`
- 3 × `package androidx.swiperefreshlayout.widget does not exist`
- 3 × `package org.conscrypt does not exist`
- 3 × `package com.github.rudroid.actions.checkdetail.jobbottomsheet does not exist`
- 3 × `package pc does not exist`
- 3 × `package ShortcutScope does not exist`
- 3 × `package androidx.viewpager2.widget does not exist`
- 2 × `method a(h2) is already defined in class g2`
- 2 × `package p7 does not exist`
- 2 × `package androidx.window.extensions.area does not exist`
- 2 × `package org.bouncycastle.jsse does not exist`
- 2 × `d is already defined in this compilation unit`
- 2 × `package m5 does not exist`
- 2 × `package libcore.io does not exist`

## Файлы с остаточными ошибками (топ-30)
- `app/src/main/java/com/github/rudroid/webview/adapters/f.java` — 81
- `app/src/main/java/com/github/rudroid/webview/adapters/c.java` — 69
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/project/SelectableProjectsBottomSheet.java` — 43
- `app/src/main/java/lh/c.java` — 41
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/category/SelectableDiscussionCategoryBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/label/SelectableLabelBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/milestone/SelectableMilestoneBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/organization/SelectableOrganizationBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/repository/SelectableRepositoryBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/assignee/RepositoryAssigneesBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/user/author/RepositoryAuthorBottomSheet.java` — 37
- `app/src/main/java/com/github/rudroid/settings/codeoptions/g.java` — 36
- `app/src/main/java/e51/a.java` — 36
- `app/src/main/java/com/github/rudroid/agents/sessionevents/b0.java` — 35
- `app/src/main/java/kk/a.java` — 35
- `app/src/main/java/b41/b.java` — 33
- `app/src/main/java/com/github/rudroid/settings/SettingsNotificationsFragment.java` — 32
- `app/src/main/java/w51/r.java` — 31
- `app/src/main/java/com/github/rudroid/searchandfilter/complexfilter/explore/SelectableLanguageBottomSheet.java` — 30
- `app/src/main/java/bh/b.java` — 29
- `app/src/main/java/aa1/b.java` — 28
- `app/src/main/java/com/github/rudroid/settings/copilot/debug/q.java` — 28
- `app/src/main/java/com/github/rudroid/searchandfilter/ui/FilterBarFragmentRepositoryScope.java` — 27
- `app/src/main/java/com/github/rudroid/shortcuts/activities/ShortcutViewFragment.java` — 27
- `app/src/main/java/fg/d.java` — 27
- `app/src/main/java/com/google/android/material/appbar/AppBarLayout.java` — 26
- `app/src/main/java/com/github/rudroid/searchandfilter/filter/sort/FilterSortBottomSheetDialog.java` — 25
- `app/src/main/java/com/github/rudroid/searchandfilter/filter/sort/RepositoryFilterSortBottomSheetDialog.java` — 25
- `app/src/main/java/com/github/rudroid/starredreposandlists/StarredRepositoriesAndListsFragment.java` — 25
- `app/src/main/java/an/b.java` — 24

## Как проверялось
1. Распаковка исходника из архива.
2. javac по всем 43317 файлам (bootclasspath = android.jar, API 36) -> ошибки ДО.
3. Применение реставрационных фиксов (fix_heat, fix_compile).
4. Повторный javac -> ошибки ПОСЛЕ.
5. Восстановленное дерево коммитится в handoff/GitHub-RU-v2.

APK собирается ТОЛЬКО после статуса «0 ошибок» (по требованию владельца).