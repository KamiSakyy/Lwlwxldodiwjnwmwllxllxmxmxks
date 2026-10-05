package kz0;

import java.util.List;
import pz0.hm;
import pz0.hs;
import pz0.jx;
import pz0.pd;
import pz0.px;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        pz0.l.Companion.getClass();
        aa.j0 j0Var = pz0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar2 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        pd.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list2 = gw0.h.a;
        List r5 = x61.l.r(new aa.s[]{mVar3, no.a.c(list2, "selections", "User", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r4);
        vd.Companion.getClass();
        aa.x xVar3 = vd.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("nodes", v8.l0.a(w80.W), (String) null, rVar, rVar, r5)});
        aa.r b2 = v8.l0.b(xVar3);
        jx.Companion.getClass();
        aa.m mVar6 = new aa.m("planLimit", b2, (String) null, rVar, no.a.s(jx.M, new aa.u0("MANUAL_REVIEW_REQUESTS")), rVar);
        hs.Companion.getClass();
        aa.q0 q0Var = hs.N;
        k71.k.g(q0Var, "type");
        aa.m mVar7 = new aa.m("pullRequest", q0Var, (String) null, rVar, no.a.s(jx.S, new aa.u0(new aa.t("pullNumber"))), r3);
        px.Companion.getClass();
        aa.q0 q0Var2 = px.a;
        k71.k.g(q0Var2, "type");
        List r7 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("collaborators", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.d, new aa.u0(new aa.t("after"))), new aa.k(jx.e, new aa.u0(50)), new aa.k(jx.f, new aa.u0(new aa.t("query")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repo"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r7), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
