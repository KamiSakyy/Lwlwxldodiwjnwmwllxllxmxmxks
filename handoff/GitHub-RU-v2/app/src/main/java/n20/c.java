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
import hc0.fb;
import hc0.l2;
import hc0.m00;
import hc0.pm;
import hc0.q00;
import hc0.r2;
import hc0.t2;
import hc0.v2;
import hc0.yg;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = x61.l.r(new m[]{mVar, new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m00.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("workflow", l0.b(m00.c), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        q00.Companion.getClass();
        q0 q0Var = q00.b;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new m[]{mVar3, new m("workflowRun", q0Var, (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar4 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckStep");
        List list = h20.a.a;
        List r4 = x61.l.r(new s[]{mVar4, no.a.c(list, "selections", "CheckStep", n, list)});
        r2.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(r2.a), (String) null, rVar, rVar, r4));
        s mVar5 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("CheckRun");
        List list2 = h20.f.a;
        s c = no.a.c(list2, "selections", "CheckRun", n3, list2);
        v2.Companion.getClass();
        s mVar6 = new m("checkSuite", l0.b(v2.f), (String) null, rVar, rVar, r3);
        t2.Companion.getClass();
        q0 q0Var2 = t2.a;
        k71.k.g(q0Var2, "type");
        l2.Companion.getClass();
        List r5 = x61.l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckRun", d0Shadow.n("CheckRun"), x61.l.r(new s[]{mVar5, c, mVar6, new m("steps", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(l2.d, new u0(1)), new aa.k(l2.e, new u0(new t("step")))}), n2)})), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0Shadow.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r5));
    }
}
