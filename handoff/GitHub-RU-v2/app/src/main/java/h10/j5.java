package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.f80;
import m10.p60;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = tw.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        p60.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("shortcuts", v8.l0.a(v8.l0.b(p60.a)), (String) null, rVar, rVar, r));
        f80.Companion.getClass();
        aa.q0 q0Var = f80.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("setDashboardSearchShortcuts", q0Var, (String) null, rVar, no.a.s(vp.O0, new aa.u0(new aa.t("input"))), n2));
    }
}
