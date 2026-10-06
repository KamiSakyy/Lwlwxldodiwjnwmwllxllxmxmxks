package en0;

import gn0.eq;
import gn0.mo;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = xe0.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        aa.x xVar3 = rb.a;
        aa.m mVar2 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gn0.d4.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(gn0.d4.j), (String) null, rVar, rVar, r)});
        aa.m mVar3 = new aa.m("aheadBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("behindBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gn0.p4.Companion.getClass();
        aa.r b2 = v8.l0.b(gn0.p4.a);
        gn0.n4.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("commits", b2, (String) null, rVar, no.a.s(gn0.n4.a, new aa.u0(50)), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = gn0.n4.b;
        k71.k.g(q0Var, "type");
        mo.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(mo.a, new aa.u0(new aa.t("headRef"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = mo.b;
        k71.k.g(q0Var2, "type");
        eq.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(eq.P, new aa.u0(new aa.t("baseRef"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = eq.m0;
        k71.k.g(q0Var3, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r5));
    }
}
