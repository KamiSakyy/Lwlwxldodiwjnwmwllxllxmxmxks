package com.github.rudroid.settings.copilot.managesubscription;

import androidx.lifecycle.d1;
import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import java.util.concurrent.CancellationException;
import v71.q1;

@c71.e(c = "com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity$registerCopilotProPaywallLauncher$1$1", f = "CopilotManageSubscriptionActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r extends c71.j implements j71.e {
    public final /* synthetic */ CopilotManageSubscriptionActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, a71.c cVar) {
        super(2, cVar);
        this.v = copilotManageSubscriptionActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        CopilotManageSubscriptionActivity.a aVar2 = CopilotManageSubscriptionActivity.Companion;
        b0 J0 = this.v.J0();
        oa.j d = J0.s.d();
        q1 q1Var = J0.x;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        J0.x = v71.b0.z(d1.k(J0), (a71.h) null, (v71.a0) null, new a0(J0, d, null), 3);
        return w61.a0.a;
    }
}
