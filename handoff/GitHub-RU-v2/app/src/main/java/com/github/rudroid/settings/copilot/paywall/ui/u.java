package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.v1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class u implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ j71.a u;
    public final /* synthetic */ j71.a v;
    public final /* synthetic */ com.github.rudroid.copilot.inapppurchase.j0 w;

    public /* synthetic */ u(String str, String str2, j71.a aVar, j71.a aVar2, com.github.rudroid.copilot.inapppurchase.j0 j0Var, int i) {
        this.r = i;
        this.s = str;
        this.t = str2;
        this.u = aVar;
        this.v = aVar2;
        this.w = j0Var;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    w.d(p2.u(w1.o.a), this.s, this.t, this.u, this.v, this.w, sVar, 6, 0);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
                    int hashCode = Long.hashCode(sVar2.T);
                    v1 l = sVar2.l();
                    w1.o oVar = w1.o.a;
                    w1.r c = w1.a.c(sVar2, oVar);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar);
                    } else {
                        sVar2.q0();
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                    w.d(androidx.compose.foundation.layout.y.a.a(oVar, w1.c.v), this.s, this.t, this.u, this.v, this.w, sVar2, 0, 0);
                    sVar2.q(true);
                } else {
                    sVar2.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    w.d(p2.u(w1.o.a), this.s, this.t, this.u, this.v, this.w, sVar3, 6, 0);
                } else {
                    sVar3.V();
                }
                break;
        }
        return w61.a0.a;
    }
}
