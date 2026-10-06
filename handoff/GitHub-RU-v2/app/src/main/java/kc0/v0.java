package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements aaShadow.n0 {
    public static final q0 Companion = new q0();
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final aa.u0 v;
    public final aa1.b w;
    public final aa1.b x;
    public final gn0.dn y;

    public v0(String str, String str2, int i, String str3, aa.u0 u0Var, aa1.b bVar, aa1.b bVar2, gn0.dn dnVar) {
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
        this.v = u0Var;
        this.w = bVar;
        this.x = bVar2;
        this.y = dnVar;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.h.a;
        List list2 = en0.h.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.r.equals(v0Var.r) && this.s.equals(v0Var.s) && this.t == v0Var.t && this.u.equals(v0Var.u) && this.v.equals(v0Var.v) && this.w.equals(v0Var.w) && this.x.equals(v0Var.x) && this.y == v0Var.y;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.c0.a, false);
    }

    public final int hashCode() {
        return this.y.hashCode() + f1.e.a(this.x, f1.e.a(this.w, jo.f4.a(this.v, com.github.rudroid.copilot.h1.i(a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), this.u, 31), 31), 31), 31);
    }

    public final String i() {
        return "eb8cc498c7d06bbd4783d690111959d6f67e4c59d9e2a69be8abeffb179b9cf2";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReviewComment($pullId: ID!, $body: String!, $endLine: Int!, $path: String!, $endSide: DiffSide, $startLine: Int, $startSide: DiffSide, $subjectType: PullRequestReviewThreadSubjectType!) { addPullRequestReviewThread(input: { pullRequestId: $pullId body: $body line: $endLine path: $path side: $endSide startLine: $startLine startSide: $startSide subjectType: $subjectType } ) { thread { subjectType pullRequest { __typename id headRefOid ...ViewerLatestReviewRequestStateFragment ...FilesChangedReviewThreadFragment } comments(last: 1) { nodes { __typename ...ReviewThreadCommentFragment id } } id __typename } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }  fragment FilesChangedReviewThreadFragment on PullRequest { id headRefOid reviewThreads(first: 50) { nodes { __typename subjectType id isResolved isOutdated viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...ReviewThreadCommentFragment id } } } } __typename }";
    }

    public final String name() {
        return "AddReviewComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        hn0.a aVar = hn0.a.m;
        fVar.z0("pullId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("endLine");
        Integer valueOf = Integer.valueOf(this.t);
        nn.a aVar2 = od0.b.a;
        aVar2.b(fVar, wVar, valueOf);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("endSide");
        aa.c.d(aa.c.b(aVar)).d(fVar, wVar, this.v);
        aa.u0 u0Var = this.w;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("startLine");
            aa.c.d(aa.c.b(aVar2)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.x;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("startSide");
            aa.c.d(aa.c.b(aVar)).d(fVar, wVar, u0Var2);
        }
        fVar.z0("subjectType");
        fVar.I(this.y.r);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("AddReviewCommentMutation(pullId=", this.r, ", body=", this.s, ", endLine=");
        x.i.r(this.t, ", path=", this.u, ", endSide=", o);
        o.append(this.v);
        o.append(", startLine=");
        o.append(this.w);
        o.append(", startSide=");
        o.append(this.x);
        o.append(", subjectType=");
        o.append(this.y);
        o.append(")");
        return o.toString();
    }
}
