package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lt implements aaShadow.w0 {
    public static final dt Companion = new dt();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;

    public lt(aa.u0 u0Var, String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = aa.t0.d;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.o3.a;
        List list2 = en0.o3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return k71.k.b(this.r, ltVar.r) && this.s.equals(ltVar.s) && this.t.equals(ltVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ak.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "87ab061df57bd949bd1258a5b9d95dd87b885a76defb5702f8fe593b6d355d4b";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoForksById($id: ID!, $first: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { node(id: $id) { __typename ... on Repository { forks(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "RepoForksById";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
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
        return f1.e.k(f1.e.o(this.s, "RepoForksByIdQuery(id=", this.r, ", first=30, after=", ", includeIssueTemplateProperties="), this.t, ")");
    }
}
