package en0;

import gn0.b7;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        b7.Companion.getClass();
        aa.q0 q0Var = b7.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteIssueComment", q0Var, (String) null, rVar, no.a.s(wh.H, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), n));
    }
}
