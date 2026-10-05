package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x30 implements aa.w0 {
    public static final r30 Companion = new r30();
    public final String r;
    public final aa1.b s;

    public x30(String str, aa1.b bVar) {
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.z4.a;
        List list2 = kz0.z4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x30)) {
            return false;
        }
        x30 x30Var = (x30) obj;
        return this.r.equals(x30Var.r) && this.s.equals(x30Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.rr.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "149404ee0d1678c481dc29322ca556c498b071ee444e47af4d67091d0c6499ff";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchSimpleRepos($query: String!, $first: Int!, $after: String) { search(query: $query, type: REPOSITORY, first: $first, after: $after) { repositoryCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Repository { __typename ...SimpleRepositoryFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
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
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return jo.f4.l(this.s, "SearchSimpleReposQuery(query=", this.r, ", first=30, after=", ")");
    }
}
