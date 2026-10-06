#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Генератор styles/themes и манифеста темы: значения/ночь пишутся из одного источника.

Идея: имена стилей в values/themes.xml и values-night/themes.xml обязаны совпадать
до последнего символа — иначе в чёрной теме элемент может остаться без оформления
и стать невидимым. Поэтому оба файла собираются одним скриптом.
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'

# --- цвета темы: (светлое значение, тёмное значение) -------------------------------------
THEME_COLORS = {
    "colorPrimary": ("@color/brand", "@color/brand"),
    "colorOnPrimary": ("@color/text_on_accent", "@color/text_on_accent"),
    "colorPrimaryContainer": ("@color/brand", "@color/brand"),
    "colorOnPrimaryContainer": ("@color/text_on_accent", "@color/text_on_accent"),
    "colorSecondary": ("@color/brand", "@color/brand"),
    "colorOnSecondary": ("@color/text_on_accent", "@color/text_on_accent"),
    "colorSecondaryContainer": ("@color/brand_soft", "@color/brand_soft"),
    "colorOnSecondaryContainer": ("@color/text_primary", "@color/text_primary"),
    "colorTertiary": ("@color/brand", "@color/brand"),
    "colorSurface": ("@color/surface", "@color/surface"),
    "colorSurfaceVariant": ("@color/surface_alt", "@color/surface_alt"),
    "colorSurfaceContainer": ("@color/surface", "@color/surface"),
    "colorSurfaceContainerHigh": ("@color/surface_alt", "@color/surface_alt"),
    "colorSurfaceContainerLow": ("@color/surface", "@color/surface"),
    "colorOnSurface": ("@color/text_primary", "@color/text_primary"),
    "colorOnSurfaceVariant": ("@color/text_secondary", "@color/text_secondary"),
    "colorOutline": ("@color/divider", "@color/divider"),
    "colorOutlineVariant": ("@color/divider", "@color/divider"),
    "colorError": ("@color/danger", "@color/danger"),
    "colorOnError": ("#FFFFFFFF", "#FFFFFFFF"),
    "colorControlNormal": ("@color/text_primary", "@color/text_primary"),
    "colorControlHighlight": ("@color/ripple", "@color/ripple"),
    "rippleColor": ("@color/ripple", "@color/ripple"),
    "android:colorBackground": ("@color/bg", "@color/bg"),
    "android:textColorPrimary": ("@color/text_primary", "@color/text_primary"),
    "android:textColorSecondary": ("@color/text_secondary", "@color/text_secondary"),
    "android:textColorHint": ("@color/text_tertiary", "@color/text_tertiary"),
    "android:statusBarColor": ("@android:color/transparent", "@android:color/transparent"),
    "android:navigationBarColor": ("@android:color/transparent", "@android:color/transparent"),
    "android:windowLightStatusBar": ("true", "false"),
    "android:windowLightNavigationBar": ("true", "false"),
    "android:windowBackground": ("@color/bg", "@color/bg"),
    "colorAccent": ("@color/brand", "@color/brand"),
}

# --- общие атрибуты темы (одинаковые в обеих темах) --------------------------------------
THEME_COMMON = [
    ("android:windowDrawsSystemBarBackgrounds", "true"),
    ("android:windowNoTitle", "true"),
    ("android:windowActivityTransitions", "true"),
    ("android:windowContentTransitions", "true"),
    ("android:windowAnimationStyle", "@style/Animation.MailGram"),
    ("android:windowLayoutInDisplayCutoutMode", "shortEdges"),
    ("android:enforceStatusBarContrast", "false"),
    ("android:enforceNavigationBarContrast", "false"),
    ("android:fontFamily", "sans-serif"),
    ("materialAlertDialogTheme", "@style/Theme.MailGram.Dialog"),
    ("bottomSheetDialogTheme", "@style/Theme.MailGram.Sheet"),
    ("toolbarStyle", "@style/Widget.MailGram.Toolbar"),
    ("android:toolbarStyle", "@style/Widget.MailGram.Toolbar"),
]

DIALOG_COLORS = {
    "colorPrimary": "@color/brand",
    "colorSurface": "@color/surface",
    "colorOnSurface": "@color/text_primary",
    "colorOnSurfaceVariant": "@color/text_secondary",
    "colorSurfaceContainerHigh": "@color/surface_alt",
    "colorOutline": "@color/divider",
    "android:textColorPrimary": "@color/text_primary",
    "android:textColorSecondary": "@color/text_secondary",
    "android:colorBackgroundFloating": "@color/surface",
    "android:windowBackground": "@color/surface",
    "shapeAppearanceCornerExtraLarge": "@style/ShapeAppearance.MailGram.Dialog",
    "shapeAppearanceCornerLarge": "@style/ShapeAppearance.MailGram.Dialog",
}

# --- стили: (имя, родитель, атрибуты) -----------------------------------------------------
STYLES = [
    ("Animation.MailGram", "@android:style/Animation.Activity", [
        ("android:activityOpenEnterAnimation", "@anim/slide_in_right"),
        ("android:activityOpenExitAnimation", "@anim/fade_out_slight"),
        ("android:activityCloseEnterAnimation", "@anim/fade_in_slight"),
        ("android:activityCloseExitAnimation", "@anim/slide_out_right"),
    ]),
    ("ShapeAppearance.MailGram.Dialog", "", [
        ("cornerFamily", "rounded"), ("cornerSize", "22dp"),
    ]),
    ("ShapeAppearance.MailGram.Media", "", [
        ("cornerFamily", "rounded"), ("cornerSize", "14dp"),
    ]),
    ("ShapeAppearance.MailGram.Circle", "", [
        ("cornerFamily", "rounded"), ("cornerSize", "50%"),
    ]),
    ("ShapeAppearance.MailGram.Sheet", "", [
        ("cornerFamily", "rounded"), ("cornerSizeTopLeft", "22dp"),
        ("cornerSizeTopRight", "22dp"), ("cornerSizeBottomLeft", "0dp"),
        ("cornerSizeBottomRight", "0dp"),
    ]),

    # ---------------------------------------------------------------- типографика (iOS 26)
    ("TextAppearance.MailGram.Hero", "TextAppearance.Material3.HeadlineLarge", [
        ("android:textSize", "32sp"), ("android:textStyle", "bold"),
        ("android:textColor", "@color/text_primary"), ("android:letterSpacing", "-0.02"),
    ]),
    ("TextAppearance.MailGram.Title", "TextAppearance.Material3.TitleLarge", [
        ("android:textSize", "22sp"), ("android:textStyle", "bold"),
        ("android:textColor", "@color/text_primary"),
    ]),
    ("TextAppearance.MailGram.RowTitle", "TextAppearance.Material3.BodyLarge", [
        ("android:textSize", "17sp"), ("android:textColor", "@color/text_primary"),
    ]),
    ("TextAppearance.MailGram.Body", "TextAppearance.Material3.BodyLarge", [
        ("android:textSize", "16sp"), ("android:textColor", "@color/text_primary"),
    ]),
    ("TextAppearance.MailGram.BodySmall", "TextAppearance.Material3.BodyMedium", [
        ("android:textSize", "14sp"), ("android:textColor", "@color/text_secondary"),
    ]),
    ("TextAppearance.MailGram.Caption", "TextAppearance.Material3.LabelSmall", [
        ("android:textSize", "12sp"), ("android:textColor", "@color/text_secondary"),
    ]),
    ("TextAppearance.MailGram.Section", "TextAppearance.Material3.LabelLarge", [
        ("android:textSize", "13sp"), ("android:textStyle", "bold"),
        ("android:textColor", "@color/text_secondary"), ("android:letterSpacing", "0.06"),
    ]),
    ("TextAppearance.MailGram.ChatTitle", "TextAppearance.Material3.TitleMedium", [
        ("android:textSize", "17sp"), ("android:textStyle", "bold"),
        ("android:textColor", "@color/text_primary"),
    ]),
    ("TextAppearance.MailGram.ChatSubtitle", "TextAppearance.Material3.BodySmall", [
        ("android:textSize", "13sp"), ("android:textColor", "@color/brand"),
    ]),
    ("TextAppearance.MailGram.Button", "TextAppearance.Material3.LabelLarge", [
        ("android:textSize", "16sp"), ("android:textStyle", "bold"),
    ]),

    # ------------------------------------------------------------------------ шапки и панели
    ("Widget.MailGram.Toolbar", "Widget.Material3.Toolbar", [
        ("android:background", "@android:color/transparent"),
        ("android:minHeight", "56dp"),
        ("titleTextAppearance", "@style/TextAppearance.MailGram.ChatTitle"),
        ("subtitleTextAppearance", "@style/TextAppearance.MailGram.Caption"),
        ("titleTextColor", "@color/text_primary"),
        ("subtitleTextColor", "@color/text_secondary"),
        ("navigationIconTint", "@color/text_primary"),
        ("contentInsetStartWithNavigation", "4dp"),
        ("contentInsetStart", "4dp"),
        ("contentInsetEnd", "4dp"),
    ]),
    ("Widget.MailGram.GlassIcon", "", [
        ("android:layout_width", "42dp"), ("android:layout_height", "42dp"),
        ("android:background", "@drawable/bg_header_icon"),
        ("android:padding", "9dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_primary"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.Pill", "", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "36dp"),
        ("android:gravity", "center"),
        ("android:minWidth", "64dp"),
        ("android:paddingStart", "16dp"), ("android:paddingEnd", "16dp"),
        ("android:singleLine", "true"),
        ("android:textAppearance", "@style/TextAppearance.MailGram.BodySmall"),
        ("android:textColor", "@color/text_secondary"),
        ("android:background", "@drawable/bg_glass_pill"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.PillActive", "Widget.MailGram.Pill", [
        ("android:textColor", "@color/text_on_accent"),
        ("android:textStyle", "bold"),
        ("android:background", "@drawable/bg_pill_accent"),
    ]),

    # ------------------------------------------------------------------------- ряды и карточки
    ("Widget.MailGram.Row", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:minHeight", "54dp"),
        ("android:gravity", "center_vertical"),
        ("android:orientation", "horizontal"),
        ("android:paddingStart", "16dp"), ("android:paddingEnd", "16dp"),
        ("android:paddingTop", "8dp"), ("android:paddingBottom", "8dp"),
        ("android:background", "@drawable/bg_row_ripple"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.RowTitle", "TextAppearance.MailGram.RowTitle", [
        ("android:layout_width", "0dp"), ("android:layout_height", "wrap_content"),
        ("android:layout_weight", "1"),
    ]),
    ("Widget.MailGram.RowValue", "TextAppearance.MailGram.BodySmall", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "wrap_content"),
        ("android:textColor", "@color/text_secondary"),
        ("android:paddingStart", "10dp"),
    ]),
    ("Widget.MailGram.SectionTitle", "TextAppearance.MailGram.Section", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:paddingStart", "20dp"), ("android:paddingEnd", "20dp"),
        ("android:paddingTop", "22dp"), ("android:paddingBottom", "9dp"),
    ]),
    ("Widget.MailGram.Card", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:orientation", "vertical"),
        ("android:background", "@drawable/bg_card"),
        ("android:clipToOutline", "true"),
    ]),
    ("Widget.MailGram.CardRow", "Widget.MailGram.Row", []),
    ("Widget.MailGram.Separator", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "1dp"),
        ("android:background", "@drawable/bg_separator"),
    ]),

    # -------------------------------------------------------------------------------- кнопки
    ("Widget.MailGram.Button.Accent", "Widget.Material3.Button", [
        ("android:layout_height", "52dp"),
        ("android:backgroundTint", "@color/brand"),
        ("android:textColor", "@color/text_on_accent"),
        ("android:textAllCaps", "false"),
        ("android:textAppearance", "@style/TextAppearance.MailGram.Button"),
        ("app:cornerRadius", "16dp"),
        ("app:rippleColor", "@color/ripple_strong"),
        ("app:iconTint", "@color/text_on_accent"),
        ("app:iconPadding", "10dp"),
        ("app:iconGravity", "textStart"),
    ]),
    ("Widget.MailGram.Button.Ghost", "Widget.Material3.Button.OutlinedButton", [
        ("android:layout_height", "52dp"),
        ("android:textColor", "@color/text_primary"),
        ("android:textAllCaps", "false"),
        ("android:textAppearance", "@style/TextAppearance.MailGram.Button"),
        ("app:strokeColor", "@color/divider"),
        ("app:strokeWidth", "1dp"),
        ("app:cornerRadius", "16dp"),
        ("app:rippleColor", "@color/ripple"),
    ]),
    ("Widget.MailGram.Button.Text", "Widget.Material3.Button.TextButton", [
        ("android:layout_height", "48dp"),
        ("android:textColor", "@color/brand"),
        ("android:textAllCaps", "false"),
        ("android:textAppearance", "@style/TextAppearance.MailGram.Button"),
        ("app:rippleColor", "@color/ripple"),
    ]),
    ("Widget.MailGram.Switch", "Widget.Material3.CompoundButton.MaterialSwitch", [
        ("android:minHeight", "48dp"),
        ("app:thumbTint", "@color/text_on_accent"),
    ]),
    ("Widget.MailGram.RadioButton", "Widget.Material3.CompoundButton.RadioButton", [
        ("android:textAppearance", "@style/TextAppearance.MailGram.RowTitle"),
        ("android:textColor", "@color/text_primary"),
        ("android:buttonTint", "@color/brand"),
        ("app:buttonTint", "@color/brand"),
        ("android:minHeight", "48dp"),
    ]),
    ("Widget.MailGram.Progress", "Widget.Material3.LinearProgressIndicator", [
        ("android:layout_height", "3dp"),
        ("app:indicatorColor", "@color/brand"),
        ("app:trackColor", "@color/divider"),
        ("app:trackThickness", "3dp"),
    ]),
    ("Widget.MailGram.Input", "Widget.Material3.TextInputEditText", [
        ("android:textColor", "@color/text_primary"),
        ("android:textColorHint", "@color/text_tertiary"),
        ("android:textSize", "16sp"),
        ("android:background", "@drawable/bg_input"),
        ("android:paddingStart", "18dp"), ("android:paddingEnd", "18dp"),
        ("android:minHeight", "44dp"),
    ]),
    ("Widget.MailGram.FileRow", "Widget.MailGram.Card", [
        ("android:background", "@drawable/bg_row_ripple_round"),
    ]),
]

# Стили вложений — пункт меню «прикрепить» (кружок иконки в каскаде).
STYLES += [
    ("Widget.MailGram.AttachAction", "", [
        ("android:layout_width", "0dp"),
        ("android:layout_height", "wrap_content"),
        ("android:layout_weight", "1"),
        ("android:orientation", "vertical"),
        ("android:gravity", "center"),
        ("android:minHeight", "84dp"),
        ("android:paddingTop", "12dp"), ("android:paddingBottom", "12dp"),
        ("android:background", "@drawable/bg_row_ripple_round"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.AttachIcon", "", [
        ("android:layout_width", "48dp"), ("android:layout_height", "48dp"),
        ("android:background", "@drawable/bg_attach_sheet_icon"),
        ("android:padding", "12dp"),
        ("android:tint", "@color/brand"),
    ]),
    ("Widget.MailGram.AttachLabel", "TextAppearance.MailGram.Caption", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "wrap_content"),
        ("android:layout_marginTop", "8dp"),
        ("android:textColor", "@color/text_primary"),
        ("android:gravity", "center"),
        ("android:textSize", "12sp"),
    ]),
]


def render_theme(night):
    idx = 1 if night else 0
    lines = [HEAD, "<!--\n  Тема MailGram (%s). Собирается скриптом tools/make_themes.py:\n"
             "  наборы стилей в светлой и чёрной темах совпадают полностью.\n-->\n" % (
                 "чёрная, чистый чёрный фон как в iOS Dark и Telegram Night" if night
                 else "светлая"), "<resources>\n"]
    lines.append('    <style name="Theme.MailGram" parent="Theme.Material3.DayNight.NoActionBar">\n')
    for name, values in sorted(THEME_COLORS.items()):
        lines.append('        <item name="%s">%s</item>\n' % (name, values[idx]))
    for name, value in THEME_COMMON:
        lines.append('        <item name="%s">%s</item>\n' % (name, value))
    lines.append("    </style>\n\n")
    for name, parent, items in STYLES:
        if name == "Theme.MailGram.Dialog":
            continue
        # parent="" обязателен: без него Android достраивает родителя по имени
        # (ShapeAppearance.MailGram.Media → ShapeAppearance.MailGram) и сборка падает
        parent_attr = ' parent="%s"' % parent
        lines.append('    <style name="%s"%s>\n' % (name, parent_attr))
        for attr, value in items:
            lines.append('        <item name="%s">%s</item>\n' % (attr, value))
        lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Dialog" parent="ThemeOverlay.Material3.MaterialAlertDialog">\n')
    for attr, value in sorted(DIALOG_COLORS.items()):
        lines.append('        <item name="%s">%s</item>\n' % (attr, value))
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Sheet" parent="ThemeOverlay.Material3.BottomSheetDialog">\n')
    lines.append('        <item name="bottomSheetStyle">@style/Widget.MailGram.BottomSheet</item>\n')
    for attr, value in sorted(DIALOG_COLORS.items()):
        lines.append('        <item name="%s">%s</item>\n' % (attr, value))
    lines.append("    </style>\n\n")
    lines.append('    <style name="Widget.MailGram.BottomSheet" parent="Widget.Material3.BottomSheet.Modal">\n')
    lines.append('        <item name="android:background">@drawable/bg_sheet</item>\n')
    lines.append('        <item name="backgroundTint">@color/surface</item>\n')
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Transparent" parent="Theme.MailGram">\n')
    lines.append('        <item name="android:windowBackground">@android:color/transparent</item>\n')
    lines.append('        <item name="android:windowIsTranslucent">true</item>\n')
    lines.append('        <item name="android:windowNoTitle">true</item>\n')
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Fullscreen" parent="Theme.MailGram">\n')
    lines.append('        <item name="android:windowBackground">@color/bg</item>\n')
    lines.append('        <item name="android:windowLightStatusBar">false</item>\n')
    lines.append("    </style>\n")
    lines.append("</resources>\n")
    return "".join(lines)


def main():
    for night, path in ((False, os.path.join(RES, "values", "themes.xml")),
                        (True, os.path.join(RES, "values-night", "themes.xml"))):
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(render_theme(night))
    print("themes.xml и values-night/themes.xml записаны (%d стилей)" % (len(STYLES) + 6))
    return 0


if __name__ == "__main__":
    sys.exit(main())
