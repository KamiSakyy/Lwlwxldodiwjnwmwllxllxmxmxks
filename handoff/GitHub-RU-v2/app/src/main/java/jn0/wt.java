package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wt implements aaShadow.n0 {
    public static final tt Companion = new tt();
    public String r;

    public wt(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.o3.a;
        List list2 = kz0.o3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt) && k71.k.b(this.r, ((wt) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.pk.a, false);
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
