package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fj0 implements aaShadow.w0 {
    public static final cj0 Companion = new cj0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.n7.a;
        List list2 = h10.n7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == fj0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.a20.a, false);
    }

    public final int hashCode() {
        return k71.x.a(fj0.class).hashCode();
    }

    public final String i() {
        return "ac5b7456c14f023d0be33d41f624f08b703a7ddbabdf930eff21969055e969a2";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerHasCreatedListsQuery { viewer { hasCreatedLists id __typename } id __typename }";
    }

    public final String name() {
        return "ViewerHasCreatedListsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
