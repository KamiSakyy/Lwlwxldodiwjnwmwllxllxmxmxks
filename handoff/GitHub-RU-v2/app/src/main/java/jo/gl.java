package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gl implements aaShadow.n0 {
    public static final dl Companion = new dl();
    public String r;

    public gl(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.j2.a;
        List list2 = h10.j2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl) && k71.k.b(this.r, ((gl) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.je.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5b8f9fb2eb27418fa5be5901fe4fb782c603f79c30531bbb4347c76144d36786";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkNotificationAsUndone($id: ID!) { markNotificationAsUndone(input: { id: $id } ) { success } }";
    }

    public final String name() {
        return "MarkNotificationAsUndone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkNotificationAsUndoneMutation(id=", this.r, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }
}
