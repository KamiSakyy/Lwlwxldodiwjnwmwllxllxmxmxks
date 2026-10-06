package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.h20;
import m10.t00;
import m10.v00;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list = qv.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Reactable", r, list)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Reactable", x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"}), list)});
        t00.Companion.getClass();
        aa.j0 j0Var = t00.d;
        aa.m mVar2 = new aa.m("reactable", v8.l0.b(j0Var), (String) null, rVar, rVar, r3);
        ah.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("subject", j0Var, (String) null, rVar, rVar, r2);
        v00.Companion.getClass();
        aa.q0 q0Var = v00.a;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar3, new aa.m("reaction", q0Var, (String) null, rVar, rVar, r4)});
        h20.Companion.getClass();
        aa.q0 q0Var2 = h20.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("removeReaction", q0Var2, (String) null, rVar, no.a.s(vp.C0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("content", new aa.t("content")), new w61.k("subjectId", new aa.t("subject_id"))}))), r5));
    }
}
