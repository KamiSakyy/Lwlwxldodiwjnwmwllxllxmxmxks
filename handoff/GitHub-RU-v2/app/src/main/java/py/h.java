package py;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import java.util.List;
import m10.vp;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements n0 {
    public static final a Companion = new a();
    public final String r;

    public h(String str) {
        this.r = str;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = ry.a.a;
        List list2 = ry.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.r, ((h) obj).r);
    }

    public final p0 g() {
        return aa.c.c(qy.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "78953f9d5257a8389a518640a24085ec4131723e14005fc9149e362ef33c331d";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DequeuePullRequestFromMergeQueue($id: ID!) { dequeuePullRequest(input: { id: $id } ) { mergeQueueEntry { id pullRequest { id isInMergeQueue mergeQueue { __typename ...MergeQueueFragment id } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } __typename } __typename } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }";
    }

    public final String name() {
        return "DequeuePullRequestFromMergeQueue";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DequeuePullRequestFromMergeQueueMutation(id=", this.r, ")");
    }
}
