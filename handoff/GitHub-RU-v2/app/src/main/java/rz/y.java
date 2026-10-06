package rz;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.w0 {
    public static final t Companion = new t();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final int u;

    public y(String str, aa1.b bVar, aa1.b bVar2, int i) {
        k71.k.g(str, "ownerLogin");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = b00.e.a;
        List list2 = b00.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.r, yVar.r) && k71.k.b(this.s, yVar.s) && k71.k.b(this.t, yVar.t) && this.u == yVar.u;
    }

    public final aa.p0 g() {
        return aa.c.c(sz.l.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "69cc8e42d2b9e4b1d6a802db630e388acc267750e449b77f6e89988177d0eaac";
    }

    public final String j() {
        Companion.getClass();
        return "query OwnerProjectsV2($ownerLogin: String!, $query: String, $after: String, $number: Int!) { repositoryOwner(login: $ownerLogin) { __typename id ...OrganizationNameAndAvatar ... on ProjectV2Owner { id projectsV2(first: $number, after: $after, query: $query, orderBy: { field: RELEVANCE direction: DESC } ) { __typename ...ProjectV2ConnectionFragment } } } id __typename }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "OwnerProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerLogin");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        fVar.z0("number");
        fVar.z(this.u);
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "OwnerProjectsV2Query(ownerLogin=", this.r, ", query=", ", after=");
        o.append(this.t);
        o.append(", number=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
