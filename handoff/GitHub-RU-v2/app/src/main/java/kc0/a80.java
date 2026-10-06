package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a80 implements aaShadow.n0 {
    public static final n70 Companion = new n70();
    public String r;
    public gn0.nl s;

    public a80(String str, gn0.nl nlVar) {
        this.r = str;
        this.s = nlVar;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.v5.a;
        List list2 = en0.v5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a80)) {
            return false;
        }
        a80 a80Var = (a80) obj;
        return k71.k.b(this.r, a80Var.r) && this.s == a80Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.wt.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "c58b8a6fcb112879cb40b2a3ba97039f10fa20fe9c17f628fa7d263366fb22ca";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestBranch($id: ID!, $updateMethod: PullRequestBranchUpdateMethod!) { updatePullRequestBranch(input: { pullRequestId: $id updateMethod: $updateMethod } ) { pullRequest { __typename id headRefOid state mergeStateStatus repository { id mergeCommitAllowed squashMergeAllowed rebaseMergeAllowed viewerDefaultMergeMethod viewerDefaultCommitEmail viewerPossibleCommitEmails viewerPermission __typename } headRef { id refUpdateRule { viewerCanPush } __typename } baseRefName ...AutoMergeRequestFragment viewerCanMergeAsAdmin mergedBy { __typename ...NodeIdFragment login } mergeCommit { id abbreviatedOid committedDate __typename } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } mergeQueue { __typename ...MergeQueueFragment id } viewerCanUpdate timelineItems(last: 1, itemTypes: [PULL_REQUEST_COMMIT]) { nodes { __typename ...NodeIdFragment ...pullRequestCommitFields } } } clientMutationId } }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }  fragment pullRequestCommitFields on PullRequestCommit { __typename id pullRequestCommit: commit { __typename id status { __typename state id } messageHeadline author { __typename avatarUrl } committedDate } }";
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
