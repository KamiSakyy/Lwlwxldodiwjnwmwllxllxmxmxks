package fc0;

import hc0.bb;
import hc0.cy;
import hc0.ew;
import hc0.fb;
import hc0.wg;
import hc0.xb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.s mVar3 = new aa.m("url", v8.l0.b(ew.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = d40.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Comment", r, list)});
        xb.Companion.getClass();
        aa.q0 q0Var = xb.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("issueComment", q0Var, (String) null, rVar, rVar, r2));
        cy.Companion.getClass();
        aa.q0 q0Var2 = cy.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateIssueComment", q0Var2, (String) null, rVar, no.a.s(wg.N0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("id", new aa.t("id"))))), n));
    }
}
