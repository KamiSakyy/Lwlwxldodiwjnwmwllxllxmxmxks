package jp;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.mr;
import m10.q7;
import m10.rf0;
import m10.s7;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        wg.Companion.getClass();
        r b = l0.b(wg.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CopilotAgentTask");
        List list = ip.c.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "CopilotAgentTask", n, list), new m("taskId", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        q7.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(q7.a), (String) null, rVar, rVar, r2)});
        s7.Companion.getClass();
        q0 q0Var = s7.a;
        k.g(q0Var, "type");
        rf0.Companion.getClass();
        m mVar4 = new m("viewerCopilotAgentTasks", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rf0.c0, new u0(new t("after"))), new aa.k(rf0.d0, new u0(new t("filterBy"))), new aa.k(rf0.e0, new u0(new t("first"))), new aa.k(rf0.f0, new u0(new t("orderBy")))}), r3);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, l.r(new m[]{mVar4, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
