package com.github.rudroid.uitoolkit;

import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, w1.r rVar, j71.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        j71.f fVar2;
        j71.f fVar3;
        androidx.compose.runtime.b2 t;
        boolean z;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "title");
        sVar2.e0(1584668197);
        if ((i & 6) == 0) {
            i3 = (sVar2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(rVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            fVar2 = fVar;
            i3 |= sVar2.h(fVar2) ? 256 : 128;
            if (sVar2.S(i3 & 1, (i3 & 147) == 146)) {
                sVar2.V();
                fVar3 = fVar2;
            } else {
                j71.f fVar4 = i4 != 0 ? null : fVar2;
                w1.r e = androidx.compose.foundation.layout.p2.e(rVar, 1.0f);
                androidx.compose.foundation.layout.l2 a = androidx.compose.foundation.layout.j2.a(androidx.compose.foundation.layout.l.g, w1.c.B, sVar2, 54);
                int hashCode = Long.hashCode(sVar2.T);
                androidx.compose.runtime.v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, e);
                v2.h.o.getClass();
                v2.f fVar5 = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar5);
                } else {
                    sVar2.q0();
                }
                androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                androidx.compose.runtime.t.E(sVar2, v2.g.h);
                androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                w1.o oVar = w1.o.a;
                androidx.compose.foundation.layout.n2 n2Var = androidx.compose.foundation.layout.n2.a;
                int i5 = i3;
                j71.f fVar6 = fVar4;
                ub.b(str, androidx.compose.foundation.layout.p2.x(n2Var.a(oVar, 1.0f, true), w1.c.D, 2), ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar2).b, sVar, i3 & 14, 24960, 110584);
                sVar2 = sVar;
                if (fVar6 != null) {
                    sVar2.c0(-49430320);
                    fVar6.f(n2Var, sVar2, Integer.valueOf(((i5 >> 3) & 112) | 6));
                    z = false;
                } else {
                    z = false;
                    sVar2.c0(-51217191);
                }
                sVar2.q(z);
                sVar2.q(true);
                fVar3 = fVar6;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new androidx.compose.foundation.lazy.layout.w0(str, rVar, fVar3, i, i2, 14);
                return;
            }
            return;
        }
        fVar2 = fVar;
        if (sVar2.S(i3 & 1, (i3 & 147) == 146)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
