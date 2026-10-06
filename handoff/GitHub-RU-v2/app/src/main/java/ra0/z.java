package ra0;

import aa.n0;
import aa.p0;
import aa.q0;
import hc0.bz;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements n0 {
    public static final v Companion = new v();
    public final bz r;

    public z(bz bzVar) {
        this.r = bzVar;
    }

    public final aa.m d() {
        wg.Companion.getClass();
        q0 q0Var = wg.c1;
        k71.k.g(q0Var, "type");
        List list = ta0.e.a;
        List list2 = ta0.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && k71.k.b(this.r, ((z) obj).r);
    }

    public final p0 g() {
        return aa.c.c(sa0.n.a, false);
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
        aa.c.c(ic0.b.q, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateUserListMetadataMutation(input=" + this.r + ")";
    }
}
