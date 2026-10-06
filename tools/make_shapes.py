#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Фоны и фигуры, снятые дословно с дизайна старого мессенджера (CSS из server (13).py).

Пузыри: входящий #1c1c1e, исходящий #2c2c2e, радиус 18dp и «срезанный» угол 4dp.
Пилюли, панели, шторки, карточки, клавиши — всё с точными радиусами и цветами.
"""
import os
import sys

OUT = os.path.join("app", "src", "main", "res", "drawable")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'


def shape(name, radius, solid=None, stroke=None, stroke_w="1dp", corners=None,
          ripple=None, oval=False, layer=None):
    return name, radius, solid, stroke, stroke_w, corners, ripple, oval, layer


DRAWABLES = {

    # ---------------------------------------------------------------- пузыри сообщений
    "bg_bubble_in": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners
        android:topLeftRadius="18dp"
        android:topRightRadius="18dp"
        android:bottomLeftRadius="4dp"
        android:bottomRightRadius="18dp" />
    <solid android:color="@color/bubble_in" />
</shape>
""",
    "bg_bubble_out": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners
        android:topLeftRadius="18dp"
        android:topRightRadius="18dp"
        android:bottomLeftRadius="18dp"
        android:bottomRightRadius="4dp" />
    <solid android:color="@color/bubble_out" />
</shape>
""",
    # выбранное сообщение: rgba(10,132,255,.2) + рамка 1dp #0a84ff
    "bg_msg_selected": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners
        android:topLeftRadius="18dp"
        android:topRightRadius="18dp"
        android:bottomLeftRadius="4dp"
        android:bottomRightRadius="4dp" />
    <solid android:color="@color/selected_bubble" />
    <stroke android:width="1dp" android:color="@color/brand" />
</shape>
""",
    # цитата ответа: rgba(255,255,255,.08), полоска 3dp слева
    "bg_quote_glass": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="4dp" />
    <solid android:color="@color/quote_bg" />
</shape>
""",
    "bg_quote": """<drawable xmlns:android="http://schemas.android.com/apk/res/android">
    <shape android:shape="rectangle">
        <corners android:radius="4dp" />
        <solid android:color="@color/quote_bg" />
    </shape>
</drawable>
""",
    # карточка файла внутри пузыря: rgba(255,255,255,.05)
    "bg_file_card": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/soft_05" />
</shape>
""",
    "bg_media_frame": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface1" />
</shape>
""",
    "bg_media_badge": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/media_badge" />
</shape>
""",
    "bg_video_chip": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/media_badge" />
</shape>
""",
    "bg_voice_play": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/voice_play_bg" />
</shape>
""",
    "bg_circle_ring": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@android:color/transparent" />
    <stroke android:width="2dp" android:color="#26FFFFFF" />
</shape>
""",
    "bg_reaction_chip": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="11dp" />
    <solid android:color="@color/surface3" />
    <stroke android:width="1dp" android:color="@color/surface4" />
</shape>
""",

    # ---------------------------------------------------------------- панели и навигация
    # .header: 56px, #0d0d0d, border-bottom 1px #1c1c1c
    "bg_nav_bar": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/header_bg" />
        </shape>
    </item>
    <item android:gravity="bottom" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/bar_border" />
        </shape>
    </item>
</layer-list>
""",
    # .input-area-wrapper: #0d0d0d, border-top 1px #1a1a1a
    "bg_bottom_bar": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/header_bg" />
        </shape>
    </item>
    <item android:gravity="top" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/search_border" />
        </shape>
    </item>
</layer-list>
""",
    # .pinned-msg-bar / .reply-preview-bar: #141416, border-bottom 1px #222
    "bg_pinned_bar": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/surface1" />
        </shape>
    </item>
    <item android:gravity="bottom" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/key_border" />
        </shape>
    </item>
</layer-list>
""",
    "bg_banner": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface1" />
    <stroke android:width="1dp" android:color="@color/bar_border" />
</shape>
""",
    "bg_search_pill": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface2" />
    <stroke android:width="1dp" android:color="#FF2A2A2C" />
</shape>
""",
    # .message-input: #1c1c1e, radius 20px, border 1px #2a2a2c
    "bg_input": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="20dp" />
    <solid android:color="@color/surface2" />
    <stroke android:width="1dp" android:color="#FF2A2A2C" />
</shape>
""",
    "bg_record_bar": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="20dp" />
    <solid android:color="@color/surface2" />
</shape>
""",
    # .bottom-nav: #0d0d0d, border-top 1px #1a1a1a
    "bg_bottom_nav": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/header_bg" />
        </shape>
    </item>
    <item android:gravity="top" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/search_border" />
        </shape>
    </item>
</layer-list>
""",
    # .drawer: #141416, право #222
    "bg_drawer": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/surface1" />
        </shape>
    </item>
    <item android:gravity="end" android:width="1dp">
        <shape android:shape="rectangle">
            <solid android:color="@color/key_border" />
        </shape>
    </item>
</layer-list>
""",
    # .drawer-header: #1c1c1e, border-bottom 1px #28282a
    "bg_drawer_header": """<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/surface2" />
        </shape>
    </item>
    <item android:gravity="bottom" android:height="1dp">
        <shape android:shape="rectangle">
            <solid android:color="#FF28282A" />
        </shape>
    </item>
</layer-list>
""",

    # ---------------------------------------------------------------- шторки, меню, кнопки
    # .action-sheet-content: #1c1c1e, скругление сверху 20px
    "bg_sheet": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:topLeftRadius="20dp" android:topRightRadius="20dp" />
    <solid android:color="@color/surface2" />
</shape>
""",
    # .action-sheet-item: #2c2c2e, radius 12px
    "bg_action_item": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface3" />
</shape>
""",
    # .modal-content / .encrypt-modal-content: #161616, radius 20px, border #282828
    "bg_modal": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="20dp" />
    <solid android:color="@color/modal_surface" />
    <stroke android:width="1dp" android:color="@color/modal_border" />
</shape>
""",
    # .key-box: #0a0a0a, border #222, radius 10px
    "bg_key_box": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/key_surface" />
    <stroke android:width="1dp" android:color="@color/key_border" />
</shape>
""",
    # .delfan-box (синяя справка)
    "bg_info_box": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/accent_soft" />
    <stroke android:width="1dp" android:color="@color/accent_border" />
</shape>
""",
    # .warning-box (красная справка)
    "bg_warn_box": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/danger_soft" />
    <stroke android:width="1dp" android:color="@color/danger_border" />
</shape>
""",
    # .tg-channel-card / карточки настроек: #141416, radius 16px, border #1c1c1c
    "bg_card": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="@color/surface1" />
    <stroke android:width="1dp" android:color="@color/bar_border" />
</shape>
""",
    "bg_card_flat": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="@color/surface1" />
</shape>
""",
    # .folder-tab: #1c1c1e, radius 16px; active: #2c2c2e + border #3a3a3c
    "bg_glass_pill": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="@color/surface2" />
</shape>
""",
    "bg_pill_accent": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="16dp" />
    <solid android:color="@color/surface3" />
    <stroke android:width="1dp" android:color="@color/surface4" />
</shape>
""",
    "bg_pill": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface2" />
</shape>
""",
    # круглые подложки иконок в шапке: rgba(255,255,255,.08) / .05
    "bg_icon_circle_soft": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/soft_08" />
</shape>
""",
    "bg_icon_circle_faint": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/soft_05" />
</shape>
""",
    "bg_icon_circle": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/soft_08" />
</shape>
""",
    "bg_avatar_ring": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@android:color/transparent" />
    <stroke android:width="2dp" android:color="@color/soft_10" />
</shape>
""",
    # .send-btn / .media-rec-btn: белый круг 38px
    "bg_send": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item>
        <shape android:shape="oval">
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",
    "bg_badge": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/brand" />
</shape>
""",
    "bg_badge_red": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/danger" />
</shape>
""",
    # .scroll-fab: #0a84ff, 44px
    "bg_scroll_fab": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/brand" />
</shape>
""",
    "bg_play_circle": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="#73000000" />
</shape>
""",
    "bg_attach_sheet_icon": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="12dp" />
    <solid android:color="@color/surface3" />
</shape>
""",
    "bg_keypad_key": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/soft_05" />
</shape>
""",
    "bg_lock_dot_on": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/brand" />
</shape>
""",
    "bg_lock_dot_off": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@android:color/transparent" />
    <stroke android:width="2dp" android:color="@color/surface4" />
</shape>
""",
    "bg_swipe_pin": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/accent_soft" />
</shape>
""",
    "bg_swipe_mute": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/surface1" />
</shape>
""",
    "bg_bio_icon": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface3" />
</shape>
""",

    # ---------------------------------------------------------------- интерактив и мелочи
    # .dialog:active{background:#111}
    "bg_row_ripple": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#FF111111">
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
            <corners android:radius="12dp" />
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
    "bg_header_icon": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",
    "bg_icon_ripple_round": """<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <corners android:radius="16dp" />
            <solid android:color="#FFFFFFFF" />
        </shape>
    </item>
</ripple>
""",
    "bg_separator": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/row_divider" />
</shape>
""",
    "bg_hairline": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bar_border" />
</shape>
""",
    "bg_date_line": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/surface3" />
</shape>
""",
    "bg_unread_line": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/danger" />
</shape>
""",
    "bg_day_chip": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bg" />
</shape>
""",
    "bg_day_separator": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/surface3" />
</shape>
""",
    "bg_wallpaper_black": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bg" />
</shape>
""",
    "bg_wallpaper_indigo": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bg" />
</shape>
""",
    "bg_chat_wallpaper": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bg" />
</shape>
""",
    "bg": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/bg" />
</shape>
""",
    "bg_attach_circle": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface3" />
</shape>
""",
    "bg_radio_dot": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface3" />
    <stroke android:width="2dp" android:color="@color/brand" />
</shape>
""",
    "bg_radio_dot_off": """<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@android:color/transparent" />
    <stroke android:width="2dp" android:color="@color/surface4" />
</shape>
""",
}


def main():
    os.makedirs(OUT, exist_ok=True)
    for name, body in DRAWABLES.items():
        with open(os.path.join(OUT, name + ".xml"), "w", encoding="utf-8") as fh:
            fh.write(HEAD + body)
    print("фигуры записаны: %d" % len(DRAWABLES))
    return 0


if __name__ == "__main__":
    sys.exit(main())
