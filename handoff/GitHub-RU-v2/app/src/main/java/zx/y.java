package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.w0 {
    public static final u Companion = new u();
    public String r;

    public y(String str) {
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.e.a;
        List list2 = dy.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.r, ((y) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.m.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "efe11eb687cf9a33e34f7b829b82faa643ec36f5183e651be264c0d995d834af";
    }

    public final String j() {
        Companion.getClass();
        return "query Issue($id: ID!) { node(id: $id) { __typename ... on Issue { __typename ...SubscribableFragment ...RepositoryNodeFragmentIssue ...IssueProjectV2ItemsFragment } id } id __typename }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment updatableFields on Updatable { __typename ...NodeIdFragment viewerCanUpdate }  fragment CommentFragment on Comment { __typename id author { __typename ...actorFields } editor { __typename ...actorFields } lastEditedAt includesCreatedEdit bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false) body createdAt viewerDidAuthor authorAssociation ...updatableFields }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment OrgBlockableFragment on OrgBlockable { __typename ...NodeIdFragment viewerCanBlockFromOrg viewerCanUnblockFromOrg }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignedActors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } }  fragment labelFields on Label { __typename id name color }  fragment LabelsFragment on Labelable { __typename ... on Issue { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on Discussion { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } ... on PullRequest { id labels(first: 25) { __typename nodes { __typename ...labelFields id } } } }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment LinkedPullRequests on Issue { userLinkedOnlyClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: true, includeClosedPrs: true, first: 10) { totalCount nodes { id __typename } } allClosedByPullRequestReferences: closedByPullRequestsReferences(userLinkedOnly: false, includeClosedPrs: true, first: 10) { totalCount nodes { __typename ...LinkedPullRequestFragment id } } id __typename }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state duplicateOf { __typename ...DuplicateOfFragment id } __typename } id __typename }  fragment RepositoryNodeFragmentIssue on Issue { __typename url id title titleHTMLString: titleHTML createdAt viewerDidAuthor locked author { __typename login ...avatarFragment } isReadByViewer bodyHtml: bodyHTML(hideCodeBlobs: true, renderSuggestedChangesAsText: false, includeSuggestedChangesId: true, unfurlReferences: true, scrubVideo: false, renderMobileTasklistBlocks: true) bodyUrl number ...CommentFragment ...ReactionFragment ...OrgBlockableFragment ...AssigneeFragment issueState: state ...LabelsFragment milestone { __typename ...MilestoneFragment id } ...LinkedPullRequests ...updatableFields completeTaskListItemCount: taskListItemCount(statuses: [COMPLETE]) incompleteTaskListItemCount: taskListItemCount(statuses: [INCOMPLETE]) viewerCanReopen stateReason viewerCanAssign viewerCanLabel isPinned issueType { __typename ...IssueTypeFragment id } ...ParentIssueFragment duplicateOf { __typename ...DuplicateOfFragment id } suggestedActors(first: 10) { nodes { __typename ...NodeIdFragment ... on Bot { id isCopilot } } } }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }  fragment ProjectWithFieldsFragment on ProjectV2 { __typename id title updatedAt shortDescription public number viewerCanUpdate useElasticsearch url ...ProjectV2FieldConstraintsFragment }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { actors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment ProjectIssueOrPullRequestProjectFragment on ProjectV2Item { __typename project { __typename ...ProjectWithFieldsFragment id } ...ProjectV2ViewItemFragment id }  fragment IssueProjectV2ItemsFragment on Issue { id projectItems(first: 25) { nodes { __typename ...ProjectIssueOrPullRequestProjectFragment id } } __typename }";
    }

    public final String name() {
        return "Issue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("IssueQuery(id=", this.r, ")");
    }
}
