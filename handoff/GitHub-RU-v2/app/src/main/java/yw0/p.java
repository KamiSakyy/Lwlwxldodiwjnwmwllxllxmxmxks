package yw0;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import java.util.List;
import jo.f4;
import pz0.sk;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements n0 {
    public static final i Companion = new i();
    public final String r;
    public final aa1.b s;

    public p(String str, aa1.b bVar) {
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ax0.b.a;
        List list2 = ax0.b.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.r, pVar.r) && k71.k.b(this.s, pVar.s);
    }

    public final p0 g() {
        return aa.c.c(zw0.g.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "a94262903421816edafa7d9adce24807304398a3f832fcb11fda829d0e004c28";
    }

    public final String j() {
        Companion.getClass();
        return "mutation EnqueuePullRequestToMergeQueue($id: ID!, $expectedHeadOid: GitObjectID) { enqueuePullRequest(input: { pullRequestId: $id expectedHeadOid: $expectedHeadOid } ) { mergeQueueEntry { id pullRequest { id isInMergeQueue mergeQueue { __typename ...MergeQueueFragment id } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } __typename } __typename } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }";
    }

    public final String name() {
        return "EnqueuePullRequestToMergeQueue";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        u0 u0Var = this.s;
        if (u0Var instanceof u0) {
            fVar.z0("expectedHeadOid");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f4.l(this.s, "EnqueuePullRequestToMergeQueueMutation(id=", this.r, ", expectedHeadOid=", ")");
    }
}
