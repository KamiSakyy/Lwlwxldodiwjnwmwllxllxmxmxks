package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final void a(int i, androidx.compose.runtime.s sVar, j71.a aVar, w1.r rVar) {
        j71.a aVar2;
        w1.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onCreateNewListClick");
        sVar2.e0(-167565422);
        int i2 = i | (sVar.h(aVar) ? 4 : 2) | 48;
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
            Object N = sVar2.N();
            Object obj = androidx.compose.runtime.n.a;
            if (N == obj) {
                N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(27);
                sVar2.n0(N);
            }
            w1.r rVar3 = w1.o.a;
            w1.r z = androidx.compose.foundation.layout.b.z(f0.o.f(d3.q.b(rVar3, true, (j71.c) N), ih.d.b(sVar2).b, d2.a0.b), 0.0f, ih.a.p, 1);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, z);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            float f = ih.a.n;
            ub.b(i4.p0(2131953010, sVar2), androidx.compose.foundation.layout.b.z(rVar3, f, 0.0f, 2), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).a, sVar, 0, 0, 131068);
            float f2 = ih.a.l;
            ub.b(i4.p0(2131953009, sVar), androidx.compose.foundation.layout.b.y(rVar3, f, f2), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).q, sVar, 0, 0, 130044);
            sVar2 = sVar;
            rVar2 = rVar3;
            w1.r e = p2.e(androidx.compose.foundation.layout.b.y(rVar2, f, f2), 1.0f);
            boolean z2 = (i2 & 14) == 4;
            Object N2 = sVar2.N();
            if (z2 || N2 == obj) {
                aVar2 = aVar;
                N2 = new com.github.rudroid.actions.checkdetail.ui.m(24, aVar2);
                sVar2.n0(N2);
            } else {
                aVar2 = aVar;
            }
            sg.y.a(100663296, 250, null, sVar2, null, null, null, null, (j71.a) N2, a.a, e, false);
            sVar2.q(true);
        } else {
            aVar2 = aVar;
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new x0(aVar2, rVar2, i);
        }
    }
}
