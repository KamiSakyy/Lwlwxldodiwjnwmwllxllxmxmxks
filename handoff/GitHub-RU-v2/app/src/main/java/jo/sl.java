package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sl implements aaShadow.n0 {
    public static final pl Companion = new pl();
    public String r;

    public sl(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.m2.a;
        List list2 = h10.m2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl) && k71.k.b(this.r, ((sl) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.pe.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "7ed10006ee1bbb1d4bbc62864f5f0db6c83a6d2f4b0f2434887a44ebeba362b6";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationSubjectAsRead($id: ID!) { markNotificationSubjectAsRead(input: { subjectId: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationSubjectAsRead";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationSubjectAsReadMutation(id=", this.r, ")");
    }
}
