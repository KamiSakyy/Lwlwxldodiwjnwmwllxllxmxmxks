package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wb implements aa.w0 {
    public static final sb Companion = new sb();
    public final String r;
    public final String s;
    public final int t;

    public wb(String str, int i, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.y0.a;
        List list2 = kz0.y0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return k71.k.b(this.r, wbVar.r) && k71.k.b(this.s, wbVar.s) && this.t == wbVar.t;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.w7.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "be43c9ed43990e24ab5265c503311ef7e360266c3f699061507746edc2340ec2";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionDetailQuery($repositoryOwner: String!, $repositoryName: String!, $discussionNumber: Int!) { repository(owner: $repositoryOwner, name: $repositoryName) { id discussion(number: $discussionNumber) { __typename ...DiscussionDetailsFragment id } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment DiscussionPollOptionFragment on DiscussionPollOption { id option viewerHasVoted totalVoteCount __typename }  fragment DiscussionPollFragment on DiscussionPoll { id question viewerHasVoted totalVoteCount viewerCanVote options(first: 8) { nodes { __typename ...DiscussionPollOptionFragment id } } __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment DiscussionClosedStateFragment on Discussion { id closed viewerCanClose viewerCanReopen closedAt stateReason __typename }  fragment DiscussionFragment on Discussion { __typename id title updatedAt createdAt lastEditedAt number viewerDidAuthor viewerCanUpdate viewerCanUpvote authorAssociation url repository { id name owner { id login } viewerPermission isOrganizationDiscussionRepository __typename } answerChosenAt answer { __typename id replyTo { id __typename } ...DiscussionCommentFragment } category { __typename ...DiscussionCategoryFragment id } author { __typename ...actorFields ... on Node { id } } comments { totalCount } poll { __typename ...DiscussionPollFragment id } ...LabelsFragment ...UpvoteFragment ...DiscussionClosedStateFragment }  fragment DiscussionDetailsFragment on Discussion { __typename id repository { id owner { __typename ...actorFields } __typename } ...DiscussionFragment bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body ...ReactionFragment ...OrgBlockableFragment viewerSubscription locked viewerCanDelete viewerCanUpdate viewerCanUpvote }";
    }

    public final String name() {
        return "DiscussionDetailQuery";
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
    }

    public final String toString() {
        return a0.s0.l(a0.s0.o("DiscussionDetailQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", discussionNumber="), this.t, ")");
    }
}
