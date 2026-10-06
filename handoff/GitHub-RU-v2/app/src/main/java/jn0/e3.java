package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements aaShadow.w0 {
    public static final u2 Companion = new u2();
    public String r;
    public aa1.b s;
    public aa.u0 t;

    public e3(aa.u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "assignableId");
        this.r = str;
        this.s = bVar;
        this.t = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.q.a;
        List list2 = kz0.q.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.r, e3Var.r) && this.s.equals(e3Var.s) && this.t.equals(e3Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.o1.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "c44a2b166eb53052de76e7daed67c94dd988c89a183b887a10a617a1adcb3f15";
    }

    public final String j() {
        Companion.getClass();
        return "query AssignableUsers($assignableId: ID!, $query: String, $after: String) { viewer { __typename ...UserListItemFragment id } node(id: $assignableId) { __typename id ... on RepositoryNode { repository { id planLimit(feature: ISSUE_PR_ASSIGNEES) __typename } } ... on Assignable { suggestedAssignees(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment id } } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "AssignableUsers";
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
        return f1.e.j(f1.e.o(this.s, "AssignableUsersQuery(assignableId=", this.r, ", query=", ", after="), this.t, ")");
    }
}
