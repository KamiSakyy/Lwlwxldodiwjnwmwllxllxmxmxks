package com.github.rudroid.utilities.ui.emojipicker;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.y;
import java.util.List;
import v71.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ z s;
    public final /* synthetic */ n0.z t;
    public final /* synthetic */ f1 u;

    public n(List list, z zVar, n0.z zVar2, f1 f1Var) {
        this.r = list;
        this.s = zVar;
        this.t = zVar2;
        this.u = f1Var;
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
            y yVar = (y) this.r.get(intValue);
            sVar.c0(1093427910);
            boolean z = ((y) this.u.getValue()) == yVar;
            z zVar = this.s;
            boolean h = sVar.h(zVar);
            n0.z zVar2 = this.t;
            boolean f = h | sVar.f(zVar2) | sVar.d(yVar.ordinal());
            Object N = sVar.N();
            if (f || N == androidx.compose.runtime.n.a) {
                N = new k(zVar, zVar2, yVar);
                sVar.n0(N);
            }
            t.a(yVar, z, (j71.c) N, sVar, 0);
            if (intValue < b.a.size() - 1) {
                sVar.c0(1094013158);
                k0.b(androidx.compose.foundation.layout.b.z(p2.f(w1.o.a, 48), 0.0f, ih.a.k, 1), 0L, 0.0f, 0.0f, 0.0f, sVar, 0, 30);
            } else {
                sVar.c0(1089099441);
            }
            sVar.q(false);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
