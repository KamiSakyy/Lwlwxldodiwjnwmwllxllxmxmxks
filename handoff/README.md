# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

Workflow run `37520946631` saved both the APKPure XAPK and its extracted base APK here:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so they remain in `handoff/` after the Actions job ends. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Size-optimized split build

The APKPure download is a split XAPK, not one standalone APK. Its members are the 19-DEX base APK, `config.armeabi_v7a.apk`, `config.mdpi.apk`, and `config.en.apk`; the base itself has no native libraries. Workflow run `37525594470` produced `vk-mod-arm.xapk` in Git LFS: **121,049,718 bytes (115.44 MiB)** versus the original **228,168,458 bytes (217.60 MiB)**, a reduction of **107,118,740 bytes (46.95%)**. The build preserves the required split set rather than pretending the base alone is installable. It changes ZIP compression of stored DEX entries without changing DEX payload bytes, re-aligns and signs every APK split with the same temporary key, updates XAPK size metadata, and verifies the nested ZIP CRCs and APK signatures. The package requires a compatible XAPK/split-APK installer.

The source XAPK contains an `armeabi-v7a` native split, with no `arm64-v8a` split. The mod therefore has the same 32-bit ARM compatibility as this APKPure package; 64-bit-only ARM devices and x86/x86_64 devices are not supported by these source splits. It also preserves the source's English and mdpi configuration splits. The full decompiled Java tree remains on ephemeral Actions storage; only metadata summaries and the signed XAPK are retained.

The official VK signing key is not available, so the mod uses a temporary key that is never committed. Android will not install it as an update over the official VK app; switching requires uninstalling the official app first, which deletes its local app data. Back up anything important before doing so. The VK login/session code is unchanged and uses the normal in-app sign-in flow; no manual `access_token` is embedded. Sign-in and runtime behavior have not been tested on a device.

## Privacy-hardening build

The privacy workflow starts from the APKPure source, rebuilds the base APK with Apktool, then packages the rebuilt base into the ARM-focused XAPK. It applies known Firebase/Google Analytics and Yandex Mobile Ads opt-out metadata, removes declared ad/tracker manifest components, and removes selected sensitive permission declarations when present (`AD_ID`, phone state/numbers, fine/coarse location, `GET_ACCOUNTS`, and `QUERY_ALL_PACKAGES`). The smali patch is intentionally narrow: it removes only direct void-returning calls from VK-owned code to recognized ad/analytics SDK owners. It does not delete SDK class files from DEX, patch unknown or reflective calls, or prove that VK/backend telemetry has stopped.

Removing location permissions disables app features that require location sharing/access; removing phone/account permissions may affect phone-number autofill and system-account discovery. The normal VK sign-in flow is not intentionally edited and no manual `access_token` is embedded, but sign-in and runtime behavior remain untested on-device. Static audits are indicators, not a guarantee of complete privacy or functional compatibility.

## Verification and decompilation

The APKPure response is checked as a ZIP/XAPK; the extracted base APK signature is verified against the previously observed VK signer fingerprint. Run `37512206885` resolved to VK 8.193, version code 57318, but its JADX pass emitted 73,744 Java files and hit heap/decoder errors. The current workflow uses a larger JADX heap, writes only a metadata summary to the Actions run, and keeps the full decompiled tree on ephemeral runner storage.
