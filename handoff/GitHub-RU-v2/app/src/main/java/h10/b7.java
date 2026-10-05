package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.pf0;
import m10.rf0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("mobileTimeZone", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        pf0.Companion.getClass();
        aa.q0 q0Var2 = pf0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updateUserMobileTimeZone", q0Var2, (String) null, rVar, no.a.s(vp.z1, new aa.u0(a0.s0.p("timeZone", new aa.t("timeZone")))), n));
    }
}
