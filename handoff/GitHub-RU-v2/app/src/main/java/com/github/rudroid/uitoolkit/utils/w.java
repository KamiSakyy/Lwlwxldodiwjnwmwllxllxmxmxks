package com.github.rudroid.uitoolkit.utils;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final void a(w1.r rVar, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(-2045580564);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (N == iVar) {
                g gVar = new g();
                gVar.a = 0L;
                sVar.n0(gVar);
                obj = gVar;
            }
            g gVar2 = (g) obj;
            boolean h = sVar.h(gVar2);
            Object N2 = sVar.N();
            if (h || N2 == iVar) {
                N2 = new v(gVar2);
                sVar.n0(N2);
            }
            v0 v0Var = (v0) N2;
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, v0Var);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            dVar.f(gVar2, sVar, Integer.valueOf(i2 & 112));
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.copilothome.ui.u(rVar, dVar, i, 3, (byte) 0);
        }
    }

    public static final void b(r1.d dVar, r1.d dVar2, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(586818177);
        if (sVar.S(i & 1, (i & 19) != 18)) {
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new u(dVar, dVar2);
                sVar.n0(N);
            }
            androidx.compose.ui.layout.z.c((w1.r) null, (j71.e) N, sVar, 0, 1);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new u(dVar, dVar2, i);
        }
    }
}
