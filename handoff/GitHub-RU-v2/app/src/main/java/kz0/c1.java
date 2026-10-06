package kz0;

import java.util.List;
import pz0.dt;
import pz0.hs;
import pz0.sk;
import pz0.td;
import pz0.xd;
import pz0.za;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = yt0.j.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0Shadow.n("PullRequest");
        List list2 = yt0.k.a;
        aa.s c2 = no.a.c(list2, "selections", "PullRequest", n2, list2);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, c2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("PullRequestReview");
        List list3 = du0.a.a;
        aa.s c3 = no.a.c(list3, "selections", "PullRequestReview", n3, list3);
        hs.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, c3, new aa.m("pullRequest", v8.l0.b(hs.N), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        dt.Companion.getClass();
        aa.q0 q0Var = dt.d;
        k71.k.g(q0Var, "type");
        List n4 = sy.d0Shadow.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2));
        za.Companion.getClass();
        aa.q0 q0Var2 = za.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("dismissPullRequestReview", q0Var2, (String) null, rVar, no.a.s(sk.Y, new aa.u0(x61.x.u(new w61.k("message", new aa.t("message")), new w61.k("pullRequestReviewId", new aa.t("id"))))), n4));
    }
}
