package en0;

import gn0.a00;
import gn0.fm;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequestReview");
        List list = xi0.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReview", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        fm.Companion.getClass();
        aa.q0 q0Var = fm.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r));
        a00.Companion.getClass();
        aa.q0 q0Var2 = a00.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequestReview", q0Var2, (String) null, rVar, no.a.s(wh.V0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewId", new aa.t("reviewId"))))), n2));
    }
}
