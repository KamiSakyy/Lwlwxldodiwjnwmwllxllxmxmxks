#!/usr/bin/env python3
"""Select and safely extract the base APK from an APKPure APK/XAPK download.

The input and output are intended to live only on the ephemeral GitHub Actions
runner. No package contents are printed or uploaded.
"""

from __future__ import annotations

import shutil
import sys
import zipfile
from pathlib import Path, PurePosixPath

PACKAGE = "com.vkontakte.android"


def is_apk(path: Path) -> bool:
    try:
        with zipfile.ZipFile(path) as archive:
            names = set(archive.namelist())
            return "AndroidManifest.xml" in names and any(
                name.rsplit("/", 1)[-1] == "classes.dex" for name in names
            )
    except (OSError, zipfile.BadZipFile):
        return False


def choose_base_apk(names: list[str]) -> str:
    apk_members = [name for name in names if name.lower().endswith(".apk")]
    if not apk_members:
        raise ValueError("APKPure response is a ZIP archive with no embedded APK files")

    # APKPure XAPK bundles commonly name the base APK after the package and
    # put ABI/density/language splits in separate config*.apk files.
    preferred = [
        name for name in apk_members
        if PurePosixPath(name).name.lower() == "base.apk"
    ]
    if len(preferred) == 1:
        return preferred[0]
    if len(preferred) > 1:
        raise ValueError("XAPK has multiple base.apk members")

    preferred = [
        name for name in apk_members
        if PurePosixPath(name).name.lower() == f"{PACKAGE}.apk"
    ]
    if len(preferred) == 1:
        return preferred[0]

    non_split = [
        name for name in apk_members
        if not PurePosixPath(name).name.lower().startswith(("config.", "split_"))
        and "config." not in PurePosixPath(name).name.lower()
    ]
    package_named = [
        name for name in non_split
        if PACKAGE in PurePosixPath(name).name.lower()
    ]
    candidates = package_named or non_split
    if len(candidates) != 1:
        raise ValueError(
            "Could not identify one unambiguous base APK in the XAPK "
            f"({len(apk_members)} APK entries, {len(candidates)} base candidates)"
        )
    return candidates[0]


def main() -> int:
    if len(sys.argv) != 3:
        print("usage: prepare_apkpure_xapk.py DOWNLOAD_ARCHIVE OUTPUT_APK", file=sys.stderr)
        return 2

    source = Path(sys.argv[1])
    destination = Path(sys.argv[2])
    if not source.is_file():
        print("APKPure download archive is missing", file=sys.stderr)
        return 2
    destination.parent.mkdir(parents=True, exist_ok=True)

    if is_apk(source):
        shutil.copyfile(source, destination)
        print(f"Download is a standalone APK ({destination.stat().st_size} bytes)")
        return 0

    try:
        with zipfile.ZipFile(source) as archive:
            member = choose_base_apk(archive.namelist())
            # Reject unusual absolute/traversal member names; stream only the
            # selected APK to a fixed destination without extracting the archive.
            member_path = PurePosixPath(member)
            if member_path.is_absolute() or ".." in member_path.parts:
                raise ValueError("XAPK contains an unsafe APK member path")
            info = archive.getinfo(member)
            if info.file_size < 10_000_000 or info.file_size > 1_000_000_000:
                raise ValueError(f"Selected APK has an unexpected expanded size ({info.file_size} bytes)")
            with archive.open(member) as input_stream, destination.open("wb") as output_stream:
                shutil.copyfileobj(input_stream, output_stream, length=1024 * 1024)
            if destination.stat().st_size != info.file_size:
                raise ValueError("Extracted APK size does not match the XAPK directory entry")
    except (OSError, zipfile.BadZipFile, ValueError) as exc:
        destination.unlink(missing_ok=True)
        print(f"Unable to prepare APK from APKPure download: {exc}", file=sys.stderr)
        return 1

    if not is_apk(destination):
        destination.unlink(missing_ok=True)
        print("Selected XAPK member is not a valid APK container", file=sys.stderr)
        return 1

    print(f"Selected base APK from XAPK ({destination.stat().st_size} bytes)")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
