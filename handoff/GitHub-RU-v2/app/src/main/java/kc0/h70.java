package kc0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h70 implements aaShadow.n0 {
    public static final d70 Companion = new d70();
    public ArrayList r;
    public aa.u0 s;

    public h70(aa.u0 u0Var, ArrayList arrayList) {
        this.r = arrayList;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.t5.a;
        List list2 = en0.t5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h70)) {
            return false;
        }
        h70 h70Var = (h70) obj;
        return this.r.equals(h70Var.r) && this.s.equals(h70Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.qt.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "928fcc8ddb281059aa7c8222fcf24deff0dc25d80df0bb410a0a953bbfe0521e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePinnedItems($itemIds: [ID!]!, $pinnedItemsCount: Int = 10 ) { updateUserDashboardPins(input: { itemIds: $itemIds } ) { user { __typename id ...HomePinnedItems } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }  fragment HomePinnedItems on User { dashboardPinnedItems(first: $pinnedItemsCount) { nodes { __typename ... on Node { id } ...SimpleRepositoryFragment } } id __typename }";
    }

    public final String name() {
        return "UpdatePinnedItems";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("itemIds");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
        fVar.z0("pinnedItemsCount");
        aa.c.d(aa.c.b(od0.b.a)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return "UpdatePinnedItemsMutation(itemIds=" + this.r + ", pinnedItemsCount=" + this.s + ")";
    }
}
