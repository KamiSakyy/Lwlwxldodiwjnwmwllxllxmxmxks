# VK APK mod workspace

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

## Retained source package

Workflow run `37520946631` saved both the APKPure XAPK and its extracted base APK here:

- `vk-apkpure-latest.xapk`
- `vk-apkpure-latest-base.apk`

They are tracked with Git LFS so they remain in `handoff/` after the Actions job ends. The repository is currently public; anyone with repository access can download these binaries. Decompiled Java sources, signing keys, and credentials are not committed.

## Size-optimized ARM build

The extracted base APK contains no bundled `lib/<abi>` native libraries, so filtering the base APK alone would not produce a valid or smaller ARM build. The workflow now inspects the APK members inside the XAPK and their ABI contents; an installable ARM-focused split package has not yet been generated. The full split layout and the next build result will determine its final artifact format and size.

Any ARM-focused output will preserve the base APK and required ARM configuration APKs while excluding incompatible x86/x86_64 native splits. The official VK signing key is not available, so any modified package must be re-signed with a temporary key that is never committed. Android will not install it as an update over the official VK app; switching requires uninstalling the official app first, which deletes its local app data. Back up anything important before doing so. The VK login/session code will remain unchanged and use the normal in-app sign-in flow; no manual `access_token` will be embedded. Sign-in cannot be claimed as tested unless verified on a device.

## Verification and decompilation

The APKPure response is checked as a ZIP/XAPK; the extracted APK signature is verified against the previously observed VK signer fingerprint. Run `37512206885` resolved to VK 8.193, version code 57318, but its JADX pass emitted 73,744 Java files and hit heap/decoder errors. The current workflow uses a larger JADX heap, writes only a metadata summary to the Actions run, and keeps the full decompiled tree on ephemeral runner storage.
