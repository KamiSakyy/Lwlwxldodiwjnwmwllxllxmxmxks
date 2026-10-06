#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Иконки MailGram — геометрия дословно из SVG старого мессенджера (server (13).py).

Каждая иконка нарисована по тем же координатам, толщинам и закруглениям, что в исходнике:
  .header-menu-btn    22px, stroke 2.5, linecap round
  .header-back        22px, stroke 2.5, fill none
  .search-input-wrap  18px, stroke 2.2
  чат-поиск           20px, stroke 2.2, stroke #fff, linecap round
  .input-attach       20px, stroke 2
  .media-rec-btn      18px, stroke 2 (микрофон, кружок)
  .send-btn           18px, stroke 2
  нижняя навигация    22px, stroke 2 (чаты, профиль, выход)
  drawer-item         20px, stroke 2 (глаз, колокол, замок, камера, выход)
  сообщение           20px, stroke 2 (ответ, пересылка, закреп, правка, удаление)
  play / pause        заливка (polygon 5 3 19 12 5 21, два прямоугольника)
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'
VEC = ('<vector xmlns:android="http://schemas.android.com/apk/res/android"\n'
       '    android:width="{size}dp" android:height="{size}dp"\n'
       '    android:viewportWidth="24" android:viewportHeight="24"{tint}>\n')
STROKE = ('    <path android:fillColor="#00000000" android:strokeColor="#FFFFFFFF"\n'
          '        android:strokeWidth="{w}"{cap}{join} android:pathData="{d}" />\n')
FILL = '    <path android:fillColor="#FFFFFFFF" android:pathData="{d}" />\n'

# ---------------------------------------------------------------- геометрия исходника
S = {}

# .header-menu-btn: три линии 22px, толщина 2.5, скруглённые
S["ic_menu"] = (22, 2.5, True, [
    "M3,12 L21,12", "M3,6 L21,6", "M3,18 L21,18",
])
# .header-back: стрелка 22px, толщина 2.5
S["ic_back"] = (22, 2.5, True, [
    "M19,12 L5,12", "M12,19 L5,12 L12,5",
])
# поиск в списке чатов и в шапке: circle cx11 cy11 r8 + line
S["ic_search"] = (18, 2.2, False, [
    "M19,11 A8,8 0 1,0 3,11 A8,8 0 1,0 19,11",
    "M21,21 L16.65,16.65",
])
# поиск в чате: r7, толщина 2.2, скруглённые (в исходнике — белый)
S["ic_search_chat"] = (20, 2.2, True, [
    "M18,11 A7,7 0 1,0 4,11 A7,7 0 1,0 18,11",
    "M21,21 L16.65,16.65",
])
# .input-attach — скрепка 20px
S["ic_attach"] = (20, 2.0, False, [
    "M21.44,11.05 L12.25,20.24 A6,6 0 0 1 3.76,11.75 L12.95,2.56 "
    "A4,4 0 0 1 18.61,8.22 L9.41,17.41 A2,2 0 0 1 6.58,14.58 L15.07,6.1",
])
# микрофон 18px
S["ic_mic"] = (18, 2.0, False, [
    "M12,1 A3,3 0 0 0 9,4 L9,12 A3,3 0 0 0 15,12 L15,4 A3,3 0 0 0 12,1 Z",
    "M19,10 L19,12 A7,7 0 0 1 5,12 L5,10",
    "M12,19 L12,23", "M8,23 L16,23",
])
# кружок: circle r9 + треугольник
S["ic_circle_video"] = (18, 2.0, False, [
    "M21,12 A9,9 0 1,0 3,12 A9,9 0 1,0 21,12",
    "M10,8 L16,12 L10,16 Z",
])
# отправка 18px
S["ic_send"] = (18, 2.0, False, [
    "M22,2 L11,13", "M22,2 L15,22 L11,13 L2,9 L22,2 Z",
])
# карандаш 12px (правка профиля) и 20px (пункт меню)
S["ic_edit"] = (12, 2.0, False, [
    "M12,20 L21,20",
    "M16.5,3.5 A2.121,2.121 0 0 1 19.5,6.5 L7,19 L3,20 L4,16 L16.5,3.5 Z",
])
S["ic_edit_big"] = (20, 2.0, False, [
    "M12,20 L21,20",
    "M16.5,3.5 A2.121,2.121 0 0 1 19.5,6.5 L7,19 L3,20 L4,16 L16.5,3.5 Z",
])
# камера 14px, толщина 2.5 (значок на аватаре в меню)
S["ic_camera"] = (14, 2.5, False, [
    "M23,19 A2,2 0 0 1 21,21 L3,21 A2,2 0 0 1 1,19 L1,8 A2,2 0 0 1 3,6 L7,6 L9,3 L15,3 L17,6 L21,6 A2,2 0 0 1 23,8 Z",
    "M16,13 A4,4 0 1,0 8,13 A4,4 0 1,0 16,13",
])
# нижняя навигация: чаты, профиль, выход — 22px
S["ic_nav_chats"] = (22, 2.0, False, [
    "M21,11.5 A8.38,8.38 0 0 1 20.1,15.3 A8.5,8.5 0 0 1 12.5,20 "
    "A8.38,8.38 0 0 1 8.7,19.1 L3,21 L4.9,15.3 A8.38,8.38 0 0 1 4,11.5 "
    "A8.5,8.5 0 0 1 8.7,3.9 A8.38,8.38 0 0 1 12.5,3 L13,3 A8.48,8.48 0 0 1 21,11 Z",
])
S["ic_nav_profile"] = (22, 2.0, False, [
    "M20,21 L20,19 A4,4 0 0 0 16,15 L8,15 A4,4 0 0 0 4,19 L4,21",
    "M16,7 A4,4 0 1,0 8,7 A4,4 0 1,0 16,7",
])
S["ic_nav_logout"] = (22, 2.0, False, [
    "M9,21 L5,21 A2,2 0 0 1 3,19 L3,5 A2,2 0 0 1 5,3 L9,3",
    "M16,17 L21,12 L16,7", "M21,12 L9,12",
])
# пункты меню-панели: глаз (не читать), колокол (звук), замок, камера, выход — 20px
S["ic_eye_off"] = (20, 2.0, True, [
    "M1,12 C1,12 5,4 12,4 C19,4 23,12 23,12 C23,12 19,20 12,20 C5,20 1,12 1,12 Z",
    "M15,12 A3,3 0 1,0 9,12 A3,3 0 1,0 15,12",
    "M1,1 L23,23",
])
S["ic_bell"] = (20, 2.0, True, [
    "M18,8 A6,6 0 1,0 6,8 C6,15 3,17 3,17 L21,17 C21,17 18,15 18,8 Z",
    "M13.73,21 A2,2 0 0 1 10.27,21",
])
S["ic_lock"] = (20, 2.0, False, [
    "M5,11 L19,11 A2,2 0 0 1 21,13 L21,20 A2,2 0 0 1 19,22 L5,22 "
    "A2,2 0 0 1 3,20 L3,13 A2,2 0 0 1 5,11 Z",
    "M7,11 L7,7 A5,5 0 0 1 17,7 L17,11",
])
S["ic_lock_small"] = (12, 2.0, False, [
    "M5,11 L19,11 A2,2 0 0 1 21,13 L21,20 A2,2 0 0 1 19,22 L5,22 "
    "A2,2 0 0 1 3,20 L3,13 A2,2 0 0 1 5,11 Z",
    "M7,11 L7,7 A5,5 0 0 1 17,7 L17,11",
])
S["ic_logout_small"] = (20, 2.0, False, [
    "M9,21 L5,21 A2,2 0 0 1 3,19 L3,5 A2,2 0 0 1 5,3 L9,3",
    "M16,17 L21,12 L16,7", "M21,12 L9,12",
])
# сообщение: ответ, пересылка, закреп, удаление — 20px
S["ic_reply"] = (20, 2.0, False, [
    "M9,17 L4,12 L9,7", "M20,18 L20,16 A4,4 0 0 0 16,12 L4,12",
])
S["ic_forward"] = (20, 2.0, False, [
    "M15,14 L20,9 L15,4", "M4,20 L4,13 A4,4 0 0 1 8,9 L20,9",
])
S["ic_pin"] = (20, 2.0, False, [
    "M12,17 L12,22", "M5,17 L19,17 L17.5,10 L6.5,10 Z",
    "M9,10 L9,4 A1,1 0 0 1 10,3 L14,3 A1,1 0 0 1 15,4 L15,10",
])
S["ic_delete"] = (20, 2.0, False, [
    "M3,6 L5,6 L21,6",
    "M19,6 L19,20 A2,2 0 0 1 17,22 L7,22 A2,2 0 0 1 5,20 L5,6 M8,6 L8,4 "
    "A2,2 0 0 1 10,2 L14,2 A2,2 0 0 1 16,4 L16,6",
    "M10,11 L10,17", "M14,11 L14,17",
])
# прочее из исходника
S["ic_call"] = (18, 2.0, False, [
    "M22,16.92 L22,19.92 A2,2 0 0 1 19.82,21.92 A19.79,19.79 0 0 1 11.19,18.85 "
    "A19.5,19.5 0 0 1 5.19,12.85 A19.79,19.79 0 0 1 2.12,4.18 A2,2 0 0 1 4.11,2 "
    "L7.11,2 A2,2 0 0 1 9.11,3.72 A12.84,12.84 0 0 0 9.81,6.53 A2,2 0 0 1 9.36,8.64 "
    "L8.09,9.91 A16,16 0 0 0 14.09,15.91 L15.36,14.64 A2,2 0 0 1 17.47,14.19 "
    "A12.84,12.84 0 0 0 20.28,14.89 A2,2 0 0 1 22,16.92 Z",
])
S["ic_mark_read"] = (12, 3.0, False, ["M20,6 L9,17 L4,12"])
S["ic_scroll_down"] = (20, 2.5, False, ["M6,9 L12,15 L18,9"])
S["ic_more_vert"] = (20, 2.0, False, [])
S["ic_chevron_right"] = (20, 2.0, False, ["M9,18 L15,12 L9,6"])
S["ic_close_small"] = (18, 2.0, False, ["M18,6 L6,18", "M6,6 L18,18"])
S["ic_video_mark"] = (14, 2.0, False, [
    "M23,7 L16,12 L23,17 L23,7 Z",
    "M16,5 L3,5 A2,2 0 0 0 1,7 L1,17 A2,2 0 0 0 3,19 L14,19 A2,2 0 0 0 16,17 L16,5 Z",
])
S["ic_image"] = (20, 2.0, False, [
    "M21,3 L3,3 A2,2 0 0 0 1,5 L1,19 A2,2 0 0 0 3,21 L21,21 A2,2 0 0 0 23,19 L23,5 A2,2 0 0 0 21,3 Z",
    "M10,8.5 A1.5,1.5 0 1,0 7,8.5 A1.5,1.5 0 1,0 10,8.5",
    "M21,15 L16,10 L5,21",
])
S["ic_cloud"] = (20, 2.0, False, [
    "M18,10 L16.74,10 A8,8 0 1 0 9,20 L18,20 A5,5 0 0 0 18,10 Z",
])
S["ic_star_outline"] = (14, 2.0, False, [
    "M12,2 L15.09,8.26 L22,9.27 L17,14.14 L18.18,21.02 L12,17.77 L5.82,21.02 "
    "L7,14.14 L2,9.27 L8.91,8.26 Z",
])
S["ic_heart"] = (32, 1.5, False, [
    "M20.84,4.61 A5.5,5.5 0 0 0 13.06,4.61 L12,5.67 L10.94,4.61 "
    "A5.5,5.5 0 0 0 3.16,12.39 L4.22,13.45 L12,21.23 L19.78,13.45 "
    "L20.84,12.39 A5.5,5.5 0 0 0 20.84,4.61 Z",
])
# файл-карточка в исходнике подписана иконкой замка (rect + дужка)
S["ic_file"] = (16, 2.0, False, [
    "M5,11 L19,11 A2,2 0 0 1 21,13 L21,20 A2,2 0 0 1 19,22 L5,22 "
    "A2,2 0 0 1 3,20 L3,13 A2,2 0 0 1 5,11 Z",
    "M7,11 L7,7 A5,5 0 0 1 17,7 L17,11",
])
# скачивание и «без звука» — как в исходнике
S["ic_download"] = (20, 2.0, False, [
    "M21,15 L21,19 A2,2 0 0 1 19,21 L5,21 A2,2 0 0 1 3,19 L3,15",
    "M7,10 L12,15 L17,10", "M12,15 L12,3",
])
S["ic_mute"] = (18, 2.0, False, [
    "M18,8 A6,6 0 1,0 6,8 C6,15 3,17 3,17 L21,17 C21,17 18,15 18,8 Z",
    "M13.73,21 A2,2 0 0 1 10.27,21",
    "M2,2 L22,22",
])
S["ic_shield"] = (20, 2.0, False, [
    "M12,22 C12,22 20,18 20,12 L20,5 L12,2 L4,5 L4,12 C4,18 12,22 12,22 Z",
])
S["ic_settings"] = (20, 2.0, False, [
    "M12,15 A3,3 0 1,0 12,9 A3,3 0 1,0 12,15",
    "M19.4,15 A1.65,1.65 0 0 0 19.73,16.82 L19.79,16.88 A2,2 0 1 1 16.96,19.71 "
    "L16.9,19.65 A1.65,1.65 0 0 0 15.08,19.32 A1.65,1.65 0 0 0 14,20.82 L14,21 "
    "A2,2 0 1 1 10,21 L10,20.91 A1.65,1.65 0 0 0 8.92,19.41 A1.65,1.65 0 0 0 7.1,19.74 "
    "L7.04,19.8 A2,2 0 1 1 4.21,16.97 L4.27,16.91 A1.65,1.65 0 0 0 4.6,15.09 "
    "A1.65,1.65 0 0 0 3.1,14 L3,14 A2,2 0 1 1 3,10 L3.09,10 A1.65,1.65 0 0 0 4.59,8.92 "
    "A1.65,1.65 0 0 0 4.26,7.1 L4.2,7.04 A2,2 0 1 1 7.03,4.21 L7.09,4.27 "
    "A1.65,1.65 0 0 0 8.91,4.6 L9,4.6 A1.65,1.65 0 0 0 10,3.1 L10,3 A2,2 0 1 1 14,3 "
    "L14,3.09 A1.65,1.65 0 0 0 15.08,4.59 A1.65,1.65 0 0 0 16.9,4.26 L16.96,4.2 "
    "A2,2 0 1 1 19.79,7.03 L19.73,7.09 A1.65,1.65 0 0 0 19.4,8.91 L19.4,9 "
    "A1.65,1.65 0 0 0 20.9,10 L21,10 A2,2 0 1 1 21,14 L20.91,14 A1.65,1.65 0 0 0 19.4,15 Z",
])

# воспроизведение и пауза — заливка (как в исходнике)
FILLED = {
    "ic_play": (18, "M5,3 L19,12 L5,21 Z"),
    "ic_play_big": (22, "M5,3 L19,12 L5,21 Z"),
    "ic_pause": (18, "M6,4 L10,4 L10,20 L6,20 Z M14,4 L18,4 L18,20 L14,20 Z"),
}


def circle(cx, cy, r, w):
    d = "M{},{:.4f} A{},{},0 1,0 {:.4f},{} A{},{},0 1,0 {},{:.4f}".format(
        cx + r, float(cy), r, r, cx - r, cy, r, r, cx + r, float(cy))
    return d


def build(size, width, round_cap, paths, tint, filled_d=None):
    out = VEC.format(size=size, tint=tint)
    if filled_d:
        out += FILL.format(d=filled_d)
    cap = ' android:strokeLineCap="round"' if round_cap else ''
    join = ' android:strokeLineJoin="round"' if round_cap else ''
    for d in paths:
        out += STROKE.format(w=width, cap=cap, join=join, d=d)
    out += "</vector>\n"
    return out


def main():
    out_dir = os.path.join(RES, "drawable")
    if not os.path.isdir(out_dir):
        os.makedirs(out_dir)
    count = 0
    for name, (size, width, round_cap, paths) in S.items():
        tint = '\n    android:tint="@color/text_primary"' if name in (
            "ic_nav_chats", "ic_nav_profile", "ic_nav_logout") else ''
        body = build(size, width, round_cap, paths, tint)
        if name == "ic_more_vert":
            body = build(size, width, round_cap, [], tint,
                         filled_d="M13,5 A1,1 0 1,0 11,5 A1,1 0 1,0 13,5 "
                                  "M13,12 A1,1 0 1,0 11,12 A1,1 0 1,0 13,12 "
                                  "M13,19 A1,1 0 1,0 11,19 A1,1 0 1,0 13,19")
        with open(os.path.join(out_dir, name + ".xml"), "w", encoding="utf-8") as fh:
            fh.write(HEAD + body)
        count += 1
    for name, (size, d) in FILLED.items():
        with open(os.path.join(out_dir, name + ".xml"), "w", encoding="utf-8") as fh:
            fh.write(HEAD + build(size, 0, False, [], '', filled_d=d))
        count += 1
    print("иконки записаны: %d" % count)
    return 0


if __name__ == "__main__":
    sys.exit(main())
