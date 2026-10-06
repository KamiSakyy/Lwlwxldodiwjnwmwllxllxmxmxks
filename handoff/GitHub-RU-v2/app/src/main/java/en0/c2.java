package en0;

import gn0.lb;
import gn0.re;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c2 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        re.Companion.getClass();
        aa.q0 q0Var = re.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("markNotificationSubjectAsRead", q0Var, (String) null, rVar, no.a.s(wh.d0, new aa.u0(a0.s0.p("subjectId", new aa.t("id")))), n));
    }
}
