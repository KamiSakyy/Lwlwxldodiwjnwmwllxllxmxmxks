package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lu implements aaShadow.w0 {
    public static final eu Companion = new eu();
    public final String r;
    public final aa.u0 s;

    public lu(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.r3.a;
        List list2 = en0.r3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu)) {
            return false;
        }
        lu luVar = (lu) obj;
        return k71.k.b(this.r, luVar.r) && this.s.equals(luVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.uk.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "99899a7b6acef67790169d2987df1072c024de889ef169dc861e61b121cd246d";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoWatchersById($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on Repository { watchers(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepoWatchersById";
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
        return jo.f4.k(this.s, "RepoWatchersByIdQuery(id=", this.r, ", first=30, after=", ")");
    }
}
