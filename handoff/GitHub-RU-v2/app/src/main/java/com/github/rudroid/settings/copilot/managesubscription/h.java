package com.github.rudroid.settings.copilot.managesubscription;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.s1;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ CopilotManageSubscriptionActivity s;
    public final /* synthetic */ Object t;

    public /* synthetic */ h(Object obj, CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, int i) {
        this.r = i;
        this.t = obj;
        this.s = copilotManageSubscriptionActivity;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj3 = androidx.compose.runtime.n.a;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                f1 f1Var = (f1) obj4;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CopilotManageSubscriptionActivity.a aVar = CopilotManageSubscriptionActivity.Companion;
                if (!sVar.S(1 & intValue, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    w1.r f = f0.o.f(p2.d(w1.o.a, 1.0f), ih.d.b(sVar).a, d2.a0.b);
                    g1 g1Var = (g1) f1Var.getValue();
                    final CopilotManageSubscriptionActivity copilotManageSubscriptionActivity = this.s;
                    boolean h = sVar.h(copilotManageSubscriptionActivity);
                    Object N = sVar.N();
                    if (h || N == obj3) {
                        j jVar = new j(1, copilotManageSubscriptionActivity, CopilotManageSubscriptionActivity.class, "onErrorSideEffect", "onErrorSideEffect(Lcom/github/rudroid/utilities/ui/error/UiErrorModel;)V", 0, 0);
                        sVar.n0(jVar);
                        N = jVar;
                    }
                    j71.c cVar = (k71.i) N;
                    boolean h2 = sVar.h(copilotManageSubscriptionActivity);
                    Object N2 = sVar.N();
                    if (h2 || N2 == obj3) {
                        N2 = new j71.f() { // from class: com.github.rudroid.settings.copilot.managesubscription.c
                            public final Object f(Object obj5, Object obj6, Object obj7) {
                                m0.f fVar = (m0.f) obj5;
                                cg.b bVar = (cg.b) obj6;
                                CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
                                k71.k.g(fVar, "$this$StateLazyList");
                                k71.k.g(bVar, "data");
                                m0.f.q(fVar, (String) null, a.a, 3);
                                List list = bVar.a;
                                fVar.r(list.size(), (j71.c) null, new o(list), new r1.d(new p(list, bVar, CopilotManageSubscriptionActivity.this), true, 802480018));
                                return w61.a0.a;
                            }
                        };
                        sVar.n0(N2);
                    }
                    s1.c(f, g1Var, null, null, null, null, null, null, null, null, null, null, null, null, cVar, (j71.f) N2, sVar, 0, 0, 32764);
                    break;
                }
            default:
                m0.s sVar2 = (m0.s) obj4;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
                if (!sVar3.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    String p0 = i4.p0(2131953115, sVar3);
                    float e = com.github.rudroid.uitoolkit.utils.lists.t.e(sVar2, false, sVar3, 1);
                    CopilotManageSubscriptionActivity copilotManageSubscriptionActivity2 = this.s;
                    boolean h3 = sVar3.h(copilotManageSubscriptionActivity2);
                    Object N3 = sVar3.N();
                    if (h3 || N3 == obj3) {
                        N3 = new f(copilotManageSubscriptionActivity2, 2);
                        sVar3.n0(N3);
                    }
                    qg.p.c(null, p0, null, 0L, (j71.a) N3, 0, e, 0.0f, 0, 0, null, sVar3, 0, 0, 1965);
                    break;
                }
        }
        return a0Var;
    }


}
