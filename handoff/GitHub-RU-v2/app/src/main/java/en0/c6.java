package en0;

import gn0.ez;
import gn0.ft;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("SearchShortcut");
        List list = dk0.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        aa.q0 q0Var = ft.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("shortcut", q0Var, (String) null, rVar, rVar, r));
        ez.Companion.getClass();
        aa.q0 q0Var2 = ez.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDashboardSearchShortcut", q0Var2, (String) null, rVar, no.a.s(wh.L0, new aa.u0(new aa.t("input"))), n2));
    }
}
