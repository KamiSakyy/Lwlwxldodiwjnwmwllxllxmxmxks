package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oz implements aaShadow.w0 {
    public static final ez Companion = new ez();
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public oz(String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.h4.a;
        List list2 = kz0.h4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz)) {
            return false;
        }
        oz ozVar = (oz) obj;
        return k71.k.b(this.r, ozVar.r) && k71.k.b(this.s, ozVar.s) && this.t.equals(ozVar.t) && this.u.equals(ozVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qo.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31);
    }

    public final String i() {
        return "c671c36e9491ecede33ce0ccc9089ff6567dd7f8f778bd513221859106fc1f30";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCompareRefs($ownerName: String!, $repoName: String!, $baseRefName: String!, $headRefName: String!, $last: Int!) { repository(owner: $ownerName, name: $repoName) { id ref(qualifiedName: $headRefName) { id activePullRequests: associatedPullRequests(last: $last, states: [OPEN], baseRefName: $baseRefName) { nodes { __typename ...PullRequestItemFragment id } } __typename } comparison: ref(qualifiedName: $baseRefName) { id compare(headRef: $headRefName) { id additions deletions changedFiles latestCommit: commits(last: 1, after: null) { totalCount nodes { id message committedDate __typename } } __typename } __typename } pullRequestTemplates: pullRequestTemplates { filename body } __typename } id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }";
    }

    public final String name() {
        return "RepositoryCompareRefs";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("last");
        fVar.z(1);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("RepositoryCompareRefsQuery(ownerName=", this.r, ", repoName=", this.s, ", baseRefName="), this.t, ", headRefName=", this.u, ", last=1)");
    }
}
