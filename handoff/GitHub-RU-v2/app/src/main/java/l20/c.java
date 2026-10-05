package l20;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import hc0.bb;
import hc0.dr;
import hc0.fb;
import hc0.v2;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        v2.Companion.getClass();
        q0 q0Var = v2.f;
        k.g(q0Var, "type");
        List n = d0.n(new m("checkSuite", q0Var, (String) null, rVar, rVar, r));
        dr.Companion.getClass();
        q0 q0Var2 = dr.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("rerunCheckRunMobile", q0Var2, (String) null, rVar, no.a.s(wg.t0, new u0(x.u(new w61.k[]{new w61.k("checkRunId", new t("checkRunId")), new w61.k("enableDebugLogging", new t("enableDebugLogging"))}))), n));
    }
}
