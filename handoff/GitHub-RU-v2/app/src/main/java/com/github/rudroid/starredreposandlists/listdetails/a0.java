package com.github.rudroid.starredreposandlists.listdetails;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public static final void a(w1.r rVar, com.github.service.models.response.a aVar, String str, String str2, int i, androidx.compose.runtime.s sVar, int i2) {
        w1.r rVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "listName");
        k71.k.g(str2, "listDescription");
        sVar2.e0(1269508430);
        int i3 = i2 | 6 | (sVar2.h(aVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sVar2.d(i) ? 16384 : 8192;
        }
        if (sVar2.S(i3 & 1, (i3 & 9363) != 9362)) {
            w1.r rVar3 = w1.o.a;
            w1.r f = f0.o.f(p2.e(rVar3, 1.0f), ih.d.b(sVar2).o, d2.a0.b);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
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
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            float f2 = 16;
            int a2 = com.github.rudroid.uitoolkit.utils.h.a(f2, sVar2);
            float f3 = ih.a.n;
            com.github.rudroid.uitoolkit.listitems.b0.a(androidx.compose.foundation.layout.b.B(rVar3, f3, f3, f3, 0.0f, 8), aVar.x, com.github.rudroid.utilities.l.b(aVar.y, a2), f2, null, sVar, 3072, 16);
            boolean z = (i3 & 896) == 256;
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = com.github.rudroid.utilities.g0.a(str);
                sVar.n0(N);
            }
            com.github.rudroid.utilities.d0 d0Var = (com.github.rudroid.utilities.d0) N;
            float f4 = ih.a.l;
            int i4 = i3;
            ub.c(d0Var.a, androidx.compose.foundation.layout.b.B(rVar3, f3, f4, f3, 0.0f, 8), 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, d0Var.b, (j71.c) null, g3.q0.a(ih.d.f(sVar).a, ih.d.b(sVar).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 196604);
            androidx.compose.runtime.s sVar3 = sVar;
            if (t71.p.T(str2)) {
                sVar3.c0(-2066826358);
            } else {
                sVar3.c0(-2064081494);
                ub.b(str2, androidx.compose.foundation.layout.b.B(rVar3, f3, f4, f3, 0.0f, 8), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar3).j, ih.d.b(sVar3).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, (i4 >> 9) & 14, 0, 131068);
                sVar3 = sVar;
            }
            sVar3.q(false);
            w1.r B = androidx.compose.foundation.layout.b.B(rVar3, f3, f4, f3, 0.0f, 8);
            l2 a3 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar3, 48);
            int hashCode2 = Long.hashCode(sVar3.T);
            v1 l2 = sVar3.l();
            w1.r c2 = w1.a.c(sVar3, B);
            sVar3.g0();
            if (sVar3.S) {
                sVar3.k(fVar);
            } else {
                sVar3.q0();
            }
            androidx.compose.runtime.t.I(sVar3, eVar, a3);
            androidx.compose.runtime.t.I(sVar3, eVar2, l2);
            f1.e.t(hashCode2, sVar3, eVar3, sVar3, dVar);
            androidx.compose.runtime.t.I(sVar3, eVar4, c2);
            p5.a(z3.C(2131231418, 0, sVar3), (String) null, p2.o(rVar3, f2), ih.d.b(sVar3).A, sVar3, 440, 0);
            ub.b(String.valueOf(i), androidx.compose.foundation.layout.b.B(rVar3, f4, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar).j, ih.d.b(sVar).A, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131068);
            sVar.q(true);
            com.github.rudroid.uitoolkit.k0.a(androidx.compose.foundation.layout.b.B(p2.e(rVar3, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13), 0L, 0L, 0.0f, false, sVar, 0, 30);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar3;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.achievements.ui.b0(rVar2, aVar, str, str2, i, i2, 17);
        }
    }
}
