package h10;

import java.util.List;
import m10.cb;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        cb.Companion.getClass();
        aa.q0 q0Var = cb.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteIssueComment", q0Var, (String) null, rVar, no.a.s(vp.Q, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), n));
    }
}
