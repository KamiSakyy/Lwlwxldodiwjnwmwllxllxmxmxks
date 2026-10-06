#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Темы MailGram: точные размеры и цвета старого дизайна (CSS из server (13).py).

Оба набора (values и values-night) содержат одинаковый список стилей — это защищает
от «невидимых» элементов. Дизайн всегда чёрный: фон #000, шапки #0d0d0d, поверхности
#1c1c1e / #2c2c2e, акцент #0a84ff.
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'

THEME_ITEMS = [
    # акцент
    ("colorPrimary", "@color/brand"),
    ("colorOnPrimary", "@color/text_on_accent"),
    ("colorPrimaryContainer", "@color/surface3"),
    ("colorOnPrimaryContainer", "@color/text_primary"),
    ("colorSecondary", "@color/brand"),
    ("colorOnSecondary", "@color/text_on_accent"),
    ("colorSecondaryContainer", "@color/surface3"),
    ("colorOnSecondaryContainer", "@color/text_primary"),
    ("colorTertiary", "@color/brand"),
    # поверхности
    ("colorSurface", "@color/surface2"),
    ("colorSurfaceVariant", "@color/surface3"),
    ("colorSurfaceContainer", "@color/surface2"),
    ("colorSurfaceContainerHigh", "@color/surface3"),
    ("colorSurfaceContainerLow", "@color/surface1"),
    ("colorOnSurface", "@color/text_primary"),
    ("colorOnSurfaceVariant", "@color/text_secondary"),
    ("colorOutline", "@color/bar_border"),
    ("colorOutlineVariant", "@color/row_divider"),
    ("colorError", "@color/danger"),
    ("colorOnError", "@color/text_primary"),
    ("colorControlNormal", "@color/text_primary"),
    ("colorControlHighlight", "@color/ripple"),
    ("rippleColor", "@color/ripple"),
    ("android:colorBackground", "@color/bg"),
    ("android:textColorPrimary", "@color/text_primary"),
    ("android:textColorSecondary", "@color/text_secondary"),
    ("android:textColorHint", "@color/text_muted"),
    # системные панели: прозрачные, контент под ними (edge-to-edge)
    ("android:statusBarColor", "@android:color/transparent"),
    ("android:navigationBarColor", "@android:color/transparent"),
    ("android:windowLightStatusBar", "false"),
    ("android:windowLightNavigationBar", "false"),
    ("android:windowBackground", "@color/bg"),
    ("colorAccent", "@color/brand"),
    # прочее
    ("android:windowDrawsSystemBarBackgrounds", "true"),
    ("android:windowNoTitle", "true"),
    ("android:windowActivityTransitions", "true"),
    ("android:windowContentTransitions", "true"),
    ("android:windowAnimationStyle", "@style/Animation.MailGram"),
    ("android:windowLayoutInDisplayCutoutMode", "shortEdges"),
    ("android:enforceStatusBarContrast", "false"),
    ("android:enforceNavigationBarContrast", "false"),
    ("materialAlertDialogTheme", "@style/Theme.MailGram.Dialog"),
    ("toolbarStyle", "@style/Widget.MailGram.Toolbar"),
    ("android:toolbarStyle", "@style/Widget.MailGram.Toolbar"),
]

# ------------------------------------------------------------------ типографика (px → sp/dp)
TEXT_STYLES = [
    # имя, родитель, размер, стиль, цвет, межбуквенное
    ("HeaderMain", "TextAppearance.Material3.HeadlineSmall", "20sp", "bold", "@color/text_primary", "0.08"),
    ("HeaderTitle", "TextAppearance.Material3.TitleMedium", "16sp", "bold", "@color/text_primary", "0.05"),
    ("HeaderSubtitle", "TextAppearance.Material3.BodySmall", "12sp", "normal", "@color/text_icon", "0"),
    ("DialogName", "TextAppearance.Material3.BodyLarge", "15sp", "bold", "@color/text_primary", "0"),
    ("DialogTime", "TextAppearance.Material3.LabelSmall", "11sp", "normal", "@color/text_muted", "0"),
    ("DialogPreview", "TextAppearance.Material3.BodySmall", "13sp", "normal", "@color/text_secondary", "0"),
    ("BubbleText", "TextAppearance.Material3.BodyMedium", "14sp", "normal", "@color/text_primary", "0"),
    ("BubbleTime", "TextAppearance.Material3.LabelSmall", "10sp", "normal", "@color/text_secondary", "0"),
    ("BubbleAuthor", "TextAppearance.Material3.LabelSmall", "11sp", "bold", "@color/text_dim", "0"),
    ("ReplyName", "TextAppearance.Material3.LabelSmall", "11sp", "bold", "@color/text_dim", "0"),
    ("ReplyText", "TextAppearance.Material3.LabelSmall", "12sp", "normal", "@color/text_drawer", "0"),
    ("FolderTab", "TextAppearance.Material3.LabelLarge", "13sp", "normal", "@color/text_icon", "0"),
    ("ActionItem", "TextAppearance.Material3.BodyMedium", "15sp", "bold", "@color/text_primary", "0"),
    ("DrawerItem", "TextAppearance.Material3.BodyMedium", "15sp", "bold", "@color/text_drawer", "0"),
    ("DrawerName", "TextAppearance.Material3.TitleLarge", "18sp", "bold", "@color/text_primary", "0"),
    ("DrawerOnline", "TextAppearance.Material3.LabelLarge", "13sp", "bold", "@color/success", "0"),
    ("DrawerStatus", "TextAppearance.Material3.BodySmall", "13sp", "normal", "@color/text_dim", "0"),
    ("ModalTitle", "TextAppearance.Material3.TitleMedium", "18sp", "bold", "@color/text_primary", "0"),
    ("ModalText", "TextAppearance.Material3.BodySmall", "13sp", "normal", "@color/text_dim", "0"),
    ("LoginTitle", "TextAppearance.Material3.HeadlineLarge", "32sp", "bold", "@color/text_primary", "0.15"),
    ("LoginText", "TextAppearance.Material3.BodySmall", "13sp", "normal", "@color/text_secondary", "0"),
    ("Chip", "TextAppearance.Material3.LabelMedium", "12sp", "bold", "@color/text_icon", "0"),
    ("Section", "TextAppearance.Material3.LabelMedium", "12sp", "bold", "@color/text_primary", "0.08"),
    ("Caption", "TextAppearance.Material3.LabelSmall", "11sp", "normal", "@color/text_muted", "0"),
]

# ------------------------------------------------------------------ стили виджетов
WIDGETS = [
    ("Widget.MailGram.Toolbar", "Widget.Material3.Toolbar", [
        ("android:background", "@android:color/transparent"),
        ("android:minHeight", "56dp"),
        ("titleTextAppearance", "@style/TextAppearance.MailGram.HeaderTitle"),
        ("subtitleTextAppearance", "@style/TextAppearance.MailGram.HeaderSubtitle"),
        ("titleTextColor", "@color/text_primary"),
        ("subtitleTextColor", "@color/text_icon"),
        ("navigationIconTint", "@color/text_primary"),
        ("contentInsetStart", "4dp"),
        ("contentInsetEnd", "4dp"),
        ("contentInsetStartWithNavigation", "4dp"),
    ]),
    # .header-menu-btn / .header-back: 40px, rgba(255,255,255,.08)
    ("Widget.MailGram.IconCircleSoft", "", [
        ("android:layout_width", "40dp"), ("android:layout_height", "40dp"),
        ("android:background", "@drawable/bg_icon_circle_soft"),
        ("android:padding", "9dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_primary"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    # .header-btn: 38px, rgba(255,255,255,.05), иконка #aaa
    ("Widget.MailGram.HeaderBtn", "", [
        ("android:layout_width", "38dp"), ("android:layout_height", "38dp"),
        ("android:background", "@drawable/bg_icon_circle_faint"),
        ("android:padding", "9dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_dim"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    # .input-attach: 38px, без фона, иконка #aaa
    ("Widget.MailGram.AttachButton", "", [
        ("android:layout_width", "38dp"), ("android:layout_height", "38dp"),
        ("android:background", "@drawable/bg_header_icon"),
        ("android:padding", "8dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_dim"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    # .send-btn / .media-rec-btn: белый круг 38px, чёрная иконка
    ("Widget.MailGram.SendButton", "", [
        ("android:layout_width", "38dp"), ("android:layout_height", "38dp"),
        ("android:background", "@drawable/bg_send"),
        ("android:padding", "10dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_on_light"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.GlassIcon", "", [
        ("android:layout_width", "40dp"), ("android:layout_height", "40dp"),
        ("android:background", "@drawable/bg_header_icon"),
        ("android:padding", "9dp"), ("android:scaleType", "centerInside"),
        ("android:tint", "@color/text_primary"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    # .search-input-wrap: #1c1c1e, radius 12px, border #2a2a2c
    ("Widget.MailGram.SearchPill", "@android:style/Widget.EditText", [
        ("android:background", "@drawable/bg_search_pill"),
        ("android:textColor", "@color/text_primary"),
        ("android:textColorHint", "@color/text_muted"),
        ("android:textSize", "14sp"),
        ("android:paddingStart", "12dp"), ("android:paddingEnd", "12dp"),
        ("android:minHeight", "40dp"),
        ("android:gravity", "center_vertical"),
    ]),
    # .message-input: #1c1c1e, radius 20px
    ("Widget.MailGram.Input", "@android:style/Widget.EditText", [
        ("android:background", "@drawable/bg_input"),
        ("android:textColor", "@color/text_primary"),
        ("android:textColorHint", "@color/text_muted"),
        ("android:textSize", "14sp"),
        ("android:paddingStart", "14dp"), ("android:paddingEnd", "14dp"),
        ("android:paddingTop", "10dp"), ("android:paddingBottom", "10dp"),
        ("android:maxHeight", "100dp"),
        ("android:gravity", "center_vertical"),
    ]),
    # .folder-tab / .folder-tab.active
    ("Widget.MailGram.FolderTab", "TextAppearance.MailGram.FolderTab", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "32dp"),
        ("android:gravity", "center"),
        ("android:minWidth", "56dp"),
        ("android:paddingStart", "14dp"), ("android:paddingEnd", "14dp"),
        ("android:singleLine", "true"),
        ("android:background", "@drawable/bg_glass_pill"),
        ("android:textColor", "@color/text_icon"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.FolderTabActive", "Widget.MailGram.FolderTab", [
        ("android:background", "@drawable/bg_pill_accent"),
        ("android:textColor", "@color/text_primary"),
    ]),
    # .action-sheet-item: #2c2c2e, radius 12px, padding 14/16
    ("Widget.MailGram.ActionItem", "TextAppearance.MailGram.ActionItem", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:minHeight", "50dp"),
        ("android:gravity", "center_vertical"),
        ("android:orientation", "horizontal"),
        ("android:paddingStart", "16dp"), ("android:paddingEnd", "16dp"),
        ("android:background", "@drawable/bg_action_item"),
        ("android:foreground", "@drawable/bg_row_ripple_round"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    # .drawer-item: radius 12px, padding 12/14, текст #ddd
    ("Widget.MailGram.DrawerItem", "TextAppearance.MailGram.DrawerItem", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:minHeight", "48dp"),
        ("android:gravity", "center_vertical"),
        ("android:orientation", "horizontal"),
        ("android:paddingStart", "14dp"), ("android:paddingEnd", "14dp"),
        ("android:background", "@drawable/bg_row_ripple_round"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.Sheet", "", [
        ("android:background", "@drawable/bg_sheet"),
    ]),
    # .modal-content / .encrypt-modal-content: #161616, radius 20px, border #282828
    ("Widget.MailGram.ModalCard", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:orientation", "vertical"),
        ("android:background", "@drawable/bg_modal"),
        ("android:padding", "20dp"),
    ]),
    # .tg-channel-card: #141416, radius 16px, border #1c1c1c
    ("Widget.MailGram.Card", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:orientation", "vertical"),
        ("android:background", "@drawable/bg_card"),
        ("android:padding", "14dp"),
    ]),
    ("Widget.MailGram.CardFlat", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:orientation", "vertical"),
        ("android:background", "@drawable/bg_card_flat"),
        ("android:padding", "14dp"),
    ]),
    ("Widget.MailGram.Row", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:minHeight", "52dp"),
        ("android:gravity", "center_vertical"),
        ("android:orientation", "horizontal"),
        ("android:paddingStart", "16dp"), ("android:paddingEnd", "16dp"),
        ("android:background", "@drawable/bg_row_ripple"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.CardRow", "Widget.MailGram.Row", [
        ("android:background", "@android:color/transparent"),
        ("android:foreground", "@drawable/bg_row_ripple_round"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.Separator", "", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "1dp"),
        ("android:background", "@drawable/bg_separator"),
    ]),
    ("Widget.MailGram.KeyBox", "TextAppearance.MailGram.Caption", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:background", "@drawable/bg_key_box"),
        ("android:fontFamily", "monospace"),
        ("android:padding", "10dp"),
        ("android:textColor", "@color/key_text"),
        ("android:textSize", "11sp"),
        ("android:textIsSelectable", "true"),
    ]),
    ("Widget.MailGram.InfoBox", "TextAppearance.MailGram.ModalText", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:background", "@drawable/bg_info_box"),
        ("android:padding", "10dp"),
        ("android:textColor", "@color/brand"),
        ("android:textSize", "12sp"),
    ]),
    ("Widget.MailGram.WarnBox", "TextAppearance.MailGram.ModalText", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:background", "@drawable/bg_warn_box"),
        ("android:padding", "10dp"),
        ("android:textColor", "@color/danger"),
        ("android:textSize", "12sp"),
    ]),
    # Кнопки: .btn = белая, .btn-secondary = контур, .btn-danger = красная
    ("Widget.MailGram.Button.Primary", "Widget.Material3.Button", [
        ("android:layout_height", "52dp"),
        ("android:backgroundTint", "#FFFFFFFF"),
        ("android:textColor", "@color/text_on_light"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "16sp"), ("android:textStyle", "bold"),
        ("cornerRadius", "14dp"),
        ("rippleColor", "@color/ripple_strong"),
    ]),
    ("Widget.MailGram.Button.Secondary", "Widget.Material3.Button.OutlinedButton", [
        ("android:layout_height", "50dp"),
        ("android:textColor", "@color/text_primary"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "15sp"),
        ("strokeColor", "#FF333333"),
        ("strokeWidth", "1dp"),
        ("cornerRadius", "14dp"),
        ("rippleColor", "@color/ripple"),
    ]),
    ("Widget.MailGram.Button.Danger", "Widget.Material3.Button", [
        ("android:layout_height", "50dp"),
        ("android:backgroundTint", "@color/danger"),
        ("android:textColor", "@color/text_on_accent"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "15sp"), ("android:textStyle", "bold"),
        ("cornerRadius", "14dp"),
        ("rippleColor", "@color/ripple_strong"),
    ]),
    ("Widget.MailGram.Button.Text", "Widget.Material3.Button.TextButton", [
        ("android:layout_height", "48dp"),
        ("android:textColor", "@color/brand"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "15sp"),
        ("rippleColor", "@color/ripple"),
    ]),
    ("Widget.MailGram.Button.Accent", "Widget.Material3.Button", [
        ("android:layout_height", "52dp"),
        ("android:backgroundTint", "@color/brand"),
        ("android:textColor", "@color/text_on_accent"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "16sp"), ("android:textStyle", "bold"),
        ("cornerRadius", "14dp"),
        ("rippleColor", "@color/ripple_strong"),
    ]),
    ("Widget.MailGram.Switch", "Widget.Material3.CompoundButton.MaterialSwitch", [
        ("android:minHeight", "44dp"),
        ("thumbTint", "@color/switch_thumb"),
        ("trackTint", "@color/switch_track"),
        ("trackDecorationTint", "@android:color/transparent"),
    ]),
    ("Widget.MailGram.RadioButton", "Widget.Material3.CompoundButton.RadioButton", [
        ("android:textAppearance", "@style/TextAppearance.MailGram.ActionItem"),
        ("android:textColor", "@color/text_primary"),
        ("android:buttonTint", "@color/brand"),
        ("buttonTint", "@color/brand"),
        ("android:minHeight", "48dp"),
    ]),
    ("Widget.MailGram.Progress", "Widget.Material3.LinearProgressIndicator", [
        ("android:layout_height", "3dp"),
        ("indicatorColor", "@color/brand"),
        ("trackColor", "@color/row_divider"),
        ("trackThickness", "3dp"),
    ]),
    ("Widget.MailGram.Badge", "", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "20dp"),
        ("android:minWidth", "20dp"),
        ("android:background", "@drawable/bg_badge"),
        ("android:gravity", "center"),
        ("android:paddingStart", "6dp"), ("android:paddingEnd", "6dp"),
        ("android:textColor", "@color/text_primary"),
        ("android:textSize", "11sp"), ("android:textStyle", "bold"),
    ]),
    ("Widget.MailGram.NavItem", "", [
        ("android:layout_width", "0dp"),
        ("android:layout_height", "match_parent"),
        ("android:layout_weight", "1"),
        ("android:orientation", "vertical"),
        ("android:gravity", "center"),
        ("android:background", "@drawable/bg_row_ripple"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.NavLabel", "TextAppearance.MailGram.Caption", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "wrap_content"),
        ("android:layout_marginTop", "3dp"),
        ("android:textSize", "10sp"),
        ("android:textColor", "@color/text_icon"),
    ]),
    ("Widget.MailGram.AttachLabel", "TextAppearance.MailGram.Caption", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "wrap_content"),
        ("android:layout_marginTop", "8dp"),
        ("android:textColor", "@color/text_primary"),
        ("android:textSize", "12sp"),
        ("android:gravity", "center"),
    ]),
    ("Widget.MailGram.Pill", "TextAppearance.MailGram.FolderTab", [
        ("android:layout_width", "wrap_content"),
        ("android:layout_height", "32dp"),
        ("android:gravity", "center"),
        ("android:minWidth", "56dp"),
        ("android:paddingStart", "14dp"), ("android:paddingEnd", "14dp"),
        ("android:background", "@drawable/bg_glass_pill"),
        ("android:textColor", "@color/text_icon"),
        ("android:clickable", "true"), ("android:focusable", "true"),
    ]),
    ("Widget.MailGram.PillActive", "Widget.MailGram.Pill", [
        ("android:background", "@drawable/bg_pill_accent"),
        ("android:textColor", "@color/text_primary"),
    ]),
]


# ---------------------------------------------- стили, на которые ссылаются экраны
# Значения — тоже из дизайна (шрифты 11–20px, поверхности #1c1c1e / #2c2c2e).
LEGACY_TEXT = [
    ("ChatTitle", "17sp", "bold", "@color/text_primary"),
    ("ChatSubtitle", "12sp", "normal", "@color/text_secondary"),
    ("Title", "20sp", "bold", "@color/text_primary"),
    ("Hero", "28sp", "bold", "@color/text_primary"),
    ("Body", "14sp", "normal", "@color/text_drawer"),
    ("BodySmall", "13sp", "normal", "@color/text_secondary"),
    ("RowTitle", "16sp", "normal", "@color/text_primary"),
    ("RowValue", "14sp", "normal", "@color/text_secondary"),
]

LEGACY_WIDGETS = [
    ("Widget.MailGram.Button.Ghost", "Widget.Material3.Button.TextButton", [
        ("android:layout_height", "48dp"),
        ("android:textColor", "@color/brand"),
        ("android:textAllCaps", "false"),
        ("android:textSize", "14sp"),
        ("rippleColor", "@color/ripple"),
    ]),
    ("Widget.MailGram.SectionTitle", "TextAppearance.MailGram.Section", [
        ("android:layout_width", "match_parent"),
        ("android:layout_height", "wrap_content"),
        ("android:paddingStart", "14dp"),
        ("android:paddingEnd", "14dp"),
        ("android:paddingTop", "6dp"),
        ("android:paddingBottom", "6dp"),
    ]),
    ("Widget.MailGram.RowTitle", "TextAppearance.MailGram.RowTitle", [
        ("android:textColor", "@color/text_primary"),
    ]),
    ("Widget.MailGram.RowValue", "TextAppearance.MailGram.RowValue", [
        ("android:textColor", "@color/text_secondary"),
    ]),
    ("Widget.MailGram.AttachAction", "Widget.MailGram.ActionItem", []),
    ("Widget.MailGram.AttachIcon", "Widget.MailGram.IconCircleSoft", []),
]


DIALOG_ITEMS = [    ("colorPrimary", "@color/brand"),
    ("colorSurface", "@color/modal_surface"),
    ("colorOnSurface", "@color/text_primary"),
    ("colorOnSurfaceVariant", "@color/text_dim"),
    ("colorSurfaceContainerHigh", "@color/modal_surface"),
    ("colorOutline", "@color/modal_border"),
    ("colorError", "@color/danger"),
    ("android:textColorPrimary", "@color/text_primary"),
    ("android:textColorSecondary", "@color/text_dim"),
    ("android:colorBackgroundFloating", "@color/modal_surface"),
    ("android:windowBackground", "@android:color/transparent"),
    ("backgroundTint", "@color/modal_surface"),
    ("shapeAppearanceCornerExtraLarge", "@style/ShapeAppearance.MailGram.Dialog"),
    ("shapeAppearanceCornerLarge", "@style/ShapeAppearance.MailGram.Dialog"),
    ("buttonBarPositiveButtonStyle", "@style/Widget.MailGram.Button.Text"),
    ("buttonBarNegativeButtonStyle", "@style/Widget.MailGram.Button.Text"),
    ("android:windowAnimationStyle", "@style/Animation.MailGram.Dialog"),
]


def render():
    lines = [HEAD, "<!--\n  Тема MailGram. Собирается скриптом tools/make_themes.py.\n"
             "  Размеры и цвета — из дизайна старого мессенджера: шапка 56dp, поверхность\n"
             "  #1c1c1e, вторая #2c2c2e, акцент #0a84ff, зелёный #34c759, красный #ff3b30.\n-->\n",
             "<resources>\n"]
    lines.append('    <style name="Theme.MailGram" parent="Theme.Material3.Dark.NoActionBar">\n')
    for name, value in THEME_ITEMS:
        lines.append('        <item name="%s">%s</item>\n' % (name, value))
    lines.append("    </style>\n\n")

    for name, parent, size, style, color, spacing in TEXT_STYLES:
        lines.append('    <style name="TextAppearance.MailGram.%s" parent="%s">\n' % (name, parent))
        lines.append('        <item name="android:textSize">%s</item>\n' % size)
        if style != "normal":
            lines.append('        <item name="android:textStyle">%s</item>\n' % style)
        lines.append('        <item name="android:textColor">%s</item>\n' % color)
        if spacing != "0":
            lines.append('        <item name="android:letterSpacing">%s</item>\n' % spacing)
        lines.append("    </style>\n\n")

    for name, parent, items in WIDGETS:
        parent_attr = ' parent="%s"' % parent
        lines.append('    <style name="%s"%s>\n' % (name, parent_attr))
        for attr, value in items:
            key = attr[4:] if attr.startswith('app:') else attr
            lines.append('        <item name="%s">%s</item>\n' % (key, value))
        lines.append("    </style>\n\n")

    for name, parent, items in [
        ("ShapeAppearance.MailGram.Dialog", "", [("cornerFamily", "rounded"), ("cornerSize", "20dp")]),
        ("ShapeAppearance.MailGram.Media", "", [("cornerFamily", "rounded"), ("cornerSize", "12dp")]),
        ("ShapeAppearance.MailGram.Circle", "", [("cornerFamily", "rounded"), ("cornerSize", "50%")]),
        ("ShapeAppearance.MailGram.Sheet", "", [("cornerFamily", "rounded"), ("cornerSizeTopLeft", "20dp"),
                                                ("cornerSizeTopRight", "20dp")]),
    ]:
        lines.append('    <style name="%s" parent="%s">\n' % (name, parent))
        for attr, value in items:
            lines.append('        <item name="%s">%s</item>\n' % (attr, value))
        lines.append("    </style>\n\n")


    for name, size, weight, color in LEGACY_TEXT:
        lines.append('    <style name="TextAppearance.MailGram.%s" parent="@android:style/TextAppearance">\n' % name)
        lines.append('        <item name="android:textSize">%s</item>\n' % size)
        if weight != "normal":
            lines.append('        <item name="android:textStyle">%s</item>\n' % weight)
        lines.append('        <item name="android:textColor">%s</item>\n' % color)
        lines.append("    </style>\n\n")

    for name, parent, items in LEGACY_WIDGETS:
        lines.append('    <style name="%s" parent="%s">\n' % (name, parent))
        for attr, value in items:
            lines.append('        <item name="%s">%s</item>\n' % (attr, value))
        lines.append("    </style>\n\n")

    lines.append('    <style name="Animation.MailGram" parent="@android:style/Animation.Activity">\n')
    lines.append('        <item name="android:activityOpenEnterAnimation">@anim/slide_in_right</item>\n')
    lines.append('        <item name="android:activityOpenExitAnimation">@anim/fade_out</item>\n')
    lines.append('        <item name="android:activityCloseEnterAnimation">@anim/fade_in</item>\n')
    lines.append('        <item name="android:activityCloseExitAnimation">@anim/slide_out_right</item>\n')
    lines.append("    </style>\n\n")
    lines.append('    <style name="Animation.MailGram.Dialog" parent="@android:style/Animation.Dialog">\n')
    lines.append('        <item name="android:windowEnterAnimation">@anim/slide_up</item>\n')
    lines.append('        <item name="android:windowExitAnimation">@anim/slide_down</item>\n')
    lines.append("    </style>\n\n")

    lines.append('    <style name="Animation.MailGram.Popup" parent="@android:style/Animation">\n')
    lines.append('        <item name="android:windowEnterAnimation">@anim/scale_in</item>\n')
    lines.append('        <item name="android:windowExitAnimation">@anim/scale_out</item>\n')
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Dialog" parent="ThemeOverlay.Material3.MaterialAlertDialog">\n')
    for attr, value in DIALOG_ITEMS:
        lines.append('        <item name="%s">%s</item>\n' % (attr, value))
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Transparent" parent="Theme.MailGram">\n')
    lines.append('        <item name="android:windowBackground">@android:color/transparent</item>\n')
    lines.append('        <item name="android:windowIsTranslucent">true</item>\n')
    lines.append("    </style>\n\n")
    lines.append('    <style name="Theme.MailGram.Fullscreen" parent="Theme.MailGram">\n')
    lines.append('        <item name="android:windowBackground">@color/bg</item>\n')
    lines.append('        <item name="android:windowLightStatusBar">false</item>\n')
    lines.append("    </style>\n")
    lines.append("</resources>\n")
    return "".join(lines)


def main():
    for path in (os.path.join(RES, "values", "themes.xml"),
                 os.path.join(RES, "values-night", "themes.xml")):
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(render())
    print("темы записаны: %d стилей текста, %d стилей виджетов"
          % (len(TEXT_STYLES), len(WIDGETS)))
    return 0


if __name__ == "__main__":
    sys.exit(main())
