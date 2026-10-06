package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.nd;
import m10.vp;
import m10.xd0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiscussionComment");
        List list = ns.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list2 = qv.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r, list2);
        List n2 = sy.d0Shadow.n("DiscussionComment");
        List list3 = ns.c.a;
        aa.s c3 = no.a.c(list3, "selections", "DiscussionComment", n2, list3);
        ah.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        nd.Companion.getClass();
        aa.q0 q0Var = nd.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0Shadow.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, r2));
        xd0.Companion.getClass();
        aa.q0 q0Var2 = xd0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateDiscussionComment", q0Var2, (String) null, rVar, no.a.s(vp.f1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("commentId", new aa.t("commentId"))}))), n3));
    }
}
