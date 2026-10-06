package fc0;

import hc0.bb;
import hc0.fb;
import hc0.mx;
import hc0.wg;
import hc0.xl;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u4 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequestReviewThread");
        List list = j90.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReviewThread", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        xl.Companion.getClass();
        aa.q0 q0Var = xl.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r));
        mx.Companion.getClass();
        aa.q0 q0Var2 = mx.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("unresolveReviewThread", q0Var2, (String) null, rVar, no.a.s(wg.I0, new aa.u0(a0.s0.p("threadId", new aa.t("nodeId")))), n2));
    }
}
