package rc0;

import gn0.rn;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g2 implements aa.w0 {
    public static final b2 Companion = new b2();
    public String r;
    public aa1.b s;

    public g2(String str, aa1.b bVar) {
        k71.k.g(str, "workflowId");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = dd0.j.a;
        List list2 = dd0.j.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return k71.k.b(this.r, g2Var.r) && k71.k.b(this.s, g2Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(sc0.j1.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "ceedf90e3753e38131ddf3d5bdbece6cdcc55b92183356806d367d7848a6731b";
    }

    public final String j() {
        Companion.getClass();
        return "query WorkflowRunsPage($workflowId: ID!, $first: Int!, $after: String) { node(id: $workflowId) { __typename ... on Workflow { id runs(first: $first, after: $after) { __typename ...WorkflowRunConnectionFragment } } id } }  fragment WorkflowRunFragment on WorkflowRun { id title runNumber eventType createdAt workflow { id name __typename } checkSuite { id status conclusion workflowFilePath repository { id name owner { id login } viewerPermission defaultBranchRef { id name __typename } __typename } matchingPullRequests(first: 1) { nodes { id number __typename } } duration branch { id name __typename } creator { id login __typename } __typename } __typename }  fragment WorkflowRunConnectionFragment on WorkflowRunConnection { pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...WorkflowRunFragment id } }";
    }

    public final String name() {
        return "WorkflowRunsPage";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("workflowId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f4.l(this.s, "WorkflowRunsPageQuery(workflowId=", this.r, ", first=30, after=", ")");
    }
}
