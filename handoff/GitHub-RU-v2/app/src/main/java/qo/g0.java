package qo;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.w0 {
    public static final y Companion = new y();
    public final String r;
    public final int s;
    public final aa1.b t;
    public final aa1.b u;

    public g0(String str, int i) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = i;
        aa.t0 t0Var = aa.t0.d;
        this.t = t0Var;
        this.u = t0Var;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.c.a;
        List list2 = cp.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.r, g0Var.r) && this.s == g0Var.s && k71.k.b(this.t, g0Var.t) && k71.k.b(this.u, g0Var.u);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.u.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, a0.s0.b(this.s, this.r.hashCode() * 31, 31), 31);
    }

    public final String i() {
        return "91d92c638962f04fa2a43ff5079f98e79d6489670c9f5384ae14a8c21be6bc96";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckRunWithStep($id: ID!, $step: Int!, $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename ... on CheckRun { __typename ...WorkFlowCheckRunFragment checkSuite { id workflowRun { id workflow { id name __typename } __typename } __typename } steps(first: 1, number: $step) { nodes { __typename ...CheckStepFragment } } } id } id __typename }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment CheckStepFragment on CheckStep { externalId name conclusion status startedAt completedAt secondsToCompletion number }";
    }

    public final String name() {
        return "CheckRunWithStep";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("step");
        fVar.z(this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("pullRequestId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("pullRequestId");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var2 = this.u;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("checkRequired");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("checkRequired");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        return f1.e.l(a0.s0.n(this.s, "CheckRunWithStepQuery(id=", this.r, ", step=", ", pullRequestId="), this.t, ", checkRequired=", this.u, ")");
    }
}
