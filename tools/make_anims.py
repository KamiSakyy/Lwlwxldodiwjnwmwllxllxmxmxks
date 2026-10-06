#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""Анимации MailGram — длительности и кривые ровно как в CSS старого мессенджера.

CSS → Android:
  @keyframes msgAppear  : opacity 0→1, translateY(6px)→0, .15s ease-out
  .chat-screen.active   : translateX(100%)→0, .22s cubic-bezier(.1,.9,.2,1)
  .drawer.active        : translateX(-100%)→0, .25s cubic-bezier(.1,.9,.2,1)
  .drawer-overlay       : opacity 0→1, .25s ease
  .comments/.profile    : translateY(100%)→0, .25s cubic-bezier(.1,.9,.2,1)
  .action-sheet         : translateY(100%)→0, .22s
  .context-menu         : scale(.9)+opacity, .15s
  scroll-fab            : scale(.8)→1, .2s
  send pulse            : scale 1→1.12→1, .4s
  shake (PIN)           : translateX ±6px, .4s
  spin (loader)         : rotate 360°, .6s linear infinite
  pulseDot (онлайн)     : opacity 1→.35→1, 1s infinite
  skeletonPulse         : opacity .5→1, 1.5s infinite
"""
import os
import sys

RES = os.path.join("app", "src", "main", "res", "anim")
HEAD = '<?xml version="1.0" encoding="utf-8"?>\n'
NS = 'xmlns:android="http://schemas.android.com/apk/res/android"'

ANIMS = {}

ANIMS["cubic_standard"] = """<pathInterpolator {ns}
    android:controlX1="0.1" android:controlY1="0.9"
    android:controlX2="0.2" android:controlY2="1.0" />""".format(ns=NS)

ANIMS["msg_appear"] = """<set {ns} android:shareInterpolator="false">
    <alpha android:duration="150" android:fromAlpha="0.0" android:toAlpha="1.0"
        android:interpolator="@android:anim/decelerate_interpolator" />
    <translate android:duration="150" android:fromYDelta="6" android:toYDelta="0"
        android:interpolator="@android:anim/decelerate_interpolator" />
</set>""".format(ns=NS)

ANIMS["fade_in"] = """<alpha {ns} android:duration="200" android:fromAlpha="0.0" android:toAlpha="1.0" />""".format(ns=NS)
ANIMS["fade_out"] = """<alpha {ns} android:duration="200" android:fromAlpha="1.0" android:toAlpha="0.0" />""".format(ns=NS)
ANIMS["fade_in_slight"] = """<alpha {ns} android:duration="200" android:fromAlpha="0.0" android:toAlpha="1.0" />""".format(ns=NS)
ANIMS["fade_out_slight"] = """<alpha {ns} android:duration="200" android:fromAlpha="1.0" android:toAlpha="0.0" />""".format(ns=NS)

ANIMS["slide_in_right"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromXDelta="100%p" android:toXDelta="0" />
    <alpha android:duration="220" android:fromAlpha="0.6" android:toAlpha="1.0" />
</set>""".format(ns=NS)
ANIMS["slide_out_right"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromXDelta="0" android:toXDelta="100%p" />
    <alpha android:duration="220" android:fromAlpha="1.0" android:toAlpha="0.6" />
</set>""".format(ns=NS)

ANIMS["slide_up"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="250" android:fromYDelta="100%p" android:toYDelta="0" />
    <alpha android:duration="200" android:fromAlpha="0.0" android:toAlpha="1.0" />
</set>""".format(ns=NS)
ANIMS["slide_down"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromYDelta="0" android:toYDelta="100%p" />
    <alpha android:duration="200" android:fromAlpha="1.0" android:toAlpha="0.0" />
</set>""".format(ns=NS)

ANIMS["chat_in"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromXDelta="100%p" android:toXDelta="0" />
    <alpha android:duration="160" android:fromAlpha="0.85" android:toAlpha="1.0" />
</set>""".format(ns=NS)
ANIMS["chat_out"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromXDelta="0" android:toXDelta="100%p" />
</set>""".format(ns=NS)

ANIMS["drawer_in"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="250" android:fromXDelta="-100%p" android:toXDelta="0" />
</set>""".format(ns=NS)
ANIMS["drawer_out"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="250" android:fromXDelta="0" android:toXDelta="-100%p" />
</set>""".format(ns=NS)

ANIMS["sheet_up"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromYDelta="100%p" android:toYDelta="0" />
</set>""".format(ns=NS)
ANIMS["sheet_down"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@anim/cubic_standard">
    <translate android:duration="220" android:fromYDelta="0" android:toYDelta="100%p" />
</set>""".format(ns=NS)

ANIMS["scale_in"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@android:anim/decelerate_interpolator">
    <scale android:duration="150" android:fromXScale="0.9" android:toXScale="1.0"
        android:fromYScale="0.9" android:toYScale="1.0" android:pivotX="50%" android:pivotY="50%" />
    <alpha android:duration="150" android:fromAlpha="0.0" android:toAlpha="1.0" />
</set>""".format(ns=NS)
ANIMS["scale_out"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@android:anim/accelerate_interpolator">
    <scale android:duration="120" android:fromXScale="1.0" android:toXScale="0.9"
        android:fromYScale="1.0" android:toYScale="0.9" android:pivotX="50%" android:pivotY="50%" />
    <alpha android:duration="120" android:fromAlpha="1.0" android:toAlpha="0.0" />
</set>""".format(ns=NS)

ANIMS["fab_in"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@android:anim/decelerate_interpolator">
    <scale android:duration="200" android:fromXScale="0.8" android:toXScale="1.0"
        android:fromYScale="0.8" android:toYScale="1.0" android:pivotX="50%" android:pivotY="50%" />
    <alpha android:duration="200" android:fromAlpha="0.0" android:toAlpha="1.0" />
</set>""".format(ns=NS)

ANIMS["send_pulse"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@android:anim/decelerate_interpolator">
    <scale android:duration="400" android:fromXScale="1.0" android:toXScale="1.12"
        android:fromYScale="1.0" android:toYScale="1.12" android:pivotX="50%" android:pivotY="50%" />
    <alpha android:duration="400" android:fromAlpha="1.0" android:toAlpha="0.92" />
</set>""".format(ns=NS)

ANIMS["shake"] = """<translate {ns}
    android:duration="400"
    android:fromXDelta="0" android:toXDelta="0"
    android:interpolator="@android:anim/cycle_interpolator"
    android:cycles="4" />""".format(ns=NS)

ANIMS["spin"] = """<rotate {ns}
    android:duration="600" android:fromDegrees="0" android:toDegrees="360"
    android:pivotX="50%" android:pivotY="50%" android:repeatCount="infinite"
    android:interpolator="@android:anim/linear_interpolator" />""".format(ns=NS)

ANIMS["pulse_dot"] = """<alpha {ns} android:duration="1000" android:fromAlpha="1.0" android:toAlpha="0.35"
    android:repeatMode="reverse" android:repeatCount="infinite" />""".format(ns=NS)

ANIMS["skeleton_pulse"] = """<alpha {ns} android:duration="1500" android:fromAlpha="0.5" android:toAlpha="1.0"
    android:repeatMode="reverse" android:repeatCount="infinite" />""".format(ns=NS)

ANIMS["pop_in"] = """<set {ns} android:shareInterpolator="true" android:interpolator="@android:anim/overshoot_interpolator">
    <scale android:duration="200" android:fromXScale="0.85" android:toXScale="1.0"
        android:fromYScale="0.85" android:toYScale="1.0" android:pivotX="50%" android:pivotY="50%" />
    <alpha android:duration="150" android:fromAlpha="0.0" android:toAlpha="1.0" />
</set>""".format(ns=NS)


def main():
    if not os.path.isdir(RES):
        os.makedirs(RES)
    for name, body in ANIMS.items():
        with open(os.path.join(RES, name + ".xml"), "w", encoding="utf-8") as fh:
            fh.write(HEAD + body + "\n")
    print("анимации записаны: %d" % len(ANIMS))
    return 0


if __name__ == "__main__":
    sys.exit(main())
