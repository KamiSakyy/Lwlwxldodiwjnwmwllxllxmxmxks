package kz0;

import java.util.List;
import pz0.c70;
import pz0.ja;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionComment");
        List list = fr0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = hu0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r, list2);
        List n2 = sy.d0Shadow.n("DiscussionComment");
        List list3 = fr0.c.a;
        aa.s c3 = no.a.c(list3, "selections", "DiscussionComment", n2, list3);
        td.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        ja.Companion.getClass();
        aa.q0 q0Var = ja.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0Shadow.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, r2));
        c70.Companion.getClass();
        aa.q0 q0Var2 = c70.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateDiscussionComment", q0Var2, (String) null, rVar, no.a.s(sk.a1, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("commentId", new aa.t("commentId"))))), n3));
    }
}
