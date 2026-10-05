package dd0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.a20;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.u10;
import gn0.yh;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("WorkflowRunConnection");
        List list = xc0.i.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowRunConnection", n, list)});
        pb.Companion.getClass();
        x xVar2 = pb.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        a20.Companion.getClass();
        r b2 = l0.b(a20.a);
        u10.Companion.getClass();
        List r2 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Workflow", d0.n("Workflow"), x61.l.r(new m[]{mVar2, new m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(u10.a, new u0(new t("after"))), new aa.k(u10.b, new u0(new t("first")))}), r)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("workflowId"))), r2));
    }
}
