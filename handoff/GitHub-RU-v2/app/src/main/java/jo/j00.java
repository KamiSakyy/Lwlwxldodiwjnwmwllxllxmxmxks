package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j00 implements aaShadow.w0 {
    public static final d00 Companion = new d00();
    public String r;
    public String s;
    public int t;
    public aa1.b u;
    public aa1.b v;

    public j00(int i, aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.l4.a;
        List list2 = h10.l4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return k71.k.b(this.r, j00Var.r) && k71.k.b(this.s, j00Var.s) && this.t == j00Var.t && k71.k.b(this.u, j00Var.u) && k71.k.b(this.v, j00Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ep.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "9cd2ec021f895a8a2a45b177f12e3ae7d29fc9e8dddfecc87c6664b1a9a1d1bb";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCollaborators($owner: String!, $repo: String!, $pullNumber: Int!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { planLimit(feature: MANUAL_REVIEW_REQUESTS) pullRequest(number: $pullNumber) { author { __typename ...actorFields } id __typename } collaborators(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment id } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepositoryCollaborators";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("pullNumber");
        fVar.z(this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryCollaboratorsQuery(owner=", this.r, ", repo=", this.s, ", pullNumber=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(", after=");
        return f1.e.k(o, this.v, ")");
    }
}
