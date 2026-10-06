package fc0;

import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Organization");
        List list = d30.c.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        di.Companion.getClass();
        aa.q0 q0Var = di.m;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("organization", q0Var, (String) null, rVar, no.a.s(pm.g, new aa.u0(new aa.t("login"))), r));
    }
}
