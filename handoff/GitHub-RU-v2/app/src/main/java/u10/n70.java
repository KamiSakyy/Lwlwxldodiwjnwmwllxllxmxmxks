package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n70 implements aaShadow.n0 {
    public static final i70 Companion = new i70();
    public String r;
    public String s;

    public n70(String str, String str2) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.t5.a;
        List list2 = fc0.t5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n70)) {
            return false;
        }
        n70 n70Var = (n70) obj;
        return k71.k.b(this.r, n70Var.r) && k71.k.b(this.s, n70Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.vt.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "0bfbe5cb9cb84713443cc4a72a8c303428273ab499f742756ee608918a29f8b6";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateReviewComment($commentId: ID!, $body: String!) { updatePullRequestReviewComment(input: { pullRequestReviewCommentId: $commentId body: $body } ) { pullRequestReviewComment { __typename subjectType pullRequest { id headRefOid __typename } ...ReviewThreadCommentFragment id } } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position line pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }";
    }

    public final String name() {
        return "UpdateReviewComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdateReviewCommentMutation(commentId=", this.r, ", body=", this.s, ")");
    }
}
