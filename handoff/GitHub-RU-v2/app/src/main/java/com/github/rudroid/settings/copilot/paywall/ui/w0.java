package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.activities.g3;
import f1.ub;
import h0.h1Shadow;
import java.util.Iterator;
import java.util.List;
import xn.e1;
import xn.r2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public static final void a(w1.r rVar, j71.c cVar, j71.a aVar, j71.a aVar2, e1 e1Var, e1 e1Var2, List list, r2 r2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        j71.c cVar2;
        int i3;
        j71.c cVar3;
        j71.c cVar4;
        int i4;
        j71.c cVar5;
        k71.k.g(aVar, "onPrivacyPolicyClick");
        k71.k.g(aVar2, "onTermsOfUseClick");
        k71.k.g(r2Var, "paywallData");
        sVar.e0(139603250);
        int i5 = (sVar.f(rVar) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            i3 = i5 | (sVar.h(cVar2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.d(e1Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.d(e1Var2.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar.h(list) ? 1048576 : 524288;
        }
        int i7 = i3 | (sVar.h(r2Var) ? 8388608 : 4194304);
        if (sVar.S(i7 & 1, (4793491 & i7) != 4793490)) {
            Object obj = androidx.compose.runtime.n.a;
            if (i6 != 0) {
                Object N = sVar.N();
                if (N == obj) {
                    N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(23);
                    sVar.n0(N);
                }
                cVar4 = (j71.c) N;
            } else {
                cVar4 = cVar2;
            }
            f2 f = androidx.compose.foundation.layout.b.f(0.0f, ih.a.t, 0.0f, 0.0f, 13);
            boolean h = ((i7 & 112) == 32) | ((57344 & i7) == 16384) | sVar.h(r2Var) | ((458752 & i7) == 131072) | sVar.h(list) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048);
            Object N2 = sVar.N();
            if (h || N2 == obj) {
                i4 = i7;
                q0 q0Var = new q0(aVar, aVar2, cVar4, list, e1Var, e1Var2, r2Var);
                cVar5 = cVar4;
                sVar.n0(q0Var);
                N2 = q0Var;
            } else {
                i4 = i7;
                cVar5 = cVar4;
            }
            com.google.common.util.concurrent.a.b(rVar, (m0.s) null, f, (androidx.compose.foundation.layout.k) null, (w1.d) null, (h1Shadow) null, false, (f0.j) null, (j71.c) N2, sVar, i4 & 14, 506);
            cVar3 = cVar5;
        } else {
            sVar.V();
            cVar3 = cVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new g3(rVar, cVar3, aVar, aVar2, e1Var, e1Var2, list, r2Var, i, i2);
        }
    }

    public static final void b(w1.r rVar, List list, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1537072363);
        char c = 2;
        int i2 = i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.h(list) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
            w1.h hVar = w1.c.E;
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
            androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.g(ih.a.n), hVar, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c2 = w1.a.c(sVar2, rVar);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar2);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
            sVar2.c0(-688932385);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ub.b((String) it.next(), (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).A, sVar, 0, 0, 130046);
                c = 2;
                z2 = true;
                z = z;
                sVar2 = sVar;
            }
            sVar2.q(z);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.copilot.ui.oShadow(rVar, list, i, 2);
        }
    }
}
