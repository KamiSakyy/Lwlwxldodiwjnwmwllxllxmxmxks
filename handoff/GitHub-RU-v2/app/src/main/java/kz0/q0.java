package kz0;

import java.util.List;
import pz0.dt;
import pz0.g8;
import pz0.hs;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = yt0.r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = yt0.d.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", v8.l0.b(hs.N), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        dt.Companion.getClass();
        aa.q0 q0Var = dt.d;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2)});
        g8.Companion.getClass();
        aa.q0 q0Var2 = g8.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("deletePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(sk.R, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r3));
    }
}
