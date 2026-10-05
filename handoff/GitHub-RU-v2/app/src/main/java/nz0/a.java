package nz0;

import aa.m;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.sk;
import pz0.t;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        o7.Companion.getClass();
        x xVar = o7.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("expiresAt", xVar, (String) null, rVar, rVar, rVar));
        t.Companion.getClass();
        q0 q0Var = t.a;
        k.g(q0Var, "type");
        sk.Companion.getClass();
        a = d0.n(new m("addMobileDevicePublicKey", q0Var, (String) null, rVar, no.a.s(sk.d, new u0(x61.x.u(new w61.k("deviceModel", new aa.t("deviceModel")), new w61.k("deviceName", new aa.t("deviceName")), new w61.k("deviceOs", "ANDROID"), new w61.k("isHardwareBacked", new aa.t("isHardwareBacked")), new w61.k("publicKey", new aa.t("publicKey")), new w61.k("type", new aa.t("type")), new w61.k("verificationMessage", new aa.t("verificationMessage")), new w61.k("verificationSignature", new aa.t("verificationSignature"))))), n));
    }
}
