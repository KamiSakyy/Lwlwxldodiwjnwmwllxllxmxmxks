package com.github.rudroid.settings.copilot.managesubscription;

import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.NoSuchElementException;
import xn.e1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class k implements j71.a {
    public final /* synthetic */ cg.b r;
    public final /* synthetic */ cg.a s;
    public final /* synthetic */ CopilotManageSubscriptionActivity t;

    public k(cg.b bVar, cg.a aVar, CopilotManageSubscriptionActivity copilotManageSubscriptionActivity) {
        this.r = bVar;
        this.s = aVar;
        this.t = copilotManageSubscriptionActivity;
    }

    public final Object a() {
        int m = sy.q.m(this.r.b);
        cg.a aVar = this.s;
        e1 e1Var = aVar.b;
        int m2 = sy.q.m(e1Var);
        CopilotManageSubscriptionActivity copilotManageSubscriptionActivity = this.t;
        if (m > m2) {
            CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
            y1 y1Var = copilotManageSubscriptionActivity.J0().v;
            cg.b bVar = (cg.b) ((g1) y1Var.getValue()).getData();
            if (bVar != null) {
                for (cg.a aVar3 : bVar.a) {
                    if (aVar3.b == bVar.b) {
                        w0.p(y1Var, cg.b.a(bVar, new cg.c(aVar3, aVar)));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        } else {
            h.g gVar = copilotManageSubscriptionActivity.u0;
            if (gVar == null) {
                k71.k.m("copilotChatProPaywallLauncher");
                throw null;
            }
            gVar.a(new com.github.rudroid.settings.copilot.paywall.m(e1Var));
        }
        return w61.a0.a;
    }
}
