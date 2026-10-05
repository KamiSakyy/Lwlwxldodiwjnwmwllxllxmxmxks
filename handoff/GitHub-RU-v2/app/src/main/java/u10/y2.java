package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 implements aa.w0 {
    public static final o2 Companion = new o2();
    public final String r;
    public final aa1.b s;
    public final aa.u0 t;

    public y2(aa.u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "assignableId");
        this.r = str;
        this.s = bVar;
        this.t = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.p.a;
        List list2 = fc0.p.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.r, y2Var.r) && this.s.equals(y2Var.s) && this.t.equals(y2Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.k1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "8ee66799213b0079070a666fc451feeb4b7185fe645a15b3ca8e98d654da860a";
    }

    public final String j() {
        Companion.getClass();
        return "query AssignableUsers($assignableId: ID!, $query: String, $after: String) { viewer { __typename ...UserListItemFragment id } node(id: $assignableId) { __typename id ... on RepositoryNode { repository { id planLimit(feature: ISSUE_PR_ASSIGNEES) __typename } } ... on Assignable { suggestedAssignees(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment id } } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "AssignableUsers";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("assignableId");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(f1.e.o(this.s, "AssignableUsersQuery(assignableId=", this.r, ", query=", ", after="), this.t, ")");
    }
}
