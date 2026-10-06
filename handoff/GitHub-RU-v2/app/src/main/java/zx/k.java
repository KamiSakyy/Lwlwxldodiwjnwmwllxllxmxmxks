package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.w0 {
    public static final g Companion = new g();
    public String r;
    public String s;
    public int t;

    public k(String str, int i, String str2) {
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.b.a;
        List list2 = dy.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.r, kVar.r) && k71.k.b(this.s, kVar.s) && this.t == kVar.t;
    }

    public final aa.p0 g() {
        return aa.c.c(ay.e.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "3640074f0e5b2e4b91a70234c77da920fd1213311ccc683f8ad2ee92fd88013f";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueOrPullRequestOnlyId($repositoryOwner: String!, $repositoryName: String!, $number: Int!) { viewer { __typename id login } repository(owner: $repositoryOwner, name: $repositoryName) { __typename ...RepositoryNodeFragmentOnlyId id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryNodeFragmentBase on Repository { __typename name url isInOrganization owner { __typename id login ...avatarFragment } id viewerPermission squashMergeAllowed rebaseMergeAllowed mergeCommitAllowed viewerDefaultCommitEmail viewerDefaultMergeMethod viewerPossibleCommitEmails planSupports(feature: TEAM_REVIEW_REQUESTS) allowUpdateBranch issueTypes { totalCount } defaultBranchRef { name id __typename } viewerCodingAgents(first: 0) { totalCount } }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }  fragment RepositoryNodeFragmentOnlyId on Repository { __typename id ...RepositoryNodeFragmentBase ...SubscribableFragment issueOrPullRequest(number: $number) { __typename ... on Issue { id } ... on PullRequest { id } } }";
    }

    public final String name() {
        return "IssueOrPullRequestOnlyId";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
    }

    public final String toString() {
        return a0.s0.l(a0.s0.o("IssueOrPullRequestOnlyIdQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number="), this.t, ")");
    }
}
