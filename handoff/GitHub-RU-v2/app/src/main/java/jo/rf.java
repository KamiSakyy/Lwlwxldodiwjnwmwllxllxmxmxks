package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rf implements aaShadow.w0 {
    public static final hf Companion = new hf();
    public aa1.b r;
    public aa1.b s;

    public rf(aa1.b bVar, aa1.b bVar2) {
        k71.k.g(bVar, "first");
        k71.k.g(bVar2, "after");
        this.r = bVar;
        this.s = bVar2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.n1.a;
        List list2 = h10.n1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return k71.k.b(this.r, rfVar.r) && k71.k.b(this.s, rfVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ha.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "56ee3495aaff1b893fddf38b4710e86a02cccd182122635d6191ed4ddcf2572d";
    }

    public final String j() {
        Companion.getClass();
        return "query Feed($first: Int = 25 , $after: String = null ) { viewer { __typename id dashboard { feed { filters { isEnabled filterGroup } items(first: $first, after: $after, itemTypes: [CREATED_DISCUSSION_FEED_ITEM,CREATED_REPOSITORY_FEED_ITEM,FOLLOWED_USER_FEED_ITEM,FOLLOW_RECOMMENDATION_FEED_ITEM,FORKED_REPOSITORY_FEED_ITEM,MERGED_PULL_REQUEST_FEED_ITEM,PUBLISHED_RELEASE_FEED_ITEM,REPOSITORY_RECOMMENDATION_FEED_ITEM,STARRED_REPOSITORY_FEED_ITEM]) { pageInfo { endCursor hasNextPage hasPreviousPage } nodes { __typename ...CreatedDiscussionFeedItemFragment ...CreatedRepositoryFeedItemFragment ...FollowRecommendationFeedItemFragment ...FollowedUserFeedItemFragment ...ForkedRepositoryFeedItemFragment ...MergedPullRequestFeedItemFragment ...PublishedReleaseFeedItemFragment ...RepositoryRecommendationFeedItemFragment ...StarredRepositoryFeedItemFragment } } } id __typename } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment RepositoryFeedHeader on Repository { id name url owner { __typename id login url ...avatarFragment ... on User { __typename id name } ... on Organization { __typename id name } } usesCustomOpenGraphImage openGraphImageUrl lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } __typename }  fragment DiscussionFeedFragment on Discussion { __typename id url title bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) bodyText number ...ReactionFragment repository { __typename ...RepositoryFeedHeader id } }  fragment CreatedDiscussionFeedItemFragmentNoRelatedItems on CreatedDiscussionFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier previewImageUrl discussion { __typename ...DiscussionFeedFragment id } }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryFeedFragment on Repository { __typename id contributorsCount descriptionHTML primaryLanguage { color name id __typename } ...RepositoryStarsFragment ...RepositoryFeedHeader }  fragment CreatedRepositoryFeedItemFragmentNoRelatedItems on CreatedRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment RecommendedUserFeedFragment on User { __typename id name login url bio repositories(ownerAffiliations: [OWNER]) { totalCount } followers { totalCount } viewerIsFollowing isViewer privateProfile ...avatarFragment }  fragment RecommendedOrganisationFeedFragment on Organization { __typename id name login url description viewerIsFollowing ...avatarFragment }  fragment FollowRecommendationFeedItemFragmentNoRelatedItems on FollowRecommendationFeedItem { __typename createdAt dismissable identifier reason followee { __typename ...RecommendedUserFeedFragment ...RecommendedOrganisationFeedFragment } }  fragment UserFeedFragment on User { __typename id login url ...avatarFragment }  fragment FollowedUserFeedItemFragmentNoRelatedItems on FollowedUserFeedItem { __typename createdAt dismissable identifier followee { __typename ...RecommendedUserFeedFragment ...RecommendedOrganisationFeedFragment } follower { __typename ...UserFeedFragment id } }  fragment ForkedRepositoryFeedItemFragmentNoRelatedItems on ForkedRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment PullRequestFeedFragment on PullRequest { __typename id title bodyHTML bodyText ...ReactionFragment baseRefName headRefName state isDraft number repository { __typename ...RepositoryFeedHeader id } }  fragment MergedPullRequestFeedItemFragmentNoRelatedItems on MergedPullRequestFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier pullRequest { __typename ...PullRequestFeedFragment id } }  fragment ReleaseFeedFragment on Release { __typename id url name shortDescriptionHTML tagName mentions(first: 10) { totalCount nodes { __typename id url ...avatarFragment } } ...ReactionFragment repository { __typename ...RepositoryFeedHeader id } discussion { id url __typename } }  fragment PublishedReleaseFeedItemFragmentNoRelatedItems on PublishedReleaseFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier release { __typename ...ReleaseFeedFragment id } }  fragment RepositoryRecommendationFeedItemFragmentNoRelatedItems on RepositoryRecommendationFeedItem { createdAt dismissable identifier reason repository { __typename ...RepositoryFeedFragment id } }  fragment StarredRepositoryFeedItemFragmentNoRelatedItems on StarredRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment FeedItemsNoRelatedItems on FeedItem { __typename ...CreatedDiscussionFeedItemFragmentNoRelatedItems ...CreatedRepositoryFeedItemFragmentNoRelatedItems ...FollowRecommendationFeedItemFragmentNoRelatedItems ...FollowedUserFeedItemFragmentNoRelatedItems ...ForkedRepositoryFeedItemFragmentNoRelatedItems ...MergedPullRequestFeedItemFragmentNoRelatedItems ...PublishedReleaseFeedItemFragmentNoRelatedItems ...RepositoryRecommendationFeedItemFragmentNoRelatedItems ...StarredRepositoryFeedItemFragmentNoRelatedItems }  fragment CreatedDiscussionFeedItemFragment on CreatedDiscussionFeedItem { __typename ...CreatedDiscussionFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment CreatedRepositoryFeedItemFragment on CreatedRepositoryFeedItem { __typename ...CreatedRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment FollowRecommendationFeedItemFragment on FollowRecommendationFeedItem { __typename ...FollowRecommendationFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment FollowedUserFeedItemFragment on FollowedUserFeedItem { __typename ...FollowedUserFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment ForkedRepositoryFeedItemFragment on ForkedRepositoryFeedItem { __typename ...ForkedRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment MergedPullRequestFeedItemFragment on MergedPullRequestFeedItem { __typename ...MergedPullRequestFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment PublishedReleaseFeedItemFragment on PublishedReleaseFeedItem { __typename ...PublishedReleaseFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment RepositoryRecommendationFeedItemFragment on RepositoryRecommendationFeedItem { __typename ...RepositoryRecommendationFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment StarredRepositoryFeedItemFragment on StarredRepositoryFeedItem { __typename ...StarredRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }";
    }

    public final String name() {
        return "Feed";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("first");
            aa.c.l.b(fVar, wVar, 25);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("after");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
    }

    public final String toString() {
        return "FeedQuery(first=" + this.r + ", after=" + this.s + ")";
    }
}
