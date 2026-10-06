#!/usr/bin/env python3
"""Генератор drawable-ресурсов MailGram: только конкретные @color, никаких ?attr."""
import os

D = 'app/src/main/res/drawable'

SOLID = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="@color/{color}" />
</shape>
'''

CORNERS = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="{r}dp" />
    <solid android:color="@color/{color}" />
</shape>
'''

CORNERS_STROKE = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners android:radius="{r}dp" />
    <solid android:color="@color/{color}" />
    <stroke android:width="1dp" android:color="@color/{stroke}" />
</shape>
'''

OVAL = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/{color}" />
</shape>
'''

OVAL_STROKE = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/{color}" />
    <stroke android:width="1dp" android:color="@color/{stroke}" />
</shape>
'''

BUBBLE = '''<?xml version="1.0" encoding="utf-8"?>
<!-- Пузырь {who}: почти круглый, с «хвостиком» в нижнем углу со стороны отправителя -->
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <corners
        android:topLeftRadius="18dp"
        android:topRightRadius="18dp"
        android:bottomLeftRadius="{bl}dp"
        android:bottomRightRadius="{br}dp" />
    <gradient
        android:angle="270"
        android:startColor="@color/{top}"
        android:endColor="@color/{bottom}" />
</shape>
'''

APPLY_UP = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface_alt" />
    <stroke android:width="2dp" android:color="@color/brand" />
</shape>
'''

APPLY_OFF = '''<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="@color/surface_alt" />
    <stroke android:width="1dp" android:color="@color/divider" />
</shape>
'''

files = {
    'bg.xml': SOLID.format(color='bg'),
    'bg_bubble_out.xml': BUBBLE.format(who='исходящий', bl='18', br='6',
                                       top='bubble_out_top', bottom='bubble_out_bottom'),
    'bg_bubble_in.xml': BUBBLE.format(who='входящий', bl='6', br='18',
                                      top='bubble_in_top', bottom='bubble_in_bottom'),
    'bg_card.xml': CORNERS_STROKE.format(r='16', color='surface', stroke='divider'),
    'bg_glass_panel.xml': CORNERS_STROKE.format(r='20', color='surface', stroke='divider'),
    'bg_glass_pill.xml': CORNERS_STROKE.format(r='17', color='surface_alt', stroke='divider'),
    'bg_pill.xml': CORNERS.format(r='14', color='surface_alt'),
    'bg_pill_accent.xml': CORNERS.format(r='17', color='brand'),
    'bg_day_chip.xml': CORNERS.format(r='11', color='surface_alt'),
    'bg_day_separator.xml': CORNERS.format(r='2', color='divider'),
    'bg_reaction_chip.xml': CORNERS_STROKE.format(r='11', color='surface_alt', stroke='divider'),
    'bg_quote.xml': CORNERS.format(r='10', color='surface_alt'),
    'bg_quote_glass.xml': CORNERS.format(r='10', color='surface_alt'),
    'bg_input.xml': CORNERS.format(r='22', color='surface_alt'),
    'bg_toolbar_glass.xml': SOLID.format(color='bg'),
    'bg_banner.xml': CORNERS.format(r='14', color='surface_alt'),
    'bg_attach_circle.xml': OVAL.format(color='surface_alt'),
    'bg_badge.xml': OVAL.format(color='brand'),
    'bg_keypad_key.xml': OVAL_STROKE.format(color='surface', stroke='divider'),
    'bg_lock_dot_on.xml': OVAL.format(color='brand'),
    'bg_lock_dot_off.xml': OVAL_STROKE.format(color='surface_alt', stroke='divider'),
    'bg_swipe_pin.xml': CORNERS_STROKE.format(r='14', color='brand_soft', stroke='brand'),
    'bg_swipe_mute.xml': CORNERS_STROKE.format(r='14', color='surface_alt', stroke='divider'),
    'bg_chat_wallpaper.xml': '''<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/wallpaper_core" />
        </shape>
    </item>
    <item>
        <shape android:shape="rectangle">
            <gradient
                android:type="radial"
                android:centerX="0.15"
                android:centerY="0.05"
                android:gradientRadius="75%p"
                android:startColor="@color/wallpaper_glow"
                android:endColor="#00000000" />
        </shape>
    </item>
    <item>
        <shape android:shape="rectangle">
            <gradient
                android:type="radial"
                android:centerX="0.9"
                android:centerY="1.0"
                android:gradientRadius="65%p"
                android:startColor="@color/wallpaper_glow2"
                android:endColor="#00000000" />
        </shape>
    </item>
</layer-list>
''',
    'bg_wallpaper_black.xml': SOLID.format(color='wallpaper_core'),
    'bg_wallpaper_indigo.xml': '''<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape android:shape="rectangle">
            <solid android:color="@color/wallpaper_core" />
        </shape>
    </item>
    <item>
        <shape android:shape="rectangle">
            <gradient
                android:type="radial"
                android:centerX="0.5"
                android:centerY="1.05"
                android:gradientRadius="95%p"
                android:startColor="@color/wallpaper_indigo"
                android:endColor="#00000000" />
        </shape>
    </item>
    <item>
        <shape android:shape="rectangle">
            <gradient
                android:type="radial"
                android:centerX="0.9"
                android:centerY="0.05"
                android:gradientRadius="55%p"
                android:startColor="@color/wallpaper_glow"
                android:endColor="#00000000" />
        </shape>
    </item>
</layer-list>
''',
    'bg_radio_dot.xml': APPLY_UP,
    'bg_radio_dot_off.xml': APPLY_OFF,
}

os.makedirs(D, exist_ok=True)
for name, body in files.items():
    with open(os.path.join(D, name), 'w', encoding='utf-8') as f:
        f.write(body)
print('записано drawable:', len(files))
