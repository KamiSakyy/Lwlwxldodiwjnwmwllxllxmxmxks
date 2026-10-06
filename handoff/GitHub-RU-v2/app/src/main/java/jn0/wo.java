package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wo implements aaShadow.w0 {
    public static final qo Companion = new qo();
    public String r;
    public aa.u0 s;

    public wo(aa.u0 u0Var, String str) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.a3.a;
        List list2 = kz0.a3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return k71.k.b(this.r, woVar.r) && this.s.equals(woVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.pg.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "f42990ad49595f5288f7d907acc243b7090b55c826c16b0fcf798a1fe5ba3f26";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationsQuery($login: String!, $first: Int!, $after: String) { user(login: $login) { organizations(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...OrganizationListItemFragment id } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
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
        return jo.f4.k(this.s, "OrganizationsQuery(login=", this.r, ", first=30, after=", ")");
    }
}
