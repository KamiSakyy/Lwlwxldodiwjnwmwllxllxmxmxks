package en0;

import gn0.dn;
import gn0.hb;
import gn0.hm;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.yz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a6 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.x xVar = pb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        aa.m mVar2 = new aa.m("headRefOid", v8.l0.b(hb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dn.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", v8.l0.b(dn.s), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        aa.s mVar5 = new aa.m("pullRequest", v8.l0.b(ll.K), (String) null, rVar, rVar, r);
        List n = sy.d0Shadow.n("PullRequestReviewComment");
        List list = si0.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.q0 q0Var = hm.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("pullRequestReviewComment", q0Var, (String) null, rVar, rVar, r2));
        yz.Companion.getClass();
        aa.q0 q0Var2 = yz.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updatePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(wh.W0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewCommentId", new aa.t("commentId"))))), n2));
    }
}
