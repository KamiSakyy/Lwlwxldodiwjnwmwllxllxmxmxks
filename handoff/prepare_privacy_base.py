#!/usr/bin/env python3
"""Decode, privacy-patch, and rebuild the APKPure base APK with Apktool."""

from __future__ import annotations

import argparse
import os
import shutil
import subprocess
import sys
import tempfile
import zipfile
from pathlib import Path

try:
    from .apply_privacy_manifest import ANALYTICS_OPTOUTS, patch_manifest
    from .build_arm_xapk import apk_metadata
    from .patch_smali_sdk_calls import patch_tree
    from .audit_privacy_footprint import axml_strings
except ImportError:
    from apply_privacy_manifest import ANALYTICS_OPTOUTS, patch_manifest
    from build_arm_xapk import apk_metadata
    from patch_smali_sdk_calls import patch_tree
    from audit_privacy_footprint import axml_strings


def run_tool(command: list[str], label: str) -> None:
    result = subprocess.run(command, text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    if result.returncode:
        tail = "\n".join(result.stdout.splitlines()[-16:])
        raise RuntimeError(
            f"{label} failed (exit {result.returncode})"
            + (f":\n{tail}" if tail else "")
        )


def manifest_identity(path: Path) -> tuple[str | None, str | None, str | None, str | None]:
    import xml.etree.ElementTree as ET

    android = "{http://schemas.android.com/apk/res/android}"
    root = ET.parse(path).getroot()
    return (
        root.attrib.get("package"),
        root.attrib.get(android + "versionName"),
        root.attrib.get(android + "versionCode"),
        root.attrib.get(android + "versionCodeMajor"),
    )


def validate_manifest_xml(path: Path) -> None:
    import xml.etree.ElementTree as ET

    android = "{http://schemas.android.com/apk/res/android}"
    root = ET.parse(path).getroot()
    if root.attrib.get("package") != "com.vkontakte.android":
        raise ValueError(f"decoded package ID changed: {root.attrib.get('package', '(missing)')}")
    app = next((element for element in root if element.tag.rsplit("}", 1)[-1] == "application"), None)
    if app is None:
        raise ValueError("rebuilt manifest has no application element")
    metadata = {
        element.attrib.get(android + "name"): element.attrib.get(android + "value")
        for element in app
        if element.tag.rsplit("}", 1)[-1] == "meta-data"
    }
    missing = [name for name, value in ANALYTICS_OPTOUTS.items() if metadata.get(name) != value]
    if missing:
        raise ValueError("privacy opt-out metadata failed validation: " + ", ".join(missing))


def prepare(source_apk: Path, output_apk: Path, apktool_jar: Path, work_parent: Path) -> dict[str, object]:
    if not source_apk.is_file():
        raise ValueError(f"source base APK is missing: {source_apk}")
    if not apktool_jar.is_file():
        raise ValueError(f"Apktool JAR is missing: {apktool_jar}")
    work_parent.mkdir(parents=True, exist_ok=True)
    output_apk.parent.mkdir(parents=True, exist_ok=True)
    original_abis, original_dex_count = apk_metadata(source_apk)

    with tempfile.TemporaryDirectory(prefix="vk-privacy-base-", dir=work_parent) as temp_name:
        temp = Path(temp_name)
        decoded = temp / "decoded"
        unsigned = temp / "rebuilt-unsigned.apk"
        run_tool(
            ["java", "-Xmx5g", "-jar", str(apktool_jar), "d", "-f", "-o", str(decoded), str(source_apk)],
            "Apktool decode",
        )
        manifest_path = decoded / "AndroidManifest.xml"
        original_identity = manifest_identity(manifest_path)
        manifest_result = patch_manifest(manifest_path)
        validate_manifest_xml(manifest_path)
        if manifest_identity(manifest_path) != original_identity:
            raise ValueError("privacy patch unexpectedly changed package or version metadata")
        smali_result = patch_tree(decoded, require_patches=True)
        run_tool(
            ["java", "-Xmx5g", "-jar", str(apktool_jar), "b", str(decoded), "-o", str(unsigned)],
            "Apktool rebuild",
        )
        if not unsigned.is_file():
            raise RuntimeError("Apktool reported success but emitted no rebuilt base APK")
        if not zipfile.is_zipfile(unsigned):
            raise ValueError("Apktool output is not a valid APK/ZIP container")
        with zipfile.ZipFile(unsigned) as archive:
            corrupt = archive.testzip()
            if corrupt is not None:
                raise ValueError(f"rebuilt base APK failed ZIP CRC validation at {corrupt}")
            if "AndroidManifest.xml" not in archive.namelist():
                raise ValueError("rebuilt base APK has no AndroidManifest.xml")
            manifest_strings = axml_strings(archive.read("AndroidManifest.xml"))
        # Boolean values are encoded as typed AXML attributes, not string-pool entries.
        required_values = set(ANALYTICS_OPTOUTS) | {"com.vkontakte.android"}
        missing_values = sorted(required_values - manifest_strings)
        if missing_values:
            raise ValueError("rebuilt binary manifest is missing required privacy/package strings: " + ", ".join(missing_values))
        if "com.google.android.gms.permission.AD_ID" in manifest_strings:
            raise ValueError("rebuilt binary manifest still declares the advertising ID permission")
        rebuilt_abis, rebuilt_dex_count = apk_metadata(unsigned)
        if rebuilt_dex_count != original_dex_count:
            raise ValueError(
                f"Apktool changed the DEX split count ({original_dex_count} -> {rebuilt_dex_count})"
            )
        if rebuilt_abis != original_abis:
            raise ValueError("Apktool changed native ABI contents in the base APK")
        shutil.copyfile(unsigned, output_apk)

    return {
        "input_bytes": source_apk.stat().st_size,
        "output_bytes": output_apk.stat().st_size,
        "dex_count": original_dex_count,
        "manifest": manifest_result,
        "smali": smali_result,
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("source_base_apk", type=Path)
    parser.add_argument("output_base_apk", type=Path)
    parser.add_argument("--apktool-jar", type=Path, required=True)
    parser.add_argument("--work-dir", type=Path, required=True)
    args = parser.parse_args()
    try:
        result = prepare(args.source_base_apk, args.output_base_apk, args.apktool_jar, args.work_dir)
    except Exception as exc:
        message = f"privacy base build failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=Privacy APK rebuild::{escaped}")
        return 1

    manifest = result["manifest"]
    smali = result["smali"]
    print(f"Privacy-patched base APK: {result['input_bytes']} -> {result['output_bytes']} bytes")
    print(f"DEX split count retained: {result['dex_count']}")
    print(f"Firebase/Google collection opt-outs enforced: {manifest['optout_metadata_count']}")
    print(f"Ad manifest components removed: {len(manifest['removed_ad_components'])}")
    print(f"Analytics manifest components removed: {len(manifest['removed_tracking_components'])}")
    print(f"Advertising ID permission removed: {'yes' if manifest['removed_ad_id_permission'] else 'not declared'}")
    print(f"Direct void ad/analytics SDK calls removed: {smali['total_patched']}")
    counts = ", ".join(f"{name}={count}" for name, count in smali["patched_by_sdk"].items()) or "none"
    print(f"SDK call counts: {counts}")
    retained = ", ".join(f"{name}={count}" for name, count in smali["retained_nonvoid_by_sdk"].items()) or "none"
    print(f"Non-void SDK calls retained to avoid replacing return values: {retained}")

    if os.environ.get("GITHUB_ACTIONS") == "true":
        messages = [
            f"Privacy base APK bytes: {result['input_bytes']} -> {result['output_bytes']}",
            f"Opt-outs: {manifest['optout_metadata_count']}; ad manifest components removed: {len(manifest['removed_ad_components'])}; tracker components removed: {len(manifest['removed_tracking_components'])}",
            f"Direct void SDK calls removed: {smali['total_patched']} ({counts})",
            f"Non-void SDK calls retained: {retained}",
        ]
        for name, callsites in smali["callsite_names"].items():
            for callsite in callsites[:1]:
                messages.append(f"Patched method identifier ({name}): {callsite}")
                if len(messages) >= 14:
                    break
            if len(messages) >= 14:
                break
        for name, callsites in smali["retained_call_names"].items():
            for callsite in callsites[:1]:
                messages.append(f"Retained SDK method identifier ({name}): {callsite}")
                if len(messages) >= 20:
                    break
            if len(messages) >= 20:
                break
        for message in messages:
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::notice title=VK privacy build::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
