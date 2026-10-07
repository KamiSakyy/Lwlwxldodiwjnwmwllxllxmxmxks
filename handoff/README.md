# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

Workflow run `37520946631` saved both the APKPure XAPK and its extracted base APK here:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so they remain in `handoff/` after the Actions job ends. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Historical size-only split build

The APKPure download is a split XAPK, not one standalone APK. Its members are the 19-DEX base APK, `config.armeabi_v7a.apk`, `config.mdpi.apk`, and `config.en.apk`; the base itself has no native libraries. Workflow run `37525594470` produced the historical size-only `vk-mod-arm.xapk` in Git LFS: **121,049,718 bytes (115.44 MiB)** versus the original **228,168,458 bytes (217.60 MiB)**, a reduction of **107,118,740 bytes (46.95%)**. It preserves the split set, changes ZIP compression of stored DEX entries without changing DEX payload bytes, re-aligns and signs every APK split with the same temporary key, and updates XAPK size metadata. The XAPK is retained as an earlier artifact; it is not the requested standalone-APK deliverable.

## Current target: standalone ARM APK

The current workflow builds one `vk-mod-arm.apk`: it merges the source `armeabi-v7a` native libraries into the privacy-patched base, removes split-required manifest markers, then aligns, signs, and validates one APK. It does not package a new XAPK. The English and mdpi resource-only splits are not merged; the base package's default resources are relied on, so language/density presentation may fall back. The source offers only `armeabi-v7a`; 64-bit-only ARM and x86 devices are outside this build's target. A device installation and runtime test are still required before claiming compatibility.

The source XAPK contains an `armeabi-v7a` native split, with no `arm64-v8a` split. The mod therefore has the same 32-bit ARM compatibility as this APKPure package; 64-bit-only ARM devices and x86/x86_64 devices are not supported by these source splits. It also preserves the source's English and mdpi configuration splits. The full decompiled Java tree remains on ephemeral Actions storage; only metadata summaries and the signed XAPK are retained.

The official VK signing key is not available, so the mod uses a temporary key that is never committed. Android will not install it as an update over the official VK app; switching requires uninstalling the official app first, which deletes its local app data. Back up anything important before doing so. The VK login/session code is unchanged and uses the normal in-app sign-in flow; no manual `access_token` is embedded. Sign-in and runtime behavior have not been tested on a device.

## Privacy-hardening build

The privacy workflow starts from the APKPure source, rebuilds the base with Apktool, and targets one ARMv7 APK. It applies known Firebase/Google Analytics and Yandex Mobile Ads opt-out metadata, removes declared ad/tracker manifest components, and removes selected sensitive permission declarations when present (`AD_ID`, phone state/numbers, fine/coarse location, `GET_ACCOUNTS`, and `QUERY_ALL_PACKAGES`). The smali patch is intentionally narrow: it removes only direct void-returning calls from VK-owned code to recognized ad/analytics SDK owners. It does not delete SDK class files from DEX, patch unknown or reflective calls, or prove that VK/backend telemetry has stopped. Premium bypasses and unrestricted downloading of VK media are not part of this privacy build.

Removing location permissions disables app features that require location sharing/access; removing phone/account permissions may affect phone-number autofill and system-account discovery. The normal VK sign-in flow is not intentionally edited and no manual `access_token` is embedded, but sign-in and runtime behavior remain untested on-device. Static audits are indicators, not a guarantee of complete privacy or functional compatibility.

## Verification and decompilation

The APKPure response is checked as a ZIP/XAPK; the extracted base APK signature is verified against the previously observed VK signer fingerprint. Run `37512206885` resolved to VK 8.193, version code 57318, but its JADX pass emitted 73,744 Java files and hit heap/decoder errors. The current workflow uses a larger JADX heap, writes only a metadata summary to the Actions run, and keeps the full decompiled tree on ephemeral runner storage.
