package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jp implements aaShadow.w0 {
    public static final gp Companion = new gp();
    public aa.u0 r;

    public jp(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.c3.a;
        List list2 = kz0.c3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp) && this.r.equals(((jp) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.bh.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "90703ccddd24e197d8fa643729a336f0102d8b8ef3c3a8f2a3d1464c2023c887";
    }

    public final String j() {
        Companion.getClass();
        return "query PinnedItems($pinnedItemsCount: Int = 25 ) { viewer { __typename id ...HomePinnedItems } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment HomePinnedItems on User { dashboardPinnedItems(first: $pinnedItemsCount) { nodes { __typename ... on Node { id } ...SimpleRepositoryFragment } } id __typename }";
    }

    public final String name() {
        return "PinnedItems";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pinnedItemsCount");
        aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4Shadow.j(this.r, "PinnedItemsQuery(pinnedItemsCount=", ")");
    }
}
