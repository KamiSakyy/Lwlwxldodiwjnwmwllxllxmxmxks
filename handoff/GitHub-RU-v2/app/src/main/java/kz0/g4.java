package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.mv;
import pz0.nm;
import pz0.o9;
import pz0.pd;
import pz0.pm;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Patch");
        List list = qt0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list, "selections", "Patch", n, list)});
        hm.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        nm.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(nm.b), (String) null, rVar, rVar, r2)});
        vd.Companion.getClass();
        aa.x xVar3 = vd.a;
        aa.m mVar5 = new aa.m("linesAdded", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("linesDeleted", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("filesChanged", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pm.Companion.getClass();
        aa.r b = v8.l0.b(pm.a);
        o9.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, new aa.m("patches", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(o9.b, new aa.u0(new aa.t("after"))), new aa.k(o9.c, new aa.u0(new aa.t("first")))}), r3)});
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = o9.d;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar8, new aa.m("diff", q0Var, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar9 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.c5.Companion.getClass();
        aa.q0 q0Var2 = pz0.c5.d;
        k71.k.g(q0Var2, "type");
        mv.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar9, new aa.m("compare", q0Var2, (String) null, rVar, no.a.s(mv.d, new aa.u0(new aa.t("headRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar10 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var3 = mv.e;
        k71.k.g(q0Var3, "type");
        jx.Companion.getClass();
        List r7 = x61.l.r(new aa.m[]{mVar10, new aa.m("ref", q0Var3, "comparison", rVar, no.a.s(jx.W, new aa.u0(new aa.t("baseRefName"))), r6), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = jx.t0;
        k71.k.g(q0Var4, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repoName"))), new aa.k(su.m, new aa.u0(new aa.t("ownerName")))}), r7), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
