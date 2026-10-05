package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.n0 {
    public static final k0 Companion = new k0();
    public final String r;
    public final String s;
    public final String t;

    public n0(String str, String str2, String str3) {
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "body");
        k71.k.g(str3, "parentCommentId");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.g.a;
        List list2 = fc0.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.r, n0Var.r) && k71.k.b(this.s, n0Var.s) && k71.k.b(this.t, n0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.y.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "3a3f6adab4f8bf456f9dd1da3892df0fb804193734ef3c04ba6854c5c7f77f6e";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReplyToDiscussionComment($discussionId: ID!, $body: String!, $parentCommentId: ID!, $previewCount: Int!) { addDiscussionComment(input: { discussionId: $discussionId body: $body replyToId: $parentCommentId } ) { comment { __typename ...DiscussionCommentReplyFragment replyTo { __typename ...DiscussionCommentRepliesFragment id } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionCommentRepliesFragment on DiscussionComment { id replies(last: $previewCount) { totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } __typename }";
    }

    public final String name() {
        return "AddReplyToDiscussionComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("discussionId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("parentCommentId");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("previewCount");
        fVar.z(3);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("AddReplyToDiscussionCommentMutation(discussionId=", this.r, ", body=", this.s, ", parentCommentId="), this.t, ", previewCount=3)");
    }
}
