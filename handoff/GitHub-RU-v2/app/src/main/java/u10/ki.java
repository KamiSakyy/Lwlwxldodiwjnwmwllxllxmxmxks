package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ki implements aaShadow.n0 {
    public static final hi Companion = new hi();
    public final List r;

    public ki(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.c2.a;
        List list2 = fc0.c2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki) && k71.k.b(this.r, ((ki) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.cc.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "56007b3782a09ddc662670349b3990f5b64f7c3c7d794af1845b5155a0dd7495";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationsAsUnread($ids: [ID!]!) { markNotificationsAsUnread(input: { ids: $ids } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationsAsUnread";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ids");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MarkNotificationsAsUnreadMutation(ids=", ")", this.r);
    }
}
