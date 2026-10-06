package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class em implements aaShadow.n0 {
    public static final bm Companion = new bm();
    public List r;

    public em(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.p2.a;
        List list2 = h10.p2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em) && k71.k.b(this.r, ((em) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ve.a, false);
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
