package kz0;

import java.util.List;
import pz0.cu;
import pz0.ft;
import pz0.hs;
import pz0.ht;
import pz0.ld;
import pz0.sk;
import pz0.td;
import pz0.xd;
import pz0.yt;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
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
        ld.Companion.getClass();
        aa.s mVar3 = new aa.m("headRefOid", v8.l0.b(ld.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = yt0.r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = yt0.d.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("PullRequestReviewComment");
        List list3 = yt0.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, no.a.c(list3, "selections", "PullRequestReviewComment", n3, list3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        List n4 = sy.d0.n(new aa.m("nodes", v8.l0.a(ft.a), (String) null, rVar, rVar, r2));
        cu.Companion.getClass();
        aa.m mVar5 = new aa.m("subjectType", v8.l0.b(cu.s), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        aa.m mVar6 = new aa.m("pullRequest", v8.l0.b(hs.N), (String) null, rVar, rVar, r);
        ht.Companion.getClass();
        aa.r b2 = v8.l0.b(ht.a);
        yt.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("comments", b2, (String) null, rVar, no.a.s(yt.b, new aa.u0(1)), n4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = yt.d;
        k71.k.g(q0Var, "type");
        List n5 = sy.d0.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r3));
        pz0.b0.Companion.getClass();
        aa.q0 q0Var2 = pz0.b0.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("addPullRequestReviewThread", q0Var2, (String) null, rVar, no.a.s(sk.h, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("line", new aa.t("endLine")), new w61.k("path", new aa.t("path")), new w61.k("pullRequestId", new aa.t("pullId")), new w61.k("side", new aa.t("endSide")), new w61.k("startLine", new aa.t("startLine")), new w61.k("startSide", new aa.t("startSide")), new w61.k("subjectType", new aa.t("subjectType"))))), n5));
    }
}
