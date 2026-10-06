package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xu implements aaShadow.w0 {
    public static final mu Companion = new mu();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;
    public final aa1.b w;
    public final aa1.b x;
    public final aa1.b y;

    public xu(String str, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa.u0 u0Var2, aa.u0 u0Var3) {
        k71.k.g(str, "login");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
        this.u = bVar2;
        this.v = bVar3;
        this.w = u0Var2;
        this.x = u0Var3;
        this.y = aa.t0.d;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.s3.a;
        List list2 = en0.s3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return k71.k.b(this.r, xuVar.r) && this.s.equals(xuVar.s) && this.t.equals(xuVar.t) && this.u.equals(xuVar.u) && this.v.equals(xuVar.v) && this.w.equals(xuVar.w) && this.x.equals(xuVar.x) && this.y.equals(xuVar.y);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.al.a, false);
    }

    public final int hashCode() {
        return this.y.hashCode() + f1.e.a(this.x, f1.e.a(this.w, f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String i() {
        return "f6a55b9f62cf8072ae2b20d51be9e66f71c41a4bef0d712836f42a636ec8781e";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoriesQuery($login: String!, $first: Int!, $after: String, $query: String, $type: RepositoryType = null , $language: String, $orderField: RepositoryOrderField = PUSHED_AT , $orderDirection: OrderDirection = DESC , $includeIssueTemplateProperties: Boolean = false ) { repositoryOwner(login: $login) { __typename ... on User { repositories(ownerAffiliations: [OWNER], query: $query, type: $type, language: $language, first: $first, after: $after, orderBy: { field: $orderField direction: $orderDirection } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } id } ... on Organization { repositories(ownerAffiliations: [OWNER], query: $query, type: $type, language: $language, first: $first, after: $after, orderBy: { field: $orderField direction: $orderDirection } ) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "RepositoriesQuery";
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
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("type");
            aa.c.d(aa.c.b(hn0.b.i)).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("type");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aaShadow.u0) {
            fVar.z0("language");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var4);
        }
        aa.u0 u0Var5 = this.w;
        if (u0Var5 instanceof aaShadow.u0) {
            fVar.z0("orderField");
            aa.c.d(aa.c.b(hn0.b.g)).d(fVar, wVar, u0Var5);
        } else if (z) {
            fVar.z0("orderField");
            aa.c.l.b(fVar, wVar, "PUSHED_AT");
        }
        aa.u0 u0Var6 = this.x;
        if (u0Var6 instanceof aaShadow.u0) {
            fVar.z0("orderDirection");
            aa.c.d(aa.c.b(hn0.a.D)).d(fVar, wVar, u0Var6);
        } else if (z) {
            fVar.z0("orderDirection");
            aa.c.l.b(fVar, wVar, "DESC");
        }
        aa.u0 u0Var7 = this.y;
        if (u0Var7 instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var7);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "RepositoriesQuery(login=", this.r, ", first=30, after=", ", query=");
        f1.e.w(o, this.t, ", type=", this.u, ", language=");
        f1.e.w(o, this.v, ", orderField=", this.w, ", orderDirection=");
        return f1.e.l(o, this.x, ", includeIssueTemplateProperties=", this.y, ")");
    }
}
