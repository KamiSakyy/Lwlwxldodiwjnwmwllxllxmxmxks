package com.github.rudroid.starredreposandlists.listdetails;

import androidx.compose.runtime.b2;
import androidx.lifecycle.d1;
import com.github.rudroid.utilities.ui.g1;
import y71.n1;
import y71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public static final void a(m0.s sVar, s0 s0Var, j71.a aVar, j71.a aVar2, com.github.rudroid.interfaces.m0 m0Var, j71.c cVar, com.github.rudroid.html.b bVar, androidx.compose.runtime.s sVar2, int i) {
        s0 s0Var2;
        s0 s0Var3;
        sVar2.e0(802032918);
        int i2 = i | (sVar2.f(sVar) ? 4 : 2) | 16 | (sVar2.h(aVar) ? 256 : 128) | (sVar2.h(aVar2) ? 2048 : 1024) | (sVar2.f(m0Var) ? 16384 : 8192) | (sVar2.h(cVar) ? 131072 : 65536) | (sVar2.h(bVar) ? 1048576 : 524288);
        if (sVar2.S(i2 & 1, (599187 & i2) != 599186)) {
            sVar2.X();
            if ((i & 1) == 0 || sVar2.A()) {
                androidx.lifecycle.r a = u6.a.a(sVar2);
                if (a == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0Var3 = (s0) t.e.v(k71.x.a(s0.class), a, a instanceof androidx.lifecycle.r ? a.g0() : t6.a.b, sVar2);
            } else {
                sVar2.V();
                s0Var3 = s0Var;
            }
            sVar2.r();
            com.github.rudroid.uitoolkit.utils.z.a(f0.o.f(w1.o.a, ih.d.b(sVar2).b, d2.a0.b), r1.i.d(168256266, new com.github.rudroid.profile.status.ui.x(aVar2, cVar, sVar), sVar2), null, null, null, 0, 0L, 0L, r1.i.d(-1607397292, new com.github.rudroid.actions.workflowruns.ui.f(androidx.compose.runtime.t.n(n1.G(new c00.g(s0Var3.A, s0Var3.B, new k0(s0Var3, null), 27), d1.k(s0Var3), q1.a(3), g1.a.c(g1.Companion)), sVar2), aVar, sVar, m0Var, bVar, 7), sVar2), sVar2, 100663344, 252);
            s0Var2 = s0Var3;
        } else {
            sVar2.V();
            s0Var2 = s0Var;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.achievements.ui.i0(sVar, s0Var2, aVar, aVar2, m0Var, cVar, bVar, i, 15);
        }
    }

    public static final void b(p01.n nVar, com.github.rudroid.interfaces.m0 m0Var, com.github.rudroid.html.b bVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(-1814919412);
        int i2 = (sVar.h(nVar) ? 4 : 2) | i | (sVar.f(m0Var) ? 32 : 16) | (sVar.h(bVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = w.z;
                sVar.n0(N);
            }
            j71.f fVar = (k71.i) N;
            boolean h = sVar.h(nVar) | ((i2 & 112) == 32) | sVar.h(bVar);
            Object N2 = sVar.N();
            if (h || N2 == iVar) {
                N2 = new c6.b(m0Var, nVar, bVar, 25);
                sVar.n0(N2);
            }
            v3.k.d(fVar, (w1.r) null, (j71.c) N2, sVar, 6);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.profile.status.ui.x(nVar, m0Var, bVar, i, 11);
        }
    }
}
