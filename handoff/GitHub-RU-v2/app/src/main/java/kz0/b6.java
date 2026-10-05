package kz0;

import java.util.List;
import pz0.c20;
import pz0.sk;
import pz0.ub;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("FeedFilter");
        List list = lr0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedFilter", n, list)});
        ub.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("filters", v8.l0.a(v8.l0.b(ub.a)), (String) null, rVar, rVar, r));
        c20.Companion.getClass();
        aa.q0 q0Var = c20.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("setDashboardFeedFilters", q0Var, (String) null, rVar, no.a.s(sk.J0, new aa.u0(a0.s0.p("filterGroups", new aa.t("filterGroups")))), n2));
    }
}
