package fc0;

import hc0.bb;
import hc0.fb;
import hc0.iz;
import hc0.kz;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("mobileTimeZone", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        iz.Companion.getClass();
        aa.q0 q0Var2 = iz.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateUserMobileTimeZone", q0Var2, (String) null, rVar, no.a.s(wg.b1, new aa.u0(a0.s0.p("timeZone", new aa.t("timeZone")))), n));
    }
}
