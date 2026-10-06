package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ug implements aaShadow.w0 {
    public static final kg Companion = new kg();
    public final String r;
    public final aa.u0 s;

    public ug(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.r1.a;
        List list2 = kz0.r1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return k71.k.b(this.r, ugVar.r) && this.s.equals(ugVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.bb.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "b0e411f3741d268927e470d70325e6a84985d9ab9108377cb9c9a2c488a3cf47";
    }

    public final String j() {
        Companion.getClass();
        return "query FollowQuery($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on User { following(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } followers(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
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
