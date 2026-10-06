package l20;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import hc0.c5;
import hc0.ew;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ew.Companion.getClass();
        x xVar = ew.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("downloadUrl", xVar, (String) null, rVar, rVar, rVar));
        c5.Companion.getClass();
        q0 q0Var = c5.a;
        k.g(q0Var, "type");
        wg.Companion.getClass();
        a = d0Shadow.n(new m("createCompletedWorkflowLogsAccess", q0Var, (String) null, rVar, no.a.s(wg.w, new u0(x61.x.u(new w61.k[]{new w61.k("checkRunId", new t("checkRunId")), new w61.k("stepNumber", new t("stepNumber"))}))), n));
    }
}
