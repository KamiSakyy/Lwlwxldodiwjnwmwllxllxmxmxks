package com.github.rudroid.settings.copilot.paywall.ui;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.q5;
import f1.ub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xn.w2;
import xn.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public static final void a(w1.r rVar, boolean z, x2 x2Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        sVar.e0(-381308708);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.g(z) ? 32 : 16;
        }
        int i5 = i3 | (sVar.h(x2Var) ? 256 : 128);
        if (sVar.S(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                rVar = w1.o.a;
            }
            w1.r rVar3 = rVar;
            tg.c.a(196608 | (i5 & 14), 16, sVar, r0.e.a(26), z ? new f0.v((float) 1.5d, mh.a.a) : null, tg.b.a(sVar), null, r1.i.d(-1573770114, new com.github.rudroid.repository.files.k0(x2Var, z, 1), sVar), rVar3);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new q5(rVar2, z, x2Var, i, i2);
        }
    }

    public static final void b(w1.r rVar, x2 x2Var, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-1663389321);
        int i2 = i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.h(x2Var) ? 32 : 16);
        if (sVar2.S(i2 & 1, (i2 & 19) != 18)) {
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
            float f = ih.a.l;
            w1.o oVar = w1.o.a;
            ub.b(x2Var.d, androidx.compose.foundation.layout.b.B(oVar, 0.0f, 0.0f, 0.0f, f, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).n, sVar, 0, 0, 131068);
            sVar2 = sVar;
            List list = x2Var.e;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((w2) it.next()).a);
            }
            sVar2.c0(-1298108972);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                com.github.rudroid.uitoolkit.text.k.b(androidx.compose.foundation.layout.b.B(p2.e(oVar, 1.0f), 0.0f, 0.0f, 0.0f, ih.a.m, 7), com.github.rudroid.uitoolkit.text.m.b(2131231158, null, null, 14), androidx.compose.foundation.layout.b.f(0.0f, 0.0f, ih.a.l, 0.0f, 11), ih.d.a(sVar2).x, w1.c.A, null, r1.i.d(-1576740756, new ab.m((String) arrayList.get(i3), 8), sVar2), sVar2, 1597440, 32);
            }
            sVar2.q(false);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(rVar, x2Var, i, 3);
        }
    }
}
