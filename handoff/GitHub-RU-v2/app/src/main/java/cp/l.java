package cp;

import aa.j0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.tg0;
import m10.wg;
import m10.zp;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        r b2 = l0.b(wg.a);
        tg0.Companion.getClass();
        s mVar3 = new aa.m("hasWorkflowDispatchTriggerForBranch", b2, (String) null, rVar, no.a.s(tg0.a, new u0(new t("branchRef"))), rVar);
        List n = d0.n("Workflow");
        List list = wo.i.a;
        List r = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0.n("Workflow"), x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Workflow", n, list)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("workflowId"))), r), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
