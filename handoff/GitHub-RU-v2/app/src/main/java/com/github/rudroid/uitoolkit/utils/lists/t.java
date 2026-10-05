package com.github.rudroid.uitoolkit.utils.lists;

import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.m1;
import java.util.List;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(m0.s sVar, int i, j71.a aVar, j71.a aVar2, androidx.compose.runtime.s sVar2, int i2) {
        int i3;
        k71.k.g(sVar, "<this>");
        k71.k.g(aVar, "canLoadNextPage");
        k71.k.g(aVar2, "loadPage");
        sVar2.e0(-996904950);
        if ((i2 & 6) == 0) {
            i3 = (sVar2.f(sVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= sVar2.h(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar2.h(aVar2) ? 2048 : 1024;
        }
        if (sVar2.S(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object N = sVar2.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new n(sVar, aVar, aVar2, null);
                sVar2.n0(N);
            }
            androidx.compose.runtime.t.g(sVar, aVar, aVar2, (j71.e) N, sVar2);
            i = 5;
        } else {
            sVar2.V();
        }
        int i5 = i;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new w0(i5, i2, 16, sVar, aVar, aVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public static final boolean b(m0.s sVar) {
        k71.k.g(sVar, "<this>");
        m0.m mVar = (m0.m) x61.m.W((List) sVar.h().k);
        return mVar != null && mVar.o == 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public static final boolean c(m0.s sVar) {
        k71.k.g(sVar, "<this>");
        m0.m mVar = (m0.m) x61.m.f0((List) sVar.h().k);
        if (mVar == null) {
            return false;
        }
        return mVar.a + 1 == sVar.h().n && mVar.o + mVar.p <= sVar.h().m + sVar.h().l;
    }

    public static final int d(m0.s sVar, int i, androidx.compose.runtime.s sVar2) {
        k71.k.g(sVar, "<this>");
        boolean d = sVar2.d(i);
        Object N = sVar2.N();
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        if (d || N == iVar) {
            N = new m1(Integer.MAX_VALUE);
            sVar2.n0(N);
        }
        m1 m1Var = (m1) N;
        Integer valueOf = Integer.valueOf(i);
        boolean f = sVar2.f(sVar) | sVar2.d(i) | sVar2.c(4.0f) | sVar2.f(m1Var);
        Object N2 = sVar2.N();
        if (f || N2 == iVar) {
            N2 = new s(sVar, i, m1Var, null);
            sVar2.n0(N2);
        }
        androidx.compose.runtime.t.h(sVar, valueOf, (j71.e) N2, sVar2);
        return m1Var.y();
    }

    public static final float e(m0.s sVar, boolean z, androidx.compose.runtime.s sVar2, int i) {
        k71.k.g(sVar, "<this>");
        boolean z2 = (i & 1) != 0 ? false : z;
        sVar2.c0(435904140);
        s3.c cVar = (s3.c) sVar2.j(g1.h);
        float f = qg.p.a;
        int i0 = cVar.i0(f);
        int i02 = cVar.i0(f);
        int i03 = cVar.i0(ih.a.f);
        Object N = sVar2.N();
        if (N == androidx.compose.runtime.n.a) {
            N = androidx.compose.runtime.t.s(new com.github.rudroid.uitoolkit.utils.a0(sVar, i02, z2, i03, i0, 1));
            sVar2.n0(N);
        }
        float E = cVar.E(((Number) ((i3) N).getValue()).intValue());
        sVar2.q(false);
        return E;
    }
}
