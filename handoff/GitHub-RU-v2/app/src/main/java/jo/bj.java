package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bj implements aaShadow.w0 {
    public static final ii Companion = new ii();
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final aa1.b x;
    public final boolean y;

    public bj(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
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
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.y1.a;
        List list2 = h10.y1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return k71.k.b(this.r, bjVar.r) && k71.k.b(this.s, bjVar.s) && k71.k.b(this.t, bjVar.t) && k71.k.b(this.u, bjVar.u) && k71.k.b(this.v, bjVar.v) && k71.k.b(this.w, bjVar.w) && this.x.equals(bjVar.x) && this.y == bjVar.y;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.kc.a, false);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.y) + f1.e.a(this.x, a0.s0.b(3, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), this.v, 31), this.w, 31), 31), 31);
    }

    public final String i() {
        return "2b11a0ca7fed819d7b76b3f496a4b8f3e32640e6a8900ee3f154c2d8ea0aa147";
    }

    public final String j() {
        Companion.getClass();
        return "query GlobalSearch($issueQuery: String!, $pullRequestQuery: String!, $repoQuery: String!, $userQuery: String!, $orgQuery: String!, $codeQuery: String!, $first: Int!, $includeIssueTemplateProperties: Boolean = false , $skipCodeSearch: Boolean!) { issues: search(query: $issueQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on Issue { __typename ...IssueListItemFragment id } } } pullRequests: search(query: $pullRequestQuery, type: ISSUE, first: $first) { issueCount nodes { __typename ...NodeIdFragment ... on PullRequest { __typename ...PullRequestItemFragment id } } } repos: search(query: $repoQuery, type: REPOSITORY, first: $first) { repositoryCount nodes { __typename ...NodeIdFragment ... on Repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } } } users: search(query: $userQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on User { __typename ...UserListItemFragment id } } } organizations: search(query: $orgQuery, type: USER, first: $first) { userCount nodes { __typename ...NodeIdFragment ... on Organization { __typename ...OrganizationListItemFragment id } } } code: codeSearch(query: $codeQuery, first: $first) @skip(if: $skipCodeSearch) { nodes { __typename ...GlobalCodeSearchFragment } pageInfo { hasNextPage } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment IssueListItemFragment on Issue { __typename id title titleHTML number createdAt isReadByViewer comments { totalCount } ...LabelsFragment issueState: state repository { id name isPrivate viewerSubscription viewerSubscriptionTypes owner { id login } __typename } viewerSubscription url assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } ...SubIssueProgressFragment parent { id __typename } ...DuplicateOfFragment }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }  fragment OrganizationListItemFragment on Organization { __typename id ...avatarFragment descriptionHTML login name viewerIsFollowing }  fragment GlobalCodeSearchFragment on CodeSearchResult { language { color id name } repository { id name owner { id login avatarUrl } __typename } matchCount path refName snippets { lines startingLineNumber endingLineNumber jumpToLineNumber score } }";
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
