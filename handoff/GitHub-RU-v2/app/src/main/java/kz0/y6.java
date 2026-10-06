package kz0;

import java.util.List;
import pz0.bm;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = gw0.i.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("Organization");
        List list2 = lt0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Organization", n2, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        aa.q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        aa.m mVar3 = new aa.m("user", q0Var, (String) null, rVar, no.a.s(su.y, new aa.u0(new aa.t("login"))), r);
        bm.Companion.getClass();
        aa.q0 q0Var2 = bm.o;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar3, new aa.m("organization", q0Var2, (String) null, rVar, no.a.s(su.j, new aa.u0(new aa.t("login"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
