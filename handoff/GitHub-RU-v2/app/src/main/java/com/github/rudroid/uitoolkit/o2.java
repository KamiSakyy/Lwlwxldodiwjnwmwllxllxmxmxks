package com.github.rudroid.uitoolkit;

import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 {
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r7 == androidx.compose.runtime.n.a) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, String str, String str2, w1.r rVar, boolean z) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        Object obj;
        long j;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "title");
        k71.k.g(aVar, "onClick");
        k71.k.g(str2, "iconContentDescription");
        sVar2.e0(-990285860);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.f(str2) ? 16384 : 8192;
        }
        if (sVar2.S(i3 & 1, (i3 & 9363) != 9362)) {
            w1.r rVar4 = w1.o.a;
            w1.r rVar5 = i4 != 0 ? rVar4 : rVar2;
            boolean z2 = (i3 & 7168) == 2048;
            Object N = sVar2.N();
            if (!z2) {
                obj = N;
            }
            com.github.rudroid.actions.checkdetail.ui.m mVar = new com.github.rudroid.actions.checkdetail.ui.m(26, aVar);
            sVar2.n0(mVar);
            obj = mVar;
            w1.r rVar6 = rVar5;
            w1.r e = androidx.compose.foundation.layout.p2.e(androidx.compose.foundation.layout.b.z(androidx.compose.foundation.layout.p2.f(f0.o.m(rVar5, false, (String) null, (d3.k) null, (j71.a) obj, 15), 48), ih.a.n, 0.0f, 2), 1.0f);
            androidx.compose.foundation.layout.l2 a = androidx.compose.foundation.layout.j2.a(androidx.compose.foundation.layout.l.g, w1.c.B, sVar2, 54);
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
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            int i5 = i3;
            ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar2).l, sVar, (i3 >> 3) & 14, 24960, 110590);
            sVar2 = sVar;
            int i6 = z ? 2131231164 : 2131231178;
            if (z) {
                sVar2.c0(-1630754625);
                j = ih.d.a(sVar2).H;
            } else {
                sVar2.c0(-1630753409);
                j = ih.d.a(sVar2).n;
            }
            sVar2.q(false);
            p5.a(z3.C(i6, 0, sVar2), str2, rVar4, j, sVar2, 8 | ((i5 >> 9) & 112), 0);
            sVar2.q(true);
            rVar3 = rVar6;
        } else {
            sVar2.V();
            rVar3 = rVar2;
        }
        androidx.compose.runtime.b2 t = sVar2.t();
        if (t != null) {
            t.d = new n2(rVar3, str, z, aVar, str2, i, i2);
        }
    }
}
