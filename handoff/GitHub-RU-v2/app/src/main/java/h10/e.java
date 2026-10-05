package h10;

import java.util.List;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        m10.z.Companion.getClass();
        aa.q0 q0Var = m10.z.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("addMobileDeviceToken", q0Var, (String) null, rVar, no.a.s(vp.f, new aa.u0(x61.x.u(new w61.k[]{new w61.k("deviceName", new aa.t("deviceName")), new w61.k("deviceToken", new aa.t("deviceToken")), new w61.k("encryptionKey", new aa.t("encryptionKey")), new w61.k("hmacKey", new aa.t("hmacKey")), new w61.k("platform", 1), new w61.k("service", "FCM")}))), n));
    }
}
