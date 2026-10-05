package nd0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.y00;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import xk0.h;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        lb.Companion.getClass();
        r b = l0.b(lb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r);
        rb.Companion.getClass();
        x xVar3 = rb.a;
        m mVar4 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, mVar4, new m("nodes", l0.a(s00.P), (String) null, rVar, rVar, r2)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar3);
        eq.Companion.getClass();
        m mVar6 = new m("planLimit", b2, (String) null, rVar, no.a.s(eq.J, new u0("ISSUE_PR_ASSIGNEES")), rVar);
        y00.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, mVar6, new m("assignableUsers", l0.b(y00.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(eq.a, new u0(new t("after"))), new aa.k(eq.b, new u0(50)), new aa.k(eq.c, new u0(new t("query")))}), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = eq.m0;
        k.g(q0Var, "type");
        rn.Companion.getClass();
        a = d0.n(new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rn.l, new u0(new t("repo"))), new aa.k(rn.m, new u0(new t("owner")))}), r4));
    }
}
