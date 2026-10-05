package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.sessionevents.ui.s1;
import com.github.rudroid.utilities.m1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import f1.e8;
import f1.o5;
import java.util.List;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public static final void a(final w1.r rVar, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final j71.a aVar4, final j71.a aVar5, final j71.c cVar, final j71.a aVar6, final e1 e1Var, final e1 e1Var2, final List list, final String str, final String str2, final com.github.rudroid.copilot.inapppurchase.j0 j0Var, g1 g1Var, androidx.compose.runtime.s sVar, final int i, final int i2) {
        int i3;
        int i4;
        final g1 g1Var2 = g1Var;
        k71.k.g(aVar, "onCloseButtonClick");
        k71.k.g(aVar2, "onSubscribeClick");
        k71.k.g(aVar3, "onRestorePurchaseClick");
        k71.k.g(aVar4, "onPrivacyPolicyClick");
        k71.k.g(aVar5, "onTermsOfUseClick");
        k71.k.g(cVar, "onSelectLicense");
        k71.k.g(aVar6, "onRefresh");
        sVar.e0(-1103893216);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(aVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(aVar4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.h(aVar5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= sVar.h(aVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= sVar.d(e1Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= sVar.d(e1Var2.ordinal()) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.h(list) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.d(j0Var == null ? -1 : j0Var.ordinal()) ? 2048 : 1024;
        }
        int i6 = i4 | (sVar.f(g1Var2) ? 16384 : 8192);
        if (sVar.S(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            long j = ih.d.b(sVar).a;
            d2.l0 l0Var = d2.a0.b;
            w1.o oVar = w1.o.a;
            w1.r f = f0.o.f(oVar, j, l0Var).f(rVar);
            w1.j jVar = w1.c.r;
            androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(jVar, false);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, f);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            v2.e eVar = v2.g.f;
            androidx.compose.runtime.t.I(sVar, eVar, d);
            v2.e eVar2 = v2.g.e;
            androidx.compose.runtime.t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            androidx.compose.runtime.t.E(sVar, dVar);
            v2.e eVar4 = v2.g.d;
            androidx.compose.runtime.t.I(sVar, eVar4, c);
            w1.r d2 = p2.d(oVar, 1.0f);
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
            int hashCode2 = Long.hashCode(sVar.T);
            v1 l2 = sVar.l();
            w1.r c2 = w1.a.c(sVar, d2);
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, eVar, a);
            androidx.compose.runtime.t.I(sVar, eVar2, l2);
            f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
            androidx.compose.runtime.t.I(sVar, eVar4, c2);
            androidx.compose.foundation.layout.f0 f0Var = androidx.compose.foundation.layout.f0.a;
            m1.a(g1Var, f0Var.a(oVar, true), r1.i.d(-577073768, new com.github.rudroid.agents.copilothome.ui.f0(20, aVar6), sVar), null, null, r1.i.d(1033686563, new s1(g1Var, aVar6, cVar, aVar4, aVar5, e1Var, e1Var2, list), sVar), sVar, ((i6 >> 12) & 14) | 196992, 24);
            g1Var2 = g1Var;
            z.x.c(f0Var, (t71.p.T(str) || (g1Var2 instanceof com.github.rudroid.utilities.ui.u0) || h1.b(g1Var2)) ? false : true, (w1.r) null, (z.s0) null, (z.t0) null, (String) null, r1.i.d(704322804, new com.github.rudroid.actions.workflowruns.ui.f(str, str2, aVar2, aVar3, j0Var), sVar), sVar, 1572870);
            sVar.q(true);
            e8.h(aVar, androidx.compose.foundation.layout.b.B(androidx.compose.foundation.layout.y.a.a(oVar, jVar), ih.a.k, ih.a.p, 0.0f, 0.0f, 12), false, (o5) null, (d2.p0) null, g.a, sVar, ((i5 >> 3) & 14) | 1572864, 60);
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.settings.copilot.paywall.ui.o0
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i | 1);
                    int L2 = androidx.compose.runtime.t.L(i2);
                    p0.a(rVar, aVar, aVar2, aVar3, aVar4, aVar5, cVar, aVar6, e1Var, e1Var2, list, str, str2, j0Var, g1Var2, (androidx.compose.runtime.s) obj, L, L2);
                    return w61.a0.a;
                }
            };
        }
    }
}
