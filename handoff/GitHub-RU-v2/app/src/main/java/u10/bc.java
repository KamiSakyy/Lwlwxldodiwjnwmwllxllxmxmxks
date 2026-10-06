package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bc implements aaShadow.w0 {
    public static final yb Companion = new yb();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.a1.a;
        List list2 = fc0.a1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == bc.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.y7.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(bc.class).hashCode();
    }

    public final String i() {
        return "d79c482e9524919e8a03023294cd5d6b57a3e0cb39eadd66ec405e003925ea06";
    }

    public final String j() {
        Companion.getClass();
        return "query EnterpriseSupportContact { enterpriseSupportContact { link linkType } }";
    }

    public final String name() {
        return "EnterpriseSupportContact";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
