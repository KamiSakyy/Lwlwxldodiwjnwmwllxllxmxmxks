package ux0;

import java.util.List;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.n0 {
    public static final g Companion = new g();
    public String r;
    public String s;
    public String t;

    public j(String str, String str2, String str3) {
        k71.k.g(str, "projectId");
        k71.k.g(str2, "itemId");
        k71.k.g(str3, "fieldId");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ey0.b.a;
        List list2 = ey0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.r, jVar.r) && k71.k.b(this.s, jVar.s) && k71.k.b(this.t, jVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(vx0.e.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "1d4a31293779a8821b2852ea9fdd48865b229565368c8d2b3e8918b472141744";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ClearProjectV2ItemFieldValue($projectId: ID!, $itemId: ID!, $fieldId: ID!) { clearProjectV2ItemFieldValue(input: { projectId: $projectId itemId: $itemId fieldId: $fieldId } ) { projectV2Item { __typename ...ProjectV2ViewItemFragment id } } }  fragment NodeIdFragment on Node { id __typename }  fragment labelFields on Label { __typename id name color }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment LinkedPullRequestFragment on PullRequest { id pullRequestState: state title url number isDraft repository { id name owner { id login } __typename } isInMergeQueue __typename }  fragment ProjectV2FieldValuesFragment on ProjectV2Item { fieldValues(first: 50) { nodes { __typename ...NodeIdFragment ... on ProjectV2ItemFieldDateValue { id date field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldNumberValue { id number field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id name } } } } ... on ProjectV2ItemFieldTextValue { id text field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id dataType name } } } } ... on ProjectV2ItemFieldIterationValue { id iterationId title titleHTML duration startDate field { __typename ...NodeIdFragment ... on ProjectV2IterationField { id name } } } ... on ProjectV2ItemFieldSingleSelectValue { id name nameHTML optionId field { __typename ...NodeIdFragment ... on ProjectV2SingleSelectField { id name } } } ... on ProjectV2ItemFieldLabelValue { labels(first: 25) { __typename nodes { __typename ...labelFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldMilestoneValue { milestone { __typename ...MilestoneFragment id } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldUserValue { users(first: 25) { __typename totalCount nodes { __typename ...actorFields id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldRepositoryValue { repository { __typename id name owner { __typename id login ...avatarFragment } viewerPermission } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldPullRequestValue { pullRequests(first: 20) { nodes { __typename ...LinkedPullRequestFragment id } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } ... on ProjectV2ItemFieldReviewerValue { reviewers(first: 25) { __typename totalCount nodes { __typename ... on User { id login userAvatar: avatarUrl } ... on Team { id name teamAvatar: avatarUrl } ... on Mannequin { id login mannequinAvatar: avatarUrl } ... on Bot { id login botAvatar: avatarUrl } } } field { __typename ...NodeIdFragment ... on ProjectV2FieldConfiguration { __typename ... on ProjectV2FieldCommon { id } } } } } } id __typename }  fragment ProjectV2ViewItemFragment on ProjectV2Item { __typename id fullDatabaseId updatedAt isArchived type ...ProjectV2FieldValuesFragment }";
    }

    public final String name() {
        return "ClearProjectV2ItemFieldValue";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("projectId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("itemId");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("fieldId");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("ClearProjectV2ItemFieldValueMutation(projectId=", this.r, ", itemId=", this.s, ", fieldId="), this.t, ")");
    }
}
