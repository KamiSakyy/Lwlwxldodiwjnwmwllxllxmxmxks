package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0Shadow implements aaShadow.n0 {
    public static final xShadow Companion = new xShadow();
    public String r;

    public Object a0(String str) {
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.e.a;
        List list2 = en0.e.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0Shadow) && k71.k.b(this.r, ((a0Shadow) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.q.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "20e326a13458895121a05cd8d15db059880d6fe9c1f564457f3f9634e21bb1b3";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddPinnedItem($itemId: ID!) { createUserDashboardPin(input: { itemId: $itemId } ) { clientMutationId } }";
    }

    public final String name() {
        return "AddPinnedItem";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("itemId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("AddPinnedItemMutation(itemId=", this.r, ")");
    }
}
