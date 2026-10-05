package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ih implements aa.n0 {
    public static final fh Companion = new fh();
    public final String r;

    public ih(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.v1.a;
        List list2 = fc0.v1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih) && k71.k.b(this.r, ((ih) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ob.a, false);
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
}
