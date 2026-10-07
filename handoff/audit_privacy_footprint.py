#!/usr/bin/env python3
"""Inventory likely ad/analytics SDK footprints from APK DEX and manifest data.

This is a static triage aid: it reports known package-prefix and permission
presence counts, never source snippets, string literals, tokens, or credentials.
A match does not by itself prove that a code path is active.
"""

from __future__ import annotations

import os
import re
import struct
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
        "Yandex Mobile Ads": b"Lcom/yandex/mobile/ads/",
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
MANIFEST_SDK_MARKERS = (
    b"com.google.android.gms.ads",
    b"com.google.ads",
    b"com.applovin",
    b"com.unity3d",
    b"com.vungle",
    b"com.ironsource",
    b"com.my.tracker",
    b"com.yandex",
    b"com.yandex.mobile.ads",
    b"com.google.firebase",
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


def _length8(data: bytes, offset: int) -> tuple[int, int]:
    first = data[offset]
    if first & 0x80:
        return (((first & 0x7F) << 8) | data[offset + 1], offset + 2)
    return first, offset + 1


def _length16(data: bytes, offset: int) -> tuple[int, int]:
    first = struct.unpack_from("<H", data, offset)[0]
    if first & 0x8000:
        second = struct.unpack_from("<H", data, offset + 2)[0]
        return (((first & 0x7FFF) << 16) | second, offset + 4)
    return first, offset + 2


def _axml_string_pool(data: bytes) -> list[str] | None:
    """Return the indexed AXML string pool, accepting UTF-8 and UTF-16 pools."""
    if len(data) < 8:
        return None
    root_type, root_header, root_size = struct.unpack_from("<HHI", data, 0)
    if root_type != 0x0003 or root_header < 8 or root_size > len(data):
        return None
    offset = root_header
    while offset + 8 <= root_size:
        chunk_type, header_size, chunk_size = struct.unpack_from("<HHI", data, offset)
        if chunk_size < header_size or offset + chunk_size > root_size:
            return None
        if chunk_type == 0x0001 and header_size >= 28:
            string_count, _style_count, flags, strings_start, _styles_start = struct.unpack_from(
                "<IIIII", data, offset + 8
            )
            offsets_start = offset + header_size
            if string_count > 1_000_000 or offsets_start + string_count * 4 > offset + chunk_size:
                return None
            is_utf8 = bool(flags & 0x100)
            strings: list[str] = []
            for index in range(string_count):
                relative = struct.unpack_from("<I", data, offsets_start + index * 4)[0]
                cursor = offset + strings_start + relative
                if cursor < offset or cursor >= offset + chunk_size:
                    strings.append("")
                    continue
                try:
                    if is_utf8:
                        _utf16_len, cursor = _length8(data, cursor)
                        byte_len, cursor = _length8(data, cursor)
                        value = data[cursor:cursor + byte_len].decode("utf-8", errors="replace")
                    else:
                        char_len, cursor = _length16(data, cursor)
                        byte_len = char_len * 2
                        value = data[cursor:cursor + byte_len].decode("utf-16le", errors="replace")
                except (IndexError, struct.error):
                    strings.append("")
                    continue
                strings.append(value)
            return strings
        offset += chunk_size
    return None


def axml_strings(data: bytes) -> set[str]:
    """Return the Android binary-XML string pool as a set of values."""
    return {value for value in (_axml_string_pool(data) or []) if value}


def axml_declared_permissions(data: bytes) -> set[str] | None:
    """Parse uses-permission name attributes; None means AXML structure was unavailable."""
    strings = _axml_string_pool(data)
    if strings is None or len(data) < 8:
        return None
    _root_type, root_header, root_size = struct.unpack_from("<HHI", data, 0)
    offset = root_header
    saw_start_element = False
    permissions: set[str] = set()
    android_ns = "http://schemas.android.com/apk/res/android"

    def pool_value(index: int) -> str:
        return strings[index] if 0 <= index < len(strings) else ""

    while offset + 8 <= root_size:
        chunk_type, header_size, chunk_size = struct.unpack_from("<HHI", data, offset)
        if chunk_size < header_size or offset + chunk_size > root_size:
            return None
        if chunk_type == 0x0102 and header_size >= 16:
            saw_start_element = True
            ext = offset + header_size
            if ext + 20 > offset + chunk_size:
                return None
            _namespace_index, element_name_index = struct.unpack_from("<II", data, ext)
            element_name = pool_value(element_name_index)
            attr_start, attr_size, attr_count = struct.unpack_from("<HHH", data, ext + 8)
            if attr_size < 20 or attr_count > 65535:
                return None
            attrs = ext + attr_start
            if attrs + attr_count * attr_size > offset + chunk_size:
                return None
            if element_name.startswith("uses-permission"):
                for index in range(attr_count):
                    attr_offset = attrs + index * attr_size
                    ns_index, name_index, raw_value_index = struct.unpack_from("<III", data, attr_offset)
                    if pool_value(ns_index) != android_ns or pool_value(name_index) != "name":
                        continue
                    value = pool_value(raw_value_index)
                    if not value:
                        value_size = struct.unpack_from("<H", data, attr_offset + 12)[0]
                        value_type = data[attr_offset + 15]
                        value_data = struct.unpack_from("<I", data, attr_offset + 16)[0]
                        if value_size >= 8 and value_type == 0x03:
                            value = pool_value(value_data)
                    if value:
                        permissions.add(value)
        offset += chunk_size
    return permissions if saw_start_element else None


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
    manifest_strings = axml_strings(manifest)
    if not manifest_strings:
        manifest_strings = {
            match.decode("ascii", errors="ignore")
            for match in re.findall(rb"[A-Za-z0-9_.$/]{4,}", manifest)
        }
    declared_permissions = axml_declared_permissions(manifest)
    if declared_permissions is None:
        present = [permission for permission in PERMISSIONS if permission in manifest_strings]
        permission_note = " (string-pool matches; structured AXML parse unavailable)"
    else:
        present = [permission for permission in PERMISSIONS if permission in declared_permissions]
        permission_note = ""
    result.append(
        "- Privacy-sensitive manifest permissions" + permission_note + ": "
        + (", ".join(f"`{name}`" for name in present) if present else "none from the reviewed list")
    )
    sdk_names = sorted(
        value for value in manifest_strings
        if any(marker.decode("ascii") in value for marker in MANIFEST_SDK_MARKERS)
    )
    result.append(
        "- SDK-related manifest component/class names: "
        + (", ".join(f"`{name}`" for name in sdk_names[:80]) if sdk_names else "none of the known SDK package names found")
    )
    sdk_optouts = sorted(
        value for value in manifest_strings
        if value.startswith("firebase_")
        or value.startswith("google_analytics_")
        or value.startswith("com.yandex.mobile.ads.")
    )
    result.append(
        "- Known analytics/ad SDK opt-out keys already present: "
        + (", ".join(f"`{name}`" for name in sdk_optouts) if sdk_optouts else "none")
    )
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
