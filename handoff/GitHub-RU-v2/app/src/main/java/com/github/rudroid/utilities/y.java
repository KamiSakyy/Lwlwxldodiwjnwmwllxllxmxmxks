package com.github.rudroid.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public static String a(Context context, a0 a0Var, String str) {
        k71.k.g(str, "id");
        return b(context).getString(a0Var.name() + "_" + str, null);
    }

    public static SharedPreferences b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("shared_preferences_drafts", 0);
        k71.k.f(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static void c(Context context, a0 a0Var, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        k71.k.g(str, "id");
        String h = f1.e.h(a0Var.name(), "_", str);
        if (str2 == null || t71.p.T(str2)) {
            SharedPreferences.Editor edit = b(context).edit();
            edit.remove(h);
            edit.remove(h + "_time_key");
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = b(context).edit();
        edit2.putString(h, str2);
        edit2.putLong(h + "_time_key", currentTimeMillis);
        edit2.apply();
    }
}
