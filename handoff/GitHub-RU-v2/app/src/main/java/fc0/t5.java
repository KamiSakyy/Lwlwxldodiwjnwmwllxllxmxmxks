package fc0;

import hc0.bb;
import hc0.bm;
import hc0.fb;
import hc0.fl;
import hc0.lk;
import hc0.qy;
import hc0.ta;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t5 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.x xVar = bb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        aa.m mVar2 = new aa.m("headRefOid", v8.l0.b(ta.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        bm.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", v8.l0.b(bm.s), (String) null, rVar, rVar, rVar);
        lk.Companion.getClass();
        aa.s mVar5 = new aa.m("pullRequest", v8.l0.b(lk.J), (String) null, rVar, rVar, r);
        List n = sy.d0.n("PullRequestReviewComment");
        List list = a80.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fl.Companion.getClass();
        aa.q0 q0Var = fl.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("pullRequestReviewComment", q0Var, (String) null, rVar, rVar, r2));
        qy.Companion.getClass();
        aa.q0 q0Var2 = qy.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(wg.U0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewCommentId", new aa.t("commentId"))))), n2));
    }
}
