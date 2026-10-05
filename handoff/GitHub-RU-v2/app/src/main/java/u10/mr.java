package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mr implements aa.w0 {
    public static final fr Companion = new fr();
    public final String r;
    public final aa.u0 s;

    public mr(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.h3.a;
        List list2 = fc0.h3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr)) {
            return false;
        }
        mr mrVar = (mr) obj;
        return k71.k.b(this.r, mrVar.r) && this.s.equals(mrVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ri.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "d54fbb58d87ecaca4f6c2255085521cd93f77ed67ff4cb3b1807fcb74939b833";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoContributorsById($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on Repository { contributors(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...UserListItemFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepoContributorsById";
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
        return jo.f4.k(this.s, "RepoContributorsByIdQuery(id=", this.r, ", first=30, after=", ")");
    }
}
