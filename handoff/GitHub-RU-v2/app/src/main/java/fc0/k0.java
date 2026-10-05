package fc0;

import hc0.t6;
import hc0.wg;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k0 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        t6.Companion.getClass();
        aa.q0 q0Var = t6.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteMobileDeviceToken", q0Var, (String) null, rVar, no.a.s(wg.I, new aa.u0(x61.x.u(new w61.k("deviceToken", new aa.t("deviceToken")), new w61.k("service", "FCM")))), n));
    }
}
