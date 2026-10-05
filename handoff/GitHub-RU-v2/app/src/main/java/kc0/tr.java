package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tr implements aa.n0 {
    public static final qr Companion = new qr();
    public final String r;

    public tr(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.h3.a;
        List list2 = en0.h3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr) && k71.k.b(this.r, ((tr) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.bj.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a3aac5c080a265ef2a587393a1b6430c8f85c63f33888ccd381964e71ad08bda";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveShortcut($id: ID!) { removeDashboardSearchShortcut(input: { shortcutId: $id } ) { clientMutationId } }";
    }

    public final String name() {
        return "RemoveShortcut";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RemoveShortcutMutation(id=", this.r, ")");
    }
}
