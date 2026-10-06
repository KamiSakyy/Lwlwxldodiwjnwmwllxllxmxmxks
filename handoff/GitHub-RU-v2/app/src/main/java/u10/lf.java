package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lf implements aaShadow.w0 {
    public static final te Companion = new te();
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public aa1.b w;

    public lf(String str, String str2, String str3, String str4, String str5) {
        k71.k.g(str, "issueQuery");
        k71.k.g(str2, "pullRequestQuery");
        k71.k.g(str3, "repoQuery");
        k71.k.g(str4, "userQuery");
        k71.k.g(str5, "orgQuery");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
        this.w = aa.t0.d;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.l1.a;
        List list2 = fc0.l1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return k71.k.b(this.r, lfVar.r) && k71.k.b(this.s, lfVar.s) && k71.k.b(this.t, lfVar.t) && k71.k.b(this.u, lfVar.u) && k71.k.b(this.v, lfVar.v) && this.w.equals(lfVar.w);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.x9.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + a0.s0.b(3, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), this.v, 31), 31);
    }

    public final String i() {
        return "ebce82aa8e09caded0acd58718da31ac53ba2c479dc937b7e68f4791fb5560af";
    }

    public final String j() {
        Companion.getClass();
        return "query GlobalSearch($issueQuery: String!, $pullRequestQuery: String!, $repoQuery: String!, $userQuery: String!, $orgQuery: String!, $first: Int!, $includeIssueTemplateProperties: Boolean = false ) { issues: search(query: $issueQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on Issue { __typename ...IssueListItemFragment id } } } pullRequests: search(query: $pullRequestQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on PullRequest { __typename ...PullRequestItemFragment id } } } repos: search(query: $repoQuery, type: REPOSITORY, first: $first) { repositoryCount nodes { __typename ...NodeIdFragment ... on Repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } } users: search(query: $userQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on User { __typename ...UserListItemFragment id } } } organizations: search(query: $orgQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on Organization { __typename ...OrganizationListItemFragment id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment IssueListItemFragment on Issue { __typename id title titleHTML number createdAt isReadByViewer comments { totalCount } ...LabelsFragment issueState: state repository { id name isPrivate viewerSubscription viewerSubscriptionTypes owner { id login } __typename } viewerSubscription url assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } ...ViewerLatestReviewRequestStateFragment }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }";
    }

    public final String name() {
        return "GlobalSearch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("issueQuery");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("pullRequestQuery");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("repoQuery");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("userQuery");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("orgQuery");
        bVar.b(fVar, wVar, this.v);
        fVar.z0("first");
        fVar.z(3);
        aa.u0 u0Var = this.w;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("GlobalSearchQuery(issueQuery=", this.r, ", pullRequestQuery=", this.s, ", repoQuery=");
        f1.e.x(o, this.t, ", userQuery=", this.u, ", orgQuery=");
        o.append(this.v);
        o.append(", first=3, includeIssueTemplateProperties=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
