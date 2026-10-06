package fc0;

import hc0.bb;
import hc0.bs;
import hc0.fb;
import hc0.qt;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l4 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = l90.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        bs.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("shortcuts", v8.l0.a(v8.l0.b(bs.a)), (String) null, rVar, rVar, r));
        qt.Companion.getClass();
        aa.q0 q0Var = qt.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("setDashboardSearchShortcuts", q0Var, (String) null, rVar, no.a.s(wg.w0, new aa.u0(new aa.t("input"))), n2));
    }
}
