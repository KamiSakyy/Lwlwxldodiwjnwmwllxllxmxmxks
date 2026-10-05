package h10;

import java.util.List;
import m10.bg0;
import m10.dg0;
import m10.ff0;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c7 {
    public static final List a;

    static {
        dg0.Companion.getClass();
        aa.r b = v8.l0.b(dg0.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("identifier", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("hidden", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        bg0.Companion.getClass();
        List n = sy.d0.n(new aa.m("navLinks", v8.l0.a(v8.l0.b(bg0.a)), (String) null, rVar, rVar, r));
        ff0.Companion.getClass();
        aa.q0 q0Var = ff0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updateUserDashboardNavLinks", q0Var, (String) null, rVar, no.a.s(vp.v1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("hiddenLinks", new aa.t("hiddenLinks")), new w61.k("sortedLinks", new aa.t("sortedLinks"))}))), n));
    }
}
