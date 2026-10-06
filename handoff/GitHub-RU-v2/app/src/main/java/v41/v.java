package v41;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public a81.t a;
    public Context b;
    public String c;
    public q51.d d;
    public s e;
    public c f;

    public v(Context context, String str, q51.d dVar, s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = sVar;
        this.a = new a81.t(9);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)|4|(7:15|16|7|8|9|10|11)|6|7|8|9|10|11) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b(boolean z) {
        String str;
        if (Looper.getMainLooper().isCurrentThread()) {
            Thread.currentThread().getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        q51.d dVar = this.d;
        String str2 = null;
        if (z) {
            try {
                str = ((q51.a) t.q.d(((q51.c) dVar).d(), 10000L, TimeUnit.MILLISECONDS)).a;
            } catch (Exception unused) {
            }
            str2 = (String) t.q.d(((q51.c) dVar).c(), 10000L, TimeUnit.MILLISECONDS);
            return new u(str2, str);
        }
        str = null;
        str2 = (String) t.q.d(((q51.c) dVar).c(), 10000L, TimeUnit.MILLISECONDS);
        return new u(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f;
        if (cVar != null && (cVar.b != null || !this.e.a())) {
            return this.f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.e.a()) {
            u b = b(false);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new u(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new c(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f;
    }

    public final String d() {
        String str;
        a81.t tVar = this.a;
        Context context = this.b;
        synchronized (tVar) {
            try {
                if (tVar.s == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    tVar.s = installerPackageName;
                }
                str = "".equals(tVar.s) ? null : tVar.s;
            } finally {
            }
        }
        return str;
    }
    public Object r = null;
    public Object s = null;
}
