package bd0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import gn0.js;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.x2;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        x2.Companion.getClass();
        q0 q0Var = x2.f;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("checkSuite", q0Var, (String) null, rVar, rVar, r));
        js.Companion.getClass();
        q0 q0Var2 = js.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0Shadow.n(new m("rerunCheckSuiteMobile", q0Var2, (String) null, rVar, no.a.s(wh.w0, new u0(x.u(new w61.k("checkSuiteId", new t("checkSuiteId")), new w61.k("enableDebugLogging", new t("enableDebugLogging")), new w61.k("onlyFailedCheckRuns", new t("onlyFailedCheckRuns"))))), n));
    }
}
