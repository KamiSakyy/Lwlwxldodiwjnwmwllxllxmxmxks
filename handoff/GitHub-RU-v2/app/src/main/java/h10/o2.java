package h10;

import java.util.List;
import m10.il;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o2 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        il.Companion.getClass();
        aa.q0 q0Var = il.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("markNotificationsAsRead", q0Var, (String) null, rVar, no.a.s(vp.r0, new aa.u0(a0.s0.p("ids", new aa.t("ids")))), n));
    }
}
