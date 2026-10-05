package kz0;

import java.util.List;
import pz0.dt;
import pz0.e80;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequestReview");
        List list = du0.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReview", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        dt.Companion.getClass();
        aa.q0 q0Var = dt.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r));
        e80.Companion.getClass();
        aa.q0 q0Var2 = e80.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequestReview", q0Var2, (String) null, rVar, no.a.s(sk.m1, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewId", new aa.t("reviewId"))))), n2));
    }
}
