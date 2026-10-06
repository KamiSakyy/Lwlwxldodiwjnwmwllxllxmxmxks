package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        aa.s mVar2 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("user", q0Var, (String) null, rVar, no.a.s(p00.E, new aa.u0(new aa.t("login"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
