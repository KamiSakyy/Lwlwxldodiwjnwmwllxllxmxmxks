package ux0;

import java.util.List;
import jo.f4;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.w0 {
    public static final k0 Companion = new k0();
    public String r;
    public String s;
    public aa.u0 t;
    public aa1.b u;
    public aa1.b v;

    public q0(String str, String str2, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = ey0.g.a;
        List list2 = ey0.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.r, q0Var.r) && k71.k.b(this.s, q0Var.s) && this.t.equals(q0Var.t) && this.u.equals(q0Var.u) && this.v.equals(q0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(vx0.x.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + a0.s0.b(30, f1.e.a(this.u, f4.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31), 31);
    }

    public final String i() {
        return "bb0caba835af70bcc9cc29dca34181154cb1b34a3ce53b4430401da265b9b89f";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryOwnerProjectsV2($owner: String!, $repo: String!, $query: String, $after: String, $number: Int!, $minPermission: ProjectV2PermissionLevel) { repository(owner: $owner, name: $repo) { id owner { __typename id ... on ProjectV2Owner { projectsV2(first: $number, after: $after, query: $query, orderBy: { field: RELEVANCE direction: DESC } , minPermissionLevel: $minPermission) { __typename ...ProjectV2ConnectionFragment } } } __typename } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "RepositoryOwnerProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("query");
        aa.o0 o0Var = aa.c.i;
        aa.c.d(o0Var).d(fVar, wVar, this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        }
        fVar.z0("number");
        fVar.z(30);
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("minPermission");
            aa.c.d(aa.c.b(qz0.b.f)).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryOwnerProjectsV2Query(owner=", this.r, ", repo=", this.s, ", query=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(", number=30, minPermission=");
        return f1.e.k(o, this.v, ")");
    }
}
