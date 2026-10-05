package en0;

import gn0.gh;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        gh.Companion.getClass();
        aa.q0 q0Var = gh.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("mobileEventsUpdate", q0Var, (String) null, rVar, no.a.s(wh.l0, new aa.u0(a0.s0.p("eventsBatch", new aa.t("events")))), n));
    }
}
