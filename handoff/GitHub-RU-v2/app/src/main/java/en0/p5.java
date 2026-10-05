package en0;

import gn0.kz;
import gn0.lc;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.s mVar3 = new aa.m("url", v8.l0.b(mx.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = te0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Comment", r, list)});
        lc.Companion.getClass();
        aa.q0 q0Var = lc.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("issueComment", q0Var, (String) null, rVar, rVar, r2));
        kz.Companion.getClass();
        aa.q0 q0Var2 = kz.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateIssueComment", q0Var2, (String) null, rVar, no.a.s(wh.P0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("id", new aa.t("id"))))), n));
    }
}
