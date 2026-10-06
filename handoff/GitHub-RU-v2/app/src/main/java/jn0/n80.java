package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n80 implements aaShadow.n0 {
    public static final i80 Companion = new i80();
    public final String r;

    public n80(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.t5.a;
        List list2 = kz0.t5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n80) && k71.k.b(this.r, ((n80) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.vu.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ed90a275d373e7b042f754a0ce2892e8b294667f130fadb8233d4f0970d6a42b";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnmarkDiscussionCommentAsAnswer($id: ID!) { unmarkDiscussionCommentAsAnswer(input: { id: $id } ) { discussion { id answerChosenAt answer { __typename id replyTo { id __typename } ...DiscussionCommentFragment } answerChosenBy { __typename ...NodeIdFragment login } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }";
    }

    public final String name() {
        return "UnmarkDiscussionCommentAsAnswer";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnmarkDiscussionCommentAsAnswerMutation(id=", this.r, ")");
    }
}
