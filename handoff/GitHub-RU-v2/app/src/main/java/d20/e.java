package d20;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements w0 {
    public static final a Companion = new a();
    public final String r;

    public e(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = f20.a.a;
        List list2 = f20.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k71.k.b(this.r, ((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(e20.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "798d2335253b037d7f8af42391f61c65e5dfa0f635509c23e9b918270e045ea5";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitUpdateChannel($id: ID!) { node(id: $id) { __typename ... on Commit { id oid updatesChannel } id } }";
    }

    public final String name() {
        return "CommitUpdateChannel";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("CommitUpdateChannelQuery(id=", this.r, ")");
    }


}
