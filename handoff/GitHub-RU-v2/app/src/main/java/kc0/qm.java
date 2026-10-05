package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qm implements aa.w0 {
    public static final lm Companion = new lm();
    public final String r;
    public final int s;

    public qm(String str, int i) {
        k71.k.g(str, "repositoryOwner");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.s2.a;
        List list2 = en0.s2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        return k71.k.b(this.r, qmVar.r) && this.s == qmVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.af.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "4ec8c9870983bd6a91ca551335950a41ce2627afdd3a228b4b98e0391b0d11fe";
    }

    public final String j() {
        Companion.getClass();
        return "query OrganizationDiscussionDetailQuery($repositoryOwner: String!, $discussionNumber: Int!) { organization(login: $repositoryOwner) { organizationDiscussionsRepository { discussion(number: $discussionNumber) { __typename ...DiscussionDetailsFragment id } id __typename } id __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment UpvoteFragment on Votable { __typename ...NodeIdFragment viewerCanUpvote viewerHasUpvoted upvoteCount }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment DiscussionCommentFragment on DiscussionComment { __typename id ...CommentFragment ...OrgBlockableFragment ...MinimizableCommentFragment url viewerCanUpdate viewerCanMarkAsAnswer viewerCanUnmarkAsAnswer isAnswer deletedAt discussion { id viewerCanUpvote answerChosenBy { __typename ...NodeIdFragment login } __typename } ...UpvoteFragment ...ReactionFragment }  fragment DiscussionCategoryFragment on DiscussionCategory { id name emojiHTML isAnswerable isPollable description template { url } __typename }  fragment DiscussionPollOptionFragment on DiscussionPollOption { id option viewerHasVoted totalVoteCount __typename }  fragment DiscussionPollFragment on DiscussionPoll { id question viewerHasVoted totalVoteCount viewerCanVote options(first: 8) { nodes { __typename ...DiscussionPollOptionFragment id } } __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment DiscussionClosedStateFragment on Discussion { id closed viewerCanClose viewerCanReopen closedAt stateReason __typename }  fragment DiscussionFragment on Discussion { __typename id title updatedAt createdAt lastEditedAt number viewerDidAuthor viewerCanUpdate viewerCanUpvote authorAssociation url repository { id name owner { id login } viewerPermission isOrganizationDiscussionRepository __typename } answerChosenAt answer { __typename id replyTo { id __typename } ...DiscussionCommentFragment } category { __typename ...DiscussionCategoryFragment id } author { __typename ...actorFields ... on Node { id } } comments { totalCount } poll { __typename ...DiscussionPollFragment id } ...LabelsFragment ...UpvoteFragment ...DiscussionClosedStateFragment }  fragment DiscussionDetailsFragment on Discussion { __typename id repository { id owner { __typename ...actorFields } __typename } ...DiscussionFragment bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body ...ReactionFragment ...OrgBlockableFragment viewerSubscription locked viewerCanDelete viewerCanUpdate viewerCanUpvote }";
    }

    public final String name() {
        return "OrganizationDiscussionDetailQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("discussionNumber");
        fVar.z(this.s);
    }

    public final String toString() {
        return com.github.rudroid.m0.b(this.s, "OrganizationDiscussionDetailQuery(repositoryOwner=", this.r, ", discussionNumber=", ")");
    }
}
