package com.github.rudroid.settings.copilot.managesubscription;

import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import java.util.List;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ cg.b s;
    public final /* synthetic */ CopilotManageSubscriptionActivity t;

    public p(List list, cg.b bVar, CopilotManageSubscriptionActivity copilotManageSubscriptionActivity) {
        this.r = list;
        this.s = bVar;
        this.t = copilotManageSubscriptionActivity;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            cg.a aVar = (cg.a) this.r.get(intValue);
            sVar.c0(-1688404527);
            float f = ih.a.n;
            w1.o oVar = w1.o.a;
            w1.r z = androidx.compose.foundation.layout.b.z(oVar, f, 0.0f, 2);
            boolean z2 = aVar.c;
            eg.a aVar2 = aVar.d;
            d3.k kVar = new d3.k(3);
            cg.b bVar2 = this.s;
            boolean h = sVar.h(bVar2) | sVar.h(aVar);
            CopilotManageSubscriptionActivity copilotManageSubscriptionActivity = this.t;
            boolean h2 = h | sVar.h(copilotManageSubscriptionActivity);
            Object N = sVar.N();
            Object obj5 = androidx.compose.runtime.n.a;
            if (h2 || N == obj5) {
                N = new k(bVar2, aVar, copilotManageSubscriptionActivity);
                sVar.n0(N);
            }
            w1.r b = q0.c.b(z, z2, kVar, (j71.a) N);
            boolean z3 = aVar.c;
            e1 e1Var = aVar.b;
            String str = aVar2.a;
            boolean z4 = aVar2.a.length() > 0;
            ZonedDateTime zonedDateTime = aVar2.b;
            boolean h3 = sVar.h(copilotManageSubscriptionActivity) | sVar.h(aVar);
            Object N2 = sVar.N();
            if (h3 || N2 == obj5) {
                N2 = new l(copilotManageSubscriptionActivity, aVar);
                sVar.n0(N2);
            }
            dg.c.a(b, (j71.a) N2, z3, e1Var, str, z4, zonedDateTime, sVar, 0);
            m0.C(oVar, f, sVar, false);
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
