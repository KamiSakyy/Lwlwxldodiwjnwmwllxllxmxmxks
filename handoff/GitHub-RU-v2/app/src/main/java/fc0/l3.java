package fc0;

import hc0.ap;
import hc0.bb;
import hc0.eu;
import hc0.fb;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import hc0.yg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l3 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.r b = v8.l0.b(xa.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = fa0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        kz.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(kz.O), (String) null, rVar, rVar, r2)});
        eu.Companion.getClass();
        aa.r b2 = v8.l0.b(eu.a);
        ap.Companion.getClass();
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("stargazers", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.Z, new aa.u0(new aa.t("after"))), new aa.k(ap.a0, new aa.u0(new aa.t("first"))), new aa.k(ap.b0, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "STARRED_AT"))))}), r3))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        aa.j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new aa.u0(new aa.t("id"))), r4));
    }
}
