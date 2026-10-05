package f80;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.hl;
import hc0.lk;
import hc0.vl;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar)});
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar3 = h6.a;
        k.g(xVar3, "type");
        s mVar4 = new m("submittedAt", xVar3, (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = d40.a.a;
        s c = no.a.c(list, "selections", "Comment", r3, list);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = j80.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r4, list2);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = h70.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r5, list3);
        xa.Companion.getClass();
        s mVar5 = new m("authorCanPushToRepository", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        s mVar6 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        vl.Companion.getClass();
        s mVar7 = new m("state", l0.b(vl.s), (String) null, rVar, rVar, rVar);
        hl.Companion.getClass();
        s mVar8 = new m("comments", l0.b(hl.a), (String) null, rVar, rVar, r);
        s mVar9 = new m("createdAt", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        lk.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, mVar4, c, c2, c3, mVar5, mVar6, mVar7, mVar8, mVar9, new m("pullRequest", l0.b(lk.J), (String) null, rVar, rVar, r2)});
    }
}
