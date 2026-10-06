package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rb implements aaShadow.n0 {
    public static final mb Companion = new mb();
    public String r;
    public String s;

    public rb(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "message");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.y0.a;
        List list2 = fc0.y0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return k71.k.b(this.r, rbVar.r) && k71.k.b(this.s, rbVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.q7.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "02cf2611777e7663699e357a53e5009c885064bedfe6850d4a21995803b901a3";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DismissPullRequestReview($id: ID!, $message: String!) { dismissPullRequestReview(input: { pullRequestReviewId: $id message: $message } ) { pullRequestReview { __typename ...pullRequestReviewFields pullRequest { __typename ...PullRequestPathData ...PullRequestReviewPullRequestData id } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestPathData on PullRequest { id number repository { id name owner { id login } __typename } __typename }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
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
