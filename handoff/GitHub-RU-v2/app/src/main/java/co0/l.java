package co0;

import aa.j0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import pz0.y90;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        r b2 = l0.b(pd.a);
        y90.Companion.getClass();
        s mVar3 = new aa.m("hasWorkflowDispatchTriggerForBranch", b2, (String) null, rVar, no.a.s(y90.a, new u0(new t("branchRef"))), rVar);
        List n = d0.n("Workflow");
        List list = wn0.i.a;
        List r = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0.n("Workflow"), x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Workflow", n, list)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("workflowId"))), r), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
