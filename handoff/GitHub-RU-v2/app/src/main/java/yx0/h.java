package yx0;

import aa.p0;
import aa.q0;
import aa.t0;
import aa.u0;
import aa.w0;
import java.util.List;
import jo.f4;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements w0 {
    public static final a Companion = new a();
    public final String r;
    public final u0 s;
    public final aa1.b t;
    public final aa1.b u;

    public /* synthetic */ h(u0 u0Var, aa1.b bVar, String str) {
        this(str, u0Var, t0.d, bVar);
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = cy0.a.a;
        List list2 = cy0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.r, hVar.r) && k71.k.b(this.s, hVar.s) && k71.k.b(this.t, hVar.t) && k71.k.b(this.u, hVar.u);
    }

    public final p0 g() {
        return aa.c.c(zx0.a.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, f4.a(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "05b7512f1e4e6f0dbcc0224168e8e2ec51bf6bad26a8bbf875b440980eef8c51";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectV2BoardPaged($viewId: ID!, $first: Int, $after: String = null , $query: String) { node(id: $viewId) { __typename id ... on ProjectV2View { id groups(first: $first, after: $after, query: $query) { totalCount pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...ProjectV2GroupRootFragment viewGroupId } } } } id __typename }  fragment ProjectV2GroupValueFragment on ProjectV2GroupValue { __typename ... on ProjectV2GroupAssigneeValue { logins } ... on ProjectV2GroupDateValue { date } ... on ProjectV2GroupIterationValue { iterationId } ... on ProjectV2GroupMilestoneValue { title } ... on ProjectV2GroupNumberValue { number } ... on ProjectV2GroupRepositoryValue { nameWithOwner } ... on ProjectV2GroupSingleSelectValue { optionId } ... on ProjectV2GroupTextValue { text } }  fragment ProjectV2GroupDataFragment on ProjectV2Group { viewGroupId title field { __typename ... on ProjectV2Field { id } ... on ProjectV2SingleSelectField { id } ... on ProjectV2IterationField { id } } value { __typename ...ProjectV2GroupValueFragment } __typename }  fragment ProjectV2ItemSortValuesFragment on ProjectV2ViewItem { sortValues { type value } }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { users(first: 25) { __typename totalCount nodes { __typename ...actorFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state __typename } id __typename }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment ProjectV2ContentIssue on Issue { __typename id title number url locked issueState: state updatedAt totalCommentsCount stateReason completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) viewerCanReopen viewerCanUpdate viewerDidAuthor createdAt viewerCanAssign viewerCanLabel ...SubIssueProgressFragment ...ParentIssueFragment issueType { __typename ...IssueTypeFragment id } repository { __typename ...NodeIdFragment name owner { __typename ...NodeIdFragment login } id } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }  fragment ProjectV2ContentPullRequest on PullRequest { __typename id title number url locked pullRequestState: state isDraft isInMergeQueue updatedAt createdAt totalCommentsCount completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) baseRefName headRefName viewerCanReopen viewerCanUpdate viewerDidAuthor ...LinkedIssues viewerCanAssign viewerCanLabel }  fragment ProjectV2ContentDraft on DraftIssue { __typename id title updatedAt createdAt }  fragment ProjectV2BoardItemFragment on ProjectV2Item { __typename id ...ProjectV2ViewItemFragment content { __typename ... on Issue { __typename ...ProjectV2ContentIssue id } ... on PullRequest { __typename ...ProjectV2ContentPullRequest id } ... on DraftIssue { __typename ...ProjectV2ContentDraft id } } }  fragment ProjectV2GroupItemsFragment on ProjectV2ViewItemConnection { totalCount pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...ProjectV2ItemSortValuesFragment item { __typename ...ProjectV2BoardItemFragment id } } }  fragment ProjectV2GroupRootFragment on ProjectV2Group { __typename viewGroupId ...ProjectV2GroupDataFragment items(first: 20, after: null) { __typename ...ProjectV2GroupItemsFragment } }";
    }

    public final String name() {
        return "FetchProjectV2BoardPaged";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("viewId");
        aa.c.a.b(fVar, wVar, this.r);
        u0 u0Var = this.s;
        if (u0Var != null) {
            fVar.z0("first");
            aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, u0Var);
        }
        u0 u0Var2 = this.t;
        if (u0Var2 instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("after");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        u0 u0Var3 = this.u;
        if (u0Var3 instanceof u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.l(f4.t(this.s, "FetchProjectV2BoardPagedQuery(viewId=", this.r, ", first=", ", after="), this.t, ", query=", this.u, ")");
    }

    public h(String str, u0 u0Var, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "viewId");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
        this.u = bVar2;
    }
}
