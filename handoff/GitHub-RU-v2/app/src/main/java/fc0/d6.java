package fc0;

import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.kz;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d6 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = fa0.i.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("Organization");
        List list2 = l70.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Organization", n2, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        aa.m mVar3 = new aa.m("user", q0Var, (String) null, rVar, no.a.s(pm.q, new aa.u0(new aa.t("login"))), r);
        di.Companion.getClass();
        aa.q0 q0Var2 = di.m;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar3, new aa.m("organization", q0Var2, (String) null, rVar, no.a.s(pm.g, new aa.u0(new aa.t("login"))), r2)});
    }
}
