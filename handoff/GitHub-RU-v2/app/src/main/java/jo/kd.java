package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kd implements aa.w0 {
    public static final ed Companion = new ed();
    public final String r;
    public final aa.u0 s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa.u0 v;

    public kd(String str, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2, aa.u0 u0Var2) {
        k71.k.g(str, "query");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
        this.u = bVar2;
        this.v = u0Var2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.e1.a;
        List list2 = h10.e1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return k71.k.b(this.r, kdVar.r) && this.s.equals(kdVar.s) && this.t.equals(kdVar.t) && this.u.equals(kdVar.u) && this.v.equals(kdVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.v8.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f4.a(this.s, a0.s0.b(30, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "3a9a7c57a09ff6f9b04a07ee3b35f4f10f111a6c94fe00bfaa84c07cddf1af54";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionSearchQuery($query: String!, $first: Int!, $after: String, $owner: String = \"\" , $name: String = \"\" , $include: Boolean = false ) { repository(owner: $owner, name: $name) @include(if: $include) { __typename name id } search(first: $first, type: DISCUSSION, query: $query, after: $after) { discussionCount pageInfo { hasNextPage endCursor } nodes { __typename ...NodeIdFragment ...DiscussionFragment } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment DiscussionPollOptionFragment on DiscussionPollOption { id option viewerHasVoted totalVoteCount __typename }  fragment DiscussionPollFragment on DiscussionPoll { id question viewerHasVoted totalVoteCount viewerCanVote options(first: 8) { nodes { __typename ...DiscussionPollOptionFragment id } } __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment DiscussionClosedStateFragment on Discussion { id closed viewerCanClose viewerCanReopen closedAt stateReason __typename }  fragment DiscussionFragment on Discussion { __typename id title updatedAt createdAt lastEditedAt number viewerDidAuthor viewerCanUpdate viewerCanUpvote authorAssociation url repository { id name owner { id login } viewerPermission isOrganizationDiscussionRepository __typename } answerChosenAt answer { __typename id replyTo { id __typename } ...DiscussionCommentFragment } category { __typename ...DiscussionCategoryFragment id } author { __typename ...actorFields ... on Node { id } } comments { totalCount } poll { __typename ...DiscussionPollFragment id } ...LabelsFragment ...UpvoteFragment ...DiscussionClosedStateFragment }";
    }

    public final String name() {
        return "DiscussionSearchQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("query");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        fVar.z0("after");
        aa.o0 o0Var = aa.c.i;
        aa.c.d(o0Var).d(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("owner");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("owner");
            aa.c.l.b(fVar, wVar, "");
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("name");
            aa.c.d(o0Var).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("name");
            aa.c.l.b(fVar, wVar, "");
        }
        fVar.z0("include");
        aa.c.d(aa.c.k).d(fVar, wVar, this.v);
    }

    public final String toString() {
        StringBuilder t = f4.t(this.s, "DiscussionSearchQuery(query=", this.r, ", first=30, after=", ", owner=");
        f1.e.w(t, this.t, ", name=", this.u, ", include=");
        return f1.e.j(t, this.v, ")");
    }
}
