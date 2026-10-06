package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xa implements aaShadow.w0 {
    public static final ta Companion = new ta();
    public String r;
    public String s;
    public int t;
    public aa1.b u;

    public xa(int i, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = bVar;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.u0.a;
        List list2 = en0.u0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return k71.k.b(this.r, xaVar.r) && k71.k.b(this.s, xaVar.s) && this.t == xaVar.t && this.u.equals(xaVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.f7.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + f1.e.a(this.u, a0.s0.b(30, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31), 31);
    }

    public final String i() {
        return "b64589579e2a73970207a1ba012012715fd1168340ef54c1a7b172aeb99ef868";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionCommentsQuery($repositoryOwner: String!, $repositoryName: String!, $discussionNumber: Int!, $number: Int!, $before: String, $previewCount: Int!) { repository(owner: $repositoryOwner, name: $repositoryName) { id discussion(number: $discussionNumber) { __typename ...DiscussionCommentsFragment id } __typename } }  fragment ReversedPageInfo on PageInfo { hasPreviousPage startCursor }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCommentReplyFragment on DiscussionComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer discussion { id answer { id __typename } answerChosenBy { __typename ...NodeIdFragment login } __typename } id }  fragment DiscussionCommentRepliesFragment on DiscussionComment { id replies(last: $previewCount) { totalCount nodes { __typename ...DiscussionCommentReplyFragment id } } __typename }  fragment DiscussionCommentsFragment on Discussion { __typename id comments(last: $number, before: $before) { pageInfo { __typename ...ReversedPageInfo } nodes { __typename ...DiscussionCommentFragment ...ReactionFragment ...DiscussionCommentRepliesFragment id } } ...ReactionFragment }";
    }

    public final String name() {
        return "DiscussionCommentsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("discussionNumber");
        fVar.z(this.t);
        fVar.z0("number");
        fVar.z(30);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("before");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("previewCount");
        fVar.z(3);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionCommentsQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", discussionNumber=");
        o.append(this.t);
        o.append(", number=30, before=");
        o.append(this.u);
        o.append(", previewCount=3)");
        return o.toString();
    }
}
