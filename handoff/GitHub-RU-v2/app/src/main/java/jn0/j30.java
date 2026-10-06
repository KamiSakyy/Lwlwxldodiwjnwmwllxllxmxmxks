package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j30 implements aaShadow.w0 {
    public static final d30 Companion = new d30();
    public String r;
    public aa.u0 s;

    public j30(aa.u0 u0Var, String str) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.x4.a;
        List list2 = kz0.x4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        return k71.k.b(this.r, j30Var.r) && this.s.equals(j30Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.hr.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "80a3ead33276984c163ac3a8c83383c3d07498e8a500e3d63816ff4bae65efba";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchPeople($query: String!, $first: Int!, $after: String) { search(query: $query, type: USER, first: $first, after: $after) { userCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on User { __typename ...UserListItemFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
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
        return jo.f4Shadow.k(this.s, "SearchPeopleQuery(query=", this.r, ", first=30, after=", ")");
    }
    public j30(Object p1, Object p2) {
    }
}
