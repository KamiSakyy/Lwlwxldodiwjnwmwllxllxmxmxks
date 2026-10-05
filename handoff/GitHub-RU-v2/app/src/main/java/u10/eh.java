package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eh implements aa.n0 {
    public static final bh Companion = new bh();
    public final String r;

    public eh(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.u1.a;
        List list2 = fc0.u1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh) && k71.k.b(this.r, ((eh) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.nb.a, false);
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
