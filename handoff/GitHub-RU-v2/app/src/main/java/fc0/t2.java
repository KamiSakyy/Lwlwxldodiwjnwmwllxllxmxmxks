package fc0;

import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.jn;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Commit");
        List list = h40.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        aa.x xVar3 = db.a;
        aa.m mVar2 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hc0.t3.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(hc0.t3.j), (String) null, rVar, rVar, r)});
        aa.m mVar3 = new aa.m("aheadBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("behindBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hc0.f4.Companion.getClass();
        aa.r b2 = v8.l0.b(hc0.f4.a);
        hc0.d4.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("commits", b2, (String) null, rVar, no.a.s(hc0.d4.a, new aa.u0(50)), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = hc0.d4.b;
        k71.k.g(q0Var, "type");
        jn.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(jn.a, new aa.u0(new aa.t("headRef"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = jn.b;
        k71.k.g(q0Var2, "type");
        ap.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(ap.O, new aa.u0(new aa.t("baseRef"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = ap.k0;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("name"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r5));
    }
}
