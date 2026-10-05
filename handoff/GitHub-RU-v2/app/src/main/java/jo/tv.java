package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tv implements aa.n0 {
    public static final qv Companion = new qv();
    public final String r;

    public tv(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.v3.a;
        List list2 = h10.v3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && k71.k.b(this.r, ((tv) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.xl.a, false);
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
