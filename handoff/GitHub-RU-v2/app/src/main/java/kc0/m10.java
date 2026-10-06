package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m10 implements aaShadow.w0 {
    public static final g10 Companion = new g10();
    public aa1.b r;

    public m10(aa1.b bVar) {
        this.r = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.u4.a;
        List list2 = en0.u4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m10) && this.r.equals(((m10) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.qp.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode() + (Integer.hashCode(30) * 31);
    }

    public final String i() {
        return "e74fcccd2fec4d67fcaa362152d714d2c6a0f9b145888f8d8a8f89d5456bd59c";
    }

    public final String j() {
        Companion.getClass();
        return "query SimpleTopRepositoriesQuery($first: Int!, $after: String) { viewer { topRepositories(first: $first, after: $after, orderBy: { field: PUSHED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...SimpleRepositoryFragment isArchived id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
    }

    public final String name() {
        return "SimpleTopRepositoriesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "SimpleTopRepositoriesQuery(first=30, after=" + this.r + ")";
    }
}
