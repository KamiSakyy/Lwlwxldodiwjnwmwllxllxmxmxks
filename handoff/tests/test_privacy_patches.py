from __future__ import annotations

import struct
import tempfile
import unittest
import xml.etree.ElementTree as ET
import zipfile
from pathlib import Path

from handoff.apply_privacy_manifest import ANALYTICS_OPTOUTS, ANDROID, patch_manifest
from handoff.audit_privacy_footprint import audit, axml_strings
from handoff.patch_smali_sdk_calls import patch_tree


def _length8(value: int) -> bytes:
    if value < 0x80:
        return bytes((value,))
    return bytes((0x80 | (value >> 8), value & 0xFF))


def _string_pool(strings: list[str], utf8: bool) -> bytes:
    encoded: list[bytes] = []
    offsets: list[int] = []
    for value in strings:
        offsets.append(sum(map(len, encoded)))
        if utf8:
            raw = value.encode("utf-8")
            encoded.append(_length8(len(value)) + _length8(len(raw)) + raw + b"\0")
        else:
            raw = value.encode("utf-16le")
            encoded.append(struct.pack("<H", len(value)) + raw + b"\0\0")
    header_size = 28
    strings_start = header_size + 4 * len(strings)
    pool_data = b"".join(encoded)
    chunk_size = strings_start + len(pool_data)
    pool = (
        struct.pack("<HHI", 0x0001, header_size, chunk_size)
        + struct.pack("<IIIII", len(strings), 0, 0x100 if utf8 else 0, strings_start, 0)
        + b"".join(struct.pack("<I", offset) for offset in offsets)
        + pool_data
    )
    return struct.pack("<HHI", 0x0003, 8, 8 + len(pool)) + pool


class PrivacyManifestTests(unittest.TestCase):
    def test_manifest_optouts_are_idempotent_and_preserve_core_components(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            manifest = Path(temp) / "AndroidManifest.xml"
            manifest.write_text(
                '<manifest xmlns:android="http://schemas.android.com/apk/res/android" '
                'package="com.vkontakte.android">'
                '<uses-permission android:name="com.google.android.gms.permission.AD_ID"/>'
                '<application>'
                '<activity android:name="com.unity3d.ads.AdActivity"/>'
                '<provider android:name="com.my.tracker.MyTrackerProvider"/>'
                '<provider android:name="com.google.firebase.provider.FirebaseInitProvider"/>'
                '<activity android:name="com.vkontakte.android.MainActivity"/>'
                '<meta-data android:name="firebase_analytics_collection_enabled" android:value="true"/>'
                '<meta-data android:name="firebase_analytics_collection_enabled" android:value="true"/>'
                '</application></manifest>',
                encoding="utf-8",
            )

            first = patch_manifest(manifest)
            second = patch_manifest(manifest)
            root = ET.parse(manifest).getroot()
            app = next(item for item in root if item.tag.endswith("application"))
            metadata = {
                item.attrib.get(ANDROID + "name"): item.attrib.get(ANDROID + "value")
                for item in app if item.tag.endswith("meta-data")
            }
            self.assertTrue(set(ANALYTICS_OPTOUTS.items()) <= set(metadata.items()))
            self.assertEqual(
                sum(item.attrib.get(ANDROID + "name") == "firebase_analytics_collection_enabled"
                    for item in app if item.tag.endswith("meta-data")),
                1,
            )
            components = [
                item.attrib.get(ANDROID + "name") for item in app
                if item.tag.endswith(("activity", "activity-alias", "service", "receiver", "provider"))
            ]
            self.assertNotIn("com.unity3d.ads.AdActivity", components)
            self.assertNotIn("com.my.tracker.MyTrackerProvider", components)
            self.assertIn("com.google.firebase.provider.FirebaseInitProvider", components)
            self.assertIn("com.vkontakte.android.MainActivity", components)
            self.assertEqual(first["removed_duplicate_metadata"], 1)
            self.assertFalse(second["changed_metadata"])

    def test_binary_manifest_string_pool_utf8_and_utf16(self) -> None:
        values = [
            "com.google.android.gms.permission.AD_ID",
            "firebase_analytics_collection_enabled",
            "com.unity3d.ads.AdActivity",
        ]
        for use_utf8 in (True, False):
            with self.subTest(utf8=use_utf8):
                self.assertEqual(axml_strings(_string_pool(values, use_utf8)), set(values))

    def test_privacy_audit_reports_known_sdk_and_manifest_signatures(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            apk_path = Path(temp) / "base.apk"
            with zipfile.ZipFile(apk_path, "w") as apk:
                apk.writestr(
                    "AndroidManifest.xml",
                    _string_pool(
                        [
                            "com.google.android.gms.permission.AD_ID",
                            "firebase_analytics_collection_enabled",
                            "com.unity3d.ads.AdActivity",
                        ],
                        True,
                    ),
                )
                apk.writestr(
                    "classes.dex",
                    b"Lcom/google/android/gms/ads/AdView;"
                    b"Lcom/google/firebase/analytics/FirebaseAnalytics;",
                )
            report = "\n".join(audit(apk_path))
            self.assertIn("Google Mobile Ads", report)
            self.assertIn("Firebase Analytics", report)
            self.assertIn("AD_ID", report)
            self.assertIn("com.unity3d.ads.AdActivity", report)
            self.assertIn("firebase_analytics_collection_enabled", report)


class SmaliPatchTests(unittest.TestCase):
    def test_only_app_owned_void_ad_telemetry_calls_are_removed(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            app = root / "smali_classes2/com/vkontakte/android/Tracker.smali"
            app.parent.mkdir(parents=True)
            app.write_text(
                ".class public Lcom/vkontakte/android/Tracker;\n"
                ".super Ljava/lang/Object;\n"
                ".method public initialize()V\n"
                "    .locals 1\n"
                "    invoke-static {v0}, Lcom/my/tracker/MyTracker;->trackEvent()V\n"
                "    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;)V\n"
                "    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;\n"
                "    move-result-object v0\n"
                "    return-void\n"
                ".end method\n",
                encoding="utf-8",
            )
            auth = root / "smali/com/vkontakte/android/Auth.smali"
            auth.parent.mkdir(parents=True)
            auth.write_text(
                ".class public Lcom/vkontakte/android/Auth;\n"
                ".super Ljava/lang/Object;\n"
                ".method public login()V\n"
                "    .locals 1\n"
                "    invoke-static {v0}, Lcom/google/android/gms/auth/GoogleAuthUtil;->getToken(Landroid/content/Context;)Ljava/lang/String;\n"
                "    return-void\n"
                ".end method\n",
                encoding="utf-8",
            )
            sdk = root / "smali/com/my/tracker/MyTracker.smali"
            sdk.parent.mkdir(parents=True)
            sdk.write_text(
                ".class public Lcom/my/tracker/MyTracker;\n"
                ".super Ljava/lang/Object;\n"
                ".method public static trackEvent()V\n"
                "    .locals 0\n"
                "    return-void\n"
                ".end method\n",
                encoding="utf-8",
            )

            result = patch_tree(root, require_patches=True)
            patched = app.read_text(encoding="utf-8")
            self.assertNotIn("->trackEvent()V", patched)
            self.assertNotIn("->initialize(Landroid/content/Context;)V", patched)
            self.assertIn("->getInstance(Landroid/content/Context;)", patched)
            self.assertIn("GoogleAuthUtil;->getToken", auth.read_text(encoding="utf-8"))
            self.assertIn(".method public static trackEvent()V", sdk.read_text(encoding="utf-8"))
            self.assertEqual(result["total_patched"], 2)
            self.assertEqual(result["remaining_nonvoid_by_sdk"]["Firebase Analytics"], 1)
            self.assertIn("FirebaseAnalytics::getInstance", result["retained_call_names"]["Firebase Analytics"][0])


if __name__ == "__main__":
    unittest.main()
