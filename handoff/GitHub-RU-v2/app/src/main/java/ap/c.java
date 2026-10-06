package ap;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.h4;
import m10.p50;
import m10.vp;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        h4.Companion.getClass();
        q0 q0Var = h4.f;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("checkSuite", q0Var, (String) null, rVar, rVar, r));
        p50.Companion.getClass();
        q0 q0Var2 = p50.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("rerunCheckRunMobile", q0Var2, (String) null, rVar, no.a.s(vp.K0, new u0(x.u(new w61.k[]{new w61.k("checkRunId", new t("checkRunId")), new w61.k("enableDebugLogging", new t("enableDebugLogging"))}))), n));
    }
}
