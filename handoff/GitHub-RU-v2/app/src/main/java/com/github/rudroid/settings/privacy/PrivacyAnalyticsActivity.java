package com.github.rudroid.settings.privacy;

import android.os.Bundle;
import androidx.fragment.app.a1;
import ic.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class PrivacyAnalyticsActivity extends b<j0> {
    public final int v0;

    public PrivacyAnalyticsActivity() {
        this.u0 = false;
        C(new a(this));
        this.v0 = 2131558446;
    }

    public final int L0() {
        return this.v0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (H().E(2131363312) == null) {
            a1 H = H();
            H.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            aVar.l(2131363312, new SettingsPrivacyAnalyticsFragment(), (String) null);
            aVar.g();
        }
    }

    public static  C(Object... a) {
        return null;
    }
}
