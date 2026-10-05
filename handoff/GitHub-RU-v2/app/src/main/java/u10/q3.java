package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 implements aa.w0 {
    public static final o3 Companion = new o3();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.t.a;
        List list2 = fc0.t.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == q3.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.c2.a, false);
    }

    public final int hashCode() {
        return k71.x.a(q3.class).hashCode();
    }

    public final String i() {
        return "272683e5e67d9a0746c0325956d7106ce0c1b23828db04793d1b615b6ef8fde2";
    }

    public final String j() {
        Companion.getClass();
        return "query Capabilities { mobileCapabilities }";
    }

    public final String name() {
        return "Capabilities";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
