package vz;

import aa.p0;
import aa.q0;
import aa.u0;
import aa.w0;
import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements w0 {
    public static final u Companion = new u();
    public String r;
    public u0 s;
    public aa1.b t;

    public b0(u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "viewId");
        this.r = str;
        this.s = u0Var;
        this.t = bVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = zz.d.a;
        List list2 = zz.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.r, b0Var.r) && this.s.equals(b0Var.s) && this.t.equals(b0Var.t);
    }

    public final p0 g() {
        return aa.c.c(wz.o.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "23dfb7bf48ce205ef9277cc1670cf618cca41a640708cad6e84c48a1f0e42930";
    }

    public final String j() {
        Companion.getClass();
        return "query RefreshBoardGroupIds($viewId: ID!, $first: Int, $after: String) { node(id: $viewId) { __typename id ... on ProjectV2View { id groups(first: $first, after: $after) { totalCount pageInfo { hasNextPage endCursor } nodes { __typename ...ProjectV2GroupDataFragment viewGroupId } } } } id __typename }  fragment ProjectV2GroupValueFragment on ProjectV2GroupValue { __typename ... on ProjectV2GroupAssigneeValue { logins } ... on ProjectV2GroupDateValue { date } ... on ProjectV2GroupIterationValue { iterationId } ... on ProjectV2GroupMilestoneValue { title } ... on ProjectV2GroupNumberValue { number } ... on ProjectV2GroupRepositoryValue { nameWithOwner } ... on ProjectV2GroupSingleSelectValue { optionId } ... on ProjectV2GroupTextValue { text } }  fragment ProjectV2GroupDataFragment on ProjectV2Group { viewGroupId title field { __typename ... on ProjectV2Field { id } ... on ProjectV2SingleSelectField { id } ... on ProjectV2IterationField { id } } value { __typename ...ProjectV2GroupValueFragment } __typename }";
    }

    public final String name() {
        return "RefreshBoardGroupIds";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("viewId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, this.s);
        u0 u0Var = this.t;
        if (u0Var instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(f4.t(this.s, "RefreshBoardGroupIdsQuery(viewId=", this.r, ", first=", ", after="), this.t, ")");
    }
}
