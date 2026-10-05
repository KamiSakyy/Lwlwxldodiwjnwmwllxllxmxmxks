package en0;

import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.vn;
import gn0.xn;
import gn0.yh;
import gn0.zn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a3 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = xk0.e.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("user", q0Var, (String) null, rVar, rVar, r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        xn.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(xn.a), (String) null, rVar, rVar, r3)});
        zn.Companion.getClass();
        aa.r b2 = v8.l0.b(zn.a);
        vn.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Reactable", x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), sy.d0.n(new aa.m("reactions", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(vn.a, new aa.u0(new aa.t("after"))), new aa.k(vn.b, new aa.u0(new aa.t("content"))), new aa.k(vn.c, new aa.u0(25))}), r4))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("id"))), r5));
    }
}
