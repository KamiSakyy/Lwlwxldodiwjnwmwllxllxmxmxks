package kz0;

import java.util.List;
import pz0.c80;
import pz0.cu;
import pz0.ft;
import pz0.hs;
import pz0.ld;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o6 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ld.Companion.getClass();
        aa.m mVar2 = new aa.m("headRefOid", v8.l0.b(ld.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cu.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", v8.l0.b(cu.s), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        aa.s mVar5 = new aa.m("pullRequest", v8.l0.b(hs.N), (String) null, rVar, rVar, r);
        List n = sy.d0.n("PullRequestReviewComment");
        List list = yt0.p.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        aa.q0 q0Var = ft.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("pullRequestReviewComment", q0Var, (String) null, rVar, rVar, r2));
        c80.Companion.getClass();
        aa.q0 q0Var2 = c80.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(sk.n1, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewCommentId", new aa.t("commentId"))))), n2));
    }
}
