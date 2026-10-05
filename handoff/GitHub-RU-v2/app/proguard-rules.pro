# Приложение уже обфусцировано R8, поэтому правила щадящие:
# агрессивная обфускация сломает отражение и JNI-вызовы
-keepattributes Signature, InnerClasses, EnclosingMethod, Annotation, SourceFile, LineNumberTable
-dontwarn **
-keep class com.github.rudroid.** { *; }
-keep class **.R$* { public static <fields>; }
-keepclasseswithmembers class * { native <methods>; }
