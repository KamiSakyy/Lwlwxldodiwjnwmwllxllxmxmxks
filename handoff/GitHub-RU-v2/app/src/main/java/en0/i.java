package en0;

import gn0.fm;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = si0.k.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("PullRequestReview");
        List list2 = xi0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "PullRequestReview", n2, list2);
        ll.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, c2, new aa.m("pullRequest", v8.l0.b(ll.K), (String) null, rVar, rVar, r)});
        fm.Companion.getClass();
        aa.q0 q0Var = fm.d;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0Shadow.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2));
        gn0.v.Companion.getClass();
        aa.q0 q0Var2 = gn0.v.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addPullRequestReview", q0Var2, (String) null, rVar, no.a.s(wh.e, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("commitOID", new aa.t("commitOid")), new w61.k("event", new aa.t("event")), new w61.k("pullRequestId", new aa.t("id"))))), n3));
    }
}
