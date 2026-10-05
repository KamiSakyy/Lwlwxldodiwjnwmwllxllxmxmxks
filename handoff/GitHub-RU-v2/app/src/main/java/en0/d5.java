package en0;

import gn0.sx;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        sx.Companion.getClass();
        aa.q0 q0Var = sx.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("unblockUser", q0Var, (String) null, rVar, no.a.s(wh.B0, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n));
    }
}
