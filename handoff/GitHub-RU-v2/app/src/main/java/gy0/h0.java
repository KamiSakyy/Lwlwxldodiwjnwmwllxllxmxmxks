package gy0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 implements w0 {
    public static final y Companion = new y();
    public final String r;
    public final String s;

    public h0(String str, String str2) {
        k71.k.g(str, "fullDatabaseId");
        k71.k.g(str2, "selectedViewId");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = ky0.d.a;
        List list2 = ky0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.r, h0Var.r) && k71.k.b(this.s, h0Var.s);
    }

    public final p0 g() {
        return aa.c.c(hy0.s.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "de6e3baad73ddb0de95c3dd1b3faf84cab488cae5447b6f475b5294acfd132e0";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectViewItem($fullDatabaseId: BigInt!, $selectedViewId: ID!) { node(id: $selectedViewId) { __typename ... on ProjectV2View { groups(first: 1, withItemDatabaseIds: [$fullDatabaseId]) { nodes { items(first: 1) { nodes { __typename ...ProjectV2ItemSortValuesFragment item { __typename ...ProjectV2BoardItemFragment id } } } viewGroupId __typename } } } id } id __typename }  fragment ProjectV2ItemSortValuesFragment on ProjectV2ViewItem { sortValues { type value } }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { users(first: 25) { __typename totalCount nodes { __typename ...actorFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state __typename } id __typename }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment ProjectV2ContentIssue on Issue { __typename id title number url locked issueState: state updatedAt totalCommentsCount stateReason completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) viewerCanReopen viewerCanUpdate viewerDidAuthor createdAt viewerCanAssign viewerCanLabel ...SubIssueProgressFragment ...ParentIssueFragment issueType { __typename ...IssueTypeFragment id } repository { __typename ...NodeIdFragment name owner { __typename ...NodeIdFragment login } id } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }  fragment ProjectV2ContentPullRequest on PullRequest { __typename id title number url locked pullRequestState: state isDraft isInMergeQueue updatedAt createdAt totalCommentsCount completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) baseRefName headRefName viewerCanReopen viewerCanUpdate viewerDidAuthor ...LinkedIssues viewerCanAssign viewerCanLabel }  fragment ProjectV2ContentDraft on DraftIssue { __typename id title updatedAt createdAt }  fragment ProjectV2BoardItemFragment on ProjectV2Item { __typename id ...ProjectV2ViewItemFragment content { __typename ... on Issue { __typename ...ProjectV2ContentIssue id } ... on PullRequest { __typename ...ProjectV2ContentPullRequest id } ... on DraftIssue { __typename ...ProjectV2ContentDraft id } } }";
    }

    public final String name() {
        return "FetchProjectViewItem";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("fullDatabaseId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("selectedViewId");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("FetchProjectViewItemQuery(fullDatabaseId=", this.r, ", selectedViewId=", this.s, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }
}
