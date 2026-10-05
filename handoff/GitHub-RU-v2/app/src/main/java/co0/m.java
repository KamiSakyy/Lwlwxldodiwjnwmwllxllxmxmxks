package co0;

import aa.j0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ja0;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import pz0.y90;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowRunConnection");
        List list = wn0.j.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowRunConnection", n, list)});
        td.Companion.getClass();
        x xVar2 = td.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ja0.Companion.getClass();
        r b2 = l0.b(ja0.a);
        y90.Companion.getClass();
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Workflow", d0.n("Workflow"), x61.l.r(new aa.m[]{mVar2, new aa.m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(y90.c, new u0(new t("after"))), new aa.k(y90.d, new u0(new t("first")))}), r)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("workflowId"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
