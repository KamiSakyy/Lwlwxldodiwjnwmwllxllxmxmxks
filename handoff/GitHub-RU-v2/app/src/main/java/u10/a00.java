package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a00 implements aaShadow.w0 {
    public static final tz Companion = new tz();
    public String r;
    public aa1.b s;
    public aa1.b t;

    public a00(String str, aa1.b bVar) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = bVar;
        this.t = aa.t0.d;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.p4.a;
        List list2 = fc0.p4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return k71.k.b(this.r, a00Var.r) && this.s.equals(a00Var.s) && this.t.equals(a00Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.no.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "35d58a99bcc589281ea0c2e791be02a60009501ceb6d3a6371dbb33de6ad7509";
    }

    public final String j() {
        Companion.getClass();
        return "query StarredRepositories($login: String!, $first: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { repositoryOwner(login: $login) { __typename ...NodeIdFragment ... on User { starredRepositories(first: $first, after: $after, orderBy: { field: STARRED_AT direction: DESC } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "StarredRepositories";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "StarredRepositoriesQuery(login=", this.r, ", first=30, after=", ", includeIssueTemplateProperties="), this.t, ")");
    }
}
