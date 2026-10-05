package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class te implements aa.w0 {
    public static final ke Companion = new ke();
    public final aa1.b r;
    public final aa1.b s;

    public te(aa1.b bVar, aa1.b bVar2) {
        k71.k.g(bVar, "first");
        k71.k.g(bVar2, "after");
        this.r = bVar;
        this.s = bVar2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.k1.a;
        List list2 = kz0.k1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return k71.k.b(this.r, teVar.r) && k71.k.b(this.s, teVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.r9.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b4f6dec9caa8b426f80fc7923da79a8ff226cd241daf99c8bd1a96bc93fa9ca6";
    }

    public final String j() {
        Companion.getClass();
        return "query Feed($first: Int = 25 , $after: String = null ) { viewer { __typename id dashboard { feed { filters { isEnabled filterGroup } items(first: $first, after: $after, itemTypes: [CREATED_DISCUSSION_FEED_ITEM,CREATED_REPOSITORY_FEED_ITEM,FOLLOWED_USER_FEED_ITEM,FOLLOW_RECOMMENDATION_FEED_ITEM,FORKED_REPOSITORY_FEED_ITEM,MERGED_PULL_REQUEST_FEED_ITEM,PUBLISHED_RELEASE_FEED_ITEM,REPOSITORY_RECOMMENDATION_FEED_ITEM,STARRED_REPOSITORY_FEED_ITEM]) { pageInfo { endCursor hasNextPage hasPreviousPage } nodes { __typename ...CreatedDiscussionFeedItemFragment ...CreatedRepositoryFeedItemFragment ...FollowRecommendationFeedItemFragment ...FollowedUserFeedItemFragment ...ForkedRepositoryFeedItemFragment ...MergedPullRequestFeedItemFragment ...PublishedReleaseFeedItemFragment ...RepositoryRecommendationFeedItemFragment ...StarredRepositoryFeedItemFragment } } } id __typename } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment RepositoryFeedHeader on Repository { id name url owner { __typename id login url ...avatarFragment ... on User { __typename id name } ... on Organization { __typename id name } } usesCustomOpenGraphImage openGraphImageUrl lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } __typename }  fragment DiscussionFeedFragment on Discussion { __typename id url title bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) bodyText number ...ReactionFragment repository { __typename ...RepositoryFeedHeader id } }  fragment CreatedDiscussionFeedItemFragmentNoRelatedItems on CreatedDiscussionFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier previewImageUrl discussion { __typename ...DiscussionFeedFragment id } }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryFeedFragment on Repository { __typename id contributorsCount descriptionHTML primaryLanguage { color name id __typename } ...RepositoryStarsFragment ...RepositoryFeedHeader }  fragment CreatedRepositoryFeedItemFragmentNoRelatedItems on CreatedRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment RecommendedUserFeedFragment on User { __typename id name login url bio repositories(ownerAffiliations: [OWNER]) { totalCount } followers { totalCount } viewerIsFollowing isViewer privateProfile ...avatarFragment }  fragment RecommendedOrganisationFeedFragment on Organization { __typename id name login url description viewerIsFollowing ...avatarFragment }  fragment FollowRecommendationFeedItemFragmentNoRelatedItems on FollowRecommendationFeedItem { __typename createdAt dismissable identifier reason followee { __typename ...RecommendedUserFeedFragment ...RecommendedOrganisationFeedFragment } }  fragment UserFeedFragment on User { __typename id login url ...avatarFragment }  fragment FollowedUserFeedItemFragmentNoRelatedItems on FollowedUserFeedItem { __typename createdAt dismissable identifier followee { __typename ...RecommendedUserFeedFragment ...RecommendedOrganisationFeedFragment } follower { __typename ...UserFeedFragment id } }  fragment ForkedRepositoryFeedItemFragmentNoRelatedItems on ForkedRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment PullRequestFeedFragment on PullRequest { __typename id title bodyHTML bodyText ...ReactionFragment baseRefName headRefName state isDraft number repository { __typename ...RepositoryFeedHeader id } }  fragment MergedPullRequestFeedItemFragmentNoRelatedItems on MergedPullRequestFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier pullRequest { __typename ...PullRequestFeedFragment id } }  fragment ReleaseFeedFragment on Release { __typename id url name shortDescriptionHTML tagName mentions(first: 10) { totalCount nodes { __typename id url ...avatarFragment } } ...ReactionFragment repository { __typename ...RepositoryFeedHeader id } discussion { id url __typename } }  fragment PublishedReleaseFeedItemFragmentNoRelatedItems on PublishedReleaseFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier release { __typename ...ReleaseFeedFragment id } }  fragment RepositoryRecommendationFeedItemFragmentNoRelatedItems on RepositoryRecommendationFeedItem { createdAt dismissable identifier reason repository { __typename ...RepositoryFeedFragment id } }  fragment StarredRepositoryFeedItemFragmentNoRelatedItems on StarredRepositoryFeedItem { actor { __typename ...actorFields id } createdAt dismissable identifier repository { __typename ...RepositoryFeedFragment id } }  fragment FeedItemsNoRelatedItems on FeedItem { __typename ...CreatedDiscussionFeedItemFragmentNoRelatedItems ...CreatedRepositoryFeedItemFragmentNoRelatedItems ...FollowRecommendationFeedItemFragmentNoRelatedItems ...FollowedUserFeedItemFragmentNoRelatedItems ...ForkedRepositoryFeedItemFragmentNoRelatedItems ...MergedPullRequestFeedItemFragmentNoRelatedItems ...PublishedReleaseFeedItemFragmentNoRelatedItems ...RepositoryRecommendationFeedItemFragmentNoRelatedItems ...StarredRepositoryFeedItemFragmentNoRelatedItems }  fragment CreatedDiscussionFeedItemFragment on CreatedDiscussionFeedItem { __typename ...CreatedDiscussionFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment CreatedRepositoryFeedItemFragment on CreatedRepositoryFeedItem { __typename ...CreatedRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment FollowRecommendationFeedItemFragment on FollowRecommendationFeedItem { __typename ...FollowRecommendationFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment FollowedUserFeedItemFragment on FollowedUserFeedItem { __typename ...FollowedUserFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment ForkedRepositoryFeedItemFragment on ForkedRepositoryFeedItem { __typename ...ForkedRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment MergedPullRequestFeedItemFragment on MergedPullRequestFeedItem { __typename ...MergedPullRequestFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment PublishedReleaseFeedItemFragment on PublishedReleaseFeedItem { __typename ...PublishedReleaseFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment RepositoryRecommendationFeedItemFragment on RepositoryRecommendationFeedItem { __typename ...RepositoryRecommendationFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }  fragment StarredRepositoryFeedItemFragment on StarredRepositoryFeedItem { __typename ...StarredRepositoryFeedItemFragmentNoRelatedItems relatedItems { __typename ...FeedItemsNoRelatedItems } }";
    }

    public final String name() {
        return "Feed";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aa.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("first");
            aa.c.l.b(fVar, wVar, 25);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
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
