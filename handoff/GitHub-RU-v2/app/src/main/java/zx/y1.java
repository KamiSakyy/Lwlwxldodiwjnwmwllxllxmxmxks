package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 implements aa.w0 {
    public static final s1 Companion = new s1();
    public String r;
    public String s;
    public int t;
    public aa1.b u;
    public aa1.b v;
    public aa1.b w;
    public aa1.b x;
    public aa1.b y;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(String str, String str2, int i, aa1.b bVar, aa.u0 u0Var, aa1.b bVar2, aa.u0 u0Var2, aa.u0 u0Var3, int i2) {
        int i3 = i2 & 8;
        aa1.b bVar3 = aa.t0.d;
        bVar = i3 != 0 ? bVar3 : bVar;
        aa1.b bVar4 = (i2 & 16) != 0 ? bVar3 : u0Var;
        bVar2 = (i2 & 32) != 0 ? bVar3 : bVar2;
        aa1.b bVar5 = (i2 & 64) != 0 ? bVar3 : u0Var2;
        aa1.b bVar6 = (i2 & 128) != 0 ? bVar3 : u0Var3;
        this.r = str;
        this.s = str2;
        this.t = i;
        this.u = bVar;
        this.v = bVar4;
        this.w = bVar2;
        this.x = bVar5;
        this.y = bVar6;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.k.a;
        List list2 = dy.k.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return k71.k.b(this.r, y1Var.r) && k71.k.b(this.s, y1Var.s) && this.t == y1Var.t && k71.k.b(this.u, y1Var.u) && k71.k.b(this.v, y1Var.v) && k71.k.b(this.w, y1Var.w) && k71.k.b(this.x, y1Var.x) && k71.k.b(this.y, y1Var.y);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.y0.a, false);
    }

    public final int hashCode() {
        return this.y.hashCode() + f1.e.a(this.x, f1.e.a(this.w, f1.e.a(this.v, f1.e.a(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31), 31), 31), 31), 31);
    }

    public final String i() {
        return "2c0bf4c50027ba51df9b7d08320844ad2042d7275ef24c7978201b718047f569";
    }

    public final String j() {
        Companion.getClass();
        return "query TimelinePagination($repositoryOwner: String!, $repositoryName: String!, $number: Int!, $before: String, $desiredBeforeCount: Int, $after: String, $desiredAfterCount: Int, $focusId: ID) { repository(owner: $repositoryOwner, name: $repositoryName) { id issueOrPullRequest(number: $number) { __typename ... on Issue { __typename ...issueTimelineFragment id } ... on PullRequest { __typename ...pullRequestTimelineFragment id } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment deletableFields on Deletable { __typename ...NodeIdFragment viewerCanDelete }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }  fragment issueCommentFields on IssueComment { __typename ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...deletableFields ...MinimizableCommentFragment url id }  fragment renamedTitleFields on RenamedTitleEvent { __typename id actor { __typename ...actorFields } previousTitle currentTitle createdAt }  fragment assignedFields on AssignedEvent { __typename id actor { __typename ...actorFields } assignee { __typename ...actorFields } createdAt }  fragment unassignedFields on UnassignedEvent { __typename id actor { __typename ...actorFields } assignee { __typename ...actorFields } createdAt }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment closedEventFields on ClosedEvent { __typename id stateReason actor { __typename ...actorFields } closable { __typename ...NodeIdFragment ... on RepositoryNode { repository { id __typename } } } closer { __typename ...NodeIdFragment ... on Commit { abbreviatedOid id messageHeadline author { __typename avatarUrl } repository { id name owner { id login } __typename } } ... on PullRequest { number title state repository { id name isPrivate owner { id login } __typename } isInMergeQueue isDraft id } } duplicateOf { __typename ...NodeIdFragment ...DuplicateOfFragment } createdAt }  fragment reopenedEventFields on ReopenedEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment labelFields on Label { __typename id name color }  fragment labeledEventFields on LabeledEvent { __typename id actor { __typename ...actorFields } label { __typename ...labelFields id } createdAt }  fragment unlabeledEventFields on UnlabeledEvent { __typename id actor { __typename ...actorFields } label { __typename ...labelFields id } createdAt }  fragment lockedEventFields on LockedEvent { __typename id actor { __typename ...actorFields } lockReason createdAt }  fragment unlockedEventFields on UnlockedEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment milestonedEventFields on MilestonedEvent { __typename id actor { __typename ...actorFields } milestoneTitle createdAt }  fragment demilestonedEventFields on DemilestonedEvent { __typename id actor { __typename ...actorFields } milestoneTitle createdAt }  fragment crossReferencedEventFields on CrossReferencedEvent { __typename id actor { __typename ...actorFields } isCrossRepository source { __typename ... on Issue { __typename number title issueState: state repository { __typename id name owner { __typename ...actorFields } isPrivate } duplicateOf { __typename ...NodeIdFragment ...DuplicateOfFragment id } stateReason id } ... on PullRequest { __typename number title pullRequestState: state repository { __typename id name owner { __typename ...actorFields } isPrivate } isInMergeQueue isDraft id } } createdAt }  fragment referencedEventFields on ReferencedEvent { __typename id isCrossRepository actor { __typename ...actorFields } commitRepository { __typename id name owner { __typename ...actorFields } isPrivate } commit { __typename id status { __typename state id } messageHeadline } createdAt }  fragment pinnedEventFields on PinnedEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment unpinnedEventFields on UnpinnedEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment commentDeletedEventFields on CommentDeletedEvent { __typename id actor { __typename ...actorFields } deletedCommentAuthor { __typename ...actorFields } createdAt }  fragment transferredEventFields on TransferredEvent { __typename id actor { __typename ...actorFields } createdAt fromRepository { __typename nameWithOwner id } }  fragment crossReferencedEventRepositoryFields on RepositoryNode { __typename ...NodeIdFragment repository { __typename id name owner { __typename ...actorFields } isPrivate } }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment markedAsDuplicateEventFields on MarkedAsDuplicateEvent { __typename id actor { __typename ...actorFields } createdAt isCrossRepository canonical { __typename ...crossReferencedEventRepositoryFields ... on Issue { __typename id number title issueState: state stateReason repository { owner { id login } name isPrivate id __typename } issueType { __typename ...IssueTypeFragment id } } ... on PullRequest { __typename id number title pullRequestState: state isInMergeQueue isDraft } } duplicate { __typename ...NodeIdFragment ... on Issue { duplicateOf { __typename ...DuplicateOfFragment id } id } } }  fragment userBlockedEventFields on UserBlockedEvent { __typename id actor { __typename ...actorFields } userSubject: subject { __typename ...actorFields id } blockDuration createdAt }  fragment convertedToDiscussionEventFields on ConvertedToDiscussionEvent { __typename id actor { __typename ...actorFields } discussion { number title repository { owner { id login } name id __typename } id __typename } createdAt }  fragment connectedEventFields on ConnectedEvent { __typename id actor { __typename ...actorFields } subject { __typename ... on Issue { issueState: state title url number stateReason id } ... on PullRequest { pullRequestState: state isDraft title url number isInMergeQueue id } } createdAt }  fragment disconnectedEventFields on DisconnectedEvent { __typename id actor { __typename ...actorFields } subject { __typename ... on Issue { issueState: state title url number stateReason id } ... on PullRequest { pullRequestState: state isDraft title url number isInMergeQueue id } } createdAt }  fragment subIssueAddedEventFields on SubIssueAddedEvent { __typename id actor { __typename ...actorFields } subIssue { __typename ... on Issue { issueState: state title url number stateReason } id } createdAt }  fragment subIssueRemovedEventFields on SubIssueRemovedEvent { __typename id actor { __typename ...actorFields } subIssue { __typename ... on Issue { issueState: state title url number stateReason } id } createdAt }  fragment issueTimelineFragment on Issue { __typename id timelineItems(before: $before, after: $after, first: $desiredAfterCount, last: $desiredBeforeCount, focus: $focusId, itemTypes: [ISSUE_COMMENT,RENAMED_TITLE_EVENT,ASSIGNED_EVENT,UNASSIGNED_EVENT,CLOSED_EVENT,REOPENED_EVENT,LABELED_EVENT,UNLABELED_EVENT,LOCKED_EVENT,UNLOCKED_EVENT,MILESTONED_EVENT,DEMILESTONED_EVENT,CROSS_REFERENCED_EVENT,REFERENCED_EVENT,PINNED_EVENT,UNPINNED_EVENT,COMMENT_DELETED_EVENT,TRANSFERRED_EVENT,MARKED_AS_DUPLICATE_EVENT,USER_BLOCKED_EVENT,CONVERTED_TO_DISCUSSION_EVENT,CONNECTED_EVENT,DISCONNECTED_EVENT,SUB_ISSUE_ADDED_EVENT,SUB_ISSUE_REMOVED_EVENT]) { __typename beforeFocusCount pageInfo { hasPreviousPage startCursor hasNextPage endCursor } nodes { __typename ...NodeIdFragment ...issueCommentFields ...renamedTitleFields ...assignedFields ...unassignedFields ...closedEventFields ...reopenedEventFields ...labeledEventFields ...unlabeledEventFields ...lockedEventFields ...unlockedEventFields ...milestonedEventFields ...demilestonedEventFields ...crossReferencedEventFields ...referencedEventFields ...pinnedEventFields ...unpinnedEventFields ...commentDeletedEventFields ...transferredEventFields ...markedAsDuplicateEventFields ...userBlockedEventFields ...convertedToDiscussionEventFields ...connectedEventFields ...disconnectedEventFields ...subIssueAddedEventFields ...subIssueRemovedEventFields } } }  fragment mergedEventFields on MergedEvent { __typename id actor { __typename ...actorFields } mergeRefName commit { __typename abbreviatedOid id } createdAt }  fragment pullRequestCommitFields on PullRequestCommit { __typename id pullRequestCommit: commit { __typename id status { __typename state id } messageHeadline author { __typename avatarUrl } committedDate } }  fragment headRefDeletedEventFields on HeadRefDeletedEvent { __typename id actor { __typename ...actorFields } headRefName createdAt }  fragment headRefRestoredEventFields on HeadRefRestoredEvent { __typename id actor { __typename ...actorFields } pullRequest { headRefName id __typename } createdAt }  fragment teamFields on Team { __typename name organization { __typename name id } id }  fragment reviewRequestedEventFields on ReviewRequestedEvent { __typename id actor { __typename ...actorFields } requestedReviewer { __typename ...actorFields ...teamFields } createdAt }  fragment reviewRequestRemovedEventFields on ReviewRequestRemovedEvent { __typename id actor { __typename ...actorFields } requestedReviewer { __typename ...actorFields ...teamFields } createdAt }  fragment reviewDismissedEventFields on ReviewDismissedEvent { __typename id actor { __typename ...actorFields } dismissalMessageHTML review { __typename author { __typename ...actorFields } includesCreatedEdit id } createdAt url }  fragment pullRequestReviewFields on PullRequestReview { __typename id submittedAt ...CommentFragment ...ReactionFragment ...OrgBlockableFragment authorCanPushToRepository url state comments { __typename totalCount } createdAt pullRequest { id __typename } }  fragment readyForReviewEventFields on ReadyForReviewEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment convertToDraftEventFields on ConvertToDraftEvent { __typename id actor { __typename ...actorFields } createdAt }  fragment deployedEventFields on DeployedEvent { __typename id actor { __typename ...actorFields } deployment { __typename state environment latestStatus { __typename state environmentUrl id } id } createdAt }  fragment forcePushEventFields on HeadRefForcePushedEvent { __typename id actor { __typename ...actorFields } createdAt pullRequest { __typename headRefName id } beforeCommit { __typename abbreviatedOid id } afterCommit { __typename abbreviatedOid id } }  fragment baseRefChangedEventFields on BaseRefChangedEvent { __typename id actor { __typename ...actorFields } createdAt currentRefName previousRefName }  fragment deployEnvChangedEventFields on DeploymentEnvironmentChangedEvent { __typename id actor { __typename ...actorFields } createdAt deploymentStatus { __typename state environmentUrl deployment { __typename state environment id } id } pullRequest { __typename id } }  fragment autoMergeEnabledEventFields on AutoMergeEnabledEvent { id actor { __typename ...actorFields } createdAt __typename }  fragment autoSquashEnabledEventFields on AutoSquashEnabledEvent { id actor { __typename ...actorFields } createdAt __typename }  fragment autoRebaseEnabledEventFields on AutoRebaseEnabledEvent { id actor { __typename ...actorFields } createdAt __typename }  fragment autoMergeDisabledEventFields on AutoMergeDisabledEvent { id actor { __typename ...actorFields } createdAt reasonCode __typename }  fragment addedToMergeQueueEventFields on AddedToMergeQueueEvent { createdAt enqueuer { login id __typename } id __typename }  fragment removedFromMergeQueueFields on RemovedFromMergeQueueEvent { createdAt enqueuer { login id __typename } reason id __typename }  fragment automaticBaseChangedEventFields on AutomaticBaseChangeSucceededEvent { __typename id createdAt oldBase newBase }  fragment copilotWorkStartedFields on CopilotWorkStartedEvent { __typename id actor { __typename ...actorFields } agent { displayName id __typename } createdAt sessionId }  fragment copilotWorkFinishedFields on CopilotWorkFinishedEvent { __typename id actor { __typename ...actorFields } agent { displayName id __typename } createdAt sessionId }  fragment copilotWorkFinishedFailureFields on CopilotWorkFinishedFailureEvent { __typename id actor { __typename ...actorFields } agent { displayName id __typename } createdAt failureMessage }  fragment pullRequestTimelineFragment on PullRequest { __typename id timelineItems(before: $before, after: $after, first: $desiredAfterCount, last: $desiredBeforeCount, focus: $focusId, itemTypes: [ISSUE_COMMENT,RENAMED_TITLE_EVENT,ASSIGNED_EVENT,UNASSIGNED_EVENT,CLOSED_EVENT,REOPENED_EVENT,LABELED_EVENT,UNLABELED_EVENT,LOCKED_EVENT,UNLOCKED_EVENT,MILESTONED_EVENT,DEMILESTONED_EVENT,CROSS_REFERENCED_EVENT,REFERENCED_EVENT,MERGED_EVENT,PULL_REQUEST_COMMIT,HEAD_REF_DELETED_EVENT,REVIEW_REQUESTED_EVENT,REVIEW_REQUEST_REMOVED_EVENT,REVIEW_DISMISSED_EVENT,PULL_REQUEST_REVIEW,READY_FOR_REVIEW_EVENT,CONVERT_TO_DRAFT_EVENT,COMMENT_DELETED_EVENT,DEPLOYED_EVENT,HEAD_REF_FORCE_PUSHED_EVENT,HEAD_REF_RESTORED_EVENT,BASE_REF_CHANGED_EVENT,MARKED_AS_DUPLICATE_EVENT,DEPLOYMENT_ENVIRONMENT_CHANGED_EVENT,AUTO_MERGE_DISABLED_EVENT,AUTO_MERGE_ENABLED_EVENT,AUTO_REBASE_ENABLED_EVENT,AUTO_SQUASH_ENABLED_EVENT,USER_BLOCKED_EVENT,ADDED_TO_MERGE_QUEUE_EVENT,REMOVED_FROM_MERGE_QUEUE_EVENT,CONNECTED_EVENT,DISCONNECTED_EVENT,AUTOMATIC_BASE_CHANGE_SUCCEEDED_EVENT,COPILOT_WORK_STARTED_EVENT,COPILOT_WORK_FINISHED_EVENT,COPILOT_WORK_FINISHED_FAILURE_EVENT]) { __typename beforeFocusCount pageInfo { hasPreviousPage startCursor hasNextPage endCursor } nodes { __typename ...NodeIdFragment ...issueCommentFields ...renamedTitleFields ...assignedFields ...unassignedFields ...closedEventFields ...reopenedEventFields ...labeledEventFields ...unlabeledEventFields ...lockedEventFields ...unlockedEventFields ...milestonedEventFields ...demilestonedEventFields ...crossReferencedEventFields ...referencedEventFields ...mergedEventFields ...pullRequestCommitFields ...headRefDeletedEventFields ...headRefRestoredEventFields ...reviewRequestedEventFields ...reviewRequestRemovedEventFields ...reviewDismissedEventFields ...pullRequestReviewFields ...readyForReviewEventFields ...convertToDraftEventFields ...deployedEventFields ...commentDeletedEventFields ...forcePushEventFields ...transferredEventFields ...baseRefChangedEventFields ...markedAsDuplicateEventFields ...deployEnvChangedEventFields ...autoMergeEnabledEventFields ...autoSquashEnabledEventFields ...autoRebaseEnabledEventFields ...autoMergeDisabledEventFields ...userBlockedEventFields ...addedToMergeQueueEventFields ...removedFromMergeQueueFields ...connectedEventFields ...disconnectedEventFields ...automaticBaseChangedEventFields ...copilotWorkStartedFields ...copilotWorkFinishedFields ...copilotWorkFinishedFailureFields } } }";
    }

    public final String name() {
        return "TimelinePagination";
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
        nn.a aVar = tp.a.a;
        aVar.b(fVar, wVar, valueOf);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aa.u0) {
            fVar.z0("before");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.v;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("desiredBeforeCount");
            aa.c.d(aa.c.b(aVar)).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.w;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        aa.u0 u0Var4 = this.x;
        if (u0Var4 instanceof aa.u0) {
            fVar.z0("desiredAfterCount");
            aa.c.d(aa.c.b(aVar)).d(fVar, wVar, u0Var4);
        }
        aa.u0 u0Var5 = this.y;
        if (u0Var5 instanceof aa.u0) {
            fVar.z0("focusId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var5);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelinePaginationQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", number=");
        o.append(this.t);
        o.append(", before=");
        o.append(this.u);
        o.append(", desiredBeforeCount=");
        f1.e.w(o, this.v, ", after=", this.w, ", desiredAfterCount=");
        return f1.e.l(o, this.x, ", focusId=", this.y, ")");
    }
}
