package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.p1;
import com.github.rudroid.starredreposandlists.h;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public static final void a(h.d dVar, j71.a aVar, w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        j71.a aVar2;
        w1.r rVar2;
        k71.k.g(aVar, "onSelect");
        sVar.e0(-1175767942);
        int i2 = (sVar.f(dVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            w1.r rVar3 = w1.o.a;
            w1.r m = f0.o.m(p2.e(rVar3, 1.0f), false, i4.p0(2131953850, sVar), (d3.k) null, aVar, 13);
            aVar2 = aVar;
            sVar.c0(-1003410150);
            sVar.c0(212064437);
            sVar.q(false);
            s3.c cVar = (s3.c) sVar.j(w2.g1.h);
            Object N = sVar.N();
            Object obj = androidx.compose.runtime.n.a;
            if (N == obj) {
                N = new y3.o(cVar);
                sVar.n0(N);
            }
            y3.o oVar = (y3.o) N;
            Object N2 = sVar.N();
            if (N2 == obj) {
                N2 = new y3.k();
                sVar.n0(N2);
            }
            y3.k kVar = (y3.k) N2;
            Object N3 = sVar.N();
            if (N3 == obj) {
                N3 = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar.n0(N3);
            }
            androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N3;
            Object N4 = sVar.N();
            if (N4 == obj) {
                N4 = new y3.m(kVar);
                sVar.n0(N4);
            }
            y3.m mVar = (y3.m) N4;
            Object N5 = sVar.N();
            if (N5 == obj) {
                p1 p1Var = new p1(w61.a0.a, androidx.compose.runtime.i.u);
                sVar.n0(p1Var);
                N5 = p1Var;
            }
            androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) N5;
            boolean h = sVar.h(oVar) | sVar.d(257);
            Object N6 = sVar.N();
            if (h || N6 == obj) {
                N6 = new l(f1Var2, oVar, mVar, f1Var);
                sVar.n0(N6);
            }
            androidx.compose.ui.layout.v0 v0Var = (androidx.compose.ui.layout.v0) N6;
            Object N7 = sVar.N();
            if (N7 == obj) {
                N7 = new m(f1Var, mVar);
                sVar.n0(N7);
            }
            j71.a aVar3 = (j71.a) N7;
            boolean h2 = sVar.h(oVar);
            Object N8 = sVar.N();
            if (h2 || N8 == obj) {
                N8 = new n(oVar);
                sVar.n0(N8);
            }
            androidx.compose.ui.layout.z.a(d3.q.b(m, false, (j71.c) N8), r1.i.d(1200550679, new o(f1Var2, kVar, aVar3, dVar), sVar), v0Var, sVar, 48);
            sVar.q(false);
            rVar2 = rVar3;
        } else {
            aVar2 = aVar;
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.lazy.layout.k0(dVar, aVar2, rVar2, i, 27);
        }
    }
    public Object C() { return null; }
    public Object g(Object p1) { return null; }
    public Object g0() { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object q0() { return null; }
    public Object S = null;
    public Object T = null;
}
