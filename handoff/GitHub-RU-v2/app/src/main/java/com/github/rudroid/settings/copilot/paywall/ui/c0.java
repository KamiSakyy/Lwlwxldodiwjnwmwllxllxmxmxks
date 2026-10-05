package com.github.rudroid.settings.copilot.paywall.ui;

import java.util.List;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ e1 s;

    public c0(List list, e1 e1Var) {
        this.r = list;
        this.s = e1Var;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            m0 m0Var = (m0) this.r.get(intValue);
            sVar.c0(288998554);
            d0.e(null, m0Var, this.s, sVar, 0);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
