#!/usr/bin/env python3
"""Merge ARMv7 native libraries, privacy-patch, and rebuild one standalone APK."""

from __future__ import annotations

import argparse
import hashlib
import io
import os
import shutil
import subprocess
import sys
import tempfile
import zipfile
from pathlib import Path, PurePosixPath

try:
    from .apply_privacy_manifest import ANALYTICS_OPTOUTS, SENSITIVE_PERMISSIONS, patch_manifest
    from .build_arm_xapk import apk_metadata, filename_abi
    from .optimize_abi_apk import native_abi
    from .prepare_apkpure_xapk import choose_base_apk
    from .patch_smali_sdk_calls import patch_tree
    from .audit_privacy_footprint import axml_declared_permissions, axml_strings
except ImportError:
    from apply_privacy_manifest import ANALYTICS_OPTOUTS, SENSITIVE_PERMISSIONS, patch_manifest
    from build_arm_xapk import apk_metadata, filename_abi
    from optimize_abi_apk import native_abi
    from prepare_apkpure_xapk import choose_base_apk
    from patch_smali_sdk_calls import patch_tree
    from audit_privacy_footprint import axml_declared_permissions, axml_strings


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
    split_attributes = ("split", android + "splitTypes", android + "requiredSplitTypes")
    if any(attribute in root.attrib for attribute in split_attributes):
        raise ValueError("standalone manifest still has split-specific attributes")
    if any(element.tag.rsplit("}", 1)[-1] == "uses-split" for element in root):
        raise ValueError("standalone manifest still declares uses-split")
    remaining_sensitive = sorted(
        child.attrib.get(android + "name")
        for child in root
        if child.tag.rsplit("}", 1)[-1].startswith("uses-permission")
        and child.attrib.get(android + "name") in SENSITIVE_PERMISSIONS
    )
    if remaining_sensitive:
        raise ValueError("sensitive permissions remain after patch: " + ", ".join(remaining_sensitive))
    app = next((element for element in root if element.tag.rsplit("}", 1)[-1] == "application"), None)
    if app is None:
        raise ValueError("rebuilt manifest has no application element")
    if any(attribute in app.attrib for attribute in (android + "isSplitRequired", android + "splitName", android + "isolatedSplits")):
        raise ValueError("standalone application still has split-specific attributes")
    if any(
        element.tag.rsplit("}", 1)[-1] == "meta-data"
        and element.attrib.get(android + "name", "").startswith("com.android.vending.splits")
        for element in app
    ):
        raise ValueError("standalone manifest still declares Play split metadata")
    metadata = {
        element.attrib.get(android + "name"): element.attrib.get(android + "value")
        for element in app
        if element.tag.rsplit("}", 1)[-1] == "meta-data"
    }
    missing = [name for name, value in ANALYTICS_OPTOUTS.items() if metadata.get(name) != value]
    if missing:
        raise ValueError("privacy opt-out metadata failed validation: " + ", ".join(missing))


def _sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def merge_abi_split(source_xapk: Path, source_apk: Path, decoded: Path, keep_abi: str) -> dict[str, int]:
    if not source_xapk.is_file():
        raise ValueError(f"source XAPK is missing: {source_xapk}")
    local_base_digest = _sha256(source_apk)
    selected_base_digest: str | None = None
    copied_libs = 0
    copied_bytes = 0

    with zipfile.ZipFile(source_xapk, "r") as bundle:
        apk_members = [info for info in bundle.infolist() if not info.is_dir() and info.filename.lower().endswith(".apk")]
        base_member = choose_base_apk([info.filename for info in apk_members])
        for member in apk_members:
            if member.filename == base_member:
                digest = hashlib.sha256()
                with bundle.open(member, "r") as stream:
                    for chunk in iter(lambda: stream.read(1024 * 1024), b""):
                        digest.update(chunk)
                selected_base_digest = digest.hexdigest()
                continue
            if filename_abi(member.filename) != keep_abi:
                continue
            try:
                with zipfile.ZipFile(io.BytesIO(bundle.read(member)), "r") as split:
                    for name in split.namelist():
                        if native_abi(name) != keep_abi:
                            continue
                        relative = PurePosixPath(name)
                        if relative.is_absolute() or ".." in relative.parts:
                            raise ValueError(f"unsafe native library path in ABI split: {relative.name}")
                        destination = decoded.joinpath(*relative.parts)
                        destination.parent.mkdir(parents=True, exist_ok=True)
                        data = split.read(name)
                        if destination.exists():
                            if destination.read_bytes() != data:
                                raise ValueError(f"conflicting native library in APK splits: {relative.name}")
                            continue
                        destination.write_bytes(data)
                        copied_libs += 1
                        copied_bytes += len(data)
            except zipfile.BadZipFile as exc:
                raise ValueError(f"ABI split is not a valid APK: {PurePosixPath(member.filename).name}") from exc

    if selected_base_digest != local_base_digest:
        raise ValueError("extracted base APK does not match the base member of the supplied XAPK")
    if copied_libs == 0:
        raise ValueError(f"XAPK has no native libraries for the requested standalone ABI {keep_abi}")
    return {"native_libraries": copied_libs, "native_library_bytes": copied_bytes}


def prepare(
    source_apk: Path,
    output_apk: Path,
    apktool_jar: Path,
    work_parent: Path,
    source_xapk: Path,
    keep_abi: str,
) -> dict[str, object]:
    if not source_apk.is_file():
        raise ValueError(f"source base APK is missing: {source_apk}")
    if not apktool_jar.is_file():
        raise ValueError(f"Apktool JAR is missing: {apktool_jar}")
    work_parent.mkdir(parents=True, exist_ok=True)
    output_apk.parent.mkdir(parents=True, exist_ok=True)
    _, original_dex_count = apk_metadata(source_apk)

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
        native_result = merge_abi_split(source_xapk, source_apk, decoded, keep_abi)
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
            binary_manifest = archive.read("AndroidManifest.xml")
            manifest_strings = axml_strings(binary_manifest)
        # Boolean values are encoded as typed AXML attributes, not string-pool entries.
        required_values = set(ANALYTICS_OPTOUTS) | {"com.vkontakte.android"}
        missing_values = sorted(required_values - manifest_strings)
        if missing_values:
            raise ValueError("rebuilt binary manifest is missing required privacy/package strings: " + ", ".join(missing_values))
        declared_permissions = axml_declared_permissions(binary_manifest)
        if declared_permissions is None:
            raise ValueError("rebuilt binary manifest has no parseable AXML element structure")
        remaining_sensitive = sorted(set(SENSITIVE_PERMISSIONS) & declared_permissions)
        if remaining_sensitive:
            raise ValueError("rebuilt binary manifest still declares sensitive permissions: " + ", ".join(remaining_sensitive))
        rebuilt_abis, rebuilt_dex_count = apk_metadata(unsigned)
        if rebuilt_dex_count != original_dex_count:
            raise ValueError(
                f"Apktool changed the DEX split count ({original_dex_count} -> {rebuilt_dex_count})"
            )
        expected_abis = {keep_abi}
        if rebuilt_abis != expected_abis:
            raise ValueError(
                "standalone APK does not contain exactly the requested native ABI "
                f"({', '.join(sorted(expected_abis))}): {', '.join(sorted(rebuilt_abis)) or 'none'}"
            )
        shutil.copyfile(unsigned, output_apk)

    return {
        "input_bytes": source_apk.stat().st_size,
        "output_bytes": output_apk.stat().st_size,
        "dex_count": original_dex_count,
        "manifest": manifest_result,
        "smali": smali_result,
        "native": native_result,
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("source_base_apk", type=Path)
    parser.add_argument("output_base_apk", type=Path)
    parser.add_argument("--apktool-jar", type=Path, required=True)
    parser.add_argument("--work-dir", type=Path, required=True)
    parser.add_argument("--source-xapk", type=Path, required=True)
    parser.add_argument("--keep-abi", default="armeabi-v7a")
    args = parser.parse_args()
    try:
        result = prepare(
            args.source_base_apk,
            args.output_base_apk,
            args.apktool_jar,
            args.work_dir,
            args.source_xapk,
            args.keep_abi,
        )
    except Exception as exc:
        message = f"privacy base build failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=Privacy APK rebuild::{escaped}")
        return 1

    manifest = result["manifest"]
    smali = result["smali"]
    native_result = result["native"]
    print(f"Privacy-patched standalone APK: {result['input_bytes']} -> {result['output_bytes']} bytes")
    print(f"DEX files retained: {result['dex_count']}")
    print(f"ARMv7 native libraries merged from source split: {result['native']['native_libraries']} ({result['native']['native_library_bytes']} bytes)")
    print(f"Known analytics/ad SDK opt-out metadata enforced: {manifest['optout_metadata_count']}")
    print(f"Ad manifest components removed: {len(manifest['removed_ad_components'])}")
    print(f"Analytics manifest components removed: {len(manifest['removed_tracking_components'])}")
    print(f"Sensitive permissions removed: {len(manifest['removed_sensitive_permissions'])}")
    print(f"Split-only manifest markers removed: {manifest['removed_split_markers']}")
    print(f"Direct void ad/analytics SDK calls removed: {smali['total_patched']}")
    counts = ", ".join(f"{name}={count}" for name, count in smali["patched_by_sdk"].items()) or "none"
    print(f"SDK call counts: {counts}")
    retained = ", ".join(f"{name}={count}" for name, count in smali["retained_nonvoid_by_sdk"].items()) or "none"
    print(f"Non-void SDK calls retained to avoid replacing return values: {retained}")

    if os.environ.get("GITHUB_ACTIONS") == "true":
        messages = [
            f"Privacy standalone APK bytes: {result['input_bytes']} -> {result['output_bytes']}",
            f"ARMv7 native libraries merged: {native_result['native_libraries']} files ({native_result['native_library_bytes']} bytes)",
            f"SDK opt-outs: {manifest['optout_metadata_count']}; sensitive permissions removed: {len(manifest['removed_sensitive_permissions'])}; split markers removed: {manifest['removed_split_markers']}; ad components removed: {len(manifest['removed_ad_components'])}; tracker components removed: {len(manifest['removed_tracking_components'])}",
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
