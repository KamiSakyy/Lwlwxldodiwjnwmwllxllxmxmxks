#!/usr/bin/env python3
"""Summarize APK members and ABI splits inside an XAPK without dumping content."""

from __future__ import annotations

import os
import re
import shutil
import sys
import tempfile
import zipfile
from pathlib import Path, PurePosixPath

DEX_NAME = re.compile(r"classes(?:\d+)?\.dex\Z")


def inner_apk_summary(outer: zipfile.ZipFile, member: zipfile.ZipInfo) -> tuple[str, list[str]]:
    """Stream one embedded APK to a temporary file and report safe metadata."""
    with tempfile.TemporaryFile() as temporary:
        with outer.open(member, "r") as source:
            shutil.copyfileobj(source, temporary, length=1024 * 1024)
        temporary.seek(0)
        with zipfile.ZipFile(temporary, "r") as apk:
            names = [name for name in apk.namelist() if not name.endswith("/")]
            abis = sorted(
                {
                    parts[1]
                    for name in names
                    if len(parts := name.split("/")) >= 3
                    and parts[0] == "lib"
                    and parts[-1].endswith(".so")
                }
            )
            dex_count = sum(1 for name in names if DEX_NAME.fullmatch(PurePosixPath(name).name))
            has_manifest = "AndroidManifest.xml" in names
            label = PurePosixPath(member.filename).name
            abi_label = ",".join(abis) if abis else "none"
            detail = (
                f"`{label}`: {member.file_size} bytes; "
                f"outer stored {member.compress_size} bytes; "
                f"ABI libraries={abi_label}; DEX files={dex_count}; "
                f"manifest={'yes' if has_manifest else 'no'}"
            )
            return detail, abis


def main() -> int:
    if len(sys.argv) != 2:
        print("usage: analyze_xapk_layout.py PACKAGE.xapk", file=sys.stderr)
        return 2
    path = Path(sys.argv[1])
    if not path.is_file():
        print("XAPK file is missing", file=sys.stderr)
        return 2

    try:
        with zipfile.ZipFile(path, "r") as outer:
            apk_members = [
                entry for entry in outer.infolist()
                if not entry.is_dir() and entry.filename.lower().endswith(".apk")
            ]
            if not apk_members:
                raise ValueError("XAPK contains no embedded APK files")
            details: list[str] = []
            for member in apk_members:
                detail, _ = inner_apk_summary(outer, member)
                details.append(detail)
    except (OSError, ValueError, zipfile.BadZipFile, RuntimeError) as exc:
        message = f"XAPK layout inspection failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=XAPK layout::{escaped}")
        return 1

    report = ["## XAPK embedded APK layout", "", *[f"- {detail}" for detail in details], ""]
    output = "\n".join(report)
    print(output)
    summary = os.environ.get("GITHUB_STEP_SUMMARY")
    if summary:
        with Path(summary).open("a", encoding="utf-8") as stream:
            stream.write(output)
    if os.environ.get("GITHUB_ACTIONS") == "true":
        for detail in details:
            escaped = detail.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::notice title=XAPK split layout::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
