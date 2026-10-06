package fc0;

import hc0.bb;
import hc0.fb;
import hc0.j7;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        j7.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("deployments", v8.l0.a(v8.l0.b(j7.a)), (String) null, rVar, rVar, r));
        hc0.r0.Companion.getClass();
        aa.q0 q0Var = hc0.r0.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("approveDeployments", q0Var, (String) null, rVar, no.a.s(wg.m, new aa.u0(x61.x.u(new w61.k("comment", new aa.t("comment")), new w61.k("environmentIds", new aa.t("environments")), new w61.k("workflowRunId", new aa.t("checkSuiteId"))))), n));
    }
}
