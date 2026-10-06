package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nm implements aaShadow.w0 {
    public static final km Companion = new km();
    public aa.u0 r;

    public nm(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.s2.a;
        List list2 = fc0.s2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm) && this.r.equals(((nm) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ze.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "16613454c5fc1c3cd663ed4d1f86dc9d8171cbe9f55617763afe33dcde9d2d72";
    }

    public final String j() {
        Companion.getClass();
        return "query PinnedItems($pinnedItemsCount: Int = 25 ) { viewer { __typename id ...HomePinnedItems } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment HomePinnedItems on User { dashboardPinnedItems(first: $pinnedItemsCount) { nodes { __typename ... on Node { id } ...SimpleRepositoryFragment } } id __typename }";
    }

    public final String name() {
        return "PinnedItems";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pinnedItemsCount");
        aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4Shadow.j(this.r, "PinnedItemsQuery(pinnedItemsCount=", ")");
    }
}
