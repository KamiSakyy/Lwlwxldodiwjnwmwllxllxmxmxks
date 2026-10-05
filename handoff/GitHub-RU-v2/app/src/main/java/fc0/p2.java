package fc0;

import hc0.bb;
import hc0.di;
import hc0.ew;
import hc0.fb;
import hc0.ji;
import hc0.mv;
import hc0.ov;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p2 {
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
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.x xVar3 = ew.a;
        k71.k.g(xVar3, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("avatarUrl", xVar3, (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar5 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        mv.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(mv.a), (String) null, rVar, rVar, r2)});
        ov.Companion.getClass();
        aa.r b2 = v8.l0.b(ov.a);
        di.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("teams", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(di.i, new aa.u0(new aa.t("after"))), new aa.k(di.j, new aa.u0(50)), new aa.k(di.k, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(di.l, new aa.u0(new aa.t("query")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = di.m;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("organization", q0Var, (String) null, rVar, no.a.s(pm.g, new aa.u0(new aa.t("login"))), r4));
    }
}
