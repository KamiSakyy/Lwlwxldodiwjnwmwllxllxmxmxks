package v41;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public final SharedPreferences a;
    public final k41.g b;
    public final Object c;
    public w21.g d;
    public boolean e;
    public Boolean f;
    public final w21.g g;

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(k41.g gVar) {
        Boolean bool;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = new Object();
        this.c = obj;
        this.d = new w21.g();
        this.e = false;
        this.g = new w21.g();
        gVar.a();
        Context context = gVar.a;
        this.b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.a = sharedPreferences;
        Boolean valueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (valueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                valueOf = bool != null ? null : Boolean.valueOf(Boolean.TRUE.equals(bool));
            }
            bool = null;
            if (bool != null) {
            }
        }
        this.f = valueOf;
        synchronized (obj) {
            try {
                if (a()) {
                    this.d.c(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean z;
        Boolean bool = this.f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            try {
                z = this.b.g();
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return z;
    }
}
