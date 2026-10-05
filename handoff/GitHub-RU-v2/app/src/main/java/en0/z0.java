package en0;

import gn0.fm;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.y9;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = si0.j.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = si0.k.a;
        aa.s c2 = no.a.c(list2, "selections", "PullRequest", n2, list2);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, c2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("PullRequestReview");
        List list3 = xi0.a.a;
        aa.s c3 = no.a.c(list3, "selections", "PullRequestReview", n3, list3);
        ll.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, c3, new aa.m("pullRequest", v8.l0.b(ll.K), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fm.Companion.getClass();
        aa.q0 q0Var = fm.d;
        k71.k.g(q0Var, "type");
        List n4 = sy.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2));
        y9.Companion.getClass();
        aa.q0 q0Var2 = y9.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("dismissPullRequestReview", q0Var2, (String) null, rVar, no.a.s(wh.Q, new aa.u0(x61.x.u(new w61.k("message", new aa.t("message")), new w61.k("pullRequestReviewId", new aa.t("id"))))), n4));
    }
}
