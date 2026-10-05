package fc0;

import hc0.fb;
import hc0.r6;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        r6.Companion.getClass();
        aa.q0 q0Var = r6.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("deleteIssueComment", q0Var, (String) null, rVar, no.a.s(wg.H, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), n));
    }
}
