package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class je implements aaShadow.w0 {
    public static final de Companion = new de();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.j1.a;
        List list2 = kz0.j1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == je.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.m9.a, false);
    }

    public final int hashCode() {
        return k71.x.a(je.class).hashCode();
    }

    public final String i() {
        return "c7acbf18c30d889e93b45f7acfe257374fe5b2bf96baf59ae3cbc213f3654646";
    }

    public final String j() {
        Companion.getClass();
        return "query FeedFilters { viewer { __typename id dashboard { feed { filters { __typename ...FeedFiltersFragment } } id __typename } } id __typename }  fragment FeedFiltersFragment on FeedFilter { name isEnabled filterGroup }";
    }

    public final String name() {
        return "FeedFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
