package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g00 implements aa.n0 {
    public static final b00 Companion = new b00();
    public final String r;
    public final hc0.pl s;
    public final aa1.b t;

    public g00(String str, hc0.pl plVar, aa1.b bVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = plVar;
        this.t = bVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.q4.a;
        List list2 = fc0.q4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return k71.k.b(this.r, g00Var.r) && this.s == g00Var.s && k71.k.b(this.t, g00Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.to.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "b33b053b038911edfd6bac28e45cea4f7c6309e631f48081198c5066dfa2a24a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SubmitReview($id: ID!, $event: PullRequestReviewEvent!, $body: String) { submitPullRequestReview(input: { pullRequestId: $id event: $event body: $body } ) { pullRequestReview { __typename ...pullRequestReviewFields pullRequest { __typename ...PullRequestReviewPullRequestData id } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
    }

    public final String name() {
        return "SubmitReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("event");
        fVar.I(this.s.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("body");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitReviewMutation(id=");
        sb.append(this.r);
        sb.append(", event=");
        sb.append(this.s);
        sb.append(", body=");
        return f1.e.k(sb, this.t, ")");
    }
}
