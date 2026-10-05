package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q50 implements aa.w0 {
    public static final k50 Companion = new k50();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;

    public q50(String str, aa1.b bVar) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = bVar;
        this.t = aa.t0.d;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.f5.a;
        List list2 = h10.f5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q50)) {
            return false;
        }
        q50 q50Var = (q50) obj;
        return k71.k.b(this.r, q50Var.r) && this.s.equals(q50Var.s) && this.t.equals(q50Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.xs.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "8a2d23188a3fe161ccee8378e3120a06bbd8f90aabffd7f37c7b2d821119d45c";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchRepos($query: String!, $first: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { search(query: $query, type: REPOSITORY, first: $first, after: $after) { issueCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "SearchRepos";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "SearchReposQuery(query=", this.r, ", first=30, after=", ", includeIssueTemplateProperties="), this.t, ")");
    }
}
