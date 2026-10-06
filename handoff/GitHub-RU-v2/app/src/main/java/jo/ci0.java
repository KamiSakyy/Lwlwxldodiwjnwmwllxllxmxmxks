package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ci0 implements aaShadow.w0 {
    public static final yh0 Companion = new yh0();
    public String r;

    public ci0(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.h7.a;
        List list2 = h10.h7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci0) && k71.k.b(this.r, ((ci0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.j10.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "17c14eab81a29baa1d7cf0cf5b2b1d24169255e1daf9e418a3b26801a2d27881";
    }

    public final String j() {
        Companion.getClass();
        return "query UserOrganizationQuery($login: String!) { user(login: $login) { __typename ...UserProfileFragment id } organization(login: $login) { __typename ...OrganizationFragment id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment UserFollowersFragment on User { id viewerIsFollowing followers { totalCount } __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment ItemShowcaseFragment on ProfileItemShowcase { hasPinnedItems items(first: 6) { pinnedItems: nodes { __typename ... on Repository { __typename ...RepositoryListItemFragment id } ... on Gist { description url files(limit: 1) { name text(truncate: 40) } id } } } }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment ProfileStatusFragment on UserStatus { id emojiHTML indicatesLimitedAvailability message emoji expiresAt organization { __typename ...OrganizationNameAndAvatar id } __typename }  fragment RepositoryReadmeFragment on RepositoryReadme { contentHTML path }  fragment UserProfileFragment on User { __typename id url ...avatarFragment bioHTML companyHTML userEmail: email ...UserFollowersFragment following { totalCount } isDeveloperProgramMember isEmployee isFollowingViewer isViewer isBountyHunter itemShowcase { __typename ...ItemShowcaseFragment } location login name organizations { totalCount } pronouns repositories(ownerAffiliations: [OWNER]) { totalCount } starredRepositories { totalCount } sponsorshipsAsSponsor { totalCount } status { __typename ...ProfileStatusFragment id } showProfileReadme profileReadme { __typename ...RepositoryReadmeFragment } viewerCanFollow viewerIsFollowing websiteUrl viewerCanBlock viewerCanUnblock privateProfile projectsV2(first: 0) { totalCount } socialAccounts(first: 4) { nodes { displayName provider url } } achievements(first: 10) { nodes { achievable { name slug } tier(number: 1) { id badgeImageUrl __typename } id __typename } } }  fragment OrganizationFragment on Organization { __typename id url ...avatarFragment descriptionHTML organizationEmail: email isVerified organizationItemShowcase: itemShowcase { __typename ...ItemShowcaseFragment } location login name viewerIsFollowing organizationRepositories: repositories(ownerAffiliations: [OWNER]) { totalCount } readme { __typename ...RepositoryReadmeFragment } sponsorshipsAsSponsor { totalCount } websiteUrl twitterUsername projectsV2(first: 0) { totalCount } organizationDiscussionsRepository { name discussions(first: 0) { totalCount } id __typename } viewerIsFollowing }";
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
