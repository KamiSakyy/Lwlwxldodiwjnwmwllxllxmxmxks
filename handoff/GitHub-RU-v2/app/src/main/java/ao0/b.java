package ao0;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.b6;
import pz0.h50;
import pz0.sk;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        h50.Companion.getClass();
        x xVar = h50.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("downloadUrl", xVar, (String) null, rVar, rVar, rVar));
        b6.Companion.getClass();
        q0 q0Var = b6.a;
        k.g(q0Var, "type");
        sk.Companion.getClass();
        a = d0.n(new m("createCompletedWorkflowLogsAccess", q0Var, (String) null, rVar, no.a.s(sk.B, new u0(x61.x.u(new w61.k("checkRunId", new t("checkRunId")), new w61.k("stepNumber", new t("stepNumber"))))), n));
    }
}
