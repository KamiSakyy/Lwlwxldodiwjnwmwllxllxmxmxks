package com.github.rudroid.uitoolkit.copilot;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import f1.ub;
import g3.q0;
import g3.z;
import w1.o;
import w1.r;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
final class g implements j71.e {
    public final /* synthetic */ c r;

    public g(c cVar) {
        this.r = cVar;
    }

    public final Object s(Object obj, Object obj2) {
        s sVar = (s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
            r z = androidx.compose.foundation.layout.b.z(o.a, 0.0f, ih.a.m, 1);
            e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, z);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, a);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c);
            c cVar = this.r;
            ub.b(cVar.a, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).o, 0L, t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213), sVar, 0, 0, 131070);
            ub.b(cVar.b, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).l, ih.d.b(sVar).s, t1.C(12), k3.s.w, (k3.o) null, (k3.i) null, t1.B(0.1d), 0, 0L, (z) null, (r3.i) null, 16777080), sVar, 0, 0, 131070);
            sVar.q(true);
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
