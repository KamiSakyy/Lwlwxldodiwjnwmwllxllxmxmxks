package rz;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.w0 {
    public static final r0 Companion = new r0();
    public final String r;
    public final String s;
    public final int t;
    public final aa1.b u;
    public final aa1.b v;

    public v0(int i, aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "repositoryName");
        k71.k.g(str2, "owner");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = b00.h.a;
        List list2 = b00.h.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.r, v0Var.r) && k71.k.b(this.s, v0Var.s) && this.t == v0Var.t && k71.k.b(this.u, v0Var.u) && k71.k.b(this.v, v0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(sz.c0.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "d4c3feb79480e614e639a8d0f42df0fe818d15c44c69a26d0fd1a3e7f9871aca";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryProjectsV2($repositoryName: String!, $owner: String!, $first: Int!, $query: String, $after: String) { repository(name: $repositoryName, owner: $owner) { id projectsV2(first: $first, after: $after, query: $query, orderBy: { field: RELEVANCE direction: DESC } ) { __typename ...ProjectV2ConnectionFragment } __typename } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "RepositoryProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("owner");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryProjectsV2Query(repositoryName=", this.r, ", owner=", this.s, ", first=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(", after=");
        return f1.e.k(o, this.v, ")");
    }
}
