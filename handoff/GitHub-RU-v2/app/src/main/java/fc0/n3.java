package fc0;

import hc0.ap;
import hc0.bb;
import hc0.di;
import hc0.dq;
import hc0.fb;
import hc0.ip;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n3 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = x80.f.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = x80.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        bb.Companion.getClass();
        aa.x xVar3 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.q0 q0Var = ji.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        ap.Companion.getClass();
        aa.q0 q0Var2 = ap.k0;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        ip.Companion.getClass();
        aa.q0 q0Var3 = ip.a;
        aa.r b2 = v8.l0.b(q0Var3);
        kz.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.x, new aa.u0(new aa.t("after"))), new aa.k(kz.y, new aa.u0(new aa.t("first"))), new aa.k(kz.z, new aa.u0(new aa.t("language"))), new aa.k(kz.A, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(kz.B, new aa.u0(sy.d0.n("OWNER"))), new aa.k(kz.C, new aa.u0(new aa.t("query"))), new aa.k(kz.D, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), list), new aa.n("Repository", sy.d0.n("Repository"), list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        aa.r b3 = v8.l0.b(q0Var3);
        di.Companion.getClass();
        List r6 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), r4), new aa.n("Organization", sy.d0.n("Organization"), x61.l.r(new aa.m[]{new aa.m("repositories", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(di.b, new aa.u0(new aa.t("after"))), new aa.k(di.c, new aa.u0(new aa.t("first"))), new aa.k(di.d, new aa.u0(new aa.t("language"))), new aa.k(di.e, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(di.f, new aa.u0(sy.d0.n("OWNER"))), new aa.k(di.g, new aa.u0(new aa.t("query"))), new aa.k(di.h, new aa.u0(new aa.t("type")))}), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        dq.Companion.getClass();
        aa.j0 j0Var = dq.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(pm.k, new aa.u0(new aa.t("login"))), r6));
    }
}
