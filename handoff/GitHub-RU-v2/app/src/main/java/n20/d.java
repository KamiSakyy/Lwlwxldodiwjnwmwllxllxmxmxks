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
import hc0.m00;
import hc0.pm;
import hc0.q00;
import hc0.yg;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = x61.l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m00.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("workflow", l0.b(m00.c), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        List r3 = x61.l.r(new m[]{mVar3, mVar4, new m("logoUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("CheckSuite");
        List list = h20.b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        q00.Companion.getClass();
        q0 q0Var = q00.b;
        k71.k.g(q0Var, "type");
        s mVar6 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r2);
        hc0.l0.Companion.getClass();
        q0 q0Var2 = hc0.l0.a;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new s[]{mVar5, c, mVar6, new m("app", q0Var2, (String) null, rVar, rVar, r3)}))});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r4));
    }
}
