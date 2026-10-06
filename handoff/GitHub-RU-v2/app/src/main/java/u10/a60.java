package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a60 implements aaShadow.n0 {
    public static final p50 Companion = new p50();
    public String r;

    public a60(String str) {
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.o5.a;
        List list2 = fc0.o5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a60) && k71.k.b(this.r, ((a60) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ls.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5abfa49c37888c7fce739c6194a4ea180f8d89cc64219ece28b4d4051e405eaf";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequestBranch($id: ID!) { updatePullRequestBranch(input: { pullRequestId: $id } ) { pullRequest { __typename id headRefOid state mergeStateStatus repository { id mergeCommitAllowed squashMergeAllowed rebaseMergeAllowed viewerDefaultMergeMethod viewerDefaultCommitEmail viewerPossibleCommitEmails viewerPermission __typename } headRef { id refUpdateRule { viewerCanPush } __typename } baseRefName ...AutoMergeRequestFragment viewerCanMergeAsAdmin mergedBy { __typename ...NodeIdFragment login } mergeCommit { id abbreviatedOid committedDate __typename } viewerCanUpdate timelineItems(last: 1, itemTypes: [PULL_REQUEST_COMMIT]) { nodes { __typename ...NodeIdFragment ...pullRequestCommitFields } } } clientMutationId } }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment pullRequestCommitFields on PullRequestCommit { __typename id pullRequestCommit: commit { __typename id status { __typename state id } messageHeadline author { __typename avatarUrl } committedDate } }";
    }

    public final String name() {
        return "UpdatePullRequestBranch";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UpdatePullRequestBranchMutation(id=", this.r, ")");
    }
}
