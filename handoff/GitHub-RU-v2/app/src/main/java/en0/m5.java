package en0;

import gn0.gz;
import gn0.i9;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiscussionComment");
        List list = zf0.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        List r = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = bj0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r, list2);
        List n2 = sy.d0.n("DiscussionComment");
        List list3 = zf0.c.a;
        aa.s c3 = no.a.c(list3, "selections", "DiscussionComment", n2, list3);
        pb.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        i9.Companion.getClass();
        aa.q0 q0Var = i9.c;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, r2));
        gz.Companion.getClass();
        aa.q0 q0Var2 = gz.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDiscussionComment", q0Var2, (String) null, rVar, no.a.s(wh.N0, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("commentId", new aa.t("commentId"))))), n3));
    }
}
