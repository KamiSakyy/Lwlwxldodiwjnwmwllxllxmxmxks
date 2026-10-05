package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 implements aa.w0 {
    public static final c4 Companion = new c4();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.v.a;
        List list2 = h10.v.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e4.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.m2.a, false);
    }

    public final int hashCode() {
        return k71.x.a(e4.class).hashCode();
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
