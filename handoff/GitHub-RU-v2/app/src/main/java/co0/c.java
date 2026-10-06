package co0;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.a3;
import pz0.g3;
import pz0.ha0;
import pz0.i3;
import pz0.k3;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import pz0.y90;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        y90.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("workflow", l0.b(y90.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ha0.Companion.getClass();
        q0 q0Var = ha0.b;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("workflowRun", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar4 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckStep");
        List list = wn0.a.a;
        List r4 = x61.l.r(new s[]{mVar4, no.a.c(list, "selections", "CheckStep", n, list)});
        g3.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(g3.a), (String) null, rVar, rVar, r4));
        s mVar5 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("CheckRun");
        List list2 = wn0.f.a;
        s c = no.a.c(list2, "selections", "CheckRun", n3, list2);
        k3.Companion.getClass();
        s mVar6 = new aa.m("checkSuite", l0.b(k3.f), (String) null, rVar, rVar, r3);
        i3.Companion.getClass();
        q0 q0Var2 = i3.a;
        k71.k.g(q0Var2, "type");
        a3.Companion.getClass();
        List r5 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("CheckRun", d0Shadow.n("CheckRun"), x61.l.r(new s[]{mVar5, c, mVar6, new aa.m("steps", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(a3.d, new u0(1)), new aa.k(a3.e, new u0(new t("step")))}), n2)})), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("id"))), r5), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
