package bd0;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import gn0.m5;
import gn0.mx;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        mx.Companion.getClass();
        x xVar = mx.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("downloadUrl", xVar, (String) null, rVar, rVar, rVar));
        m5.Companion.getClass();
        q0 q0Var = m5.a;
        k.g(q0Var, "type");
        wh.Companion.getClass();
        a = d0.n(new m("createCompletedWorkflowLogsAccess", q0Var, (String) null, rVar, no.a.s(wh.w, new u0(x61.x.u(new w61.k("checkRunId", new t("checkRunId")), new w61.k("stepNumber", new t("stepNumber"))))), n));
    }
}
