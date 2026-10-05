package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 implements aa.w0 {
    public static final n3 Companion = new n3();
    public final aa1.b r;

    public t3(aa1.b bVar) {
        k71.k.g(bVar, "after");
        this.r = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.t.a;
        List list2 = kz0.t.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && k71.k.b(this.r, ((t3) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.b2.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ea29e3ae0ff95b916e08f1627f356fefb3956e1529c5dd3278e869b3874f1c48";
    }

    public final String j() {
        Companion.getClass();
        return "query CannedReplies($after: String) { viewer { id savedReplies(first: 30, after: $after) { pageInfo { hasNextPage hasPreviousPage endCursor } nodes { id title body __typename } } __typename } id __typename }";
    }

    public final String name() {
        return "CannedReplies";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "CannedRepliesQuery(after=" + this.r + ")";
    }
}
