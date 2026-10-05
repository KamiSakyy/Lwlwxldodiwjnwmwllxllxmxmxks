package com.github.rudroid.uitoolkit.text;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.starredreposandlists.u0;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, String str, w1.r rVar, boolean z) {
        int i3;
        w1.r rVar2;
        int i4;
        w1.r rVar3;
        w1.r rVar4;
        w1.r rVar5;
        w1.r a;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onClear");
        k71.k.g(str, "contentDescription");
        sVar2.e0(388142154);
        if ((i & 6) == 0) {
            i3 = (sVar2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i3 | (sVar2.f(rVar2) ? 2048 : 1024);
        }
        if (sVar2.S(i4 & 1, (i4 & 1171) != 1170)) {
            w1.r rVar6 = w1.o.a;
            rVar3 = i5 != 0 ? rVar6 : rVar2;
            i3 b = a0.j.b(z ? 1.0f : 0.0f, (a0.o) null, "ClearIconAlpha", sVar2, 3072, 22);
            w1.r o = p2.o(rVar3, ih.a.K);
            if (z) {
                sVar2.c0(1091377063);
                sVar2.q(false);
                rVar4 = rVar6;
                rVar5 = o;
                a = f0.o.m(rVar4, false, str, new d3.k(0), aVar, 9);
            } else {
                rVar4 = rVar6;
                rVar5 = o;
                sVar2.c0(1091573200);
                Object N = sVar2.N();
                if (N == androidx.compose.runtime.n.a) {
                    N = new u0(18);
                    sVar2.n0(N);
                }
                a = d3.q.a(rVar4, (j71.c) N);
                sVar2.q(false);
            }
            w1.r f = rVar5.f(a);
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, f);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, d);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            p5.a(z3.C(2131231499, 0, sVar2), z ? str : null, a2.i.a(p2.o(rVar4, ih.a.M), ((Number) b.getValue()).floatValue()), ih.d.b(sVar2).A, sVar2, 8, 0);
            sVar2 = sVar2;
            sVar2.q(true);
        } else {
            sVar2.V();
            rVar3 = rVar2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.copilothome.ui.k0(z, aVar, str, rVar3, i, i2);
        }
    }
}
