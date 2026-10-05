package kz0;

import java.util.List;
import pz0.jx;
import pz0.mv;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Commit");
        List list = dq0.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        aa.x xVar3 = vd.a;
        aa.m mVar2 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pz0.s4.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(pz0.s4.j), (String) null, rVar, rVar, r)});
        aa.m mVar3 = new aa.m("aheadBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("behindBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pz0.e5.Companion.getClass();
        aa.r b2 = v8.l0.b(pz0.e5.a);
        pz0.c5.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("commits", b2, (String) null, rVar, no.a.s(pz0.c5.b, new aa.u0(50)), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = pz0.c5.d;
        k71.k.g(q0Var, "type");
        mv.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(mv.d, new aa.u0(new aa.t("headRef"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = mv.e;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(jx.W, new aa.u0(new aa.t("baseRef"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("name"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
