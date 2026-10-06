package kz0;

import java.util.List;
import pz0.bm;
import pz0.hm;
import pz0.jx;
import pz0.ny;
import pz0.pd;
import pz0.rx;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a4 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = vu0.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = vu0.b.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.q0 q0Var = hm.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        aa.q0 q0Var2 = jx.t0;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        rx.Companion.getClass();
        aa.q0 q0Var3 = rx.a;
        aa.r b2 = v8.l0.b(q0Var3);
        w80.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.E, new aa.u0(new aa.t("after"))), new aa.k(w80.F, new aa.u0(new aa.t("first"))), new aa.k(w80.G, new aa.u0(new aa.t("language"))), new aa.k(w80.H, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(w80.I, new aa.u0(sy.d0Shadow.n("OWNER"))), new aa.k(w80.J, new aa.u0(new aa.t("query"))), new aa.k(w80.K, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0Shadow.n("Repository"), list), new aa.n("Repository", sy.d0Shadow.n("Repository"), list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        aa.r b3 = v8.l0.b(q0Var3);
        bm.Companion.getClass();
        List r6 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), r4), new aa.n("Organization", sy.d0Shadow.n("Organization"), x61.l.r(new aa.m[]{new aa.m("repositories", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(bm.dShadow, new aa.u0(new aa.t("after"))), new aa.k(bm.e, new aa.u0(new aa.t("first"))), new aa.k(bm.f, new aa.u0(new aa.t("language"))), new aa.k(bm.g, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(bm.h, new aa.u0(sy.d0Shadow.n("OWNER"))), new aa.k(bm.i, new aa.u0(new aa.t("query"))), new aa.k(bm.j, new aa.u0(new aa.t("type")))}), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        ny.Companion.getClass();
        aa.j0 j0Var = ny.e;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(su.n, new aa.u0(new aa.t("login"))), r6), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
