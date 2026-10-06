package qo;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.w0 {
    public static final v0 Companion = new v0();
    public String r;
    public aa1.b s;
    public aa.u0 t;

    public g1(aa.u0 u0Var, aa1.b bVar, String str) {
        this.r = str;
        this.s = bVar;
        this.t = u0Var;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.f.a;
        List list2 = cp.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.r.equals(g1Var.r) && this.s.equals(g1Var.s) && this.t.equals(g1Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.l0.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "e93c98ed96f4954e36470cc2b9132a13dc13e6988b4b9d4712f0193293db990d";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckSuiteMetaData($id: ID!, $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename id ... on CheckSuite { id status conclusion duration rerunnable artifacts { totalCount } workflowRun { __typename id ...CheckSuiteWorkflowRunFragment } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } } } id __typename }  fragment CheckSuiteWorkflowRunFragment on WorkflowRun { id billableDurationInSeconds runNumber createdAt updatedAt resourcePath eventType url workflow { createdAt id name __typename } __typename }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }";
    }

    public final String name() {
        return "CheckSuiteMetaData";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("pullRequestId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("pullRequestId");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        fVar.z0("checkRequired");
        aa.c.d(aa.c.k).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(f1.e.o(this.s, "CheckSuiteMetaDataQuery(id=", this.r, ", pullRequestId=", ", checkRequired="), this.t, ")");
    }
}
