package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l80 implements aa.n0 {
    public static final d80 Companion = new d80();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;
    public final aa1.b w;
    public final aa1.b x;

    public l80(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5, aa1.b bVar6) {
        k71.k.g(str, "id");
        k71.k.g(bVar, "state");
        k71.k.g(bVar2, "assigneeIds");
        k71.k.g(bVar3, "body");
        k71.k.g(bVar4, "labelIds");
        k71.k.g(bVar5, "projectIds");
        k71.k.g(bVar6, "milestoneId");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
        this.v = bVar4;
        this.w = bVar5;
        this.x = bVar6;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.w5.a;
        List list2 = en0.w5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return k71.k.b(this.r, l80Var.r) && k71.k.b(this.s, l80Var.s) && k71.k.b(this.t, l80Var.t) && k71.k.b(this.u, l80Var.u) && k71.k.b(this.v, l80Var.v) && k71.k.b(this.w, l80Var.w) && k71.k.b(this.x, l80Var.x);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ku.a, false);
    }

    public final int hashCode() {
        return this.x.hashCode() + f1.e.a(this.w, f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String i() {
        return "839f14dfea18c6351c4a01971072dfb6b7a9b41e4aae8bd363f1199b36ed0589";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePullRequest($id: ID!, $state: PullRequestUpdateState, $assigneeIds: [ID!], $body: String, $labelIds: [ID!], $projectIds: [ID!], $milestoneId: ID) { updatePullRequest(input: { pullRequestId: $id state: $state assigneeIds: $assigneeIds body: $body labelIds: $labelIds projectIds: $projectIds milestoneId: $milestoneId } ) { actor { __typename ...NodeIdFragment login } pullRequest { __typename id url state ...AssigneeFragment ...LabelsFragment ...CommentFragment milestone { __typename ...MilestoneFragment id } projectCards(first: 25) { nodes { column { name id __typename } project { id name state __typename } id __typename } } viewerCanDeleteHeadRef viewerCanReopen } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignees(first: 25) { __typename totalCount nodes { __typename id name login ...avatarFragment } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }";
    }

    public final String name() {
        return "UpdatePullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("state");
            aa.c.d(aa.c.b(hn0.b.d)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            jo.f4.e(fVar, "assigneeIds", bVar).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("body");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aa.u0) {
            jo.f4.e(fVar, "labelIds", bVar).d(fVar, wVar, u0Var4);
        }
        aa.u0 u0Var5 = this.w;
        if (u0Var5 instanceof aa.u0) {
            jo.f4.e(fVar, "projectIds", bVar).d(fVar, wVar, u0Var5);
        }
        aa.u0 u0Var6 = this.x;
        if (u0Var6 instanceof aa.u0) {
            fVar.z0("milestoneId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var6);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "UpdatePullRequestMutation(id=", this.r, ", state=", ", assigneeIds=");
        f1.e.w(o, this.t, ", body=", this.u, ", labelIds=");
        f1.e.w(o, this.v, ", projectIds=", this.w, ", milestoneId=");
        return f1.e.k(o, this.x, ")");
    }
}
