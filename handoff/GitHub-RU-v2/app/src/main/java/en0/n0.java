package en0;

import gn0.f7;
import gn0.fm;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = si0.r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = si0.d.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", v8.l0.b(ll.K), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        aa.q0 q0Var = fm.d;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2)});
        f7.Companion.getClass();
        aa.q0 q0Var2 = f7.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("deletePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(wh.J, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r3));
    }
}
