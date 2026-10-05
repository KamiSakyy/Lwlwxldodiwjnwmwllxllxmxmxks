package kz0;

import java.util.List;
import pz0.g70;
import pz0.h50;
import pz0.pe;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar3 = new aa.m("url", v8.l0.b(h50.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = zp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Comment", r, list)});
        pe.Companion.getClass();
        aa.q0 q0Var = pe.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("issueComment", q0Var, (String) null, rVar, rVar, r2));
        g70.Companion.getClass();
        aa.q0 q0Var2 = g70.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("updateIssueComment", q0Var2, (String) null, rVar, no.a.s(sk.c1, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("id", new aa.t("id"))))), n));
    }
}
