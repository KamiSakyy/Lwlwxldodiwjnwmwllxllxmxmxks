package com.github.rudroid.uitoolkit.avatar;

import a0.s0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.agents.copilothome.ui.u;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(r rVar, r1.d dVar, s sVar, int i) {
        int i2;
        sVar.e0(-1707757644);
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
            if (N == n.a) {
                N = b.a;
                sVar.n0(N);
            }
            v0 v0Var = (v0) N;
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, v0Var);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c);
            s0.x((i3 >> 6) & 14, dVar, sVar, true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new u(rVar, dVar, i, 2, (byte) 0);
        }
    }

}
