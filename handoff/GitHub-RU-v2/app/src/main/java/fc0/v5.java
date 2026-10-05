package fc0;

import hc0.bb;
import hc0.bs;
import hc0.fb;
import hc0.vx;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("SearchShortcut");
        List list = l90.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        bs.Companion.getClass();
        aa.q0 q0Var = bs.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("shortcut", q0Var, (String) null, rVar, rVar, r));
        vx.Companion.getClass();
        aa.q0 q0Var2 = vx.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDashboardSearchShortcut", q0Var2, (String) null, rVar, no.a.s(wg.J0, new aa.u0(new aa.t("input"))), n2));
    }
}
