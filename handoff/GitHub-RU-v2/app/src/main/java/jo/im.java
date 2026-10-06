package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class im implements aaShadow.n0 {
    public static final fm Companion = new fm();
    public final List r;

    public im(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.q2.a;
        List list2 = h10.q2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im) && k71.k.b(this.r, ((im) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.xe.a, false);
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
