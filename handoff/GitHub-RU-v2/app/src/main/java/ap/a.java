package ap;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.p3;
import m10.vp;
import m10.wg;
import sy.d0Shadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("success", xVar, (String) null, rVar, rVar, rVar));
        p3.Companion.getClass();
        q0 q0Var = p3.a;
        k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("cancelWorkflowRun", q0Var, (String) null, rVar, no.a.s(vp.u, new u0(s0.p("checkSuiteId", new t("checkSuiteId")))), n));
    }
}
