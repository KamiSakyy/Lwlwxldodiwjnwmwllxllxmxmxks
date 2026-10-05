package yn0;

import aa.n0;
import aa.o0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import java.util.List;
import jo.f4;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements n0 {
    public static final o Companion = new o();
    public final String r;
    public final u0 s;
    public final u0 t;

    public r(u0 u0Var, u0 u0Var2, String str) {
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
    }

    public final aa.m d() {
        sk.Companion.getClass();
        q0 q0Var = sk.v1;
        k71.k.g(q0Var, "type");
        List list = ao0.d.a;
        List list2 = ao0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.r.equals(rVar.r) && this.s.equals(rVar.s) && this.t.equals(rVar.t);
    }

    public final p0 g() {
        return aa.c.c(zn0.i.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "5ae97953988d256eaf9d8721a5de1b691535c888f3fd863658e2043241469d00";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReRunCheckSuite($checkSuiteId: ID!, $enableDebugLogging: Boolean = false , $onlyFailedCheckRuns: Boolean = false ) { rerunCheckSuiteMobile(input: { checkSuiteId: $checkSuiteId enableDebugLogging: $enableDebugLogging onlyFailedCheckRuns: $onlyFailedCheckRuns } ) { checkSuite { id __typename } } }";
    }

    public final String name() {
        return "ReRunCheckSuite";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkSuiteId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("enableDebugLogging");
        o0 o0Var = aa.c.k;
        f4.y(o0Var, fVar, wVar, this.s, "onlyFailedCheckRuns");
        aa.c.d(o0Var).d(fVar, wVar, this.t);
    }

    public final String toString() {
        return f1.e.j(f4.t(this.s, "ReRunCheckSuiteMutation(checkSuiteId=", this.r, ", enableDebugLogging=", ", onlyFailedCheckRuns="), this.t, ")");
    }
}
