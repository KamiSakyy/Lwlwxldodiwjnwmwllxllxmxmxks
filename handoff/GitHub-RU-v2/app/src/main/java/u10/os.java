package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class os implements aaShadow.w0 {
    public static final hs Companion = new hs();
    public String r;
    public aa.u0 s;

    public os(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.l3.a;
        List list2 = fc0.l3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os)) {
            return false;
        }
        os osVar = (os) obj;
        return k71.k.b(this.r, osVar.r) && this.s.equals(osVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.kj.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "fa82aa0f5718a1d98c029e443566b75688644f2c2ee7c02673a2549ba3f1748d";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoStargazersById($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on Repository { stargazers(first: $first, after: $after, orderBy: { field: STARRED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
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
        return jo.f4.k(this.s, "RepoStargazersByIdQuery(id=", this.r, ", first=30, after=", ")");
    }
}
