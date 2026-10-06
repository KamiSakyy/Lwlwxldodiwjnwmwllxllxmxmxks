package zx;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.w0 {
    public static final l Companion = new l();
    public String r;

    public o(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = dy.c.a;
        List list2 = dy.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.r, ((o) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ay.h.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "1878f6c5859d4e6a0143df49cbe65382bf06773d3087d612197583ef7b6bb9e7";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueOrPullRequestProjectItems($id: ID!) { node(id: $id) { __typename id ...PullRequestV2ItemsFragment ...IssueProjectV2ItemsFragment } id __typename }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }  fragment ProjectWithFieldsFragment on ProjectV2 { __typename id title updatedAt shortDescription public number viewerCanUpdate useElasticsearch url ...ProjectV2FieldConstraintsFragment }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { actors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }  fragment ProjectIssueOrPullRequestProjectFragment on ProjectV2Item { __typename project { __typename ...ProjectWithFieldsFragment id } ...ProjectV2ViewItemFragment id }  fragment PullRequestV2ItemsFragment on PullRequest { id projectItems(first: 25) { nodes { __typename ...ProjectIssueOrPullRequestProjectFragment id } } __typename }  fragment IssueProjectV2ItemsFragment on Issue { id projectItems(first: 25) { nodes { __typename ...ProjectIssueOrPullRequestProjectFragment id } } __typename }";
    }

    public final String name() {
        return "IssueOrPullRequestProjectItems";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("IssueOrPullRequestProjectItemsQuery(id=", this.r, ")");
    }
}
