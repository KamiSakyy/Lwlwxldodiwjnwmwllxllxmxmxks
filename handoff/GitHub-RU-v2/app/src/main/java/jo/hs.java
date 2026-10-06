package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hs implements aaShadow.w0 {
    public static final rr Companion = new rr();
    public String r;
    public aa1.b s;

    public hs(String str) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = aa.t0.d;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.l3.a;
        List list2 = h10.l3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return k71.k.b(this.r, hsVar.r) && k71.k.b(this.s, hsVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.ti.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "071f5f56d08fc1d79548263a4922ad3df263cb6a8e3af315eb2c770c181bcfac";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestReview($id: ID!, $includeIssueTemplateProperties: Boolean = false ) { node(id: $id) { __typename ... on PullRequestReview { __typename id state url authorCanPushToRepository submittedAt ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment pullRequest { id headRefOid __typename } author { __typename ...actorFields } repository { __typename ...RepositoryListItemFragment ...IssueTemplateFragment id } threadsAndReplies(first: 50) { nodes { __typename ... on PullRequestReviewThread { __typename id path subjectType isResolved viewerCanResolve viewerCanUnresolve resolvedBy { login id __typename } viewerCanReply diffLines(injectCommentContexts: true) { __typename ...DiffLineFragment } ...MultiLineCommentFields comments(first: 50) { nodes { __typename ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment url state id } } } ... on PullRequestReviewComment { __typename id path subjectType thread { __typename isResolved resolvedBy { login id __typename } viewerCanResolve viewerCanUnresolve viewerCanReply diffLines(injectCommentContexts: true) { __typename ...DiffLineFragment } ...MultiLineCommentFields id } ...CommentFragment ...ReactionFragment ...UpdatableFragment ...OrgBlockableFragment ...MinimizableCommentFragment url state } } } } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment UpdatableFragment on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }  fragment labelFields on Label { __typename id name color }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment IssueTemplateFragment on Repository { issueTemplates { name about title body filename assignees(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename id name login ...avatarFragment } } labels(first: 30) @include(if: $includeIssueTemplateProperties) { nodes { __typename ...labelFields id } } type { __typename ...IssueTypeFragment id } } contactLinks { name about url } issueFormLinks { about name url } isBlankIssuesEnabled isSecurityPolicyEnabled securityPolicyUrl id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment MultiLineCommentFields on PullRequestReviewThread { startLine endLine: line startLineType endLineType id __typename }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }";
    }

    public final String name() {
        return "PullRequestReview";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("includeIssueTemplateProperties");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f4.l(this.s, "PullRequestReviewQuery(id=", this.r, ", includeIssueTemplateProperties=", ")");
    }
}
