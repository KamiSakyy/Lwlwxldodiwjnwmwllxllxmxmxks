package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wl implements aaShadow.n0 {
    public static final tl Companion = new tl();
    public List r;

    public wl(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.n2.a;
        List list2 = h10.n2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl) && k71.k.b(this.r, ((wl) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.re.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "48f3823e62acdc87845315cfe1f7c5a3701749177f27dbcf4dfe6c4884a48391";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationsAsDone($ids: [ID!]!) { markNotificationsAsDone(input: { ids: $ids } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationsAsDone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ids");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MarkNotificationsAsDoneMutation(ids=", ")", this.r);
    }
}
