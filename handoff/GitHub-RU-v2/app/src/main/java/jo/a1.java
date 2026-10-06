package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements aaShadow.n0 {
    public static final v0 Companion = new v0();
    public final aa1.b A;
    public final aa1.b B;
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final aa1.b v;
    public final aa1.b w;
    public final aa1.b x;
    public final m10.xz y;
    public final aa1.b z;

    public a1(String str, String str2, int i, String str3, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, m10.xz xzVar, aa1.b bVar4, aa1.b bVar5, aa1.b bVar6) {
        k71.k.g(bVar4, "linePositioning");
        k71.k.g(bVar5, "multilinePositioning");
        k71.k.g(bVar6, "filePositioning");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = str3;
        this.v = bVar;
        this.w = bVar2;
        this.x = bVar3;
        this.y = xzVar;
        this.z = bVar4;
        this.A = bVar5;
        this.B = bVar6;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.i.a;
        List list2 = h10.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.r, a1Var.r) && k71.k.b(this.s, a1Var.s) && this.t == a1Var.t && k71.k.b(this.u, a1Var.u) && k71.k.b(this.v, a1Var.v) && k71.k.b(this.w, a1Var.w) && k71.k.b(this.x, a1Var.x) && this.y == a1Var.y && k71.k.b(this.z, a1Var.z) && k71.k.b(this.A, a1Var.A) && k71.k.b(this.B, a1Var.B);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.f0.a, false);
    }

    public final int hashCode() {
        return this.B.hashCode() + f1.e.a(this.A, f1.e.a(this.z, (this.y.hashCode() + f1.e.a(this.x, f1.e.a(this.w, f1.e.a(this.v, com.github.rudroid.copilot.h1.i(a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), this.u, 31), 31), 31), 31)) * 31, 31), 31);
    }

    public final String i() {
        return "6261adb8685ada4a1850c2801d2b0dc4e407f7134d8e39d4e49d9824705e57cd";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReviewComment($pullId: ID!, $body: String!, $endLine: Int!, $path: String!, $endSide: DiffSide, $startLine: Int, $startSide: DiffSide, $subjectType: PullRequestReviewThreadSubjectType!, $linePositioning: CommentPositionLineInput, $multilinePositioning: CommentPositionMultilineInput, $filePositioning: CommentPositionFileInput) { addPullRequestReviewThread(input: { pullRequestId: $pullId body: $body line: $endLine path: $path side: $endSide startLine: $startLine startSide: $startSide subjectType: $subjectType linePositioning: $linePositioning multilinePositioning: $multilinePositioning filePositioning: $filePositioning } ) { thread { subjectType pullRequest { __typename id headRefOid ...ViewerLatestReviewRequestStateFragment ...FilesChangedReviewThreadFragment } comments(last: 1) { nodes { __typename ...ReviewThreadCommentFragment id } } id __typename } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment CommentPositionFragment on CommentPosition { __typename ... on FileComment { __typename baseCommitOid headCommitOid commitOid } ... on LineComment { __typename baseCommitOid headCommitOid commitOid line } ... on MultilineComment { __typename baseCommitOid headCommitOid endCommitOid startCommitOid startLine endLine } ... on IndeterminateComment { __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position startLine line pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve positioning { __typename ...CommentPositionFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }  fragment FilesChangedReviewThreadFragment on PullRequest { id headRefOid reviewThreads(first: 50) { nodes { __typename subjectType id isResolved isOutdated viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...ReviewThreadCommentFragment id } } } } __typename }";
    }

    public final String name() {
        return "AddReviewComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        n10.a aVar = n10.a.z;
        fVar.z0("pullId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("body");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("endLine");
        int i = this.t;
        nn.a aVar2 = tp.a.a;
        f1.e.A(i, aVar2, fVar, wVar, "path");
        bVar.b(fVar, wVar, this.u);
        aa.u0 u0Var = this.v;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("endSide");
            aa.c.d(aa.c.b(aVar)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.w;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("startLine");
            aa.c.d(aa.c.b(aVar2)).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.x;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("startSide");
            aa.c.d(aa.c.b(aVar)).d(fVar, wVar, u0Var3);
        }
        fVar.z0("subjectType");
        m10.xz xzVar = this.y;
        k71.k.g(xzVar, "value");
        fVar.I(xzVar.r);
        aa.u0 u0Var4 = this.z;
        if (u0Var4 instanceof aaShadow.u0) {
            fVar.z0("linePositioning");
            aa.c.d(aa.c.b(aa.c.c(n10.a.f, false))).d(fVar, wVar, u0Var4);
        }
        aa.u0 u0Var5 = this.A;
        if (u0Var5 instanceof aaShadow.u0) {
            fVar.z0("multilinePositioning");
            aa.c.d(aa.c.b(aa.c.c(n10.a.g, false))).d(fVar, wVar, u0Var5);
        }
        aa.u0 u0Var6 = this.B;
        if (u0Var6 instanceof aaShadow.u0) {
            fVar.z0("filePositioning");
            aa.c.d(aa.c.b(aa.c.c(n10.a.e, false))).d(fVar, wVar, u0Var6);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("AddReviewCommentMutation(pullId=", this.r, ", body=", this.s, ", endLine=");
        x.i.r(this.t, ", path=", this.u, ", endSide=", o);
        f1.e.w(o, this.v, ", startLine=", this.w, ", startSide=");
        o.append(this.x);
        o.append(", subjectType=");
        o.append(this.y);
        o.append(", linePositioning=");
        f1.e.w(o, this.z, ", multilinePositioning=", this.A, ", filePositioning=");
        return f1.e.k(o, this.B, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a1(String str, String str2, int i, String str3, m10.xz xzVar, aa1.b bVar, aa1.b bVar2, aa.u0 u0Var, int i2) {
        this(str, str2, i, str3, r7, r7, r7, xzVar, r1 != 0 ? r7 : bVar, (i2 & 512) != 0 ? r7 : bVar2, (i2 & 1024) != 0 ? r7 : u0Var);
        int i3 = i2 & 256;
        aa1.b bVar3 = aa.t0.d;
    }
}
