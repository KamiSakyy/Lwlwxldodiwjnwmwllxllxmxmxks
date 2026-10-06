package qo;

import java.util.List;
import jo.f4Shadow;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 implements aa.w0 {
    public static final b2 Companion = new b2();
    public String r;
    public aa1.b s;

    public f2(String str) {
        k71.k.g(str, "workflowId");
        this.r = str;
        this.s = aa.t0.d;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.j.a;
        List list2 = cp.j.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return k71.k.b(this.r, f2Var.r) && k71.k.b(this.s, f2Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.j1.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "f930e2095db437f385752b26093eaf6b0d68f3e77eea16af3ea6caaa09af65be";
    }

    public final String j() {
        Companion.getClass();
        return "query DefaultWorkflowInputs($workflowId: ID!, $branchRef: String = null ) { node(id: $workflowId) { __typename ... on Workflow { __typename id ...WorkflowInputsFragment } id } id __typename }  fragment WorkflowInputsFragment on Workflow { inputs(branchRef: $branchRef) { choices description required type defaultValue titleId } id __typename }";
    }

    public final String name() {
        return "DefaultWorkflowInputs";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("workflowId");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("branchRef");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("branchRef");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
    }

    public final String toString() {
        return f4.l(this.s, "DefaultWorkflowInputsQuery(workflowId=", this.r, ", branchRef=", ")");
    }
}
