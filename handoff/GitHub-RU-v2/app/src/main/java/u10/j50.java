package u10;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j50 implements aaShadow.n0 {
    public static final f50 Companion = new f50();
    public final ArrayList r;
    public final aa.u0 s;

    public j50(aa.u0 u0Var, ArrayList arrayList) {
        this.r = arrayList;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.m5.a;
        List list2 = fc0.m5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j50)) {
            return false;
        }
        j50 j50Var = (j50) obj;
        return this.r.equals(j50Var.r) && this.s.equals(j50Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.fs.a, false);
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
        aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return "UpdatePinnedItemsMutation(itemIds=" + this.r + ", pinnedItemsCount=" + this.s + ")";
    }
}
