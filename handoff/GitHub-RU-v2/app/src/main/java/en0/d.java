package en0;

import gn0.lb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        gn0.t.Companion.getClass();
        aa.q0 q0Var = gn0.t.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addMobileDeviceToken", q0Var, (String) null, rVar, no.a.s(wh.d, new aa.u0(x61.x.u(new w61.k("deviceName", new aa.t("deviceName")), new w61.k("deviceToken", new aa.t("deviceToken")), new w61.k("service", "FCM")))), n));
    }
}
