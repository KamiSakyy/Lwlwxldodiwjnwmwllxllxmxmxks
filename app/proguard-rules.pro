# JNI: имена методов должны совпадать с символами в libmailgram.so
-keepclasseswithmembernames class * {
    native <methods>;
}
-keep class com.mailgram.app.crypto.NativeCrypto { *; }

# Android Keystore и провайдеры безопасности
-keep class javax.crypto.** { *; }
-keep class java.security.** { *; }

# Модели хранилища читаются/пишутся через org.json — имена полей не важны,
# но конструктор по умолчанию нужен.
-keepclassmembers class com.mailgram.app.store.** {
    <init>();
}
-keep class com.mailgram.app.store.Msg { *; }
-keep class com.mailgram.app.store.Chat { *; }

# Убираем отладочные логи в релизе (сообщения об ошибках остаются)
-assumenosideeffects class android.util.Log {
    public static int v(...);
    public static int d(...);
}
