package en0;

import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.y00;
import gn0.yo;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c3 {
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
        List n = sy.d0.n("User");
        List list = xk0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        s00.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(s00.P), (String) null, rVar, rVar, r2)});
        y00.Companion.getClass();
        aa.q0 q0Var = y00.a;
        k71.k.g(q0Var, "type");
        yo.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("mentions", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(yo.a, new aa.u0(new aa.t("after"))), new aa.k(yo.b, new aa.u0(new aa.t("first")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = yo.e;
        k71.k.g(q0Var2, "type");
        eq.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{new aa.m("release", q0Var2, (String) null, rVar, no.a.s(eq.V, new aa.u0(new aa.t("tagName"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r5));
    }
}
