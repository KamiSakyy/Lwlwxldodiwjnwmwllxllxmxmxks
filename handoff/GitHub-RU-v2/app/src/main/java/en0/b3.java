package en0;

import gn0.pb;
import gn0.t7;
import gn0.tb;
import gn0.wh;
import gn0.wo;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b3 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = v8.l0.b(pb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        t7.Companion.getClass();
        List n = sy.d0.n(new aa.m("deployments", v8.l0.a(v8.l0.b(t7.a)), (String) null, rVar, rVar, r));
        wo.Companion.getClass();
        aa.q0 q0Var = wo.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("rejectDeployments", q0Var, (String) null, rVar, no.a.s(wh.m0, new aa.u0(x61.x.u(new w61.k("comment", new aa.t("comment")), new w61.k("environmentIds", new aa.t("environments")), new w61.k("workflowRunId", new aa.t("checkSuiteId"))))), n));
    }
}
