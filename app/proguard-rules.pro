# Keep the WebRTC Java/JNI bridge names intact; native libwebrtc resolves these classes.
-keep class org.webrtc.** { *; }
-keep interface org.webrtc.** { *; }

# Preserve runtime annotations and generic signatures consumed by OkHttp / AndroidX.
-keepattributes Signature,*Annotation*,InnerClasses,EnclosingMethod

# Optional annotations are not bundled by every Android toolchain.
-dontwarn javax.annotation.**
