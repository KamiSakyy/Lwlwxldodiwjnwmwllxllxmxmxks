package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xj implements aaShadow.n0 {
    public static final uj Companion = new uj();
    public String r;

    public xj(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.e2.a;
        List list2 = kz0.e2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xj) && k71.k.b(this.r, ((xj) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.md.a, false);
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
