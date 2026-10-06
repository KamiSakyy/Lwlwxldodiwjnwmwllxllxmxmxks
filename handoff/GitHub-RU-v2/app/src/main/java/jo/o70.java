package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o70 implements aaShadow.w0 {
    public static final g70 Companion = new g70();
    public final String r;
    public final aa.u0 s;

    public o70(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.n5.a;
        List list2 = h10.n5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return k71.k.b(this.r, o70Var.r) && this.s.equals(o70Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.eu.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "87f0070e18da23bec330994e1401a8c2612b5aec4ef73ae28dea9e2629a99124";
    }

    public final String j() {
        Companion.getClass();
        return "query SponsorshipsAsSponsorQuery($id: ID!, $first: Int!, $after: String) { node(id: $id) { __typename ... on Sponsorable { sponsorshipsAsSponsor(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { sponsorable { __typename ...UserListItemFragment ...OrganizationListItemFragment } id __typename } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
    }

    public final String name() {
        return "SponsorshipsAsSponsorQuery";
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
        return f4.k(this.s, "SponsorshipsAsSponsorQuery(id=", this.r, ", first=30, after=", ")");
    }
}
