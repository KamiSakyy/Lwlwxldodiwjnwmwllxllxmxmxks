package co0;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.ha0;
import pz0.su;
import pz0.td;
import pz0.w0;
import pz0.w80;
import pz0.wk;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowRun");
        List list2 = wn0.c.a;
        List r3 = x61.l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "WorkflowRun", n, list2)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("logoUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar6 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        s mVar8 = new aa.m("creator", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0.n("CheckSuite");
        List list3 = wn0.b.a;
        s c2 = no.a.c(list3, "selections", "CheckSuite", n2, list3);
        ha0.Companion.getClass();
        q0 q0Var2 = ha0.b;
        k71.k.g(q0Var2, "type");
        s mVar9 = new aa.m("workflowRun", q0Var2, (String) null, rVar, rVar, r3);
        w0.Companion.getClass();
        q0 q0Var3 = w0.a;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new s[]{mVar6, mVar7, mVar8, c2, mVar9, new aa.m("app", q0Var3, (String) null, rVar, rVar, r4)}))});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("id"))), r5), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
