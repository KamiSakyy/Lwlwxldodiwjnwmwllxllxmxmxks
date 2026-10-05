package nz0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.sk;
import pz0.xd;
import pz0.yv;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        yv.Companion.getClass();
        q0 q0Var = yv.a;
        k.g(q0Var, "type");
        sk.Companion.getClass();
        a = d0.n(new m("rejectMobileAuthDeviceRequest", q0Var, (String) null, rVar, no.a.s(sk.w0, new u0(s0.p("requestId", new t("requestId")))), n));
    }
}
