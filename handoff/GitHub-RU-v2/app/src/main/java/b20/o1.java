package b20;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.w0 {
    public static final i1 Companion = new i1();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;

    public o1(String str, aa.u0 u0Var, aa1.b bVar, aa.u0 u0Var2) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = aa.t0.d;
        this.u = bVar;
        this.v = u0Var2;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = n20.g.a;
        List list2 = n20.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.r, o1Var.r) && k71.k.b(this.s, o1Var.s) && k71.k.b(this.t, o1Var.t) && k71.k.b(this.u, o1Var.u) && k71.k.b(this.v, o1Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(c20.x0.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "a46eadad672d3cf23fc7de0f3e81deca5e74613ca77465bc8b25c908682e4cc2";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckSuiteSummary($id: ID!, $first: Int, $afterCheckRuns: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename id ... on CheckSuite { __typename id creator { __typename ...actorFields id } ...CheckSuiteFragment workflowRun { __typename id ...CheckSuiteWorkflowRunFragment } app { id name logoUrl __typename } } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckSuiteFragment on CheckSuite { id status conclusion url duration event artifacts { totalCount } repository { id name owner { __typename ...actorFields } viewerPermission __typename } push { pusher { __typename ...actorFields } id __typename } branch { id name __typename } commit { id abbreviatedOid associatedPullRequests(first: 1) { nodes { id title __typename } } __typename } rerunnable app { id name logoUrl __typename } checkRuns: checkRuns(first: $first, after: $afterCheckRuns) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...WorkFlowCheckRunFragment id } } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } __typename }  fragment CheckSuiteWorkflowRunFragment on WorkflowRun { id billableDurationInSeconds runNumber createdAt updatedAt resourcePath eventType url workflow { createdAt id name __typename } __typename }";
    }

    public final String name() {
        return "CheckSuiteSummary";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("afterCheckRuns");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("afterCheckRuns");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("pullRequestId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("pullRequestId");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aa.u0) {
            fVar.z0("checkRequired");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var4);
        } else if (z) {
            fVar.z0("checkRequired");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "CheckSuiteSummaryQuery(id=", this.r, ", first=", ", afterCheckRuns=");
        f1.e.w(o, this.t, ", pullRequestId=", this.u, ", checkRequired=");
        return f1.e.k(o, this.v, ")");
    }
}
