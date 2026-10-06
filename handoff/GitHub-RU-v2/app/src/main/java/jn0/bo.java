package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bo implements aaShadow.w0 {
    public static final vn Companion = new vn();
    public String r;
    public int s;
    public aa1.b t;

    public bo(String str, int i, aa1.b bVar) {
        k71.k.g(str, "repositoryOwner");
        this.r = str;
        this.s = i;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.x2.a;
        List list2 = kz0.x2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return k71.k.b(this.r, boVar.r) && this.s == boVar.s && this.t.equals(boVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.bg.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + f1.e.a(this.t, a0.s0.b(30, a0.s0.b(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "1881777c582ec899348b42f0251f5ca8bfdd8ac4c2b89367f18d06d27a3ea355";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationDiscussionCommentsQuery($repositoryOwner: String!, $discussionNumber: Int!, $number: Int!, $before: String, $previewCount: Int!) { organization(login: $repositoryOwner) { organizationDiscussionsRepository { discussion(number: $discussionNumber) { __typename ... on Discussion { __typename ...DiscussionCommentsFragment } id } id __typename } id __typename } id __typename }  fragment ReversedPageInfo on PageInfo { hasPreviousPage startCursor }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionCommentRepliesFragment on DiscussionComment { id replies(last: $previewCount) { totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } __typename }  fragment DiscussionCommentsFragment on Discussion { __typename id comments(last: $number, before: $before) { pageInfo { __typename ...ReversedPageInfo } nodes { __typename ...DiscussionCommentFragment ...ReactionFragment ...DiscussionCommentRepliesFragment id } } ...ReactionFragment }";
    }

    public final String name() {
        return "OrganizationDiscussionCommentsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("discussionNumber");
        fVar.z(this.s);
        fVar.z0("number");
        fVar.z(30);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("before");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("previewCount");
        fVar.z(3);
    }

    public final String toString() {
        return f1.e.k(a0.s0.n(this.s, "OrganizationDiscussionCommentsQuery(repositoryOwner=", this.r, ", discussionNumber=", ", number=30, before="), this.t, ", previewCount=3)");
    }
}
