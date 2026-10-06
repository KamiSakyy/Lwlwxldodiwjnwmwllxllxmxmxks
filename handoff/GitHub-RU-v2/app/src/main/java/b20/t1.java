package b20;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.w0 {
    public static final p1 Companion = new p1();
    public String r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;
    public aa1.b v;
    public aa1.b w;

    public t1(String str, aa.u0 u0Var, aa.u0 u0Var2, aa1.b bVar, aa.u0 u0Var3, int i) {
        int i2 = i & 4;
        aa.u0 u0Var4 = aa.t0.d;
        u0Var2 = i2 != 0 ? u0Var4 : u0Var2;
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
        this.u = u0Var4;
        this.v = bVar;
        this.w = u0Var3;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = n20.h.a;
        List list2 = n20.h.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.r, t1Var.r) && k71.k.b(this.s, t1Var.s) && k71.k.b(this.t, t1Var.t) && k71.k.b(this.u, t1Var.u) && k71.k.b(this.v, t1Var.v) && k71.k.b(this.w, t1Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(c20.b1.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + f1.e.a(this.v, f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String i() {
        return "418a971dfec91ac0cf6dbe82646d8651c002383da1aea3bf6c87898d03417751";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitCheckSuitesPage($id: ID!, $first: Int, $afterCheckSuites: String = null , $afterCheckRuns: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename ... on Commit { __typename id ...CommitCheckSuitesFragment } id } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckSuiteFragment on CheckSuite { id status conclusion url duration event artifacts { totalCount } repository { id name owner { __typename ...actorFields } viewerPermission __typename } push { pusher { __typename ...actorFields } id __typename } branch { id name __typename } commit { id abbreviatedOid associatedPullRequests(first: 1) { nodes { id title __typename } } __typename } rerunnable app { id name logoUrl __typename } checkRuns: checkRuns(first: $first, after: $afterCheckRuns) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...WorkFlowCheckRunFragment id } } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } __typename }  fragment CommitCheckSuitesFragment on Commit { id checkSuites(first: $first, after: $afterCheckSuites) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...CheckSuiteFragment workflowRun { id workflow { id name __typename } __typename } app { id name logoUrl __typename } id } } __typename }";
    }

    public final String name() {
        return "CommitCheckSuitesPage";
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
        StringBuilder o = f1.e.o(this.s, "CommitCheckSuitesPageQuery(id=", this.r, ", first=", ", afterCheckSuites=");
        f1.e.w(o, this.t, ", afterCheckRuns=", this.u, ", pullRequestId=");
        return f1.e.l(o, this.v, ", checkRequired=", this.w, ")");
    }
}
