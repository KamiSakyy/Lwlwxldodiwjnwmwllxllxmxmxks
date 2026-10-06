package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nz implements aaShadow.w0 {
    public static final hz Companion = new hz();
    public String r;
    public aa.u0 s;

    public nz(aa.u0 u0Var, String str) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.m4.a;
        List list2 = en0.m4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz)) {
            return false;
        }
        nz nzVar = (nz) obj;
        return k71.k.b(this.r, nzVar.r) && this.s.equals(nzVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ho.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "4360b70826a3d92bd05283705da9b9a2dabb4020562f5f8a82e4551af3017f0d";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchOrganization($query: String!, $first: Int!, $after: String) { search(query: $query, type: USER, first: $first, after: $after) { userCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Organization { __typename ...OrganizationListItemFragment id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
    }

    public final String name() {
        return "SearchOrganization";
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
        return jo.f4Shadow.k(this.s, "SearchOrganizationQuery(query=", this.r, ", first=30, after=", ")");
    }
    public nz(Object p1, Object p2) {
    }
}
