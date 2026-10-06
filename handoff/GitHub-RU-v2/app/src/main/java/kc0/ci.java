package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ci implements aaShadow.n0 {
    public static final zh Companion = new zh();
    public final String r;

    public ci(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.x1.a;
        List list2 = en0.x1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && k71.k.b(this.r, ((ci) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ec.a, false);
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
