package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final void a(w1.r rVar, w1 w1Var, boolean z, f2 f2Var, j71.a aVar, String str, String str2, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        r1.d dVar2;
        w1.r rVar2;
        int i2;
        String d;
        b2.a0 a0Var;
        Object aVar2;
        w1.r rVar3;
        long j;
        i3 i3Var;
        int i3;
        boolean z2;
        k71.k.g(str2, "collapsedContentDescription");
        sVar.e0(-119888970);
        int i4 = i | 6 | (sVar.g(z) ? 256 : 128) | (sVar.f(f2Var) ? 2048 : 1024) | (sVar.h(aVar) ? 16384 : 8192) | (sVar.f(str) ? 131072 : 65536) | (sVar.f(str2) ? 1048576 : 524288) | 12582912;
        if (sVar.S(i4 & 1, (38347923 & i4) != 38347922)) {
            long j2 = ih.d.b(sVar).b;
            Object N = sVar.N();
            Object obj = androidx.compose.runtime.n.a;
            if (N == obj) {
                N = androidx.compose.runtime.t.B(new s3.f(Integer.MAX_VALUE));
                sVar.n0(N);
            }
            androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) N;
            boolean z3 = (i4 & 896) == 256;
            Object N2 = sVar.N();
            if (z3 || N2 == obj) {
                N2 = androidx.compose.runtime.t.s(new g(z, f1Var, 0));
                sVar.n0(N2);
            }
            i3 i3Var2 = (i3) N2;
            boolean booleanValue = ((Boolean) i3Var2.getValue()).booleanValue();
            w1.r rVar4 = w1.o.a;
            w1.r f = booleanValue ? p2.f(rVar4, 348) : p2.u(rVar4);
            Object N3 = sVar.N();
            if (N3 == obj) {
                N3 = no.a.f(sVar);
            }
            b2.a0 a0Var2 = (b2.a0) N3;
            if (z) {
                i2 = i4;
                d = com.github.rudroid.m0.d(sVar, 1801608444, 2131954158, sVar, false);
            } else {
                i2 = i4;
                d = com.github.rudroid.m0.d(sVar, 1801693725, 2131954159, sVar, false);
            }
            s3.c cVar = (s3.c) sVar.j(w2.g1.h);
            boolean f2 = sVar.f(i3Var2);
            Object N4 = sVar.N();
            if (f2 || N4 == obj) {
                N4 = new com.github.rudroid.settings.copilot.debug.q((Object) i3Var2, (Object) a0Var2, false, 12);
                sVar.n0(N4);
            }
            w1.r a = z.a0.a(rVar4, (j71.e) N4, 1);
            String str3 = d;
            boolean f3 = ((i2 & 57344) == 16384) | ((i2 & 3670016) == 1048576) | sVar.f(d) | ((i2 & 458752) == 131072);
            Object N5 = sVar.N();
            if (f3 || N5 == obj) {
                a0Var = a0Var2;
                rVar3 = rVar4;
                j = j2;
                i3Var = i3Var2;
                i3 = 348;
                aVar2 = new a0.a(str2, str3, aVar, str, 10);
                sVar.n0(aVar2);
            } else {
                i3Var = i3Var2;
                a0Var = a0Var2;
                j = j2;
                i3 = 348;
                aVar2 = N5;
                rVar3 = rVar4;
            }
            w1.r e = p2.e(androidx.compose.foundation.layout.b.z(f0.o.r(b2.d.k(d3.q.b(a, true, (j71.c) aVar2), a0Var), false, 3), 0.0f, ih.a.l, 1), 1.0f);
            androidx.compose.ui.layout.v0 d2 = androidx.compose.foundation.layout.t.d(w1.c.r, false);
            int hashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, d2);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            w1.r w = androidx.compose.foundation.layout.b.w(f, f2Var);
            boolean f4 = sVar.f(cVar);
            Object N6 = sVar.N();
            if (f4 || N6 == obj) {
                N6 = new h(cVar, f1Var, 0);
                sVar.n0(N6);
            }
            z.a(w, w1Var, null, null, null, null, (j71.c) N6, sVar, 12582960, 60);
            if (((Boolean) i3Var.getValue()).booleanValue()) {
                sVar.c0(1359827986);
                z2 = false;
                androidx.compose.foundation.layout.t.a(f0.o.e(p2.e(p2.f(rVar3, i3), 1.0f), rb0.b.b(x61.l.r(new d2.t[]{new d2.t(d2.t.j), new d2.t(j)}))), sVar, 0);
                dVar2 = dVar;
                dVar2.f(androidx.compose.foundation.layout.y.a, sVar, 54);
            } else {
                dVar2 = dVar;
                z2 = false;
                sVar.c0(1355608018);
            }
            sVar.q(z2);
            sVar.q(true);
            rVar2 = rVar3;
        } else {
            dVar2 = dVar;
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.fragments.ui.t(rVar2, w1Var, z, f2Var, aVar, str, str2, dVar2, i);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f2<T1,T2,T3,T4> {
        public f2() {
        }
    }
}
