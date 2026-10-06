package kz0;

import java.util.List;
import pz0.sk;
import pz0.td;
import pz0.u80;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("mobileTimeZone", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        aa.q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        u80.Companion.getClass();
        aa.q0 q0Var2 = u80.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateUserMobileTimeZone", q0Var2, (String) null, rVar, no.a.s(sk.u1, new aa.u0(a0.s0.p("timeZone", new aa.t("timeZone")))), n));
    }
}
