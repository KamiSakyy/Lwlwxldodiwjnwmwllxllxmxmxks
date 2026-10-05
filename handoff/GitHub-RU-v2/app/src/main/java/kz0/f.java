package kz0;

import java.util.List;
import pz0.sk;
import pz0.td;
import pz0.wu;
import pz0.xd;
import pz0.yu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = hu0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Reactable", r, list)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Reactable", x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), list)});
        wu.Companion.getClass();
        aa.j0 j0Var = wu.d;
        aa.m mVar2 = new aa.m("reactable", v8.l0.b(j0Var), (String) null, rVar, rVar, r3);
        td.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("subject", j0Var, (String) null, rVar, rVar, r2);
        yu.Companion.getClass();
        aa.q0 q0Var = yu.a;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar3, new aa.m("reaction", q0Var, (String) null, rVar, rVar, r4)});
        pz0.f0.Companion.getClass();
        aa.q0 q0Var2 = pz0.f0.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("addReaction", q0Var2, (String) null, rVar, no.a.s(sk.j, new aa.u0(x61.x.u(new w61.k("content", new aa.t("content")), new w61.k("subjectId", new aa.t("subject_id"))))), r5));
    }
}
