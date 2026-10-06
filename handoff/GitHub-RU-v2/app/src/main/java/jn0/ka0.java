package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ka0 implements aaShadow.n0 {
    public static final ga0 Companion = new ga0();
    public final String r;
    public final String s;

    public ka0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.c6.a;
        List list2 = kz0.c6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return k71.k.b(this.r, ka0Var.r) && k71.k.b(this.s, ka0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.bw.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b55a851f8f753e706b4ca889ade4bba741fa74c3c7fe1b0ec11b413d780b236f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssueComment($id: ID!, $body: String!) { updateIssueComment(input: { id: $id body: $body } ) { issueComment { __typename id url ...CommentFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }";
    }

    public final String name() {
        return "UpdateIssueComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdateIssueCommentMutation(id=", this.r, ", body=", this.s, ")");
    }
}
