package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class se0 implements aa.n0 {
    public static final fe0 Companion = new fe0();
    public final String r;
    public final m10.wx s;

    public se0(String str, m10.wx wxVar) {
        this.r = str;
        this.s = wxVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.s6.a;
        List list2 = h10.s6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se0)) {
            return false;
        }
        se0 se0Var = (se0) obj;
        return k71.k.b(this.r, se0Var.r) && this.s == se0Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.uy.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "ee6e04e9fdc80766244dccbac1f318397a83134d0ed5df63e53ff5d819e7f5a0";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestBranch($id: ID!, $updateMethod: PullRequestBranchUpdateMethod!) { updatePullRequestBranch(input: { pullRequestId: $id updateMethod: $updateMethod } ) { pullRequest { __typename id headRefOid state mergeStateStatus repository { id mergeCommitAllowed squashMergeAllowed rebaseMergeAllowed viewerDefaultMergeMethod viewerDefaultCommitEmail viewerPossibleCommitEmails viewerPermission __typename } headRef { id refUpdateRule { viewerCanPush } __typename } baseRefName ...AutoMergeRequestFragment viewerCanMergeAsAdmin mergedBy { __typename ...NodeIdFragment login } mergeCommit { id abbreviatedOid committedDate __typename } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } mergeQueue { __typename ...MergeQueueFragment id } viewerCanUpdate timelineItems(last: 1, itemTypes: [PULL_REQUEST_COMMIT]) { nodes { __typename ...NodeIdFragment ...pullRequestCommitFields } } } clientMutationId } }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }  fragment pullRequestCommitFields on PullRequestCommit { __typename id pullRequestCommit: commit { __typename id status { __typename state id } messageHeadline author { __typename avatarUrl } committedDate } }";
    }

    public final String name() {
        return "UpdatePullRequestBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("updateMethod");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "UpdatePullRequestBranchMutation(id=" + this.r + ", updateMethod=" + this.s + ")";
    }
}
