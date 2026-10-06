package fc0;

import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.gp;
import hc0.ji;
import hc0.kz;
import hc0.lk;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r3 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        hc0.l.Companion.getClass();
        aa.j0 j0Var = hc0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar2 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        xa.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xa.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list2 = fa0.h.a;
        List r5 = x61.l.r(new aa.s[]{mVar3, no.a.c(list2, "selections", "User", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r4);
        db.Companion.getClass();
        aa.x xVar3 = db.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("nodes", v8.l0.a(kz.O), (String) null, rVar, rVar, r5)});
        aa.r b2 = v8.l0.b(xVar3);
        ap.Companion.getClass();
        aa.m mVar6 = new aa.m("planLimit", b2, (String) null, rVar, no.a.s(ap.I, new aa.u0("MANUAL_REVIEW_REQUESTS")), rVar);
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        aa.m mVar7 = new aa.m("pullRequest", q0Var, (String) null, rVar, no.a.s(ap.K, new aa.u0(new aa.t("pullNumber"))), r3);
        gp.Companion.getClass();
        aa.q0 q0Var2 = gp.a;
        k71.k.g(q0Var2, "type");
        List r7 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("collaborators", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.d, new aa.u0(new aa.t("after"))), new aa.k(ap.e, new aa.u0(50)), new aa.k(ap.f, new aa.u0(new aa.t("query")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = ap.k0;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repo"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r7));
    }
}
