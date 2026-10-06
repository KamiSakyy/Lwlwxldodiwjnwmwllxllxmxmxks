package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iv implements aaShadow.n0 {
    public static final fv Companion = new fv();
    public String r;

    public iv(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.t3.a;
        List list2 = h10.t3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv) && k71.k.b(this.r, ((iv) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ql.a, false);
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
