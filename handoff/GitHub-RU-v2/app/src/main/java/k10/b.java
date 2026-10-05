package k10;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.p1;
import m10.vp;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        p1.Companion.getClass();
        q0 q0Var = p1.a;
        k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0.n(new m("approveMobileAuthDeviceRequest", q0Var, (String) null, rVar, no.a.s(vp.r, new u0(x61.x.u(new w61.k[]{new w61.k("requestId", new t("requestId")), new w61.k("signature", new t("signature")), new w61.k("signatureVersion", "V1")}))), n));
    }
}
