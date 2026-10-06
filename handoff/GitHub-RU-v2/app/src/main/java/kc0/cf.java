package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cf implements aaShadow.w0 {
    public static final se Companion = new se();
    public String r;
    public aa.u0 s;

    public cf(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.l1.a;
        List list2 = en0.l1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return k71.k.b(this.r, cfVar.r) && this.s.equals(cfVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.w9.a, false);
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
        return jo.f4Shadow.k(this.s, "FollowQuery(id=", this.r, ", first=30, after=", ")");
    }
}
