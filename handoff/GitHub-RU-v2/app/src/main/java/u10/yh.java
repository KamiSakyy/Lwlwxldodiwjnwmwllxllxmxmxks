package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yh implements aaShadow.n0 {
    public static final vh Companion = new vh();
    public List r;

    public yh(List list) {
        k71.k.g(list, "ids");
        this.r = list;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.z1.a;
        List list2 = fc0.z1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh) && k71.k.b(this.r, ((yh) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.wb.a, false);
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
