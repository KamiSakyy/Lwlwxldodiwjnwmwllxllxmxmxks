package h10;

import java.util.List;
import m10.dp;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        dp.Companion.getClass();
        aa.q0 q0Var = dp.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("mobileEventsUpdate", q0Var, (String) null, rVar, no.a.s(vp.x0, new aa.u0(a0.s0.p("eventsBatch", new aa.t("events")))), n));
    }
}
