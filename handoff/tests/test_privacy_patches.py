from __future__ import annotations

import io
import struct
import tempfile
import unittest
import xml.etree.ElementTree as ET
import zipfile
from pathlib import Path

from handoff.apply_privacy_manifest import ANALYTICS_OPTOUTS, ANDROID, SENSITIVE_PERMISSIONS, patch_manifest
from handoff.audit_privacy_footprint import audit, axml_declared_permissions, axml_strings
from handoff.patch_smali_sdk_calls import patch_tree
from handoff.prepare_privacy_base import merge_abi_split


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


def _binary_manifest(strings: list[str], permissions: list[str], utf8: bool = True) -> bytes:
    android_ns = "http://schemas.android.com/apk/res/android"
    values = list(dict.fromkeys([*strings, "manifest", "uses-permission", "name", android_ns, *permissions]))
    indices = {value: index for index, value in enumerate(values)}
    data = bytearray(_string_pool(values, utf8))

    def start_element(name: str, attrs: list[tuple[str, str, str]]) -> bytes:
        attribute_size = 20
        chunk_size = 16 + 20 + attribute_size * len(attrs)
        chunk = bytearray(struct.pack("<HHIII", 0x0102, 16, chunk_size, 1, 0xFFFFFFFF))
        chunk.extend(struct.pack("<IIHHHHHH", 0xFFFFFFFF, indices[name], 20, attribute_size, len(attrs), 0, 0, 0))
        for namespace, attr_name, value in attrs:
            namespace_index = indices[namespace] if namespace else 0xFFFFFFFF
            value_index = indices[value]
            chunk.extend(struct.pack("<IIIHBBI", namespace_index, indices[attr_name], value_index, 8, 0, 0x03, value_index))
        return bytes(chunk)

    data.extend(start_element("manifest", []))
    for permission in permissions:
        data.extend(start_element("uses-permission", [(android_ns, "name", permission)]))
    struct.pack_into("<I", data, 4, len(data))
    return bytes(data)


class PrivacyManifestTests(unittest.TestCase):
    def test_manifest_optouts_are_idempotent_and_preserve_core_components(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            manifest = Path(temp) / "AndroidManifest.xml"
            manifest.write_text(
                '<manifest xmlns:android="http://schemas.android.com/apk/res/android" '
                'package="com.vkontakte.android" split="config.en" android:splitTypes="lang" '
                'android:requiredSplitTypes="lang" >'
                '<uses-split android:name="config.en"/>'
                '<uses-permission android:name="com.google.android.gms.permission.AD_ID"/>'
                '<uses-permission android:name="android.permission.READ_PHONE_STATE"/>'
                '<uses-permission android:name="android.permission.READ_PHONE_NUMBERS"/>'
                '<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>'
                '<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>'
                '<uses-permission android:name="android.permission.GET_ACCOUNTS"/>'
                '<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES"/>'
                '<application android:isSplitRequired="true">'
                '<meta-data android:name="com.android.vending.splits.required" android:value="true"/>'
                '<activity android:name="com.unity3d.ads.AdActivity"/>'
                '<activity android:name="com.yandex.mobile.ads.common.AdActivity"/>'
                '<provider android:name="com.my.tracker.MyTrackerProvider"/>'
                '<provider android:name="com.google.firebase.provider.FirebaseInitProvider"/>'
                '<activity android:name="com.vkontakte.android.MainActivity"/>'
                '<meta-data android:name="firebase_analytics_collection_enabled" android:value="true"/>'
                '<meta-data android:name="firebase_analytics_collection_enabled" android:value="true"/>'
                '<meta-data android:name="com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION" android:value="true"/>'
                '<meta-data android:name="com.yandex.mobile.ads.APPMETRICA_ANALYTICS_ENABLED" android:value="true"/>'
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
            self.assertNotIn("split", root.attrib)
            self.assertNotIn(ANDROID + "splitTypes", root.attrib)
            self.assertNotIn(ANDROID + "requiredSplitTypes", root.attrib)
            self.assertNotIn(ANDROID + "isSplitRequired", app.attrib)
            self.assertFalse(any(item.tag.endswith("uses-split") for item in root))
            self.assertFalse(any(item.attrib.get(ANDROID + "name", "").startswith("com.android.vending.splits") for item in app))
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
            self.assertNotIn("com.yandex.mobile.ads.common.AdActivity", components)
            self.assertNotIn("com.my.tracker.MyTrackerProvider", components)
            self.assertIn("com.google.firebase.provider.FirebaseInitProvider", components)
            remaining_permissions = {
                item.attrib.get(ANDROID + "name") for item in root
                if item.tag.endswith("uses-permission")
            }
            self.assertFalse(set(SENSITIVE_PERMISSIONS) & remaining_permissions)
            self.assertEqual(set(first["removed_sensitive_permissions"]), set(SENSITIVE_PERMISSIONS))
            self.assertIn("com.vkontakte.android.MainActivity", components)
            self.assertEqual(first["removed_duplicate_metadata"], 1)
            self.assertGreater(first["removed_split_markers"], 0)
            self.assertFalse(second["changed_metadata"])
            self.assertEqual(second["removed_split_markers"], 0)

    def test_binary_manifest_string_pool_utf8_and_utf16(self) -> None:
        values = [
            "com.google.android.gms.permission.AD_ID",
            "firebase_analytics_collection_enabled",
            "com.unity3d.ads.AdActivity",
        ]
        for use_utf8 in (True, False):
            with self.subTest(utf8=use_utf8):
                self.assertEqual(axml_strings(_string_pool(values, use_utf8)), set(values))

    def test_binary_manifest_permissions_are_parsed_from_elements_not_unused_pool_entries(self) -> None:
        ad_id = "com.google.android.gms.permission.AD_ID"
        removed_permission_pool_entry = "android.permission.READ_PHONE_STATE"
        manifest = _binary_manifest([removed_permission_pool_entry], [ad_id])
        self.assertIn(removed_permission_pool_entry, axml_strings(manifest))
        self.assertEqual(axml_declared_permissions(manifest), {ad_id})

    def test_privacy_audit_reports_known_sdk_and_manifest_signatures(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            apk_path = Path(temp) / "base.apk"
            with zipfile.ZipFile(apk_path, "w") as apk:
                apk.writestr(
                    "AndroidManifest.xml",
                    _binary_manifest(
                        [
                            "com.google.android.gms.permission.AD_ID",
                            "firebase_analytics_collection_enabled",
                            "com.unity3d.ads.AdActivity",
                            "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION",
                            "com.yandex.mobile.ads.common.AdActivity",
                        ],
                        ["com.google.android.gms.permission.AD_ID"],
                        True,
                    ),
                )
                apk.writestr(
                    "classes.dex",
                    b"Lcom/google/android/gms/ads/AdView;"
                    b"Lcom/google/firebase/analytics/FirebaseAnalytics;"
                    b"Lcom/yandex/mobile/ads/common/AdActivity;",
                )
            report = "\n".join(audit(apk_path))
            self.assertIn("Google Mobile Ads", report)
            self.assertIn("Firebase Analytics", report)
            self.assertIn("AD_ID", report)
            self.assertIn("com.unity3d.ads.AdActivity", report)
            self.assertIn("Yandex Mobile Ads", report)
            self.assertIn("com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION", report)
            self.assertIn("firebase_analytics_collection_enabled", report)


class StandaloneApkTests(unittest.TestCase):
    def test_matching_abi_libraries_are_merged_from_xapk(self) -> None:
        with tempfile.TemporaryDirectory() as temp:
            root = Path(temp)
            base_buffer = io.BytesIO()
            with zipfile.ZipFile(base_buffer, "w") as base:
                base.writestr("AndroidManifest.xml", b"manifest")
                base.writestr("classes.dex", b"dex")
            split_buffer = io.BytesIO()
            with zipfile.ZipFile(split_buffer, "w") as split:
                split.writestr("lib/armeabi-v7a/libsample.so", b"native-lib")
                split.writestr("lib/x86/libignored.so", b"other-abi")
            xapk = root / "source.xapk"
            with zipfile.ZipFile(xapk, "w") as bundle:
                bundle.writestr("com.vkontakte.android.apk", base_buffer.getvalue())
                bundle.writestr("config.armeabi_v7a.apk", split_buffer.getvalue())
            base_apk = root / "base.apk"
            base_apk.write_bytes(base_buffer.getvalue())
            decoded = root / "decoded"
            decoded.mkdir()

            result = merge_abi_split(xapk, base_apk, decoded, "armeabi-v7a")
            self.assertEqual(result["native_libraries"], 1)
            self.assertEqual(result["native_library_bytes"], len(b"native-lib"))
            self.assertEqual((decoded / "lib/armeabi-v7a/libsample.so").read_bytes(), b"native-lib")
            self.assertFalse((decoded / "lib/x86/libignored.so").exists())


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
                "    invoke-static {v0}, Lcom/yandex/mobile/ads/common/MobileAds;->initialize(Landroid/content/Context;)V\n"
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
            self.assertNotIn("Lcom/yandex/mobile/ads/common/MobileAds;->initialize", patched)
            self.assertEqual(result["patched_by_sdk"]["Yandex Mobile Ads"], 1)
            self.assertIn("->getInstance(Landroid/content/Context;)", patched)
            self.assertIn("GoogleAuthUtil;->getToken", auth.read_text(encoding="utf-8"))
            self.assertIn(".method public static trackEvent()V", sdk.read_text(encoding="utf-8"))
            self.assertEqual(result["total_patched"], 3)
            self.assertEqual(result["remaining_nonvoid_by_sdk"]["Firebase Analytics"], 1)
            self.assertIn("FirebaseAnalytics::getInstance", result["retained_call_names"]["Firebase Analytics"][0])


if __name__ == "__main__":
    unittest.main()
