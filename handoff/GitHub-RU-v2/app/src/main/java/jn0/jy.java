package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jy implements aa.w0 {
    public static final dy Companion = new dy();
    public final String r;
    public final String s;
    public final int t;
    public final aa1.b u;
    public final aa1.b v;

    public jy(int i, aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.e4.a;
        List list2 = kz0.e4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        return k71.k.b(this.r, jyVar.r) && k71.k.b(this.s, jyVar.s) && this.t == jyVar.t && k71.k.b(this.u, jyVar.u) && k71.k.b(this.v, jyVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.sn.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "c7291ea5216ede4759adee45cf8ea4a8b2c3f6030a14723a4e0f79d404a7a25f";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCollaborators($owner: String!, $repo: String!, $pullNumber: Int!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { planLimit(feature: MANUAL_REVIEW_REQUESTS) pullRequest(number: $pullNumber) { author { __typename ...actorFields } id __typename } collaborators(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment id } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
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
        StringBuilder o = a0.s0.o("RepositoryCollaboratorsQuery(owner=", this.r, ", repo=", this.s, ", pullNumber=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(", after=");
        return f1.e.k(o, this.v, ")");
    }
}
