package lo0;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import java.util.List;
import pz0.su;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements w0 {
    public static final a Companion = new a();
    public String r;

    public j(String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = no0.a.a;
        List list2 = no0.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.r, ((j) obj).r);
    }

    public final p0 g() {
        return aa.c.c(mo0.b.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "05be84e5208b15358b557721cb478f51063775716ad0ded48e2a16f7a6821fb0";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchDraftIssue($nodeId: ID!) { node(id: $nodeId) { __typename id ... on DraftIssue { id bodyHTML title updatedAt creator { __typename ...actorFields } projectsV2(first: 1) { nodes { __typename ...ProjectWithFieldsFragment id } } projectV2Items(first: 1) { nodes { __typename ...ProjectV2ViewItemFragment id } } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }  fragment ProjectWithFieldsFragment on ProjectV2 { __typename id title updatedAt shortDescription public number viewerCanUpdate useElasticsearch url ...ProjectV2FieldConstraintsFragment }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { users(first: 25) { __typename totalCount nodes { __typename ...actorFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }";
    }

    public final String name() {
        return "FetchDraftIssue";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FetchDraftIssueQuery(nodeId=", this.r, ")");
    }
}
