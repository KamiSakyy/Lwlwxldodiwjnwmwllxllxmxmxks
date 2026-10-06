package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gi implements aaShadow.n0 {
    public static final di Companion = new di();
    public String r;

    public gi(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.y1.a;
        List list2 = en0.y1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi) && k71.k.b(this.r, ((gi) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.hc.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "15543c927de2231965000f06a5099a3fedb1d24ab28c008f8445e229510b07dc";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsSaved($id: ID!) { createSavedNotificationThread(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsSaved";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsSavedMutation(id=", this.r, ")");
    }
}
