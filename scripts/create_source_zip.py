#!/usr/bin/env python3
"""Create a clean source archive without the unrelated repository attachments/build outputs."""
from __future__ import annotations

import sys
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
TOP_LEVEL_FILES = {
    ".gitignore",
    "README.md",
    "settings.gradle",
    "build.gradle",
    "gradle.properties",
}
SOURCE_DIRS = {".github", "app", "template", "pythonTemplate", "scripts", "handoff", "native", "shared"}
EXCLUDED_PARTS = {".git", ".gradle", "build", "dist", "__pycache__", ".idea"}
EXCLUDED_SUFFIXES = {".apk", ".aab", ".keystore", ".jks", ".p12", ".pyc"}


def included(path: Path) -> bool:
    rel = path.relative_to(ROOT)
    if any(part in EXCLUDED_PARTS for part in rel.parts):
        return False
    if path.suffix.lower() in EXCLUDED_SUFFIXES and rel.as_posix() != "handoff/WebAPK-Studio-signing.p12":
        return False
    if path.name.endswith(".tmp"):
        return False
    if len(rel.parts) == 1:
        return rel.name in TOP_LEVEL_FILES
    return rel.parts[0] in SOURCE_DIRS


def main() -> None:
    output = Path(sys.argv[1]) if len(sys.argv) > 1 else ROOT / "dist/WebAPK-Studio-source.zip"
    if not output.is_absolute():
        output = ROOT / output
    output.parent.mkdir(parents=True, exist_ok=True)

    files = sorted(path for path in ROOT.rglob("*") if path.is_file() and included(path))
    if not files:
        raise SystemExit("No project source files found")
    with zipfile.ZipFile(output, "w", compression=zipfile.ZIP_DEFLATED, compresslevel=9) as archive:
        for path in files:
            archive.write(path, path.relative_to(ROOT).as_posix())
    print(f"Created {output.relative_to(ROOT)} ({output.stat().st_size} bytes, {len(files)} files)")


if __name__ == "__main__":
    main()
