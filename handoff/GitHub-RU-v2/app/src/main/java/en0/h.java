package en0;

import gn0.dn;
import gn0.hb;
import gn0.hm;
import gn0.jm;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.zm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        aa.s mVar3 = new aa.m("headRefOid", v8.l0.b(hb.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = si0.r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0Shadow.n("PullRequest");
        List list2 = si0.d.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("PullRequestReviewComment");
        List list3 = si0.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, no.a.c(list3, "selections", "PullRequestReviewComment", n3, list3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(hm.a), (String) null, rVar, rVar, r2));
        dn.Companion.getClass();
        aa.m mVar5 = new aa.m("subjectType", v8.l0.b(dn.s), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        aa.m mVar6 = new aa.m("pullRequest", v8.l0.b(ll.K), (String) null, rVar, rVar, r);
        jm.Companion.getClass();
        aa.r b2 = v8.l0.b(jm.a);
        zm.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("comments", b2, (String) null, rVar, no.a.s(zm.b, new aa.u0(1)), n4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = zm.d;
        k71.k.g(q0Var, "type");
        List n5 = sy.d0Shadow.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r3));
        gn0.x.Companion.getClass();
        aa.q0 q0Var2 = gn0.x.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addPullRequestReviewThread", q0Var2, (String) null, rVar, no.a.s(wh.f, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("line", new aa.t("endLine")), new w61.k("path", new aa.t("path")), new w61.k("pullRequestId", new aa.t("pullId")), new w61.k("side", new aa.t("endSide")), new w61.k("startLine", new aa.t("startLine")), new w61.k("startSide", new aa.t("startSide")), new w61.k("subjectType", new aa.t("subjectType"))))), n5));
    }
}
