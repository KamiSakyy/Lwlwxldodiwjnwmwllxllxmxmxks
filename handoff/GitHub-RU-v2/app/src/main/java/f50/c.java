package f50;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.o8;
import hc0.w8;
import hc0.y8;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PageInfo");
        List list = o70.a.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("DiscussionComment");
        List list2 = j50.b.a;
        s c = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        List r2 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = j80.a.a;
        s c2 = no.a.c(list3, "selections", "Reactable", r2, list3);
        List n3 = d0Shadow.n("DiscussionComment");
        List list4 = j50.c.a;
        s c3 = no.a.c(list4, "selections", "DiscussionComment", n3, list4);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r3 = l.r(new s[]{mVar2, c, c2, c3, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r);
        w8.Companion.getClass();
        List r4 = l.r(new m[]{mVar3, new m("nodes", l0.a(w8.c), (String) null, rVar, rVar, r3)});
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        y8.Companion.getClass();
        r b2 = l0.b(y8.a);
        o8.Companion.getClass();
        a = l.r(new s[]{mVar4, mVar5, new m("comments", b2, (String) null, rVar, l.r(new k[]{new k(o8.g, new u0(new t("before"))), new k(o8.h, new u0(new t("number")))}), r4), new n("Reactable", l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), list3)});
    }
}
