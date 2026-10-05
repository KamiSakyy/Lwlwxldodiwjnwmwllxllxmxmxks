package du0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.h50;
import pz0.hs;
import pz0.ht;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.wt;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar3 = o7.a;
        k.g(xVar3, "type");
        s mVar4 = new m("submittedAt", xVar3, (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = zp0.a.a;
        s c = no.a.c(list, "selections", "Comment", r3, list);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = hu0.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r4, list2);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = ht0.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r5, list3);
        pd.Companion.getClass();
        s mVar5 = new m("authorCanPushToRepository", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        s mVar6 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        wt.Companion.getClass();
        s mVar7 = new m("state", l0.b(wt.s), (String) null, rVar, rVar, rVar);
        ht.Companion.getClass();
        s mVar8 = new m("comments", l0.b(ht.a), (String) null, rVar, rVar, r);
        s mVar9 = new m("createdAt", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, mVar4, c, c2, c3, mVar5, mVar6, mVar7, mVar8, mVar9, new m("pullRequest", l0.b(hs.N), (String) null, rVar, rVar, r2)});
    }
}
