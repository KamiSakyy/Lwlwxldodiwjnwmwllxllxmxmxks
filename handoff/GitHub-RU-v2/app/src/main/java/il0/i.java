package il0;

import aa.n0;
import aa.p0;
import aa.q0;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements n0 {
    public static final f Companion = new f();
    public String r;

    public i(String str) {
        this.r = str;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = kl0.b.a;
        List list2 = kl0.b.a;
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
        return aa.c.c(jl0.d.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "c965ce7c72482f5b824b6cabaf0ff2a200b3a6bf3ffd800a75281f522d89a4bc";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteList($id: ID!) { deleteUserList(input: { listId: $id } ) { clientMutationId } }";
    }

    public final String name() {
        return "DeleteList";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteListMutation(id=", this.r, ")");
    }

}
