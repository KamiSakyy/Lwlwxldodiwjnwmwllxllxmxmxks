package com.github.rudroid.uitoolkit;

import android.content.Context;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r5 == androidx.compose.runtime.n.a) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, androidx.compose.runtime.s sVar, String str, w1.r rVar) {
        String str2;
        w1.r rVar2;
        Object obj;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1312994663);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.f(str) ? 32 : 16;
        }
        int i3 = i2;
        if (sVar2.S(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) sVar2.j(w2.j0.b);
            String p0 = i4.p0(2131953210, sVar2);
            r0.d a = r0.e.a(12);
            w1.h hVar = w1.c.E;
            float f = ih.a.n;
            float f2 = ih.a.l;
            w1.r rVar3 = w1.o.a;
            float f3 = (float) 0.1d;
            w1.r f4 = f0.o.f(f0.o.g(androidx.compose.foundation.layout.b.A(rVar3, f, f, f, f2), f3, ih.d.a(sVar2).l0, a), ih.d.a(sVar2).j0, a);
            boolean h = ((i3 & 112) == 32) | sVar2.h(context) | sVar2.f(p0);
            Object N = sVar2.N();
            if (!h) {
                obj = N;
            }
            com.github.rudroid.actions.workflowruns.ui.e eVar = new com.github.rudroid.actions.workflowruns.ui.e(str, context, p0, 8);
            sVar2.n0(eVar);
            obj = eVar;
            w1.r f5 = f0.o.m(f4, false, (String) null, (d3.k) null, (j71.a) obj, 15).f(rVar3);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, hVar, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, f5);
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
            w1.r B = androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f, 0.0f, 0.0f, 13);
            long j = ih.d.a(sVar2).v0;
            r0.d dVar = r0.e.a;
            w1.r g = f0.o.g(f0.o.f(B, j, dVar), f3, ih.d.a(sVar2).x0, dVar);
            float f6 = ih.a.m;
            p5.a(z3.C(2131231135, 0, sVar2), (String) null, androidx.compose.foundation.layout.b.x(g, f6), ih.d.a(sVar2).w0, sVar2, 56, 0);
            str2 = str;
            ub.b(str2, androidx.compose.foundation.layout.b.A(rVar3, f, f6, f, f), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).A, sVar, (i3 >> 3) & 14, 0, 130044);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            str2 = str;
            sVar2.V();
            rVar2 = rVar;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.u(rVar2, str2, i, 4);
        }
    }
}
