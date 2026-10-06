# VK APK static review

This folder contains the **workflow support and a metadata-only analyzer** for the requested first-pass review of the VK Android package.

## Selected download

- Listing: https://trashbox.ru/link/vkontakte-android
- Version selected: VK 8.197, version code 58503, package `com.vkontakte.android`
- Direct APK URL extracted from the listing's public download link:
  `https://trashbox.ru/files30/2659901/com.vkontakte.android_58503_rs.apk/`

The workflow downloads the APK to the temporary GitHub Actions runner, verifies its Android signature/package, and decompiles it there with JADX. It **does not** commit or upload the APK or decompiled source. The only generated output is a short metadata/structure report in the workflow summary.

Because this repository is public, Actions run names, logs, and summaries are public too. Do not put credentials, access tokens, APK files, decompiled source, or signing keys in the workflow or its outputs. The decompiled work directory is deleted at job end.

No app code is patched or rebuilt by this workflow; it is for inspection only.
