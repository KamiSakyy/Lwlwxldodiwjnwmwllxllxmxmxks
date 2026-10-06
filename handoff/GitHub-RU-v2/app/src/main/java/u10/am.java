package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class am implements aaShadow.w0 {
    public static final ul Companion = new ul();
    public String r;
    public aa.u0 s;

    public am(aa.u0 u0Var, String str) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.q2.a;
        List list2 = fc0.q2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return k71.k.b(this.r, amVar.r) && this.s.equals(amVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ne.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "c23e811f17b151b2762f23c95961ea8e5e49206e8920897911e70586ab2e930b";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationsQuery($login: String!, $first: Int!, $after: String) { user(login: $login) { organizations(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...OrganizationListItemFragment id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
    }

    public final String name() {
        return "OrganizationsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return jo.f4Shadow.k(this.s, "OrganizationsQuery(login=", this.r, ", first=30, after=", ")");
    }
}
