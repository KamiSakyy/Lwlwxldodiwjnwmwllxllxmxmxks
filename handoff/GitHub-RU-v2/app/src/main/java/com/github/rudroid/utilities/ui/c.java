package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(j71.e eVar, String str, String str2, j71.e eVar2, androidx.compose.runtime.s sVar, int i) {
        int i2;
        int i3;
        w1.o oVar;
        boolean z;
        w1.o oVar2;
        int i4;
        j71.e eVar3 = eVar2;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(967326086);
        int i5 = i & 6;
        w1.o oVar3 = w1.o.a;
        if (i5 == 0) {
            i2 = (sVar2.f(oVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar2.h(eVar3) ? 16384 : 8192;
        }
        if (sVar2.S(i2 & 1, (i2 & 9363) != 9362)) {
            w1.r u = p2.u(p2.e(oVar3, 1.0f));
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            androidx.compose.runtime.v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, u);
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
            if (eVar == null) {
                sVar2.c0(1620439667);
                sVar2.q(false);
            } else {
                sVar2.c0(1620439668);
                eVar.s(sVar2, Integer.valueOf((i2 >> 3) & 14));
                com.github.rudroid.m0.C(oVar3, ih.a.p, sVar2, false);
            }
            if (str == null) {
                sVar2.c0(1620570797);
                sVar2.q(false);
                i3 = i2;
                oVar = oVar3;
                z = false;
            } else {
                sVar2.c0(1620570798);
                i3 = i2;
                oVar = oVar3;
                z = false;
                ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).n, sVar, (i2 >> 6) & 14, 0, 130046);
                sVar2 = sVar;
                sVar2.q(false);
            }
            if (str == null || str2 == null) {
                sVar2.c0(1617447238);
                sVar2.q(z);
            } else {
                sVar2.c0(1620797749);
                com.github.rudroid.m0.C(oVar, ih.a.k, sVar2, z);
            }
            if (str2 == null) {
                sVar2.c0(1620900234);
                sVar2.q(z);
                oVar2 = oVar;
                i4 = 1617447238;
            } else {
                sVar2.c0(1620900235);
                oVar2 = oVar;
                i4 = 1617447238;
                ub.b(str2, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).x, sVar, (i3 >> 9) & 14, 0, 130046);
                sVar2 = sVar;
                sVar2.q(z);
            }
            if (str == null && str2 == null) {
                sVar2.c0(i4);
                sVar2.q(z);
            } else {
                sVar2.c0(1621130069);
                com.github.rudroid.m0.C(oVar2, ih.a.n, sVar2, z);
            }
            if (eVar2 == null) {
                sVar2.c0(1621222820);
                sVar2.q(z);
                eVar3 = eVar2;
            } else {
                sVar2.c0(1621222821);
                eVar3 = eVar2;
                f1.e.u((i3 >> 12) & 14, eVar3, sVar2, z);
            }
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(eVar, str, str2, eVar3, i);
        }
    }

    public static final void b(w1.r rVar, j71.e eVar, String str, String str2, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        sVar.e0(-875474882);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(str2) ? 2048 : 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            a(eVar, str, str2, null, sVar, (i2 & 112) | 24582 | (i2 & 896) | (i2 & 7168));
            rVar2 = w1.o.a;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(rVar2, eVar, str, str2, i, 11);
        }
    }

    public static final void c(w1.r rVar, j71.e eVar, String str, String str2, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2) {
        k71.k.g(aVar, "action");
        sVar.e0(6061546);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.f(str2) ? 2048 : 1024;
        }
        int i4 = i3 | (sVar.d(i) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i4 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if (sVar.S(i4 & 1, (74899 & i4) != 74898)) {
            a(eVar, str, str2, r1.i.d(-1598746295, new a(i, 1, aVar), sVar), sVar, (i4 & 112) | 24582 | (i4 & 896) | (i4 & 7168));
            rVar = w1.o.a;
        } else {
            sVar.V();
        }
        w1.r rVar2 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b(rVar2, eVar, str, str2, i, aVar, i2, 1);
        }
    }

    public static final void d(w1.r rVar, j71.e eVar, String str, String str2, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2) {
        k71.k.g(aVar, "action");
        sVar.e0(1632557368);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.f(str2) ? 2048 : 1024;
        }
        int i4 = i3 | (sVar.d(i) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i4 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if (sVar.S(i4 & 1, (74899 & i4) != 74898)) {
            a(eVar, str, str2, r1.i.d(1305481431, new a(i, 0, aVar), sVar), sVar, (i4 & 112) | 24582 | (i4 & 896) | (i4 & 7168));
            rVar = w1.o.a;
        } else {
            sVar.V();
        }
        w1.r rVar2 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b(rVar2, eVar, str, str2, i, aVar, i2, 0);
        }
    }
    public Object v(Object p1) { return null; }
    public Object v(Object p1) { return null; }
}
