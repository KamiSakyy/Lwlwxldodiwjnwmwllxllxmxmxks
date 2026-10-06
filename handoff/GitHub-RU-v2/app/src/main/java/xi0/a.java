package xi0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import gn0.jm;
import gn0.lb;
import gn0.ll;
import gn0.mx;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import gn0.xm;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar)});
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar3 = r6.a;
        k.g(xVar3, "type");
        s mVar4 = new m("submittedAt", xVar3, (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = te0.a.a;
        s c = no.a.c(list, "selections", "Comment", r3, list);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = bj0.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r4, list2);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = zh0.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r5, list3);
        lb.Companion.getClass();
        s mVar5 = new m("authorCanPushToRepository", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        s mVar6 = new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        xm.Companion.getClass();
        s mVar7 = new m("state", l0.b(xm.s), (String) null, rVar, rVar, rVar);
        jm.Companion.getClass();
        s mVar8 = new m("comments", l0.b(jm.a), (String) null, rVar, rVar, r);
        s mVar9 = new m("createdAt", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, mVar4, c, c2, c3, mVar5, mVar6, mVar7, mVar8, mVar9, new m("pullRequest", l0.b(ll.K), (String) null, rVar, rVar, r2)});
    }
}
