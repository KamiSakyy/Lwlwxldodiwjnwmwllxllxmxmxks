package nz0;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.e1;
import pz0.sk;
import pz0.xd;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        e1.Companion.getClass();
        q0 q0Var = e1.a;
        k.g(q0Var, "type");
        sk.Companion.getClass();
        a = d0.n(new m("approveMobileAuthDeviceRequest", q0Var, (String) null, rVar, no.a.s(sk.q, new u0(x61.x.u(new w61.k("requestId", new t("requestId")), new w61.k("signature", new t("signature")), new w61.k("signatureVersion", "V1")))), n));
    }
}
