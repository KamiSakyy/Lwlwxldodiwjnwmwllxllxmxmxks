package fc0;

import hc0.bb;
import hc0.fb;
import hc0.w8;
import hc0.wg;
import hc0.xx;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionComment");
        List list = j50.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = j80.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r, list2);
        List n2 = sy.d0.n("DiscussionComment");
        List list3 = j50.c.a;
        aa.s c3 = no.a.c(list3, "selections", "DiscussionComment", n2, list3);
        bb.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        w8.Companion.getClass();
        aa.q0 q0Var = w8.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, r2));
        xx.Companion.getClass();
        aa.q0 q0Var2 = xx.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDiscussionComment", q0Var2, (String) null, rVar, no.a.s(wg.L0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("commentId", new aa.t("commentId"))))), n3));
    }
}
