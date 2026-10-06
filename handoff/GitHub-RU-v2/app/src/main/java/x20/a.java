package x20;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import fa0.h;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.qz;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xa.Companion.getClass();
        r b = l0.b(xa.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r);
        db.Companion.getClass();
        x xVar3 = db.a;
        m mVar4 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, mVar4, new m("nodes", l0.a(kz.O), (String) null, rVar, rVar, r2)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar3);
        ap.Companion.getClass();
        m mVar6 = new m("planLimit", b2, (String) null, rVar, no.a.s(ap.I, new u0("ISSUE_PR_ASSIGNEES")), rVar);
        qz.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, mVar6, new m("assignableUsers", l0.b(qz.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(ap.a, new u0(new t("after"))), new aa.k(ap.b, new u0(50)), new aa.k(ap.c, new u0(new t("query")))}), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = ap.k0;
        k.g(q0Var, "type");
        pm.Companion.getClass();
        a = d0Shadow.n(new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(pm.i, new u0(new t("repo"))), new aa.k(pm.j, new u0(new t("owner")))}), r4));
    }
}
