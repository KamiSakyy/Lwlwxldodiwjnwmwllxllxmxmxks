package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i20 implements aaShadow.w0 {
    public static final b20 Companion = new b20();
    public String r;
    public int s;
    public aa1.b t;

    public i20(String str, int i, aa1.b bVar) {
        k71.k.g(str, "query");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = i;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.u4.a;
        List list2 = kz0.u4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return k71.k.b(this.r, i20Var.r) && this.s == i20Var.s && k71.k.b(this.t, i20Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.lq.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "16e97ac791e9db750137173160229ad05aa49e5a9594f5a7d4af1f913152ea3a";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchIssueAdvanced($query: String!, $first: Int!, $after: String) { search(query: $query, type: ISSUE_ADVANCED, first: $first, after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Issue { __typename ...IssueListItemFragment id } ... on PullRequest { __typename ...PullRequestItemFragment id } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment IssueListItemFragment on Issue { __typename id title titleHTML number createdAt isReadByViewer comments { totalCount } ...LabelsFragment issueState: state repository { id name isPrivate viewerSubscription viewerSubscriptionTypes owner { id login } __typename } viewerSubscription url assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason issueType { __typename ...IssueTypeFragment id } ...SubIssueProgressFragment parent { id __typename } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }";
    }

    public final String name() {
        return "SearchIssueAdvanced";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.n(this.s, "SearchIssueAdvancedQuery(query=", this.r, ", first=", ", after="), this.t, ")");
    }
}
