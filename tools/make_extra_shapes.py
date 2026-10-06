#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Дополнительные фигуры MailGram — точные значения из CSS старого мессенджера:

  .dialog-online-dot  : 14px, #34c759, border 2.5px #000
  .msg-reply-quote    : left 3px #8e8e93, radius 4px, rgba(255,255,255,.08)
  .offline-banner     : #ff9500, чёрный текст 12px/600
  .circle-preview-box : круг 260px, рамка 4px #fff
  .circle-btn-sec     : 52px, #2c2c2e, рамка #3a3a3c
  .circle-btn-stop    : 52px, #ff3b30
  .circle-btn-cancel  : 52px, #3a3a3c
  .profile-view-avatar: 100px, рамка 4px #000
  .folder-tab         : пилюля radius 16px
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'
NS = 'xmlns:android="http://schemas.android.com/apk/res/android"'

FILES = {}

FILES["drawable/ic_menu.xml"] = """<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp" android:height="24dp"
    android:viewportWidth="24" android:viewportHeight="24"
    android:tint="@color/text_primary">
    <path android:fillColor="#FFFFFFFF" android:pathData="M3,6h18v2.2H3zM3,10.9h18v2.2H3zM3,15.8h18V18H3z" />
</vector>
"""

FILES["drawable/bg_quote_strip.xml"] = """<shape {ns} android:shape="rectangle">
    <corners android:radius="2dp" />
    <solid android:color="@color/text_icon" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_online_dot.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/success" />
    <stroke android:width="2.5dp" android:color="@color/bg" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_online_dot_off.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/text_icon" />
    <stroke android:width="2.5dp" android:color="@color/bg" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_offline_banner.xml"] = """<shape {ns} android:shape="rectangle">
    <solid android:color="@color/warning" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_circle_preview.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/bg" />
    <stroke android:width="4dp" android:color="@color/text_primary" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_circle_btn_sec.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/surface3" />
    <stroke android:width="1dp" android:color="@color/border_strong" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_circle_btn_white.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/text_primary" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_circle_btn_stop.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/danger" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_circle_btn_cancel.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/border_strong" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_profile_cover.xml"] = """<shape {ns} android:shape="rectangle">
    <solid android:color="@color/surface2" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_profile_avatar.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/surface1" />
    <stroke android:width="4dp" android:color="@color/bg" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_avatar_ring.xml"] = """<shape {ns} android:shape="oval">
    <solid android:color="@color/surface1" />
    <stroke android:width="2dp" android:color="@color/soft_10" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_icon_circle_soft.xml"] = """<ripple {ns} android:color="@color/ripple_strong">
    <item>
        <shape android:shape="oval">
            <solid android:color="@color/soft_08" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)

FILES["drawable/bg_icon_circle_faint.xml"] = """<ripple {ns} android:color="@color/ripple_strong">
    <item>
        <shape android:shape="oval">
            <solid android:color="@color/soft_05" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)

FILES["drawable/bg_row_ripple_circle.xml"] = """<ripple {ns} android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="@color/text_primary" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)

FILES["drawable/bg_media_badge.xml"] = """<shape {ns} android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/media_badge" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_video_chip.xml"] = """<shape {ns} android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/media_badge" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_nav_badge.xml"] = """<shape {ns} android:shape="rectangle">
    <corners android:radius="10dp" />
    <solid android:color="@color/brand" />
</shape>
""".format(ns=NS)

FILES["drawable/bg_send_fab.xml"] = """<ripple {ns} android:color="@color/ripple_strong">
    <item>
        <shape android:shape="oval">
            <gradient android:startColor="@color/brand" android:endColor="@color/brand_dark"
                android:angle="270" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)

FILES["drawable/bg_skeleton.xml"] = """<shape {ns} android:shape="rectangle">
    <corners android:radius="6dp" />
    <solid android:color="@color/surface2" />
</shape>
""".format(ns=NS)


FILES["drawable/bg_icon_ripple_round.xml"] = """<ripple {ns} android:color="@color/ripple_strong">
    <item android:id="@android:id/mask">
        <shape android:shape="oval">
            <solid android:color="@color/text_primary" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)

FILES["drawable/bg_icon_ripple.xml"] = """<ripple {ns} android:color="@color/ripple">
    <item android:id="@android:id/mask">
        <shape android:shape="rectangle">
            <solid android:color="@color/text_primary" />
        </shape>
    </item>
</ripple>
""".format(ns=NS)


def main():
    for rel, body in FILES.items():
        path = os.path.join(RES, rel)
        d = os.path.dirname(path)
        if not os.path.isdir(d):
            os.makedirs(d)
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(HEAD + body)
    print("доп. фигуры записаны: %d" % len(FILES))
    return 0


if __name__ == "__main__":
    sys.exit(main())
