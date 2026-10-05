package fc0;

import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.fi;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q2 {
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
        List n = sy.d0.n("Organization");
        List list = l70.c.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        di.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(di.m), (String) null, rVar, rVar, r2)});
        fi.Companion.getClass();
        aa.r b2 = v8.l0.b(fi.a);
        kz.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("organizations", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.t, new aa.u0(new aa.t("after"))), new aa.k(kz.u, new aa.u0(new aa.t("first")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, no.a.s(pm.q, new aa.u0(new aa.t("login"))), r4));
    }
}
