package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gi implements aaShadow.n0 {
    public static final di Companion = new di();
    public List r;

    public gi(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.b2.a;
        List list2 = fc0.b2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi) && k71.k.b(this.r, ((gi) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ac.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "aa3d90a1ff6ab08702ffb8e90a7c54f1c84ff3dbf5c0e5408f08924f2e1a4e98";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationsAsUndone($ids: [ID!]!) { markNotificationsAsUndone(input: { ids: $ids } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationsAsUndone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ids");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MarkNotificationsAsUndoneMutation(ids=", ")", this.r);
    }
}
