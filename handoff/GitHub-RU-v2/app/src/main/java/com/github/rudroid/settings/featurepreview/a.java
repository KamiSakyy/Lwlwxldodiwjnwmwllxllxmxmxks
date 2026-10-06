package com.github.rudroid.settings.featurepreview;

import android.content.SharedPreferences;
import k71.k;
import oa.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public com.github.rudroid.activities.util.c a;
    public n b;

    public a(com.github.rudroid.activities.util.c cVar, n nVar) {
        k.g(cVar, "accountHolder");
        k.g(nVar, "userSharedPreferenceFactory");
        this.a = cVar;
        this.b = nVar;
    }

    public final boolean a(c cVar) {
        k.g(cVar, "feature");
        SharedPreferences b = this.b.b(this.a.d());
        ei.d dVar = ei.d.s;
        return b.getBoolean("display_staff_banner", true);
    }
}
