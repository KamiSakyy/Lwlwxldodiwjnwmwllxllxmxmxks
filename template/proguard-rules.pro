# R8 full mode for the generated site's embedded Android host.
-allowaccessmodification
-repackageclasses obf
-renamesourcefileattribute SourceFile
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod

# JNI_OnLoad/RegisterNatives requires this exact class and method name.
-keep class com.webapk.security.N {
    public static byte[] k();
    private static native byte[] n();
}
