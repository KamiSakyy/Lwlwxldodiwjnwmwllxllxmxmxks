package fc0;

import hc0.le;
import hc0.wg;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c2 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        le.Companion.getClass();
        aa.q0 q0Var = le.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("markNotificationsAsUnread", q0Var, (String) null, rVar, no.a.s(wg.f0, new aa.u0(a0.s0.p("ids", new aa.t("ids")))), n));
    }
}
