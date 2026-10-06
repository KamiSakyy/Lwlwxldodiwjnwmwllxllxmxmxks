#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Палитра MailGram, снятая дословно с дизайна старого мессенджера (CSS из server (13).py).

Значения — точные hex из таблицы стилей: фон #000, шапка #0d0d0d, поверхности
#141416 / #1c1c1e / #2c2c2e, акцент #0a84ff, зелёный #34c759, красный #ff3b30,
оранжевый #ff9500. Оба набора (день/ночь) одинаковы: дизайн тёмный по определению.
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'

COLORS = {
    # --- базовые поверхности -------------------------------------------------------------
    "bg": "#FF000000",
    "header_bg": "#FF0D0D0D",
    "bar_border": "#FF1C1C1C",
    "search_border": "#FF1A1A1A",
    "row_divider": "#FF111111",
    "surface1": "#FF141416",
    "surface2": "#FF1C1C1E",
    "surface3": "#FF2C2C2E",
    "surface4": "#FF3A3A3C",
    "modal_surface": "#FF161616",
    "modal_border": "#FF282828",
    "input_surface": "#FF161616",
    "input_border": "#FF2C2C2C",
    "key_surface": "#FF0A0A0A",
    "key_border": "#FF222222",
    "bg_elevated": "#FF0D0D0D",
    "surface_pressed": "#FF2C2C2E",
    "surface_alt": "#FF2C2C2E",
    "text_tertiary": "#FF666666",

    # --- текст --------------------------------------------------------------------------
    "text_primary": "#FFFFFFFF",
    "text_secondary": "#FF888888",
    "text_muted": "#FF666666",
    "text_dim": "#FFAAAAAA",
    "text_drawer": "#FFDDDDDD",
    "text_icon": "#FF8E8E93",
    "text_on_accent": "#FFFFFFFF",
    "text_on_light": "#FF000000",
    "divider": "#FF1C1C1C",

    # --- акценты ------------------------------------------------------------------------
    "brand": "#FF0A84FF",
    "accent": "#FF0A84FF",
    "accent_soft": "#1A0A84FF",
    "accent_border": "#4D0A84FF",
    "success": "#FF34C759",
    "lock_green": "#FF34C759",
    "danger": "#FFFF3B30",
    "danger_soft": "#1AFF3B30",
    "danger_border": "#4DFF3B30",
    "warning": "#FFFF9500",
    "recording_red": "#FFFF3B30",
    "key_text": "#FF34C759",

    # --- пузыри сообщений ---------------------------------------------------------------
    "bubble_in": "#FF1C1C1E",
    "bubble_in_top": "#FF1C1C1E",
    "bubble_in_bottom": "#FF1C1C1E",
    "bubble_out": "#FF2C2C2E",
    "bubble_out_top": "#FF2C2C2E",
    "bubble_out_bottom": "#FF2C2C2E",
    "bubble_in_text": "#FFFFFFFF",
    "bubble_out_text": "#FFFFFFFF",
    "bubble_text_dark": "#FFFFFFFF",
    "bubble_time": "#FF888888",
    "quote_bg": "#14FFFFFF",
    "quote_strip": "#FF8E8E93",
    "selected_bubble": "#330A84FF",

    # --- полупрозрачные слои ------------------------------------------------------------
    "soft_08": "#14FFFFFF",
    "soft_10": "#1AFFFFFF",
    "soft_05": "#0DFFFFFF",
    "soft_15": "#26FFFFFF",
    "overlay": "#99000000",
    "overlay_strong": "#D9000000",
    "glass": "#F20D0D0D",
    "glass_strong": "#FF1C1C1E",
    "glass_border": "#1FFFFFFF",
    "ripple": "#1FFFFFFF",
    "ripple_strong": "#26FFFFFF",
    "ripple_row": "#FF111111",
    "nav_bar": "#FF0D0D0D",
    "hairline": "#FF1C1C1C",
    "media_badge": "#73000000",
    "voice_play_bg": "#FFFFFFFF",
    "google_btn": "#FFFFFFFF",
    "google_btn_text": "#FF000000",

    # --- обои и служебное ---------------------------------------------------------------
    "wallpaper_core": "#FF000000",
    "wallpaper_glow": "#FF000000",
    "wallpaper_glow2": "#FF000000",
    "wallpaper_indigo": "#FF000000",
    "splash_bg": "#FF000000",
    "bg_light": "#FF000000",
    "bg_dark": "#FF000000",
    "surface_light": "#FF1C1C1E",
    "surface_dark": "#FF1C1C1E",
    "surface_grouped_light": "#FF141416",
    "surface_grouped_dark": "#FF141416",
    "text_primary_light": "#FFFFFFFF",
    "text_primary_dark": "#FFFFFFFF",
    "text_secondary_light": "#FF888888",
    "text_secondary_dark": "#FF888888",
    "divider_light": "#FF1C1C1C",
    "divider_dark": "#FF1C1C1C",
    "bubble_out_light": "#FF2C2C2E",
    "bubble_out_dark": "#FF2C2C2E",
    "bubble_out_dark_alt": "#FF2C2C2E",
    "bubble_out_text_light": "#FFFFFFFF",
    "bubble_out_text_dark": "#FFFFFFFF",
    "bubble_in_light": "#FF1C1C1E",
    "bubble_in_dark": "#FF1C1C1E",
    "bubble_in_text_light": "#FFFFFFFF",
    "bubble_in_text_dark": "#FFFFFFFF",
    "bubble_out_top_light": "#FF2C2C2E",
    "bubble_out_top_dark": "#FF2C2C2E",
    "bubble_out_bottom_light": "#FF2C2C2E",
    "bubble_out_bottom_dark": "#FF2C2C2E",
    "bubble_in_top_light": "#FF1C1C1E",
    "bubble_in_top_dark": "#FF1C1C1E",
    "bubble_in_bottom_light": "#FF1C1C1E",
    "bubble_in_bottom_dark": "#FF1C1C1E",
    "reaction_bg_light": "#FF2C2C2E",
    "reaction_bg_dark": "#FF2C2C2E",
    "glass_light": "#F20D0D0D",
    "glass_dark": "#F20D0D0D",
    "glass_dark_strong": "#FF2C2C2E",
    "glass_border_light": "#1FFFFFFF",
    "glass_border_dark": "#1FFFFFFF",
    "glass_highlight": "#26FFFFFF",
    "wallpaper_core_light": "#FF000000",
    "wallpaper_core_dark": "#FF000000",
    "wallpaper_glow_light": "#FF000000",
    "wallpaper_glow_dark": "#FF000000",
    "wallpaper_glow2_light": "#FF000000",
    "wallpaper_glow2_dark": "#FF000000",
    "wallpaper_indigo_light": "#FF000000",
    "wallpaper_indigo_dark": "#FF000000",
    "brand_pressed": "#FF0068D6",
    "brand_soft": "#1A0A84FF",
    "accent_dark": "#FF0A84FF",
    "accent_light": "#FF0A84FF",
    "accent_pressed": "#FF0068D6",
    "google_red": "#FFFF3B30",
    "google_blue": "#FF0A84FF",
    "google_green": "#FF34C759",
    "google_yellow": "#FFFF9500",
    "nav_bar_light": "#FF0D0D0D",
    "hairline_light": "#FF1C1C1C",
    "google_blue_soft": "#1A0A84FF",

    # --- аватары (из палитры старого мессенджера) ---------------------------------------
    "avatar_1": "#FF0A84FF",
    "avatar_2": "#FF34C759",
    "avatar_3": "#FFFF9500",
    "avatar_4": "#FFFF3B30",
    "avatar_5": "#FFAF52DE",
    "avatar_6": "#FF5856D6",
    "avatar_7": "#FF32ADE6",

    # --- совместимость с прежними ресурсами (те же цвета дизайна) ------------------------
    "surface": "#FF1C1C1E",
    "bubble_meta_in": "#FF8E8E93",
    "bubble_meta_out": "#B3FFFFFF",
    "switch_thumb": "#FFFFFFFF",
    "switch_track": "#FF34C759",
    "border_strong": "#FF3A3A3C",
    "brand_dark": "#FF0A6FDB",
    "soft_15": "#26FFFFFF",
    "search_bar_border": "#FF1A1A1A",
    "circle_backdrop": "#E0000000",
    "call_soft": "#1A34C759",
}


def write(path, comment):
    lines = [HEAD, "<!--\n  %s\n  Значения сняты дословно со старого дизайна (CSS): не менять без причины.\n-->\n" % comment,
             "<resources>\n"]
    for name in sorted(COLORS):
        lines.append('    <color name="%s">%s</color>\n' % (name, COLORS[name]))
    lines.append("</resources>\n")
    with open(path, "w", encoding="utf-8") as fh:
        fh.write("".join(lines))


def main():
    write(os.path.join(RES, "values", "colors.xml"),
          "Палитра MailGram (основной режим) — тёмный дизайн, как в старом мессенджере.")
    write(os.path.join(RES, "values-night", "colors.xml"),
          "Палитра MailGram (ночной режим) — идентична основному: дизайн всегда чёрный.")
    print("палитра записана: %d цветов в каждый набор" % len(COLORS))
    return 0


if __name__ == "__main__":
    sys.exit(main())
