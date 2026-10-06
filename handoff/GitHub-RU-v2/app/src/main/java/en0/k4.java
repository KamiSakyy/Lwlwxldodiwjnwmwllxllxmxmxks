package en0;

import gn0.ls;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.zm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequestReviewThread");
        List list = bk0.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReviewThread", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        zm.Companion.getClass();
        aa.q0 q0Var = zm.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r));
        ls.Companion.getClass();
        aa.q0 q0Var2 = ls.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("resolveReviewThread", q0Var2, (String) null, rVar, no.a.s(wh.x0, new aa.u0(a0.s0.p("threadId", new aa.t("nodeId")))), n2));
    }
}
