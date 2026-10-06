# VK APK static review

This folder contains workflow support for the requested first-pass review of the VK Android package. It does not implement or build any modifications.

## Download source

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

That endpoint is an APKPure XAPK download route. The workflow downloads it only to the temporary GitHub Actions runner, selects the base APK without uploading the archive, checks the APK package/signature, and decompiles the base APK with JADX. The manifest version and code are reported from the resolved download because `version=latest` can change over time.

In the successful Actions review run, `apksigner` verified the base APK and its signer matched the configured VK fingerprint: SHA-1 `48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f` (SHA-256 `057d974412032066f1b5edb1fdb550f71854189815c806b27c4d486fb4f1ef32`). This confirms the APK matches the pinned certificate, but is not by itself independent proof of publisher identity.

The `version=latest` URL resolved to VK 8.193, version code 57318, in Actions run [37512206885](https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/actions/runs/37512206885). JADX emitted 73,744 Java files but exited after heap/decoder errors; the metadata summary is therefore partial, not exhaustive.

## Handling and privacy

The APK and decompiled tree stay in ephemeral runner storage and are deleted at the end of the job. No APK, XAPK, or decompiled source is uploaded as an artifact or committed. The workflow summary is metadata-only and intentionally omits source lines and string literal values.

This repository is public, so Actions run names, logs, and summaries are public too. Do not put credentials, access tokens, APK files, decompiled source, or signing keys in the workflow or its outputs. No access token is used; any later VK login must continue to use the normal app login/session flow.
