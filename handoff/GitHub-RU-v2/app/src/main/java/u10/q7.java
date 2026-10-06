package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q7 implements aaShadow.n0 {
    public static final k7 Companion = new k7();
    public final String r;

    public q7(String str) {
        k71.k.g(str, "commentId");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.h0.a;
        List list2 = fc0.h0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7) && k71.k.b(this.r, ((q7) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.w4.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "87447a76db5bae1250979a9e588d38af21ea98f82de8dbf502b40af09a0163e6";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DeleteDiscussionComment($commentId: ID!, $previewCount: Int!) { deleteDiscussionComment(input: { id: $commentId } ) { __typename comment { id replyTo { __typename ...DiscussionCommentRepliesFragment id } discussion { id comments { totalCount } answer { id replyTo { id __typename } __typename } __typename } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionCommentRepliesFragment on DiscussionComment { id replies(last: $previewCount) { totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } __typename }";
    }

    public final String name() {
        return "DeleteDiscussionComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("commentId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("previewCount");
        fVar.z(3);
    }

    public final String toString() {
        return f1.e.z("DeleteDiscussionCommentMutation(commentId=", this.r, ", previewCount=3)");
    }
}
