package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 implements aaShadow.w0 {
    public static final z2 Companion = new z2();
    public final String r;
    public final aa1.b s;
    public final aa.u0 t;

    public m3(aa.u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "assignableId");
        this.r = str;
        this.s = bVar;
        this.t = u0Var;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.r.a;
        List list2 = h10.r.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.r, m3Var.r) && this.s.equals(m3Var.s) && this.t.equals(m3Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.r1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "25ba54c5619eed83d2fa836b3934bbaea5999da72d2c3952508711ae5d9fb337";
    }

    public final String j() {
        Companion.getClass();
        return "query AssignableActors($assignableId: ID!, $query: String, $after: String) { viewer { __typename ...UserListItemFragment id } node(id: $assignableId) { __typename id ... on RepositoryNode { repository { id planLimit(feature: ISSUE_PR_ASSIGNEES) __typename } } ... on Assignable { suggestedActors(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment ... on Bot { __typename id displayName isCopilot login isAgent ...avatarFragment } ... on Mannequin { id } ... on Organization { id } } } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "AssignableActors";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("assignableId");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(f1.e.o(this.s, "AssignableActorsQuery(assignableId=", this.r, ", query=", ", after="), this.t, ")");
    }
}
