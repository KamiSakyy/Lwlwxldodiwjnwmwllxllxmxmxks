package en0;

import gn0.c10;
import gn0.e10;
import gn0.g00;
import gn0.lb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f6 {
    public static final List a;

    static {
        e10.Companion.getClass();
        aa.r b = v8.l0.b(e10.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("identifier", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("hidden", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar)});
        c10.Companion.getClass();
        List n = sy.d0.n(new aa.m("navLinks", v8.l0.a(v8.l0.b(c10.a)), (String) null, rVar, rVar, r));
        g00.Companion.getClass();
        aa.q0 q0Var = g00.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateUserDashboardNavLinks", q0Var, (String) null, rVar, no.a.s(wh.Z0, new aa.u0(x61.x.u(new w61.k("hiddenLinks", new aa.t("hiddenLinks")), new w61.k("sortedLinks", new aa.t("sortedLinks"))))), n));
    }
}
