package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mb implements aaShadow.w0 {
    public static final fb Companion = new fb();
    public String r;
    public int s;
    public aa1.b t;

    public mb(String str, aa1.b bVar) {
        k71.k.g(str, "nodeId");
        this.r = str;
        this.s = 30;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.w0.a;
        List list2 = kz0.w0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb)) {
            return false;
        }
        mb mbVar = (mb) obj;
        return k71.k.b(this.r, mbVar.r) && this.s == mbVar.s && k71.k.b(this.t, mbVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.n7.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + a0.s0.b(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "a67a9a2b6973dffc8a1d7ebf3331390d7367d758580a069fdbf9f825cc14e1ef";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCommentReplyThreadQuery($nodeId: ID!, $numberOfReplies: Int!, $before: String) { node(id: $nodeId) { __typename ...DiscussionSubThreadHeadFragment ... on DiscussionComment { discussion { id locked author { __typename ...actorFields } repository { id viewerPermission owner { id } hasNestedDiscussionAnswersEnabled __typename } __typename } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionSubThreadHeadFragment on DiscussionComment { __typename id ...DiscussionCommentFragment ...ReactionFragment replies(last: $numberOfReplies, before: $before) { pageInfo { hasNextPage hasPreviousPage startCursor } totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } }";
    }

    public final String name() {
        return "DiscussionCommentReplyThreadQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("numberOfReplies");
        fVar.z(this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("before");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(a0.s0.n(this.s, "DiscussionCommentReplyThreadQuery(nodeId=", this.r, ", numberOfReplies=", ", before="), this.t, ")");
    }

    public /* synthetic */ mb(String str) {
        this(str, aa.t0.d);
    }
}
