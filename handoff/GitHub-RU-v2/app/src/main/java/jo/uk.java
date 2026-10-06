package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uk implements aaShadow.n0 {
    public static final rk Companion = new rk();
    public final String r;

    public uk(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.g2.a;
        List list2 = h10.g2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk) && k71.k.b(this.r, ((uk) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.de.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "b40ccc2a5c7ad487b328f514f8f378217b668c94816c616da5360dfcd725f42b";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsDone($id: ID!) { markNotificationAsDone(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsDone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsDoneMutation(id=", this.r, ")");
    }
}
