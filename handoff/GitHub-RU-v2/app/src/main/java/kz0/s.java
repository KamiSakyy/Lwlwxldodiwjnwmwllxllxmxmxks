package kz0;

import java.util.List;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        pz0.q2.Companion.getClass();
        aa.q0 q0Var = pz0.q2.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("blockUser", q0Var, (String) null, rVar, no.a.s(sk.r, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n));
    }
}
