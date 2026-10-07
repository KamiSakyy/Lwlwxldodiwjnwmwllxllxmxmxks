# Keep the WebRTC Java/JNI bridge names intact; native libwebrtc resolves these classes.
-keep class org.webrtc.** { *; }
-keep interface org.webrtc.** { *; }

# Signal's JNI bridge invokes protocol-store methods from native code; preserve wrapper and bridge names.
-keep class org.signal.libsignal.** { *; }

# Preserve runtime annotations and generic signatures consumed by JNI, OkHttp and AndroidX.
-keepattributes Signature,*Annotation*,InnerClasses,EnclosingMethod

# Optional annotations are not bundled by every Android toolchain.
-dontwarn javax.annotation.**
