# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

On the next workflow run, it will save both the downloaded APKPure XAPK and the extracted base APK in this folder:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so the binary files remain in `handoff/` instead of being deleted at the end of the Actions job. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Verification and review

The APKPure response is checked as a ZIP/XAPK, the base APK is selected safely, and `apksigner` verifies the APK and compares its signer SHA-1 with the previously observed VK fingerprint. The successful run `37512206885` resolved to VK 8.193, version code 57318; JADX emitted 73,744 Java files but hit heap/decoder errors, so that earlier analysis was partial. The workflow now uses a larger JADX heap and also produces a package-size breakdown to guide safe size optimization.

No manual VK `access_token` is used. Any eventual login/session behavior must stay on the normal VK sign-in flow. The mod implementation remains limited to size optimization until specific behavior changes are defined.
