package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class la implements aaShadow.n0 {
    public static final ga Companion = new ga();
    public final String r;

    public la(String str) {
        k71.k.g(str, "commentId");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.t0.a;
        List list2 = h10.t0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la) && k71.k.b(this.r, ((la) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.t6.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "2c6861ff7f0303bfca2d58f1d60a71e507fe0d0af92d77ed01c1eb942e80e893";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteReviewComment($commentId: ID!) { deletePullRequestReviewComment(input: { id: $commentId } ) { __typename pullRequestReview { id pullRequest { __typename id ...ViewerLatestReviewRequestStateFragment ...FilesChangedReviewThreadFragment } __typename } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment CommentPositionFragment on CommentPosition { __typename ... on FileComment { __typename baseCommitOid headCommitOid commitOid } ... on LineComment { __typename baseCommitOid headCommitOid commitOid line } ... on MultilineComment { __typename baseCommitOid headCommitOid endCommitOid startCommitOid startLine endLine } ... on IndeterminateComment { __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position startLine line pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve positioning { __typename ...CommentPositionFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }  fragment FilesChangedReviewThreadFragment on PullRequest { id headRefOid reviewThreads(first: 50) { nodes { __typename subjectType id isResolved isOutdated viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...ReviewThreadCommentFragment id } } } } __typename }";
    }

    public final String name() {
        return "DeleteReviewComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DeleteReviewCommentMutation(commentId=", this.r, ")");
    }
}
