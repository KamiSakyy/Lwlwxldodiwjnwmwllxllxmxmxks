package zf0;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.i9;
import gn0.jj;
import gn0.k9;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("startCursor", xVar2, (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        pb.Companion.getClass();
        x xVar3 = pb.a;
        List r2 = l.r(new s[]{mVar3, c, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r);
        rb.Companion.getClass();
        m mVar5 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("nodes", l0.a(i9.c), (String) null, rVar, rVar, r2)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("DiscussionComment");
        List list2 = b.a;
        s c2 = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = bj0.a.a;
        s c3 = no.a.c(list3, "selections", "Reactable", r4, list3);
        k9.Companion.getClass();
        a = l.r(new s[]{mVar6, mVar7, c2, c3, new m("replies", l0.b(k9.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(i9.a, new u0(new t("before"))), new aa.k(i9.b, new u0(new t("numberOfReplies")))}), r3)});
    }
}
