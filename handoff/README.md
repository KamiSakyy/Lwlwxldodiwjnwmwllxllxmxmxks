# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

Workflow run `37520946631` saved both the APKPure XAPK and its extracted base APK here:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so they remain in `handoff/` after the Actions job ends. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Size-optimized split build

The APKPure download is a split XAPK, not one standalone APK. Its current members are the 19-DEX base APK, `config.armeabi_v7a.apk`, `config.mdpi.apk`, and `config.en.apk`; the base itself has no native libraries. The build therefore preserves the required split set and creates `vk-mod-arm.xapk` rather than pretending the base alone is installable. It changes ZIP compression of the stored DEX entries without changing DEX payload bytes, re-aligns and signs every APK split with the same temporary key, updates the XAPK size metadata, and verifies the nested ZIPs/signatures. A build is retained only if the resulting XAPK is smaller than the source.

The source XAPK contains an `armeabi-v7a` native split, with no `arm64-v8a` split. The mod therefore has the same 32-bit ARM compatibility as this APKPure package; 64-bit-only ARM devices and x86/x86_64 devices are not supported by these source splits. It also preserves the source's English and mdpi configuration splits. The full decompiled Java tree remains on ephemeral Actions storage; only metadata summaries and the signed XAPK are retained.

The official VK signing key is not available, so the mod uses a temporary key that is never committed. Android will not install it as an update over the official VK app; switching requires uninstalling the official app first, which deletes its local app data. Back up anything important before doing so. The VK login/session code is unchanged and uses the normal in-app sign-in flow; no manual `access_token` is embedded. Sign-in and runtime behavior have not been tested on a device.

## Verification and decompilation

The APKPure response is checked as a ZIP/XAPK; the extracted base APK signature is verified against the previously observed VK signer fingerprint. Run `37512206885` resolved to VK 8.193, version code 57318, but its JADX pass emitted 73,744 Java files and hit heap/decoder errors. The current workflow uses a larger JADX heap, writes only a metadata summary to the Actions run, and keeps the full decompiled tree on ephemeral runner storage.
