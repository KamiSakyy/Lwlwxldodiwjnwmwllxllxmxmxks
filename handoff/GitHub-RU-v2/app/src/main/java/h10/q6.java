package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.hf0;
import m10.rf0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = rx.b.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, no.a.c(list, "selections", "User", n, list)});
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        hf0.Companion.getClass();
        aa.q0 q0Var2 = hf0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateUserDashboardPins", q0Var2, (String) null, rVar, no.a.s(vp.w1, new aa.u0(a0.s0.p("itemIds", new aa.t("itemIds")))), n2));
    }
}
