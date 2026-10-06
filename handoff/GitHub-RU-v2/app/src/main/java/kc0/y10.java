package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y10 implements aaShadow.w0 {
    public static final r10 Companion = new r10();
    public String r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;

    public y10(aa.u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
        this.u = aa.t0.d;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.w4.a;
        List list2 = en0.w4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y10)) {
            return false;
        }
        y10 y10Var = (y10) obj;
        return k71.k.b(this.r, y10Var.r) && this.s.equals(y10Var.s) && this.t.equals(y10Var.t) && this.u.equals(y10Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.xp.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, a0.s0.b(30, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "5bbe2b91ebb98a6d23b937ec12eaec763b53e0d045ad185a6299c6971acae802";
    }

    public final String j() {
        Companion.getClass();
        return "query StarredRepositories($login: String!, $query: String, $first: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { repositoryOwner(login: $login) { __typename ...NodeIdFragment ... on User { starredRepositories(first: $first, after: $after, query: $query, orderBy: { field: STARRED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "StarredRepositories";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.l(f1.e.o(this.s, "StarredRepositoriesQuery(login=", this.r, ", query=", ", first=30, after="), this.t, ", includeIssueTemplateProperties=", this.u, ")");
    }
}
