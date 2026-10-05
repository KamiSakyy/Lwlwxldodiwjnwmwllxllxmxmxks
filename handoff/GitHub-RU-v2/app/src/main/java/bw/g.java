package bw;

import a0.s0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import aa.w0;
import java.util.List;
import k71.k;
import m10.p00;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements w0 {
    public static final a Companion = new a();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;

    public g(String str, aa1.b bVar, aa1.b bVar2) {
        k.g(str, "login");
        k.g(bVar, "after");
        k.g(bVar2, "query");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
    }

    public final m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k.g(q0Var, "type");
        List list = fw.a.a;
        List list2 = fw.a.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.r, gVar.r) && k.b(this.s, gVar.s) && k.b(this.t, gVar.t);
    }

    public final p0 g() {
        return aa.c.c(cw.a.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, s0.b(30, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "2473f1566682eec03f4830d131fda29a05207b5950624e830a2e628db634f453";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryOwnerRepositories($login: String!, $first: Int!, $after: String, $query: String) { repositoryOwner(login: $login) { __typename ...NodeIdFragment repositories(query: $query, first: $first, after: $after, orderBy: { field: PUSHED_AT direction: DESC } ) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...SimpleRepositoryFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment SimpleRepositoryFragment on Repository { name id url owner { __typename id login ...avatarFragment } __typename }";
    }

    public final String name() {
        return "RepositoryOwnerRepositories";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        u0 u0Var = this.s;
        if (u0Var instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        u0 u0Var2 = this.t;
        if (u0Var2 instanceof u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "RepositoryOwnerRepositoriesQuery(login=", this.r, ", first=30, after=", ", query="), this.t, ")");
    }



}
