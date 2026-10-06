package vz;

import a0.s0;
import aa.o0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w0;
import java.util.List;
import jo.f4Shadow;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements w0 {
    public static final i Companion = new i();
    public String r;
    public u0 s;
    public int t;
    public aa1.b u;
    public aa1.b v;

    public o(String str, u0 u0Var, int i, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "viewId");
        this.r = str;
        this.s = u0Var;
        this.t = i;
        this.u = bVar;
        this.v = bVar2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = zz.b.a;
        List list2 = zz.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.r, oVar.r) && this.s.equals(oVar.s) && this.t == oVar.t && this.u.equals(oVar.u) && this.v.equals(oVar.v);
    }

    public final p0 g() {
        return aa.c.c(wz.g.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, s0.b(this.t, f4Shadow.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "c62ebc58e77d00a8990f327f05a38e88fb21494590e73cb4b7ee5bb5f9752429";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectV2GroupPage($viewId: ID!, $groupId: String, $first: Int!, $after: String = null , $query: String) { node(id: $viewId) { __typename id ... on ProjectV2View { id group(viewGroupId: $groupId, query: $query) { viewGroupId items(first: $first, after: $after) { __typename ...ProjectV2GroupItemsFragment } __typename } } } id __typename }  fragment ProjectV2ItemSortValuesFragment on ProjectV2ViewItem { sortValues { type value } }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { actors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment SubIssueProgressFragment on Issue { id subIssuesSummary { total completed } __typename }  fragment DuplicateOfFragment on Issue { id title repository { owner { id login } name isPrivate id __typename } number state stateReason __typename }  fragment ParentIssueFragment on Issue { parent { id title titleHTML number repository { id name owner { id login } __typename } stateReason state duplicateOf { __typename ...DuplicateOfFragment id } __typename } id __typename }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }  fragment ProjectV2ContentIssue on Issue { __typename id title number url locked issueState: state updatedAt totalCommentsCount stateReason completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) viewerCanReopen viewerCanUpdate viewerDidAuthor createdAt viewerCanAssign viewerCanLabel ...SubIssueProgressFragment ...ParentIssueFragment issueType { __typename ...IssueTypeFragment id } repository { __typename ...NodeIdFragment name owner { __typename ...NodeIdFragment login } id } duplicateOf { __typename ...DuplicateOfFragment id } }  fragment LinkedIssueFragment on Issue { id issueState: state title url number repository { id name owner { id login } __typename } stateReason __typename }  fragment LinkedIssues on PullRequest { id userLinkedOnlyClosingIssueReferences: closingIssuesReferences(userLinkedOnly: true, first: 10) { nodes { id __typename } } allClosingIssueReferences: closingIssuesReferences(userLinkedOnly: false, first: 10) { nodes { __typename ...LinkedIssueFragment id } } __typename }  fragment ProjectV2ContentPullRequest on PullRequest { __typename id title number url locked pullRequestState: state isDraft isInMergeQueue updatedAt createdAt totalCommentsCount completedTasksCount: taskListItemCount(statuses: [COMPLETE]) totalTaskCount: taskListItemCount(statuses: [COMPLETE,INCOMPLETE]) baseRefName headRefName viewerCanReopen viewerCanUpdate viewerDidAuthor ...LinkedIssues viewerCanAssign viewerCanLabel }  fragment ProjectV2ContentDraft on DraftIssue { __typename id title updatedAt createdAt }  fragment ProjectV2BoardItemFragment on ProjectV2Item { __typename id ...ProjectV2ViewItemFragment content { __typename ... on Issue { __typename ...ProjectV2ContentIssue id } ... on PullRequest { __typename ...ProjectV2ContentPullRequest id } ... on DraftIssue { __typename ...ProjectV2ContentDraft id } } }  fragment ProjectV2GroupItemsFragment on ProjectV2ViewItemConnection { totalCount pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...ProjectV2ItemSortValuesFragment item { __typename ...ProjectV2BoardItemFragment id } } }";
    }

    public final String name() {
        return "FetchProjectV2GroupPage";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("viewId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("groupId");
        o0 o0Var = aa.c.i;
        f4Shadow.y(o0Var, fVar, wVar, this.s, "first");
        fVar.z(this.t);
        u0 u0Var = this.u;
        if (u0Var instanceof u0) {
            fVar.z0("after");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("after");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        u0 u0Var2 = this.v;
        if (u0Var2 instanceof u0) {
            fVar.z0("query");
            aa.c.d(o0Var).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        StringBuilder t = f4Shadow.t(this.s, "FetchProjectV2GroupPageQuery(viewId=", this.r, ", groupId=", ", first=");
        t.append(this.t);
        t.append(", after=");
        t.append(this.u);
        t.append(", query=");
        return f1.e.k(t, this.v, ")");
    }
}
