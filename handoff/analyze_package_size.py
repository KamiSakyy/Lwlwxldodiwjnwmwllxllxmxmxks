#!/usr/bin/env python3
"""Report ZIP/APK size composition without exposing source or string contents."""

from __future__ import annotations

import os
import sys
import zipfile
from collections import defaultdict
from pathlib import Path


def category(name: str) -> str:
    if name.endswith(".dex") and Path(name).name.startswith("classes"):
        return "DEX bytecode"
    if name.startswith("assets/"):
        return "assets"
    if name.startswith("res/") or name == "resources.arsc":
        return "Android resources"
    if name.startswith("lib/"):
        return "native libraries"
    if name.startswith("META-INF/"):
        return "signing metadata"
    return "other"


def report(path: Path) -> tuple[list[str], str]:
    with zipfile.ZipFile(path) as archive:
        files = [entry for entry in archive.infolist() if not entry.is_dir()]
    groups: dict[str, list[int]] = defaultdict(lambda: [0, 0, 0])
    for entry in files:
        values = groups[category(entry.filename)]
        values[0] += entry.file_size
        values[1] += entry.compress_size
        values[2] += 1

    lines = [
        f"### `{path.name}`",
        f"- Container bytes: {path.stat().st_size}",
        f"- ZIP entries: {len(files)}",
        "- Category totals (uncompressed / stored bytes; file count):",
    ]
    for name, (raw_bytes, zipped_bytes, count) in sorted(
        groups.items(), key=lambda item: item[1][1], reverse=True
    ):
        lines.append(f"  - {name}: {raw_bytes} / {zipped_bytes} bytes; {count} files")
    lines.append("- Largest entries by stored size:")
    largest = sorted(files, key=lambda item: item.compress_size, reverse=True)[:15]
    for entry in largest:
        lines.append(f"  - `{entry.filename}`: {entry.compress_size} bytes stored")
    lines.append("")

    category_summary = ", ".join(
        f"{name}={values[1]}B/{values[2]} files"
        for name, values in sorted(groups.items(), key=lambda item: item[1][1], reverse=True)
    )
    largest_summary = "; ".join(
        f"{entry.filename}={entry.compress_size}B" for entry in largest[:6]
    )
    compact = (
        f"{path.name}: {path.stat().st_size}B; {category_summary}; "
        f"largest entries: {largest_summary}"
    )
    return lines, compact


def main() -> int:
    if len(sys.argv) < 2:
        print("usage: analyze_package_size.py ARCHIVE [ARCHIVE ...]", file=sys.stderr)
        return 2
    report_lines = ["# APKPure package size audit", ""]
    compact_reports: list[str] = []
    for value in sys.argv[1:]:
        path = Path(value)
        if not path.is_file():
            print(f"Missing package archive: {path.name}", file=sys.stderr)
            return 2
        try:
            detailed, compact = report(path)
            report_lines.extend(detailed)
            compact_reports.append(compact)
        except (OSError, zipfile.BadZipFile) as exc:
            print(f"Cannot inspect {path.name}: {type(exc).__name__}", file=sys.stderr)
            return 1
    output = "\n".join(report_lines)
    print(output)
    summary = os.environ.get("GITHUB_STEP_SUMMARY")
    if summary:
        with Path(summary).open("a", encoding="utf-8") as stream:
            stream.write(output)
    if os.environ.get("GITHUB_ACTIONS") == "true":
        for message in compact_reports:
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::notice title=APK size breakdown::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
