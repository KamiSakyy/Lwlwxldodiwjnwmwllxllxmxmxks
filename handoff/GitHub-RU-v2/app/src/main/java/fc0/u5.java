package fc0;

import hc0.bb;
import hc0.dl;
import hc0.fb;
import hc0.syShadow;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = syShadow.d0.n("PullRequestReview");
        List list = f80.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReview", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        dl.Companion.getClass();
        aa.q0 q0Var = dl.d;
        k71.k.g(q0Var, "type");
        List n2 = syShadow.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r));
        syShadow.Companion.getClass();
        aa.q0 q0Var2 = syShadow.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = syShadow.d0.n(new aa.m("updatePullRequestReview", q0Var2, (String) null, rVar, no.a.s(wg.T0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewId", new aa.t("reviewId"))))), n2));
    }
}
