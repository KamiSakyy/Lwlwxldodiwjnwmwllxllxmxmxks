package fc0;

import hc0.da;
import hc0.fb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        da.Companion.getClass();
        aa.q0 q0Var = da.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("followUser", q0Var, (String) null, rVar, no.a.s(wg.S, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n));
    }
}
