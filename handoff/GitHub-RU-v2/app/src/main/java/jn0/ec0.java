package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ec0 implements aaShadow.n0 {
    public static final rb0 Companion = new rb0();
    public final String r;
    public final pz0.js s;

    public ec0(String str, pz0.js jsVar) {
        this.r = str;
        this.s = jsVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.j6.a;
        List list2 = kz0.j6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return k71.k.b(this.r, ec0Var.r) && this.s == ec0Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.yw.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b52bfb97244f7839b560b450b94e1bee01837b9500cfc6304a3991de4854167b";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestBranch($id: ID!, $updateMethod: PullRequestBranchUpdateMethod!) { updatePullRequestBranch(input: { pullRequestId: $id updateMethod: $updateMethod } ) { pullRequest { __typename id headRefOid state mergeStateStatus repository { id mergeCommitAllowed squashMergeAllowed rebaseMergeAllowed viewerDefaultMergeMethod viewerDefaultCommitEmail viewerPossibleCommitEmails viewerPermission __typename } headRef { id refUpdateRule { viewerCanPush } __typename } baseRefName ...AutoMergeRequestFragment viewerCanMergeAsAdmin mergedBy { __typename ...NodeIdFragment login } mergeCommit { id abbreviatedOid committedDate __typename } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } mergeQueue { __typename ...MergeQueueFragment id } viewerCanUpdate timelineItems(last: 1, itemTypes: [PULL_REQUEST_COMMIT]) { nodes { __typename ...NodeIdFragment ...pullRequestCommitFields } } } clientMutationId } }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }  fragment pullRequestCommitFields on PullRequestCommit { __typename id pullRequestCommit: commit { __typename id status { __typename state id } messageHeadline author { __typename avatarUrl } committedDate } }";
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
