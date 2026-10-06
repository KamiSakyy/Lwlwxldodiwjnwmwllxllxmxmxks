package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fw implements aaShadow.w0 {
    public static final wv Companion = new wv();
    public final String r;
    public final String s;
    public final aa1.b t;
    public final aa1.b u;

    public fw(aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.x3.a;
        List list2 = kz0.x3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw)) {
            return false;
        }
        fw fwVar = (fw) obj;
        return k71.k.b(this.r, fwVar.r) && k71.k.b(this.s, fwVar.s) && this.t.equals(fwVar.t) && this.u.equals(fwVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.am.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "263d4c2e0b3a3ce94d94c242c6e22618ef7421b0fca15ad89b93c5b6c54799ec";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoMergeQueueEntries($repositoryOwner: String!, $repositoryName: String!, $branch: String, $first: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id mergeQueue(branch: $branch) { id entriesCount: entries { totalCount } entries(first: $first, after: $after) { totalCount pageInfo { hasNextPage endCursor } nodes { id position pullRequest { __typename ...PullRequestItemFragment id } __typename } } __typename } __typename } id __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }";
    }

    public final String name() {
        return "RepoMergeQueueEntries";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("branch");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return f1.e.l(a0.s0.o("RepoMergeQueueEntriesQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", branch="), this.t, ", first=30, after=", this.u, ")");
    }
}
