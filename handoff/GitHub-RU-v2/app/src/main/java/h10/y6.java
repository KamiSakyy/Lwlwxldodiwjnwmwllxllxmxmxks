package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.vp;
import m10.ze0;
import m10.zy;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequestReview");
        List list = mv.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReview", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        zy.Companion.getClass();
        aa.q0 q0Var = zy.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r));
        ze0.Companion.getClass();
        aa.q0 q0Var2 = ze0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequestReview", q0Var2, (String) null, rVar, no.a.s(vp.r1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewId", new aa.t("reviewId"))}))), n2));
    }
}
