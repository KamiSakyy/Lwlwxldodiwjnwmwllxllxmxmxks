package yn0;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import java.util.List;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements n0 {
    public static final b Companion = new b();
    public String r;

    public d(String str) {
        k71.k.g(str, "checkSuiteId");
        this.r = str;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ao0.a.a;
        List list2 = ao0.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.r, ((d) obj).r);
    }

    public final p0 g() {
        return aa.c.c(zn0.b.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "4088c00f05181069e14d5f94e683e0fb09d388c2a624ee6ba708b50ac64ac508";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CancelWorkflowRun($checkSuiteId: ID!) { cancelWorkflowRun(input: { checkSuiteId: $checkSuiteId } ) { success } }";
    }

    public final String name() {
        return "CancelWorkflowRun";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkSuiteId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("CancelWorkflowRunMutation(checkSuiteId=", this.r, ")");
    }
}
