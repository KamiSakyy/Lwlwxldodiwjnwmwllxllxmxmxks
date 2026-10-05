package en0;

import gn0.ip;
import gn0.pb;
import gn0.tb;
import gn0.vn;
import gn0.wh;
import gn0.xn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g3 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = bj0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Reactable", r, list)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Reactable", x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), list)});
        vn.Companion.getClass();
        aa.j0 j0Var = vn.d;
        aa.m mVar2 = new aa.m("reactable", v8.l0.b(j0Var), (String) null, rVar, rVar, r3);
        pb.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("subject", j0Var, (String) null, rVar, rVar, r2);
        xn.Companion.getClass();
        aa.q0 q0Var = xn.a;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar3, new aa.m("reaction", q0Var, (String) null, rVar, rVar, r4)});
        ip.Companion.getClass();
        aa.q0 q0Var2 = ip.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("removeReaction", q0Var2, (String) null, rVar, no.a.s(wh.o0, new aa.u0(x61.x.u(new w61.k("content", new aa.t("content")), new w61.k("subjectId", new aa.t("subject_id"))))), r5));
    }
}
