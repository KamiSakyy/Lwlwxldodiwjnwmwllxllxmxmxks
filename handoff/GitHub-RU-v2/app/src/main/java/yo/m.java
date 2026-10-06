package yo;

import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import java.util.List;
import jo.f4;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements n0 {
    public static final j Companion = new j();
    public String r;
    public u0 s;

    public m(u0 u0Var, String str) {
        this.r = str;
        this.s = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = ap.c.a;
        List list2 = ap.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.r.equals(mVar.r) && this.s.equals(mVar.s);
    }

    public final p0 g() {
        return aa.c.c(zo.f.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "b15815eab8bd2b019a5a3e9c79ea68b22321514a337330037bb98c9d22218743";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ReRunCheckRun($checkRunId: ID!, $enableDebugLogging: Boolean = false ) { rerunCheckRunMobile(input: { checkRunId: $checkRunId enableDebugLogging: $enableDebugLogging } ) { checkSuite { id __typename } } }";
    }

    public final String name() {
        return "ReRunCheckRun";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("checkRunId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("enableDebugLogging");
        aa.c.d(aa.c.k).d(fVar, wVar, this.s);
    }

    public final String toString() {
        return f4.k(this.s, "ReRunCheckRunMutation(checkRunId=", this.r, ", enableDebugLogging=", ")");
    }
}
