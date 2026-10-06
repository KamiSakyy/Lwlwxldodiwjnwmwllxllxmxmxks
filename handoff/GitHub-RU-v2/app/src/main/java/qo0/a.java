package qo0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gw0.h;
import java.util.List;
import k71.k;
import pz0.c90;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pd.Companion.getClass();
        r b = l0.b(pd.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        vd.Companion.getClass();
        x xVar3 = vd.a;
        m mVar4 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, mVar4, new m("nodes", l0.a(w80.W), (String) null, rVar, rVar, r2)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar3);
        jx.Companion.getClass();
        m mVar6 = new m("planLimit", b2, (String) null, rVar, no.a.s(jx.M, new u0("ISSUE_PR_ASSIGNEES")), rVar);
        c90.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, mVar6, new m("assignableUsers", l0.b(c90.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(jx.a, new u0(new t("after"))), new aa.k(jx.b, new u0(50)), new aa.k(jx.c, new u0(new t("query")))}), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = jx.t0;
        k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repo"))), new aa.k(su.m, new u0(new t("owner")))}), r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
