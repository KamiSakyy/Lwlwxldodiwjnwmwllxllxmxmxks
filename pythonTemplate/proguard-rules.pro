# R8 reports this optional annotations class as missing in Chaquopy 14 + AGP 8.
-dontwarn org.jetbrains.annotations.NotNull

# Python/Flask entry points are reached through Chaquopy reflection/JNI.
-keep class com.chaquo.python.** { *; }
-keep class com.webapk.hosttemplate.PythonHostActivity { *; }
