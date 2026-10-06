package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.m2;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, String str, w1.r rVar) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "message");
        sVar2.e0(964650545);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = i | (sVar2.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i5 = i3 | (sVar.f(str) ? 32 : 16);
        if (sVar2.S(i5 & 1, (i5 & 19) != 18)) {
            w1.r rVar4 = i4 != 0 ? w1.o.a : rVar2;
            w1.r z = androidx.compose.foundation.layout.b.z(f0.o.f(f0.o.w(p2.d(rVar4, 1.0f), f0.o.v(sVar2), true), ih.d.b(sVar2).a, d2.a0Shadow.b), ih.a.n, 0.0f, 2);
            boolean z2 = (i5 & 112) == 32;
            Object N = sVar2.N();
            if (z2 || N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.uitoolkit.listitems.z(str, 4);
                sVar2.n0(N);
            }
            w1.r a = d3.q.a(z, (j71.c) N);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.E, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, a);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).a, sVar2, (i5 >> 3) & 14, 0, 130046);
            sVar2 = sVar2;
            sVar2.q(true);
            rVar3 = rVar4;
        } else {
            sVar2.V();
            rVar3 = rVar2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new m2(rVar3, str, i, i2, 3);
        }
    }

    public static final void b(int i, int i2, androidx.compose.runtime.s sVar, w1.r rVar) {
        sVar.e0(1543502235);
        int i3 = i2 | 6 | (sVar.d(i) ? 32 : 16);
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            String p0 = i4.p0(i, sVar);
            w1.r rVar2 = w1.o.a;
            a(6, 0, sVar, p0, rVar2);
            rVar = rVar2;
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.accounts.m(i, i2, 3, rVar);
        }
    }
}
