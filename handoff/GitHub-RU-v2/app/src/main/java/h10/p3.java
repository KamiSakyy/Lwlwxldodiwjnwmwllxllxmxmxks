package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.t10;
import m10.vp;
import m10.yb;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p3 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        yb.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("deployments", v8.l0.a(v8.l0.b(yb.a)), (String) null, rVar, rVar, r));
        t10.Companion.getClass();
        aa.q0 q0Var = t10.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("rejectDeployments", q0Var, (String) null, rVar, no.a.s(vp.z0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("comment", new aa.t("comment")), new w61.k("environmentIds", new aa.t("environments")), new w61.k("workflowRunId", new aa.t("checkSuiteId"))}))), n));
    }
}
