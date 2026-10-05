package h10;

import java.util.List;
import m10.ua0;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s5 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("subscribed", xVar, (String) null, rVar, rVar, rVar));
        ua0.Companion.getClass();
        aa.q0 q0Var = ua0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("subscribeToCopilotLimited", q0Var, (String) null, rVar, no.a.s(vp.R0, new aa.u0(new aa.t("input"))), n));
    }
}
