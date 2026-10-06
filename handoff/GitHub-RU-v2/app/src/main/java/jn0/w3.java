package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 implements aaShadow.w0 {
    public static final u3 Companion = new u3();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.u.a;
        List list2 = kz0.u.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == w3.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.g2.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(w3.class).hashCode();
    }

    public final String i() {
        return "35df7aa2a012e7906fe93ea1a526ccfdfc7b9cd536c873dd94e6a7630b2d1b63";
    }

    public final String j() {
        Companion.getClass();
        return "query Capabilities { mobileCapabilities id __typename }";
    }

    public final String name() {
        return "Capabilities";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
