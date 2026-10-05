package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gz implements aa.w0 {
    public static final vy Companion = new vy();
    public final String r;
    public final aa.u0 s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa.u0 v;

    public gz(String str, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2, aa.u0 u0Var2) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
        this.u = bVar2;
        this.v = u0Var2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.l4.a;
        List list2 = en0.l4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        return k71.k.b(this.r, gzVar.r) && this.s.equals(gzVar.s) && this.t.equals(gzVar.t) && this.u.equals(gzVar.u) && this.v.equals(gzVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.wn.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, jo.f4.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "e6c297ee5844621336704055b4439f89c1226305f0b1bbaaeae828dd9b6646fd";
    }

    public final String j() {
        Companion.getClass();
        return "query SearchIssue($query: String!, $first: Int!, $after: String, $owner: String = \"\" , $name: String = \"\" , $include: Boolean = false ) { repository(owner: $owner, name: $name) @include(if: $include) { __typename name id pinnedIssues(first: 3) { nodes { issue { __typename ...IssueListItemFragment id } id __typename } } } search(query: $query, type: ISSUE, first: $first, after: $after) { issueCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ... on Issue { __typename ...IssueListItemFragment id } ... on PullRequest { __typename ...PullRequestItemFragment id } } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment IssueListItemFragment on Issue { __typename id title titleHTML number createdAt isReadByViewer comments { totalCount } ...LabelsFragment issueState: state repository { id name isPrivate viewerSubscription viewerSubscriptionTypes owner { id login } __typename } viewerSubscription url assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } closedByPullRequestsReferences { totalCount } stateReason }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }";
    }

    public final String name() {
        return "SearchIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.o0 o0Var = aa.c.i;
        aa.c.d(o0Var).d(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("owner");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("owner");
            aa.c.l.b(fVar, wVar, "");
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("name");
            aa.c.d(o0Var).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("name");
            aa.c.l.b(fVar, wVar, "");
        }
        fVar.z0("include");
        aa.c.d(aa.c.k).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder t = jo.f4.t(this.s, "SearchIssueQuery(query=", this.r, ", first=30, after=", ", owner=");
        f1.e.w(t, this.t, ", name=", this.u, ", include=");
        return f1.e.j(t, this.v, ")");
    }
}
