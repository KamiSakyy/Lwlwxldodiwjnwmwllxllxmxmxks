package com.github.rudroid.uitoolkit;

import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 {
    public static final void a(w1.r rVar, String str, String str2, String str3, float f, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        float f2;
        int i4;
        w1.r rVar3;
        float f3;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-254437415);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str3) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i3 | 24576;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (sVar2.c(f2) ? 16384 : 8192);
        }
        if (sVar2.S(i4 & 1, (i4 & 9363) != 9362)) {
            w1.r rVar4 = w1.o.a;
            w1.r rVar5 = i5 != 0 ? rVar4 : rVar2;
            float f4 = i6 != 0 ? ih.a.B : f2;
            w1.r e = androidx.compose.foundation.layout.p2.e(rVar5, 1.0f);
            androidx.compose.foundation.layout.l2 a = androidx.compose.foundation.layout.j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.eShadow eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a);
            v2.eShadow eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            v2.eShadow eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            float f5 = 4;
            float W = ((s3.c) sVar2.j(w2.g1.h)).W(f5);
            float f6 = f4;
            int i7 = i4;
            w1.r rVar6 = rVar5;
            y1.a(a2.i.b(androidx.compose.foundation.layout.p2.o(rVar4, f4), r0.e.a(f5)), str3, null, sy.d0Shadow.n(new u9.c(W, W, W, W)), false, null, null, null, null, true, sVar2, ((i4 >> 6) & 112) | 196608, 6, 980);
            w1.r B = androidx.compose.foundation.layout.b.B(rVar4, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.e, w1.c.D, sVar2, 6);
            int hashCode2 = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, B);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, eVar, a2);
            androidx.compose.runtime.t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            androidx.compose.runtime.t.I(sVar2, eVar4, c2);
            if (str2 == null) {
                sVar2.c0(-737655794);
                sVar2.q(false);
            } else {
                sVar2.c0(-737655793);
                ub.b(str2, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 1, false, 1, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).b, ih.d.b(sVar2).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 24960, 110590);
                sVar2 = sVar;
                sVar2.q(false);
            }
            ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 1, false, 1, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).d, ih.d.b(sVar2).v, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, (i7 >> 3) & 14, 24960, 110590);
            sVar2 = sVar;
            sVar2.q(true);
            sVar2.q(true);
            rVar3 = rVar6;
            f3 = f6;
        } else {
            sVar2.V();
            rVar3 = rVar2;
            f3 = f2;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.fileschanged.ui.v(rVar3, str, str2, str3, f3, i, i2);
        }
    }
}
