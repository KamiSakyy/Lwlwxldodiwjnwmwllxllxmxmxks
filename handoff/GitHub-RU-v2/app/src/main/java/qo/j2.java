package qo;

import java.util.List;
import m10.ee;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 implements aa.n0 {
    public static final g2 Companion = new g2();
    public final ee r;

    public j2(ee eeVar) {
        this.r = eeVar;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = cp.k.a;
        List list2 = cp.k.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && k71.k.b(this.r, ((j2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ro.m1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e07b2274d96b6358885e0730252db85a07f428cb10658353ad2638576e9bd2b9";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DispatchWorkflowRun($input: DispatchWorkflowRunInput!) { dispatchWorkflowRun(input: $input) { clientMutationId } }";
    }

    public final String name() {
        return "DispatchWorkflowRun";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.a.C, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "DispatchWorkflowRunMutation(input=" + this.r + ")";
    }
}
