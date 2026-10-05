package fc0;

import hc0.bb;
import hc0.bm;
import hc0.fb;
import hc0.fl;
import hc0.hl;
import hc0.lk;
import hc0.ta;
import hc0.wg;
import hc0.xl;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        aa.s mVar3 = new aa.m("headRefOid", v8.l0.b(ta.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = a80.r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = a80.d.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("PullRequestReviewComment");
        List list3 = a80.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, no.a.c(list3, "selections", "PullRequestReviewComment", n3, list3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fl.Companion.getClass();
        List n4 = sy.d0.n(new aa.m("nodes", v8.l0.a(fl.a), (String) null, rVar, rVar, r2));
        bm.Companion.getClass();
        aa.m mVar5 = new aa.m("subjectType", v8.l0.b(bm.s), (String) null, rVar, rVar, rVar);
        lk.Companion.getClass();
        aa.m mVar6 = new aa.m("pullRequest", v8.l0.b(lk.J), (String) null, rVar, rVar, r);
        hl.Companion.getClass();
        aa.r b2 = v8.l0.b(hl.a);
        xl.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("comments", b2, (String) null, rVar, no.a.s(xl.b, new aa.u0(1)), n4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = xl.d;
        k71.k.g(q0Var, "type");
        List n5 = sy.d0.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r3));
        hc0.x.Companion.getClass();
        aa.q0 q0Var2 = hc0.x.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("addPullRequestReviewThread", q0Var2, (String) null, rVar, no.a.s(wg.f, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("line", new aa.t("endLine")), new w61.k("path", new aa.t("path")), new w61.k("pullRequestId", new aa.t("pullId")), new w61.k("side", new aa.t("endSide")), new w61.k("startLine", new aa.t("startLine")), new w61.k("startSide", new aa.t("startSide")), new w61.k("subjectType", new aa.t("subjectType"))))), n5));
    }
}
