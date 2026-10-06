package dl0;

import aa.w0;
import com.github.rudroid.copilot.h1;
import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements w0 {
    public static final g Companion = new g();
    public String r;
    public String s;
    public int t;
    public aa.u0 u;

    public k(String str, String str2, int i, aa.u0 u0Var) {
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = u0Var;
    }

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = fl0.b.a;
        List list2 = fl0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.r.equals(kVar.r) && this.s.equals(kVar.s) && this.t == kVar.t && this.u.equals(kVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(el0.e.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(this.t, h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "e953dca8eb2668c8b3c9546e4522285cb4e37a4031bebfe6c16adb98b81e7c84";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueOrPullRequest($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $numberNullableBug: Int) { viewer { __typename id login } repository(owner: $repositoryOwner, name: $repositoryName) { __typename ...RepositoryNodeFragment id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryNodeFragmentBase on Repository { __typename name url isInOrganization owner { __typename id login ...avatarFragment } id viewerPermission squashMergeAllowed rebaseMergeAllowed mergeCommitAllowed viewerDefaultCommitEmail viewerDefaultMergeMethod viewerPossibleCommitEmails planSupports(feature: TEAM_REVIEW_REQUESTS) allowUpdateBranch defaultBranchRef { name id __typename } }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignees(first: 25) { __typename totalCount nodes { __typename id name login ...avatarFragment } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment LinkedPullRequests on Issue { userLinkedOnlyClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: true, includeClosedPrs: true, first: 10) { totalCount nodes { id __typename } } allClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: false, includeClosedPrs: true, first: 10) { totalCount nodes { __typename ...LinkedPullRequestFragment id } } id __typename }  fragment RepositoryNodeFragmentIssue on Issue { __typename url id title titleHTMLString: titleHTML createdAt viewerDidAuthor locked author { __typename login ...avatarFragment } isReadByViewer bodyHtml: bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false, renderMobileTasklistBlocks: true) bodyUrl number ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...AssigneeFragment issueState: state ...LabelsFragment milestone { __typename ...MilestoneFragment id } projectCards(first: 25) { nodes { column { name id __typename } project { id name state __typename } id __typename } } ...LinkedPullRequests ...updatableFields completeTaskListItemCount: taskListItemCount(statuses: [COMPLETE]) incompleteTaskListItemCount: taskListItemCount(statuses: [INCOMPLETE]) viewerCanReopen stateReason viewerCanAssign viewerCanLabel isPinned }  fragment MergeQueueFragment on MergeQueue { id entries { totalCount } configuration { mergeMethod } nextEntryEstimatedTimeToMerge __typename }  fragment ViewerLatestReviewRequestFragment on PullRequest { id viewerLatestReviewRequest { id requestedBy { isViewer login avatarUrl id __typename } __typename } __typename }  fragment ViewerLatestReviewRequestStateFragment on PullRequest { __typename id viewerDidAuthor ...ViewerLatestReviewRequestFragment pendingReviews: reviews(first: 1, states: [PENDING]) { nodes { id comments(first: 1) { totalCount } __typename } } }  fragment PullRequestItemFragment on PullRequest { __typename id isDraft title titleHTMLString: titleHTML number createdAt headRepository { name id __typename } headRepositoryOwner { id login } isReadByViewer totalCommentsCount ...LabelsFragment pullRequestState: state repository { id name viewerSubscription viewerSubscriptionTypes owner { id login } __typename } url viewerSubscription reviewDecision assignees(first: 25) { totalCount nodes { __typename ...actorFields id } } commits(last: 1) { nodes { id commit { id statusCheckRollup { id state __typename } __typename } __typename } } closingIssuesReferences { totalCount } isInMergeQueue mergeQueueEntry { id position __typename } mergeQueue { __typename ...MergeQueueFragment id } ...ViewerLatestReviewRequestStateFragment }  fragment MergeQueueEntryFragment on MergeQueueEntry { id enqueuer { __typename ...actorFields } estimatedTimeToMerge jump solo position pullRequest { __typename ...PullRequestItemFragment id } __typename }  fragment ReviewRequestFields on ReviewRequest { __typename id asCodeOwner requestedReviewer { __typename ...NodeIdFragment ... on User { __typename id login ...avatarFragment } ... on Team { __typename id name teamAvatar: avatarUrl } } }  fragment ReviewFields on PullRequestReview { __typename id authorCanPushToRepository author { __typename login ...avatarFragment ... on User { id } } state onBehalfOf(first: 25) { nodes { id name __typename } } body comments(first: 1) { totalCount } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }  fragment AutoMergeRequestFragment on PullRequest { id viewerCanDisableAutoMerge viewerCanEnableAutoMerge autoMergeRequest { mergeMethod } __typename }  fragment RepositoryNodeFragmentPullRequest on PullRequest { __typename url id headRefOid headRepository { id nameWithOwner __typename } baseRepository { id nameWithOwner __typename } title titleHTML createdAt viewerCanDeleteHeadRef viewerDidAuthor viewerCanChangeBaseBranch locked author { __typename login ...avatarFragment } isReadByViewer bodyHtml: bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false, renderMobileTasklistBlocks: true) number ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...AssigneeFragment pullRequestState: state changedFiles additions deletions mergeStateStatus mergedBy { __typename ...NodeIdFragment login } mergeCommit { abbreviatedOid committedDate id __typename } mergeQueue { __typename ...MergeQueueFragment id } mergeQueueEntry { __typename ...MergeQueueEntryFragment id } reviewDecision isDraft requiredStatusChecks(first: 25) { totalCount nodes { id context state description __typename } } baseRef { refUpdateRule { recommendedApprovingReviewCount requiresCodeOwnerReviews viewerAllowedToDismissReviews } id __typename } baseRefName headRef { id refUpdateRule { viewerCanPush } __typename } headRefName ...LabelsFragment milestone { __typename ...MilestoneFragment id } projectCards(first: 25) { nodes { column { name id __typename } project { id name state __typename } id __typename } } reviewRequests(first: 25) { nodes { __typename ...ReviewRequestFields id } } latestReviews(first: 25) { nodes { __typename ...ReviewFields id } } latestOpinionatedReviews(first: 25, writersOnly: true) { nodes { __typename ...ReviewFields id } } suggestedReviewers { isAuthor isCommenter reviewer { __typename ... on User { __typename id login ...avatarFragment } id } } actionRequiredWorkflowRunCount commits(last: 1) { __typename totalCount nodes { id commit { id committedDate statusCheckRollup { id state contexts(first: 100) { totalCount nodes { __typename ... on StatusContext { id context state avatarUrl description targetUrl isRequired(pullRequestNumber: $numberNullableBug) } ... on CheckRun { id conclusion name duration summary permalink checkSuite { workflowRun { workflow { name id __typename } id __typename } app { logoUrl id __typename } id __typename } isRequired(pullRequestNumber: $numberNullableBug) } } } __typename } __typename } __typename } } ...LinkedIssues ...updatableFields ...ViewerLatestReviewRequestFragment viewerLatestReview { state submittedAt id __typename } ...AutoMergeRequestFragment viewerCanReopen viewerCanMergeAsAdmin viewerCanAssign viewerCanLabel viewerCanUpdateBranch }  fragment RepositoryNodeFragment on Repository { __typename id ...RepositoryNodeFragmentBase ...SubscribableFragment issueOrPullRequest(number: $number) { __typename ... on Issue { __typename ...SubscribableFragment ...RepositoryNodeFragmentIssue id } ... on PullRequest { __typename ...SubscribableFragment ...RepositoryNodeFragmentPullRequest id } } }";
    }

    public final String name() {
        return "IssueOrPullRequest";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        Integer valueOf = Integer.valueOf(this.t);
        nn.a aVar = od0.b.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("numberNullableBug");
        aa.c.d(aa.c.b(aVar)).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueOrPullRequestQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number=");
        o.append(this.t);
        o.append(", numberNullableBug=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
