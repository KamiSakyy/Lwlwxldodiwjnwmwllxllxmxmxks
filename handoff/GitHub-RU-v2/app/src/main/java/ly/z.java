package ly;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import m10.if0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements n0 {
    public static final v Companion = new v();
    public if0 r;

    public z(if0 if0Var) {
        this.r = if0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = ny.e.a;
        List list2 = ny.e.a;
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
        return aa.c.c(my.n.a, false);
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
        aa.c.c(n10.c.h, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateUserListMetadataMutation(input=" + this.r + ")";
    }
}
