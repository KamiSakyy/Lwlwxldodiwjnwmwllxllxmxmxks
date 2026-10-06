package fc0;

import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e6 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        aa.s mVar2 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("user", q0Var, (String) null, rVar, no.a.s(pm.q, new aa.u0(new aa.t("login"))), r2));
    }
}
