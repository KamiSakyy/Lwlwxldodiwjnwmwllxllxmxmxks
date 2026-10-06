package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ld0 implements aaShadow.n0 {
    public static final gd0 Companion = new gd0();
    public String r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;
    public aa1.b v;

    public ld0(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
        this.v = bVar4;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.n6.a;
        List list2 = h10.n6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld0)) {
            return false;
        }
        ld0 ld0Var = (ld0) obj;
        return k71.k.b(this.r, ld0Var.r) && k71.k.b(this.s, ld0Var.s) && k71.k.b(this.t, ld0Var.t) && k71.k.b(this.u, ld0Var.u) && k71.k.b(this.v, ld0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.fy.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "0ab8b8e0e0381ccb47e422d2ef8689aa52abfd226b5d09563660db59de0dff3c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssue($id: ID!, $state: IssueState, $assigneeIds: [ID!], $body: String, $milestoneId: ID) { updateIssue(input: { id: $id state: $state assigneeIds: $assigneeIds body: $body milestoneId: $milestoneId } ) { actor { __typename ...NodeIdFragment login } issue { __typename id url state bodyHtml: bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false, renderMobileTasklistBlocks: true) ...AssigneeFragment ...LabelsFragment ...CommentFragment milestone { __typename ...MilestoneFragment id } viewerCanReopen } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignedActors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }";
    }

    public final String name() {
        return "UpdateIssue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("state");
            aa.c.d(aa.c.b(n10.b.g)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aaShadow.u0) {
            f4.e(fVar, "assigneeIds", bVar).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("body");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aaShadow.u0) {
            fVar.z0("milestoneId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var4);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "UpdateIssueMutation(id=", this.r, ", state=", ", assigneeIds=");
        f1.e.w(o, this.t, ", body=", this.u, ", milestoneId=");
        return f1.e.k(o, this.v, ")");
    }
}
