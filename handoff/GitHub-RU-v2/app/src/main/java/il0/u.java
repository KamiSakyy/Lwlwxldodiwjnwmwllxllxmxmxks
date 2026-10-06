package il0;

import a0.s0;
import aa.p0;
import aa.q0;
import aa.t0;
import aa.u0;
import aa.w0;
import com.github.rudroid.copilot.h1;
import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements w0 {
    public static final n Companion = new n();
    public String r;
    public String s;
    public aa1.b t;
    public aa1.b u;

    public u(u0 u0Var, String str, String str2) {
        k71.k.g(str, "login");
        k71.k.g(str2, "slug");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
        this.u = t0.d;
    }

    public final aa.m d() {
        rn.Companion.getClass();
        q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = kl0.d.a;
        List list2 = kl0.d.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.r, uVar.r) && k71.k.b(this.s, uVar.s) && this.t.equals(uVar.t) && this.u.equals(uVar.u);
    }

    public final p0 g() {
        return aa.c.c(jl0.h.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, s0.b(30, h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "2435f3f7c2b0fcb85adedfd7432781a3983f897a3afdb411d0ca17cf3f2ee6ef";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchList($login: String!, $slug: String!, $first: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { list(login: $login, slug: $slug) { id name description user { __typename ...actorFields id } items(first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...RepositoryListItemFragment ...IssueTemplateFragment } totalCount } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }";
    }

    public final String name() {
        return "FetchList";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("slug");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("first");
        fVar.z(30);
        u0 u0Var = this.t;
        if (u0Var instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        u0 u0Var2 = this.u;
        if (u0Var2 instanceof u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.l(s0.o("FetchListQuery(login=", this.r, ", slug=", this.s, ", first=30, after="), this.t, ", includeIssueTemplateProperties=", this.u, ")");
    }

}
