package il0;

import aa.n0;
import aa.p0;
import aa.q0;
import gn0.j00;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z implements n0 {
    public static final v Companion = new v();
    public j00 r;

    public z(j00 j00Var) {
        this.r = j00Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = kl0.e.a;
        List list2 = kl0.e.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && k71.k.b(this.r, ((z) obj).r);
    }

    public final p0 g() {
        return aa.c.c(jl0.n.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "95f1af607edbe27c79e0234be283f22c23a62f5499eedb5fd3cb8b0c416150af";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateUserListMetadata($input: UpdateUserListInput!) { updateUserList(input: $input) { list { id slug name description __typename } } }";
    }

    public final String name() {
        return "UpdateUserListMetadata";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(hn0.b.r, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateUserListMetadataMutation(input=" + this.r + ")";
    }

}
