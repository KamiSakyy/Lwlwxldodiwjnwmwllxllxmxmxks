package zx;

import java.util.List;
import jo.f4Shadow;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.w0 {
    public static final e0 Companion = new e0();
    public String r;
    public aa.u0 s;

    public i0(aa.u0 u0Var, String str) {
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.g.a;
        List list2 = dy.g.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.r.equals(i0Var.r) && this.s.equals(i0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.s.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "f62789f8c8c753757fee22541d19e7e33e7659a23946425727974d17d2adad41";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequest($id: ID!, $numberNullableBug: Int) { node(id: $id) { __typename ... on PullRequest { __typename ...SubscribableFragment ...RepositoryNodeFragmentPullRequest ...PullRequestV2ItemsFragment } id } id __typename }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignedActors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignedActors(first: 25) { totalCount nodes { __typename ...actorFields } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment ReviewRequestFields on ReviewRequest { __typename id asCodeOwner requestedReviewer { __typename ...NodeIdFragment ... on User { __typename id login ...avatarFragment } ... on Team { __typename id name teamAvatar: avatarUrl } ... on Bot { __typename id login displayName ...avatarFragment isCopilot url } } }  fragment ReviewFields on PullRequestReview { __typename id authorCanPushToRepository author { __typename login ...avatarFragment ... on User { id } ... on Bot { id displayName isCopilot url } } state onBehalfOf(first: 25) { nodes { id name __typename } } body comments(first: 1) { totalCount } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment RepositoryNodeFragmentPullRequest on PullRequest { __typename url id headRefOid headRepository { id nameWithOwner __typename } baseRepository { id nameWithOwner __typename } title titleHTML createdAt viewerCanDeleteHeadRef viewerDidAuthor viewerCanChangeBaseBranch locked author { __typename login ...avatarFragment } isReadByViewer bodyHtml: bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false, renderMobileTasklistBlocks: true) number ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...AssigneeFragment pullRequestState: state changedFiles additions deletions mergeStateStatus mergedBy { __typename ...NodeIdFragment login } mergeCommit { abbreviatedOid committedDate id __typename } mergeQueue { __typename ...MergeQueueFragment id } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } reviewDecision isDraft requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } baseRef { refUpdateRule { recommendedApprovingReviewCount requiresCodeOwnerReviews viewerAllowedToDismissReviews } id __typename } baseRefName headRef { id refUpdateRule { viewerCanPush } __typename } headRefName ...LabelsFragment milestone { __typename ...MilestoneFragment id } reviewRequests(first: 25) { nodes { __typename ...ReviewRequestFields id } } latestReviews(first: 25) { nodes { __typename ...ReviewFields id } } latestOpinionatedReviews(first: 25, writersOnly: true) { nodes { __typename ...ReviewFields id } } suggestedReviewerActors(first: 10) { nodes { isAuthor isCommenter reviewer { __typename ...NodeIdFragment url ... on User { __typename id login ...avatarFragment } ... on Bot { __typename id login displayName isCopilot url ...avatarFragment } } } } actionRequiredWorkflowRunCount commits(last: 1) { __typename totalCount nodes { id commit { id committedDate statusCheckRollup { id state contexts(first: 100) { totalCount nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestNumber: $numberNullableBug) } ... on CheckRun { id conclusion name duration summary permalink checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestNumber: $numberNullableBug) } } } __typename } __typename } __typename } } ...LinkedIssues ...updatableFields ...ViewerLatestReviewRequestFragment viewerLatestReview { state submittedAt id __typename } ...AutoMergeRequestFragment viewerCanReopen viewerCanMergeAsAdmin viewerCanAssign viewerCanLabel viewerCanUpdateBranch }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }  fragment ProjectWithFieldsFragment on ProjectV2 { __typename id title updatedAt shortDescription public number viewerCanUpdate useElasticsearch url ...ProjectV2FieldConstraintsFragment }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { actors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment ProjectIssueOrPullRequestProjectFragment on ProjectV2Item { __typename project { __typename ...ProjectWithFieldsFragment id } ...ProjectV2ViewItemFragment id }  fragment PullRequestV2ItemsFragment on PullRequest { id projectItems(first: 25) { nodes { __typename ...ProjectIssueOrPullRequestProjectFragment id } } __typename }";
    }

    public final String name() {
        return "PullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("numberNullableBug");
        aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return f4.k(this.s, "PullRequestQuery(id=", this.r, ", numberNullableBug=", ")");
    }
}
