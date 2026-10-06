package h10;

import java.util.List;
import m10.ah;
import m10.ai;
import m10.be0;
import m10.cc0;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.s mVar3 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list = br.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Comment", r, list)});
        ai.Companion.getClass();
        aa.q0 q0Var = ai.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("issueComment", q0Var, (String) null, rVar, rVar, r2));
        be0.Companion.getClass();
        aa.q0 q0Var2 = be0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateIssueComment", q0Var2, (String) null, rVar, no.a.s(vp.h1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("id", new aa.t("id"))}))), n));
    }
}
