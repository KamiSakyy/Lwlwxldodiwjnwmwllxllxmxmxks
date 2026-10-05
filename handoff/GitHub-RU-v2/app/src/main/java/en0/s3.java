package en0;

import gn0.dj;
import gn0.eq;
import gn0.hr;
import gn0.jj;
import gn0.lb;
import gn0.mq;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s3 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = pj0.f.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = pj0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        pb.Companion.getClass();
        aa.x xVar3 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.q0 q0Var = jj.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        aa.q0 q0Var2 = eq.m0;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        mq.Companion.getClass();
        aa.q0 q0Var3 = mq.a;
        aa.r b2 = v8.l0.b(q0Var3);
        s00.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.x, new aa.u0(new aa.t("after"))), new aa.k(s00.y, new aa.u0(new aa.t("first"))), new aa.k(s00.z, new aa.u0(new aa.t("language"))), new aa.k(s00.A, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(s00.B, new aa.u0(sy.d0.n("OWNER"))), new aa.k(s00.C, new aa.u0(new aa.t("query"))), new aa.k(s00.D, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), list), new aa.n("Repository", sy.d0.n("Repository"), list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        aa.r b3 = v8.l0.b(q0Var3);
        dj.Companion.getClass();
        List r6 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), r4), new aa.n("Organization", sy.d0.n("Organization"), x61.l.r(new aa.m[]{new aa.m("repositories", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(dj.b, new aa.u0(new aa.t("after"))), new aa.k(dj.c, new aa.u0(new aa.t("first"))), new aa.k(dj.d, new aa.u0(new aa.t("language"))), new aa.k(dj.e, new aa.u0(x61.x.u(new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))))), new aa.k(dj.f, new aa.u0(sy.d0.n("OWNER"))), new aa.k(dj.g, new aa.u0(new aa.t("query"))), new aa.k(dj.h, new aa.u0(new aa.t("type")))}), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        hr.Companion.getClass();
        aa.j0 j0Var = hr.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(rn.n, new aa.u0(new aa.t("login"))), r6));
    }
}
