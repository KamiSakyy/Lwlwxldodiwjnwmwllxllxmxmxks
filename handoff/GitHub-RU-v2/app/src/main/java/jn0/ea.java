package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ea implements aa.w0 {
    public static final q9 Companion = new q9();
    public final String r;
    public final aa.u0 s;

    public ea(aa.u0 u0Var, String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.r0.a;
        List list2 = kz0.r0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return k71.k.b(this.r, eaVar.r) && this.s.equals(eaVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.j6.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, a0.s0.b(30, a0.s0.b(30, a0.s0.b(30, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "cbcb148f51d775339076be1ac49a093b921512ea564f6c24b64670ae6f9f8306";
    }

    public final String j() {
        Companion.getClass();
        return "query DeploymentReviewQuery($nodeId: ID!, $numberOfCheckRuns: Int!, $numberOfPullRequests: Int!, $numberOfDeploymentRequests: Int!, $numberOfSteps: Int!, $cursor: String) { node(id: $nodeId) { __typename ... on CheckSuite { id url status repository { owner { __typename ...actorFields } name id __typename } creator { __typename ...actorFields id } workflowRun { id url runNumber workflow { name id __typename } pendingDeploymentRequests(first: $numberOfDeploymentRequests) { nodes { __typename ...DeploymentReviewApprovalRequest } } __typename } checkRuns(first: $numberOfCheckRuns) { nodes { __typename ...DeploymentReviewApprovalCheckRun id } } matchingPullRequests(after: $cursor, first: $numberOfPullRequests) { nodes { __typename ...DeploymentReviewAssociatedPr id } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment DeploymentReviewApprovalRequest on DeploymentRequest { currentUserCanApprove environment { name id __typename } reviewers(after: null, first: 30) { nodes { __typename ... on User { login id } ... on Team { name id } } } }  fragment DeploymentReviewApprovalCheckRun on CheckRun { name status id conclusion permalink deployment { latestStatus { environmentUrl logUrl id __typename } id __typename } steps(first: $numberOfSteps) { totalCount nodes { __typename ... on CheckStep { status } } } __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment DeploymentReviewAssociatedPr on PullRequest { __typename ...PullRequestItemFragment lastEditedAt state id }";
    }

    public final String name() {
        return "DeploymentReviewQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("numberOfCheckRuns");
        nn.a aVar = ro0.a.a;
        aVar.b(fVar, wVar, 30);
        fVar.z0("numberOfPullRequests");
        aVar.b(fVar, wVar, 30);
        fVar.z0("numberOfDeploymentRequests");
        aVar.b(fVar, wVar, 30);
        fVar.z0("numberOfSteps");
        aVar.b(fVar, wVar, 30);
        fVar.z0("cursor");
        aa.c.d(aa.c.i).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return jo.f4.k(this.s, "DeploymentReviewQuery(nodeId=", this.r, ", numberOfCheckRuns=30, numberOfPullRequests=30, numberOfDeploymentRequests=30, numberOfSteps=30, cursor=", ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }
}
