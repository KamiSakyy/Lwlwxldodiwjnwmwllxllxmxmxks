package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ka0 implements aaShadow.w0 {
    public static final ha0 Companion = new ha0();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.i6.a;
        List list2 = fc0.i6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ka0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.pv.a, false);
    }

    public final int hashCode() {
        return k71.x.a(ka0.class).hashCode();
    }

    public final String i() {
        return "683799b8b8f53b14bae293cf8b37eacd822b345c118c2d84db8ee084d889c122";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerIsStaffQuery { viewer { isEmployee id __typename } }";
    }

    public final String name() {
        return "ViewerIsStaffQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
