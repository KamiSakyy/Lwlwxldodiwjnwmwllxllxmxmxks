package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jj0 implements aa.w0 {
    public static final gj0 Companion = new gj0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.o7.a;
        List list2 = h10.o7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == jj0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.c20.a, false);
    }

    public final int hashCode() {
        return k71.x.a(jj0.class).hashCode();
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
