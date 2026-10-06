package ey0;

import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.e8;
import pz0.sk;
import pz0.xd;
import sy.d0Shadow;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k71.k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        e8.Companion.getClass();
        q0 q0Var = e8.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new aa.m("deleteProjectV2Item", q0Var, (String) null, rVar, no.a.s(sk.Q, new u0(x61.x.u(new w61.k("itemId", new t("itemId")), new w61.k("projectId", new t("projectId"))))), n));
    }
}
