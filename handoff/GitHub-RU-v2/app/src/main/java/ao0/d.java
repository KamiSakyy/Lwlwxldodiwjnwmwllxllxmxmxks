package ao0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import java.util.List;
import k71.k;
import pz0.k3;
import pz0.sk;
import pz0.td;
import pz0.tz;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        k3.Companion.getClass();
        q0 q0Var = k3.f;
        k.g(q0Var, "type");
        List n = d0.n(new m("checkSuite", q0Var, (String) null, rVar, rVar, r));
        tz.Companion.getClass();
        q0 q0Var2 = tz.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0.n(new m("rerunCheckSuiteMobile", q0Var2, (String) null, rVar, no.a.s(sk.H0, new u0(x.u(new w61.k("checkSuiteId", new t("checkSuiteId")), new w61.k("enableDebugLogging", new t("enableDebugLogging")), new w61.k("onlyFailedCheckRuns", new t("onlyFailedCheckRuns"))))), n));
    }
}
