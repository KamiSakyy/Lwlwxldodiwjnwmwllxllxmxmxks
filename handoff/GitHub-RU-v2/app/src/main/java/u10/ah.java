package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ah implements aaShadow.n0 {
    public static final xg Companion = new xg();
    public String r;

    public ah(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.t1.a;
        List list2 = fc0.t1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && k71.k.b(this.r, ((ah) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.kb.a, false);
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
