package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nh implements aaShadow.n0 {
    public static final ih Companion = new ih();
    public final String r;

    public nh(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.u1.a;
        List list2 = en0.u1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh) && k71.k.b(this.r, ((nh) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.tb.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "67c17333de70520836fdfeecb2309ee9d1b2d5e34470af109b6ce924d4b0e4b6";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MarkDiscussionCommentAsAnswer($id: ID!) { markDiscussionCommentAsAnswer(input: { id: $id } ) { discussion { id answerChosenAt answer { __typename id replyTo { id __typename } ...DiscussionCommentFragment } answerChosenBy { __typename ...NodeIdFragment login } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }";
    }

    public final String name() {
        return "MarkDiscussionCommentAsAnswer";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MarkDiscussionCommentAsAnswerMutation(id=", this.r, ")");
    }
}
