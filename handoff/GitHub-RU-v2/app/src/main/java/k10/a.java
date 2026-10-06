package k10;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.vp;
import sy.d0Shadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        m10.xShadow.Companion.getClass();
        q0 q0Var = m10.xShadow.a;
        k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("addMobileDevicePublicKey", q0Var, (String) null, rVar, no.a.s(vp.e, new u0(x61.x.u(new w61.k[]{new w61.k("deviceModel", new t("deviceModel")), new w61.k("deviceName", new t("deviceName")), new w61.k("deviceOs", "ANDROID"), new w61.k("isHardwareBacked", new t("isHardwareBacked")), new w61.k("publicKey", new t("publicKey")), new w61.k("type", new t("type")), new w61.k("verificationMessage", new t("verificationMessage")), new w61.k("verificationSignature", new t("verificationSignature"))}))), n));
    }
}
