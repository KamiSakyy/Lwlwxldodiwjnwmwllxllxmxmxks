package co0;

import aa.j0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.ja0;
import pz0.na0;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.wk;
import pz0.xd;
import pz0.y90;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRunConnection");
        List list = wn0.j.a;
        s c = no.a.c(list, "selections", "WorkflowRunConnection", n, list);
        vd.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new aa.m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar2 = td.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar4 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        na0.Companion.getClass();
        aa.m mVar5 = new aa.m("state", l0.b(na0.s), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar6 = new aa.m("hasWorkflowDispatchTriggerForBranch", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        ja0.Companion.getClass();
        r b2 = l0.b(ja0.a);
        y90.Companion.getClass();
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0Shadow.n("Workflow"), x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new aa.m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(y90.c, new u0(new t("after"))), new aa.k(y90.d, new u0(new t("first")))}), r)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("workflowId"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
