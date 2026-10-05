package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jc implements aa.w0 {
    public static final gc Companion = new gc();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.b1.a;
        List list2 = en0.b1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == jc.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.e8.a, false);
    }

    public final int hashCode() {
        return k71.x.a(jc.class).hashCode();
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
