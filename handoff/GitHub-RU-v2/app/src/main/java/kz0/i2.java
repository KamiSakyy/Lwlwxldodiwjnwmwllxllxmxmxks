package kz0;

import java.util.List;
import pz0.ch;
import pz0.pd;
import pz0.sk;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i2 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("success", xVar, (String) null, rVar, rVar, rVar));
        ch.Companion.getClass();
        aa.q0 q0Var = ch.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("markNotificationSubjectAsRead", q0Var, (String) null, rVar, no.a.s(sk.m0, new aa.u0(a0.s0.p("subjectId", new aa.t("id")))), n));
    }
}
