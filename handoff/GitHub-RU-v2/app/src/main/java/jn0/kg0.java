package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kg0 implements aaShadow.w0 {
    public static final hg0 Companion = new hg0();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.d7.a;
        List list2 = kz0.d7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == kg0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.a00.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(kg0.class).hashCode();
    }

    public final String i() {
        return "af447fa209ad590805fca0147677b81d5989f9c39dae86f3308ba7785c05e556";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerIsStaffQuery { viewer { isEmployee id __typename } id __typename }";
    }

    public final String name() {
        return "ViewerIsStaffQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
