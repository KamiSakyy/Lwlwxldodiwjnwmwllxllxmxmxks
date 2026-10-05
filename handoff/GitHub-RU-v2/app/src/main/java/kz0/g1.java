package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.rx;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.z40;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = vu0.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        vd.Companion.getClass();
        aa.s mVar2 = new aa.m("contributorsCount", v8.l0.b(vd.a), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        pd.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        aa.m mVar3 = new aa.m("nodes", v8.l0.a(jx.t0), (String) null, rVar, rVar, r);
        hm.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rx.Companion.getClass();
        aa.r b2 = v8.l0.b(rx.a);
        z40.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(z40.a, new aa.u0(new aa.t("after"))), new aa.k(z40.b, new aa.u0(new aa.t("number"))), new aa.k(z40.c, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "STARGAZERS"))))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = z40.d;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("topic", q0Var, (String) null, rVar, no.a.s(su.t, new aa.u0("awesome")), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
