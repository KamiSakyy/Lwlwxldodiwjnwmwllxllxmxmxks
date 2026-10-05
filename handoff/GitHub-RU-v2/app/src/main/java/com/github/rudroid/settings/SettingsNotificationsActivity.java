package com.github.rudroid.settings;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsNotificationsActivity extends g<ic.j0> {
    public final int o0;

    public SettingsNotificationsActivity() {
        this.n0 = false;
        C(new f(this));
        this.o0 = 2131558446;
    }

    public final int B0() {
        return this.o0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.a1 H = H();
            k71.k.f(H, "getSupportFragmentManager(...)");
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            aVar.r = true;
            aVar.b(SettingsNotificationsFragment.class);
            aVar.g();
        }
    }
}
