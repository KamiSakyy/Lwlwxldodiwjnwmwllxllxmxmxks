package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q90 implements aaShadow.n0 {
    public static final n90 Companion = new n90();
    public String r;
    public String s;

    public q90(String str, String str2) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.y5.a;
        List list2 = kz0.y5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return k71.k.b(this.r, q90Var.r) && k71.k.b(this.s, q90Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qv.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "cad06a025523d0b7d9f64ba77779ed389b3be446318595f9d8a8fd83b660fdc7";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateDiscussionComment($commentId: ID!, $body: String!, $previewCount: Int!) { updateDiscussionComment(input: { commentId: $commentId body: $body } ) { comment { __typename ...DiscussionCommentFragment ...ReactionFragment ...DiscussionCommentRepliesFragment id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionCommentRepliesFragment on DiscussionComment { id replies(last: $previewCount) { totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } __typename }";
    }

    public final String name() {
        return "UpdateDiscussionComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("previewCount");
        fVar.z(3);
    }

    public final String toString() {
        return x.i.g("UpdateDiscussionCommentMutation(commentId=", this.r, ", body=", this.s, ", previewCount=3)");
    }
}
