package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gl implements aaShadow.w0 {
    public static final zk Companion = new zk();
    public String r;
    public String s;
    public int t;

    public gl(String str, int i, String str2) {
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.m2.a;
        List list2 = en0.m2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl)) {
            return false;
        }
        gl glVar = (gl) obj;
        return k71.k.b(this.r, glVar.r) && k71.k.b(this.s, glVar.s) && this.t == glVar.t;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ae.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "91b26eea3a7d011a380ec2ae3f87b1ef5732c657da175ae1e3f50334865acbc8";
    }

    public final String j() {
        Companion.getClass();
        return "query MergeStatus($repositoryOwner: String!, $repositoryName: String!, $number: Int!) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ...NodeIdFragment ... on PullRequest { id headRefOid mergeStateStatus isInMergeQueue mergeQueue { __typename ...MergeQueueFragment id } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }";
    }

    public final String name() {
        return "MergeStatus";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
    }

    public final String toString() {
        return a0.s0.l(a0.s0.o("MergeStatusQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number="), this.t, ")");
    }
}
