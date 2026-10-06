package cp;

import aa.j0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.eh0;
import m10.ih0;
import m10.p00;
import m10.tg0;
import m10.wg;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRunConnection");
        List list = wo.j.a;
        s c = no.a.c(list, "selections", "WorkflowRunConnection", n, list);
        ch.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new aa.m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar4 = new aa.m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        ih0.Companion.getClass();
        aa.m mVar5 = new aa.m("state", l0.b(ih0.s), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar6 = new aa.m("hasWorkflowDispatchTriggerForBranch", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        eh0.Companion.getClass();
        r b2 = l0.b(eh0.a);
        tg0.Companion.getClass();
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0Shadow.n("Workflow"), x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new aa.m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(tg0.c, new u0(new t("after"))), new aa.k(tg0.d, new u0(new t("first")))}), r)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("workflowId"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
