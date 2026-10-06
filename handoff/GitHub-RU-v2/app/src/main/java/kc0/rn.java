package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rn implements aaShadow.w0 {
    public static final on Companion = new on();
    public final aa.u0 r;

    public rn(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.w2.a;
        List list2 = en0.w2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn) && this.r.equals(((rn) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.wf.a, false);
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
        aa.c.d(aa.c.b(od0.b.a)).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4.j(this.r, "PinnedItemsQuery(pinnedItemsCount=", ")");
    }
}
