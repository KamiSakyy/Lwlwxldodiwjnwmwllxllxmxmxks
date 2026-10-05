package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ij implements aa.n0 {
    public static final fj Companion = new fj();
    public final List r;

    public ij(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.f2.a;
        List list2 = en0.f2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij) && k71.k.b(this.r, ((ij) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.uc.a, false);
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
