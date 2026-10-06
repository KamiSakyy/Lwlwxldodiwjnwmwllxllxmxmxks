package yn0;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.w;
import com.github.rudroid.m0;
import java.util.List;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements n0 {
    public static final e Companion = new e();
    public final String r;
    public final int s;

    public h(String str, int i) {
        k71.k.g(str, "checkRunId");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ao0.b.a;
        List list2 = ao0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.r, hVar.r) && this.s == hVar.s;
    }

    public final p0 g() {
        return aa.c.c(zn0.d.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "bdb3ae959d39eb940e1cf33010b5430e8b62a8f60d634089bdc948ef76378433";
    }

    public final String j() {
        Companion.getClass();
        return "mutation CreateCompletedWorkflowLogsAccess($checkRunId: ID!, $stepNumber: Int!) { createCompletedWorkflowLogsAccess(input: { checkRunId: $checkRunId stepNumber: $stepNumber } ) { downloadUrl } }";
    }

    public final String name() {
        return "CreateCompletedWorkflowLogsAccess";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkRunId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("stepNumber");
        fVar.z(this.s);
    }

    public final String toString() {
        return m0.b(this.s, "CreateCompletedWorkflowLogsAccessMutation(checkRunId=", this.r, ", stepNumber=", ")");
    }
}
