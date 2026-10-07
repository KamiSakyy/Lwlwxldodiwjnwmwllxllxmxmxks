#!/usr/bin/env python3
"""Neutralize direct void calls from VK-owned smali into known ad/telemetry SDKs.

Only app-owned callers are changed. Constructors, superclass lifecycle calls,
non-void calls, SDK definitions, and VK auth code are preserved. This avoids
removing SDK classes that might still be referenced by unrelated app code.
"""

from __future__ import annotations

import argparse
import itertools
import os
import re
import sys
from collections import Counter
from pathlib import Path

APP_CLASS_PREFIXES = (
    "Lcom/vkontakte/android/",
    "Lcom/vk/",
    "Lorg/vkontakte/",
)
SDK_OWNER_PREFIXES = {
    "Google Mobile Ads": (
        "Lcom/google/android/gms/ads/",
        "Lcom/google/android/gms/ads/identifier/",
    ),
    "Google Ads": ("Lcom/google/ads/",),
    "AppLovin": ("Lcom/applovin/",),
    "Unity Ads": ("Lcom/unity3d/ads/",),
    "Vungle": ("Lcom/vungle/",),
    "ironSource": ("Lcom/ironsource/",),
    "myTracker": ("Lcom/my/tracker/",),
    "Yandex Metrica": ("Lcom/yandex/metrica/",),
    "Yandex Mobile Ads": ("Lcom/yandex/mobile/ads/",),
    "Firebase Analytics": (
        "Lcom/google/firebase/analytics/",
        "Lcom/google/android/gms/measurement/",
    ),
    "Firebase Crashlytics": ("Lcom/google/firebase/crashlytics/",),
    "Firebase Performance": ("Lcom/google/firebase/perf/",),
    "Firebase Sessions": ("Lcom/google/firebase/sessions/",),
}
INVOKE = re.compile(
    r"^\s*invoke-(?:static|virtual|interface|direct)(?:/range)?\s+"
    r"\{[^}]*\},\s*(L[^;]+;)->([^\s(]+)\([^)]*\)(\S+)"
)
CLASS_DECL = re.compile(r"^\s*\.class\b.*?\s(L[^;]+;)(?:\s|$)")
METHOD_DECL = re.compile(r"^\s*\.method\b.*?\s([^\s(]+)\(([^)]*)\)(\S+)\s*$")
def sdk_for_owner(owner: str) -> str | None:
    for name, prefixes in SDK_OWNER_PREFIXES.items():
        if owner.startswith(prefixes):
            return name
    return None


def app_class(path: Path) -> bool:
    try:
        with path.open(encoding="utf-8", errors="ignore") as stream:
            prefix = next((line for line in itertools.islice(stream, 12) if ".class" in line), "")
    except OSError:
        return False
    match = CLASS_DECL.match(prefix)
    return bool(match and match.group(1).startswith(APP_CLASS_PREFIXES))


def scan_files(root: Path) -> list[Path]:
    return sorted(
        path for path in root.glob("smali*/**/*.smali")
        if path.is_file() and app_class(path)
    )


def patch_tree(root: Path, require_patches: bool = False) -> dict[str, object]:
    if not root.is_dir():
        raise ValueError(f"decoded Apktool directory does not exist: {root}")
    files = scan_files(root)
    if not files:
        raise ValueError("no VK-owned smali classes found; refusing to report a successful patch")

    patched_by_sdk: Counter[str] = Counter()
    retained_nonvoid: Counter[str] = Counter()
    callsite_names: dict[str, list[str]] = {name: [] for name in SDK_OWNER_PREFIXES}
    retained_call_names: dict[str, list[str]] = {name: [] for name in SDK_OWNER_PREFIXES}

    for path in files:
        try:
            original = path.read_text(encoding="utf-8", errors="replace")
        except OSError:
            continue
        lines = original.splitlines()
        output: list[str] = []
        current_method = "(class initializer)"
        changed = False
        index = 0
        while index < len(lines):
            line = lines[index]
            method_match = METHOD_DECL.match(line)
            if method_match:
                current_method = method_match.group(1)
            if line.strip() == ".end method":
                current_method = "(class initializer)"

            invoke_match = INVOKE.match(line)
            if invoke_match:
                owner, method_name, return_type = invoke_match.groups()
                sdk_name = sdk_for_owner(owner)
                if sdk_name and method_name not in {"<init>", "<clinit>"}:
                    if return_type == "V":
                        if len(callsite_names[sdk_name]) < 100:
                            callsite_names[sdk_name].append(f"{path.relative_to(root).as_posix()}#{current_method}")
                        patched_by_sdk[sdk_name] += 1
                        changed = True
                        index += 1
                        continue
                    retained_nonvoid[sdk_name] += 1
                    if len(retained_call_names[sdk_name]) < 100:
                        retained_call_names[sdk_name].append(
                            f"{path.relative_to(root).as_posix()}#{current_method}->{owner.rsplit('/', 1)[-1].rstrip(';')}::{method_name}"
                        )

            output.append(line)
            index += 1

        if changed:
            path.write_text("\n".join(output) + "\n", encoding="utf-8")

    remaining_void: Counter[str] = Counter()
    remaining_nonvoid: Counter[str] = Counter()
    for path in files:
        text = path.read_text(encoding="utf-8", errors="ignore")
        current_method = "(class initializer)"
        for line in text.splitlines():
            method_match = METHOD_DECL.match(line)
            if method_match:
                current_method = method_match.group(1)
            elif line.strip() == ".end method":
                current_method = "(class initializer)"
            match = INVOKE.match(line)
            if not match:
                continue
            owner, method_name, return_type = match.groups()
            sdk_name = sdk_for_owner(owner)
            if not sdk_name or method_name in {"<init>", "<clinit>"}:
                continue
            if return_type == "V":
                remaining_void[sdk_name] += 1
            else:
                remaining_nonvoid[sdk_name] += 1

    if any(remaining_void.values()):
        raise ValueError("privacy patch left direct void calls into reviewed ad/telemetry SDKs")
    total_patched = sum(patched_by_sdk.values())
    if require_patches and total_patched == 0:
        raise ValueError("no direct app-owned void SDK calls were patched")

    return {
        "app_smali_classes": len(files),
        "patched_by_sdk": dict(patched_by_sdk),
        "retained_nonvoid_by_sdk": dict(retained_nonvoid),
        "remaining_nonvoid_by_sdk": dict(remaining_nonvoid),
        "callsite_names": {name: values for name, values in callsite_names.items() if values},
        "retained_call_names": {name: values for name, values in retained_call_names.items() if values},
        "total_patched": total_patched,
    }


def main() -> int:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("decoded_apk_dir", type=Path)
    parser.add_argument("--require-patches", action="store_true")
    args = parser.parse_args()
    try:
        result = patch_tree(args.decoded_apk_dir, args.require_patches)
    except (OSError, ValueError) as exc:
        message = f"smali privacy patch failed: {type(exc).__name__}: {exc}"
        print(message, file=sys.stderr)
        if os.environ.get("GITHUB_ACTIONS") == "true":
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::error title=SDK call-site patch::{escaped}")
        return 1

    counts = result["patched_by_sdk"]
    count_text = ", ".join(f"{name}={count}" for name, count in counts.items()) or "none"
    retained = result["retained_nonvoid_by_sdk"]
    retained_text = ", ".join(f"{name}={count}" for name, count in retained.items()) or "none"
    print(f"VK-owned smali classes inspected: {result['app_smali_classes']}")
    print(f"Direct void ad/analytics SDK invocations removed: {result['total_patched']} ({count_text})")
    print(f"Non-void SDK invocations retained to avoid changing result values: {retained_text}")
    print("Verification: no direct void calls to the reviewed SDK prefixes remain in VK-owned smali.")

    if os.environ.get("GITHUB_ACTIONS") == "true":
        messages = [
            f"VK-owned smali classes inspected: {result['app_smali_classes']}",
            f"Direct void SDK invocations removed: {result['total_patched']} ({count_text})",
            f"Non-void SDK invocations retained: {retained_text}",
            "Verification: no direct void SDK calls remain in VK-owned smali.",
        ]
        for sdk_name, callsites in result["callsite_names"].items():
            for callsite in callsites[:2]:
                messages.append(f"Patched method identifier ({sdk_name}): {callsite}")
                if len(messages) >= 30:
                    break
            if len(messages) >= 30:
                break
        for message in messages:
            escaped = message.replace("%", "%25").replace("\r", "%0D").replace("\n", "%0A")
            print(f"::notice title=VK privacy bytecode patch::{escaped}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
