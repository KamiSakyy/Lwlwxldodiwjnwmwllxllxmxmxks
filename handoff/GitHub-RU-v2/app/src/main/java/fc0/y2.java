package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.qz;
import hc0.vn;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y2 {
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
        List n = sy.d0.n("User");
        List list = fa0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        kz.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(kz.O), (String) null, rVar, rVar, r2)});
        qz.Companion.getClass();
        aa.q0 q0Var = qz.a;
        k71.k.g(q0Var, "type");
        vn.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("mentions", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(vn.a, new aa.u0(new aa.t("after"))), new aa.k(vn.b, new aa.u0(new aa.t("first")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = vn.e;
        k71.k.g(q0Var2, "type");
        ap.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{new aa.m("release", q0Var2, (String) null, rVar, no.a.s(ap.U, new aa.u0(new aa.t("tagName"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = ap.k0;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("name"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r5));
    }
}
