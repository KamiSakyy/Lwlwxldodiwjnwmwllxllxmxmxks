package en0;

import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.mq;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a5 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = pj0.l.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = pj0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        aa.s mVar3 = new aa.m("hasIssuesEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("isDiscussionsEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("isArchived", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar3 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, mVar3, mVar4, mVar5, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar6 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar6, new aa.m("nodes", v8.l0.a(eq.m0), (String) null, rVar, rVar, r2)});
        mq.Companion.getClass();
        aa.r b2 = v8.l0.b(mq.a);
        s00.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("topRepositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.L, new aa.u0(new aa.t("after"))), new aa.k(s00.M, new aa.u0(new aa.t("first"))), new aa.k(s00.N, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "PUSHED_AT")))), new aa.k(s00.O, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
    }
}
