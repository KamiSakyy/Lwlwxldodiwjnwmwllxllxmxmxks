package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c50 implements aaShadow.w0 {
    public static final w40 Companion = new w40();
    public String r;
    public aa.u0 s;

    public c50(aa.u0 u0Var, String str) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.d5.a;
        List list2 = h10.d5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return k71.k.b(this.r, c50Var.r) && this.s.equals(c50Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ns.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "6b29e84c0df1b9f1da92c8c300bca7c7bb6666f5037f41b234e65dc05400cb09";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchOrganization($query: String!, $first: Int!, $after: String) { search(query: $query, type: USER, first: $first, after: $after) { userCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Organization { __typename ...OrganizationListItemFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
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
        return f4.k(this.s, "SearchOrganizationQuery(query=", this.r, ", first=30, after=", ")");
    }
}
