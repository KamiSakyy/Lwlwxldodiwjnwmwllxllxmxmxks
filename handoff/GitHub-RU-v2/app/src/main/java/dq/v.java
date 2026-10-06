package dq;

import java.util.List;
import m10.eh;
import m10.joShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("MobileCopilotPaywallChatModelPlan");
        List list = b.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MobileCopilotPaywallChatModelPlan", n, list)});
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        joShadow.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("plans", no.a.d(joShadow.a), (String) null, rVar, rVar, r)});
    }
}
