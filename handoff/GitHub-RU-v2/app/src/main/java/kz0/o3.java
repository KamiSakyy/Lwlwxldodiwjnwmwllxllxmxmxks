package kz0;

import java.util.List;
import pz0.iw;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        iw.Companion.getClass();
        aa.q0 q0Var = iw.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("removeDashboardSearchShortcut", q0Var, (String) null, rVar, no.a.s(sk.x0, new aa.u0(a0.s0.p("shortcutId", new aa.t("id")))), n));
    }
}
