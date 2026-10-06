package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cb0 implements aaShadow.w0 {
    public static final za0 Companion = new za0();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.i6.a;
        List list2 = en0.i6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == cb0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.iw.a, false);
    }

    public final int hashCode() {
        return k71.x.a(cb0.class).hashCode();
    }

    public final String i() {
        return "18525371095047915a62aa0722e7f8f8830dc0e14a100d830083641eaacf730c";
    }

    public final String j() {
        Companion.getClass();
        return "query UserDashboardNavLinks { viewer { __typename ...HomeNavLinks id } }  fragment HomeNavLinks on User { dashboard { navLinks { identifier hidden } id __typename } id __typename }";
    }

    public final String name() {
        return "UserDashboardNavLinks";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
