package com.github.rudroid.settings.copilot.managesubscription;

import androidx.compose.foundation.layout.d2;
import androidx.compose.runtime.f1;
import androidx.fragment.app.l1;
import androidx.lifecycle.d1;
import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import com.github.rudroid.uitoolkit.j1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import java.time.format.DateTimeFormatter;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotManageSubscriptionActivity s;

    public /* synthetic */ b(CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, int i) {
        this.r = i;
        this.s = copilotManageSubscriptionActivity;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        final CopilotManageSubscriptionActivity copilotManageSubscriptionActivity = this.s;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CopilotManageSubscriptionActivity.a aVar = CopilotManageSubscriptionActivity.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-523216496, new b(copilotManageSubscriptionActivity, i2), sVar), sVar, 805306368, 511);
                    break;
                }
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    final f1 l = k41.b.l(copilotManageSubscriptionActivity.J0().w, (l1) null, sVar2, 7);
                    m0.s a = m0.u.a(0, 3, sVar2);
                    cg.b bVar = (cg.b) ((g1) l.getValue()).getData();
                    final cg.c cVar = bVar != null ? bVar.c : null;
                    if (cVar == null) {
                        sVar2.c0(-706088293);
                    } else {
                        sVar2.c0(-706088292);
                        e1 e1Var = cVar.b.b;
                        cg.a aVar3 = cVar.a;
                        e1 e1Var2 = aVar3.b;
                        String format = aVar3.d.b.format(DateTimeFormatter.ISO_LOCAL_DATE);
                        k71.k.f(format, "format(...)");
                        boolean h = sVar2.h(copilotManageSubscriptionActivity) | sVar2.h(cVar);
                        Object N = sVar2.N();
                        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                        Object obj3 = N;
                        if (h || N == iVar) {
                            j71.a aVar4 = new j71.a() { // from class: com.github.rudroid.settings.copilot.managesubscription.e
                                public final Object a() {
                                    CopilotManageSubscriptionActivity.a aVar5 = CopilotManageSubscriptionActivity.Companion;
                                    cg.a aVar6 = cVar.b;
                                    CopilotManageSubscriptionActivity copilotManageSubscriptionActivity2 = CopilotManageSubscriptionActivity.this;
                                    v71.b0.z(d1.i(copilotManageSubscriptionActivity2), (a71.h) null, (v71.a0) null, new q(copilotManageSubscriptionActivity2, aVar6, null), 3);
                                    copilotManageSubscriptionActivity2.J0().P();
                                    return w61.a0.a;
                                }
                            };
                            sVar2.n0(aVar4);
                            obj3 = aVar4;
                        }
                        j71.a aVar5 = (j71.a) obj3;
                        boolean h2 = sVar2.h(copilotManageSubscriptionActivity);
                        Object N2 = sVar2.N();
                        Object obj4 = N2;
                        if (h2 || N2 == iVar) {
                            f fVar = new f(copilotManageSubscriptionActivity, z ? 1 : 0);
                            sVar2.n0(fVar);
                            obj4 = fVar;
                        }
                        j71.a aVar6 = (j71.a) obj4;
                        boolean h3 = sVar2.h(copilotManageSubscriptionActivity);
                        Object N3 = sVar2.N();
                        Object obj5 = N3;
                        if (h3 || N3 == iVar) {
                            f fVar2 = new f(copilotManageSubscriptionActivity, i2);
                            sVar2.n0(fVar2);
                            obj5 = fVar2;
                        }
                        dg.d.a(null, aVar5, aVar6, (j71.a) obj5, e1Var, e1Var2, format, sVar2, 0, 1);
                    }
                    sVar2.q(false);
                    com.github.rudroid.uitoolkit.utils.z.a(com.github.rudroid.utilities.c0.a(ih.d.b(sVar2).b, w1.o.a), r1.i.d(1181312132, new h(a, copilotManageSubscriptionActivity, i2), sVar2), null, null, null, 0, 0L, 0L, r1.i.d(-33857458, new j71.f() { // from class: com.github.rudroid.settings.copilot.managesubscription.g
                        public final Object f(Object obj6, Object obj7, Object obj8) {
                            d2 d2Var = (d2) obj6;
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj7;
                            int intValue3 = ((Integer) obj8).intValue();
                            CopilotManageSubscriptionActivity.a aVar7 = CopilotManageSubscriptionActivity.Companion;
                            k71.k.g(d2Var, "paddingValues");
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= sVar3.f(d2Var) ? 4 : 2;
                            }
                            if (sVar3.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                                f1 f1Var = l;
                                boolean f = h1.f((g1) f1Var.getValue());
                                CopilotManageSubscriptionActivity copilotManageSubscriptionActivity2 = copilotManageSubscriptionActivity;
                                boolean h4 = sVar3.h(copilotManageSubscriptionActivity2);
                                Object N4 = sVar3.N();
                                if (h4 || N4 == androidx.compose.runtime.n.a) {
                                    i iVar2 = new i(0, copilotManageSubscriptionActivity2, CopilotManageSubscriptionActivity.class, "refresh", "refresh()V", 0, 0);
                                    sVar3.n0(iVar2);
                                    N4 = iVar2;
                                }
                                j1.a(androidx.compose.foundation.layout.b.w(w1.o.a, d2Var), f, false, 0L, (k71.i) N4, r1.i.d(-1976486565, new h(f1Var, copilotManageSubscriptionActivity2, 0), sVar3), sVar3, 196608, 12);
                            } else {
                                sVar3.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar2), sVar2, 100663344, 252);
                    break;
                }
        }
        return a0Var;
    }
    public Object z(Object p1, Object p2, Object p3, Object p4) { return null; }
}
