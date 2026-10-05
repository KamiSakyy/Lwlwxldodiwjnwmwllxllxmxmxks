package kz0;

import java.util.List;
import pz0.a70;
import pz0.p00;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q6 {
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
        aa.q0 q0Var = p00.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("shortcut", q0Var, (String) null, rVar, rVar, r));
        a70.Companion.getClass();
        aa.q0 q0Var2 = a70.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDashboardSearchShortcut", q0Var2, (String) null, rVar, no.a.s(sk.Y0, new aa.u0(new aa.t("input"))), n2));
    }
}
