package h10;

import java.util.List;
import m10.eh;
import m10.oc0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        oc0.Companion.getClass();
        aa.q0 q0Var = oc0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("unfollowUser", q0Var, (String) null, rVar, no.a.s(vp.W0, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n));
    }
}
