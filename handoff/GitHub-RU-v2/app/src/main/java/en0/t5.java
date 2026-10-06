package en0;

import gn0.i00;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = xk0.b.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, no.a.c(list, "selections", "User", n, list)});
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        i00.Companion.getClass();
        aa.q0 q0Var2 = i00.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateUserDashboardPins", q0Var2, (String) null, rVar, no.a.s(wh.a1, new aa.u0(a0.s0.p("itemIds", new aa.t("itemIds")))), n2));
    }
}
