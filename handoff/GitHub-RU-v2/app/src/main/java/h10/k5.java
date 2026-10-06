package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.p60;
import m10.rf0;
import m10.u60;
import m10.w60;
import m10.zf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("SearchShortcut");
        List list = tw.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        p60.Companion.getClass();
        aa.q0 q0Var = p60.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        w60.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("edges", v8.l0.a(w60.a), (String) null, rVar, rVar, n2));
        u60.Companion.getClass();
        aa.r b2 = v8.l0.b(u60.a);
        zf0.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("shortcuts", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(zf0.a, new aa.u0(new aa.t("number"))), new aa.k(zf0.b, new aa.u0(x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS", "REPOSITORIES"})))}), n3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = zf0.c;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("dashboard", q0Var2, (String) null, rVar, rVar, r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
