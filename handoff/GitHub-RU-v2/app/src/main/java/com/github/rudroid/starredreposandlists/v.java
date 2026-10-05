package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.starredreposandlists.h;
import com.google.android.gms.internal.measurement.i4;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public static final void a(w1.r rVar, j71.a aVar, h.c cVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z;
        boolean z2;
        k71.k.g(aVar, "onNewListClick");
        sVar.e0(1802184678);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = i | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        int i5 = i3 | (sVar.f(cVar) ? 256 : 128);
        if (sVar.S(i5 & 1, (i5 & 147) != 146)) {
            w1.r rVar3 = w1.o.a;
            w1.r rVar4 = i4 != 0 ? rVar3 : rVar2;
            w1.r p = f0.o.p(rVar4);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(28);
                sVar.n0(N);
            }
            w1.r f = f0.o.f(p2.e(d3.q.b(p, true, (j71.c) N), 1.0f), ih.d.b(sVar).b, d2.a0.b);
            float f2 = ih.a.n;
            float f3 = ih.a.l;
            w1.r B = androidx.compose.foundation.layout.b.B(f, f2, 0.0f, f3, 0.0f, 10);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, B);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            w1.r B2 = androidx.compose.foundation.layout.b.B(rVar3, 0.0f, f2, 0.0f, f2, 5);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            com.github.rudroid.uitoolkit.text.k.b(B2.f(new w1(1.0f, true)), com.github.rudroid.uitoolkit.text.m.b(Integer.valueOf(cVar.s), null, null, 14), androidx.compose.foundation.layout.b.f(0.0f, 0.0f, f2, 0.0f, 11), ih.d.b(sVar).z, null, null, r1.i.d(1818840433, new androidx.compose.runtime.b1(24, cVar), sVar), sVar, 1572864, 48);
            if (cVar.u) {
                sVar.c0(-777773332);
                androidx.compose.foundation.layout.b.g(sVar, p2.s(rVar3, f3));
                String upperCase = i4.p0(2131953007, sVar).toUpperCase(Locale.ROOT);
                k71.k.f(upperCase, "toUpperCase(...)");
                z = false;
                z2 = true;
                sg.r.a(null, false, aVar, upperCase, i4.p0(2131953728, sVar), com.github.rudroid.uitoolkit.text.m.b(2131231405, null, null, 14), androidx.compose.foundation.layout.b.f(ih.a.k, 0.0f, 0.0f, 0.0f, 14), sVar, (i5 << 3) & 896, 3);
            } else {
                z = false;
                z2 = true;
                sVar.c0(-780144832);
            }
            sVar.q(z);
            sVar.q(z2);
            rVar2 = rVar4;
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.lazy.layout.w0(rVar2, aVar, cVar, i, i2, 13);
        }
    }
}
