package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ox implements aaShadow.w0 {
    public static final ix Companion = new ix();
    public String r;
    public aa.u0 s;

    public ox(aa.u0 u0Var, String str) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.f4.a;
        List list2 = fc0.f4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox)) {
            return false;
        }
        ox oxVar = (ox) obj;
        return k71.k.b(this.r, oxVar.r) && this.s.equals(oxVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.wm.a, false);
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
        return jo.f4.k(this.s, "SearchOrganizationQuery(query=", this.r, ", first=30, after=", ")");
    }
}
