package h10;

import java.util.List;
import m10.c80;
import m10.eh;
import m10.vp;
import m10.ye;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("FeedFilter");
        List list = ts.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedFilter", n, list)});
        ye.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("filters", v8.l0.a(v8.l0.b(ye.a)), (String) null, rVar, rVar, r));
        c80.Companion.getClass();
        aa.q0 q0Var = c80.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("setDashboardFeedFilters", q0Var, (String) null, rVar, no.a.s(vp.N0, new aa.u0(a0.s0.p("filterGroups", new aa.t("filterGroups")))), n2));
    }
}
