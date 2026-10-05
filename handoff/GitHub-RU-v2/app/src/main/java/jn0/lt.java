package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lt implements aa.n0 {
    public static final ht Companion = new ht();
    public final String r;

    public lt(String str) {
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.m3.a;
        List list2 = kz0.m3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt) && k71.k.b(this.r, ((lt) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ik.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "cd93929e3e38ffeb9c2a089320306824d546007d73e30dc8e723305c5bfba953";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemovePinnedItem($itemId: ID!) { deleteUserDashboardPin(input: { itemId: $itemId } ) { clientMutationId } }";
    }

    public final String name() {
        return "RemovePinnedItem";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("itemId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RemovePinnedItemMutation(itemId=", this.r, ")");
    }
}
