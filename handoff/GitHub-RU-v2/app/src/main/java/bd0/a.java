package bd0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import gn0.h2;
import gn0.lb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("success", xVar, (String) null, rVar, rVar, rVar));
        h2.Companion.getClass();
        q0 q0Var = h2.a;
        k.g(q0Var, "type");
        wh.Companion.getClass();
        a = d0.n(new m("cancelWorkflowRun", q0Var, (String) null, rVar, no.a.s(wh.p, new u0(s0.p("checkSuiteId", new t("checkSuiteId")))), n));
    }
}
