package kz0;

import java.util.List;
import pz0.pd;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        pz0.v.Companion.getClass();
        aa.q0 q0Var = pz0.v.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("addMobileDeviceToken", q0Var, (String) null, rVar, no.a.s(sk.e, new aa.u0(x61.x.u(new w61.k("deviceName", new aa.t("deviceName")), new w61.k("deviceToken", new aa.t("deviceToken")), new w61.k("service", "FCM")))), n));
    }
}
