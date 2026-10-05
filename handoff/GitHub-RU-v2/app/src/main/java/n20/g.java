package n20;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.kz;
import hc0.pm;
import hc0.q00;
import hc0.yg;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = x61.l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowRun");
        List list2 = h20.c.a;
        List r3 = x61.l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "WorkflowRun", n, list2)});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        List r4 = x61.l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        s mVar8 = new m("creator", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0.n("CheckSuite");
        List list3 = h20.b.a;
        s c2 = no.a.c(list3, "selections", "CheckSuite", n2, list3);
        q00.Companion.getClass();
        q0 q0Var2 = q00.b;
        k71.k.g(q0Var2, "type");
        s mVar9 = new m("workflowRun", q0Var2, (String) null, rVar, rVar, r3);
        hc0.l0.Companion.getClass();
        q0 q0Var3 = hc0.l0.a;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new s[]{mVar6, mVar7, mVar8, c2, mVar9, new m("app", q0Var3, (String) null, rVar, rVar, r4)}))});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r5));
    }
}
