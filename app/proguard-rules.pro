# The manifest starts this activity by its class name.
-keep class ru.webapk.studio.MainActivity { *; }

# APK output is produced with java.util.jar verification and Java crypto APIs at runtime.
-keep class ru.webapk.studio.ApkBuilder { *; }
-keep class ru.webapk.studio.BinaryXmlPatcher { *; }
-keep class ru.webapk.studio.JarV1Signer { *; }
-keep class ru.webapk.studio.ApkV2Signer { *; }
