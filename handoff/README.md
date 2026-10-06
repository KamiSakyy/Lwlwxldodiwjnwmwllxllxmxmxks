# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

Workflow run `37520946631` saved both the APKPure XAPK and its extracted base APK here:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so they remain in `handoff/` after the Actions job ends. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Size-optimized ARM build

The workflow is configured to produce `vk-mod-arm.apk` from the verified base APK. It keeps the `arm64-v8a` and `armeabi-v7a` native libraries and removes non-ARM native-library variants, then aligns, signs, and verifies the result. It does not alter the manifest, DEX bytecode, resources, assets, or retained library payloads. The size report compares the source APK and mod.

This build is for ARM Android devices; x86/x86_64 devices and emulators are not supported by the reduced package. The official VK signing key is not available, so the output is signed with a temporary key that is never committed. Android will not install it as an update over the official VK app; switching requires uninstalling the official app first, which deletes its local app data. Back up anything important before doing so. The VK login/session code is left unchanged and uses the normal in-app sign-in flow; no manual `access_token` is embedded. Sign-in has not been runtime-tested on a device.

## Verification and decompilation

The APKPure response is checked as a ZIP/XAPK; the extracted APK signature is verified against the previously observed VK signer fingerprint. Run `37512206885` resolved to VK 8.193, version code 57318, but its JADX pass emitted 73,744 Java files and hit heap/decoder errors. The current workflow uses a larger JADX heap, writes only a metadata summary to the Actions run, and keeps the full decompiled tree on ephemeral runner storage.
