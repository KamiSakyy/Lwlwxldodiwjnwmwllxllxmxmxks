package kz0;

import java.util.List;
import pz0.f20;
import pz0.p00;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("SearchShortcut");
        List list = kv0.a.a;
        aa.s c = no.a.c(list, "selections", "SearchShortcut", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        p00.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("shortcuts", v8.l0.a(v8.l0.b(p00.a)), (String) null, rVar, rVar, r));
        f20.Companion.getClass();
        aa.q0 q0Var = f20.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("setDashboardSearchShortcuts", q0Var, (String) null, rVar, no.a.s(sk.K0, new aa.u0(new aa.t("input"))), n2));
    }
}
