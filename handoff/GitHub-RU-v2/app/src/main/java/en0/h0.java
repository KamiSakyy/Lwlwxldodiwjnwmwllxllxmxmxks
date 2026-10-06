package en0;

import gn0.a10;
import gn0.ft;
import gn0.lt;
import gn0.nt;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = dk0.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        aa.q0 q0Var = ft.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        nt.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("edges", v8.l0.a(nt.a), (String) null, rVar, rVar, n2));
        lt.Companion.getClass();
        aa.r b2 = v8.l0.b(lt.a);
        a10.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("shortcuts", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(a10.a, new aa.u0(new aa.t("number"))), new aa.k(a10.b, new aa.u0(x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"})))}), n3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = a10.c;
        k71.k.g(q0Var2, "type");
        List n4 = sy.d0Shadow.n(new aa.m("dashboard", q0Var2, (String) null, rVar, rVar, r2));
        gn0.p5.Companion.getClass();
        aa.q0 q0Var3 = gn0.p5.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createDashboardSearchShortcut", q0Var3, (String) null, rVar, no.a.s(wh.x, new aa.u0(new aa.t("input"))), n4));
    }
}
