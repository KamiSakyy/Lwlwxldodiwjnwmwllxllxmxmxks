package kz0;

import java.util.List;
import pz0.da;
import pz0.fa;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t0 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionCategory");
        List list = dr0.a.a;
        aa.s c = no.a.c(list, "selections", "DiscussionCategory", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        da.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(da.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fa.Companion.getClass();
        aa.r b2 = v8.l0.b(fa.a);
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("discussionCategories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.j, new aa.u0(new aa.t("after"))), new aa.k(jx.k, new aa.u0(new aa.t("filterByAssignable"))), new aa.k(jx.l, new aa.u0(new aa.t("number")))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = jx.t0;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(su.m, new aa.u0(new aa.t("repositoryOwner")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
