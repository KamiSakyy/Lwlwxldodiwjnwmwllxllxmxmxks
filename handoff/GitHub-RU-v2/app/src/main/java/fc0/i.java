package fc0;

import hc0.bb;
import hc0.dl;
import hc0.fb;
import hc0.lk;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = a80.k.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("PullRequestReview");
        List list2 = f80.a.a;
        aa.s c2 = no.a.c(list2, "selections", "PullRequestReview", n2, list2);
        lk.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, c2, new aa.m("pullRequest", v8.l0.b(lk.J), (String) null, rVar, rVar, r)});
        dl.Companion.getClass();
        aa.q0 q0Var = dl.d;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0Shadow.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2));
        hc0.v.Companion.getClass();
        aa.q0 q0Var2 = hc0.v.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addPullRequestReview", q0Var2, (String) null, rVar, no.a.s(wg.e, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("commitOID", new aa.t("commitOid")), new w61.k("event", new aa.t("event")), new w61.k("pullRequestId", new aa.t("id"))))), n3));
    }
}
