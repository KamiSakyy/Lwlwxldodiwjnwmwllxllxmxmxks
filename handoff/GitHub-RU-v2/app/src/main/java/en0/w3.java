package en0;

import gn0.eq;
import gn0.jj;
import gn0.kq;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w3 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        gn0.l.Companion.getClass();
        aa.j0 j0Var = gn0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar2 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list2 = xk0.h.a;
        List r5 = x61.l.r(new aa.s[]{mVar3, no.a.c(list2, "selections", "User", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r4);
        rb.Companion.getClass();
        aa.x xVar3 = rb.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("nodes", v8.l0.a(s00.P), (String) null, rVar, rVar, r5)});
        aa.r b2 = v8.l0.b(xVar3);
        eq.Companion.getClass();
        aa.m mVar6 = new aa.m("planLimit", b2, (String) null, rVar, no.a.s(eq.J, new aa.u0("MANUAL_REVIEW_REQUESTS")), rVar);
        ll.Companion.getClass();
        aa.q0 q0Var = ll.K;
        k71.k.g(q0Var, "type");
        aa.m mVar7 = new aa.m("pullRequest", q0Var, (String) null, rVar, no.a.s(eq.L, new aa.u0(new aa.t("pullNumber"))), r3);
        kq.Companion.getClass();
        aa.q0 q0Var2 = kq.a;
        k71.k.g(q0Var2, "type");
        List r7 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("collaborators", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.d, new aa.u0(new aa.t("after"))), new aa.k(eq.e, new aa.u0(50)), new aa.k(eq.f, new aa.u0(new aa.t("query")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repo"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r7));
    }
}
