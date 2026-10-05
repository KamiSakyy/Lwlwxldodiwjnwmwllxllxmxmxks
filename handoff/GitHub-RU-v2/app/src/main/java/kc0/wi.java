package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wi implements aa.n0 {
    public static final ti Companion = new ti();
    public final String r;

    public wi(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.c2.a;
        List list2 = en0.c2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi) && k71.k.b(this.r, ((wi) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.oc.a, false);
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
