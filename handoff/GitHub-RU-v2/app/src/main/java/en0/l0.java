package en0;

import gn0.d7;
import gn0.lb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l0 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        d7.Companion.getClass();
        aa.q0 q0Var = d7.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteMobileDeviceToken", q0Var, (String) null, rVar, no.a.s(wh.I, new aa.u0(x61.x.u(new w61.k("deviceToken", new aa.t("deviceToken")), new w61.k("service", "FCM")))), n));
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
}
