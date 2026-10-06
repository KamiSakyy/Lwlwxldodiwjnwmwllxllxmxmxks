package en0;

import gn0.ft;
import gn0.pb;
import gn0.tb;
import gn0.uu;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = dk0.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("shortcuts", v8.l0.a(v8.l0.b(ft.a)), (String) null, rVar, rVar, r));
        uu.Companion.getClass();
        aa.q0 q0Var = uu.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("setDashboardSearchShortcuts", q0Var, (String) null, rVar, no.a.s(wh.y0, new aa.u0(new aa.t("input"))), n2));
    }
}
