package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yd implements aaShadow.w0 {
    public static final sd Companion = new sd();
    public final String r;
    public final String s;
    public final int t;
    public final aa1.b u;
    public final aa1.b v;

    public yd(String str, String str2, int i, aa.u0 u0Var, int i2) {
        int i3 = i2 & 8;
        aa.u0 u0Var2 = aa.t0.d;
        u0Var = i3 != 0 ? u0Var2 : u0Var;
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = u0Var;
        this.v = u0Var2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.h1.a;
        List list2 = fc0.h1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        return k71.k.b(this.r, ydVar.r) && k71.k.b(this.s, ydVar.s) && this.t == ydVar.t && k71.k.b(this.u, ydVar.u) && k71.k.b(this.v, ydVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.e9.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31);
    }

    public final String i() {
        return "9024fb6f0ff288ca193fece7ef8c15f946b7b1176d63ee299f68ca61a73da591";
    }

    public final String j() {
        Companion.getClass();
        return "query FilesChangedQuery($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $after: String, $includeIssueTemplateProperties: Boolean = false ) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ... on Node { id } ... on PullRequest { __typename ...FilesPullRequestFragment id } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment FileTypeFragment on File { __typename ... on ImageFileType { url } ... on PdfFileType { url } ... on MarkdownFileType { __typename } ... on TextFileType { __typename } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment ReviewThreadCommentFragment on PullRequestReviewComment { __typename id position line pullRequestReview { id __typename } thread { __typename id isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } ...MultiLineCommentFields } path state url ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment }  fragment FilesChangedReviewThreadFragment on PullRequest { id headRefOid reviewThreads(first: 50) { nodes { __typename subjectType id isResolved isOutdated viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...ReviewThreadCommentFragment id } } } } __typename }  fragment FilesPullRequestFragment on PullRequest { __typename id headRefOid viewerCanEditFiles baseRefName headRefName additions deletions headRepository { name id __typename } headRepositoryOwner { id login } repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } diff { patches(first: 50, after: $after) { pageInfo { endCursor hasNextPage } nodes { linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } lineCount fileType { __typename ...FileTypeFragment } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status id __typename } } } ...FilesChangedReviewThreadFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } files(first: 50, after: $after) { nodes { viewerViewedState path } } }";
    }

    public final String name() {
        return "FilesChangedQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FilesChangedQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number=");
        o.append(this.t);
        o.append(", after=");
        o.append(this.u);
        o.append(", includeIssueTemplateProperties=");
        return f1.e.k(o, this.v, ")");
    }
}
