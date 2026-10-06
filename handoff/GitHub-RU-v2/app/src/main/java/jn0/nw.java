package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nw implements aaShadow.w0 {
    public static final gw Companion = new gw();
    public String r;
    public aa.u0 s;

    public nw(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.y3.a;
        List list2 = kz0.y3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw)) {
            return false;
        }
        nw nwVar = (nw) obj;
        return k71.k.b(this.r, nwVar.r) && this.s.equals(nwVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.im.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "4ec16f4d41ddff3bd9af2539a82ab6de9c23b2d9904766f0e5ba476a1e9f243a";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoStargazersById($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on Repository { stargazers(first: $first, after: $after, orderBy: { field: STARRED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepoStargazersById";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return jo.f4Shadow.k(this.s, "RepoStargazersByIdQuery(id=", this.r, ", first=30, after=", ")");
    }
}
