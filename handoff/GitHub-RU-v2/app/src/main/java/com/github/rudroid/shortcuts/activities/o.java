package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.utilities.ui.g1;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements j71.e {
    public final /* synthetic */ ConfigureShortcutFragment r;
    public final /* synthetic */ g1 s;
    public final /* synthetic */ wm.b t;

    public /* synthetic */ o(ConfigureShortcutFragment configureShortcutFragment, g1 g1Var, wm.b bVar) {
        this.r = configureShortcutFragment;
        this.s = g1Var;
        this.t = bVar;
    }

    public final Object s(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Integer) obj2).intValue();
        if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
            ConfigureShortcutFragment configureShortcutFragment = this.r;
            String p0 = i4.p0(configureShortcutFragment.E4().y ? 2131954624 : 2131954622, sVar);
            boolean h = sVar.h(configureShortcutFragment);
            Object N = sVar.N();
            if (h || N == androidx.compose.runtime.n.a) {
                N = new k(configureShortcutFragment, 3);
                sVar.n0(N);
            }
            qg.pShadow.c(null, p0, null, 0L, (j71.a) N, 0, 0.0f, 0.0f, 0, 0, r1.i.d(-1214205444, new p(configureShortcutFragment, this.s, this.t), sVar), sVar, 0, 6, 1005);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
