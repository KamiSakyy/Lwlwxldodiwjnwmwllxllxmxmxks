package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final void a(int i, androidx.compose.runtime.s sVar, j71.a aVar, String str, w1.r rVar) {
        w1.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "switchAccountsAction");
        sVar2.e0(-345650835);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(str) ? 256 : 128;
        }
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = no.a.f(sVar2);
            }
            b2.a0 a0Var = (b2.a0) N;
            Object N2 = sVar2.N();
            if (N2 == iVar) {
                N2 = androidx.compose.runtime.t.p(sVar2);
                sVar2.n0(N2);
            }
            v71.z zVar = (v71.z) N2;
            boolean h = sVar2.h(zVar);
            Object N3 = sVar2.N();
            if (h || N3 == iVar) {
                N3 = new f0(zVar, a0Var, null);
                sVar2.n0(N3);
            }
            androidx.compose.runtime.t.f(sVar2, (j71.e) N3, a0Var);
            w1.r rVar3 = w1.o.a;
            w1.r f = androidx.compose.foundation.layout.p2.d(rVar3, 1.0f).f(rVar3);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, f);
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
            c3.a((i2 >> 3) & 112, sVar2, str, null);
            float f2 = ih.a.n;
            ub.b(i4.p0(2131954911, sVar2), f0.o.r(b2.d.k(androidx.compose.foundation.layout.b.B(rVar3, f2, ih.a.l, f2, 0.0f, 8), a0Var), false, 3), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).o, sVar, 0, 0, 130044);
            sVar2 = sVar;
            sg.k0.b(androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f2, 0.0f, 0.0f, 13), false, aVar, null, i4.p0(2131951861, sVar2), null, sVar2, ((i2 << 3) & 896) | 6, 42);
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.feed.ui.f(rVar2, aVar, str, i, 1);
        }
    }
}
