package com.github.rudroid.uitoolkit;

import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e3 {
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        if (r9 == androidx.compose.runtime.n.a) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final j71.c cVar, final String str, final String str2, final String str3, float f, androidx.compose.runtime.s sVar, final int i, final int i2) {
        w1.r rVar2;
        int i3;
        float f2;
        int i4;
        final w1.r rVar3;
        final float f3;
        Object obj;
        boolean z;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(cVar, "onClick");
        sVar2.e0(692947436);
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
            i3 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.f(str3) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i4 = i3 | 196608;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (sVar2.c(f2) ? 131072 : 65536);
        }
        if (sVar2.S(i4 & 1, (74899 & i4) != 74898)) {
            w1.r rVar4 = w1.o.a;
            w1.r rVar5 = i5 != 0 ? rVar4 : rVar2;
            float f4 = i6 != 0 ? ih.a.B : f2;
            w1.r e = androidx.compose.foundation.layout.p2.e(rVar5, 1.0f);
            d3.k kVar = new d3.k(0);
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object N = sVar2.N();
            if (!z2) {
                obj = N;
            }
            bd.c cVar2 = new bd.c(10, cVar, str);
            sVar2.n0(cVar2);
            obj = cVar2;
            w1.r m = f0.o.m(e, false, (String) null, kVar, (j71.a) obj, 11);
            androidx.compose.foundation.layout.l2 a = androidx.compose.foundation.layout.j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, m);
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
            int i7 = i4;
            v2.eShadow eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            w1.r rVar6 = rVar5;
            float f5 = f4;
            y1.a(a2.i.b(androidx.compose.foundation.layout.p2.o(rVar4, f4), r0.e.a), str3, null, sy.d0Shadow.n(new u9.a()), false, null, null, null, null, true, sVar2, ((i7 >> 9) & 112) | 196608, 6, 980);
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
            ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 1, false, 1, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).d, ih.d.b(sVar2).v, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, (i7 >> 6) & 14, 24960, 110590);
            sVar2 = sVar;
            if (str2 == null) {
                sVar2.c0(1575185691);
                z = false;
            } else {
                z = false;
                sVar2.c0(1575185692);
                ub.b(str2, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 1, false, 1, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).b, ih.d.b(sVar2).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 24960, 110590);
                sVar2 = sVar;
            }
            sVar2.q(z);
            sVar2.q(true);
            sVar2.q(true);
            rVar3 = rVar6;
            f3 = f5;
        } else {
            sVar2.V();
            rVar3 = rVar2;
            f3 = f2;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.d3
                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e3.a(rVar3, cVar, str, str2, str3, f3, (androidx.compose.runtime.s) obj2, androidx.compose.runtime.t.L(i | 1), i2);
                    return w61.a0.a;
                }
            };
        }
    }
}
