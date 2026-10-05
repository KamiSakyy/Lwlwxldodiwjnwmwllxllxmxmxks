package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jk implements aa.n0 {
    public static final gk Companion = new gk();
    public final String r;

    public jk(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.h2.a;
        List list2 = kz0.h2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk) && k71.k.b(this.r, ((jk) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.rd.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "065349367fb011313f7ee8b2ba4b7716cda6be6d180bdf83f2a5f308410cc2d9";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsUnsaved($id: ID!) { deleteSavedNotificationThread(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsUnsaved";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsUnsavedMutation(id=", this.r, ")");
    }
}
