#!/usr/bin/env python3
"""Create a smaller, consistently re-signed ARM-focused APKPure XAPK."""

from __future__ import annotations

import argparse
import copy
import json
import os
import re
import shutil
import subprocess
import sys
import tempfile
import zipfile
from pathlib import Path, PurePosixPath

try:
    from .optimize_abi_apk import native_abi, optimize
    from .prepare_apkpure_xapk import choose_base_apk
except ImportError:
    from optimize_abi_apk import native_abi, optimize
    from prepare_apkpure_xapk import choose_base_apk

DEX_NAME = re.compile(r"classes(?:\d+)?\.dex\Z")
SIGNER_SHA256 = re.compile(
    r"(?i)^\s*(?:Signer\s+#\d+\s+certificate|"
    r"V\d+(?:\.\d+)?\s+Signer:\s+certificate)\s+"
    r"SHA-256\s+digest:\s*([0-9a-f:]+)"
)
FILENAME_ABI = {
    "arm64_v8a": "arm64-v8a",
    "armeabi_v7a": "armeabi-v7a",
    "armeabi": "armeabi",
    "x86_64": "x86_64",
    "x86": "x86",
    "mips64": "mips64",
    "mips": "mips",
    "riscv64": "riscv64",
}


def run_tool(command: list[str], description: str) -> str:
    result = subprocess.run(command, text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    if result.returncode:
        tail = "\n".join(result.stdout.splitlines()[-12:])
        raise RuntimeError(
            f"{description} failed (exit {result.returncode})"
            + (f": {tail}" if tail else "")
        )
    return result.stdout


def apk_metadata(path: Path) -> tuple[set[str], int]:
    with zipfile.ZipFile(path, "r") as apk:
        names = [name for name in apk.namelist() if not name.endswith("/")]
        if "AndroidManifest.xml" not in names:
            raise ValueError(f"embedded APK lacks AndroidManifest.xml: {path.name}")
        abis = {
            abi for name in names
            if (abi := native_abi(name)) is not None
        }
        dex_count = sum(1 for name in names if DEX_NAME.fullmatch(PurePosixPath(name).name))
        return abis, dex_count


def filename_abi(member_name: str) -> str | None:
    stem = PurePosixPath(member_name).stem.lower()
    for prefix in ("config.", "split_config."):
        if stem.startswith(prefix):
            return FILENAME_ABI.get(stem[len(prefix):])
    return None


def contains_dropped_apk(value: object, dropped_basenames: set[str]) -> bool:
    if isinstance(value, str):
        return PurePosixPath(value.replace("\\", "/")).name in dropped_basenames
    if isinstance(value, dict):
        return any(contains_dropped_apk(item, dropped_basenames) for item in value.values())
    if isinstance(value, list):
        return any(contains_dropped_apk(item, dropped_basenames) for item in value)
    return False


def filter_manifest_lists(value: object, dropped_basenames: set[str]) -> object:
    if isinstance(value, dict):
        return {
            key: filter_manifest_lists(item, dropped_basenames)
            for key, item in value.items()
            if not contains_dropped_apk(key, dropped_basenames)
            and not (isinstance(item, str) and contains_dropped_apk(item, dropped_basenames))
        }
    if isinstance(value, list):
        return [
            filter_manifest_lists(item, dropped_basenames)
            for item in value
            if not contains_dropped_apk(item, dropped_basenames)
        ]
    return value


def signing_digest(output: str) -> str:
    fingerprints = {
        match.group(1).lower().replace(":", "")
        for line in output.splitlines()
        if (match := SIGNER_SHA256.search(line))
    }
    if len(fingerprints) != 1:
        raise ValueError(
            "apksigner did not report exactly one SHA-256 signer certificate "
            f"(found {len(fingerprints)})"
        )
    return next(iter(fingerprints))


def build(
    source_xapk: Path,
    output_xapk: Path,
    work_parent: Path,
    zipalign: Path,
    apksigner: Path,
    keystore: Path,
    password_file: Path,
    keep_abis: set[str],
) -> dict[str, object]:
    if not source_xapk.is_file():
        raise ValueError(f"source XAPK does not exist: {source_xapk}")
    if not keep_abis:
        raise ValueError("at least one target ABI must be specified")
    for tool_path, label in ((zipalign, "zipalign"), (apksigner, "apksigner")):
        if not tool_path.is_file() or not os.access(tool_path, os.X_OK):
            raise ValueError(f"{label} executable is unavailable: {tool_path}")
    for path, label in ((keystore, "temporary signing keystore"), (password_file, "temporary password file")):
        if not path.is_file():
            raise ValueError(f"{label} is unavailable")

    output_xapk.parent.mkdir(parents=True, exist_ok=True)
    work_parent.mkdir(parents=True, exist_ok=True)
    temp_name_by_member: dict[str, Path] = {}
    signed_path_by_member: dict[str, Path] = {}
    apk_stats: dict[str, dict[str, object]] = {}
    dropped_members: set[str] = set()
    all_available_abis: set[str] = set()
    signer_fingerprint: str | None = None
    base_member_name: str
    manifest_member_name: str | None = None
    original_manifest: dict[str, object] | None = None
    output_manifest: bytes | None = None

    with tempfile.TemporaryDirectory(prefix="vk-arm-xapk-", dir=work_parent) as temp_dir:
        workdir = Path(temp_dir)
        with zipfile.ZipFile(source_xapk, "r") as source:
            infos = source.infolist()
            duplicates = [name for name, count in __import__("collections").Counter(i.filename for i in infos).items() if count > 1]
            if duplicates:
                raise ValueError(f"XAPK contains duplicate ZIP entries ({len(duplicates)})")
            apk_infos = [
                info for info in infos
                if not info.is_dir() and info.filename.lower().endswith(".apk")
            ]
            if not apk_infos:
                raise ValueError("XAPK has no embedded APK files")
            apk_names = [info.filename for info in apk_infos]
            base_member_name = choose_base_apk(apk_names)
            manifest_infos = [
                info for info in infos
                if not info.is_dir() and PurePosixPath(info.filename).name.lower() == "manifest.json"
            ]
            if len(manifest_infos) > 1:
                raise ValueError("XAPK contains multiple manifest.json files")
            if manifest_infos:
                manifest_member_name = manifest_infos[0].filename
                try:
                    with source.open(manifest_infos[0], "r") as stream:
                        parsed = json.load(stream)
                except (UnicodeDecodeError, json.JSONDecodeError) as exc:
                    raise ValueError("XAPK manifest.json is not valid JSON") from exc
                if not isinstance(parsed, dict):
                    raise ValueError("XAPK manifest.json must be a JSON object")
                original_manifest = parsed

            # First pass identifies split APKs for the selected device ABIs.
            metadata_by_member: dict[str, tuple[set[str], int]] = {}
            for index, info in enumerate(apk_infos):
                staged = workdir / f"source-{index:03d}.apk"
                with source.open(info, "r") as input_stream, staged.open("wb") as output_stream:
                    shutil.copyfileobj(input_stream, output_stream, length=1024 * 1024)
                temp_name_by_member[info.filename] = staged
                abis, dex_count = apk_metadata(staged)
                file_abi = filename_abi(info.filename)
                if file_abi:
                    if abis and file_abi not in abis:
                        raise ValueError(
                            f"split filename ABI {file_abi} disagrees with embedded libraries "
                            f"in {PurePosixPath(info.filename).name}: {', '.join(sorted(abis))}"
                        )
                    abis.add(file_abi)
                metadata_by_member[info.filename] = (abis, dex_count)
                all_available_abis.update(abis)
                if info.filename != base_member_name and abis and not (abis & keep_abis):
                    dropped_members.add(info.filename)

            if base_member_name not in metadata_by_member:
                raise ValueError("could not locate the base APK selected from the XAPK")
            _base_abis, base_dex_count = metadata_by_member[base_member_name]
            if base_dex_count == 0:
                raise ValueError("selected base APK contains no DEX bytecode")
            if all_available_abis and not (all_available_abis & keep_abis):
                raise ValueError(
                    "XAPK has no native ABI compatible with the target set "
                    f"({', '.join(sorted(keep_abis))}); available: {', '.join(sorted(all_available_abis))}"
                )

            # Repack, align, sign, and verify every APK retained in the split set.
            for index, info in enumerate(apk_infos):
                if info.filename in dropped_members:
                    continue
                source_apk = temp_name_by_member[info.filename]
                raw_apk = workdir / f"repacked-{index:03d}.apk"
                aligned_apk = workdir / f"aligned-{index:03d}.apk"
                signed_apk = workdir / f"signed-{index:03d}.apk"
                abis, dex_count = metadata_by_member[info.filename]
                stats = optimize(
                    source_apk,
                    raw_apk,
                    keep_abis,
                    compress_dex=(dex_count > 0),
                    allow_no_dex=(info.filename != base_member_name),
                )
                run_tool(
                    [str(zipalign), "-P", "16", "-f", "4", str(raw_apk), str(aligned_apk)],
                    f"zipalign for {PurePosixPath(info.filename).name}",
                )
                run_tool(
                    [str(zipalign), "-c", "-P", "16", "-v", "4", str(aligned_apk)],
                    f"zipalign verification for {PurePosixPath(info.filename).name}",
                )
                run_tool(
                    [
                        str(apksigner), "sign",
                        "--ks", str(keystore),
                        "--ks-key-alias", "vk-mod-temporary",
                        "--ks-pass", f"file:{password_file}",
                        "--key-pass", f"file:{password_file}",
                        "--out", str(signed_apk), str(aligned_apk),
                    ],
                    f"APK signing for {PurePosixPath(info.filename).name}",
                )
                verify_output = run_tool(
                    [str(apksigner), "verify", "--verbose", "--print-certs", str(signed_apk)],
                    f"APK signature verification for {PurePosixPath(info.filename).name}",
                )
                fingerprint = signing_digest(verify_output)
                if signer_fingerprint is None:
                    signer_fingerprint = fingerprint
                elif fingerprint != signer_fingerprint:
                    raise ValueError("split APKs were not signed with the same temporary certificate")
                final_abis, final_dex_count = apk_metadata(signed_apk)
                if final_abis - keep_abis:
                    raise ValueError(
                        f"non-target ABI libraries remain in {PurePosixPath(info.filename).name}: "
                        f"{', '.join(sorted(final_abis - keep_abis))}"
                    )
                if final_dex_count != dex_count:
                    raise ValueError(f"DEX entry count changed in {PurePosixPath(info.filename).name}")
                stats["signed_bytes"] = signed_apk.stat().st_size
                stats["abi_names"] = sorted(final_abis)
                signed_path_by_member[info.filename] = signed_apk
                apk_stats[info.filename] = stats
                source_apk.unlink(missing_ok=True)
                raw_apk.unlink(missing_ok=True)
                aligned_apk.unlink(missing_ok=True)

            if not signed_path_by_member:
                raise ValueError("no APKs were retained for the selected ABI set")
            if base_member_name not in signed_path_by_member:
                raise ValueError("the XAPK base APK was unexpectedly removed")

            dropped_basenames = {PurePosixPath(name).name for name in dropped_members}
            output_manifest = None
            if original_manifest is not None:
                updated = filter_manifest_lists(original_manifest, dropped_basenames)
                assert isinstance(updated, dict)
                updated["total_size"] = sum(path.stat().st_size for path in signed_path_by_member.values())
                output_manifest = (json.dumps(updated, ensure_ascii=False, separators=(",", ":")) + "\n").encode("utf-8")

            with zipfile.ZipFile(output_xapk, "w", allowZip64=True) as output:
                output.comment = source.comment
                for info in infos:
                    if info.is_dir():
                        output.writestr(copy.copy(info), b"")
                        continue
                    if info.filename in dropped_members:
                        continue
                    if info.filename in signed_path_by_member:
                        input_path = signed_path_by_member[info.filename]
                        output_info = copy.copy(info)
                        with input_path.open("rb") as input_stream, output.open(output_info, "w") as output_stream:
                            shutil.copyfileobj(input_stream, output_stream, length=1024 * 1024)
                    elif info.filename == manifest_member_name and output_manifest is not None:
                        output_info = copy.copy(info)
                        output.writestr(output_info, output_manifest)
                    else:
                        output_info = copy.copy(info)
                        if output_info.compress_type == zipfile.ZIP_DEFLATED:
                            output_info._compresslevel = 9
                        with source.open(info, "r") as input_stream, output.open(output_info, "w") as output_stream:
                            shutil.copyfileobj(input_stream, output_stream, length=1024 * 1024)

        with zipfile.ZipFile(output_xapk, "r") as built:
            corrupt = built.testzip()
            if corrupt is not None:
                raise ValueError(f"output XAPK failed CRC validation at {corrupt}")
            output_apk_names = {
                info.filename for info in built.infolist()
                if not info.is_dir() and info.filename.lower().endswith(".apk")
            }
            if output_apk_names != set(signed_path_by_member):
                raise ValueError("output XAPK APK member list does not match the verified split set")

    input_bytes = source_xapk.stat().st_size
    output_bytes = output_xapk.stat().st_size
    if output_bytes >= input_bytes:
        output_xapk.unlink(missing_ok=True)
        raise ValueError(
            f"optimized XAPK is not smaller than the source ({output_bytes} >= {input_bytes} bytes)"
        )
    dex_before = int(apk_stats[base_member_name]["dex_input_compressed_bytes"])
    dex_after = int(apk_stats[base_member_name]["dex_output_compressed_bytes"])
    return {
        "input_bytes": input_bytes,
        "output_bytes": output_bytes,
        "reduction_bytes": input_bytes - output_bytes,
        "reduction_percent": (input_bytes - output_bytes) * 100 / input_bytes,
        "base_member": base_member_name,
        "retained_apk_members": sorted(signed_path_by_member),
        "dropped_apk_members": sorted(dropped_members),
        "available_abis": sorted(all_available_abis),
        "kept_abis": sorted(keep_abis),
        "dex_before": dex_before,
        "dex_after": dex_after,
        "signer_sha256": signer_fingerprint,
        "manifest_updated": output_manifest is not None,
        "apk_stats": apk_stats,
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("source_xapk", type=Path)
    parser.add_argument("output_xapk", type=Path)
    parser.add_argument("--work-dir", type=Path, required=True)
    parser.add_argument("--zipalign", type=Path, required=True)
    parser.add_argument("--apksigner", type=Path, required=True)
    parser.add_argument("--keystore", type=Path, required=True)
    parser.add_argument("--password-file", type=Path, required=True)
    parser.add_argument("--keep-abi", action="append", default=[], dest="keep_abis")
    args = parser.parse_args()

    try:
        result = build(
            args.source_xapk,
            args.output_xapk,
            args.work_dir,
            args.zipalign,
            args.apksigner,
            args.keystore,
            args.password_file,
            set(args.keep_abis),
        )
    except Exception as exc:
        message = f"ARM XAPK build failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=ARM XAPK build::{escaped}")
            summary = os.environ.get("GITHUB_STEP_SUMMARY")
            if summary:
                with Path(summary).open("a", encoding="utf-8") as stream:
                    stream.write(f"## ARM XAPK build failed\n\n- {message}\n")
        return 1

    report = [
        "## ARM-focused XAPK build",
        "",
        f"- Base split: `{result['base_member']}`",
        f"- Target ABI(s): {', '.join(result['kept_abis'])}",
        f"- ABI(s) present in source: {', '.join(result['available_abis']) or 'none'}",
        f"- Retained APK splits: {len(result['retained_apk_members'])}",
        f"- Excluded APK splits: {', '.join(result['dropped_apk_members']) or 'none'}",
        f"- XAPK size: {result['input_bytes']} -> {result['output_bytes']} bytes",
        f"- Reduction: {result['reduction_bytes']} bytes ({result['reduction_percent']:.2f}%)",
        f"- Base DEX ZIP bytes: {result['dex_before']} -> {result['dex_after']}",
        f"- Common signer certificate SHA-256: `{result['signer_sha256']}`",
        f"- APKPure manifest size metadata updated: {'yes' if result['manifest_updated'] else 'no manifest.json present'}",
        "",
    ]
    output = "\n".join(report)
    print(output)
    summary = os.environ.get("GITHUB_STEP_SUMMARY")
    if summary:
        with Path(summary).open("a", encoding="utf-8") as stream:
            stream.write(output)
    if os.environ.get("GITHUB_ACTIONS") == "true":
        message = (
            f"XAPK {result['input_bytes']} -> {result['output_bytes']} bytes; "
            f"saved {result['reduction_bytes']} bytes ({result['reduction_percent']:.2f}%); "
            f"base DEX {result['dex_before']} -> {result['dex_after']} bytes"
        )
        escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
        print(f"::notice title=ARM XAPK size result::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
