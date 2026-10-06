package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements aaShadow.n0 {
    public static final x0 Companion = new x0();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;

    public b1(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.i.a;
        List list2 = kz0.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.r, b1Var.r) && k71.k.b(this.s, b1Var.s) && k71.k.b(this.t, b1Var.t) && k71.k.b(this.u, b1Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.h0.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "8f7e43288e724b198a8efbe9fd170ad4b0a132fd0d2164332513dee945ab92f3";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReview($id: ID!, $event: PullRequestReviewEvent, $body: String, $commitOid: GitObjectID) { addPullRequestReview(input: { pullRequestId: $id event: $event body: $body commitOID: $commitOid } ) { pullRequestReview { __typename id ...pullRequestReviewFields pullRequest { __typename ...PullRequestReviewPullRequestData id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
    }

    public final String name() {
        return "AddReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("event");
            aa.c.d(aa.c.b(qz0.b.i)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("body");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("commitOid");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.l(f1.e.o(this.s, "AddReviewMutation(id=", this.r, ", event=", ", body="), this.t, ", commitOid=", this.u, ")");
    }
}
