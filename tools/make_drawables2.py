#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Вторая часть генератора drawable: навигационный слой (стекло), ряды, кнопки, разделители.

Все цвета берутся из @color/... (никаких ?attr) — поэтому иконки и фоны одинаково
корректно выглядят и в светлой, и в чёрной теме, и никогда не ломают инфляцию.
"""
import os
import sys

OUT = os.path.join("app", "src", "main", "res", "drawable")

HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'

DRAWABLES = {

    # ------------------------------------------------------------------ навигационный слой
    # Стеклянная шапка с тонкой линией снизу, как navigation bar в iOS 26.
    "bg_nav_bar": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/nav_bar" />
        </shape>
    </item>
    <item android:gravity="bottom" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/hairline" />
        </shape>
    </item>
</layer-list>
""",

    # Нижняя стеклянная панель (поле ввода, панель выбора) — линия сверху.
    "bg_bottom_bar": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/nav_bar" />
        </shape>
    </item>
    <item android:gravity="top" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/hairline" />
        </shape>
    </item>
</layer-list>
""",

    # Разделитель рядов (как в списках iOS) — отступ задаётся в разметке.
    "bg_separator": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/hairline" />
</shape>
""",

    # ------------------------------------------------------------------ интерактив
    "bg_row_ripple": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple">
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",

    "bg_row_ripple_round": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple">
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <corners android:radius="14dp" />
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",

    "bg_icon_ripple": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",

    # Круглая подложка иконки в шапке (стекло).
    "bg_icon_circle": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="oval">
            <solid android:color="@color/surface_alt" />
        </shape>
    </item>
</layer-list>
""",

    # Круглая иконка на стеклянной шапке: только нажатие, без подложки.
    "bg_header_icon": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",

    # Кнопка «отправить»: круг с градиентом акцента.
    "bg_send": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item>
        <shape android:shape="oval">
            <gradient
                android:type="linear"
                android:angle="270"
                android:startColor="@color/bubble_out_top"
                android:endColor="@color/bubble_out_bottom" />
        </shape>
    </item>
</ripple>
""",

    # Кружок проигрывания видео/кружка поверх кадра.
    "bg_play_circle": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="#66000000" />
    <stroke android:width="1dp" android:color="#33FFFFFF" />
</shape>
""",

    # Кнопка проигрывания голосового внутри пузыря.
    "bg_voice_play": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/voice_play_bg" />
</shape>
""",

    # ------------------------------------------------------------------ поверхности
    "bg_sheet": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:topLeftRadius="22dp" android:topRightRadius="22dp" />
    <solid android:color="@color/surface" />
</shape>
""",

    "bg_card_pressed": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="@color/surface_pressed" />
</shape>
""",

    "bg_avatar_ring": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="#00000000" />
    <stroke android:width="1.5dp" android:color="@color/glass_border" />
</shape>
""",

    # ------------------------------------------------------------------ прочее
    "bg_unread_line": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="2dp" />
    <solid android:color="@color/brand" />
</shape>
""",

    "bg_attach_sheet_icon": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface_alt" />
    <stroke android:width="1dp" android:color="@color/glass_border" />
</shape>
""",

    # Округлое нажатие для иконок внутри поля ввода.
    "bg_icon_ripple_round": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <corners android:radius="19dp" />
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",

    # Плашка длительности видео/кружка.
    "bg_video_chip": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="8dp" />
    <solid android:color="#99000000" />
</shape>
""",

    # Шеврон строки настроек (как в списках iOS).
    "ic_chevron_right": """<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp" android:height="24dp"
    android:viewportWidth="24" android:viewportHeight="24"
    android:tint="@color/text_tertiary">
    <path android:fillColor="#FFFFFFFF"
        android:pathData="M9.3,5.3 L15.9,12 L9.3,18.7 L10.7,20 L18.7,12 L10.7,4 Z" />
</vector>
""",

    # Иконка «проиграть» внутри кружка: белый треугольник.
    "ic_play_white": """<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp" android:height="24dp"
    android:viewportWidth="24" android:viewportHeight="24">
    <path android:fillColor="#FFFFFFFF"
        android:pathData="M9.5,7.4 L17.4,12 L9.5,16.6 Z" />
</vector>
""",
}

# Дополнительные оттенки, которых не было в первой палитре: добавляем в оба цвета-файла.
EXTRA_COLORS_LIGHT = {
    "nav_bar": "#F2FFFFFF",
    "hairline": "#26000000",
    "ripple": "#14000000",
    "ripple_strong": "#1F000000",
    "voice_play_bg": "#E8E8ED",
    "google_btn": "#FFFFFFFF",
    "google_btn_text": "#FF1C1C1E",
}

EXTRA_COLORS_NIGHT = {
    "nav_bar": "#F21C1C1E",
    "hairline": "#1FFFFFFF",
    "ripple": "#1FFFFFFF",
    "ripple_strong": "#2EFFFFFF",
    "voice_play_bg": "#2C2C2E",
    "google_btn": "#FFFFFFFF",
    "google_btn_text": "#FF000000",
}

MARKER = "<!-- дополнительные оттенки навигационного слоя -->"


def write_drawables():
    os.makedirs(OUT, exist_ok=True)
    for name, body in DRAWABLES.items():
        with open(os.path.join(OUT, name + ".xml"), "w", encoding="utf-8") as fh:
            fh.write(HEAD + body)
    return len(DRAWABLES)


def patch_colors(path, extra, comment):
    with open(path, encoding="utf-8") as fh:
        text = fh.read()
    block = "    " + MARKER + "\n" + "".join(
        '    <color name="%s">%s</color>\n' % (k, v) for k, v in extra.items())
    if MARKER in text:
        start = text.index("    " + MARKER)
        end = text.index("</resources>", start)
        text = text[:start] + block + text[end:]
    else:
        text = text.replace("</resources>", block + "</resources>")
    with open(path, "w", encoding="utf-8") as fh:
        fh.write(text)


def main():
    count = write_drawables()
    patch_colors(os.path.join("app", "src", "main", "res", "values", "colors.xml"),
                 EXTRA_COLORS_LIGHT, "светлая")
    patch_colors(os.path.join("app", "src", "main", "res", "values-night", "colors.xml"),
                 EXTRA_COLORS_NIGHT, "тёмная")
    print("записано drawable: %d" % count)
    print("палитра дополнена: nav_bar, hairline, ripple, ripple_strong, voice_play_bg")
    return 0


if __name__ == "__main__":
    sys.exit(main())
