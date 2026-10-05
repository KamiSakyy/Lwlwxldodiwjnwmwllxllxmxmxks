package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gf implements aa.w0 {
    public static final af Companion = new af();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.m1.a;
        List list2 = h10.m1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == gf.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ca.a, false);
    }

    public final int hashCode() {
        return k71.x.a(gf.class).hashCode();
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
