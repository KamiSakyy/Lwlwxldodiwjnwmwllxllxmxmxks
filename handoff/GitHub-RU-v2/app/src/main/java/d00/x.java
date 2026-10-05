package d00;

import aa.p0;
import aa.q0;
import aa.w0;
import com.github.rudroid.m0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements w0 {
    public static final p Companion = new p();
    public final String r;
    public final int s;

    public x(String str, int i) {
        k71.k.g(str, "projectOwnerLogin");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = h00.c.a;
        List list2 = h00.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.r, xVar.r) && this.s == xVar.s;
    }

    public final p0 g() {
        return aa.c.c(e00.l.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "85fec9a2f68607ca2b9202c9010d8afaa2fd09c85703d3f89bad82263d3c1b37";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectV2ViewInfo($projectOwnerLogin: String!, $projectNumber: Int!) { repositoryOwner(login: $projectOwnerLogin) { __typename id ...OrganizationNameAndAvatar ... on ProjectV2Owner { projectV2(number: $projectNumber) { __typename ...ProjectWithFieldsFragment defaultView { __typename id ...ProjectV2ViewFragment } views(first: 50) { nodes { __typename id ...ProjectV2ViewFragment } } id } } } id __typename }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }  fragment ProjectWithFieldsFragment on ProjectV2 { __typename id title updatedAt shortDescription public number viewerCanUpdate useElasticsearch url ...ProjectV2FieldConstraintsFragment }  fragment ProjectV2FieldCommonFragment on ProjectV2FieldCommon { dataType id }  fragment ProjectV2ViewFragment on ProjectV2View { id databaseId name layout number groupByFields(after: null, first: 25) { __typename ...ProjectV2FieldConfigurationConnectionFragment } sortByFields(after: null, first: 25) { nodes { direction field { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } } } fields(after: null, first: 25, orderBy: null) { nodes { __typename ... on ProjectV2FieldCommon { __typename ...ProjectV2FieldCommonFragment } } } __typename }";
    }

    public final String name() {
        return "FetchProjectV2ViewInfo";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("projectOwnerLogin");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("projectNumber");
        fVar.z(this.s);
    }

    public final String toString() {
        return m0.b(this.s, "FetchProjectV2ViewInfoQuery(projectOwnerLogin=", this.r, ", projectNumber=", ")");
    }
}
