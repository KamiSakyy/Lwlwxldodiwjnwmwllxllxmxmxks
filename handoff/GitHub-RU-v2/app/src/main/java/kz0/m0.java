package kz0;

import java.util.List;
import pz0.sk;
import pz0.w7;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        w7.Companion.getClass();
        aa.q0 q0Var = w7.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteDiscussion", q0Var, (String) null, rVar, no.a.s(sk.L, new aa.u0(a0.s0.p("id", new aa.t("discussionId")))), n));
    }
}
