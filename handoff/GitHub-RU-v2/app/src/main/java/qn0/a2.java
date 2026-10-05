package qn0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements aa.w0 {
    public static final u1 Companion = new u1();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;
    public final aa1.b w;

    public a2(String str, aa.u0 u0Var, aa1.b bVar, aa.u0 u0Var2) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        aa.t0 t0Var = aa.t0.d;
        this.t = t0Var;
        this.u = t0Var;
        this.v = bVar;
        this.w = u0Var2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = co0.i.a;
        List list2 = co0.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.r, a2Var.r) && k71.k.b(this.s, a2Var.s) && k71.k.b(this.t, a2Var.t) && k71.k.b(this.u, a2Var.u) && k71.k.b(this.v, a2Var.v) && k71.k.b(this.w, a2Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(rn0.f1.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "e6b5650e7465766fb8308ea469e93dfce80b7f610280fb566a9b53d73d2daa34";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitChecksSummary($id: ID!, $first: Int, $afterCheckSuites: String = null , $afterCheckRuns: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename ... on Commit { __typename id status { state contexts { __typename ...StatusContextFragment id } id __typename } ...CommitCheckSuitesFragment } id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment StatusContextFragment on StatusContext { id context avatarUrl targetUrl commit { id repository { id name owner { id login } __typename } __typename } description creator { __typename ...NodeIdFragment login } state isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckSuiteFragment on CheckSuite { id status conclusion url duration event artifacts { totalCount } repository { id name owner { __typename ...actorFields } viewerPermission __typename } push { pusher { __typename ...actorFields } id __typename } branch { id name __typename } commit { id abbreviatedOid associatedPullRequests(first: 1) { nodes { id title __typename } } __typename } rerunnable app { id name logoUrl __typename } checkRuns: checkRuns(first: $first, after: $afterCheckRuns) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...WorkFlowCheckRunFragment id } } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } __typename }  fragment CommitCheckSuitesFragment on Commit { id checkSuites(first: $first, after: $afterCheckSuites) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...CheckSuiteFragment workflowRun { id workflow { id name __typename } __typename } app { id name logoUrl __typename } id } } __typename }";
    }

    public final String name() {
        return "CommitChecksSummary";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("afterCheckSuites");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("afterCheckSuites");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("afterCheckRuns");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("afterCheckRuns");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aa.u0) {
            fVar.z0("pullRequestId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var4);
        } else if (z) {
            fVar.z0("pullRequestId");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var5 = this.w;
        if (u0Var5 instanceof aa.u0) {
            fVar.z0("checkRequired");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var5);
        } else if (z) {
            fVar.z0("checkRequired");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "CommitChecksSummaryQuery(id=", this.r, ", first=", ", afterCheckSuites=");
        f1.e.w(o, this.t, ", afterCheckRuns=", this.u, ", pullRequestId=");
        return f1.e.l(o, this.v, ", checkRequired=", this.w, ")");
    }
}
