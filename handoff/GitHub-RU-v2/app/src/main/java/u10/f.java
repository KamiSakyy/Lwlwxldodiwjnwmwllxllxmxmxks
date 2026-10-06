package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aaShadow.n0 {
    public static final c Companion = new c();
    public String r;
    public String s;

    public f(String str, String str2) {
        k71.k.g(str, "subject_id");
        k71.k.g(str2, "body");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.a.a;
        List list2 = fc0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.r, fVar.r) && k71.k.b(this.s, fVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.c.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "ced87a8dd9cb0cd9b3044518196f6227d5be14ef05380620f9f1d0e4e892e386";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddComment($subject_id: ID!, $body: String!) { addComment(input: { subjectId: $subject_id body: $body } ) { commentEdge { node { __typename ...issueCommentFields id } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment deletableFields on Deletable { __typename ...NodeIdFragment viewerCanDelete }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment issueCommentFields on IssueComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...deletableFields ...MinimizableCommentFragment url id }";
    }

    public final String name() {
        return "AddComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("AddCommentMutation(subject_id=", this.r, ", body=", this.s, ")");
    }
}
