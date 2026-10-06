package kz0;

import java.util.List;
import pz0.jx;
import pz0.rx;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.z40;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = bp0.z.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(jx.t0), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rx.Companion.getClass();
        aa.r b2 = v8.l0.b(rx.a);
        z40.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(z40.b, new aa.u0(5)), new aa.k(z40.c, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "STARGAZERS"))))}), n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = z40.d;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("topic", q0Var, (String) null, rVar, no.a.s(su.t, new aa.u0("awesome")), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
