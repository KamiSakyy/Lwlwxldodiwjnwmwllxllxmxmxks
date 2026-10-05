package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.n0 {
    public static final c1 Companion = new c1();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;

    public g1(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.j.a;
        List list2 = h10.j.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.r, g1Var.r) && k71.k.b(this.s, g1Var.s) && k71.k.b(this.t, g1Var.t) && k71.k.b(this.u, g1Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.k0.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "ee8b60607a990a2f746186c60d55872293f42bbb57335876d2358c1d216ea3bd";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReview($id: ID!, $event: PullRequestReviewEvent, $body: String, $commitOid: GitObjectID) { addPullRequestReview(input: { pullRequestId: $id event: $event body: $body commitOID: $commitOid } ) { pullRequestReview { __typename id ...pullRequestReviewFields pullRequest { __typename ...PullRequestReviewPullRequestData id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment PullRequestReviewPullRequestData on PullRequest { id reviewDecision totalCommentsCount __typename }";
    }

    public final String name() {
        return "AddReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("event");
            aa.c.d(aa.c.b(n10.b.u)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("body");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("commitOid");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.l(f1.e.o(this.s, "AddReviewMutation(id=", this.r, ", event=", ", body="), this.t, ", commitOid=", this.u, ")");
    }
}
