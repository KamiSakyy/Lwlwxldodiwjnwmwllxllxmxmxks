package n20;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.m00;
import hc0.pm;
import hc0.s00;
import hc0.w00;
import hc0.yg;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRunConnection");
        List list = h20.i.a;
        s c = no.a.c(list, "selections", "WorkflowRunConnection", n, list);
        db.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar)});
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        m mVar4 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        w00.Companion.getClass();
        m mVar5 = new m("state", l0.b(w00.s), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        r b2 = l0.b(s00.a);
        m00.Companion.getClass();
        List r2 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Workflow", d0Shadow.n("Workflow"), x61.l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("runs", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(m00.a, new u0(new t("after"))), new aa.k(m00.b, new u0(new t("first")))}), r)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0Shadow.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("workflowId"))), r2));
    }
}
