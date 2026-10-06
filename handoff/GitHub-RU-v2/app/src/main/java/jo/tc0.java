package jo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tc0 implements aaShadow.n0 {
    public static final pc0 Companion = new pc0();
    public ArrayList r;

    public tc0(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.k6.a;
        List list2 = h10.k6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc0) && this.r.equals(((tc0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.tx.a, false);
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
        aa.c.a(n10.a.v).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.g("UpdateFeedFiltersMutation(filterGroups=", ")", this.r);
    }
}
