package b20;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 implements aa.w0 {
    public static final p0 Companion = new p0();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;

    public t0(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4) {
        k71.k.g(str, "id");
        k71.k.g(bVar, "first");
        k71.k.g(bVar2, "afterCheckRuns");
        k71.k.g(bVar3, "pullRequestId");
        k71.k.g(bVar4, "checkRequired");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
        this.u = bVar3;
        this.v = bVar4;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = n20.e.a;
        List list2 = n20.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.r, t0Var.r) && k71.k.b(this.s, t0Var.s) && k71.k.b(this.t, t0Var.t) && k71.k.b(this.u, t0Var.u) && k71.k.b(this.v, t0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(c20.h0.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "c3f779558085ed8b2605be4c81b94f1910ad4be5057891df1932be1fdb33f44b";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckSuiteCheckRunsPage($id: ID!, $first: Int, $afterCheckRuns: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename id ... on CheckSuite { __typename id ...CheckSuiteFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckSuiteFragment on CheckSuite { id status conclusion url duration event artifacts { totalCount } repository { id name owner { __typename ...actorFields } viewerPermission __typename } push { pusher { __typename ...actorFields } id __typename } branch { id name __typename } commit { id abbreviatedOid associatedPullRequests(first: 1) { nodes { id title __typename } } __typename } rerunnable app { id name logoUrl __typename } checkRuns: checkRuns(first: $first, after: $afterCheckRuns) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...WorkFlowCheckRunFragment id } } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } __typename }";
    }

    public final String name() {
        return "CheckSuiteCheckRunsPage";
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
        StringBuilder o = f1.e.o(this.s, "CheckSuiteCheckRunsPageQuery(id=", this.r, ", first=", ", afterCheckRuns=");
        f1.e.w(o, this.t, ", pullRequestId=", this.u, ", checkRequired=");
        return f1.e.k(o, this.v, ")");
    }
}
