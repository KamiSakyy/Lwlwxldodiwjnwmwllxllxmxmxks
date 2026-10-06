package b20;

import hc0.pm;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 implements aa.w0 {
    public static final h2 Companion = new h2();
    public String r;
    public aa1.b s;

    public m2(String str) {
        k71.k.g(str, "workflowId");
        this.r = str;
        this.s = aa.t0.d;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = n20.k.a;
        List list2 = n20.k.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.r, m2Var.r) && this.s.equals(m2Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(c20.n1.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + a0.s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "27c1597049d8c059317f4550eecc6e9fdcc2ee91dd5dee44ee632cb4b8c39f7c";
    }

    public final String j() {
        Companion.getClass();
        return "query WorkflowRuns($workflowId: ID!, $first: Int!, $after: String) { node(id: $workflowId) { __typename ... on Workflow { id name url state runs(first: $first, after: $after) { __typename ...WorkflowRunConnectionFragment totalCount } } id } }  fragment WorkflowRunFragment on WorkflowRun { id title runNumber eventType createdAt workflow { id name __typename } checkSuite { id status conclusion workflowFilePath repository { id name owner { id login } viewerPermission defaultBranchRef { id name __typename } __typename } matchingPullRequests(first: 1) { nodes { id number __typename } } duration branch { id name __typename } creator { id login __typename } __typename } __typename }  fragment WorkflowRunConnectionFragment on WorkflowRunConnection { pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...WorkflowRunFragment id } }";
    }

    public final String name() {
        return "WorkflowRuns";
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
        return f4.l(this.s, "WorkflowRunsQuery(workflowId=", this.r, ", first=30, after=", ")");
    }
}
