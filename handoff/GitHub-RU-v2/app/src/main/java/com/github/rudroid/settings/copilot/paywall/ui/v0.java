package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.p2;
import java.util.Iterator;
import java.util.List;
import xn.e1;
import xn.r2;
import xn.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ r2 s;
    public final /* synthetic */ j71.c t;
    public final /* synthetic */ e1 u;

    public v0(List list, r2 r2Var, j71.c cVar, e1 e1Var) {
        this.r = list;
        this.s = r2Var;
        this.t = cVar;
        this.u = e1Var;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
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
            e1 e1Var = (e1) this.r.get(intValue);
            sVar.c0(-1474563534);
            Iterator it = this.s.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it.next();
                if (((x2) obj5).a == e1Var) {
                    break;
                }
            }
            x2 x2Var = (x2) obj5;
            if (x2Var != null) {
                sVar.c0(-1474410736);
                w1.o oVar = w1.o.a;
                w1.r e = p2.e(oVar, 1.0f);
                j71.c cVar = this.t;
                boolean f = sVar.f(cVar) | sVar.d(e1Var.ordinal());
                Object N = sVar.N();
                if (f || N == androidx.compose.runtime.n.a) {
                    N = new r0(cVar, e1Var);
                    sVar.n0(N);
                }
                w1.r m = f0.o.m(e, false, (String) null, (d3.k) null, (j71.a) N, 15);
                float f2 = ih.a.n;
                n0.a(androidx.compose.foundation.layout.b.z(m, f2, 0.0f, 2), this.u == e1Var, x2Var, sVar, 0, 0);
                com.github.rudroid.m0.C(oVar, f2, sVar, false);
            } else {
                sVar.c0(-1478246738);
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
