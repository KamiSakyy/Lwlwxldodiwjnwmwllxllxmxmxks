package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fo;
import m10.no;
import m10.po;
import m10.to;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobileCopilotFeatureComparisonSubsection");
        List list = dq.u.a;
        aa.s c = no.a.c(list, "selections", "MobileCopilotFeatureComparisonSubsection", n, list);
        List n2 = sy.d0.n("MobileCopilotPaywallChatModels");
        List list2 = dq.v.a;
        List r = x61.l.r(new aa.s[]{mVar, c, no.a.c(list2, "selections", "MobileCopilotPaywallChatModels", n2, list2)});
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        no.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("features", f1.e.e(no.a), (String) null, rVar, rVar, r)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("MobileCopilotPaywallProduct");
        List list3 = dq.x.a;
        List r3 = x61.l.r(new aa.s[]{mVar3, no.a.c(list3, "selections", "MobileCopilotPaywallProduct", n3, list3)});
        po.Companion.getClass();
        aa.m mVar4 = new aa.m("allFeatures", no.a.d(po.a), (String) null, rVar, rVar, r2);
        aa.m mVar5 = new aa.m("disclaimers", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar);
        to.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("paywallProducts", no.a.d(to.a), (String) null, rVar, rVar, r3)});
        fo.Companion.getClass();
        aa.q0 q0Var = fo.a;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("mobileCopilotPaywall", q0Var, (String) null, rVar, rVar, r4);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
