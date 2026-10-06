package rz;

import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements aa.w0 {
    public static final o Companion = new o();
    public String r;
    public aa1.b s;

    public s(String str, aa1.b bVar) {
        k71.k.g(str, "orgLogin");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = b00.d.a;
        List list2 = b00.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.r, sVar.r) && this.s.equals(sVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(sz.i.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "e70a10ac16d69f67c5cd5254365f3e900a5bce86a732c196b6cdb36b35b6f463";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationRecentProjectsV2($orgLogin: String!, $after: String, $number: Int!) { organization(login: $orgLogin) { recentProjects(first: $number, after: $after) { __typename ...ProjectV2ConnectionFragment } id __typename } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "OrganizationRecentProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("orgLogin");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("number");
        fVar.z(30);
    }

    public final String toString() {
        return f4.l(this.s, "OrganizationRecentProjectsV2Query(orgLogin=", this.r, ", after=", ", number=30)");
    }
}
