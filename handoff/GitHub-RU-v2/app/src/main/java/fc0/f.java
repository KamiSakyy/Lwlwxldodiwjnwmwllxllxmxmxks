package fc0;

import hc0.bb;
import hc0.fb;
import hc0.tm;
import hc0.vm;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = j80.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Reactable", r, list)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Reactable", x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), list)});
        tm.Companion.getClass();
        aa.j0 j0Var = tm.d;
        aa.m mVar2 = new aa.m("reactable", v8.l0.b(j0Var), (String) null, rVar, rVar, r3);
        bb.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("subject", j0Var, (String) null, rVar, rVar, r2);
        vm.Companion.getClass();
        aa.q0 q0Var = vm.a;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar3, new aa.m("reaction", q0Var, (String) null, rVar, rVar, r4)});
        hc0.b0.Companion.getClass();
        aa.q0 q0Var2 = hc0.b0.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addReaction", q0Var2, (String) null, rVar, no.a.s(wg.h, new aa.u0(x61.x.u(new w61.k("content", new aa.t("content")), new w61.k("subjectId", new aa.t("subject_id"))))), r5));
    }
}
