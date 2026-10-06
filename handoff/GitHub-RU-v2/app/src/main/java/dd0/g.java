package dd0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.mx;
import gn0.n0;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.y10;
import gn0.yh;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = x61.l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list2 = xc0.c.a;
        List r3 = x61.l.r(new s[]{mVar2, mVar3, no.a.c(list2, "selections", "WorkflowRun", n, list2)});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r4 = x61.l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        s mVar8 = new m("creator", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0Shadow.n("CheckSuite");
        List list3 = xc0.b.a;
        s c2 = no.a.c(list3, "selections", "CheckSuite", n2, list3);
        y10.Companion.getClass();
        q0 q0Var2 = y10.b;
        k71.k.g(q0Var2, "type");
        s mVar9 = new m("workflowRun", q0Var2, (String) null, rVar, rVar, r3);
        n0.Companion.getClass();
        q0 q0Var3 = n0.a;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0Shadow.n("CheckSuite"), x61.l.r(new s[]{mVar6, mVar7, mVar8, c2, mVar9, new m("app", q0Var3, (String) null, rVar, rVar, r4)}))});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("id"))), r5));
    }
}
