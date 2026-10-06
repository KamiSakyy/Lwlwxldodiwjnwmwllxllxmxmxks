package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gg0 implements aaShadow.n0 {
    public static final cg0 Companion = new cg0();
    public String r;
    public String s;

    public gg0(String str, String str2) {
        k71.k.g(str, "reviewId");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.y6.a;
        List list2 = h10.y6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return k71.k.b(this.r, gg0Var.r) && k71.k.b(this.s, gg0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.f00.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "2eca18d2a79f7a6f41cb0955af7d049fc42a214e83e5a3da87a897312accbdb8";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateReview($reviewId: ID!, $body: String!) { updatePullRequestReview(input: { pullRequestReviewId: $reviewId body: $body } ) { pullRequestReview { __typename ...pullRequestReviewFields id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }";
    }

    public final String name() {
        return "UpdateReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("reviewId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdateReviewMutation(reviewId=", this.r, ", body=", this.s, ")");
    }
}
