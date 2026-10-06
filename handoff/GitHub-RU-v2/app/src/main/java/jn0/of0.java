package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class of0 implements aaShadow.w0 {
    public static final kf0 Companion = new kf0();
    public String r;

    public of0(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.y6.a;
        List list2 = kz0.y6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of0) && k71.k.b(this.r, ((of0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.oz.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "bb70f4c259d5551cd3614617d01c8ee0c76ac845d1d682f4aa035f7f5f0408f2";
    }

    public final String j() {
        Companion.getClass();
        return "query UserOrganizationQuery($login: String!) { user(login: $login) { __typename ...UserProfileFragment id } organization(login: $login) { __typename ...OrganizationFragment id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserFollowersFragment on User { id viewerIsFollowing followers { totalCount } __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment ItemShowcaseFragment on ProfileItemShowcase { hasPinnedItems items(first: 6) { pinnedItems: nodes { __typename ... on Repository { __typename ...RepositoryListItemFragment id } ... on Gist { description url files(limit: 1) { name text(truncate: 40) } id } } } }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment ProfileStatusFragment on UserStatus { id emojiHTML indicatesLimitedAvailability message emoji expiresAt organization { __typename ...OrganizationNameAndAvatar id } __typename }  fragment RepositoryReadmeFragment on RepositoryReadme { contentHTML path }  fragment UserProfileFragment on User { __typename id url ...avatarFragment bioHTML companyHTML userEmail: email ...UserFollowersFragment following { totalCount } isDeveloperProgramMember isEmployee isFollowingViewer isViewer isBountyHunter itemShowcase { __typename ...ItemShowcaseFragment } location login name organizations { totalCount } pronouns repositories(ownerAffiliations: [OWNER]) { totalCount } starredRepositories { totalCount } status { __typename ...ProfileStatusFragment id } showProfileReadme profileReadme { __typename ...RepositoryReadmeFragment } viewerCanFollow viewerIsFollowing websiteUrl viewerCanBlock viewerCanUnblock privateProfile projectsV2(first: 0) { totalCount } socialAccounts(first: 4) { nodes { displayName provider url } } achievements(first: 10) { nodes { achievable { name slug } tier(number: 1) { id badgeImageUrl __typename } id __typename } } }  fragment OrganizationFragment on Organization { __typename id url ...avatarFragment descriptionHTML organizationEmail: email isVerified organizationItemShowcase: itemShowcase { __typename ...ItemShowcaseFragment } location login name viewerIsFollowing organizationRepositories: repositories(ownerAffiliations: [OWNER]) { totalCount } readme { __typename ...RepositoryReadmeFragment } websiteUrl twitterUsername projectsV2(first: 0) { totalCount } organizationDiscussionsRepository { name discussions(first: 0) { totalCount } id __typename } viewerIsFollowing }";
    }

    public final String name() {
        return "UserOrganizationQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UserOrganizationQuery(login=", this.r, ")");
    }
}
