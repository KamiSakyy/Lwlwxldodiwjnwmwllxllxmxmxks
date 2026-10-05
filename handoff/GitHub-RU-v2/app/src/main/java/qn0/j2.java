package qn0;

import java.util.List;
import pz0.ab;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aa.n0 {
    public static final g2 Companion = new g2();
    public final ab r;

    public j2(ab abVar) {
        this.r = abVar;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        aa.q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = co0.k.a;
        List list2 = co0.k.a;
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
        return aa.c.c(rn0.m1.a, false);
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
        aa.c.c(qz0.a.r, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "DispatchWorkflowRunMutation(input=" + this.r + ")";
    }
}
