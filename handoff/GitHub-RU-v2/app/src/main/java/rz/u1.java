package rz;

import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 implements aa.w0 {
    public static final q1 Companion = new q1();
    public String r;
    public aa1.b s;

    public u1(String str, aa1.b bVar) {
        k71.k.g(str, "userLogin");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = b00.m.a;
        List list2 = b00.m.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.r, u1Var.r) && this.s.equals(u1Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(sz.r0.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "a45c7481e8d23028adab2d96df76dc604c0dde1926ddeb031f7411a754ed7b83";
    }

    public final String j() {
        Companion.getClass();
        return "query UserRecentProjectsV2($userLogin: String!, $after: String, $number: Int!) { user(login: $userLogin) { recentProjects(first: $number, after: $after) { __typename ...ProjectV2ConnectionFragment } id __typename } id __typename }  fragment SimpleProjectV2Fragment on ProjectV2 { id title number updatedAt shortDescription public url closed owner { __typename id ... on User { login } ... on Organization { login } } repositories(first: 1) { totalCount nodes { nameWithOwner id __typename } } __typename }  fragment ProjectV2ConnectionFragment on ProjectV2Connection { nodes { __typename ...SimpleProjectV2Fragment id } pageInfo { hasNextPage endCursor hasPreviousPage } }";
    }

    public final String name() {
        return "UserRecentProjectsV2";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userLogin");
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
        return f4.l(this.s, "UserRecentProjectsV2Query(userLogin=", this.r, ", after=", ", number=30)");
    }
}
