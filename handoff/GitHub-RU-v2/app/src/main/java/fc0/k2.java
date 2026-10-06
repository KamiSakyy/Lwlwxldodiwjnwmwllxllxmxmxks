package fc0;

import hc0.fb;
import hc0.gg;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        gg.Companion.getClass();
        aa.q0 q0Var = gg.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("mobileEventsUpdate", q0Var, (String) null, rVar, no.a.s(wg.j0, new aa.u0(a0.s0.p("eventsBatch", new aa.t("events")))), n));
    }
}
