package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uh implements aa.n0 {
    public static final rh Companion = new rh();
    public final String r;

    public uh(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.y1.a;
        List list2 = fc0.y1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh) && k71.k.b(this.r, ((uh) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ub.a, false);
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
