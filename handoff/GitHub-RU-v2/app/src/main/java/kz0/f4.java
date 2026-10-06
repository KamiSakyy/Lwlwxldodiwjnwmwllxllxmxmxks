package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.mv;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f4 {
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
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = dq0.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list, "selections", "Commit", n, list)});
        hm.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        pz0.s4.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(pz0.s4.j), (String) null, rVar, rVar, r2)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.e5.Companion.getClass();
        aa.r b2 = v8.l0.b(pz0.e5.a);
        pz0.c5.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("commits", b2, "commits", rVar, x61.l.r(new aa.k[]{new aa.k(pz0.c5.a, new aa.u0(new aa.t("after"))), new aa.k(pz0.c5.b, new aa.u0(new aa.t("first")))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = pz0.c5.d;
        k71.k.g(q0Var, "type");
        mv.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(mv.d, new aa.u0(new aa.t("headRefName"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = mv.e;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar7, new aa.m("ref", q0Var2, "comparison", rVar, no.a.s(jx.W, new aa.u0(new aa.t("baseRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repoName"))), new aa.k(su.m, new aa.u0(new aa.t("ownerName")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
