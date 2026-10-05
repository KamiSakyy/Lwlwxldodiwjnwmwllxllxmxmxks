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
import m10.p00;
import m10.q7;
import m10.s7;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        wg.Companion.getClass();
        r b = l0.b(wg.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("CopilotAgentTask");
        List list = ip.c.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "CopilotAgentTask", n, list), new m("taskId", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        q7.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(q7.a), (String) null, rVar, rVar, r2)});
        s7.Companion.getClass();
        q0 q0Var = s7.a;
        k.g(q0Var, "type");
        p00.Companion.getClass();
        m mVar4 = new m("repositoryAgentTasks", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(p00.n, new u0(new t("after"))), new aa.k(p00.o, new u0(new t("first"))), new aa.k(p00.p, new u0(new t("name"))), new aa.k(p00.q, new u0(new t("orderBy"))), new aa.k(p00.r, new u0(new t("owner"))), new aa.k(p00.s, new u0(new t("states")))}), r3);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar4, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
