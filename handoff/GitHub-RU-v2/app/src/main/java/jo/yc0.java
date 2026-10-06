package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yc0 implements aaShadow.n0 {
    public static final uc0 Companion = new uc0();
    public final String r;
    public final String s;

    public yc0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.l6.a;
        List list2 = h10.l6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0)) {
            return false;
        }
        yc0 yc0Var = (yc0) obj;
        return k71.k.b(this.r, yc0Var.r) && k71.k.b(this.s, yc0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.wx.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "0b0590986b1c8dbd384ec8f128e6faa0bc0e427d13c9dac88beed51d3959d0bf";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssueComment($id: ID!, $body: String!) { updateIssueComment(input: { id: $id body: $body } ) { issueComment { __typename id url ...CommentFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }";
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
