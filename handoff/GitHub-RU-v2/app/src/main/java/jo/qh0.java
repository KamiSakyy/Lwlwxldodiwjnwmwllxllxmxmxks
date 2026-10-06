package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qh0 implements aaShadow.w0 {
    public static final nh0 Companion = new nh0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.f7.a;
        List list2 = h10.f7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == qh0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.c10.a, false);
    }

    public final int hashCode() {
        return k71.x.a(qh0.class).hashCode();
    }

    public final String i() {
        return "038e680fd9bf138df62b46111c0c58eaba5d2e68ae665dbf00549a8f5dd425f3";
    }

    public final String j() {
        Companion.getClass();
        return "query UserDashboardNavLinks { viewer { __typename ...HomeNavLinks id } id __typename }  fragment HomeNavLinks on User { dashboard { navLinks { identifier hidden } id __typename } id __typename }";
    }

    public final String name() {
        return "UserDashboardNavLinks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
