package ao0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import java.util.List;
import k71.k;
import pz0.k3;
import pz0.rz;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        k3.Companion.getClass();
        q0 q0Var = k3.f;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("checkSuite", q0Var, (String) null, rVar, rVar, r));
        rz.Companion.getClass();
        q0 q0Var2 = rz.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("rerunCheckRunMobile", q0Var2, (String) null, rVar, no.a.s(sk.G0, new u0(x.u(new w61.k("checkRunId", new t("checkRunId")), new w61.k("enableDebugLogging", new t("enableDebugLogging"))))), n));
    }
}
