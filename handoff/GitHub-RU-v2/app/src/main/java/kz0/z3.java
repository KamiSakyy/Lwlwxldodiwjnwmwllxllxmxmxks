package kz0;

import java.util.List;
import pz0.c90;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.wk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z3 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = gw0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        w80.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(w80.W), (String) null, rVar, rVar, r2)});
        c90.Companion.getClass();
        aa.r b2 = v8.l0.b(c90.a);
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("watchers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.o0, new aa.u0(new aa.t("after"))), new aa.k(jx.p0, new aa.u0(new aa.t("first")))}), r3))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        aa.j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("id"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
