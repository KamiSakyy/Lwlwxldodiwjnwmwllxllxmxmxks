package com.github.rudroid.uitoolkit.swipetodismiss;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import h0.b2;
import h0.d1;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g0 g0Var, r1.d dVar, w1.r rVar, boolean z, boolean z2, r1.d dVar2, androidx.compose.runtime.s sVar, int i) {
        r1.d dVar3;
        boolean z3;
        int i2;
        k71.k.g(g0Var, "state");
        sVar.e0(-1509396710);
        int i3 = i | (sVar.f(g0Var) ? 4 : 2) | (sVar.f(rVar) ? 256 : 128) | (sVar.g(z) ? 2048 : 1024) | (sVar.g(z2) ? 16384 : 8192);
        boolean z4 = false;
        if (sVar.S(i3 & 1, (74899 & i3) != 74898)) {
            boolean z5 = sVar.j(g1.n) == s3.m.s;
            n nVar = g0Var.b;
            b2 b2Var = b2.s;
            if (((h0) nVar.f.getValue()) == h0.t) {
                i2 = 0;
                z4 = true;
            } else {
                i2 = 0;
            }
            k71.k.g(nVar, "state");
            int i4 = i2;
            w1.r a = d1.a(rVar, nVar.e, b2Var, z4, (j0.j) null, nVar.k.getValue() != null ? 1 : i4, new d(nVar, null), z5, 32);
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, true);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, a);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar, eVar, d);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
            v2.d dVar4 = v2.g.h;
            androidx.compose.runtime.t.E(sVar, dVar4);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar, eVar4, c);
            w1.r b = androidx.compose.foundation.layout.y.a.b();
            androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.l.a;
            w1.i iVar = w1.c.A;
            l2 a2 = j2.a(fVar2, iVar, sVar, i4);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            w1.r c2 = w1.a.c(sVar, b);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, eVar, a2);
            androidx.compose.runtime.t.I(sVar, eVar2, l2);
            f1.e.t(hashCode2, sVar, eVar3, sVar, dVar4);
            androidx.compose.runtime.t.I(sVar, eVar4, c2);
            n2 n2Var = n2.a;
            dVar.f(n2Var, sVar, 54);
            sVar.q(true);
            z3 = z;
            j0 j0Var = new j0(g0Var, z3, z2);
            l2 a3 = j2.a(fVar2, iVar, sVar, 0);
            int hashCode3 = Long.hashCode(sVar.T);
            v1 l3 = sVar.l();
            w1.r c3 = w1.a.c(sVar, j0Var);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, eVar, a3);
            androidx.compose.runtime.t.I(sVar, eVar2, l3);
            f1.e.t(hashCode3, sVar, eVar3, sVar, dVar4);
            androidx.compose.runtime.t.I(sVar, eVar4, c3);
            dVar3 = dVar2;
            dVar3.f(n2Var, sVar, 54);
            sVar.q(true);
            sVar.q(true);
        } else {
            dVar3 = dVar2;
            z3 = z;
            sVar.V();
        }
        androidx.compose.runtime.b2 t = sVar.t();
        if (t != null) {
            t.d = new e0(g0Var, dVar, rVar, z3, z2, dVar3, i);
        }
    }
}
