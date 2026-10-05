package com.github.rudroid.uitoolkit.avatarslayout;

import a0.s0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public static final void a(w1.r rVar, final float f, final r1.d dVar, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        sVar.e0(777135121);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                rVar = w1.o.a;
            }
            boolean z = (i3 & 112) == 32;
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new o(f);
                sVar.n0(N);
            }
            v0 v0Var = (v0) N;
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
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
            s0.x((i5 >> 6) & 14, dVar, sVar, true);
        } else {
            sVar.V();
        }
        final w1.r rVar2 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.avatarslayout.n
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.a(rVar2, f, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                    return a0.a;
                }
            };
        }
    }
}
