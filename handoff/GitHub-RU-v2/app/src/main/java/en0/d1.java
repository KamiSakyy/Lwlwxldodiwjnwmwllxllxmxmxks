package en0;

import gn0.eq;
import gn0.ex;
import gn0.jj;
import gn0.lb;
import gn0.mq;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = pj0.f.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        rb.Companion.getClass();
        aa.s mVar2 = new aa.m("contributorsCount", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        aa.m mVar3 = new aa.m("nodes", v8.l0.a(eq.m0), (String) null, rVar, rVar, r);
        jj.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mq.Companion.getClass();
        aa.r b2 = v8.l0.b(mq.a);
        ex.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ex.a, new aa.u0(new aa.t("after"))), new aa.k(ex.b, new aa.u0(new aa.t("number"))), new aa.k(ex.c, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "STARGAZERS"))))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = ex.d;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("topic", q0Var, (String) null, rVar, no.a.s(rn.t, new aa.u0("awesome")), r4));
    }
}
