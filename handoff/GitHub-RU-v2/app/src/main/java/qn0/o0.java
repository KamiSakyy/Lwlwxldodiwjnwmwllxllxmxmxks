package qn0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.w0 {
    public static final i0 Companion = new i0();
    public final String r;
    public final aa1.b s;
    public final aa1.b t;
    public final aa1.b u;
    public final aa1.b v;

    public o0(String str, aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4) {
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
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = co0.d.a;
        List list2 = co0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.r, o0Var.r) && k71.k.b(this.s, o0Var.s) && k71.k.b(this.t, o0Var.t) && k71.k.b(this.u, o0Var.u) && k71.k.b(this.v, o0Var.v);
    }

    public final aa.p0 g() {
        return aa.c.c(rn0.c0.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "78717e6092ddfeb9c08d0bd14a07a95e0844093f3a64603996b56ad6e11d3a4b";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckSuiteById($id: ID!, $first: Int, $afterCheckRuns: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename id ... on CheckSuite { __typename ...CheckSuiteFragment workflowRun { id workflow { name id __typename } __typename } app { id name logoUrl __typename } } } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckSuiteFragment on CheckSuite { id status conclusion url duration event artifacts { totalCount } repository { id name owner { __typename ...actorFields } viewerPermission __typename } push { pusher { __typename ...actorFields } id __typename } branch { id name __typename } commit { id abbreviatedOid associatedPullRequests(first: 1) { nodes { id title __typename } } __typename } rerunnable app { id name logoUrl __typename } checkRuns: checkRuns(first: $first, after: $afterCheckRuns) { totalCount pageInfo { hasNextPage hasPreviousPage endCursor } nodes { __typename ...WorkFlowCheckRunFragment id } } failedCheckRuns: checkRuns(first: 5, filterBy: { conclusions: [CANCELLED,FAILURE,TIMED_OUT,ACTION_REQUIRED,STALE,STARTUP_FAILURE] } ) { totalCount nodes { __typename ...WorkFlowCheckRunFragment id } } runningCheckRuns: checkRuns(first: 1, filterBy: { statuses: [IN_PROGRESS,PENDING,QUEUED,REQUESTED,WAITING] } ) { totalCount } skippedCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SKIPPED] } ) { totalCount } neutralCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [NEUTRAL] } ) { totalCount } successfulCheckRuns: checkRuns(first: 1, filterBy: { conclusions: [SUCCESS] } ) { totalCount } __typename }";
    }

    public final String name() {
        return "CheckSuiteById";
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
        StringBuilder o = f1.e.o(this.s, "CheckSuiteByIdQuery(id=", this.r, ", first=", ", afterCheckRuns=");
        f1.e.w(o, this.t, ", pullRequestId=", this.u, ", checkRequired=");
        return f1.e.k(o, this.v, ")");
    }
}
