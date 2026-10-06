#!/usr/bin/env python3
"""Inventory likely ad/analytics SDK footprints from APK DEX and manifest data.

This is a static triage aid: it reports known package-prefix and permission
presence counts, never source snippets, string literals, tokens, or credentials.
A match does not by itself prove that a code path is active.
"""

from __future__ import annotations

import os
import sys
import zipfile
from collections import Counter
from pathlib import Path, PurePosixPath

SDK_PREFIXES = {
    "ads": {
        "Google Mobile Ads": b"Lcom/google/android/gms/ads/",
        "Google Ads": b"Lcom/google/ads/",
        "Facebook Ads": b"Lcom/facebook/ads/",
        "AppLovin": b"Lcom/applovin/",
        "Unity Ads": b"Lcom/unity3d/ads/",
        "InMobi": b"Lcom/inmobi/",
        "Vungle": b"Lcom/vungle/",
        "ironSource": b"Lcom/ironsource/",
        "Chartboost": b"Lcom/chartboost/",
        "Tapjoy": b"Lcom/tapjoy/",
        "Amazon Ads": b"Lcom/amazon/device/ads/",
        "Pangle/ByteDance Ads": b"Lcom/bytedance/sdk/openadsdk/",
        "Start.io Ads": b"Lcom/startapp/",
    },
    "analytics": {
        "Firebase Analytics": b"Lcom/google/firebase/analytics/",
        "Google Measurement": b"Lcom/google/android/gms/measurement/",
        "Firebase Crashlytics": b"Lcom/google/firebase/crashlytics/",
        "Firebase Performance": b"Lcom/google/firebase/perf/",
        "AppsFlyer": b"Lcom/appsflyer/",
        "Adjust": b"Lcom/adjust/sdk/",
        "Yandex Metrica": b"Lcom/yandex/metrica/",
        "Sentry": b"Lio/sentry/",
        "Amplitude": b"Lcom/amplitude/",
        "Mixpanel": b"Lcom/mixpanel/",
        "Segment": b"Lcom/segment/analytics/",
        "Kochava": b"Lcom/kochava/",
        "myTracker": b"Lcom/my/tracker/",
        "Umeng": b"Lcom/umeng/",
        "OneSignal": b"Lcom/onesignal/",
        "Bugsnag": b"Lcom/bugsnag/",
        "Instabug": b"Lcom/instabug/",
        "Facebook App Events": b"Lcom/facebook/appevents/",
        "CleverTap": b"Lcom/clevertap/",
        "Leanplum": b"Lcom/leanplum/",
        "Firebase Sessions": b"Lcom/google/firebase/sessions/",
    },
}

PERMISSIONS = (
    "com.google.android.gms.permission.AD_ID",
    "android.permission.READ_PHONE_STATE",
    "android.permission.READ_PHONE_NUMBERS",
    "android.permission.ACCESS_FINE_LOCATION",
    "android.permission.ACCESS_COARSE_LOCATION",
    "android.permission.GET_ACCOUNTS",
    "android.permission.QUERY_ALL_PACKAGES",
)
def dex_files(names: list[str]) -> list[str]:
    return sorted(
        name for name in names
        if PurePosixPath(name).name == "classes.dex"
        or (
            PurePosixPath(name).name.startswith("classes")
            and PurePosixPath(name).suffix == ".dex"
            and PurePosixPath(name).name[7:-4].isdigit()
        )
    )


def audit(apk_path: Path) -> list[str]:
    with zipfile.ZipFile(apk_path, "r") as apk:
        names = apk.namelist()
        dex_names = dex_files(names)
        if not dex_names:
            raise ValueError(f"no DEX entries found in {apk_path.name}")
        matches: Counter[tuple[str, str]] = Counter()
        for dex_name in dex_names:
            data = apk.read(dex_name)
            for category, packages in SDK_PREFIXES.items():
                for label, prefix in packages.items():
                    count = data.count(prefix)
                    if count:
                        matches[(category, label)] += count
        manifest = apk.read("AndroidManifest.xml") if "AndroidManifest.xml" in names else b""

    result = [
        f"### `{apk_path.name}`",
        f"- DEX files inspected: {len(dex_names)}",
    ]
    for category in ("ads", "analytics"):
        found = [
            (label, count) for (match_category, label), count in sorted(matches.items())
            if match_category == category
        ]
        result.append(
            f"- {category.title()} SDK prefixes: "
            + (", ".join(f"{label} ({count})" for label, count in found) if found else "none of the known prefixes matched")
        )
    present = [permission for permission in PERMISSIONS if permission.encode("ascii") in manifest]
    result.append("- Privacy-sensitive manifest permissions: " + (", ".join(f"`{name}`" for name in present) if present else "none from the reviewed list"))
    return result


def main() -> int:
    if len(sys.argv) != 2:
        print("usage: audit_privacy_footprint.py BASE.apk", file=sys.stderr)
        return 2
    apk_path = Path(sys.argv[1])
    if not apk_path.is_file():
        print(f"APK is missing: {apk_path.name}", file=sys.stderr)
        return 2
    try:
        lines = [
            "# VK static privacy footprint (known SDKs)",
            "",
            "> Static signature matches are triage hints, not proof of active network traffic. No source or string contents are emitted.",
            "",
            *audit(apk_path),
            "",
        ]
    except (OSError, ValueError, zipfile.BadZipFile, RuntimeError) as exc:
        message = f"Privacy footprint audit failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=Privacy footprint audit::{escaped}")
        return 1

    output = "\n".join(lines)
    print(output)
    summary = os.environ.get("GITHUB_STEP_SUMMARY")
    if summary:
        with Path(summary).open("a", encoding="utf-8") as stream:
            stream.write(output)
    if os.environ.get("GITHUB_ACTIONS") == "true":
        for line in lines:
            if line.startswith("- "):
                escaped = line[2:].replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
                print(f"::notice title=VK privacy audit::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
