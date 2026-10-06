package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x50 implements aaShadow.n0 {
    public static final s50 Companion = new s50();
    public final String r;
    public final pz0.qt s;
    public final aa1.b t;

    public x50(String str, pz0.qt qtVar, aa1.b bVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = qtVar;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.i5.a;
        List list2 = kz0.i5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x50)) {
            return false;
        }
        x50 x50Var = (x50) obj;
        return k71.k.b(this.r, x50Var.r) && this.s == x50Var.s && k71.k.b(this.t, x50Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.at.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "ff91559b73c872744604b3bae2f2c370fd44dd4780cba2af655dd55323d99224";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SubmitReview($id: ID!, $event: PullRequestReviewEvent!, $body: String) { submitPullRequestReview(input: { pullRequestId: $id event: $event body: $body } ) { pullRequestReview { __typename ...pullRequestReviewFields pullRequest { __typename ...PullRequestReviewPullRequestData id } id } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
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
        if (u0Var instanceof aaShadow.u0) {
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
