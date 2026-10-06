package com.github.rudroid.settings;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsNotificationSchedulesActivity extends e<ic.j0> {
    public static final a Companion = new a();
    public int v0;

    public static final class a {
    }

    public SettingsNotificationSchedulesActivity() {
        this.u0 = false;
        C(new d(this));
        this.v0 = 2131558446;
    }

    public final int L0() {
        return this.v0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.a1 H = H();
            k71.k.f(H, "getSupportFragmentManager(...)");
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            aVar.r = true;
            aVar.b(SettingsNotificationSchedulesFragment.class);
            aVar.g();
        }
    }

    public static Object C(Object... a) {
        return null;
    }
}
