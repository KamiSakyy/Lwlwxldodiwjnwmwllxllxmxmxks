package mv;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.dz;
import m10.eh;
import m10.rz;
import m10.sa;
import m10.ux;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar3 = sa.a;
        k.g(xVar3, "type");
        s mVar4 = new m("submittedAt", xVar3, (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list = br.a.a;
        s c = no.a.c(list, "selections", "Comment", r3, list);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list2 = qv.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r4, list2);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = qu.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r5, list3);
        wg.Companion.getClass();
        s mVar5 = new m("authorCanPushToRepository", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        s mVar6 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        rz.Companion.getClass();
        s mVar7 = new m("state", l0.b(rz.s), (String) null, rVar, rVar, rVar);
        dz.Companion.getClass();
        s mVar8 = new m("comments", l0.b(dz.a), (String) null, rVar, rVar, r);
        s mVar9 = new m("createdAt", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, mVar4, c, c2, c3, mVar5, mVar6, mVar7, mVar8, mVar9, new m("pullRequest", l0.b(ux.T), (String) null, rVar, rVar, r2)});
    }
}
