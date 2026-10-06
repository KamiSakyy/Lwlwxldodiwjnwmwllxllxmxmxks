package kz0;

import java.util.List;
import pz0.aj;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.yi;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q4 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Milestone");
        List list = xs0.a.a;
        aa.s c = no.a.c(list, "selections", "Milestone", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        yi.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(yi.a), (String) null, rVar, rVar, r2)});
        aj.Companion.getClass();
        aa.q0 q0Var = aj.a;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("milestones", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.E, new aa.u0(new aa.t("after"))), new aa.k(jx.F, new aa.u0(50)), new aa.k(jx.G, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "DUE_DATE")))), new aa.k(jx.H, new aa.u0(new aa.t("query"))), new aa.k(jx.I, new aa.u0(sy.d0Shadow.n("OPEN")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repo"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
