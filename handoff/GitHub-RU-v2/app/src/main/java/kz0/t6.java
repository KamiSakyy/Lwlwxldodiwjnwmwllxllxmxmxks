package kz0;

import java.util.List;
import pz0.g90;
import pz0.i90;
import pz0.k80;
import pz0.pd;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t6 {
    public static final List a;

    static {
        i90.Companion.getClass();
        aa.r b = v8.l0.b(i90.s);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("identifier", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("hidden", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar)});
        g90.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("navLinks", v8.l0.a(v8.l0.b(g90.a)), (String) null, rVar, rVar, r));
        k80.Companion.getClass();
        aa.q0 q0Var = k80.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateUserDashboardNavLinks", q0Var, (String) null, rVar, no.a.s(sk.q1, new aa.u0(x61.x.u(new w61.k("hiddenLinks", new aa.t("hiddenLinks")), new w61.k("sortedLinks", new aa.t("sortedLinks"))))), n));
    }
}
