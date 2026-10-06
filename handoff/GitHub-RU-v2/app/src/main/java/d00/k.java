package d00;

import aa.p0;
import aa.q0;
import aa.w0;
import com.github.rudroid.m0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements w0 {
    public static final a Companion = new a();
    public String r;
    public int s;

    public k(String str, int i) {
        k71.k.g(str, "projectOwnerLogin");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = h00.a.a;
        List list2 = h00.a.a;
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
        return k71.k.b(this.r, kVar.r) && this.s == kVar.s;
    }

    public final p0 g() {
        return aa.c.c(e00.a.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "352472a74f38b456cb030c5f473482f0f2fdb0cd8c26639a4d9fd1c0d2d3312f";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchProjectV2BoardInfo($projectOwnerLogin: String!, $projectNumber: Int!) { repositoryOwner(login: $projectOwnerLogin) { __typename id ... on ProjectV2Owner { projectV2(number: $projectNumber) { __typename id fields(first: 50) { nodes { __typename ...ProjectV2FieldCommonFragment } } defaultView { __typename id ...ProjectV2ViewFragment } views(first: 50) { nodes { __typename ...ProjectV2ViewFragment id } } ...ProjectV2FieldConstraintsFragment } } } id __typename }  fragment ProjectV2FieldCommonFragment on ProjectV2FieldCommon { dataType id }  fragment ProjectV2FieldFragment on ProjectV2Field { id databaseId name dataType __typename }  fragment SingleSelectOptionFragment on ProjectV2SingleSelectFieldOption { id name nameHTML }  fragment ProjectV2SingleSelectFieldFragment on ProjectV2SingleSelectField { id databaseId name dataType options { __typename ...SingleSelectOptionFragment } __typename }  fragment ProjectV2IterationFragment on ProjectV2IterationFieldIteration { id title titleHTML duration startDate }  fragment ProjectV2IterationFieldFragment on ProjectV2IterationField { id databaseId name dataType configuration { duration completedIterations { __typename ...ProjectV2IterationFragment } iterations { __typename ...ProjectV2IterationFragment } } __typename }  fragment ProjectV2FieldConfigurationConnectionFragment on ProjectV2FieldConfigurationConnection { nodes { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } }  fragment ProjectV2ViewFragment on ProjectV2View { id databaseId name layout number groupByFields(after: null, first: 25) { __typename ...ProjectV2FieldConfigurationConnectionFragment } sortByFields(after: null, first: 25) { nodes { direction field { __typename ...ProjectV2FieldFragment ...ProjectV2SingleSelectFieldFragment ...ProjectV2IterationFieldFragment } } } fields(after: null, first: 25, orderBy: null) { nodes { __typename ... on ProjectV2FieldCommon { __typename ...ProjectV2FieldCommonFragment } } } __typename }  fragment ProjectV2FieldConstraintsFragment on ProjectV2 { fields(first: 50) { __typename ...ProjectV2FieldConfigurationConnectionFragment } id __typename }";
    }

    public final String name() {
        return "FetchProjectV2BoardInfo";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("projectOwnerLogin");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("projectNumber");
        fVar.z(this.s);
    }

    public final String toString() {
        return m0.b(this.s, "FetchProjectV2BoardInfoQuery(projectOwnerLogin=", this.r, ", projectNumber=", ")");
    }

}
