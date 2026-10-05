package en0;

import gn0.pb;
import gn0.q00;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("mobileTimeZone", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        q00.Companion.getClass();
        aa.q0 q0Var2 = q00.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateUserMobileTimeZone", q0Var2, (String) null, rVar, no.a.s(wh.d1, new aa.u0(a0.s0.p("timeZone", new aa.t("timeZone")))), n));
    }
}
