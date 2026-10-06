package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i00 implements aaShadow.w0 {
    public static final c00 Companion = new c00();
    public final String r;
    public final aa1.b s;

    public i00(String str, aa1.b bVar) {
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.p4.a;
        List list2 = en0.p4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return this.r.equals(i00Var.r) && this.s.equals(i00Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.wo.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "e5fcf96408c378098ceb2efe2b0b14ce272c1c4d83c210db3bd81b8f0801b0bb";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchSimpleRepos($query: String!, $first: Int!, $after: String) { search(query: $query, type: REPOSITORY, first: $first, after: $after) { repositoryCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Repository { __typename ...SimpleRepositoryFragment id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
    }

    public final String name() {
        return "SearchSimpleRepos";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "SearchSimpleReposQuery(query=", this.r, ", first=30, after=", ")");
    }
}
