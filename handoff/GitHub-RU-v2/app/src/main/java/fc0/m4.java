package fc0;

import hc0.bb;
import hc0.bs;
import hc0.fb;
import hc0.gs;
import hc0.is;
import hc0.kz;
import hc0.sz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m4 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("SearchShortcut");
        List list = l90.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        bs.Companion.getClass();
        aa.q0 q0Var = bs.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        is.Companion.getClass();
        List n3 = sy.d0.n(new aa.m("edges", v8.l0.a(is.a), (String) null, rVar, rVar, n2));
        gs.Companion.getClass();
        aa.r b2 = v8.l0.b(gs.a);
        sz.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("shortcuts", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(sz.a, new aa.u0(new aa.t("number"))), new aa.k(sz.b, new aa.u0(x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"})))}), n3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = sz.c;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("dashboard", q0Var2, (String) null, rVar, rVar, r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, r3));
    }
}
