package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class je implements aaShadow.w0 {
    public static final zd Companion = new zd();
    public final String r;
    public final aa.u0 s;

    public je(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.i1.a;
        List list2 = fc0.i1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        return k71.k.b(this.r, jeVar.r) && this.s.equals(jeVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.j9.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "64ad1e224bfaae398cfa7c8034e9cbdddd85351586495f01dc95021377deb3e3";
    }

    public final String j() {
        Companion.getClass();
        return "query FollowQuery($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on User { following(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } followers(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "FollowQuery";
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
        return jo.f4.k(this.s, "FollowQuery(id=", this.r, ", first=30, after=", ")");
    }
}
