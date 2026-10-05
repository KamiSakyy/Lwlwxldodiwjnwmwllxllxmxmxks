package en0;

import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.ta;
import gn0.tb;
import gn0.va;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l1 {
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
        List n = sy.d0.n("User");
        List list = xk0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        aa.x xVar3 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.q0 q0Var = jj.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        s00.Companion.getClass();
        aa.q0 q0Var2 = s00.P;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        va.Companion.getClass();
        aa.m mVar4 = new aa.m("following", v8.l0.b(va.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.f, new aa.u0(new aa.t("after"))), new aa.k(s00.g, new aa.u0(new aa.t("first")))}), r3);
        ta.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), x61.l.r(new aa.m[]{mVar4, new aa.m("followers", v8.l0.b(ta.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.d, new aa.u0(new aa.t("after"))), new aa.k(s00.e, new aa.u0(new aa.t("first")))}), r4)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("id"))), r5));
    }
}
