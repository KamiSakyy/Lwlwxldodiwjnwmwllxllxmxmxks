package kz0;

import java.util.List;
import pz0.sk;
import pz0.td;
import pz0.u8;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = v8.l0.b(td.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        u8.Companion.getClass();
        List n = sy.d0.n(new aa.m("deployments", v8.l0.a(v8.l0.b(u8.a)), (String) null, rVar, rVar, r));
        pz0.c1.Companion.getClass();
        aa.q0 q0Var = pz0.c1.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("approveDeployments", q0Var, (String) null, rVar, no.a.s(sk.p, new aa.u0(x61.x.u(new w61.k("comment", new aa.t("comment")), new w61.k("environmentIds", new aa.t("environments")), new w61.k("workflowRunId", new aa.t("checkSuiteId"))))), n));
    }
}
