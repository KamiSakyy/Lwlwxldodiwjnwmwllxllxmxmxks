package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uz implements aaShadow.w0 {
    public static final oz Companion = new oz();
    public String r;
    public aa.u0 s;

    public uz(aa.u0 u0Var, String str) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.n4.a;
        List list2 = en0.n4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        return k71.k.b(this.r, uzVar.r) && this.s.equals(uzVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.mo.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "3bec0af1b0b8a813970be15d3a7c497f7f4e96e18bebb6b37ec3ad16d48c9caf";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchPeople($query: String!, $first: Int!, $after: String) { search(query: $query, type: USER, first: $first, after: $after) { userCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on User { __typename ...UserListItemFragment id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "SearchPeople";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return jo.f4.k(this.s, "SearchPeopleQuery(query=", this.r, ", first=30, after=", ")");
    }
}
