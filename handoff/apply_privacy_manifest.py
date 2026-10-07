#!/usr/bin/env python3
"""Disable known SDK collection and remove ad/tracking manifest entries and permissions.

Run on Apktool's decoded AndroidManifest.xml before rebuilding the base APK. The
script changes manifest metadata, SDK components, and selected sensitive
permissions; it never edits VK login flows.
"""

from __future__ import annotations

import argparse
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

ANDROID_NS = "http://schemas.android.com/apk/res/android"
ANDROID = f"{{{ANDROID_NS}}}"
ET.register_namespace("android", ANDROID_NS)

ANALYTICS_OPTOUTS = {
    "firebase_analytics_collection_deactivated": "true",
    "firebase_analytics_collection_enabled": "false",
    "google_analytics_adid_collection_enabled": "false",
    "google_analytics_ssaid_collection_enabled": "false",
    "google_analytics_default_allow_ad_personalization_signals": "false",
    "firebase_crashlytics_collection_enabled": "false",
    "firebase_performance_collection_deactivated": "true",
    "firebase_performance_collection_enabled": "false",
    "firebase_sessions_enabled": "false",
    "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION": "false",
    "com.yandex.mobile.ads.APPMETRICA_ANALYTICS_ENABLED": "false",
}
AD_SDK_PREFIXES = (
    "com.google.android.gms.ads.",
    "com.google.ads.",
    "com.applovin.",
    "com.unity3d.",
    "com.vungle.",
    "com.ironsource.",
    "com.yandex.mobile.ads.",
)
TRACKING_SDK_PREFIXES = (
    "com.my.tracker.",
    "com.yandex.metrica.",
    "com.google.firebase.analytics.",
    "com.google.firebase.crashlytics.",
    "com.google.firebase.perf.",
    "com.google.firebase.sessions.",
    "com.google.android.gms.measurement.",
)
SENSITIVE_PERMISSIONS = (
    "com.google.android.gms.permission.AD_ID",
    "android.permission.READ_PHONE_STATE",
    "android.permission.READ_PHONE_NUMBERS",
    "android.permission.ACCESS_FINE_LOCATION",
    "android.permission.ACCESS_COARSE_LOCATION",
    "android.permission.GET_ACCOUNTS",
    "android.permission.QUERY_ALL_PACKAGES",
)
SPLIT_METADATA_PREFIX = "com.android.vending.splits"
COMPONENT_TAGS = {"activity", "activity-alias", "service", "receiver", "provider"}


def _local_name(tag: str) -> str:
    return tag.rsplit("}", 1)[-1]


def patch_manifest(path: Path) -> dict[str, object]:
    if not path.is_file():
        raise ValueError(f"decoded AndroidManifest.xml not found: {path}")
    try:
        tree = ET.parse(path)
    except ET.ParseError as exc:
        raise ValueError(f"decoded manifest is not valid XML: {exc}") from exc
    root = tree.getroot()
    if root.attrib.get("package") != "com.vkontakte.android":
        raise ValueError(f"unexpected manifest package: {root.attrib.get('package', '(missing)')}")

    application = next((child for child in root if _local_name(child.tag) == "application"), None)
    if application is None:
        raise ValueError("manifest has no application element")

    removed_split_markers = 0
    for attribute in ("split", ANDROID + "splitTypes", ANDROID + "requiredSplitTypes"):
        if attribute in root.attrib:
            del root.attrib[attribute]
            removed_split_markers += 1
    for attribute in (ANDROID + "isSplitRequired", ANDROID + "splitName", ANDROID + "isolatedSplits"):
        if attribute in application.attrib:
            del application.attrib[attribute]
            removed_split_markers += 1
    for child in list(root):
        if _local_name(child.tag) == "uses-split":
            root.remove(child)
            removed_split_markers += 1
    for child in list(application):
        name = child.attrib.get(ANDROID + "name", "")
        if _local_name(child.tag) == "meta-data" and name.startswith(SPLIT_METADATA_PREFIX):
            application.remove(child)
            removed_split_markers += 1

    metadata_by_name: dict[str, ET.Element] = {}
    removed_duplicate_metadata = 0
    for child in list(application):
        name = child.attrib.get(ANDROID + "name")
        if _local_name(child.tag) != "meta-data" or name not in ANALYTICS_OPTOUTS:
            continue
        if name in metadata_by_name:
            application.remove(child)
            removed_duplicate_metadata += 1
        else:
            metadata_by_name[name] = child
    changed_metadata: list[str] = []
    for name, value in ANALYTICS_OPTOUTS.items():
        element = metadata_by_name.get(name)
        if element is None:
            element = ET.SubElement(application, "meta-data")
            element.set(ANDROID + "name", name)
        if element.attrib.get(ANDROID + "value") != value:
            element.set(ANDROID + "value", value)
            changed_metadata.append(name)

    removed_ad_components: list[str] = []
    removed_tracking_components: list[str] = []
    for parent in list(root.iter()):
        for child in list(parent):
            if _local_name(child.tag) not in COMPONENT_TAGS:
                continue
            component_name = child.attrib.get(ANDROID + "name", "")
            if component_name.startswith(AD_SDK_PREFIXES):
                removed_ad_components.append(component_name)
                parent.remove(child)
            elif component_name.startswith(TRACKING_SDK_PREFIXES):
                removed_tracking_components.append(component_name)
                parent.remove(child)

    removed_permissions: list[str] = []
    for child in list(root):
        tag = _local_name(child.tag)
        permission = child.attrib.get(ANDROID + "name")
        if tag.startswith("uses-permission") and permission in SENSITIVE_PERMISSIONS:
            removed_permissions.append(permission)
            root.remove(child)

    tree.write(path, encoding="utf-8", xml_declaration=True)
    return {
        "changed_metadata": changed_metadata,
        "removed_ad_components": sorted(set(removed_ad_components)),
        "removed_tracking_components": sorted(set(removed_tracking_components)),
        "removed_sensitive_permissions": sorted(set(removed_permissions)),
        "removed_ad_id_permission": "com.google.android.gms.permission.AD_ID" in removed_permissions,
        "removed_duplicate_metadata": removed_duplicate_metadata,
        "removed_split_markers": removed_split_markers,
        "optout_metadata_count": len(ANALYTICS_OPTOUTS),
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("manifest", type=Path, help="Apktool-decoded AndroidManifest.xml")
    args = parser.parse_args()
    try:
        result = patch_manifest(args.manifest)
    except (OSError, ValueError) as exc:
        print(f"privacy manifest patch failed: {type(exc).__name__}: {exc}", file=sys.stderr)
        return 1
    print(f"Known analytics/ad SDK opt-out metadata enforced: {result['optout_metadata_count']}")
    print("Changed metadata keys: " + (", ".join(result["changed_metadata"]) or "already correct"))
    ad_components = result["removed_ad_components"]
    tracking_components = result["removed_tracking_components"]
    print("Ad SDK manifest components removed: " + (", ".join(ad_components) or "none declared"))
    print("Analytics SDK manifest components removed: " + (", ".join(tracking_components) or "none declared"))
    removed_permissions = result["removed_sensitive_permissions"]
    print("Sensitive permissions removed: " + (", ".join(removed_permissions) or "none declared"))
    print(f"Duplicate opt-out metadata entries removed: {result['removed_duplicate_metadata']}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
