package fc0;

import hc0.bb;
import hc0.da;
import hc0.fb;
import hc0.kz;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = d30.b.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        da.Companion.getClass();
        aa.q0 q0Var2 = da.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("followUser", q0Var2, (String) null, rVar, no.a.s(wg.S, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n2));
    }
}
