package en0;

import gn0.eq;
import gn0.jj;
import gn0.kg;
import gn0.lb;
import gn0.mg;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f4 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Milestone");
        List list = nh0.a.a;
        aa.s c = no.a.c(list, "selections", "Milestone", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        kg.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(kg.a), (String) null, rVar, rVar, r2)});
        mg.Companion.getClass();
        aa.q0 q0Var = mg.a;
        k71.k.g(q0Var, "type");
        eq.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("milestones", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.B, new aa.u0(new aa.t("after"))), new aa.k(eq.C, new aa.u0(50)), new aa.k(eq.D, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "DUE_DATE")))), new aa.k(eq.E, new aa.u0(new aa.t("query"))), new aa.k(eq.F, new aa.u0(sy.d0.n("OPEN")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repo"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r4));
    }
}
