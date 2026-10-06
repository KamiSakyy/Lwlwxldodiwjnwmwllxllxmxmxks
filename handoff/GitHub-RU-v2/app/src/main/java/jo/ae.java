package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ae implements aaShadow.w0 {
    public static final xd Companion = new xd();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.h1.a;
        List list2 = h10.h1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ae.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.i9.a, false);
    }

    public final int hashCode() {
        return k71.x.a(ae.class).hashCode();
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
