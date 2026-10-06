package cp;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch0;
import m10.eh;
import m10.h1;
import m10.p00;
import m10.rf0;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list2 = wo.c.a;
        List r3 = x61.l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "WorkflowRun", n, list2)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("logoUrl", l0.b(cc0.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar6 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        s mVar8 = new aa.m("creator", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0Shadow.n("CheckSuite");
        List list3 = wo.b.a;
        s c2 = no.a.c(list3, "selections", "CheckSuite", n2, list3);
        ch0.Companion.getClass();
        q0 q0Var2 = ch0.b;
        k71.k.g(q0Var2, "type");
        s mVar9 = new aa.m("workflowRun", q0Var2, (String) null, rVar, rVar, r3);
        h1.Companion.getClass();
        q0 q0Var3 = h1.a;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("CheckSuite", d0Shadow.n("CheckSuite"), x61.l.r(new s[]{mVar6, mVar7, mVar8, c2, mVar9, new aa.m("app", q0Var3, (String) null, rVar, rVar, r4)}))});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r5), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
