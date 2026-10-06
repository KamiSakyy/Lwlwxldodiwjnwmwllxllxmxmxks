package com.github.rudroid.settings;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SettingsActivity extends c<ic.j0> {
    public final int o0;

    public SettingsActivity() {
        this.n0 = false;
        C(new b(this));
        this.o0 = 2131558446;
    }

    public final int B0() {
        return this.o0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (H().E(2131363312) == null) {
            androidx.fragment.app.a1 H = H();
            H.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            aVar.l(2131363312, new SettingsFragment(), (String) null);
            aVar.g();
        }
    }

    public <T0> T0 C(Object... a) {
        return null;
    }

    public <T0> T0 H(Object... a) {
        return null;
    }
}
