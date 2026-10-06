package com.github.rudroid.settings.copilot.paywall.ui;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.c3;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import f1.e8;
import f1.o5;
import f1.qa;
import f1.ub;
import java.util.WeakHashMap;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public static final void a(w1.r rVar, String str, String str2, e1 e1Var, j71.a aVar, j71.a aVar2, j71.a aVar3, j71.c cVar, j71.c cVar2, com.github.rudroid.copilot.inapppurchase.j0 j0Var, androidx.compose.runtime.s sVar, int i) {
        k71.k.g(e1Var, "licenseToBuy");
        k71.k.g(aVar, "onCloseButtonClick");
        k71.k.g(aVar2, "onSubscribeClick");
        k71.k.g(aVar3, "onRestorePurchaseClick");
        k71.k.g(cVar, "onPrivacyPolicyClick");
        k71.k.g(cVar2, "onTermsOfUseClick");
        sVar.e0(-1401727229);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.d(e1Var.ordinal()) ? 2048 : 1024) | (sVar.h(aVar) ? 16384 : 8192) | (sVar.h(aVar2) ? 131072 : 65536) | (sVar.h(aVar3) ? 1048576 : 524288) | (sVar.h(cVar) ? 8388608 : 4194304) | (sVar.h(cVar2) ? 67108864 : 33554432) | (sVar.d(j0Var == null ? -1 : j0Var.ordinal()) ? 536870912 : 268435456);
        if (!sVar.S(i2 & 1, (306783379 & i2) != 306783378)) {
            sVar.V();
        } else if (((Configuration) sVar.j(w2.j0.a)).orientation == 2) {
            sVar.c0(1111712193);
            b(rVar, str, str2, e1Var, aVar, aVar2, aVar3, cVar, cVar2, j0Var, sVar, i2 & 2147483646, 0);
            sVar.q(false);
        } else {
            sVar.c0(1112255778);
            c(rVar, str, str2, e1Var, aVar, aVar2, aVar3, cVar, cVar2, j0Var, sVar, i2 & 2147483646, 0);
            sVar.q(false);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b6.q(rVar, str, str2, e1Var, aVar, aVar2, aVar3, cVar, cVar2, j0Var, i, 2);
        }
    }

    public static final void b(w1.r rVar, String str, String str2, e1 e1Var, j71.a aVar, j71.a aVar2, j71.a aVar3, j71.c cVar, j71.c cVar2, com.github.rudroid.copilot.inapppurchase.j0 j0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(955994045);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= sVar2.d(e1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar2.h(aVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar2.h(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar2.h(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= sVar2.h(cVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= sVar2.d(j0Var == null ? -1 : j0Var.ordinal()) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if (sVar2.S(i5 & 1, (i5 & 306783379) != 306783378)) {
            w1.r rVar3 = w1.o.a;
            w1.r rVar4 = i4 != 0 ? rVar3 : rVar2;
            w1.r f = f0.o.f(rVar4, ih.d.b(sVar2).a, d2.a0Shadow.b);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.A, sVar2, 0);
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
            v2.eShadow eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar2, eVar, a);
            v2.eShadow eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar2, dVar);
            w1.r rVar5 = rVar4;
            v2.eShadow eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar2, eVar4, c);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            w1 w1Var = new w1(1.0f, true);
            androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, w1Var);
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
            e8.h(aVar, androidx.compose.foundation.layout.b.B(rVar3, ih.a.k, ih.a.p, 0.0f, 0.0f, 12), false, (o5) null, (d2.p0) null, d.b, sVar, ((i5 >> 12) & 14) | 1572864, 60);
            d0.b(cVar, cVar2, e1Var, null, sVar, ((i5 >> 21) & 126) | ((i5 >> 3) & 896), 8);
            sVar.q(true);
            qa.a(p2.c(p2.s(rVar3, 240), 1.0f), (d2.p0) null, ih.d.a(sVar).s, 0L, 0.0f, 0.0f, (f0.v) null, r1.i.d(221523166, new u(str, str2, aVar2, aVar3, j0Var, 1), sVar), sVar, 12582918, 122);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar5;
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new v(rVar2, str, str2, e1Var, aVar, aVar2, aVar3, cVar, cVar2, j0Var, i, i2, 1);
        }
    }

    public static final void c(w1.r rVar, String str, String str2, e1 e1Var, j71.a aVar, j71.a aVar2, j71.a aVar3, j71.c cVar, j71.c cVar2, com.github.rudroid.copilot.inapppurchase.j0 j0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-53865527);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= sVar2.d(e1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar2.h(aVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar2.h(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar2.h(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= sVar2.h(cVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= sVar2.d(j0Var == null ? -1 : j0Var.ordinal()) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if (sVar2.S(i5 & 1, (i5 & 306783379) != 306783378)) {
            w1.r rVar3 = w1.o.a;
            w1.r rVar4 = i4 != 0 ? rVar3 : rVar2;
            w1.r f = f0.o.f(rVar4, ih.d.b(sVar2).a, d2.a0Shadow.b);
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
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            w1.r rVar5 = rVar4;
            e8.h(aVar, androidx.compose.foundation.layout.b.B(rVar3, ih.a.k, ih.a.p, 0.0f, 0.0f, 12), false, (o5) null, (d2.p0) null, d.a, sVar, ((i5 >> 12) & 14) | 1572864, 60);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            d0.b(cVar, cVar2, e1Var, new w1(1.0f, true), sVar, ((i5 >> 21) & 126) | ((i5 >> 3) & 896), 0);
            qa.a((w1.r) null, ih.d.e(sVar).g, ih.d.a(sVar).s, 0L, 0.0f, 0.0f, (f0.v) null, r1.i.d(1169725018, new u(str, str2, aVar2, aVar3, j0Var, 0), sVar), sVar, 12582912, 121);
            sVar2 = sVar;
            sVar2.q(true);
            rVar2 = rVar5;
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new v(rVar2, str, str2, e1Var, aVar, aVar2, aVar3, cVar, cVar2, j0Var, i, i2, 0);
        }
    }

    public static final void d(w1.r rVar, String str, String str2, j71.a aVar, j71.a aVar2, com.github.rudroid.copilot.inapppurchase.j0 j0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        w1.r rVar4;
        boolean z;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        w1.h hVar = w1.c.E;
        k71.k.g(str, "formattedPrice");
        k71.k.g(aVar, "onSubscribeClick");
        k71.k.g(aVar2, "onRestorePurchaseClick");
        sVar2.e0(-2017894054);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= sVar2.h(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.h(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar2.d(j0Var == null ? -1 : j0Var.ordinal()) ? 131072 : 65536;
        }
        int i5 = i3;
        if (sVar2.S(i5 & 1, (i5 & 74899) != 74898)) {
            w1.r rVar5 = w1.o.a;
            w1.r rVar6 = i4 != 0 ? rVar5 : rVar2;
            w1.r e = p2.e(rVar6, 1.0f);
            WeakHashMap weakHashMap = c3.w;
            w1.r x = androidx.compose.foundation.layout.b.x(androidx.compose.foundation.layout.b.I(e, androidx.compose.foundation.layout.f.e(sVar2).e), ih.a.n);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, x);
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
            if (t71.p.T(str)) {
                sVar2.c0(-45542297);
                z2 = true;
                rVar3 = rVar6;
                ub.b(i4.p0(2131952183, sVar2), androidx.compose.foundation.layout.b.B(new f1(hVar), 0.0f, 0.0f, 0.0f, ih.a.l, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar2).r, d2.t.d, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131068);
                sVar2 = sVar;
                sVar2.q(false);
            } else {
                rVar3 = rVar6;
                sVar2.c0(-45058573);
                f1 f1Var = new f1(hVar);
                float f = ih.a.l;
                w1.r B = androidx.compose.foundation.layout.b.B(f1Var, 0.0f, 0.0f, 0.0f, f, 7);
                String q0 = i4.q0(2131952182, new Object[]{str}, sVar2);
                g3.q0 q0Var = ih.d.f(sVar2).r;
                long j = d2.t.d;
                ub.b(q0, B, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(q0Var, j, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131068);
                sg.e0Shadow.b(p2.e(rVar5, 1.0f), null, aVar, sg.v.e(j, 0L, sVar, 6, 6), null, null, false, null, j0Var == com.github.rudroid.copilot.inapppurchase.j0.s, d.c, sVar, ((i5 >> 3) & 896) | 805306374, 242);
                androidx.compose.runtime.s sVar3 = sVar;
                if (str2 != null) {
                    sVar3.c0(-43955283);
                    rVar4 = rVar5;
                    ub.b(i4.q0(2131952185, new Object[]{str2}, sVar3), androidx.compose.foundation.layout.b.B(rVar5, 0.0f, f, 0.0f, 0.0f, 13).f(new f1(hVar)), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar3).A, ih.d.a(sVar3).l, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 130044);
                    sVar3 = sVar;
                    z = false;
                } else {
                    rVar4 = rVar5;
                    z = false;
                    sVar3.c0(-53443298);
                }
                sVar3.q(z);
                sg.h0.a(p2.e(androidx.compose.foundation.layout.b.B(rVar4, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), false, aVar2, sg.v.l(0L, sVar3, 7), j0Var == com.github.rudroid.copilot.inapppurchase.j0.r, 0.0f, null, d.d, sVar, ((i5 >> 6) & 896) | 12582912, 98);
                sVar2 = sVar;
                sVar2.q(false);
                z2 = true;
            }
            sVar2.q(z2);
            rVar2 = rVar3;
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new ab.g(rVar2, str, str2, aVar, aVar2, j0Var, i, i2);
        }
    }
}
