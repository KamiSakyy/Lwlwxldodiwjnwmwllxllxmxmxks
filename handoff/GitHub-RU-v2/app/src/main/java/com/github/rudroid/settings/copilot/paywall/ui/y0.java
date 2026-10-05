package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public static final void a(int i, androidx.compose.runtime.s sVar, j71.a aVar, j71.a aVar2, w1.r rVar) {
        int i2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(aVar, "onPrivacyPolicyClick");
        k71.k.g(aVar2, "onTermsOfUseClick");
        sVar2.e0(1473771193);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.f(rVar) ? 256 : 128;
        }
        if (sVar2.S(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, rVar);
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
            w1.o oVar = w1.o.a;
            sg.k0.a(((i2 << 6) & 896) | 12582918, 122, null, sVar2, null, null, null, aVar, j.b, p2.e(oVar, 1.0f), false);
            sVar2 = sVar;
            sg.k0.a(((i2 << 3) & 896) | 12582918, 122, null, sVar2, null, null, null, aVar2, j.d, p2.e(oVar, 1.0f), false);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.copilot.upsellbanner.b(aVar, aVar2, rVar, i, 1);
        }
    }
}
