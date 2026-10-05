package so;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements w0 {
    public static final e Companion = new e();
    public final String r;

    public i(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = uo.b.a;
        List list2 = uo.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && k71.k.b(this.r, ((i) obj).r);
    }

    public final p0 g() {
        return aa.c.c(to.c.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "1369f1a8660c1b432cce844f3144689a8a53a371fa432b6c649fa06bcff0095e";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitUpdateChannel($id: ID!) { node(id: $id) { __typename ... on Commit { id oid updatesChannel } id } id __typename }";
    }

    public final String name() {
        return "CommitUpdateChannel";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("CommitUpdateChannelQuery(id=", this.r, ")");
    }
}
