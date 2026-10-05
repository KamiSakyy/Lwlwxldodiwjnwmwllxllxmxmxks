package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.kf;
import hc0.mf;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y3 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.r b = v8.l0.b(xa.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Milestone");
        List list = v60.a.a;
        aa.s c = no.a.c(list, "selections", "Milestone", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        kf.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(kf.a), (String) null, rVar, rVar, r2)});
        mf.Companion.getClass();
        aa.q0 q0Var = mf.a;
        k71.k.g(q0Var, "type");
        ap.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("milestones", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.A, new aa.u0(new aa.t("after"))), new aa.k(ap.B, new aa.u0(50)), new aa.k(ap.C, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "DUE_DATE")))), new aa.k(ap.D, new aa.u0(new aa.t("query"))), new aa.k(ap.E, new aa.u0(sy.d0.n("OPEN")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repo"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r4));
    }
}
