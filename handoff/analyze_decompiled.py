#!/usr/bin/env python3
"""Produce a small metadata-only report from a temporary JADX output tree.

Never prints source lines, string literal values, tokens, or credentials. Intended
for the public Actions summary; the APK and decompiled tree stay on the runner.
"""

from __future__ import annotations

import hashlib
import os
import re
import sys
import zipfile
from collections import Counter
from pathlib import Path
import xml.etree.ElementTree as ET

ANDROID_NS = "{http://schemas.android.com/apk/res/android}"
AUTH_TERMS = re.compile(r"auth|oauth|login|session|vkid|passport|qr.?code", re.IGNORECASE)
AUTH_URLS = {
    "oauth.vk.com": re.compile(r"oauth\.vk\.com", re.IGNORECASE),
    "id.vk.com": re.compile(r"id\.vk\.com", re.IGNORECASE),
    "api.vk.com": re.compile(r"api\.vk\.com", re.IGNORECASE),
}
CLASS_DECL = re.compile(r"\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)")


def sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def find_manifest(root: Path) -> Path | None:
    candidates = list(root.rglob("AndroidManifest.xml"))
    for candidate in candidates:
        if "resources" in candidate.parts:
            return candidate
    return candidates[0] if candidates else None


def main() -> int:
    if len(sys.argv) != 3:
        print("usage: analyze_decompiled.py JADX_OUTPUT APK", file=sys.stderr)
        return 2

    root = Path(sys.argv[1])
    apk = Path(sys.argv[2])
    if not root.is_dir() or not apk.is_file():
        print("JADX output or APK is missing", file=sys.stderr)
        return 2

    manifest_path = find_manifest(root)
    if manifest_path is None:
        print("JADX did not emit a decoded AndroidManifest.xml", file=sys.stderr)
        return 1
    manifest_summary = ["Manifest: parse failed"]
    package_name = version_name = version_code = None
    permissions: list[str] = []
    exported_components: list[str] = []

    if manifest_path:
        try:
            manifest = ET.parse(manifest_path).getroot()
            package_name = manifest.attrib.get("package", "unknown")
            version_name = manifest.attrib.get(ANDROID_NS + "versionName", "unknown")
            version_code = manifest.attrib.get(ANDROID_NS + "versionCode", "unknown")
            for item in manifest.findall("uses-permission"):
                name = item.attrib.get(ANDROID_NS + "name")
                if name:
                    permissions.append(name)
            app = manifest.find("application")
            if app is not None:
                for tag in ("activity", "activity-alias", "service", "receiver", "provider"):
                    for component in app.findall(tag):
                        if component.attrib.get(ANDROID_NS + "exported") == "true":
                            name = component.attrib.get(ANDROID_NS + "name")
                            if name:
                                exported_components.append(f"{tag}: {name}")
            if package_name != "com.vkontakte.android":
                print(f"Unexpected package ID: {package_name}", file=sys.stderr)
                return 1
            if not version_name or version_name == "unknown" or not version_code:
                print("APK manifest is missing a version name or version code", file=sys.stderr)
                return 1
            manifest_summary = [
                f"- Package: `{package_name}`",
                f"- Version: `{version_name}` (code `{version_code}`)",
                f"- Declared permissions: {len(permissions)}",
                f"- Exported components: {len(exported_components)}",
            ]
        except (ET.ParseError, OSError) as exc:
            manifest_summary = [f"Manifest parse failed: {type(exc).__name__}"]

    try:
        with zipfile.ZipFile(apk) as archive:
            dex_files = sorted(
                name for name in archive.namelist()
                if re.fullmatch(r"classes(?:\d+)?\.dex", Path(name).name)
            )
            native_libs = [
                name for name in archive.namelist()
                if name.startswith("lib/") and name.endswith(".so")
            ]
    except (OSError, zipfile.BadZipFile):
        dex_files, native_libs = [], []

    source_root = root / "sources"
    java_files = list(source_root.rglob("*.java")) if source_root.is_dir() else []
    auth_files: list[tuple[int, str, str]] = []
    host_counts: Counter[str] = Counter()
    package_counts: Counter[str] = Counter()

    for path in java_files:
        relative = path.relative_to(source_root)
        parts = relative.parts
        if parts:
            package_counts[".".join(parts[: min(3, len(parts) - 1)])] += 1
        try:
            text = path.read_text(encoding="utf-8", errors="ignore")
        except OSError:
            continue
        for hostname, pattern in AUTH_URLS.items():
            host_counts[hostname] += len(pattern.findall(text))
        path_match = bool(AUTH_TERMS.search(path.name) or AUTH_TERMS.search(str(relative)))
        term_matches = len(AUTH_TERMS.findall(text))
        if path_match or term_matches:
            declarations = CLASS_DECL.findall(text)
            class_name = declarations[0] if declarations else path.stem
            score = (100 if path_match else 0) + min(term_matches, 50)
            auth_files.append((score, str(relative), class_name))

    auth_files.sort(key=lambda item: (-item[0], item[1].lower()))
    candidates = auth_files[:20]
    top_packages = package_counts.most_common(8)
    partial_decompilation = os.environ.get("JADX_INCOMPLETE", "false").lower() == "true"
    completion_note = (
        "partial; JADX exited nonzero, so findings cover emitted files only"
        if partial_decompilation
        else "complete; JADX exited successfully"
    )

    report = [
        "# VK APK — temporary static-review summary",
        "",
        "> Generated from a temporary Actions runner. No APK or source artifact was uploaded.",
        "",
        "## Download and integrity",
        f"- APK SHA-256: `{sha256_file(apk)}`",
        f"- DEX files: {len(dex_files)}",
        f"- Native libraries: {len(native_libs)}",
        "",
        "## Manifest",
        *manifest_summary,
        "",
        "## Decompiled tree",
        f"- Java files emitted by JADX: {len(java_files)}",
        f"- Decompilation status: {completion_note}",
        f"- Files matching auth/login/session/QR naming or source terms: {len(auth_files)}",
        f"- OAuth/API host references (occurrence counts only): "
        + ", ".join(f"`{name}` {host_counts[name]}" for name in AUTH_URLS),
        "",
    ]

    if candidates:
        report += ["## Candidate auth/session files (names only)"]
        report += [f"- `{path}` (class `{class_name}`)" for _, path, class_name in candidates]
        report.append("")

    if top_packages:
        report += ["## Largest source package groups (counts)"]
        report += [f"- `{name}`: {count}" for name, count in top_packages]
        report.append("")

    if permissions:
        report += ["## Permission names"]
        report += [f"- `{permission}`" for permission in sorted(permissions)]
        report.append("")

    if exported_components:
        report += ["## Exported component names (first 20)"]
        report += [f"- `{component}`" for component in sorted(exported_components)[:20]]
        report.append("")

    report += [
        "## Handling note",
        "This report intentionally contains no source snippets, string literal values, tokens, or APK/decompiled files.",
        "",
    ]
    output = "\n".join(report)
    print(output)
    github_summary = os.environ.get("GITHUB_STEP_SUMMARY")
    if github_summary:
        with Path(github_summary).open("a", encoding="utf-8") as stream:
            stream.write(output)

    # Keep a few non-sensitive facts available as Check Run annotations too;
    # raw Actions log retrieval is not always available to this workspace.
    if os.environ.get("GITHUB_ACTIONS") == "true":
        notice_messages = [
            f"Package: {package_name}; version: {version_name}; code: {version_code}",
            f"DEX files: {len(dex_files)}; native libraries: {len(native_libs)}",
            f"Java files: {len(java_files)}; decompilation status: {completion_note}",
            f"Auth/session candidate count: {len(auth_files)}",
            "OAuth/API reference counts: " + ", ".join(
                f"{name}={host_counts[name]}" for name in AUTH_URLS
            ),
        ]
        notice_messages.extend(
            f"Candidate source name only: {relative} (class {class_name})"
            for _, relative, class_name in candidates
        )
        for message in notice_messages:
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::notice title=VK APK metadata::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
