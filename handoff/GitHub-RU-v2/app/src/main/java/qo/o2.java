package qo;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aa.w0 {
    public static final k2 Companion = new k2();
    public String r;
    public String s;

    public o2(String str, String str2) {
        k71.k.g(str, "workflowId");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = cp.l.a;
        List list2 = cp.l.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.r, o2Var.r) && k71.k.b(this.s, o2Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.o1.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "51f5d848ae6e6b92cb261ebc9989bfbbba13d57d425a739211029776a33daf3d";
    }

    public final String j() {
        Companion.getClass();
        return "query WorkflowInputsAndHasManualTrigger($workflowId: ID!, $branchRef: String!) { node(id: $workflowId) { __typename ... on Workflow { __typename id hasWorkflowDispatchTriggerForBranch(branchRef: $branchRef) ...WorkflowInputsFragment } id } id __typename }  fragment WorkflowInputsFragment on Workflow { inputs(branchRef: $branchRef) { choices description required type defaultValue titleId } id __typename }";
    }

    public final String name() {
        return "WorkflowInputsAndHasManualTrigger";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("workflowId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("branchRef");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("WorkflowInputsAndHasManualTriggerQuery(workflowId=", this.r, ", branchRef=", this.s, ")");
    }
}
