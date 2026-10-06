package jn0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa0 implements aaShadow.n0 {
    public static final ba0 Companion = new ba0();
    public ArrayList r;

    public fa0(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.b6.a;
        List list2 = kz0.b6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa0) && this.r.equals(((fa0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.yv.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "541788347867d039a0410291b4497c617a65b0f388f993b24fec125184c3e826";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateFeedFilters($filterGroups: [DashboardFeedFilterGroup!]!) { setDashboardFeedFilters(input: { filterGroups: $filterGroups } ) { filters { __typename ...FeedFiltersFragment } } }  fragment FeedFiltersFragment on FeedFilter { name isEnabled filterGroup }";
    }

    public final String name() {
        return "UpdateFeedFilters";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("filterGroups");
        aa.c.a(qz0.a.k).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("UpdateFeedFiltersMutation(filterGroups=", ")", this.r);
    }
}
