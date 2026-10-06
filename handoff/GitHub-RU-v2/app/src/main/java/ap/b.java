package ap;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.b9;
import m10.cc0;
import m10.vp;
import sy.d0Shadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        cc0.Companion.getClass();
        x xVar = cc0.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("downloadUrl", xVar, (String) null, rVar, rVar, rVar));
        b9.Companion.getClass();
        q0 q0Var = b9.a;
        k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("createCompletedWorkflowLogsAccess", q0Var, (String) null, rVar, no.a.s(vp.C, new u0(x61.x.u(new w61.k[]{new w61.k("checkRunId", new t("checkRunId")), new w61.k("stepNumber", new t("stepNumber"))}))), n));
    }
}
