package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q10 implements aaShadow.w0 {
    public static final n10 Companion = new n10();
    public String r;
    public String s;
    public boolean t;
    public aa1.b u;
    public String v;
    public aa1.b w;

    public q10(String str, String str2, boolean z, aa1.b bVar, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "qualifiedName");
        this.r = str;
        this.s = str2;
        this.t = z;
        this.u = bVar;
        this.v = str3;
        this.w = aa.t0.d;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.r4.a;
        List list2 = kz0.r4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q10)) {
            return false;
        }
        q10 q10Var = (q10) obj;
        return k71.k.b(this.r, q10Var.r) && k71.k.b(this.s, q10Var.s) && this.t == q10Var.t && k71.k.b(this.u, q10Var.u) && k71.k.b(this.v, q10Var.v) && k71.k.b(this.w, q10Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.dq.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + com.github.rudroid.copilot.h1.i(f1.e.a(this.u, x.i.e(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31, this.t), 31), this.v, 31);
    }

    public final String i() {
        return "4e5e029fcb6a38887a6a7183fc33cc4c20909f01eb3bbcae7bd851f194b5f217";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryQuery($owner: String!, $name: String!, $defaultBranch: Boolean!, $branch: String, $qualifiedName: String!, $includeIssueTemplateProperties: Boolean = false ) { repository(owner: $owner, name: $name) { __typename ...RepositoryDetailsFragment id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment labelFields on Label { __typename id name color }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment RepositoryBranchInfoFragment on Ref { id name viewerCanCommitToBranch target { __typename id ... on Commit { oid statusCheckRollup { state id __typename } } } __typename }  fragment LicenseFragment on License { name spdxId id __typename }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }  fragment UserListItemFragment on User { __typename id ...avatarFragment name login bioHTML viewerIsFollowing }  fragment TopContributorsFragment on Repository { topContributors(limit: 5, skipBots: true, skipViewer: true) { __typename ... on User { __typename ...UserListItemFragment viewerCanUnblock } id } id __typename }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }  fragment UserListMetadataForRepositoryFragment on Repository { id lists(first: 100, onlyOwnedByViewer: true) { nodes { __typename ...UserListFragment id } } __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryDetailsFragment on Repository { __typename id databaseId ...IssueTemplateFragment contributorsCount defaultBranchRef @include(if: $defaultBranch) { __typename ...RepositoryBranchInfoFragment id } branchInfo: ref(qualifiedName: $qualifiedName) @skip(if: $defaultBranch) { __typename ...RepositoryBranchInfoFragment id } forkCount hasIssuesEnabled showActions homepageUrl isPrivate isArchived isTemplate isFork forkingAllowed isEmpty isInOrganization issues(first: 0, states: [OPEN]) { totalCount } name owner { __typename id login ...avatarFragment } pullRequests(first: 0, states: [OPEN]) { totalCount } refs(first: 0, refPrefix: \"refs/heads/\") { totalCount } readme(refName: $branch) { contentHTML path } repositoryTopics(first: 6) { nodes { topic { id name __typename } id __typename } } url shortDescriptionHTML descriptionHTML description viewerCanAdminister viewerCanPush viewerCanSubscribe viewerPermission watchers(first: 0) { totalCount } licenseInfo { __typename ...LicenseFragment id } isDiscussionsEnabled discussionsCount parent { id name owner { id login } __typename } releases(first: 0) { totalCount } ...SubscribableFragment latestRelease { id name tagName publishedAt createdAt __typename } ...TopContributorsFragment isViewersFavorite viewerHasBlockedContributors viewerBlockedByOwner mergeQueue(branch: $branch) { __typename ...MergeQueueFragment id } ...UserListMetadataForRepositoryFragment projectsV2(first: 0) { totalCount } ...RepositoryStarsFragment forks(first: 1, affiliations: OWNER) { nodes { id url __typename } } }";
    }

    public final String name() {
        return "RepositoryQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("defaultBranch");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.t));
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("branch");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("qualifiedName");
        bVar.b(fVar, wVar, this.v);
        aa.u0 u0Var2 = this.w;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryQuery(owner=", this.r, ", name=", this.s, ", defaultBranch=");
        o.append(this.t);
        o.append(", branch=");
        o.append(this.u);
        o.append(", qualifiedName=");
        o.append(this.v);
        o.append(", includeIssueTemplateProperties=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
