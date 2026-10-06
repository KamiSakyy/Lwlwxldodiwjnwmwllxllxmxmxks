package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aa.w0 {
    public static final c1 Companion = new c1();
    public String r;
    public String s;
    public aa1.b t;
    public aa.u0 u;

    public m1(aa.u0 u0Var, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = u0Var;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.i.a;
        List list2 = dy.i.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.r, m1Var.r) && k71.k.b(this.s, m1Var.s) && this.t.equals(m1Var.t) && this.u.equals(m1Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.m0.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "24868a8f4ef5f0647311122de8780839cea58b260e7c5c5e133882847744ef45";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryAssignableUsers($owner: String!, $repo: String!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { id planLimit(feature: ISSUE_PR_ASSIGNEES) suggestedActors(first: 50, query: $query, after: $after, capabilities: [CAN_BE_ASSIGNED]) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment ... on Bot { __typename id displayName login isCopilot isAgent ...avatarFragment } ... on Mannequin { id } ... on Organization { id } ... on EnterpriseUserAccount { id } } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepositoryAssignableUsers";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryAssignableUsersQuery(owner=", this.r, ", repo=", this.s, ", query=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
