package ld0;

import a0.s0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import aa.w0;
import com.github.rudroid.copilot.h1;
import gn0.rn;
import java.util.List;
import k71.k;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements w0 {
    public static final b Companion = new b();
    public String r;
    public String s;
    public aa1.b t;
    public u0 u;

    public g(u0 u0Var, aa1.b bVar, String str, String str2) {
        k.g(str, "owner");
        k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = u0Var;
    }

    public final m d() {
        rn.Companion.getClass();
        q0 q0Var = rn.z;
        k.g(q0Var, "type");
        List list = nd0.a.a;
        List list2 = nd0.a.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.r, gVar.r) && k.b(this.s, gVar.s) && this.t.equals(gVar.t) && this.u.equals(gVar.u);
    }

    public final p0 g() {
        return aa.c.c(md0.b.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, h1.i(this.rShadow.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "9d8cb487ac4251a4b412d3e8c41578ed40bf9d06b5f4dc77f9f2065f18909b2d";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryAssignableUsers($owner: String!, $repo: String!, $query: String, $after: String) { repository(owner: $owner, name: $repo) { id planLimit(feature: ISSUE_PR_ASSIGNEES) assignableUsers(first: 50, query: $query, after: $after) { pageInfo { hasNextPage endCursor } totalCount nodes { __typename ...UserListItemFragment id } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }";
    }

    public final String name() {
        return "RepositoryAssignableUsers";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        u0 u0Var = this.t;
        if (u0Var instanceof u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = s0.o("RepositoryAssignableUsersQuery(owner=", this.r, ", repo=", this.s, ", query=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
