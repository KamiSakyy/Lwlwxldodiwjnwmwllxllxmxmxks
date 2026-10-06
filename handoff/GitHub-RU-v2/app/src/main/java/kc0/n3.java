package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n3 implements aaShadow.w0 {
    public static final h3 Companion = new h3();
    public aa1.b r;

    public n3(aa1.b bVar) {
        k71.k.g(bVar, "after");
        this.r = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.s.a;
        List list2 = en0.s.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3) && k71.k.b(this.r, ((n3) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.x1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5d20aa92ce20a7a78ce59ca2023602de0a622e570ee53930b63808769ddb494f";
    }

    public final String j() {
        Companion.getClass();
        return "query CannedReplies($after: String) { viewer { id savedReplies(first: 30, after: $after) { pageInfo { hasNextPage hasPreviousPage endCursor } nodes { id title body __typename } } __typename } }";
    }

    public final String name() {
        return "CannedReplies";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "CannedRepliesQuery(after=" + this.r + ")";
    }
}
