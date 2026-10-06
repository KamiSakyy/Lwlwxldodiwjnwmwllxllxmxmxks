package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ei implements aaShadow.w0 {
    public static final lh Companion = new lh();
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public aa1.b x;
    public boolean y;

    public ei(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        k71.k.g(str, "issueQuery");
        k71.k.g(str2, "pullRequestQuery");
        k71.k.g(str3, "repoQuery");
        k71.k.g(str4, "userQuery");
        k71.k.g(str5, "orgQuery");
        k71.k.g(str6, "codeQuery");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
        this.w = str6;
        this.x = aa.t0.d;
        this.y = z;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v1.a;
        List list2 = kz0.v1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return k71.k.b(this.r, eiVar.r) && k71.k.b(this.s, eiVar.s) && k71.k.b(this.t, eiVar.t) && k71.k.b(this.u, eiVar.u) && k71.k.b(this.v, eiVar.v) && k71.k.b(this.w, eiVar.w) && this.x.equals(eiVar.x) && this.y == eiVar.y;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ub.a, false);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + f1.e.a(this.x, a0.s0.b(3, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), this.v, 31), this.w, 31), 31), 31);
    }

    public final String i() {
        return "ca22e8c34e5e26a578837ede8a00bff7345b8b60724884617bcd82150a3d950a";
    }

    public final String j() {
        Companion.getClass();
        return "query GlobalSearch($issueQuery: String!, $pullRequestQuery: String!, $repoQuery: String!, $userQuery: String!, $orgQuery: String!, $codeQuery: String!, $first: Int!, $includeIssueTemplateProperties: Boolean = false , $skipCodeSearch: Boolean!) { issues: search(query: $issueQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on Issue { __typename ...IssueListItemFragment id } } } pullRequests: search(query: $pullRequestQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on PullRequest { __typename ...PullRequestItemFragment id } } } repos: search(query: $repoQuery, type: REPOSITORY, first: $first) { repositoryCount nodes { __typename ...NodeIdFragment ... on Repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } } users: search(query: $userQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on User { __typename ...UserListItemFragment id } } } organizations: search(query: $orgQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on Organization { __typename ...OrganizationListItemFragment id } } } code: codeSearch(query: $codeQuery, first: $first) @skip(if: $skipCodeSearch) { nodes { __typename ...GlobalCodeSearchFragment } pageInfo { hasNextPage } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment IssueListItemFragment on Issue { __typename id title titleHTML number createdAt isReadByViewer comments { totalCount } ...LabelsFragment issueState: state repository { id name isPrivate viewerSubscription viewerSubscriptionTypes owner { id login } __typename } viewerSubscription url assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } ...SubIssueProgressFragment parent { id __typename } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }  fragment GlobalCodeSearchFragment on CodeSearchResult { language { color id name } repository { id name owner { id login avatarUrl } __typename } matchCount path refName snippets { lines startingLineNumber endingLineNumber jumpToLineNumber score } }";
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
        fVar.z0("codeQuery");
        bVar.b(fVar, wVar, this.w);
        fVar.z0("first");
        fVar.z(3);
        aa.u0 u0Var = this.x;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
        fVar.z0("skipCodeSearch");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.y));
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("GlobalSearchQuery(issueQuery=", this.r, ", pullRequestQuery=", this.s, ", repoQuery=");
        f1.e.x(o, this.t, ", userQuery=", this.u, ", orgQuery=");
        f1.e.x(o, this.v, ", codeQuery=", this.w, ", first=3, includeIssueTemplateProperties=");
        o.append(this.x);
        o.append(", skipCodeSearch=");
        o.append(this.y);
        o.append(")");
        return o.toString();
    }
}
