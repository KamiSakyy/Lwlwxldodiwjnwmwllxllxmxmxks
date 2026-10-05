package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 implements aa.n0 {
    public static final l1 Companion = new l1();
    public final String r;
    public final String s;

    public v1(String str, String str2) {
        k71.k.g(str, "threadId");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.k.a;
        List list2 = h10.k.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return k71.k.b(this.r, v1Var.r) && k71.k.b(this.s, v1Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.r0.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5c7c3cdf3388f9919222a4a1113ff3293f108b542be8b8030e1e186681f97273";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReviewThreadReply($threadId: ID!, $body: String!) { addPullRequestReviewThreadReply(input: { pullRequestReviewThreadId: $threadId body: $body } ) { comment { __typename pullRequestReview { id __typename } subjectType position thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve pullRequest { __typename id ...FilesChangedReviewThreadFragment headRefOid pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } } diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } ...MultiLineCommentFields comments(last: 2) { nodes { id __typename } } } path state url ...ReactionFragment ...CommentFragment ...UpdatableFragment ...MinimizableCommentFragment id } } }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment CommentPositionFragment on CommentPosition { __typename ... on FileComment { __typename baseCommitOid headCommitOid commitOid } ... on LineComment { __typename baseCommitOid headCommitOid commitOid line } ... on MultilineComment { __typename baseCommitOid headCommitOid endCommitOid startCommitOid startLine endLine } ... on IndeterminateComment { __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position startLine line pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve positioning { __typename ...CommentPositionFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }  fragment FilesChangedReviewThreadFragment on PullRequest { id headRefOid reviewThreads(first: 50) { nodes { __typename subjectType id isResolved isOutdated viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...ReviewThreadCommentFragment id } } } } __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }";
    }

    public final String name() {
        return "AddReviewThreadReply";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("threadId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("AddReviewThreadReplyMutation(threadId=", this.r, ", body=", this.s, ")");
    }
}
