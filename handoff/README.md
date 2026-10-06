# VK APK static review

This folder contains workflow support for the requested first-pass review of the VK Android package. It does not implement or build any modifications.

## Download source

The workflow uses the direct APKPure URL supplied by the user:

`https://d.apkpure.net/b/XAPK/com.vkontakte.android?version=latest`

That endpoint is an APKPure XAPK download route. The workflow downloads it only to the temporary GitHub Actions runner, selects the base APK without uploading the archive, checks the APK package/signature, and decompiles the base APK with JADX. The manifest version and code are reported from the resolved download because `version=latest` can change over time.

The configured signer SHA-1 is a previously observed VK certificate fingerprint; it has not yet been independently confirmed against the APK returned by this APKPure URL. The workflow fails closed if the fingerprint differs, rather than silently accepting a different signer.

## Handling and privacy

The APK and decompiled tree stay in ephemeral runner storage and are deleted at the end of the job. No APK, XAPK, or decompiled source is uploaded as an artifact or committed. The workflow summary is metadata-only and intentionally omits source lines and string literal values.

This repository is public, so Actions run names, logs, and summaries are public too. Do not put credentials, access tokens, APK files, decompiled source, or signing keys in the workflow or its outputs. No access token is used; any later VK login must continue to use the normal app login/session flow.
