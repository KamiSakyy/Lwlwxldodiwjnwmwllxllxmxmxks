package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zj0 implements aa.w0 {
    public static final tj0 Companion = new tj0();
    public final aa.u0 r;

    public zj0(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.q7.a;
        List list2 = h10.q7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj0) && this.r.equals(((zj0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.l20.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode() + (Integer.hashCode(30) * 31);
    }

    public final String i() {
        return "5415a5e4d5d8d306a4ef36826c10b594e65fb429422d46390fc2907a670e7c3b";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerOrganizationsQuery($first: Int!, $after: String) { viewer { organizations(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...OrganizationListItemFragment id } } id __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
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
        return f4.j(this.r, "ViewerOrganizationsQuery(first=30, after=", ")");
    }
}
