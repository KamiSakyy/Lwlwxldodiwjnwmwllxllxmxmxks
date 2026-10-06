package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cf0 implements aaShadow.w0 {
    public static final ze0 Companion = new ze0();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.w6.a;
        List list2 = kz0.w6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == cf0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.hz.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(cf0.class).hashCode();
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
