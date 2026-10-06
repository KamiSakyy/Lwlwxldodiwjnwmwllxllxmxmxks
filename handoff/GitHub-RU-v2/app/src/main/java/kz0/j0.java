package kz0;

import java.util.List;
import pz0.e90;
import pz0.p00;
import pz0.sk;
import pz0.td;
import pz0.u00;
import pz0.w00;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = kv0.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        p00.Companion.getClass();
        aa.q0 q0Var = p00.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        w00.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("edges", v8.l0.a(w00.a), (String) null, rVar, rVar, n2));
        u00.Companion.getClass();
        aa.r b2 = v8.l0.b(u00.a);
        e90.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("shortcuts", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(e90.a, new aa.u0(new aa.t("number"))), new aa.k(e90.b, new aa.u0(x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"})))}), n3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = e90.c;
        k71.k.g(q0Var2, "type");
        List n4 = sy.d0Shadow.n(new aa.m("dashboard", q0Var2, (String) null, rVar, rVar, r2));
        pz0.e6.Companion.getClass();
        aa.q0 q0Var3 = pz0.e6.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createDashboardSearchShortcut", q0Var3, (String) null, rVar, no.a.s(sk.C, new aa.u0(new aa.t("input"))), n4));
    }
}
