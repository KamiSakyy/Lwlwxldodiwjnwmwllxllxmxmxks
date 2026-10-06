# ---------------------------------------------------------------------------
# GitHub RU Studio — правила R8.
#
# Задача: минимум размера (вес APK) при сохранении JNI-моста к libnode.so
# и JS-моста window.Studio (в него уходят методы по именам).
# ---------------------------------------------------------------------------

# 1) JNI: nativeStart вызывается по имени Java_com_github_rudroid_studio_node_NodeEngine_nativeStart.
-keep class com.github.rudroid.studio.node.NodeEngine { *; }
-keepclasseswithmembernames class * {
    native <methods>;
}

# 2) JS-мост: методы @JavascriptInterface вызываются из JavaScript по имени.
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}
# Сам объект моста отдаётся в JS под именем "Studio" — класс не должен исчезнуть.
-keep class com.github.rudroid.studio.StudioFiles { *; }

# 3) Activity видна системе по имени из манифеста.
-keep class com.github.rudroid.studio.MainActivity { *; }

# ---------------------------------------------------------------------------
# Оптимизации размера и скорости
# ---------------------------------------------------------------------------
-allowaccessmodification
-repackageclasses ''
-optimizationpasses 5
-dontusemixedcaseclassnames
# SourceFile оставляем (полезно в стектрейсах), LineNumberTable — нет (лишний вес).
-keepattributes SourceFile
-renamesourcefileattribute SourceFile

# Логи в release не нужны: R8 вырежет вызовы (dex меньше, чуть быстрее).
-assumenosideeffects class android.util.Log {
    public static int v(...);
    public static int d(...);
}

-dontwarn android.**
-dontwarn java.**
-dontwarn javax.**
