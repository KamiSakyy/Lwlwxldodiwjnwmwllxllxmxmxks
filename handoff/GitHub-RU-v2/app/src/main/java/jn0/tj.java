package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tj implements aaShadow.n0 {
    public static final qj Companion = new qj();
    public String r;

    public tj(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.d2.a;
        List list2 = kz0.d2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj) && k71.k.b(this.r, ((tj) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.jd.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "1d6ed3336a76f32d84026d296d83888a600e0bcb200a209e6bc56c9d75fba0b2";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsRead($id: ID!) { markNotificationAsRead(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsRead";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsReadMutation(id=", this.r, ")");
    }
}
