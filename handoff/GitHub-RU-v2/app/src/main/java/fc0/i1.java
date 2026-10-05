package fc0;

import hc0.bb;
import hc0.fa;
import hc0.fb;
import hc0.ha;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import hc0.yg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i1 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = fa0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        aa.x xVar3 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.q0 q0Var = ji.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        kz.Companion.getClass();
        aa.q0 q0Var2 = kz.O;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        ha.Companion.getClass();
        aa.m mVar4 = new aa.m("following", v8.l0.b(ha.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.f, new aa.u0(new aa.t("after"))), new aa.k(kz.g, new aa.u0(new aa.t("first")))}), r3);
        fa.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), x61.l.r(new aa.m[]{mVar4, new aa.m("followers", v8.l0.b(fa.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.d, new aa.u0(new aa.t("after"))), new aa.k(kz.e, new aa.u0(new aa.t("first")))}), r4)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        aa.j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new aa.u0(new aa.t("id"))), r5));
    }
}
