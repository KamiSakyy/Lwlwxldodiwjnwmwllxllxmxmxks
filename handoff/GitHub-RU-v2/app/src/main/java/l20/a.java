package l20;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import hc0.f2;
import hc0.wg;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xa.Companion.getClass();
        x xVar = xa.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("success", xVar, (String) null, rVar, rVar, rVar));
        f2.Companion.getClass();
        q0 q0Var = f2.a;
        k.g(q0Var, "type");
        wg.Companion.getClass();
        a = d0.n(new m("cancelWorkflowRun", q0Var, (String) null, rVar, no.a.s(wg.p, new u0(s0.p("checkSuiteId", new t("checkSuiteId")))), n));
    }
}
