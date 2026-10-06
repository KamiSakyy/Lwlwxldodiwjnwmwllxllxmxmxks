#!/usr/bin/env python3
"""Build an ARM-only VK APK by removing non-ARM JNI libraries.

The app's manifest, DEX, resources, assets, and retained native-library
payloads are copied without content changes. APK signing files are omitted
because repackaging invalidates the original signature; the workflow aligns and
signs the result with an ephemeral key.
"""

from __future__ import annotations

import argparse
import copy
import hashlib
import os
import re
import shutil
import sys
import tempfile
import zipfile
from collections import Counter, defaultdict
from pathlib import Path

DEX_NAME = re.compile(r"classes(?:\d+)?\.dex\Z")
SIGNATURE_SUFFIXES = {".SF", ".RSA", ".DSA", ".EC", ".SIG"}


def is_v1_signature_metadata(name: str) -> bool:
    """Return true only for top-level META-INF JAR signing metadata."""
    parts = name.split("/")
    if len(parts) != 2 or parts[0].upper() != "META-INF":
        return False
    basename = parts[1].upper()
    return basename == "MANIFEST.MF" or Path(basename).suffix in SIGNATURE_SUFFIXES or basename.startswith("SIG-")


def native_abi(name: str) -> str | None:
    """Return an ABI for a standard lib/<abi>/*.so entry."""
    parts = name.split("/")
    if len(parts) >= 3 and parts[0] == "lib" and parts[-1].endswith(".so"):
        return parts[1]
    return None


def digest(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def optimize(source_path: Path, output_path: Path, keep_abis: set[str]) -> dict[str, object]:
    if source_path.resolve() == output_path.resolve():
        raise ValueError("input and output APK paths must be different")
    if not source_path.is_file():
        raise ValueError(f"input APK does not exist: {source_path}")
    if not keep_abis or "arm64-v8a" not in keep_abis:
        raise ValueError("the keep list must include arm64-v8a")

    output_path.parent.mkdir(parents=True, exist_ok=True)
    temp_fd, temp_name = tempfile.mkstemp(prefix=f".{output_path.name}.", suffix=".tmp", dir=output_path.parent)
    os.close(temp_fd)
    temp_path = Path(temp_name)

    try:
        with zipfile.ZipFile(source_path, "r") as source:
            entries = [entry for entry in source.infolist() if not entry.is_dir()]
            duplicates = [name for name, count in Counter(item.filename for item in entries).items() if count > 1]
            if duplicates:
                raise ValueError(f"APK contains duplicate ZIP entries ({len(duplicates)}); refusing ambiguous rewrite")

            names = {entry.filename for entry in entries}
            dex_names = sorted(
                name for name in names if DEX_NAME.fullmatch(Path(name).name)
            )
            if "AndroidManifest.xml" not in names or not dex_names:
                raise ValueError("input is not a recognizable Android APK (manifest or DEX missing)")

            libraries_by_abi: dict[str, list[zipfile.ZipInfo]] = defaultdict(list)
            for entry in entries:
                abi = native_abi(entry.filename)
                if abi is not None:
                    libraries_by_abi[abi].append(entry)
            if "arm64-v8a" not in libraries_by_abi:
                found = ", ".join(sorted(libraries_by_abi)) or "none"
                raise ValueError(f"APK has no arm64-v8a native libraries (found: {found})")

            dropped_libraries = [
                entry
                for abi, abi_entries in libraries_by_abi.items()
                if abi not in keep_abis
                for entry in abi_entries
            ]
            if not dropped_libraries:
                found = ", ".join(sorted(libraries_by_abi))
                raise ValueError(
                    "no non-ARM native libraries are available to remove; "
                    f"refusing to claim a size reduction (input ABIs: {found})"
                )

            signing_entries = [entry for entry in entries if is_v1_signature_metadata(entry.filename)]
            dropped_names = {entry.filename for entry in dropped_libraries}
            dropped_names.update(entry.filename for entry in signing_entries)
            expected_names = names - dropped_names
            input_abis = sorted(libraries_by_abi)

            with zipfile.ZipFile(temp_path, "w", allowZip64=True) as output:
                output.comment = source.comment
                for entry in entries:
                    if entry.filename in dropped_names:
                        continue
                    # Work with a copy: ZipFile.open(..., 'w') mutates its
                    # ZipInfo, and the source archive must retain original offsets
                    # for the integrity checks below.
                    output_entry = copy.copy(entry)
                    # Deflate existing compressed entries at level 9; keep stored
                    # entries stored, which is required for some aligned JNI libs.
                    if output_entry.compress_type == zipfile.ZIP_DEFLATED:
                        output_entry._compresslevel = 9
                    with source.open(entry, "r") as reader, output.open(output_entry, "w") as writer:
                        shutil.copyfileobj(reader, writer, length=1024 * 1024)

            with zipfile.ZipFile(temp_path, "r") as optimized:
                output_names = {name for name in optimized.namelist() if not name.endswith("/")}
                if output_names != expected_names:
                    raise ValueError("rewritten APK entry list differs from the planned ARM/signature-only pruning")
                corrupt = optimized.testzip()
                if corrupt is not None:
                    raise ValueError(f"rewritten ZIP CRC check failed for {corrupt}")
                if digest(optimized.read("AndroidManifest.xml")) != digest(source.read("AndroidManifest.xml")):
                    raise ValueError("Android manifest changed during repackaging")
                for name in dex_names:
                    if digest(optimized.read(name)) != digest(source.read(name)):
                        raise ValueError(f"DEX payload changed during repackaging: {name}")
                if "resources.arsc" in names and digest(optimized.read("resources.arsc")) != digest(source.read("resources.arsc")):
                    raise ValueError("Android resource table changed during repackaging")
                output_abis = sorted({abi for name in output_names if (abi := native_abi(name)) is not None})
                unexpected = sorted(set(output_abis) - keep_abis)
                if unexpected:
                    raise ValueError(f"unexpected non-ARM ABI libraries remain: {', '.join(unexpected)}")

            os.replace(temp_path, output_path)
    except Exception:
        temp_path.unlink(missing_ok=True)
        raise

    input_bytes = source_path.stat().st_size
    output_bytes = output_path.stat().st_size
    if output_bytes >= input_bytes:
        output_path.unlink(missing_ok=True)
        raise ValueError(
            f"repacked APK is not smaller than the source ({output_bytes} >= {input_bytes} bytes)"
        )

    removed_compressed = sum(entry.compress_size for entry in dropped_libraries)
    removed_uncompressed = sum(entry.file_size for entry in dropped_libraries)
    return {
        "input_bytes": input_bytes,
        "output_bytes": output_bytes,
        "removed_native_libraries": len(dropped_libraries),
        "removed_native_compressed_bytes": removed_compressed,
        "removed_native_uncompressed_bytes": removed_uncompressed,
        "removed_signature_files": len(signing_entries),
        "input_abis": input_abis,
        "output_abis": output_abis,
        "kept_abis": sorted(keep_abis),
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("input_apk", type=Path)
    parser.add_argument("output_apk", type=Path)
    parser.add_argument(
        "--keep-abi",
        action="append",
        dest="keep_abis",
        default=[],
        help="native ABI to retain (repeatable; arm64-v8a is mandatory)",
    )
    args = parser.parse_args()

    try:
        result = optimize(args.input_apk, args.output_apk, set(args.keep_abis))
    except Exception as exc:
        message = f"APK optimization failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=APK size optimization::{escaped}")
            summary = os.environ.get("GITHUB_STEP_SUMMARY")
            if summary:
                with Path(summary).open("a", encoding="utf-8") as stream:
                    stream.write(f"## APK size optimization failed\n\n- {message}\n")
        return 1

    reduction = result["input_bytes"] - result["output_bytes"]
    reduction_pct = reduction * 100 / result["input_bytes"]
    print(f"Input size: {result['input_bytes']} bytes")
    print(f"Repacked size before signing/alignment: {result['output_bytes']} bytes")
    print(f"Size reduction before signing/alignment: {reduction} bytes ({reduction_pct:.2f}%)")
    print(
        "Removed native libraries: "
        f"{result['removed_native_libraries']} files, "
        f"{result['removed_native_compressed_bytes']} stored bytes / "
        f"{result['removed_native_uncompressed_bytes']} expanded bytes"
    )
    print(f"Removed stale v1 signature metadata files: {result['removed_signature_files']}")
    print(f"Input ABIs: {', '.join(result['input_abis'])}")
    print(f"Output ABIs: {', '.join(result['output_abis'])}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
