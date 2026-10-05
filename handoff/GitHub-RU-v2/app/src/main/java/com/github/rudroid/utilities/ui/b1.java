package com.github.rudroid.utilities.ui;

import android.content.res.Resources;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 {
    public static final void a(w1.r rVar, long j, androidx.compose.runtime.s sVar, int i) {
        long j2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-869667398);
        int i2 = i | 54;
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
            String[] stringArray = ((Resources) sVar2.j(w2.j0.c)).getStringArray(2130903066);
            Object N = sVar2.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (N == iVar) {
                androidx.compose.runtime.m1 m1Var = new androidx.compose.runtime.m1(0);
                sVar2.n0(m1Var);
                obj = m1Var;
            }
            androidx.compose.runtime.m1 m1Var2 = (androidx.compose.runtime.m1) obj;
            w1.r rVar2 = w1.o.a;
            w1.r x = androidx.compose.foundation.layout.b.x(p2.d(rVar2, 1.0f), ih.a.q);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, x);
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
            com.github.rudroid.uitoolkit.f1.a(null, null, 0.0f, 0L, sVar2, 0, 15);
            z.i.b(Integer.valueOf(m1Var2.y() % stringArray.length), (w1.r) null, (j71.c) null, w1.c.v, (String) null, (j71.c) null, r1.i.d(1967300218, new androidx.compose.runtime.a1(5, stringArray), sVar2), sVar, 1575936, 54);
            sVar2 = sVar;
            sVar2.q(true);
            Object N2 = sVar2.N();
            j2 = 3000;
            if (N2 == iVar) {
                N2 = new a1(3000L, m1Var2, null);
                sVar2.n0(N2);
            }
            androidx.compose.runtime.t.f(sVar2, (j71.e) N2, "LongLoadingProgressContent");
            rVar = rVar2;
        } else {
            sVar2.V();
            j2 = j;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new z0(rVar, j2, i);
        }
    }
}
