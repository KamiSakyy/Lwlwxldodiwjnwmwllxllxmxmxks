package ux0;

import java.util.List;
import pz0.br;
import pz0.su;
import pz0.xl;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p1 implements aa.w0 {
    public static final m1 Companion = new m1();
    public String r;
    public br s;
    public xl t;
    public aa1.b u;

    public p1(String str, br brVar, xl xlVar, aa1.b bVar) {
        k71.k.g(str, "query");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = brVar;
        this.t = xlVar;
        this.u = bVar;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = ey0.l.a;
        List list2 = ey0.l.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return k71.k.b(this.r, p1Var.r) && this.s == p1Var.s && this.t == p1Var.t && k71.k.b(this.u, p1Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(vx0.p0.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, (this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String i() {
        return "4591e0b814974bc0c96aa61b2d22d2e1712f9e51eb89669a56f5cb52cf14a5fd";
    }

    public final String j() {
        Companion.getClass();
        return "query UserAllProjectsV2($query: String!, $orderField: ProjectV2OrderField!, $orderDirection: OrderDirection!, $first: Int!, $after: String) { viewer { allProjectsV2(query: $query, first: $first, after: $after, orderBy: { field: $orderField direction: $orderDirection } ) { __typename ...ProjectV2ConnectionFragment } id __typename } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "UserAllProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("orderField");
        fVar.I(this.s.r);
        fVar.z0("orderDirection");
        fVar.I(this.t.r);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return "UserAllProjectsV2Query(query=" + this.r + ", orderField=" + this.s + ", orderDirection=" + this.t + ", first=30, after=" + this.u + ")";
    }
    public Object getValue() { return null; }
}
