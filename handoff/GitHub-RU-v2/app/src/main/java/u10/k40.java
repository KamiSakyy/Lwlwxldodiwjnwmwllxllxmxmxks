package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k40 implements aaShadow.n0 {
    public static final g40 Companion = new g40();
    public String r;
    public String s;

    public k40(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.i5.a;
        List list2 = fc0.i5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return k71.k.b(this.r, k40Var.r) && k71.k.b(this.s, k40Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.or.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5f94d2832b87fbe421d9e0e638abb948ec5e7594d6161497220a917a93531c20";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssueComment($id: ID!, $body: String!) { updateIssueComment(input: { id: $id body: $body } ) { issueComment { __typename id url ...CommentFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }";
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
