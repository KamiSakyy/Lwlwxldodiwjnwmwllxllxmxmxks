package en0;

import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.mo;
import gn0.oo;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v3 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = nj0.a.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "Ref", n, list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r2);
        mo.Companion.getClass();
        aa.q0 q0Var = mo.b;
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r3)});
        aa.m mVar4 = new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r);
        oo.Companion.getClass();
        aa.q0 q0Var2 = oo.a;
        k71.k.g(q0Var2, "type");
        eq.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("refs", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.Q, new aa.u0(new aa.t("after"))), new aa.k(eq.R, new aa.u0(50)), new aa.k(eq.T, new aa.u0(new aa.t("query"))), new aa.k(eq.U, new aa.u0(new aa.t("refPrefix")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repo"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r5));
    }
}
