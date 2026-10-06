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
import m10.eh0;
import m10.p00;
import m10.tg0;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRunConnection");
        List list = wo.j.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowRunConnection", n, list)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh0.Companion.getClass();
        r b2 = l0.b(eh0.a);
        tg0.Companion.getClass();
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0Shadow.n("Workflow"), x61.l.r(new aa.m[]{mVar2, new aa.m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(tg0.c, new u0(new t("after"))), new aa.k(tg0.d, new u0(new t("first")))}), r)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("workflowId"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
