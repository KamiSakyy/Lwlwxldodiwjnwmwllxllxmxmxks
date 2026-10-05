package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.oc0;
import m10.rf0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = dq.n.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        oc0.Companion.getClass();
        aa.q0 q0Var2 = oc0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("unfollowUser", q0Var2, (String) null, rVar, no.a.s(vp.W0, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n2));
    }
}
