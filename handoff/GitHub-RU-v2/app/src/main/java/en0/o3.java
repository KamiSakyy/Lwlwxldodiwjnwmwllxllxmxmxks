package en0;

import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.mq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o3 {
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
        List n = sy.d0.n("Repository");
        List list = pj0.f.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = pj0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(eq.m0), (String) null, rVar, rVar, r2)});
        mq.Companion.getClass();
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("forks", v8.l0.b(mq.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.n, new aa.u0(new aa.t("after"))), new aa.k(eq.o, new aa.u0(new aa.t("first")))}), r3))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("id"))), r4));
    }
}
