package h10;

import java.util.List;
import m10.ah;
import m10.e8;
import m10.eh;
import m10.k8;
import m10.m8;
import m10.o8;
import m10.q8;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("api", b, (String) null, rVar, rVar, rVar));
        aa.s mVar = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("CopilotLimitedUser");
        List list = dq.d.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "CopilotLimitedUser", n2, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("CopilotConsumptiveUser");
        List list2 = dq.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "CopilotConsumptiveUser", n3, list2)});
        m8.Companion.getClass();
        aa.a0 a0Var = m8.s;
        k71.k.g(a0Var, "type");
        aa.m mVar3 = new aa.m("copilotLicenseType", a0Var, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar2 = wg.a;
        aa.m mVar4 = new aa.m("isCopilotMobileChatEnabled", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("viewerIsCopilotCodingAgentEnabled", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("viewerCanSubscribeToCopilotIndividual", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerCanSubscribeToCopilotLimited", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        k8.Companion.getClass();
        aa.q0 q0Var = k8.a;
        k71.k.g(q0Var, "type");
        aa.m mVar8 = new aa.m("copilotEndpoints", q0Var, (String) null, rVar, rVar, n);
        o8.Companion.getClass();
        aa.q0 q0Var2 = o8.c;
        k71.k.g(q0Var2, "type");
        aa.m mVar9 = new aa.m("copilotLimitedUser", q0Var2, (String) null, rVar, rVar, r);
        e8.Companion.getClass();
        aa.q0 q0Var3 = e8.e;
        k71.k.g(q0Var3, "type");
        aa.m mVar10 = new aa.m("copilotConsumptiveUser", q0Var3, (String) null, rVar, rVar, r2);
        q8.Companion.getClass();
        aa.a0 a0Var2 = q8.s;
        k71.k.g(a0Var2, "type");
        aa.m mVar11 = new aa.m("copilotSubscriptionPlatform", a0Var2, (String) null, rVar, rVar, rVar);
        aa.m mVar12 = new aa.m("availableCopilotUpgradeSkus", v8.l0.a(v8.l0.b(a0Var)), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
