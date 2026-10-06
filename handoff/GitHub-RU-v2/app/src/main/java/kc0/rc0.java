package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rc0 implements aaShadow.w0 {
    public static final lc0 Companion = new lc0();
    public aa.u0 r;

    public rc0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.q6.a;
        List list2 = en0.q6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc0) && this.r.equals(((rc0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.dx.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode() + (Integer.hashCode(30) * 31);
    }

    public final String i() {
        return "1a6ea85b0e6aaabdce719cb85422f590648e50b6400a9f6db4e881a3bddaa7c3";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerOrganizationsQuery($first: Int!, $after: String) { viewer { organizations(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...OrganizationListItemFragment id } } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
    }

    public final String name() {
        return "ViewerOrganizationsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return jo.f4Shadow.j(this.r, "ViewerOrganizationsQuery(first=30, after=", ")");
    }
}
