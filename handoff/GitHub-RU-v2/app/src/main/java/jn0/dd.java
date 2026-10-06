package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dd implements aaShadow.w0 {
    public static final ad Companion = new ad();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.e1.a;
        List list2 = kz0.e1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == dd.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.s8.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(dd.class).hashCode();
    }

    public final String i() {
        return "076e9d4b5a27b848b17142c445877af636b8ecde18cb288d04f80e2cf6e802a0";
    }

    public final String j() {
        Companion.getClass();
        return "query EnterpriseSupportContact { enterpriseSupportContact { link linkType } id __typename }";
    }

    public final String name() {
        return "EnterpriseSupportContact";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
