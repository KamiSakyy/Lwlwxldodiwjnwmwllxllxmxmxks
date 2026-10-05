package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qd implements aa.n0 {
    public static final ld Companion = new ld();
    public final String r;
    public final String s;

    public qd(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "message");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.f1.a;
        List list2 = h10.f1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return k71.k.b(this.r, qdVar.r) && k71.k.b(this.s, qdVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.a9.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "2a2ca6b546f95414f291851c299d51a64d7c77380bf268d7ea20bca5409d087f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DismissPullRequestReview($id: ID!, $message: String!) { dismissPullRequestReview(input: { pullRequestReviewId: $id message: $message } ) { pullRequestReview { __typename ...pullRequestReviewFields pullRequest { __typename ...PullRequestPathData ...PullRequestReviewPullRequestData id } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestPathData on PullRequest { id number repository { id name owner { id login } __typename } __typename }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
    }

    public final String name() {
        return "DismissPullRequestReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("message");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("DismissPullRequestReviewMutation(id=", this.r, ", message=", this.s, ")");
    }
}
