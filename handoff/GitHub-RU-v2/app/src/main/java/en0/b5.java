package en0;

import gn0.pb;
import gn0.tb;
import gn0.vy;
import gn0.wh;
import gn0.zm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequestReviewThread");
        List list = bk0.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReviewThread", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        zm.Companion.getClass();
        aa.q0 q0Var = zm.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r));
        vy.Companion.getClass();
        aa.q0 q0Var2 = vy.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("unresolveReviewThread", q0Var2, (String) null, rVar, no.a.s(wh.K0, new aa.u0(a0.s0.p("threadId", new aa.t("nodeId")))), n2));
    }
}
