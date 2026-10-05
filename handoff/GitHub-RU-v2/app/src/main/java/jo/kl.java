package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kl implements aa.n0 {
    public static final hl Companion = new hl();
    public final String r;

    public kl(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.k2.a;
        List list2 = h10.k2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl) && k71.k.b(this.r, ((kl) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.le.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "050456b992c4554f9ef4254018ab565f1be3bc5252731e9f6a3ee8a1520bfd25";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsUnread($id: ID!) { markNotificationAsUnread(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsUnread";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsUnreadMutation(id=", this.r, ")");
    }
}
